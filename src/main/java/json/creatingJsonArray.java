package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;

import java.lang.reflect.Type;
import java.util.Map;

public class creatingJsonArray {
    public static JSONArray fruitList() {
        JSONArray fruits = new JSONArray();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        return fruits;
    }

    public static void main(String[] args) {

        System.out.println("fruits : " + fruitList());
        //fruits : ["Apple","Banana","Cherry"]


    }

}
