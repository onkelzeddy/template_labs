package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Company MMM = new Company();

        concreteEmployee Sasha = new concreteEmployee("Sasha",MMM);

        concreteEmployee Inocentiy = new concreteEmployee("Inocentiy",MMM);

        concreteEmployee Mavrody = new concreteEmployee("Mavrody",MMM);

        MMM.companyNotification("Рубль будет повержен!");

        MMM.dismissAnEmployee(Inocentiy);

        MMM.companyNotification("Инокентий был предателем!");
    }
}
