package view;

import model.Mood;
import java.util.Scanner;

public class PersonView {
    private final Scanner scanner = new Scanner(System.in);

    public String promptFirstName() {
        System.out.print("Nome: ");
        return scanner.nextLine();
    }

    public String promptLastName() {
        System.out.print("Sobrenome: ");
        return scanner.nextLine();
    }

    public int promptStateSelection() {
        System.out.println("Como está se sentindo hoje?");
        for (Mood state : Mood.values()) {
            if (state == Mood.DESCONHECIDO) continue;
            System.out.println(state.getCode() + " - " + state.getDescription());
        }

        System.out.print("Escolha: ");
        return scanner.nextInt();
    }

    public void showResult(String fullName, String stateDescription) {
        System.out.println("\n------ RESULTADO ------");
        System.out.println("Nome completo: " + fullName);
        System.out.println("Humor: " + stateDescription);
    }

    public void close() {
        scanner.close();
    }
}
