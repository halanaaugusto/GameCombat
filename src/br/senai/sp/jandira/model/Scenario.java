package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Scenario {

    Scanner scanner = new Scanner(System.in);

    public String selecionarScenario() {

        System.out.println("Escolha o cenário: ");
        System.out.println("1- Carapicuiba 2- Itapevi 3- Jandira");

        int optionScenario = scanner.nextInt();
        scanner.nextLine();

        String scenario = "SENAI OSASCO";

        switch (optionScenario) {

            case 1:
                scenario = "Carapicuiba";
            break;

            case 2:
                scenario = "Itapevi";
            break;

            case 3:
                scenario = "Jandira";
            break;
        }
        System.out.println("Você escolheu: " + optionScenario);

        return scenario;
    }

}
