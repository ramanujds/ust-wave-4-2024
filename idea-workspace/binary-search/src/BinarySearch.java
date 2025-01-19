public class BinarySearch {

    int binarySearch(int []arr, int item){
        int p = 0;
        int r = arr.length-1;
        int q;

        while (p <= r){
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ex){

            }
            q=(p+r)/2;
            if (arr[q] == item){
                return q;
            }
            else if (arr[q]>item){
                r = q-1;
            }
            else {
                p = q+1;
            }
        }
        return -1;
    }

}
