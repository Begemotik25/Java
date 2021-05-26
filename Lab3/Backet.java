package Lab3;

import java.util.ArrayList;

public class Backet extends Catalog {

    protected ArrayList<Goods> backet= new ArrayList<>();



    public void AddToBacket(String nameProduct) {
        try {
            System.out.println(nameProduct);
        } catch (Exception ex) {
            System.out.println("This product isn't available!");
        }
    }

    public void DeleteGoodsFromBacket(String nameProduct) {
        catalog.removeIf(goodss -> goodss.getNameProduct().equals(nameProduct));
    }

    public void PrintUsersBacket() {
        System.out.println(backet);
    }

    @Override
    public String toString() {
        return "Backet{" +
                "backet=" + backet +
                '}';
    }
}
