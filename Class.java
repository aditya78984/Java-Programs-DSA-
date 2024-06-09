class Student{
    int roll_no;
    String name;

    Student(int roll_no){
        this.roll_no = roll_no;
    }

    void setName(String name){
        this.name=name;
    }
    void getinfo(){
        System.out.println(this.roll_no + ". " + this.name);
    }

}


public class Class {
    public static void main(String[] args) {
        Student s1 = new Student(7);
        Student s2 = new Student(5);
        s1.setName("Aditya");
        s2.setName("Aadi");
        s1.getinfo();
        s2.getinfo();
    }
}
