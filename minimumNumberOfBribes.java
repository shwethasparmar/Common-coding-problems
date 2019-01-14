public class Main {
    static void minimumNumberBribes(int[] q) {
        boolean flag = false;
        int minimumNumberBribe = 0;
        for(int i=0; i<q.length; i++){
            if(q[i]-1-i > 2){
                System.out.println("Too chaotic");
                return;
            }
        }
        for(int i=0; i<q.length; i++){
            for(int j=0; j<q.length-1; j++){
                if(q[j] > q[j+1]) {
                    flag = true;

                    int temp = q[j];
                    q[j] = q[j + 1];
                    q[j + 1] = temp;

                    minimumNumberBribe += 1;


                }
            }
            if(!flag){
                break;
            } else {
                flag = false;
            }

        }
        System.out.println(minimumNumberBribe);
    }
    public static void main(String[] args){
        int[] a = new int[]{4, 3, 1, 2};
        minimumNumberBribes(a);

    }
}