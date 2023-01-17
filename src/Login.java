import java.util.*;

public class Login {
    private static String correctUserName = "eusebia_ciobanu";

    private static String correctPassword = "password";

    private static final List<Map<String, String>> userAccounts = new ArrayList<Map<String, String>>() {{
        add(new HashMap<String, String>() {{
            put("user_name", "eusebia_ciobanu");
            put("password", "password");
        }});

        add(new HashMap<String, String>() {{
            put("user_name", "ciobanu_eusebia");
            put("password", "parola");
        }});
    }};

    private static boolean checkAccount(String userName, String password) {
        return userAccounts.stream()
                .filter(map -> map.get("user_name").equals(userName))
                .anyMatch(map -> map.get("password").equals(password));
    }

    private static int numberOfLogins = 0;

    public static Boolean login() {
        String userName = Menu.readString("Nume utilizator: ");
        String password = Menu.readString("Parola: ");

        if (!checkAccount(userName, password)) {
            numberOfLogins++;

            if (numberOfLogins == 3) {
                System.out.println("Incercarile disponibile au fost epuizate");

                return false;
            }

            System.out.println("Nume utilizator sau parola incorecta! Reincearca");

            login();
        }

        return true;
    }
}
