package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse extends Catalog {

    public void AddGoodsInWarehouseFirst(int values){
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        System.out.println("/////Список товарів на складі/////");
        myHashMap.put("Banana",145);
        myHashMap.put("Strawberry",65);
        myHashMap.put("Orange",500);
        myHashMap.put("Apple",700);
        myHashMap.put("Grapes",450);

        Set<Map.Entry<String,Integer>> set = myHashMap.entrySet();

        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        System.out.println("/////Новий список товарів на складі/////");

        if(myHashMap.containsKey("Apple")) {
            int value = myHashMap.get("Apple");
            myHashMap.put("Apple", value + values);
            System.out.println("Apple стало " + myHashMap.get("Apple"));

        }
    }

    public void AddGoodsInWarehouseSecond(int values2){
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap.put("Banana",145);

        Set<Map.Entry<String,Integer>> set = myHashMap.entrySet();

        if(myHashMap.containsKey("Banana")) {
            int value = myHashMap.get("Banana");
            myHashMap.put("Banana", value + values2);
            System.out.println("Banana стало " + myHashMap.get("Banana"));

        }
    }
    public void AddGoodsInWarehouseThird(int values3){
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap.put("Strawberry",65);

        Set<Map.Entry<String,Integer>> set = myHashMap.entrySet();

        if(myHashMap.containsKey("Strawberry")) {
            int value = myHashMap.get("Strawberry");
            myHashMap.put("Strawberry", value + values3);
            System.out.println("Strawberry стало " + myHashMap.get("Strawberry"));

        }
    }

    public void AddGoodsInWarehouseFourth(int values4){
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap.put("Orange",500);

        Set<Map.Entry<String,Integer>> set = myHashMap.entrySet();

        if(myHashMap.containsKey("Orange")) {
            int value = myHashMap.get("Orange");
            myHashMap.put("Orange", value + values4);
            System.out.println("Orange стало " + myHashMap.get("Orange"));

        }
    }

    public void AddGoodsInWarehouseFifth(int values5){
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap.put("Grapes",450);

        Set<Map.Entry<String,Integer>> set = myHashMap.entrySet();

        if(myHashMap.containsKey("Grapes")) {
            int value = myHashMap.get("Grapes");
            myHashMap.put("Grapes", value + values5);
            System.out.println("Grapes стало " + myHashMap.get("Grapes"));

        }
    }

}
