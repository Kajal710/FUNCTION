class Pen{
    String color; //property

    void Property(){
        System.out.println("The color of the Pen is:"+this.color);
    }

}

public class ClassabdObjectEX2 {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="Black";
        p1.Property();

        Pen p2 = new Pen();
        p2.color="Red";
        p2.Property();
        
    }
}
