package br.senai.sp.jandira.model;

import java.util.Map;
import java.util.Scanner;

public class Battle {

    String scenarioBattle;

    Scanner scanner = new Scanner(System.in);

    public void startBattle(Player player, Enemy enemy) {

        boolean continuar = true;

        while (true){

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifeEnemy <= 0) {
                System.out.println("O player " + player.getName() + " é o vencedor!!!");
                break;
            } else if (lifePlayer <= 0) {
                System.out.println("O enemy " + player.getName() + "é o vencedor!!!");
                break;
            }

            System.out.println("================ Battle ================");
            System.out.println("Ataque player [X] " + player.getName() + " Life: " + lifePlayer);
            System.out.println("Ataque enemy  [A] " + enemy.getName() + " Life: " + lifeEnemy);
            System.out.println("========================================");

            String attack = scanner.nextLine();

            if (attack.equalsIgnoreCase("X")) {
                System.out.println("========== O player atacou! ===========");

                int danoPlayer = ((int) (Math.random() * 20) + 1);

                enemy.subtrairVida(danoPlayer);
                System.out.println("O dano gerado foi de: " + danoPlayer);

            } else if (attack.equalsIgnoreCase("A")) {
                System.out.println("=========== O enemy atacou! ===========");

                int danoEnemy = (int) (Math.random() * 20 + 1);
                player.subtrairVida(danoEnemy);
                System.out.println("O dano gerado foi de: " + danoEnemy);
                System.out.println("======================================");
            } else {
                System.out.println("Digite uma tecla válida!!!");
            }

        }

    }

}
