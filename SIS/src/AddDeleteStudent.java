import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;


public class AddDeleteStudent
	{

		static Scanner intInput = new Scanner(System.in);
		static Scanner stringInput = new Scanner(System.in);
		static int answer;
		static String first;
		static String last;
		static int firstP;
		static int secondP;
		static int thirdP;
		static String firstG;
		static String secondG;
		static String thirdG;

		
		public static void main(String[] args) throws IOException
			{
				System.out.println("Would you like to: ");
				System.out.println("1) Add a Student");
				System.out.println("2) Delete a Student");
				System.out.println("3) Go back to Main Menu");
				answer = intInput.nextInt();
				if(answer == 1)
					{
						System.out.println("What is the first name of your new student");
						first = stringInput.nextLine();
						//set name into array list
						RunSIS.Student.setFirstName(first);
						System.out.println("Last Name?");
						last = stringInput.nextLine();
						//last name into arraylist
						System.out.println("");
						
						
						System.out.println("What is " + first + " " + last + "'s first period class? Your options are: ");
						System.out.println("\t1) Biology\n\t2) English\n\t3) Algebra");
						firstP = intInput.nextInt();
						
						if(firstP == 1)
							{
								//fill array
								System.out.println("What about second period?");
								System.out.println("\t1) English\n\t2) Algebra");
								secondP = intInput.nextInt();
								if(secondP == 1)
									{
										//set 1 to class
										//use setter 
										//fill array
										//fill array with automatic third period
										//display all classes
									}
								else if(secondP == 2)
									{
										//set 2 to class
										//fill array
										//fill array with automatic third period
										//display all classes
									}
								
							}
	
						else if(firstP == 2)
							{
								//fill array
								System.out.println("What about second period?");
								System.out.println("\t1) Biology\n\t2) Algebra");
								secondP = intInput.nextInt();
								if(secondP == 1)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
								else if(secondP == 2)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
							}
						
						else if(firstP == 3)
							{
								//fill array
								System.out.println("What about second period?");
								System.out.println("\t1) Biology\n\t2) English");
								secondP = intInput.nextInt();
								if(secondP == 1)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
								else if(secondP == 2)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
							}
						else
							{
								System.out.println("You did not enter a valid answer, you will restart.");
							}
					}
				
				else if(answer == 2)
					{
						//display roster
						//for(int i = 0; i < RunSIS.TVShows.size(); i++)
							{
								System.out.println("Test");
								//System.out.println(i + 1 + ") ");
								//System.out.print(RunSIS.TVShows.get(i));
							}
					}

				//IF THEY PICK ADD
					//get new name
					//get new GPA
					//figure out the order of periods
				//IF THEY PICK DELETE
					//display the students
					//ask which student they would like to delete
					//delete name based on input
					//display new names

			}

	}
