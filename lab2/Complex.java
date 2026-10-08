import java.lang.Math;

class Complex{
    private double real,img;
    private static int count_print = 0;
    public Complex(double real, double img){
        this.real = real;
        this.img = img;

    }
    public double getReal(){
        return this.real;
    }
    public double getImg(){
        return this.img;
    }
    public double modulNrComplex(){

        return Math.sqrt(this.real*this.real+this.img*this.img);

    }
    public Complex sum(Complex added_obj){
        return new Complex(added_obj.getReal()+this.real,+added_obj.getImg()+this.img);
    }
    public void print(){
        count_print++;
        System.out.println(this.real+"+ i*"+this.img);
    }
    public void print_times_printed(){
        System.out.println(this.count_print);
    }
}