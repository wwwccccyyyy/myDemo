package cn.itcast;

import org.junit.Test;

import java.util.*;

/**
 * 包名:cn.itcast
 * 作者:Old_Wang
 * 创建时间:2018-10-09 16:35
 */
public class CollectionDemo {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();

            if (next.equals("3")) {
                list.add("4");
            }
            System.out.println(next);
        }
//        CopyOnWriteArrayList<String> onWriteArrayList = new CopyOnWriteArrayList<>();
//        onWriteArrayList.addAll(list);
//        for (String s : onWriteArrayList) {
//            if ("2".equals(s)) {
//                onWriteArrayList.add("5");
//            }
//            System.out.println(s);
//        }

    }

    @Test
    public void testMap() {
        Map<String, String> map = new HashMap<>();

        map.put(null, null);
        map.put(null, "aaa");
        map.put("aaa", null);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "......" + entry.getValue());
        }
    }

    @Test
    public void testHashTable() {
        Map map = new Hashtable();
        map.put("1","aaa");
        map.put("2","bbb");
        System.out.println(((Hashtable) map).contains("3"));
        System.out.println(map.containsKey("aaa"));

    }


}
