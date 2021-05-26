package Lab3;


import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Goods[] viewGoods = new Goods[]
                {new Goods("Banana","Africa",145,58),
                        new Goods("Strawberry","Poland",65,74),
                        new Goods("Orange","France",500,96),
                        new Goods("Apple","Indonesia",700,105),
                        new Goods("Grapes","Ukraine",450,200)};


        System.out.println();

        System.out.println(viewGoods[0] + "" );
        System.out.println(viewGoods[1] + "" );
        System.out.println(viewGoods[2] + "" );
        System.out.println(viewGoods[3] + "" );

        System.out.println();

        viewGoods[0].setNameProduct("Blueberry");
        System.out.println(viewGoods[1].getNameProduct());
        viewGoods[1].setManufacturerProduct("Italy");
        System.out.println(viewGoods[1].getManufacturerProduct());
        viewGoods[2].setPrice(30);
        System.out.println(viewGoods[2].getPrice());
        viewGoods[3].setCountOfGoods(2);
        System.out.println(viewGoods[3].getCountOfGoods());

        System.out.println();

        Backet basket = new Backet();
        basket.AddToBacket("Banana");
        basket.AddToBacket("Apple");
        basket.AddToBacket("Orange");
        basket.PrintUsersBacket();
        basket.DeleteGoodsFromBacket("Grapes");

        Catalog catalog = new Catalog();
        catalog.AddToCatalog();
        catalog.PrintCatalog();
        catalog.DeleteGoodsFromCatalog("Grapes");

        System.out.println();

        Warehouse warehouse = new Warehouse();
        warehouse.AddGoodsInWarehouseFirst(982);
        warehouse.AddGoodsInWarehouseSecond(77);
        warehouse.AddGoodsInWarehouseThird(4000);
        warehouse.AddGoodsInWarehouseFourth(750);
        warehouse.AddGoodsInWarehouseFifth(573);


    }
}
