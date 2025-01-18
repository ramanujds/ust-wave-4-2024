public class FileDownloaderWithLambda {

    public static void download(String filename){
        for (int i=0; i<=100; i+=10){
            System.out.println(filename+" : "+i+"% Downloaded");
            try{Thread.sleep(1000);}
            catch (InterruptedException ex){}
        }
        System.out.println(filename+" Download Completed");
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> download("hello.mp4"));
        Thread t2 = new Thread(()->download("welcome.mp4"));

        t1.setName("downloader1");
        t2.setName("downloader2");

        t1.start();
        t2.start();

    }

}
