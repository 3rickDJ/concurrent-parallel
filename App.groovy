/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package threads
// heredar de la clase thread 
class Hilo  extends Thread {
    String cadena
    Hilo( String cadena){
        this.cadena = cadena
    }

    void run()
    {
        println(cadena)
    }
}

// when working with a script im groovy you cannot use some class with a main method
// because the body of the script internally is wrapped by anothe class which heritages
// from Script class. And this superClass has its own public main method. So it cannot be runned.
// however it can be runned, if we only separate definition of classes in multiple files or remove
// the main method and treat is a a script
class SomeClass {
    static void main(String[] args){
        Hilo h1=new Hilo("Hola")
        Hilo h2=new Hilo("Mundo")
        Hilo h3=new Hilo("como")
        Hilo h4=new Hilo("estas?")

        h1.start()
        h2.start()
        h3.start()
        h4.start()
    }
}