/** -----------------------
 *  Tampereen Yliopisto
 *  TIETA6
 *  Miikka Mäki
 *  mm96932
 *  TIRA 2016 harjoitustyö
 *  21.12.2016
 *  -----------------------
 *
 * Tämä java-ohjelma toimii harjoitustyönä TIETA6 Tietorakenteet- kurssille.
 *
 * Java-kielellä toimiva prioriteettijono, joka mahdollistetaan hyödyntämällä keko-tietorakennetta.
 * Prioriteettijonoon tallennetaan alkioita, jotka sisältävät positiivisen kokonaislukutyyppisen avaimen
 * ja merkkijonon. Avaimet ovat yksikäsitteisiä. Käyttöliittymä on tekstipohjainen (konsolisovellus).
 * Sovellus lukee komennot syötettävästä tekstitiedostosta, ja tulokset ohjataan uuteen tekstitiedostoon.
 * Ohjelma sisältää seuraavat prioriteettijonon toiminnot: Koon tutkiminen, alkion lisäys, pienimmän alkion poisto,
 * pienimmän alkion haku, keon sisällön tulostus erijärjestyksessä ja ohjelman lopetus.
 *
 */
import main.*;
import java.io.IOException;
import java.security.InvalidKeyException;

public class Tira2016 {

    public static void main (String args[]) throws IOException, InvalidKeyException {
        Handler handler = new Handler();
        handler.start();

    }
}
