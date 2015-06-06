import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class JunitTester {
    Example example = new Example();
    //get the methods from the instance
    //sort them into 3 arrays, depending on their Annotations - Before, Execute, After
    // List methods_before = new list<Method> .. if (annotation ==Before) add
    // Assert the results ( expectations ?= reality)
    // reality - stealing the results
    // if reality != expected ---> break the program
 }
