import java.util.*;
public class Project {
    public static void printId(String name,long phoneNo){
        System.out.print(name+" ");
        System.out.println(phoneNo);//id creation
        return ;

    }
    public static void totalAmount(int totalAmount){
        System.out.println("Total Amount to create an Account:"+totalAmount);

    }//total amount to be added in the account
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //id formation
        System.out.print("Enter your name to create an id:");
        String name = sc.next();
        System.out.print("Enter your phone no:");
        long phoneNo = sc.nextLong();
        System.out.println("id created"); 
        printId(name, phoneNo);
        //account creation
        System.out.print("Enter the sum to create an account:");
        int totalAmount = sc.nextInt();
        totalAmount(totalAmount);
        int redAmount = totalAmount;
        //expense loop
        for(int i=1;i>0;i++){
            System.out.print("Enter your Expense:");
            int expense = sc.nextInt();
            redAmount = (redAmount-expense);
            System.out.println("Total money left:"+redAmount);
            //critical limit
             if(redAmount <=10){
                System.out.println("You are below the critical limit:");               
            }
            //program break
            if(redAmount <= 0){
                System.out.println("Your Account is been blocked temporarily");
                break;
            }
            //Loop for main function
            System.out.println("Choose button 1 to exit the program 2 to continue and 3 to add the money in the account:");
            int button = sc.nextInt();
            if(button == 1){
                break;
            }
            //addition of sum
            if(button == 3){
                System.out.println("Enter the sum to be added:");
                int addAmount = sc.nextInt();
                redAmount = redAmount+addAmount;
                System.out.println("The new Amount:"+redAmount);
                System.out.println("Choose 3 to exit and 4 to continue the process:");
                int button1 = sc.nextInt();
                if(button1 == 3){
                    break;
                }else{
                    continue;
                }
            }else{
                continue;
            }
        }       
        sc.close();
        
    }   
}
//Coded by Parth Krishna Agrawal
//..............................