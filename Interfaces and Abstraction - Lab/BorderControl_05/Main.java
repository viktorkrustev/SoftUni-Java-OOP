package InterfacesAndAbstractionLab.BorderControl_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Identifiable identifiable;
        List<Identifiable> list = new ArrayList<>();
        while(!input.equals("End")){
            String id = null;
            String[] tokens = input.split(" ");
            if (tokens.length == 3){
                identifiable = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            } else {
                identifiable = new Robot(tokens[0], tokens[1]);
            }
            list.add(identifiable);

            input = scanner.nextLine();
        }

        String fakeIdNum = scanner.nextLine();
        list.stream().map(Identifiable::getId).filter(id -> id.endsWith(fakeIdNum)).forEach(System.out::println);
    }
}
