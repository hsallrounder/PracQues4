package Pre_Requisites;

interface LL {
    default void add(int val){}
    default void insertAtBeginning(int val){}
    default void insert(int pos,int val){}
    default void delete(int val){}
    default void deleteAtIndex(int ind){}
    default void display(){}
    default void displayRev(){}
}
