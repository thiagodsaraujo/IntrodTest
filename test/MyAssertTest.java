import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS","Azure","DevOps");

   @Test
   void testeContains(){

       String palavra = "AWSx";
       boolean test = todos.contains(palavra);

//       assertEquals(true, test);
       assertEquals(3, todos.size());
       assertTrue(test, "Deu errado!");
   }
}
