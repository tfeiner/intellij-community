// "Replace with findFirst()" "true"

import java.util.List;
import java.util.Map;

public class Main {
  public void testMap(Map<String, List<String>> map) throws Exception {
    int firstSize = 0;
    for(List<String> list : map.valu<caret>es()) {
      if(list != null) {
        firstSize = list.size();
        break;
      }
    }
    System.out.println(firstSize);
  }
}