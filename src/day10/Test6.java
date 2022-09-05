package day10;

/**
 * @author lt
 * @Description Map、HashMap、Hashtable、TreeMap
 * @data 7/28 - 16:00
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map用于保存具有映射关系的数据，因此Map集合里保存着两组值，一组值用于保存Map里的Key,另一组用于保存Map里的Value。
 * Map里的key和value都可以是任何引用类型的数据。
 * Map的key不允许重复，即同一个Map对象的任何两个key通过equals方法比较总是返回false。
 * Key和Value之间存在单向一对一关系，即通过指定的Key总能找到唯一的，确定的Value。
 */

/**
 * HashMap & Hashtable
 * HashMap和Hashtable是Map接口的两个典型实现类
 * 区别：
 *      · Hashtable是一个古老的Map实现类，不建议使用。
 *      · Hashtable是一个线程安全的Map实现，但HashMap是线程不安全的。
 *      · Hashtable不允许使用null作为key和value，而HashMap可以。
 * 与HashSet集合不能保证元素的顺序一样，HashTable、HashMap也不能保证其中key-value的顺序
 * Hashtable、HashMap判断两个Key相等的标准是：两个Key通过equals方法返回true，HashCode值也相等。
 * Hashtable相等的标准是：两个Value通过equalHashMap判断两个Values方法返回true
 */

/**
 * TreeMap存储Key-Value对时，需要根据Key对key-value对进行排序。TreeMap可以保证所有的Key-Value对处于有序状态。
 * TreeMap的Key排序：
 *      · 自然排序:TreeMap的所有Key必须实现Comparable接口，而且所有的Key应该是同一个类的对象，否则将会抛出ClassCastException。
 *      · 定制排序(了解):创建TreeMap时，传入一个Comparator对象，该对象负责对TreeMap中的所有key进行排序。此时不需要Map的key实现Comparable接口。
 */
public class Test6 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("b",1);//添加
        map.put("c",2);
        map.put("e",3);
        System.out.println(map);//{b=1, c=2, e=3}

        System.out.println(map.get("b"));//1,取值

        map.remove("c");//移除

        System.out.println(map.size());//2

        System.out.println(map.containsKey("a"));//false,判断是否包含key
        System.out.println(map.containsValue(10));//false,判断是否包含value

//        map.clear();

        Set<String> keys = map.keySet();//获取key的集合
        map.values();//获取所有value值
        //遍历map集合,通过map.keySet()
        for(String key : keys){
            System.out.println("key:" + key + ",value:" + map.get(key));
        }
        System.out.println("------------------------");

        //通过map.entrySet()遍历map集合
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for (Map.Entry<String,Integer>en : entrys){
            System.out.println("key:" + en.getKey() + ",value:" + en.getValue());
        }

        //TreeMap的自然排序是字典排序
        Map<Integer,String> map1 = new TreeMap<Integer,String>();
        map1.put(4,"a");
        map1.put(2,"a");
        map1.put(3,"a");
        map1.put(1,"a");
        System.out.println(map1);//{1=a, 2=a, 3=a, 4=a}

        Map<String,String> map2 = new TreeMap<String,String>();
        map2.put("b","b");
        map2.put("c","c");
        map2.put("d","d");
        map2.put("a","a");
        map2.put("ab","ab");
        map2.put("1","ab");
        System.out.println(map2);//{a=a, ab=ab, b=b, c=c, d=d}

    }
}
