class Bernstein2{
    static void main(String[] args){
        int a[] = new int[8]
        a[1] = 10
        a[2] = 11

        def h1 = new HiloCiclo("Ciclo Impares: ", 3,8,2,a)
        def h1 = new HiloCiclo("Ciclo Pares: ", 4,8,2,a)

        h1.start()
        h2.start()

        try {
            h1.join()
            h2.join()
        }catch(InterruptedException e){println "err: ${e}"}

        println "*"*80

        a.each{
            println it
        }
    }
}
class HiloCiclo extends Thread {
    int inicio, fin, inc
    int[] a;

    HiloCiclo ( String nombre, int inicio, int fin, int inc, int[] a){
        setName(nombre)
        this.inicio = inicio;
        this.fin    = fin
        this.inc    = inc
        this.a      = a;
    }
    void run(){
        for( int i=inicio; i<= fin; i+=2){
            a[i] = a[i-2] + 4
            println "${getName()}: ${a[i]}"
        }
    }
}


