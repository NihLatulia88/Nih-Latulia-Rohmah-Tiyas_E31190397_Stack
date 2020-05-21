
package ProgramStack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nih Latulia Rohmah Tiyas
 */
public class Stack1 {
    
    // Array List dugunakan untuk menyimpan objek yang dimasukkan ke stack
    // CurrentIndex digunakan untuk menandai index teratas pada list,
    // Index teratas = 0, jadi variabel awal bernilai -1
    private List<Object> list=new ArrayList<Object>();
    private int currentIndex=-1;
    
    // untuk menambah data ke dalam stack ke dalam array list
    // nilai currenIndex dinaikkan 1
    public void push(Object object){
        list.add(object);
        currentIndex++;
    }
    
    
    // pop digunakan untuk membuang data karena dalam stack yang akan dikeluarkan 
    // adalah data teratas, maka perlu untuk mengetahui index teratas dari list
    // setelah data dibuang, nilai dari currentIndex dikurangi 1
    public Object pop(){
        Object object=list.remove(currentIndex);
        currentIndex--;
        return object;
    }
    
    // Untuk mengetahui jumlah data pada stack
    public int count(){
        return list.size();
    }
    
    // Untuk melihat data teratas pada stack
    public Object peek(){
        return list.get(currentIndex);
    }
    
    // Untuk menghapus atau menghilangkan seluruh data pada stack 
    // dan mengembalikan index ke nilai semula
    public void clear(){
        list.clear();
        currentIndex=-1;
    }
}