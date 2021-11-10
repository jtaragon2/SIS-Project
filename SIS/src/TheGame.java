
import java.util.Scanner;

public class TheGame
	{
		private static int row;
		private static int col;
		
		private static int board[][][];
		
		private static String name;
		private static String nameII;
		private static boolean win;
		private static int turn;
		private static boolean quiere=true;
		private static int layerC;
		private static int colC;
		private static int shelfC;
		private static int victory;
		private static int nameWins;
		private static int nameIIWins;
		private static int wins;
		private static Scanner getter = new Scanner(System.in);
		private static Scanner stringGetter = new Scanner(System.in);
		
		private static int nameNum;
		private static int nameIINum;
		
		public static void mainGame()
			{
				
				nameGet();
				boardMaker();
				playGame();
				
			}
			
		public static void playGame()
			{
				while (quiere)
					{
						win = true;
						move();
						System.out.println("Would you like to play again? 1 for yes and 0 for no.");
						boardMaker();
						int quieren = getter.nextInt();
						if (quieren == 0)
							{
								quiere = false;
								
								
							}
						else if (quieren == 1)
							{
								quiere = true;
								System.out.println("Ok");
								if (wins != 0)
									{
										if (nameWins == 1)
											{
												System.out.println(name + " has 1 win!");
											}
										else
											{
												System.out.println(name + " has " + nameWins + " wins!");
											}
										if (nameIIWins == 1)
											{
												System.out.println(nameII + " has 1 win!");
											}
										else
											{
												System.out.println(nameII + " has " + nameIIWins + " wins!");
											}
									}
							}
						else
							{
								System.out.println("And I yeet");
								quiere = false;
							}
					} 
				;
			}
			
		public static void nameGet()
			{
				
				System.out.println("First player, what is your name?");
				name = stringGetter.nextLine();
				
				System.out.println("Second player, what is your name?");
				nameII = stringGetter.nextLine();
				System.out.println("Ok " + name + " and " + nameII + ", Shall we play a game? 1 for yes and 0 for no.");
				
				int status = getter.nextInt();
				if (status == 0)
					{
						
						quiere = false;
					}
				else if (status != 1)
					{
						System.out.println("and I yeet you and your mistake from this house.");
						System.exit(0);
					}
				// System.out.println("Ok " + name + ", you will be X's and " + nameII + " will
				// be O's.");
			}
			
		public static void boardMaker()
			{
				board = new int[3][3][3];
				for (row = 0; row < board.length; row++)
					{
						for (col = 0; col < board.length; col++)
							{
								for (int shelf = 0; shelf < board[row][col].length; shelf++)
									{
										board[row][col][shelf] = 0;
										
									}
							}
					}
			}
			
		public static void board()
			{
				
				for (row = 0; row < board.length; row++)
					{
						System.out.println("Layer " + (row + 1));
						System.out.println("        1         2         3");
						System.out.println("   _______________________________");
						for (col = 0; col < board.length; col++)
							{
								
								if (board[row][col][0] == 0 && board[row][col][1] == 0 && board[row][col][2] == 0)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |         |         |         |  ");
										System.out.println((1 + col) + "  |         |         |         |  ");
										System.out.println("   |         |         |         |  ");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 0 && board[row][col][2] == 0)
									{
										System.out.println("   |   ___   |         |         |");
										System.out.println("   |  |   |  |         |         |");
										System.out.println((1 + col) + "  |  |   |  |         |         |");
										System.out.println("   |  |___|  |         |         |");
									}
								else if (board[row][col][0] == 0 && board[row][col][1] == 2 && board[row][col][2] == 0)
									{
										System.out.println("   |         |   ___   |         |");
										System.out.println("   |         |  |   |  |         |");
										System.out.println((1 + col) + "  |         |  |   |  |         |");
										System.out.println("   |         |  |___|  |         |");
										
									}
								else if (board[row][col][0] == 0 && board[row][col][1] == 0 && board[row][col][2] == 2)
									{
										System.out.println("   |         |         |   ___   |");
										System.out.println("   |         |         |  |   |  |");
										System.out.println((1 + col) + "  |         |         |  |   |  |");
										System.out.println("   |         |         |  |___|  |");
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 0 && board[row][col][2] == 0)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |  *   *  |         |         |");
										System.out.println((1 + col) + "  |    *    |         |         |");
										System.out.println("   |  *   *  |         |         |");
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 1 && board[row][col][2] == 1)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |  *   *  |  *   *  |  *   *  |");
										System.out.println((1 + col) + "  |    *    |    *    |    *    |");
										System.out.println("   |  *   *  |  *   *  |  *   *  |");
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 1 && board[row][col][2] == 0)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |  *   *  |  *   *  |         |");
										System.out.println((1 + col) + "  |    *    |    *    |         |");
										System.out.println("   |  *   *  |  *   *  |         |");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 2 && board[row][col][2] == 0)
									{
										System.out.println("   |   ___   |   ___   |         |");
										System.out.println("   |  |   |  |  |   |  |         |");
										System.out.println((1 + col) + "  |  |   |  |  |   |  |         |");
										System.out.println("   |  |___|  |  |___|  |         |");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 2 && board[row][col][2] == 2)
									{
										System.out.println("   |   ___   |   ___   |   ___   |");
										System.out.println("   |  |   |  |  |   |  |  |   |  |");
										System.out.println((1 + col) + "  |  |   |  |  |   |  |  |   |  |");
										System.out.println("   |  |___|  |  |___|  |  |___|  |");
									}
								else if (board[row][col][0] == 0 && board[row][col][1] == 0 && board[row][col][2] == 1)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |         |         |  *   *  |  ");
										System.out.println((1 + col) + "  |         |         |    *    |  ");
										System.out.println("   |         |         |  *   *  |  ");
									}
								else if (board[row][col][0] == 0 && board[row][col][1] == 1 && board[row][col][2] == 1)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |         |  *   *  |  *   *  |  ");
										System.out.println((1 + col) + "  |         |    *    |    *    |  ");
										System.out.println("   |         |  *   *  |  *   *  |  ");
									}
								else if (board[row][col][0] == 0 && board[row][col][1] == 1 && board[row][col][2] == 0)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |         |  *   *  |         |  ");
										System.out.println((1 + col) + "  |         |    *    |         |  ");
										System.out.println("   |         |  *   *  |         |  ");
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 0 && board[row][col][2] == 1)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |  *   *  |         |  *   *  |  ");
										System.out.println((1 + col) + "  |    *    |         |    *    |  ");
										System.out.println("   |  *   *  |         |  *   *  |  ");
									}
								else if (board[row][col][0] == 0 && board[row][col][1] == 2 && board[row][col][2] == 2)
									{
										System.out.println("   |         |   ___   |   ___   |");
										System.out.println("   |         |  |   |  |  |   |  |");
										System.out.println((1 + col) + "  |         |  |   |  |  |   |  |");
										System.out.println("   |         |  |___|  |  |___|  |");
										
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 1 && board[row][col][2] == 2)
									{
										System.out.println("   |         |         |   ___   |");
										System.out.println("   |  *   *  |  *   *  |  |   |  |");
										System.out.println((1 + col) + "  |    *    |    *    |  |   |  |");
										System.out.println("   |  *   *  |  *   *  |  |___|  |");
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 2 && board[row][col][2] == 2)
									{
										System.out.println("   |         |   ___   |   ___   |");
										System.out.println("   |  *   *  |  |   |  |  |   |  |");
										System.out.println((1 + col) + "  |    *    |  |   |  |  |   |  |");
										System.out.println("   |  *   *  |  |___|  |  |___|  |");
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 2 && board[row][col][2] == 1)
									{
										System.out.println("   |         |   ___   |         |");
										System.out.println("   |  *   *  |  |   |  |  *   *  |  ");
										System.out.println((1 + col) + "  |    *    |  |   |  |    *    |  ");
										System.out.println("   |  *   *  |  |___|  |  *   *  |  ");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 2 && board[row][col][2] == 1)
									{
										System.out.println("   |   ___   |   ___   |         |");
										System.out.println("   |  |   |  |  |   |  |  *    * |");
										System.out.println((1 + col) + "  |  |   |  |  |   |  |    *    |");
										System.out.println("   |  |___|  |  |___|  |  *    * |");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 0 && board[row][col][2] == 2)
									{
										System.out.println("   |   ___   |         |   ___   |");
										System.out.println("   |  |   |  |         |  |   |  |");
										System.out.println((1 + col) + "  |  |   |  |         |  |   |  |");
										System.out.println("   |  |___|  |         |  |___|  |");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 1 && board[row][col][2] == 1)
									{
										System.out.println("   |   ___   |         |         |");
										System.out.println("   |  |   |  |  *   *  |  *   *  |  ");
										System.out.println((1 + col) + "  |  |   |  |    *    |    *    |  ");
										System.out.println("   |  |___|  |  *   *  |  *   *  |  ");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 1 && board[row][col][2] == 2)
									{
										System.out.println("   |   ___   |         |   ___   |");
										System.out.println("   |  |   |  |  *   *  |  |   |  |");
										System.out.println((1 + col) + "  |  |   |  |    *    |  |   |  |");
										System.out.println("   |  |___|  |  *   *  |  |___|  |");
									}
								else if (board[row][col][0] == 0 && board[row][col][1] == 1 && board[row][col][2] == 2)
									{
										System.out.println("   |         |         |   ___   |");
										System.out.println("   |         |  *   *  |  |   |  |  ");
										System.out.println((1 + col) + "  |         |    *    |   |   |  |  ");
										System.out.println("   |         |  *   *  |  |___|  |  ");
									}
								else if (board[row][col][0] == 0 && board[row][col][1] == 2 && board[row][col][2] == 1)
									{
										System.out.println("   |         |   ___   |         |");
										System.out.println("   |         |  |   |  |  *   *  |  ");
										System.out.println((1 + col) + "  |         |  |   |  |    *    |  ");
										System.out.println("   |         |  |___|  |  *   *  |  ");
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 0 && board[row][col][2] == 2)
									{
										System.out.println("   |         |         |   ___   |");
										System.out.println("   |  *   *  |         |  |   |  |  ");
										System.out.println((1 + col) + "  |    *    |         |  |   |  |  ");
										System.out.println("   |  *   *  |         |  |___|  |  ");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 0 && board[row][col][2] == 1)
									{
										System.out.println("   |   ___   |         |         |");
										System.out.println("   |  |   |  |         |  *   *  |");
										System.out.println((1 + col) + "  |  |   |  |         |    *    |");
										System.out.println("   |  |___|  |         |  *   *  |");
									}
								else if (board[row][col][0] == 1 && board[row][col][1] == 2 && board[row][col][2] == 0)
									{
										System.out.println("   |         |   ___   |         |");
										System.out.println("   |  *   *  |  |   |  |         |  ");
										System.out.println((1 + col) + "  |    *    |  |   |  |         |  ");
										System.out.println("   |  *   *  |  |___|  |         |  ");
									}
								else if (board[row][col][0] == 2 && board[row][col][1] == 1 && board[row][col][2] == 0)
									{
										System.out.println("   |   ___   |         |         |");
										System.out.println("   |  |   |  |  *   *  |         |");
										System.out.println((1 + col) + "  |  |   |  |    *    |         |");
										System.out.println("   |  |___|  |  *   *  |         |");
									}
								System.out.println("   |_________|_________|_________|");
								
							}
						System.out.println();
					}
			}
			
		public static boolean hasWon()
			{
				if (board[1][1][1] == 1 && board[2][2][2] == 1 && board[0][0][0] == 1)
					{
						return true;
					}
				return false;
			}
			
		public static void move()
			{
				// board();
				System.out.println(name + ", would you like to be X's or  O's?");
				
				String xAndO = stringGetter.nextLine();
				if (xAndO.equalsIgnoreCase("x"))
					{
						nameNum = 1;
						nameIINum = 2;
					}
				else if (xAndO.equalsIgnoreCase("o"))
					{
						nameNum = 2;
						nameIINum = 1;
					}
				else
					{
						System.out.println("and I yeet you and your mistake from this house.");
						System.exit(0);
					}
				while (win)
					{
						if (nameNum == 1)
							{
								if (turn % 2 == 0)
									{
										
										System.out.println("Ok " + name
												+ ", where do you want to go? Layer 1, 2, or 3? (Just the number)");
										
										layerC = getter.nextInt();
										System.out.println("Ok " + name
												+ ", where do you want to go? Row 1, 2, or 3? (Just the number)");
										
										colC = getter.nextInt();
										System.out.println("Ok " + name
												+ ", where do you want to go? Column 1, 2, or 3? (Just the number)");
										
										shelfC = getter.nextInt();
										if (board[layerC - 1][colC - 1][shelfC - 1] == 0)
											{
												board[layerC - 1][colC - 1][shelfC - 1] = nameNum;
											}
										else
											{
												System.out.println("You can't do that");
												turn--;
												System.out.println("Try again");
											}
									}
								else if (turn % 2 == 1)
									{
										
										System.out.println("Ok " + nameII
												+ ", where do you want to go? Layer 1, 2, or 3? (Just the number)");
										
										layerC = getter.nextInt();
										System.out.println("Ok " + nameII
												+ ", where do you want to go? Row 1, 2, or 3? (Just the number)");
										
										colC = getter.nextInt();
										System.out.println("Ok " + nameII
												+ ", where do you want to go? Column 1, 2, or 3? (Just the number)");
										
										shelfC = getter.nextInt();
										if (board[layerC - 1][colC - 1][shelfC - 1] == 0)
											{
												board[layerC - 1][colC - 1][shelfC - 1] = nameIINum;
											}
										else
											{
												System.out.println();
												System.out.println("You can't do that");
												turn--;
												System.out.println("Try again");
												System.out.println();
											}
											
									}
							}
						else
							{
								if (turn % 2 == 1)
									{
										
										System.out.println("Ok " + name
												+ ", where do you want to go? Layer 1, 2, or 3? (Just the number)");
										
										layerC = getter.nextInt();
										System.out.println("Ok " + name
												+ ", where do you want to go? Row 1, 2, or 3? (Just the number)");
										
										colC = getter.nextInt();
										System.out.println("Ok " + name
												+ ", where do you want to go? Column 1, 2, or 3? (Just the number)");
										
										shelfC = getter.nextInt();
										if (board[layerC - 1][colC - 1][shelfC - 1] == 0)
											{
												board[layerC - 1][colC - 1][shelfC - 1] = nameNum;
											}
										else
											{
												System.out.println("You can't do that");
												turn--;
												System.out.println("Try again");
											}
									}
								else if (turn % 2 == 0)
									{
										
										System.out.println("Ok " + nameII
												+ ", where do you want to go? Layer 1, 2, or 3? (Just the number)");
										
										layerC = getter.nextInt();
										System.out.println("Ok " + nameII
												+ ", where do you want to go? Row 1, 2, or 3? (Just the number)");
										
										colC = getter.nextInt();
										System.out.println("Ok " + nameII
												+ ", where do you want to go? Column 1, 2, or 3? (Just the number)");
										
										shelfC = getter.nextInt();
										if (board[layerC - 1][colC - 1][shelfC - 1] == 0)
											{
												board[layerC - 1][colC - 1][shelfC - 1] = nameIINum;
											}
										else
											{
												System.out.println();
												System.out.println("You can't do that");
												turn--;
												System.out.println("Try again");
												System.out.println();
											}
											
									}
							}
						turn++;
						board();
						if (turn >= 5)
							{
								System.out.println("Has anyone won yet? 1 for yes and 0 for no.");
								
								victory = getter.nextInt();
								if (victory == 1)
									{
										turn =0;
										win = false;
										wins++;
										System.out.println("Who won?");
										String winner = stringGetter.nextLine();
										if (winner.toLowerCase().equals(name.toLowerCase()))
											{
												nameWins++;
											}
										else if (winner.toLowerCase().equals(nameII.toLowerCase()))
											{
												nameIIWins++;
											}
									}
							}
					}
			}
	}
