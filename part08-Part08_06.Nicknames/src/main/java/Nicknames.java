import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();

        names.put("matthew", "matt");
        names.put("michael", "mix");
        names.put("arthur", "artie");
        
        String nome = names.get("matthew");
        System.out.println(nome);

    }

}
