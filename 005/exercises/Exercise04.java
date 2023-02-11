/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

package exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[]args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a hora inicial do jogo.");
        int horaInicial = scan.nextInt();

        System.out.println("Digite a hora final do jogo.");
        int horaFinal = scan.nextInt();

        if(horaFinal>horaInicial){
            System.out.println("O jogo durou " + (horaFinal - horaInicial) + " horas");
        } else {
            int resto = 24 - horaInicial;
            System.out.println("O jogo durou " + (horaFinal + resto) + " horas");
        }

        scan.close();

    }
}
