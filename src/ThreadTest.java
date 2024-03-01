

public class ThreadTest extends Thread{
    private String text;
    public ThreadTest(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 100; i++){
            printString(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printString(int i){
        System.out.println("Dong text: " + this.text + " => lan [" + i +"]");
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
