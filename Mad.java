import java.util.Scanner;
public class Mad{
    public static void main(String[] args) {
       Scanner Myjob = new Scanner(System.in);

       String adjective1; 
       String noun1;
       String adjective2;
       String verb1;
       String adjective3;

       System.out.print("Enter an adjective (description):");
       adjective1 = Myjob.nextLine();
       
       System.out.print("Enter noun (animal or person):");
       noun1 = Myjob.nextLine();

       System.out.print("Enter an adjective (description):");
       adjective2 = Myjob.nextLine();
       
       System.out.print("Enter a verb ending with ing (action):");
       verb1 = Myjob.nextLine();
      
       System.out.print("Enter an adjective (description):");
       adjective3 = Myjob.nextLine();
       


       System.out.println("Today I want to a " + adjective1 + " ");
       System.out.println("In an exhibit , I saw a " + noun1 + ".");
       System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
       System.out.println("I was " + adjective3 + "!");

       Myjob.close();
     
       




    }
}