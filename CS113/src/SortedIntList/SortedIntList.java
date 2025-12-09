package SortedIntList;

/**
 *
 * @author Nicole
 */
public class SortedIntList extends IntList{
    public SortedIntList(int size){
      super(size);
   }
   
   public void add(int value){
      super.add(value);
      for(int i=numElements-1; i>=1; i--) {
         if(list[i]<list[i-1]) {
            int temp = list[i];
            list[i] = list[i-1];
            list[i-1] = temp;
         } 
         else {
            break;
         }
      }
   }
   
   public SortedIntList merge(SortedIntList l){
       SortedIntList nList = new SortedIntList(super.list.length +  l.list.length);
       for (int a=0; a<super.list.length; a++){
           nList.add(super.list[a]);
           nList.add(l.list[a]);
       }
       return nList;
   }
}
