import Pre_Requisites.NodeD;
import Pre_Requisites.DoublyLinkedList;
import Pre_Requisites.NodeS;

import java.util.Scanner;

public class Q2 extends DoublyLinkedList {
    public static boolean isPrime(int n){
        boolean res=true;
        if (n == 0 || n == 1) {
            res=false;
        }
        else {
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    res=false;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your linked list: ");
        int n=sc.nextInt();
        Q2 list = new Q2();
        System.out.println("Enter the values of the list:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        NodeD temp=list.getHead();
        Q2 newlist=new Q2();
        while(temp!=null){
            if(newlist.isPrime(temp.getData())) {
                newlist.add(temp.getData());
            }
            temp=temp.getNext();
        }
        System.out.println("Resultant list:");
        newlist.display();

    }
}
