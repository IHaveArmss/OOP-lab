import java.util.Objects;


class Student{
    public String name;
    private int id;
    private static int count = 0;
    
    public Student(String name){
        
        this.name = name;
        this.id = Objects.hashCode(name);
        count++;
        
    }
    
    public void print(){
        System.out.print("Student name "+name + " \nStudent id:"+ id +"\n");
    }
    public void getId( int id){
        this.id = id;
    }
    public int getCount(){
        return this.count;
    }
}


class Client{
    
    public static void main(String[] args){
        
        Student student1 = new Student("Maria");
        Student student2 = new Student("Maria");
        student1.print();
        student2.print();
        System.out.print(student1.getCount()+" "+student2.getCount());
    }
}
