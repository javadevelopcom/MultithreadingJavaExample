public class Main {

    static EggVoice sideThread;

    public static void main(String[] args) {

        sideThread = new EggVoice();

        Print.ln("WHICH CAME FIRST, THE CHICKEN OR THE EGG?");
        Print.ln("GETTING THE DISPUTE STARTED: ");

        sideThread.start();
        ChickenVoice.goChicken();

        if (sideThread.isAlive()) {                             // opponent is on
            try {
                sideThread.join();                              // waiting for opponent answer
            } catch (InterruptedException e) {
            }
            Print.ln("the egg came first");

        } else {                                                // opponent is finished
            Print.ln("the chicken came first not the egg");
        }
        Print.ln("The dispute is over!");
    }
}