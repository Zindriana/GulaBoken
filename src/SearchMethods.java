//kopiera och modifierar koden från Bookshelf, men i den klass som behöver metoderna

import java.util.ArrayList;

public interface SearchMethods {

    void searchBySurname(String searchTerm);

    void searchByFirstName(String searchTerm);

    void searchByAdress(String searchTerm);

    void searchByAny(String searchTerm);
}
