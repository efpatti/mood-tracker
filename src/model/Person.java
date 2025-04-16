package model;

public class Person extends PersonActions {
    private final String firstName;
    private final String lastName;
    private Mood mood = Mood.DESCONHECIDO;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    protected Person getThis() {
        return this;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getMoodDescription() {
        return mood.getDescription();
    }
}
