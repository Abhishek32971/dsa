import java.util.HashMap;
import java.util.Map;  // Add this import
import java.util.Stack;


class 621TaskScheduler {

  // Improved printStack method (avoids unnecessary copying)
  public static void printStack(Stack<String> stack) {
  Stack<String> tempStack = new Stack<>();  // Create a temporary stack

  while (!stack.isEmpty()) {
    String element = stack.pop();  // Pop from the original stack
    System.out.println(element);   // Print the element
    tempStack.push(element);      // Push onto the temporary stack
  }

  // Restore the original stack from the temporary stack
  while (!tempStack.isEmpty()) {
    stack.push(tempStack.pop());
  }
}

  // Function to check if HashMap contains a zero value
  public static boolean containsZeroValue(HashMap<String, Integer> map) {
    for (Integer value : map.values()) {
      if (value == 0) {
        return true;
      }
    }
    return false;
  }

  // Function to return the key of the first zero value or "0" if none found
  public static String returnZeroValue(HashMap<String, Integer> map) {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 0) {
        return entry.getKey();
      }
    }
    return "0";
  }

  public static void main(String[] args) {
    HashMap<String, Integer> hashmap = new HashMap<>();
    Stack<String> stack = new Stack<>();
    char[] charArray = {'A', 'B', 'A', 'C', 'D', 'A', 'E'}; // Use single quotes for characters
    int n = 2;

    for (int i = 0; i < charArray.length;) {
      String item = String.valueOf(charArray[i]);

      // Check if any key in HashMap is 0 (combined logic)
      if (containsZeroValue(hashmap)) {
        String removedKey = returnZeroValue(hashmap);
        hashmap.remove(removedKey);
        stack.push(removedKey);
        // Decrement all values efficiently
        hashmap.forEach((key, value) -> hashmap.put(key, value - 1));
        System.out.println("in if");
        printStack(stack);
        i++;
        continue;
      } else if (!hashmap.containsKey(item)) { // If the key is not in HashMap
        // Decrement all values efficiently (avoid nested loop)
        hashmap.forEach((key, value) -> hashmap.put(key, value - 1));
        stack.push(item);
        hashmap.put(item, n);
        i++; // Move to the next character since key is new
        System.out.println("in elseif if key is not in hashmap");
        printStack(stack);
        continue;
      }
            else {
                    stack.push("none");
                    for (String mapItem : hashmap.keySet()) {
                        hashmap.put(mapItem, hashmap.get(mapItem) - 1);
                    }
                }
                System.out.println("in else statement ");
                    printStack(stack);
                    
            }

        // Print the stack length after processing
        System.out.println("Stack length: " + stack.size());
    }
}
