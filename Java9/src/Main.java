import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        MyClass myClass = new MyClass();
        String tableName="Field1";
        String[] names = new String[]{"field1","field2","field3"};
        classMaker(myClass, tableName, names);
        System.out.println(myClass.getTable());
        System.out.println(myClass.getColumn());
    }

    public static void classMaker(Object object, String tableName, String[] names) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            Annotation annotation = field.getAnnotation(Table.class);
            if(annotation != null){
                field.setAccessible(true);
                field.set(object,tableName);
                field.setAccessible(false);
            }
            annotation = field.getAnnotation(Column.class);
            if(annotation != null){
                field.setAccessible(true);
                field.set(object,names);
                field.setAccessible(false);
            }
        }
    }
}  