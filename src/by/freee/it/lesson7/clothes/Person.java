package by.freee.it.lesson7.clothes;


import by.freee.it.lesson7.clothes.jacket.IJacket;
import by.freee.it.lesson7.clothes.pants.IPants;
import by.freee.it.lesson7.clothes.shoes.IShoes;

public class Person {
    String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Person (){}

    public Person(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public void putOnAll (){
        System.out.println(name);
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }
    public void putOffAll (){
        System.out.println(name);
        jacket.putOff();
        pants.putOff();
        shoes.putOff();
    }

}
