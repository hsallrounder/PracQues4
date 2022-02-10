import Pre_Requisites.NodeS;
import Pre_Requisites.SinglyLinkedList;

import java.util.Scanner;

public class Q1 extends SinglyLinkedList {
    public boolean isSDupli(int n){
        NodeS temp=getHead();
        while(temp!=null){
            if(temp.getData()==n){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your linked list: ");
        int n=sc.nextInt();
        Q1 list = new Q1();
        System.out.println("\nEnter the values of the list:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        NodeS temp=list.getHead();
        Q1 newlist=new Q1();
        while(temp!=null){
            if(!newlist.isSDupli(temp.getData())) {
                newlist.add(temp.getData());
            }
            temp=temp.getNext();
        }
        System.out.println("Resultant list:");
        newlist.display();
    }
}
