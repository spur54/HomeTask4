import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Dima on 30.05.2016.
 */
public class TestStackImpl {
    @Test
    public void testPush1AndPop1(){
        StackImpl stack=new StackImpl();
        stack.push(23);
        Assert.assertEquals(stack.pop(),23);
    }
    @Test(expectedExceptions = Exception.class)
    public void testPush2(){
        StackImpl stack=new StackImpl(1);
        stack.push(23);
        stack.push(11);

    }
    @Test(expectedExceptions = Exception.class)
    public void testPop2(){
        StackImpl stack=new StackImpl();
        stack.pop();
    }
    @Test(expectedExceptions = Exception.class)
    public void testClearnAndPop3(){
        StackImpl stack=new StackImpl(1);
        stack.push(23);
        stack.push(11);
        stack.clear();
        stack.pop();


    }
}


