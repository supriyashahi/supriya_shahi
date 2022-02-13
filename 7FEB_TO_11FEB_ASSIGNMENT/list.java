package febEleve;

import java.util.LinkedList;
import java.util.Scanner;
  
class list {
    public static void main (String[] args) {
        
        
        LinkedList<Integer> list = new LinkedList<Integer>();
  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
  
        // Displaying the list
        System.out.println("LinkedList:\t" + list);

        System.out.println("The last element is removed:\t" + list.removeLast());
          
        System.out.println("Final LinkedList:\t" + list);
          
        System.out.println("The first element is removed:\t" + list.removeFirst());
  
        System.out.println("Final LinkedList:\t" + list);
        sc.close();
    }
}