//collections-framework-It is archiecture to store and manipulate the group of objects

//manipulate-add,remove,edit

//list-1)arraylist,2)linkedlist-singly,doubly,3)vector-stack
//queue-1)priority,dequeue
//set-hashset


//arraylist

//Iterator-It is an object that can be used to loop through collections,

import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        Iterator itr=l.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());
        }
    }
}
