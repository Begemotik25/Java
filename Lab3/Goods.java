package Lab3;
import java.util.*;

//Створіть модель яка б відображала роботу інтернет-магазину- клієнт має можливість зробити сформувати замовлення,
// яке складається тільки з товарів, які є у магазині. При цьому він має можливість пошукати товар за назвою та виробником,
// редагувати свої замовлення до моменту їх формування та відгрузки. Якщо товару на складі не вистачає, клієнт в момент додавання
// товару до замовлення  отримує відповідне повідомлення. Продавець має можливість продивитись усі замовлення, сформувати їх з товарів
// на складі та відправити замовникам. Модель повинна давати можливість додавати товар на склад та формувати список товарів на складі.
// Клієнт може продивитись всі свої замовлення та їх стан.


public class Goods {
    protected String nameProduct;
    protected String manufacturerProduct;
    protected int countOfGoods;
    protected int price;

    public Goods(){}

    public Goods(String nameProduct,String manufacturerProduct,int countOfGoods,int price) {
        this.nameProduct=nameProduct;
        this.manufacturerProduct=manufacturerProduct;
        this.countOfGoods=countOfGoods;
        this.price=price;
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public void setNameProduct(String nameProduct){
        this.nameProduct=nameProduct;
    }

    public String getManufacturerProduct(){
        return manufacturerProduct;
    }

    public void setManufacturerProduct(String manufacturerProduct){
        this.manufacturerProduct=manufacturerProduct;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getCountOfGoods(){
        return countOfGoods;
    }

    public void setCountOfGoods(int countOfGoods){
        this.countOfGoods=countOfGoods;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "nameProduct='" + nameProduct + '\'' +
                ", manufacturerProduct='" + manufacturerProduct + '\'' +
                ", countOfGoods=" + countOfGoods +
                ", price=" + price +
                '}';
    }
}
