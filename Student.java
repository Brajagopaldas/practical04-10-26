import java.util.Scanner;

class Student {
    String studentName;
    int rollnum;
    double marks;
    
    Student(String name, int rnum, double mks){
        studentName = name;
        rollnum = rnum;
        marks = mks;
    }

    void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollnum);
        System.out.println("Marks        : " + marks);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine(); 

        System.out.println("Enter Roll number:");
        int rollnum = sc.nextInt();

        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();

        Student s1 = new Student(name, rollnum, marks); 
        s1.display();

        sc.close();
    }
}
