package json;

import org.json.simple.JSONObject;

public class simpleJson {
    public static void main(String[] args) {
        JSONObject person = new JSONObject();
        person.put("name", "Ezmet");
        person.put("age", "10");
        person.put("city", "Kashgar");

        System.out.println("person = " + person);
    }
}
