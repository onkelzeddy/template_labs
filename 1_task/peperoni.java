package org.example;

public class peperoni extends pizzaTemplate{

    public peperoni(){
        name = "Peperoni";
        form = "classic";
        ingredients = new String[]{"flour","salt","water","olive oil","tomatoes","black pepper","mozzarella","gaudy", "pepperoni"};
        spicy = true;
        dops = new String[]{""};
    }

    public peperoni(String name,String form,
                  String[] ingredients,
                  boolean spicy,String[] dops){
        super(name,form,
                ingredients,
                spicy, dops);
    }

    @Override
    public String getDops() {
        return "Это ваши Допы! " + super.getDops() ;
    }
}
