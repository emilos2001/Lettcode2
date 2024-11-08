package LeetCode.Easy;

public class RemoveDublicatesInSortedList {
    int val;
    RemoveDublicatesInSortedList next;
    public RemoveDublicatesInSortedList(int val) {
        this.val = val;
    }
    public RemoveDublicatesInSortedList(int val, RemoveDublicatesInSortedList next) {
        this.val = val;
        this.next = next;
    }
}
class Delete{
    public static void printList(RemoveDublicatesInSortedList head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static RemoveDublicatesInSortedList deleteDuplicates(RemoveDublicatesInSortedList head){
        RemoveDublicatesInSortedList res = head;
        while (head != null && head.next != null){
            if (head.val == head.next.val){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RemoveDublicatesInSortedList node1 = new RemoveDublicatesInSortedList(1);
        RemoveDublicatesInSortedList node2 = new RemoveDublicatesInSortedList(1);
        RemoveDublicatesInSortedList node3 = new RemoveDublicatesInSortedList(3);
        node1.next = node2;
        node2.next = node3;
        System.out.println("Original node");
        printList(node1);
        System.out.println("remove duplicates");
        RemoveDublicatesInSortedList res = deleteDuplicates(node1);
        printList(res);
    }
}
