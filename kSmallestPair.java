import java.util.*;

class Main{
    public static void main(String[] args){

        int[] num1 = {1, 2, 3};
        int[] num2 = {1, 2, 3};
        int k = 2;
        List<int[]> res = new ArrayList<>();
        res = kSmallestPairs(num1, num2, k);
        for(int i=0; i<res.size(); i++){
            System.out.println(res.get(i)[0]);
            System.out.println(res.get(i)[1]);

        }
    }
    public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
        List<int[]> result = new ArrayList<>();

        if(nums1.length == 0 || nums2.length==0 || k<0){
            return result;
        }

        for(int i=0; i<nums2.length; i++){
            pq.offer(new Tuple(0, i, nums1[0]+ nums2[i]));
        }

        for(int j=0; j<Math.min(k, nums1.length * nums2.length); j++){
            Tuple t = pq.poll();
            result.add(new int[]{nums1[t.x], nums2[t.y]});

            if(t.x == nums1.length-1) continue;

            pq.offer(new Tuple(t.x+1, t.y, nums1[t.x+1]+nums2[t.y]));

        }


        return result;
    }
}


class Tuple implements Comparable<Tuple> {
    int x, y, val;
    public Tuple(int x, int y, int val){
        this.x = x;
        this.y = y;
        this.val = val;
    }

    @Override
    public int compareTo(Tuple that){
        return this.val - that.val;
    }
}