import java.util.ArrayList;
import java.util.HashMap;

@ClassInfo(author = "Rolev", relatedClasses = 
    { ArrayList.class, HashMap.class, Object.class })
public class Example {
    private int a = 5;
    private int MyPrivateFunction()
    {
        int very_private = 5;
        int you_shouldnt_be_here = 6;
        return 50;
    }
}