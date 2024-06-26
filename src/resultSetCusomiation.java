
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static Map<String, Method> getterMap;

    // static {
    //     try {
    //         getterMap = Arrays.stream(Introspector.getBeanInfo(ResultSet.class).getPropertyDescriptors())
    //                 .filter(pd -> pd.getReadMethod() != null && !"class".equals(pd.getName()))
    //                 .collect(Collectors.toMap(pd -> pd.getName().toLowerCase(), PropertyDescriptor::getReadMethod));
    //     } catch (IntrospectionException e) {
    //         getterMap = Collections.emptyMap();
    //     }
    // }

    // public static void main(String[] args) {
    //     ResultSet resultSet = new ResultSet("lorem", "ipsum", "dolor", "sit amet");
    //     List<String> list = Arrays.asList("field1", "Field4", "Field3", "Field2", "field9");

    //     List<String> list1 = list.stream()
    //             .map(String::toLowerCase)
    //             .filter(getterMap::containsKey)
    //             .map(getterMap::get)
    //             .map(getter -> invokeGetter(getter, resultSet))
    //             .collect(Collectors.toList());

    //     System.out.println(list1);
    // }

    // private static String invokeGetter(Method getter, ResultSet rs) {
    //     try {
    //         return getter.invoke(rs).toString();
    //     } catch (ReflectiveOperationException e) {
    //         throw new RuntimeException(e);
    //     }
    // }
}