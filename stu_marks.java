import java.util.*;
public class stu_marks {
    int rno, age, m1, m2, tm;
    String name;
    double persentage;

    public void show()
    {
        System.out.println("roll no :"+ rno);
        System.out.println("name :"+ name);
        System.out.println("age :"+ age);
        System.out.println("marks 1 :"+ m1);
        System.out.println("marks 2 :"+ m2);
        System.out.println("total marks :"+ tm);
        System.out.println("percentage :"+ persentage);
    }

    public void getinfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll no:");
        rno = sc.nextInt();
        System.out.println("enter name:");
        name = sc.next();
        System.out.println("enter age:");
        age = sc.nextInt();
        System.out.println("enter marks 2:");
        m1 = sc.nextInt();
        System.out.println("enter marks 1:");
        m2 = sc.nextInt();
    }

    public void calculate()
    {
        tm=m1+m2;
        persentage=tm/2.0;
    }

    public static void main(String args[])
    {
        stu_marks s1 = new stu_marks();
        s1.getinfo();s1.calculate();
        s1.show();
    } 
}
