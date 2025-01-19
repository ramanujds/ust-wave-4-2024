public class LinearSearch {

    int linearSearch(int []arr, int item){
        for (int i=0; i<arr.length; i++){
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ex){

            }
            if (arr[i]==item){
                return i;
            }
        }
        return -1;
    }

}
