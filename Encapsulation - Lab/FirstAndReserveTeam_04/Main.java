package EncapsulationLab.FirstAndReserveTeam_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team("Black Eagles");
        List<Person> players = new ArrayList<>();
        for (Person player : players){
            team.addPlayer(player);
        }
    }
}
