class Student{
    String name;
    int age;

    public void Display(){
        System.out.println("The Name of the Student is:"+this.name);
        System.out.println("The Age of the Student is :"+this.age);
    }
}
class ClassandObject{
public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Ram";
    s1.age=21;
    s1.Display();
    
}
}