package org.example;

public class julien extends pizzaTemplate {

    public julien(){
        name = "Julien";
        form = "wrapped";
        ingredients = new String[]{"flour","salt","water","olive oil","ketchup","black pepper","mozzarella","milk", "shampinion"};
        spicy = true;
        dops = new String[]{""};
    }

    public julien(String name,String form,
                  String[] ingredients,
                  boolean spicy,String[] dops){
        super(name,form,
                ingredients,
                spicy, dops);
    }

    public void addDops(String dop){
        String[] oldDops = this.dops;
        this.dops = new String[oldDops.length + 1];
        for(int i = 0;i < oldDops.length + 1;i++){
            if(i < oldDops.length) {
                this.dops[i] = oldDops[i];
            }
            else {
                this.dops[i] = dop;
            }
        }
    }

}
