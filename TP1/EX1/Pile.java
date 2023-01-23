package TP1.EX1;

public class Pile {
    
    static final int DIM = 10;
    Object[] tab;
    int nbElem;

    public Pile() {
        tab = new Object[DIM];
        nbElem = 0;
    }

    public boolean estVide() {
        return nbElem == 0;
    }

    public boolean estPleine() {
        return nbElem == DIM;
    }

    public void empiler(Object obj) throws PilePleineException {
        if (!estPleine()) {
            tab[nbElem] = obj;
            nbElem++;
        } else {
            throw new PilePleineException("La pile est pleine.");
        }
    }

    public Object depiler() throws PileVideException {
        if (!estVide()) {
            nbElem--;
            return tab[nbElem];
        } else {
            throw new PileVideException("La pile est vide.");
        }
    }
}