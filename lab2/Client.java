
class Client{

    public static void main(String[] args){

        /*Student student1 = new Student("Maria");
        Student student2 = new Student("Maria");
        student1.print();
        student2.print();
        System.out.print(student1.getCount()+" "+student2.getCount());
        */
        Complex sistem1 = new Complex(2.0,4.3);
        Complex sistem2 = new Complex(3.2,5.7);
        Complex sum_sistem = sistem1.sum(sistem2);
        sum_sistem.print();
        sum_sistem.print_times_printed();
    }
}
