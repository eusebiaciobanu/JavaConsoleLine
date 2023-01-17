import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        while (true) {
            showOptions();

            MenuOptions option = selectMenuOption();

            switch (option) {
                case OPTION1 -> showMathMenu();
                case OPTION2 -> showAlphabeticalMenu();
                case OPTION0 -> {
                    exit();
                    return;
                }
            }
        }
    }

    private static void showAlphabeticalMenu() {
        while (true) {
            showAlphabeticalOptions();

            AlphabeticalMenuOptions option = selectAlphabeticalMenuOption();

            switch (option) {
                case OPTION1 -> verificareStringContineLitera();
                case OPTION0 -> {
                    exit();
                    return;
                }
            }
        }
    }

    private static void verificareStringContineLitera() {
        String cuvant = Menu.readString("Introduceti un cuvant: ");
        String litera = Menu.readString("Introduceti o litera: ");

        if (cuvant.matches(litera)) {
            System.out.println("litera se gaseste in cuvant");
        } else {
            System.out.println("litera nu se gaseste in cuvant");
        }
    }

    private static void showMathMenu() {
        while (true) {
            showMathOptions();

            MathMenuOptions option = selectMathMenuOption();

            switch (option) {
                case OPTION1 -> adunare();
                case OPTION2 -> scadere();
                case OPTION0 -> {
                    exit();
                    return;
                }
            }
        }
    }

    private static void showOptions() {
        System.out.println();

        for (MenuOptions option : MenuOptions.values()) {
            System.out.println(option.getValue() + ". " + option.getText());
        }
    }

    private static void showAlphabeticalOptions() {
        System.out.println();

        for (AlphabeticalMenuOptions option : AlphabeticalMenuOptions.values()) {
            System.out.println(option.getValue() + ". " + option.getText());
        }
    }

    private static void showMathOptions() {
        System.out.println();

        for (MathMenuOptions option : MathMenuOptions.values()) {
            System.out.println(option.getValue() + ". " + option.getText());
        }
    }

    private static MenuOptions selectMenuOption() {
        boolean repeat = true;
        int optionInput = 0;

        MenuOptions option = null;

        while (repeat) {
            try {
                System.out.print("Please select an option: ");
                Scanner scanner = new Scanner(System.in);
                optionInput = scanner.nextInt();

                option = MenuOptions.getByValue(optionInput);

                if (option == null) {
                    throw new Exception("The option is not available");
                }

                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return option;
    }

    private static AlphabeticalMenuOptions selectAlphabeticalMenuOption() {
        boolean repeat = true;
        int optionInput = 0;

        AlphabeticalMenuOptions option = null;

        while (repeat) {
            try {
                System.out.print("Please select an option from Alphabetical: ");
                Scanner scanner = new Scanner(System.in);
                optionInput = scanner.nextInt();

                option = AlphabeticalMenuOptions.getByValue(optionInput);

                if (option == null) {
                    throw new Exception("The option is not available");
                }

                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return option;
    }

    private static MathMenuOptions selectMathMenuOption() {
        boolean repeat = true;
        int optionInput = 0;

        MathMenuOptions option = null;

        while (repeat) {
            try {
                System.out.print("Please select an option from Math: ");
                Scanner scanner = new Scanner(System.in);
                optionInput = scanner.nextInt();

                option = MathMenuOptions.getByValue(optionInput);

                if (option == null) {
                    throw new Exception("The option is not available");
                }

                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return option;
    }

    private static float readFloat(String text) {
        boolean repeat = true;
        float number = 0;
        while (repeat) {
            try {
                System.out.print(text);
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            }
        }
        return number;
    }

    public static String readString(String text) {
        boolean repeat = true;
        String input = "";
        while (repeat) {
            try {
                System.out.print(text);
                Scanner scanner = new Scanner(System.in);
                input = scanner.next();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            }
        }

        return input;
    }

    private static void exit() {
        System.out.println("Exit");
    }

    private static void adunare() {
        float numar1 = Menu.readFloat("introduceti primul numar: ");
        float numar2 = Menu.readFloat("introduceti al doilea numar: ");

        float rezultat = Calculator.sum(numar1, numar2);

        System.out.println("Rezulatatul adunarii este: " + rezultat);
    }

    private static void scadere() {
        float numar1 = Menu.readFloat("introduceti primul numar: ");
        float numar2 = Menu.readFloat("introduceti al doilea numar: ");

        float rezultat = Calculator.diff(numar1, numar2);

        System.out.println("Rezulatatul scaderii este: " + rezultat);
    }

    private static void impartire() {
        float numar3 = Menu.readFloat("introduceti prmimul numar");
        float numar4 = Menu.readFloat("Introduceti al doilea numar");

        double rezultat = Calculator.impartire(numar3, numar4);

        System.out.println("Rezultatul impartirii este: " + rezultat);
    }

    private static void inmultire(){
        float numar5 = Menu.readFloat("introduceti primul numar");
        float numar6 = Menu.readFloat("Introduceti al doilea nuamr");

        float rezultat = Calculator.inmultire(numar5, numar6);

        System.out.println("Rezultatul inmultirii este: " + rezultat);


    }



}
