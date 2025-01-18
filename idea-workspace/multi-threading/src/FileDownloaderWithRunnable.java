public class FileDownloaderWithRunnable implements Runnable {

    private String filename;
    public FileDownloaderWithRunnable(String filename){
        this.filename=filename;
    }

    public void download(){
        for (int i=0; i<=100; i+=10){
            System.out.println(filename+" : "+i+"% Downloaded");
            try{Thread.sleep(1000);}
            catch (InterruptedException ex){}
        }
        System.out.println(filename+" Download Completed");
    }



    @Override
    public void run() {
        download();
    }
}


