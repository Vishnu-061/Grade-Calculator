//Garade calculator to used find the grade of the student
import java.util.Scanner;
public class gradecalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = sc.nextInt();
        if(marks == 95){
            System.out.println("First class");
        }else if(marks >=85 && marks <= 95){
            System.out.println("Second class");
        }else if(marks >=75 && marks <=85){
            System.out.println("Third class");
        }else if(marks>=65 && marks <=75){
            System.out.println("Fourth class");
        }else if(marks >=55 && marks <=65){
            System.out.println("Fifth class");
        }else{
            System.out.println("Fail");
        }
    }


}

