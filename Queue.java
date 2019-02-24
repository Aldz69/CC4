
package queue;
import java.util.Scanner;
import java.util.ArrayList;


public class Queue {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
      ArrayList hans = new ArrayList();
             

     
        System.out.println("Enter Queue Size");
      int stackinput = sc.nextInt();      
         int arr[] = new int [stackinput];
         int top = -1;
         int front = 0;
       for (int i=0; ; i++) {
           System.out.println("Options");
          System.out.println("[1] INSERT ");
          System.out.println("[2] DELETE ");
          System.out.println("[3] EXIT ");
          int insertdeleteexit = sc.nextInt();
       
        switch(insertdeleteexit) {
            case 1:
        if ( top < arr.length -1) {
            System.out.println("Insert a number");
                hans.add(sc.nextInt());
         top++;
          System.out.println("QUEUE: " + hans.toString());
                        System.out.println("REAR: " + top);
                    } else {
                        System.out.println("Sorry the QUEUE is full: ");
                        System.out.println("QUEUE: " + hans.toString());
                        System.out.println("REAR: " + top);
                    }
                    break;

                case 2:
                    if (top >= 0) {
                      System.out.println("Pop a number: ");
                        hans.remove(front);
                        top--;
                        System.out.println("QUEUE :" + hans.toString());
                       System.out.println("REAR: " + top);

                    } else {
                        System.out.println("Sorry the QUEUE is empty!");
                        System.out.println("QUEUE :" + hans.toString());
                        System.out.println("REAR: " + top);
                    }
                    break;

                case 3:
                    System.out.println("END OF PROGRAM!!");
                    System.exit(0);

        }
        }
          
          
          
       }
   
    
}
    

    
    

