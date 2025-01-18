public class FileDownloader extends Thread {

    private String filename;
    public FileDownloader(String filename){
        this.filename=filename;
    }

    public void download(){
        for (int i=0; i<=100; i+=10){
            System.out.println(filename+" : "+i+"% Downloaded");
            try{sleep(1000);}
            catch (InterruptedException ex){}
        }
        System.out.println(filename+" Download Completed");
    }

    @Override
    public void run() {
        download();
    }
}


