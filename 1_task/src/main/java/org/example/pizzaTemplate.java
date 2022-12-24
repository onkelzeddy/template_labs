package org.example;

public abstract class pizzaTemplate {

    protected String name;
    protected String form;
    protected String[] ingredients;
    protected boolean spicy;
    protected String[] dops;

    public pizzaTemplate(){
        name = "Margaritta";
        form = "classic";
        ingredients = new String[]{"flour","salt","water","olive oil","tomatoes","black pepper","mozzarella"};
        spicy = true;
        dops = new String[]{""};
    }

    public pizzaTemplate(String name,String form,
                         String[] ingredients,
                         boolean spicy,String[] dops){

        this.name = name;
        this.form = form;
        this.ingredients = ingredients;
        this.spicy = spicy;
        this.dops = dops;

    }

    public String getForm(){
        return form;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public boolean isSpicy() {
        return spicy;
    }

    public String getDops() {
        StringBuilder outStr = new StringBuilder();
        for (String dop : dops) {
            outStr.append(dop);
            outStr.append(" ");
        }
        return outStr.toString();
    }

    @Override
    public String toString() {
        StringBuilder outStrDops;
        outStrDops = new StringBuilder();
        for (String dop : dops) {
            outStrDops.append(dop);
            outStrDops.append(" ");
        }


        StringBuilder outStrIng;
        outStrIng = new StringBuilder();
        for (String ing : ingredients) {
            outStrIng.append(ing);
            outStrIng.append(" ");
        }
        return "Пицца " + name + " состоящая из " + outStrIng + " готова." + " Острая:" + spicy + "." + " Также вы добавили допы(или нет): " + outStrDops;
    }

}
