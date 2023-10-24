package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;


public class parsingJson {
    public static void main(String[] args) {
        String jsonStr = "{\"name\":\"Bob\",\"age\":25,\"city\":\"Somewhere\"}";

        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, Object>>() {}.getType();
        Map<String, Object> jsonMap = gson.fromJson(jsonStr, type);

        String name = (String) jsonMap.get("name");
        int age = ((Double) jsonMap.get("age")).intValue();


        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
