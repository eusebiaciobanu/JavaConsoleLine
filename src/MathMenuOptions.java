public enum MathMenuOptions {
    OPTION1(1, "Adunare"), OPTION2(2, "Scadere"), OPTION0(0, "Exit");

    private final int value;
    private final String text;

    MathMenuOptions(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static MathMenuOptions getByValue(int value) {
        for (MathMenuOptions option : MathMenuOptions.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }

        return null;
    }
}
