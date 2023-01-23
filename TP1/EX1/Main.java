package TP1.EX1;

public class Main {
    public static void main(String[] args) {
        Pile pile = new Pile();
        try {
            // Pour chaque argument de la ligne de commande
            for (String arg : args) {
                // Empiler l'argument dans la pile
                pile.empiler(arg);
            }
            while (!pile.estVide()) {
                // Afficher le dernier élément empilé (premier dépilé)
                System.out.println(pile.depiler());
            }
        } catch (PilePleineException | PileVideException e) {
            // Afficher le message d'erreur
            System.out.println(e.getMessage());
        }
    }
    
}
