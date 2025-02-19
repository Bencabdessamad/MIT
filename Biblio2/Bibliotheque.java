package Biblio2;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Document> documents;

    public Bibliotheque() {
        documents = new ArrayList<>();
    }

    public void ajouterDocument(Document document) {
        documents.add(document);
        System.out.println("Document ajouté : " + document.titre);
    }

    public void afficherTousLesDocuments() {
        for (Document doc : documents) {
            doc.afficherDetails();
            System.out.println("-----------------------------");
        }
    }
}