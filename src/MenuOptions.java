public enum MenuOptions {
    OPTION1(1, "Math"), OPTION2(2, "Alphabetical"), OPTION0(0, "Exit");

    private final int value;
    private final String text;

    MenuOptions(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static MenuOptions getByValue(int value) {
        for (MenuOptions option : MenuOptions.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }

        return null;
    }
}
