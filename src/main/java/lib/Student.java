package lib;

public class Student {
    public int Id;
    String name;
    String programme;

    public Student(){
        System.out.println("a new student instanciate");
    }

    public Student(int Id, String name){
        this(Id);
        this.name=name;
    }

    public Student(int Id, String name, String programme){
        this(Id, name);
        this.programme=programme;
    }

    public Student(String name, int id){
        this.Id=Id;
        this.name=name;
    }

    public Student(String name){
        this.name=name;
    }

    public Student(int Id){
        this.Id=Id;
    }


    public void read(){
        System.out.println(this.name+ " can read in"+this.programme);
    }

    public void write(){
        System.out.println(this.name+ " can write");
    }
}
