/**
 * Created by Dima on 30.05.2016.
 */
public class StackImpl implements Stack {
    private Object[] stackMass;
    private int indexOfEndStack;

    public StackImpl(int size) {
        this.stackMass=new Object[size];
        indexOfEndStack=0;
    }

    public StackImpl() {
        this.stackMass=new Object[5];
        indexOfEndStack=0;
    }

    @Override
    public void push(Object o) {
        if(indexOfEndStack==stackMass.length){
            try {
                throw new StackException();
            } catch (StackException e) {
                e.printStackTrace();
            }
        }
        stackMass[indexOfEndStack++]=o;
    }

    @Override
    public Object pop()  {
        if(indexOfEndStack==0){
            try {
                throw new StackException("Stack is empty");
            } catch (StackException e) {
                e.printStackTrace();
            }
        }
        Object o=stackMass[indexOfEndStack-1];
        stackMass[(indexOfEndStack--)-1]=null;
        return o;
    }

    @Override
    public void clear() {
        for(int i=0;i<stackMass.length;i++){
            stackMass[i]=null;
        }
        indexOfEndStack=0;
    }

    @Override
    public void print() {
        for(int i=0;i<indexOfEndStack;i++){
            System.out.println(stackMass[i]+" ");
        }
    }
}

