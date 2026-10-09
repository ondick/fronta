public class Main {
    public static void main(String[] args) {
        Fronta fronta = new Fronta();
        Zak zak1 = new Zak("Ondrej Musil",2);
        Zak zak2 = new Zak("Dan Ziacik",1);
        Zak zak3 = new Zak("Eisman Jacob",2);
        Zak zak4 = new Zak("Milan Eisman",2);
        fronta.addZak(zak1);
        fronta.addZak(zak2);
        fronta.addZak(zak3);
        fronta.addZak(zak4);
        fronta.printFrontaZaku();
        System.out.println("");

        fronta.obslouzeni(zak1);
        fronta.printFrontaZaku();

        fronta.prvniChod();
        fronta.printFrontaZaku();

        fronta.hledaniPrijmeni();












    }
}