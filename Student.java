public class Student{
    int name;
    int rollno;

    Student(int n,int r){
        this.name=n;
        this.rollno=r;

    }
    public void printInfo(){
        System.out.println(rollno);
        System.out.println(name);
    }
};
public static void main(String[] args){
    Student s1=new Student("john",12);
    s1.printInfo();


};
