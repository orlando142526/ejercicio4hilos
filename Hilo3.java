
package ejercicio4;

public class Hilo3 extends Thread{
    public Hilo3(String str) {
        super(str);
    }
    @Override
    public void run() {
        int carro = 0;
        String dos="2", tres="3", compara="";
        for (int i = 0; i < 1000; i++) {
            compara=String.valueOf(i);
            if (compara.endsWith(dos)){
                carro=carro+i;
            }
            if (compara.endsWith(tres)){
                carro=carro+i;
            }
        }
        System.out.println("El hilo 2 y 3 da como resultado:"+carro);
    }
}
