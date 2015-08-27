package Auxiliar;

import GUI.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadHora implements Runnable{

    private Thread clockThread = null;

    public void start() {
        if (clockThread == null) {
            clockThread = new Thread(this, "Clock");
            clockThread.start();
        }
    }
    public void stop() {
        clockThread = null;
    }
    public void run() {
        Thread myThread = Thread.currentThread();
       
        while (clockThread == myThread) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
                Constantes.hora = sdf.format(new Date());
                Principal.LabelHora.setText(Constantes.hora);
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
