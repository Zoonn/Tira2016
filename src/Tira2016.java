/** -----------------------
 *  Tampereen Yliopisto
 *  TIETA6
 *  Miikka M�ki
 *  mm96932
 *  TIRA 2016 harjoitusty�
 *  21.12.2016
 *  -----------------------
 *
 * T�m� java-ohjelma toimii harjoitusty�n� TIETA6 Tietorakenteet- kurssille.
 *
 * Java-kielell� toimiva prioriteettijono, joka mahdollistetaan hy�dynt�m�ll� keko-tietorakennetta.
 * Prioriteettijonoon tallennetaan alkioita, jotka sis�lt�v�t positiivisen kokonaislukutyyppisen avaimen
 * ja merkkijonon. Avaimet ovat yksik�sitteisi�. K�ytt�liittym� on tekstipohjainen (konsolisovellus).
 * Sovellus lukee komennot sy�tett�v�st� tekstitiedostosta, ja tulokset ohjataan uuteen tekstitiedostoon.
 * Ohjelma sis�lt�� seuraavat prioriteettijonon toiminnot: Koon tutkiminen, alkion lis�ys, pienimm�n alkion poisto,
 * pienimm�n alkion haku, keon sis�ll�n tulostus erij�rjestyksess� ja ohjelman lopetus.
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
