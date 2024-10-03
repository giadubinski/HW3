/*
 * *** Gianna Dubinski / COMP 272-001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    
    /*
     * Set Integer for TreeSet is set to store the result of setA 
     * and the result is adding all to setB
     */
    Set<Integer> result = new TreeSet<>(setA);
    result.addAll(setB);

    // Set Integer is joining the TreeSet of setA and retaingall elements in setB
    Set<Integer> join = new TreeSet<>(setA);
    join.retainAll(setB);

    // The result is being removed when joined
    result.removeAll(join);

    //Return would go back to the result
    return result;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    
    //TreeMap is storing old entires
    Map<Integer, String> oddEntries = new TreeMap<>();
    
    /*
    * The for statement is iterating through treeMap and
    * adding odd entries to the new TreehMap
    * If statement is to get the key and to see if the key has an odd value
    */
    for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
      if (entry.getKey() % 2 != 0) {
        oddEntries.put(entry.getKey(), entry.getValue());
      }
      
    }
    
    // treeMap is cleared
    treeMap.clear();
    
    // Putting all the odd entries back to the treeMap
    treeMap.putAll(oddEntries);
  }

  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    
    //The return value has returned that the two TreeMaps are equal
    return tree1.equals(tree2);
  }

} // end treeProblems class
