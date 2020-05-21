
package ProgramStack;

import ProgramStack.Stack1;
import java.util.List;

/**
 *
 * @author Nih Latulia Rohmah Tiyas
 */
public class Stack2 {
    
    // Memasukkan data objek yang akan di stack 
    public static void main( String[] args ){
        Stack1 stack=new Stack1();
        stack.push("Kardus A");
        stack.push("Kardus B");
        stack.push("Kardus C");
        stack.push("Kardus D");
        stack.push("Kardus E");
        
        int count=stack.count();
        Object object=stack.peek();
        
        // Menampilkan Hasil dari Pengerjaan Stack
        System.out.println("Jumlah  Data Pada Stack : "+count);
        
        System.out.println("----------------------------------------------");
        
        System.out.println("Data Teratas Pada Stack : "+object);
        
        System.out.println("==============================================");
        
        object=stack.pop();
        System.out.println("Objek yang Dikeluarkan (Pop) : "+object);
        
        System.out.println("----------------------------------------------");
        
        count=stack.count();
        System.out.println("Jumlah Data pada Stack setelah Pop : "+count);
        
        System.out.println("----------------------------------------------");
        
        object=stack.peek();
        System.out.println("Data Teratas pada Stack setelah Pop : "+object);
                
        
        
    }
    
}
