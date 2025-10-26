import java.util.ArrayList;

public class floorCeil {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int n=a.length;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(floor(a, n, 25));
        ans.add(ceil(a, n, 25));
        System.out.println(ans);
    }
    public static int floor(int a[],int n,int x){
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]<=x){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return hi;//floor always lands on hi so no need to store them in an ans variable
    } 
    public static int ceil(int a[],int n,int x){
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]>=x){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;//ceil always lands on lo so no need to store them in an ans variable
    } 
}
