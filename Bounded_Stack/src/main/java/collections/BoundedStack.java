/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

/**
 *
 * @author michelle
 */
public class BoundedStack extends Stack{
    private static final int DEFAULT_CAPACITY = 10;
    private final int capacity;
    
    public BoundedStack(){
        super();
        capacity = DEFAULT_CAPACITY;
    }
    
    public BoundedStack(int capacity){
        super();
        if(capacity <= 0){
            throw new IllegalArgumentException("Stack capacity cannot be less than 1");
        }
        this.capacity = capacity;
    }
    
    public boolean isFull(){
        return size >= capacity;
    }
    
    @Override
    public boolean push(int value) {
        // Add logic specific to this structure
        if(isFull()){
            throw new StackFullException();
        }
        // Reuse existing superclass methods where possible
        return super.push(value);
    }
    
    @Override
    public void printCelebrate(){
        // Block the original version of the method by
        // a) Overriding the existing one in the superclass
        // b) Throwing an exception in the new version to indicate that feature isn't available here
        throw new UnsupportedOperationException("Feature not available in a Bounded Stack");
    }
}
