import java.util.Random;

class Remorca{
    public int cuti_remorca;
    public String nr_inmatriculare;
    private static int previous = 9;
    
    public Remorca(int cuti_remorca,String nr_inmatriculare){
        this.cuti_remorca = cuti_remorca;
        this.nr_inmatriculare = nr_inmatriculare;
        this.previous = cuti_remorca;
    }
    
    public Remorca(String nr_inmatriculare){
        this.nr_inmatriculare = nr_inmatriculare;
        this.cuti_remorca = ++this.previous;
    }

    @Override
    public String toString() {
        return "R(" + nr_inmatriculare + ", " + cuti_remorca + ")";
    }
}

class Tir{
    public Remorca[] lista_remorci = new Remorca[5]; 
    
    public boolean estePlina(){
        for(int i=0;i<lista_remorci.length;i++){
            if(lista_remorci[i]==null){
                return false;
            }
        }
        return true;
    }
    
    public boolean adaugaRemorca(int cuti_remorca, String nr_inmatriculare){
        if (this.estePlina()){
            return false;
        }
        else{
            for(int i = 0; i < lista_remorci.length; i++){
                if(lista_remorci[i] == null){
                    lista_remorci[i] = new Remorca(cuti_remorca, nr_inmatriculare);
                    return true; 
                }
            } 
            return false;
        }
    }
    
    public boolean adaugaRemorca(Remorca remorca_new){
        if (this.estePlina()){
            return false;
        }
        else{
            for(int i = 0; i < lista_remorci.length; i++){
                if(lista_remorci[i] == null){
                    lista_remorci[i] = remorca_new;
                    return true; 
                }
            } 
            return false;
        }
    }
    private boolean exist_remorca(String nr_inmatriculare){
        for(int i=0;i<lista_remorci.length;i++){
            if(lista_remorci[i]!=null && lista_remorci.nr_inmatriculare.equals(nr_inmatriculare)){
                return true;
            }
        }
        return false;
    }
    public Remorca stergeRemorca(String nr_inmatriculare){
        
    }
    private int calculeazaTotalCutii() {
        int totalCutii = 0;
        for (int i = 0; i < lista_remorci.length; i++) {
            if (lista_remorci[i] != null) {
                totalCutii += lista_remorci[i].cuti_remorca; 
            }
        }
        return totalCutii;
    }
    public void print_all(){
        for(int i=0;i<lista_remorci.length;i++){
            if(lista_remorci[i]!=null){
                System.out.println(lista_remorci[i].nr_inmatriculare+" "+ lista_remorci[i].cuti_remorca);
            }
        }
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
            return false;
        Tir altTir = (Tir) obj;
        
        if (altTir.calculeazaTotalCutii() ==this.calculeazaTotalCutii()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("T");
        for (int i = 0; i < lista_remorci.length; i++) {
            if (lista_remorci[i] != null) {
                sb.append(" -> ").append(lista_remorci[i]);
            }
        }
        return sb.toString();
    }
}

public class lab4{
    public static void main(String[] args) {
        Tir tir1 = new Tir();
        tir1.adaugaRemorca(20,new String("AR22MGS"));
        tir1.adaugaRemorca(20,new String("AR22PLM"));
        tir1.adaugaRemorca(20,new String("AR22IOT"));
        tir1.adaugaRemorca(20,new String("AR22MGS"));
        tir1.adaugaRemorca(20,new String("AR20PLS"));
        tir1.adaugaRemorca(20,new String("AR22CAC"));
        
        Tir tir2 = new Tir();
        
        tir2.adaugaRemorca(20,new String("AR22CAC"));
        tir2.adaugaRemorca(20,new String("AR22CAC"));
        tir2.adaugaRemorca(20,new String("AR22CAC"));
        tir2.adaugaRemorca(20,new String("AR22CAC"));
        tir2.adaugaRemorca(20,new String("AR22CAC"));
        
        if (tir1.equals(tir2)){
            System.out.println("MERGE");
        }
        System.out.println(tir1);
        System.out.println(tir2);
        //tir1.print_all();
    }
}
