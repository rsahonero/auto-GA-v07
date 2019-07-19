package testingui.diplomadoumss.org.core;

public class WaitMethods {

public static void waitJava(int a){
    try {
        Thread.sleep(a);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
