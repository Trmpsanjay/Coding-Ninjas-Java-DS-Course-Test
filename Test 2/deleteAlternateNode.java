
/*
 class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
} */
public class Solution {
	public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp=head;
        if(head==null || head.next==null)
            return;
       while(head.next!=null){
             if(head.next.next!=null){
             	head.next=head.next.next;
             	head=head.next;
             }else{
                 head.next=null;
             }
         }

	}
}
