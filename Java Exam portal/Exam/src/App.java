import org.json.simple.JSONObject;

public class App {
    public static void main(String[] args) throws Exception {
        JSONObject js = new JSONObject();
        js.put("name", "test");
        js.put("password", "test");
        System.out.println(js);
    }
}
