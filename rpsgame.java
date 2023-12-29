import java.util.Scanner;

public class rpsgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Name  ");
        String userName = scan.nextLine();

        System.out.println("welcome too Rock|Paper|sciccors," + " " + userName);
        System.out.printf("\n \t\t  <--GAME RULES--> \n");
        System.out.printf(" \t\t rock vs paper->rock wins \n" + //
                " \t\t rock vs scissors->rock wins \n" + //
                "\t\t paper vs scissors->scissors wins\n " +
                "\t \t This game has Five Rounds ");
        int userscore = 0;
        int computerscore = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("\t\n -> please choose you opiton\n\n");
            System.out.printf("\t 1.ROCK,2.PAPERS,3.SCISSORS\n");
            int userop = scan.nextInt();

            if (userop != 1 && userop != 2 && userop != 3) {
                System.out.println("->please give proper input to continue the Game");
            } else {
                if (userop == 1) {
                    System.out.println("You choose Rock ");
                } else if (userop == 2) {
                    System.out.println("You choose Papers ");

                } else {
                    System.out.println("You choose Scissors ");
                }
            }
            System.out.printf("\n  -> Now it's Computer's chance \n");
            float computer = (float) Math.random();
            int computerop;
            if (computer <= 0.5) {
                computerop = 1;
                System.out.println("Computer choose  Rock ");

            } else if (computer <= 0.8) {
                computerop = 2;
                System.out.println(" Computer choose Papers ");
            } else {
                computerop = 3;
                System.out.println(" Computer choose Scissors ");
            }

            if (userop == 1 && computerop == 1) {
                System.out.println("draw");
            } else if (userop == 1 && computerop == 2) {
                userscore++;
            } else if (userop == 1 && computerop == 3) {
                userscore++;

            }
            if (userop == 2 && computerop == 2) {
                System.out.println("draw");
            } else if (userop == 2 && computerop == 1) {
                computerscore++;
            } else if (userop == 2 && computerop == 3) {
                computerscore++;
            }
            if (userop == 3 && computerop == 3) {
                System.out.println("draw");
            } else if (userop == 3 && computerop == 1) {
                computerscore++;
            } else if (userop == 3 && computerop == 2) {
                userscore++;
            }

        }
        if (userscore > computerscore) {
            System.out.println(userName + " ," + "Congratulations!! You have Won the Match!!!!");
            System.out.println("Your score " + userscore);
            System.out.println("Computer score " + computerscore);
        } else if (userscore == computerscore) {
            System.out.println("Match draw");
        } else {
            System.out.println("Better luck next Time" + userName);
            System.out.println("Your score " + userscore);
            System.out.println("Computer score " + computerscore);
        }
        userscore = 0;
        computerscore = 0;

        scan.close();
    }
}
