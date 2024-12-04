package LeetCode.Easy;

public class IntersectionOfTwoLinkedLists {
    int val;
    IntersectionOfTwoLinkedLists next;

    public IntersectionOfTwoLinkedLists(int val) {
        this.val = val;
        next = null;
    }
}

class Intersection {
    public IntersectionOfTwoLinkedLists getIntersectionNode(IntersectionOfTwoLinkedLists headA, IntersectionOfTwoLinkedLists headB) {
        if (headA == null || headB == null) {
            return null;
        }
        IntersectionOfTwoLinkedLists tailA = headA;
        IntersectionOfTwoLinkedLists tailB = headB;
        int lengthA = 1;
        int lengthB = 1;
        while (tailA.next != null) {
            tailA = tailA.next;
            lengthA++;
        }
        while(tailB.next != null){
            tailB = tailB.next;
            lengthB++;
        }
        if (tailA != tailB){
            return null;
        }
        IntersectionOfTwoLinkedLists pointA = headA;
        IntersectionOfTwoLinkedLists pointB = headB;
        if (lengthA > lengthB){
            for (int i = 0; i < lengthA - lengthB; i++){
                pointA = pointA.next;
            }
        } else {
            for(int i = 0; i < lengthB - lengthA; i++){
                pointB = pointB.next;
            }
        }
        while(pointA != pointB){
            pointA = pointA.next;
            pointB = pointB.next;
        }
        return pointA;
    }
}
