package cz.czechitas.ukol4;

import java.util.*;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        //TODO naplnit osudí čísly 1 až 49.
        for (int cislo = 1; cislo <= 49; cislo++) {
            osudi.add(cislo);
        }
    }


    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichat() {
        //TODO zamíchat osudí
        Collections.shuffle(osudi);
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> vylosovanaCisla() {
        //TODO Vrátit seznam prvních 6 čísel z osudí.
        List<Integer> vylosovanaCisla = osudi.subList(0, 6);
        return vylosovanaCisla;
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dodatkoveCislo() {
        //TODO Vrátit sedmé číslo z osudí.

        int dodatkoveCislo = osudi.get(6);
        return dodatkoveCislo;
    }
}

