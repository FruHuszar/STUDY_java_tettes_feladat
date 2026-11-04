package model;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class SuspectModel {

    public enum names {
        ANNA,
        BÉLA,
        CSABA,
        DÁVID
    }
    private final names thief;

    public SuspectModel() {
        this.thief = names.DÁVID;
    }

    public names getThief() {
        return thief;
    }

    public boolean tippCheck (names tipp) {
        return tipp == thief;
    }
}
