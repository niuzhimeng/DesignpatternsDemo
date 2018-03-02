package utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * MD5加密工具类
 * Created by nzm on 2016/12/20.
 */
public class EncryptUtils {
    /**
     * 加密方法
     *
     * @param content 加密内容
     * @param salt    加密的盐
     * @return 加密后的密码
     * @throws
     */
    public static String MD5(String content, String salt) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update((content + "{" + salt + "}").getBytes(Charset.forName("UTF-8")));
        // 用来将字节转换成 16 进制表示的字符
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        // MD5 的计算结果是一个 128 位的长整数，用字节表示就是 16 个字节
        byte tmp[] = instance.digest();
        // 每个字节用 16 进制表示的话，使用两个字符，所以表示成 16 进制需要 32 个字符
        char str[] = new char[16 * 2];
        // 表示转换结果中对应的字符位置
        int k = 0;
        // 从第一个字节开始，对 MD5 的每一个字节转换成 16 进制字符的转换
        for (int i = 0; i < 16; i++) {
            // 取第 i 个字节
            byte byte0 = tmp[i];
            // 取字节中高 4 位的数字转换,>>> 为逻辑右移，将符号位一起右移
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            // 取字节中低 4 位的数字转换
            str[k++] = hexDigits[byte0 & 0xf];
        }
        return new String(str);
    }

    /**
     * 获取AES加密后的 十六进制字符串
     *
     * @param content
     * @param encryptKey
     * @return
     * @throws Exception
     */
    public static String aesEncryptHexString(String content, String encryptKey) throws Exception {
        return parseByte2HexString(aesEncrypt(content, encryptKey));
    }


    /**
     * 解密AES加密后的 十六进制字符串
     *
     * @param hexContent
     * @param encryptKey
     * @return
     * @throws Exception
     */
    public static String aesDecryptHexString(String hexContent, String encryptKey) throws Exception {
        return aesDecrypt(parseHexStr2Byte(hexContent), encryptKey);
    }

    /**
     * 将二进制转换成16进制
     *
     * @param buffer
     * @return
     */
    private static String parseByte2HexString(byte buffer[]) {
        StringBuilder sb = new StringBuilder();
        for (byte aBuffer : buffer) {
            String hex = Integer.toHexString(aBuffer & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * 将16进制转换为二进制
     *
     * @param hexString
     * @return
     */
    private static byte[] parseHexStr2Byte(String hexString) {
        if (hexString.length() < 1)
            return null;
        byte[] result = new byte[hexString.length() / 2];
        for (int i = 0; i < hexString.length() / 2; i++) {
            int high = Integer.parseInt(hexString.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexString.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

    /**
     * AES 加密
     *
     * @param content    加密内容
     * @param encryptKey 加密秘钥
     * @return 加密数组
     * @throws Exception
     */
    private static byte[] aesEncrypt(String content, String encryptKey) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        secureRandom.setSeed(encryptKey.getBytes("UTF-8"));
        keyGen.init(128, secureRandom);
        SecretKey secretKey = keyGen.generateKey();
        byte[] enCodeFormat = secretKey.getEncoded();
        SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
        // 创建密码器
        Cipher cipher = Cipher.getInstance("AES");
        // 初始化
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(content.getBytes("UTF-8"));
    }

    /**
     * AES 解密
     *
     * @param content    解密内容
     * @param encryptKey 解密秘钥
     * @return
     * @throws Exception
     */
    private static String aesDecrypt(byte[] content, String encryptKey) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        secureRandom.setSeed(encryptKey.getBytes("UTF-8"));
        keyGen.init(128, secureRandom);
        SecretKey secretKey = keyGen.generateKey();
        byte[] enCodeFormat = secretKey.getEncoded();
        SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
        Cipher cipher = Cipher.getInstance("AES");// 创建密码器
        cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
        byte[] result = cipher.doFinal(content);
        return new String(result, "UTF-8");
    }

    /**
     * DES加密
     *
     * @param data 加密内容
     * @param key  加密秘钥
     * @return 加密后的内容
     * @throws Exception 异常
     */
    public static String desEncrypt(String data, String key) throws Exception {
        if ((null == data) || ("".equals(data.trim()))) {
            return "";
        }
        byte[] bt = desEncrypt(data.getBytes("UTF-8"), key.getBytes());
        return new BASE64Encoder().encode(bt);
    }

    /**
     * DES解密
     *
     * @param data 解密内容
     * @param key  解密秘钥
     * @return 解密后的内容
     * @throws Exception 异常
     */
    public static String desDecrypt(String data, String key) throws Exception {
        if ((null == data) || ("".equals(data.trim()))) {
            return "";
        }
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] buf = decoder.decodeBuffer(data);
        byte[] bt = desDecrypt(buf, key.getBytes());
        return new String(bt, "UTF-8");
    }

    private static byte[] desEncrypt(byte[] data, byte[] key) throws Exception {
        SecureRandom sr = new SecureRandom();

        DESKeySpec dks = new DESKeySpec(key);

        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(dks);

        Cipher cipher = Cipher.getInstance("DES");

        cipher.init(1, securekey, sr);

        return cipher.doFinal(data);
    }

    private static byte[] desDecrypt(byte[] data, byte[] key) throws Exception {
        SecureRandom sr = new SecureRandom();

        DESKeySpec dks = new DESKeySpec(key);

        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(dks);

        Cipher cipher = Cipher.getInstance("DES");

        cipher.init(2, securekey, sr);

        return cipher.doFinal(data);
    }

}
