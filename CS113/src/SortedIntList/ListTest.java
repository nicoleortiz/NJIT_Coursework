package SortedIntList;

/**
 *
 * @author Nicole
 */
// ***************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some
// ints in it, and prints the list.
//
// ***************************************************************
public class ListTest{
    public static void main(String[] args){
        //IntList Test
        IntList myList = new IntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        System.out.println(myList);
        
        //SortedIntList Test
        SortedIntList myList2 = new SortedIntList(5);
        myList2.add(6);
        myList2.add(8);
        myList2.add(3);
        myList2.add(1);
        myList2.add(4);
        System.out.println(myList2);
        
        //Merge List Test
        System.out.println(myList2.merge(myList2));
    }
}
