import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Antes de TODOS");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("Depois de TODOS");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Antes de cada um\n");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Depois de cada um");
    }
    @Test
    void test1(){
        System.out.println("Test1");
    }

    @Test
    void test2(){
        System.out.println("Test2");
    }

    @Test
    void test3(){
        System.out.println("Test3");
    }
}
