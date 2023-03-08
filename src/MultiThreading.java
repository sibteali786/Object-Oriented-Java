public class MultiThreading {
    public static void main(String[] args){

        for (int i = 1; i <= 5; i++) {
            MultiThreadingThing myThing = new MultiThreadingThing(i);
            myThing.start();
        }

    }
}
