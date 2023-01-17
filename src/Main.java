public class Main {
    public static void main(String[] args) {
        Boolean isLoggedIn = Login.login();

        if (!isLoggedIn) {
            return;
        }

        Menu.showMenu();
    }
}
