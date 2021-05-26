package Lab3;

import java.util.ArrayList;
import java.util.Objects;

public class Catalog extends Goods {
    protected ArrayList<Goods> catalog= new ArrayList<>();

    public void AddToCatalog(Goods ... goods) {
        for(Goods goodss: goods){
            catalog.add(goodss);
        }
    }
    public void PrintCatalog() {
        System.out.println("Catalog" + catalog);
    }

    public void DeleteGoodsFromCatalog(String name) {
        catalog.removeIf(goodss -> goodss.getNameProduct().equals(name));
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalog=" + catalog +
                '}';
    }
}
