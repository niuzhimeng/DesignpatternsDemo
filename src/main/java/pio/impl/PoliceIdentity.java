package pio.impl;

import pio.PoiTest;

import java.util.List;

/**
 * 身份证一致性
 * Created by Nzm on 2017/8/2.
 */
public class PoliceIdentity extends PoiTest {
    /**
     * 访问url
     */
    private String url = "http://localhost:8080/tianXingDataApi/rest/police/identity?";

    @Override
    public void appendAccountInfo(String account, String token) {
        url += "account=" + account + "&accessToken=" + token;
    }

    @Override
    public String appendUrl(List<String> cell) {
        return url = url + "&name=" + cell.get(0) + "&idCard=" + cell.get(1);
    }
}
