#Zadania
1. W pliku `Main1.java` utwórz listę łączoną `LinkedList`. A następnie przyjmij od użytkownika 6 liczb całkowitych i dodaj je do listy. Następnie wypisz ostatni element z listy.
2. W pliku `Main2.java` napisz aplikację, która doda do listy 100 losowych liczb (użyj klasy `Random`). Następnie usuń 5 pierwszych liczb z listy. P Po usunięciu wypisz pozostałe elementy. Jakiej listy użyjesz ? 
 
 3. Zaiplementuj własną tablicę dynamiczną dla liczb całkowitych z prostymi metodami pozwalającymi na dodawanie, usuwanie, pobieranie elementów.Metody, które powinieneś zaimplementować to `public void add()`, `public void remove(int index)`, `public void get(int index)`.
4. W klasie z zadania 3, zaimplementuj własną metodę, która będzie zmieniała rozmiar tablicy w taki sposób by usunąć wszystkie indexy w tablicy, które są wolne.
5. System pewnego banku został zaatakowany przez hakerów. Jedyne co zostało po ataku to log dostępu do pliku. Log zawiera nazwy użytkowników logujących się do systemu w kolejności od najstarszego do najnowszego. Znajduje się on w pliku `Input.txt`. W pliku `Main4` załaduj log do listy.
6. Po załadowaniu logów do listy należy z niej usunąć wszystkie dostępy dla użytkownika `User1`, gdyż wiadomo, że to nie z tego konta miał miejsce atak.
7. Wiadomo, że w atak zamieszani są użytkownicy `User7` i `User6`. Sprawdź który z nich był głównym atakującym. Aby to zrobić, sprawdź, który z użytkowników uzyskał dostęp pierwszy. Do rozwiązania zadań, użyj odpowiedniej struktury danych.
8. *Z gwiazdką**. Wiadomo, że we włamanie był zaangażowany jeszcze jeden użytkownik. Jedyne co o nim wiadomo, to że udało mu się zalogować do systemu tylko 3 razy. W pliku `Main4.java` napisz metodę, która znajdzie nazwe użytkownika 3 napastnika.