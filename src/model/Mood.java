package model;

public enum Mood {
    FELIZ(1, "Feliz"),
    TRISTE(2, "Triste"),
    NEUTRO(3, "Neutro"),
    DESCONHECIDO(-1, "Desconhecido");

    private final int code;
    private final String description;

    Mood(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public void apply(model.Person person) {
        person.setMood(this);
    }

    public static Mood fromCode(int code) {
        for (Mood mood : values()) {
            if (mood.code == code) return mood;
        }
        return DESCONHECIDO;
    }
}
