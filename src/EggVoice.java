class EggVoice extends Thread {
    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            Print.ln("Egg!");
        }
    }
}