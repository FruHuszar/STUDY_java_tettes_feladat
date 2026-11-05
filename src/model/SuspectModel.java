package model;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class SuspectModel {

    public enum Names {
        ANNA,
        BÉLA,
        CSABA,
        DÁVID
    }
    private final Names thief;

    public SuspectModel() {
        this.thief = Names.DÁVID;
    }

    public Names getThief() {
        return thief;
    }
    
    public boolean Check (Names guess) {
        return guess == thief;
    }
     
    /*Ládás feladat mintájára ellenőrzés: Pontosan 3 igaz állítás van-e. Ez itt nem fog működni Anna tippje miatt: 
    public boolean annaTrue() {
        return thief == Names.BÉLA; // ez így hibás nyilván
    }
    
    */    
    
     public boolean annaTrue() {
        return thief == Names.DÁVID; // Azzal a logikával hogy Dávid = Dávid Béla
    }
    
    public boolean belaTrue() {
        return thief == Names.CSABA;
    }
    
    public boolean csabaTrue() {
        return thief != Names.BÉLA;
    }
    
    public boolean davidTrue() {
        return thief != Names.CSABA;
    }

    public boolean checkSumTrue() {
        int trueSentence = 0;

        if (annaTrue()) {
            trueSentence++;
        }
        if (belaTrue()) {
            trueSentence++;
        }
        if (csabaTrue()) {
            trueSentence++;
        }
        if (davidTrue()) {
            trueSentence++;
        }

        return trueSentence == 3;

    }
}
