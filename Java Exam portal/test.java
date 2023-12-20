import org.json.simple.JSONObject;

public class test {
    public static void test(String[] args) {
        JSONObject js = new JSONObject();
        js.put("name", "test");
        js.put("password", "test");
        System.out.println(js);
    }
}
