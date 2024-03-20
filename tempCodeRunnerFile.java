import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class tempCodeRunnerFile {

  public static boolean isKeyAvailable(HashMap<Character, Integer> map, char key) {
    return map.containsKey(key);
  }

  public static int getAvailableValue(HashMap<Character, Integer> map, char key) {
    return map.getOrDefault(key, 0);
  }

  public static void decrementValues(HashMap<Character, Integer> map) {
    for (char key : map.keySet()) {
      if (map.get(key) != 0) {
        map.put(key, map.get(key) - 1);
      }
    }
  }

  public static char findNextNewKey(HashMap<Character, Integer> map, char[] charArray, int index) {
    for (int i = index; i < charArray.length; i++) {
      if (!isKeyAvailable(map, charArray[i])) {
        return charArray[i];
      }
    }
    return '0';
  }

  public static void removeItemFromArray(char[] arr, int index) {
    if (index < 0 || index >= arr.length) {
      throw new IllegalArgumentException("Index out of bounds!");
    }

    // Shift elements to overwrite the removed item
    for (int i = index; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }

    // Decrement array length (optional, reflects logical size)
    arr[arr.length - 1] = '0'; // Or any default value
  }

  public static void main(String[] args){
    char[] tasks={'A','A','A','B','B','B' };
    int n=2;
    HashMap<Character, Integer> map = new HashMap<>();
    Stack<Character> stack = new Stack<>();

    for (char task : tasks) {
      map.put(task, map.getOrDefault(task, 0) + 1);
    }

    int index = 0;
    while (true) {
        System.out.println("inwhile");
      char key = tasks[index];
      if (key == '0') {
        break;
      }

      if (!isKeyAvailable(map, key)) { // New key, push and update map
        stack.push(key);
        map.put(key, n);
        index++;
      } else if (getAvailableValue(map, key) > 0) { // Existing key with non-zero value, decrement and push
        stack.push(key);
        decrementValues(map);
        index++;
      } else { // Existing key with zero value, find next new key
        char nextKey = findNextNewKey(map, tasks, index);
        if (nextKey != '0') {
          removeItemFromArray(tasks, index);
          stack.push(nextKey);
          map.put(nextKey, n);
        } else {
          decrementValues(map); // Decrement all values if no new key found
        }
      }
    }

    System.out.println(stack.size());
  }
}
