package org.example;


public class App 
{
    public static void main( String[] args )
    {
        peperoni piz1 = new peperoni();
        julien piz2 = new julien();

        System.out.println( piz1.getDops());

        piz2.addDops("паприка");
        piz2.addDops("папая");

        System.out.println( piz2.getDops());

        peperoni piz3 = new peperoni("Julien","wrapped", new String[]{"flour", "salt", "water", "olive oil", "tomatoes", "black pepper", "mozzarella", "gaudy", "pepperoni"},false,new String[]{"паприка", "папая"});

        System.out.println( piz3.getDops());
        System.out.println( piz3.toString());



    }
}
