class timer implements Runnable{
    private int seconds;

    public timer(int seconds) {
        this.seconds = seconds;
    }

    public void run() {
       for(int i = seconds; i >= 0; i--){

           int hours = i/3600;
           int minutes = (i*3600)%60;
           int seconds = i%60;

           String timeFormat = String.format("%02d:%02d:%02d", hours, minutes, seconds);
           System.out.println(timeFormat);

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
       }
    }
}

