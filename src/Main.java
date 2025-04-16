import controller.PersonController;
import model.Person;
import view.PersonView;

public class Main {
    public static void main(String[] args) {
        PersonView view = new PersonView();

        System.out.println("Monitoramento de Humor - Mood Tracker");

        String firstName = view.promptFirstName();
        String lastName = view.promptLastName();
        Person person = new Person(firstName, lastName);
        PersonController controller = new PersonController(person);

        int actionCode = view.promptStateSelection();
        controller.handleAction(actionCode);

        view.showResult(person.getFullName(), person.getMoodDescription());
        view.close();
    }
}
