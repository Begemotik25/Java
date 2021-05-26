package Lab1_2;

//Створіть просту  ієрархію спадкування, яка відповідає сутностям Користувач (властивості- логін,пароль,емейл,телефон) та Покупець (рахунок, адреса доставки),
// Продавець (№ підрозділу, дата прийняття на роботу, загальна сума торгових бонусів). Продемонструйте перевантаження конструкторів та методів, перевизначення методів,
// особливості роботи конструкторів при спадкуванні.
class User
{
    String login;
    String password;
    String email;
    int number;

    public User(){

        this.login="login";
        this.password="password";
        this.email= "email";
        this.number=0;
        System.out.println("Constr user 1");
    }
    public User(String login,String password,String email,int number)
    {
        this.login=login;
        this.password=password;
        this.email=email;
        this.number=number;
        System.out.println("Constr user 2");
    }
    public void show()
    {
        System.out.println("Login: "+login+"Password"+password+"Email"+email+"Number"+number);
    }

    public  void show(int number) {
        System.out.println("login: %s \\n\"+login +password:"+password+"email"+email+"number"+number);
    }
}

class Сustomer extends User
{
    int score;
    String adress;
    public Сustomer()
    {
        //super();
        this.score=0;
        this.adress="";
        System.out.println("Constr customer 1");

    }
    public Сustomer(String login,String password,String email,int number,int score,String adress)
    {
        super(login,password,email,number);
        this.score=score;
        this.adress=adress;
        System.out.println("Constr customer 2");
    }

    @Override
    public void show(){

        System.out.print("HELLO!");
    }

}

class Seller extends User
{
    int department_number;
    int data;
    int sum_bonus;

    public Seller()
    {
        super();
        this.department_number=0;
        this.data=0;
        this.sum_bonus=0;
        System.out.println("Constr Seller 1");

    }
    public Seller(String login,String password,String email,int number, int department_number,int data,int sum_bonus)
    {
        super(login,password,email,number);
        this.department_number=department_number;
        this.data=data;
        this.sum_bonus=sum_bonus;

        System.out.println("Constr Seller 2");

    }

    public static void main(String[] args) {
        User n=new User();
        n.show();
        Сustomer c=new Сustomer();
        c.show();
        Seller s=new Seller();
        s.show();
    }
}





