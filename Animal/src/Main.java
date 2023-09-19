public class Main {
    public static void main(String[] args) {

        System.out.println("HENRY e GABRIELLY 2-DS");

        System.out.println("---------------ANIMAL---------------");
        Animal ornitorrinco = new Animal(4,"terrestre");
        ornitorrinco.showAnimal();

        System.out.println();

        System.out.println("---------------COBRA---------------");
        Cobra python = new Cobra(0,"terrestre");
        python.setEspecie("venenosa");
        python.setVeneno(true);
        python.showAnimal();
        python.showCobra();

        System.out.println();

        System.out.println("---------------MAMIFERO---------------");
        Mamifero macaco = new Mamifero(4,"terrestre");
        macaco.setDomestico(false);
        macaco.setEspecie("Primatas");
        macaco.showAnimal();
        macaco.showMamifero();

        System.out.println();

        System.out.println("---------------REPTIL---------------");
        Reptil largato = new  Reptil(4,"terrestre");
        largato.setIdade(10);
        largato.setNome("goodzila");
        largato.showAnimal();
        largato.showReptil();

        System.out.println();
        System.out.println("---------------CACHORRO---------------");
        Cachorro baruque = new Cachorro(4,"terrestre");
        baruque.setDomestico(true);
        baruque.setEspecie("Canidio");
        baruque.setRasa("salcicha");
        baruque.setNome("Baruque");
        System.out.println("Animal:");
        baruque.showAnimal();
        System.out.println("Mamifero:");
        baruque.showMamifero();
        System.out.println("Cachorro:");
        baruque.showCachoro();

    }
}