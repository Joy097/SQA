import org.json.simple.JSONObject;

public class test {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("name", "test");
        json.put("password", "test");
        System.out.println(json);
    }
}
