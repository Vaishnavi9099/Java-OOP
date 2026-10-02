class Array{
    int sum;
    private int a[];
    Array(int arr[]){
        a=arr;
    }

    void findsum(){
        for( int i=0;i<a.length;i++){
        this.sum=sum+a[i];
    }
        System.out.println("Sum is "+this.sum);
    }
}




public class constructorarray {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50};
        int arr2[]={100,200,300,400};
        Array p1=new Array(arr1);
        p1.findsum();
        Array p2=new Array(arr2);
        p2.findsum();
    }
}
