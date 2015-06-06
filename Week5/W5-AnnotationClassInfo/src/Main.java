import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Example example = new Example();
        for (Annotation a : example.getClass().getAnnotations()) {
            System.out.println(a.toString());
        }
        Example obj = new Example();
        // How to get a private int
        Field m = obj.getClass().getDeclaredField("a");
        m.setAccessible(true);
        String iWantThisInt = m.get(obj).toString(); 
        System.out.print(iWantThisInt);
        
        // How to get a private function
        
        Example obj2 = new Example();
        Method met = obj2.getClass().getDeclaredMethod("MyPrivateFunction");
        met.setAccessible(true);
        Integer iWantThisMethod = (Integer) met.invoke(obj2);
        System.out.print(iWantThisMethod);
    }
}