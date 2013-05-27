import java.util.Scanner;
class students{
    String firstname;
    String lastname;
    }
public class Main {
    public static void main(String[] args){
        Scanner accept=new Scanner(System.in);
        students s1=new students();
        System.out.println("Enter the first name ");
        s1.firstname=accept.next();
        System.out.println("Enter the last name ");
        s1.lastname=accept.next();
        System.out.println(s1.firstname+" "+s1.lastname);
       // System.out.println(s1.lastname);
    }
}