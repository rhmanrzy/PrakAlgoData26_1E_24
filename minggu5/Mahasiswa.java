package minggu5;

public class Mahasiswa {

    int maxUTS(int arr[], int l, int r){
        if(l == r){
            return arr[l];
        }

        int mid = (l + r) / 2;

        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);

        if(lmax > rmax){
            return lmax;
        } else{
            return rmax;
        }
    }

    int minUTS(int arr[], int l, int r){
        if(l == r){
            return arr[l];
        }

        int mid = (l + r) / 2;

        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);

        if(lmin < rmin){
            return lmin;
        } else{
            return rmin;
        }
    } 

    double rataUAS(int arr[]){
        double total = 0;

        for(int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }

        return total / arr.length;
    }
}