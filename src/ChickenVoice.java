public class ChickenVoice {

    public static void goChicken() {
        for (int i = 0; i < 9; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            Print.ln("Chicken!");
        }
    }
}
