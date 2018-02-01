package gsontest.vo;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * Created by Nzm on 2018/1/22.
 */
public class Adty implements JsonSerializer<Date>, JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new Date(jsonElement.getAsJsonPrimitive().getAsLong());
    }

    @Override
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        return null;
    }
}
