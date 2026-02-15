// #6 DYNAMIC ARRAY

// resizes on command, but internally it manages a fixed-size memory block that occasionally gets replaced with a bigger (or sometimes smaller) one

// when you expand past capacity:
// a new, bigger block of memory is allocated
// elements are copied over

// ArrayList in Java
// Vector in C++
// Array in JavaScript
// List in Python

// pros:
// 1. random access of elements - O(1)
// 2. good locality of reference and data cache utilisation
// 3. easy to insert/delete at the end

// cons:
// 1. uses more memory than linked lists
// 2. shifting elements is time consuming O(n)
// 3. expanding/shrinking the array is time consuming - O(n)

class DynamicArray{
    
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }
        for(int i=size; i>index;i--){
            array[i] = array[i-1]; // moves filled elements (array[i-1]) to the right by 1 (array[i])
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data){
        for(int i=0;i<size;i++){
            if(array[i] == data){
                for(int j=0; j<(size-i-1);j++){
                    array[i+j] = array[i+j+1];
                }
                array[size - 1] = null;
                size--;
                if(size<=(int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data){
        for(int i=0;i<size;i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public void grow(){
        int newCap = (int)(capacity * 2);
        Object[] newArray = new Object[newCap];

        for(int i=0;i<size;i++){
            newArray[i] = array[i];
        }
        capacity = newCap;
        array = newArray;
    }

    public void shrink(){
        int newCap = (int)(capacity / 2);
        Object[] newArray = new Object[newCap];

        for(int i=0;i<size;i++){
            newArray[i] = array[i];
        }
        capacity = newCap;
        array = newArray;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public String toString(){
        String str = "";

        // for(int i=0;i<size;i++){
        for(int i=0;i<capacity;i++){ // to show the filled and unfilled slots
            str += array[i] + ", ";
        }
        if(str != ""){
            str = "[" + str.substring(0, str.length() - 2) + "]"; // removes the trailing ', '
        }
        else{
            str = "[]";
        }
        return str;
    }
}

public class dynamic_array {
    public static void main(String[] args){

        DynamicArray dynarr = new DynamicArray();

        System.out.println("default capacity of dynamic array is: " + dynarr.capacity);

        DynamicArray dynarr1 = new DynamicArray(5);

        System.out.println("default capacity of dynamic array is: " + dynarr1.capacity);

        dynarr1.add("Apple");
        dynarr1.add("Banana");
        dynarr1.add("Durian");

        System.out.println("elements in dynarr1: " + dynarr1);
        System.out.println("size of dynarr1: " + dynarr1.size);
        System.out.println("capacity of dynarr1: " + dynarr1.capacity);
        System.out.println("is dynarr1 empty? " + dynarr1.isEmpty());

        dynarr1.insert(2, "Coconut");

        System.out.println("after 1 insertion");
        System.out.println("elements in dynarr1: " + dynarr1);
        System.out.println("size of dynarr1: " + dynarr1.size);
        System.out.println("capacity of dynarr1: " + dynarr1.capacity);
        System.out.println("is dynarr1 empty? " + dynarr1.isEmpty());

        dynarr1.delete("Banana");

        System.out.println("after 1 deletion");
        System.out.println("elements in dynarr1: " + dynarr1);
        System.out.println("size of dynarr1: " + dynarr1.size);
        System.out.println("capacity of dynarr1: " + dynarr1.capacity);
        System.out.println("is dynarr1 empty? " + dynarr1.isEmpty());

        String ele = "Coconut";
        System.out.println("index of " + ele + " in dynarr1: " + dynarr1.search(ele));

        dynarr.add("Anteater");
        dynarr.add("Baboon");
        dynarr.add("Cheetah");
        dynarr.add("Donkey");
        dynarr.add("Elephant");
        dynarr.add("Firefly");
        dynarr.add("Giraffe");
        dynarr.add("Hyena");
        dynarr.add("Iguana");
        dynarr.add("Jackal");
        dynarr.add("Kangaroo");
        dynarr.add("Leopard");

        System.out.println("adding 12 animals to dynarr to grow it");
        System.out.println("elements in dynarr: " + dynarr);
        System.out.println("size of dynarr: " + dynarr.size);
        System.out.println("capacity of dynarr: " + dynarr.capacity);
        System.out.println("is dynarr empty? " + dynarr.isEmpty());

        dynarr.delete("Iguana");
        dynarr.delete("Donkey");
        dynarr.delete("Anteater");
        dynarr.delete("Leopard");
        dynarr.delete("Elephant");
        dynarr.delete("Giraffe");
        dynarr.delete("Firefly");
        dynarr.delete("Hyena");
        dynarr.delete("Baboon");
        dynarr.delete("Jackal");

        System.out.println("removing 10 animals to dynarr to shrink it");
        System.out.println("elements in dynarr: " + dynarr);
        System.out.println("size of dynarr: " + dynarr.size);
        System.out.println("capacity of dynarr: " + dynarr.capacity);
        System.out.println("is dynarr empty? " + dynarr.isEmpty());
    }
}
