package SnakeLadder;

public class Snakeandladder {
//
//public class SnakeAndLadder {
//    public static void main(String[] args) {
//        int Player;
//        int Position = 0;
//        System.out.println("Let's start a game..... ");
//        System.out.println("Player position is 0");
//    }
//}
//
//}
        //uc2
//public class SnakeAndLadder {
//    public static void main(String[] args) {
//        int Player;
//        int Position = 0;
//        int dieRolls = (int) Math.floor((Math.random() * 10) % 6 + 1);
//        System.out.println("Player position is 0");
//        System.out.println("Die is Rolling..... " + dieRolls);
//        int newPosition = Position + dieRolls;
//        System.out.println("Player Position " + newPosition);
//    }
//}
//}
	  //UC3
//	public static void main(String[] args) {
//        int Player;
//        int Position = 0;
//        final int LADDER = 2;
//        final int SNAKE = 1;
//        int dieRolls = (int) Math.floor((Math.random() * 10) % 6 + 1);
//        int option = (int) Math.floor((Math.random() * 10) % 3);
//        System.out.println("Option " + option);
//        switch (option) {
//            case SNAKE:
//                System.out.println("Die Rolls ...... " + dieRolls);
//                Position = Position - dieRolls;
//                if (Position < 0){
//                    Position = 0;
//                }
//                System.out.println("You got bite by a Snake & Your Position Goes to " + Position);
//                break;
//            case LADDER:
//                System.out.println("Die Rolls ...... " + dieRolls);
//                Position = Position + dieRolls;
//                System.out.println("Got a Ladder & Your Position Goes to " + Position);
//                break;
//            default:
//                System.out.println("Player position is Same");
//        }
//    }
//}
	     //UC4
//	public static void main(String[] args) {
//        int Player;
//        int playerPosition = 0;
//        final int LADDER = 2;
//        final int SNAKE = 1;
//        while (playerPosition <= 100) {
//            int dieRolls = (int) Math.floor((Math.random() * 10) % 6 + 1);
//            int option = (int) Math.floor((Math.random() * 10) % 3);
//
//            switch (option) {
//                case SNAKE:
//                    System.out.println("Die Rolls ...... " + dieRolls);
//                    System.out.println("Option is ...... " + option);
//                    playerPosition = playerPosition - dieRolls;
//                    System.out.println("You got a bite by Snake & Your Position Goes to " + playerPosition);
//                    if (playerPosition == 0) {
//                        System.out.println("Player position is Same " + playerPosition);
//                    }
//                    break;
//                case LADDER:
//                    System.out.println("Die Rolls ...... " + dieRolls);
//                    System.out.println("Option is ...... " + option);
//                    playerPosition = playerPosition + dieRolls;
//                    if (playerPosition > 100) {
//                        playerPosition = 100;
//                    }
//                    System.out.println("Got a Ladder & Your Position Goes to " + playerPosition);
//                    break;
//                default:
//                    System.out.println("Please Try Roll Die Again");
//            }
//            playerPosition++;
//        }
//    }
//}
	   //Uc5
	
//	public static void main(String[] args) {
//        int Player;
//        int playerPosition = 0;
//        final int LADDER = 2;
//        final int SNAKE = 1;
//        while (playerPosition <= 100) {
//            int dieRolls = (int) Math.floor((Math.random() * 10) % 6 + 1);
//            int option = (int) Math.floor((Math.random() * 10) % 3);
//
//            switch (option) {
//                case SNAKE:
//                    System.out.println("Die Rolls ...... " + dieRolls);
//                    System.out.println("Option is ...... " + option);
//                    playerPosition = playerPosition - dieRolls;
//                    System.out.println("You got a bite by Snake & Your Position Goes to " + playerPosition);
//                    if (playerPosition == 0) {
//                        System.out.println("Player position is Same " + playerPosition);
//                    }
//                    break;
//                case LADDER:
//                    System.out.println("Die Rolls ...... " + dieRolls);
//                    System.out.println("Option is ...... " + option);
//                    playerPosition = playerPosition + dieRolls;
//                    if (playerPosition >= 100) {
//                        playerPosition = 100;
//                    }
//                    System.out.println("Got a Ladder & Your Position Goes to " + playerPosition);
//                    break;
//                default:
//                    System.out.println("Please Try Roll Die Again");
//            }
//            playerPosition++;
//        }
//    }
//} 
	  
	  //UC6
	  
	 public static void main(String[] args) {
	        int playerPosition = 0;
	        final int LADDER = 2;
	        final int SNAKE = 1;
	        final int NO_PLAY = 0;
	        int dieRolls = 0;
	        while (playerPosition <= 100) {
	            dieRolls++;
	            int dieRolling = (int) (Math.floor(Math.random() * 10) % 6) + 1;
	            int option = (int) Math.floor((Math.random() * 10) % 3);

	            switch (option) {
	                case NO_PLAY:
	                    System.out.println("There will be no play. Player will be at same position");
	                    break;
	                case SNAKE:
	                    System.out.println("Number on die is: " + dieRolling);
	                    playerPosition = playerPosition - dieRolls;
	                    System.out.println("You got a bite by Snake & Your Position Goes to " + playerPosition);
	                    if (playerPosition <= 0) {
	                        System.out.println("Player position is " + playerPosition);
	                    }
	                    break;
	                case LADDER:
	                    System.out.println("Number on die is: " + dieRolling);
	                    playerPosition = playerPosition + dieRolls;
	                    if (playerPosition >= 100) {
	                        playerPosition = 100;
	                    }
	                    System.out.println("Got a Ladder & Your Position Goes to " + playerPosition);
	                    break;
	                default:
	                    break;
	            }
	            playerPosition++;
	        }
	        System.out.println("Total No Of DieRolls:" + dieRolls);
	    }
	}