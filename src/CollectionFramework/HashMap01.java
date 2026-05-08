package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args){
        /*
        {1=Rahul, 2=Aditya, 3=Rohan}
        1. hashMap.put(Object);
         */
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Rahul");
        hashMap.put(2,"Aditya");
        hashMap.put(3,"Rohan");
        System.out.println(hashMap);

        //2. hashMap.get(key)
        String student = hashMap.get(3);
        System.out.println(student);

        //3. if not present gives null
        String student2 = hashMap.get(100);
        System.out.println(student2);

        //4. hashMap.containsKey() hashMap.containsValue()
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsValue("Rahul"));

        //5. How to set loop in HashMap? use hashMap.keySet()  => Set = key then for loop
//        Set<Integer> keys =hashMap.keySet();
        for(int i:hashMap.keySet()){
            System.out.println(hashMap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() +": "+entry.getValue());
        }


    }
}
