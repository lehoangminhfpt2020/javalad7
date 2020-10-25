package lad7.mark;

import java.util.Scanner;

public class marks {
    String marks [][];

    String subjects;

    int Count;

    public marks(){
        marks = new String[2][2];
        Count =0;

    }

    void addpoint(){
        Scanner input = new Scanner(System.in);

        if(Count< marks.length){
            System.out.println("Enter the subject name: ");
            marks[Count][0] = input.next();

            System.out.println("Enter the point of " + marks[Count][0] + " :");
            marks[Count][1] = input.next();

            System.out.println("you have done.");

            Count ++;
        }
        else {
            System.out.println("sorry! Unable to add more books. \n");
        }


    }

    void  displaymarks(){
        if (Count >0){
            System.out.println("\n Name of Subject \t\t point");
            System.out.println("--------------------------------------");

            for (int i=0; i<Count; i++){
                System.out.printf("%s",marks[i][0]);
                System.out.printf("%s \n",marks[i][1]);

            }
        }
        else {
            System.out.println("No subject to display");
        }
    }

    void searchBySub(){
        boolean subject = false;
        String search = "";
        if (Count>0){
            Scanner input = new Scanner(System.in);
            System.out.println("Input name of subject you want to search: ");
            search = input.next();
            System.out.println("\n Name of Subject \t\t point");
            System.out.println("--------------------------------------");
            for (int i =0; i < Count; i++){
                if (marks[i][0] == search){
                    System.out.printf( "%s \t",marks[i][0]);
                    System.out.printf( "%s \t",marks[i][1]);
                    subject = true;
                    break;
                }
            }
            if (!subject)
                System.out.println(" Subject not found.");

        }
        else {
            System.out.println("No subject to search.");
        }
    }

    void searchByPoint(){
        boolean point = false;
        String searchh ="";
        if (Count>0){
            Scanner input = new Scanner(System.in);
            System.out.println("Input point of subject you want to search: ");
            searchh = input.nextLine();
            System.out.println("\n Name of Subject \t\t point");
            System.out.println("--------------------------------------");
            for (int i =0; i<Count; i++){
                if (marks[0][i] == searchh){
                    System.out.println(marks[i][0]);
                    System.out.println(marks[i][1]);
                    point = true;


                }
            }
            if (!point)
                System.out.println(" Subject not found.");
        }
        else {
            System.out.println("No subject to search.");
        }
    }
}
