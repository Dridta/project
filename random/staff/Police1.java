package projects.random.staff;

public class Police1 extends Cars1 {
    public void isCarGo() {
        System.out.println(" Машина номер: " + getNumber() + " выехала" + ". " + "Количество персонала: "
                + getCarNumberOfPeople1());
    }

    public void isCarGoExtra() {
        System.out.println("Машина класса:  " + getOperation1() + "; " + " Машина номер 1: " + getNumber1() + "; "
                + " выехала" + "Машина класса 2:  " + getOperation2() + "; " + " Машина номер 2: " + getNumber2()
                + " выехала");
    }
}