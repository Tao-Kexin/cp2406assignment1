package cp2406assignment1;

import java.util.*;
import java.lang.Math;


public class golfinitial {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String userName = input.nextLine();
        
        System.out.println("Hello " + userName + ",let's play golf.");
        String menu;
        
        System.out.println("(I)nsturctions (P)lay round (Q)uit");
        menu = input.nextLine();
        while (!menu.equals("Q")) {
            if (menu.equals("P") || menu.equals("p")) {
                play();
            } else {
                if (menu.equals("I") || menu.equals("i")) {
                    System.out.println("This is a simple golf game in which each hole is 230m game away with par 5. ");
                    System.out.println("The user can choose three clubs( the probably distance that you want to hit the ball), which includes  F(farthest), M(medium), C(closest). ");
                    System.out.println(" F is the farthest distance, which will hit about 80 to 120m. ");
                    System.out.println("M is the medium distance that you want to hit, which will hit around 30m." );
                    System.out.println("C is the closest distance that you want to hit, which will hit around 10m.");
                    System.out.println(" The club C  is best used for quite close to the hole.");
                    System.out.println("(I)nsturctions (P)lay round (Q)uit");
                }if (menu.equals("Q") || menu.equals("q")) {
                    System.out.println("Thank You for Playing " + userName + ".");
                    break;
                }else {
                    System.out.println("Invalid menu choice.");
                    System.out.println("(I)nsturctions (P)lay round (Q)uit");
                }
                menu = input.nextLine();
            }
    
        }
    }
    
    public static int play() {
        System.out.println("You are 230m from the hole, after 0 shot /s. ");
        System.out.println("Club selection:");
        System.out.println("press F for the farthest distance");
        System.out.println("press M for the medium distance");
        System.out.println("press C for the closest distance");
        String club;
        int goal;
        
        goal = 230;
        int distance;
        int score;
        
        score = 0;
        club = input.nextLine();
        while (goal != 0) {
            if (club.equals("F") || club.equals("f")) {
                distance = random.nextInt(40) + 80;
            } else {
                if (club.equals("M") || club.equals("m")) {
                    distance = random.nextInt(12) + 24;
                } else {
                    if (club.equals("C") || club.equals("c")) {
                        distance = random.nextInt(4) + 8;
                    } else {
                        System.out.println("air score:(");
                        distance = 0;
                    }
                    if (goal <= 10) {
                        int special;
                        
                        special = random.nextInt(11);
                        if (special <= 8) {
                            goal = distance;
                        }
                    }
                }
            }
            goal = Math.abs(goal - distance);
            score = score + 1;
            System.out.println("Your shot went " + distance + "m");
            if (goal == 0) {
            } else {
                System.out.println("You are " + goal + " from the hole, after " + score + "shot/s");
                System.out.println("Club selection:");
                System.out.println("F is farthest ");
                System.out.println("M is medium");
                System.out.println("C is closet");
                club = input.nextLine();
            }
        }
        if (score < 5) {
            System.out.println("After " + score + " hits, the ball is in the hole! And that¡¯s  under par.");
        } else {
            if (score == 5) {
                System.out.println("After " + score + " hits, the ball is in the hole! And that¡¯s par.");
            } else {
                if (score > 5) {
                    System.out.println("After " + score + " hits, the ball is in the hole! And that¡¯s over par.");
                }
            }
        }
        
        return goal;
    }
}
