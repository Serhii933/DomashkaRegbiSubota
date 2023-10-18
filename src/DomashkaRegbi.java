import java.util.Arrays;
import java.util.Random;

public class DomashkaRegbi {
    //public static final int QUANTITY_PLAYERS = 25;
    public static void main(String[] args){

        Random random = new Random();

        int[] arrayTeamA = new int[25];
        int[] arrayTeamB = new int[25];

        //int sumTeam1 = 0;


        for (int index = 0; index < arrayTeamA.length; index++) {
            arrayTeamA[index] = random.nextInt(22) +18 ;

        }
        int sumTeam1 = 0;
        for (int arrElement1:
            arrayTeamA ) {
            sumTeam1 += arrElement1;
        }
        double averageAge1 = (double)sumTeam1 / arrayTeamA.length;

        int sumTeam2 = 0;

        for (int index = 0; index < arrayTeamB.length; index++) {
            arrayTeamB[index] = random.nextInt(22) +18;
            
        }

        for (int arrElement2:
             arrayTeamB) {
            sumTeam2 += arrElement2;
        }

        double averageAge2 = (double)sumTeam2 / arrayTeamB.length;
        System.out.println("Вік гравців команди A " +  Arrays.toString(arrayTeamA) + "Середній вік команди A " + averageAge1);
        System.out.println("Вік гравців команди B " + Arrays.toString(arrayTeamB) + "Середній вік команди B " + averageAge2);
















        






    }
}
