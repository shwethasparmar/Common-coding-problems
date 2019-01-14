public class Main {
    static int[] rotLeft(int[] a, int d) {
        int temp;
        int arrayLength = a.length;
        for(int i=0; i<d; i++){
            temp = a[0];
            for(int j=1; j< a.length; j++){
                a[j-1] = a[j];
            }
            a[arrayLength-1] = temp;
        }

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        return a;
    }
    public static void main(String[] args){
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] result = rotLeft(a, 2);

    }
}