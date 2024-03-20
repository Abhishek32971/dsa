import java.util.Arrays;
import java.util.HashMap;
import java.util.Map; // Add this import
import java.util.Stack;
import java.util.*;
import java.io.*;

class TaskScheduler621 {

  // Improved printStack method (avoids unnecessary copying)
  public static void printStack(Stack<String> stack) {
    Stack<String> tempStack = new Stack<>(); // Create a temporary stack

    while (!stack.isEmpty()) {
      String element = stack.pop(); // Pop from the original stack
      System.out.println(element); // Print the element
      tempStack.push(element); // Push onto the temporary stack
    }

    // Restore the original stack from the temporary stack
    while (!tempStack.isEmpty()) {
      stack.push(tempStack.pop());
    }
  }
public static boolean checkIfZeroItemPresent(char[] charArray,int i, String item){
  for (int j=i;j<charArray.length;j++){
    String itemNew = String.valueOf(charArray[j]);
    System.out.println("itemNew"+itemNew+"item"+item);
    if(item.equals(itemNew)){
      System.out.println("is true inside checkif zeroitempresent");
      return true;
    }
  }
  System.out.println("is false inside checkif zeroitempresent");
  return false;
}
  // Function to check if HashMap contains a zero value
  public static boolean containsZeroValue(HashMap<String, Integer> map,String item,char[] charArray,int i) {
    printHashMap(map);
    int value= map.get(item);
      if (value == 0) {
        return true;
      }
      else{
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
          if (entry.getValue() == 0 && checkIfZeroItemPresent(charArray,i,entry.getKey()) ) {
            return true;
          }
        }
      }
      printHashMap(map);
    return false;
  }

  // Function to return the key of the first zero value or "0" if none found
  public static String returnZeroValue(HashMap<String, Integer> map,String item,char[] charArray,int i) {
    int value= map.get(item);
      if (value == 0) {
        return item;
      }
      else{
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
          if (entry.getValue() == 0 && checkIfZeroItemPresent(charArray,i,entry.getKey()) ) {
            return entry.getKey();
          }
        }
      }
    
    return "0";
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

  public static boolean isThereNextNewKey(HashMap<String, Integer> hashmap, Stack<String> stack, char[] charArray,
      int n) {
    for (int i = n; i < charArray.length; i++) {
      String item = String.valueOf(charArray[i]);
      if (!hashmap.containsKey(item) && charArray[i] != '0') {

        return true;
      }
    }
    return false;
  }

  public static String returnNextNewKey(HashMap<String, Integer> hashmap, Stack<String> stack, char[] charArray,
      int n) {
    for (int i = n; i < charArray.length; i++) {
      String item = String.valueOf(charArray[i]);
      if (!hashmap.containsKey(item)) {
        removeItemFromArray(charArray, i);
        return item;
      }
    }
    return "0";
  }

  public static void printHashMap(HashMap<String, Integer> map) {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
  }

  public static void main(String[] args) {
    // int flag=0;
    HashMap<String, Integer> hashmap = new HashMap<>();
    Stack<String> stack = new Stack<>();
    // char[] charArray = { 'A', 'B', 'A', 'C', 'D', 'A', 'E' }; // Use single quotes for characters
    char[] charArray = {'A','A','A','B','B','B' };
    int n = 2;
    int i = 0;
    while (true) {
      String item = String.valueOf(charArray[i]);
      if (item.equals("0")) {
        break;
      }
      // Check if any key in HashMap is 0 (combined logic)
      else if (!hashmap.containsKey(item)) { // If the key is not in HashMap
        // Decrement all values efficiently (avoid nested loop)
        for (String mapItem : hashmap.keySet()) {
          if(hashmap.get(mapItem)!=0){
          hashmap.put(mapItem, hashmap.get(mapItem) - 1);
          }
        }
        System.out.println("after decrement in \n\n\n");
        stack.push(item);
        hashmap.put(item, n);
        i++; // Move to the next character since key is new
        System.out.println("in elseif if key is not in hashmap\ndone with condition");
        printStack(stack);
        // break;
        continue;
      } 
      else if (containsZeroValue(hashmap,item,charArray,i)) {
        String removedKey = returnZeroValue(hashmap,item,charArray,i);
        hashmap.put(removedKey,n);
        printHashMap(hashmap);
        System.out.println("this");
        
        stack.push(removedKey);
        //Decrement all values efficiently
        for (String mapItem : hashmap.keySet()) {
          if(hashmap.get(mapItem)!=0){
          hashmap.put(mapItem, hashmap.get(mapItem) - 1);
          }
        }
        System.out.println("in if\n" + //
                    "done with condition");
        printStack(stack);
        printHashMap(hashmap);
        i++;
        continue;
      } 
      
      
      
      
      
      else if (isThereNextNewKey(hashmap, stack, charArray, i)) {// if key in hashmap and no element in hashmap is 0
        for (String mapItem : hashmap.keySet()) {
          if(hashmap.get(mapItem)!=0){
          hashmap.put(mapItem, hashmap.get(mapItem) - 1);
          }
        }
        printHashMap(hashmap);
        String itemtopush=returnNextNewKey(hashmap, stack, charArray, i);
        stack.push(itemtopush);
        System.out.println("after removing that element");
        System.out.println(Arrays.toString(charArray));
        hashmap.put(itemtopush, n);
        System.out.println("if key in hashmap and no element in hashmap is 0 \n" + //
                    "done with condition");
        printStack(stack);
        printHashMap(hashmap);
        

        // continue;
        // break;

      }

      else {
        stack.push("none");
        printHashMap(hashmap);
        for (String mapItem : hashmap.keySet()) {
          if(hashmap.get(mapItem)!=0){
          hashmap.put(mapItem, hashmap.get(mapItem) - 1);
          }
        }
        System.out.println("in else statement \n" + //
                    "done with condition");
        printStack(stack);
        printHashMap(hashmap);
        
      }
      System.out.println("stack after iteration");
      printStack(stack);
      System.out.println("hashmap");
      printHashMap(hashmap);
      System.out.println("the end of iteration");

    }

    // Print the stack length after processing
    System.out.println("Stack length: " + stack.size());
  }
}
