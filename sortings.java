class sortings {
    public static void main(String[] args) {
        int a[]={6,3,67,1,2};
        int n=a.length;
        selection_sort(a, n);
        System.out.println();
        bubble_sort(a,n);
        System.out.println();
        bubble_sort1(a, n);
        System.out.println();
        insertion_sort(a, n);
    }
    public static void selection_sort(int a[],int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
        }
        //print
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void bubble_sort(int a[],int n){
        for (int i = n-1; i >=0; i--) {
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=a[j];
                }
            }
        }
        //print
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }public static void bubble_sort1(int a[],int n){
        for (int i = n-1; i >=0; i--) {
            int hasswap=0;
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=a[j];
                    hasswap=1;
                }
            }
            if(hasswap==0) break;//If arr is in asc order it will break out here only
        }
        //print
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void insertion_sort(int a[],int n){
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&&a[j-1]>a[j]){
                int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                j--;
            }
        }
        //print
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}