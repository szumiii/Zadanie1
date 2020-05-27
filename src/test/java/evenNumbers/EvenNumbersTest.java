package evenNumbers;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersTest {

    private EvenNumbers list;

    @BeforeAll
    static void beforeStart() {
        System.out.println("Za chwilę zostaną wykonane dwa testy: pierwszy sprawdzi czy lista jest pusta, drugi sprawdzi czy na pierwszym miejscu listy znajduje się liczba parzysta");
    }

    @BeforeEach
    void setUp() {
        list = new EvenNumbers();
        System.out.println("rozpoczynam test");
    }

    @Test
    public void emptyList() {
        ArrayList<Integer> newList = new ArrayList();
        ArrayList<Integer> parzyste = list.notEven(newList);
        assertEquals(0L, parzyste.size());
    }


    @Test
    public void shouldReturnEvenNumbers() {
        ArrayList<Integer> newList = new ArrayList();
        newList.add(3);
        newList.add(5);
        newList.add(6);
        newList.add(4);
        ArrayList<Integer> parzyste = list.notEven(newList);
        assertEquals(6L, (long) parzyste.get(0));
    }


    @AfterEach
    void tearDown() {
        System.out.println("koniec testu");
    }

    @AfterAll
    static void asd() {
        System.out.println("Wszystkie testy zakończone");
    }
}