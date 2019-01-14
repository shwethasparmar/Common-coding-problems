import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class ListNode {
    ListNode next;
    int data;
    ListNode(int data){
        this.data = data;
    }
}

class Main {
    public static void main(String[] args) {
//        ListNode ln1 = new ListNode(1);
//        ListNode ln2 = new ListNode(4);
//        ListNode ln3 = new ListNode(5);
//        ListNode ln4 = new ListNode(1);
//        ListNode ln5 = new ListNode(3);
//        ListNode ln6 = new ListNode(4);
//        ListNode ln7 = new ListNode(2);
//        ListNode ln8 = new ListNode(6);
//
//        ln1.next = ln2;
//        ln2.next = ln3;
//
//        ln4.next = ln5;
//        ln5.next = ln6;
//
//        ln7.next = ln8;
//
//        ListNode[] lists = new ListNode[3];
//        lists[0] = ln1;
//        lists[1] = ln4;
//        lists[2] = ln7;
//
//        mergeKLists(lists);
    }

//    public static ListNode mergeKLists(ListNode[] lists) {
//        ListNode result = new ListNode(0);
//        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
//            @Override
//            public int compare(ListNode l1, ListNode l2){
//                if(l1.data == l2.data){
//                    return 0;
//                } else if (l1.data > l2.data){
//                    return 1;
//                } else return -1;
//            }
//        });
//
//        for(ListNode node: lists){
//            pq.add(node);
//
//        }
//
//        ListNode tail = result;
//        while(!pq.isEmpty()){
//
//            tail = pq.poll();
//            System.out.println("Tail data"+tail.data);
//            tail = tail.next;
//
//            if(tail!= null){
//                pq.add(tail);
//            }
//        }
//
//
//        return result.next;
//    }


}




