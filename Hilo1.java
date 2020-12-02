
package ejercicio4;


public class Hilo1 extends Thread{
    
   public Hilo1 (String str){
        super(str);
        }
   @Override
    public void run(){
        int carro=0;
        for (int i=2;i<1000;i=i+2){
            carro=carro+i;
        }
        System.out.println("El hilo pares da como resultado:"+carro);
    }
}

