package controller;

import model.Person;

public class PersonController {
    private final Person person;

    public PersonController(Person person) {
        this.person = person;
    }

    public void handleAction(int code) {
        person.applyActionByCode(code);
    }

    public Person getPerson() {
        return person;
    }
}
