
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("brachsten");
        Dier dier1 = new hond("lessie");
        dier1.makgulid();
        Dier dier2 = new Kat("ester");
        dier2.makgulid();
        Dier dier3 = new Eiend("duky");
        dier3.makgulid();
        slang dier4 = new slang("sissy");
        dier4.vervel();
        dier4.makgulid();
        Kat dier5 = new Kat("lodo ");
        Kat dier6 = new WildeKat("cindy");
         dier5.vangMuis();
         dier6.vangMuis();
          Kat jules = new Kat("jules  ");
          jules.jaag();
          slang slossy = new slang("slossy  ");
            slossy.jaag();
            Eiend duky = new Eiend("kwakki  ");
            duky.vlieg();

             Dier[] zoo = {
                new hond("buddy"),
                new hond("rex"),
                new Kat("whiskers"),
                new Kat("mittens"),
                new Eiend("quackers"),
                new Eiend("feathers"),
                new slang("slippy"),
                new slang("hiss"),
                new WildeKat("leo"),
                new WildeKat("luna")
        };
        /*
         * Loop door de 'zoo' en laat elk dier geluid maken,
         * maar  als  je  bijvoorbeld een moethoed hebt gwn voor  claas   die slang noemt (print)
         * slang das subClass dus als  je  wilt die prin  methoed roepen je moet [ slan S1 =new slang(slossy);]
         * als je  object maak Dier S1 = new slang(slossy); je kan  die  metgoen niet gebruiken (print) 
         * dus  a hoe kan  kan ik en  arrays maken  van dieren  ndien het dier een slang is
         * ndien het dier een slang is laat je het ook vervellen (tip: instanceof). 
         * Indien het dier een Jager is laat je het ook jagen en indien hetdier een vogel is laat je het vliegen 
         * (tip: ook instanceof!)
         * kan  je arrys  maken  van  abstract class  bv:Dieren.class 
         * 
         * 
         */
            System.out.println("hello  ");
        // Loop door de 'zoo' en laat elk dier geluid maken, jagen, vervellen (voor slangen) en vliegen (voor vogels)
        for (Dier dier : zoo) {
            System.out.println(dier.getName() + ": ");
            dier.makgulid();

            if (dier instanceof slang) {
                ((slang) dier).vervel();
            }

            if (dier instanceof Jager) {
                ((Jager) dier).jaag();
            }

            if (dier instanceof Vogel) {
                ((Vogel) dier).vlieg();
            }

            System.out.println();
        }

         Dier[] dieren = new Dier[5];

        // Vul de array met verschillende dieren
        dieren[0] = new hond("Buddy");
        dieren[1] = new Kat("Whiskers");
        dieren[2] = new Eiend("Quackers");
        dieren[3] = new slang("Hiss");
        dieren[4] = new hond("Rex");

        // Loop door de array en roep de maakGeluid-methode aan voor elk dier
        for (Dier dier : dieren) {
            System.out.println(dier.getName() + ": ");
            dier.makgulid();
            System.out.println();
            if (dier instanceof slang) {
                ((slang) dier).vervel();
            }
            if (dier instanceof Jager) {
                ((Jager) dier).jaag();
            }
            if (dier instanceof Vogel) {
                ((Vogel) dier).vlieg();
                
            }
        }


        Dier DD = new HuisKat("halllo");
        Dier BB =  new Kat("Cindy");
        Kat s = new Kat("sosos");

        if (s instanceof Kat) 
        {
            System.out.println("yes");    
        }
        else
        System.out.println("No");

        Emploeey e = new Emploeey("Buddy", 10000, 2,"programer","IT",123456789);

        System.out.println(e.toString());
    }


    
}