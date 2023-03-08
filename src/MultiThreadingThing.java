public class MultiThreadingThing extends Thread{
    private int threadNumber;
    public MultiThreadingThing(int threadNum){
        this.threadNumber = threadNum;
    }
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i+" From thread number "+ this.threadNumber);
            if(threadNumber == 3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
