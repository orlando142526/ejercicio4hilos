
package ejercicio4;


public class Hilo2 extends Thread {
    
 public Hilo2 (String str){
        super(str);
    }
 @Override
    public void run(){
        int carro=0;
        for (int i=1;i<1000;i=i+2){
            carro=carro+i;
        }
        System.out.println("El hilo impares da como resultado:"+carro);
    }
}
