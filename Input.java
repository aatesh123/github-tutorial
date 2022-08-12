import java.util.Scanner;  

class Input {
  public static void main(String[] args) {

    int arr[]={1,2,3,4,5};
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter first Number");
    int x = myObj.nextInt();
    // String userName = myObj.nextLine();  
    System.out.println("Enter Second Number");
    int y= myObj.nextInt();
    System.out.println(x+y + arr[1]);  
    System.out.println(x-y );  
    System.out.println(x*y );  
    System.out.println(x/y );  
  }
}