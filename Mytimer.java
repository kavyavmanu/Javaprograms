public class MyTimer extends Thread{
  public static void main(String[] args) {
    MyTimer tm=new MyTimer();
    tm.start();
  }

    @Override
    public void run() {
        this.runTimer();
    }

    public void runTimer(){
        int i = 1;
         while (i<60){
          System.out.print("\r"+i);
          try {
            i++;
            
            Thread.sleep(1000L); 

           }
           catch (InterruptedException e) {
              System.out.println("There is some InterruptedException here");
           }
         }
    }
  }
