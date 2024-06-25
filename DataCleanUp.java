import java.util.*;
public class DataCleanUp {
    static Scanner readingData = new Scanner(System.in);
    static int arr[];

    public static void copyOver(int arr[]){
        ArrayList <Integer> arrList = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i+=1 ){
            if(arr[i] != 0){
                arrList.add(arr[i]);
            }
        }System.out.println("Your element after changes: " + (arrList));
    }

    public static void convertingPoint(int arr[]){
        int lastElement = arr.length-1;
        for(int i = 0 ; i < arr.length ; i+=1 ){
            if(arr[i] == 0){
                arr[i] = arr[lastElement];
                lastElement-=1;
            }
        }System.out.println("Your element's after changes: " + (Arrays.toString(arr)));
    }

    public static void main(String[] args) {
        userScreen();
    }

    public static void userScreen() {        
        System.out.print("\nHello , Enter your name here : ");
        String name = readingData.nextLine();

        System.out.println("Welcome " + (name) + " in clean up problem application\n");
        showSolution(cleanUpOption(),getElement());
        
        System.out.println("\nFinally , thank you " + (name) + " for visit us [ Good Luck :) ]\n");
    }

    public static int cleanUpOption() {
        System.out.println("\nPlease select one of the following solutions to starting ");
        System.out.println("1.Copy Over");
        System.out.println("2.Converting Pointer");
        System.out.println("3.None");

        System.out.print("\nSelect any number of these option: ");
        int option = readingData.nextInt();
        
        return option;
    }

    public static int [] getElement() {
        System.out.print("\nEnter size of your element's: ");
        int arrSize = readingData.nextInt();
        arr = new int[arrSize];

        for(int index = 0 ; index < arrSize ; index +=1){
            System.out.print("\nEnter element number " + (index+1) + " : ");
            arr[index] = readingData.nextInt();
        }
        return arr;
    }

    public static void showSolution(int option , int arrElement[]){
        switch (option) {
            case 1:
                copyOver(arrElement);
                break;            
            case 2:
                convertingPoint(arrElement);          
                break;            
            case 3: 
                System.out.println("Done and thank you for visit us!");          
                break;        
            default:
                System.out.println("Please select number as exist in list of options.!");
                break;
        }
    }
}