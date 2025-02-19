package Biblio2;

public interface Empruntable {
    void emprunter() throws DocumentNonDisponibleException;
    void retourner();
}
