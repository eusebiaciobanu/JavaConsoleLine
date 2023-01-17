public enum AlphabeticalMenuOptions {
    OPTION1(1, "Verificarea daca un cuvant contine o litera"), OPTION0(0, "Exit");

    private final int value;
    private final String text;

    AlphabeticalMenuOptions(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static AlphabeticalMenuOptions getByValue(int value) {
        for (AlphabeticalMenuOptions option : AlphabeticalMenuOptions.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }

        return null;
    }
}
