/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author Carlos Andres Neira
 */
public class Problem_1 {
    
    
    
    public class BinarySearchTreeNode
{
public int key;
public BinarySearchTreeNode left;
public BinarySearchTreeNode right;
} 
    
   public class BinarySearchTree
{
private BinarySearchTreeNode root;
public void insert(int key) { }
public void delete(int key) { }
public boolean find(int key) {return true; }
}
   
   
   // PROBLEM 1.A
   //
   
   /**
    * In order to find the optimal key sum method we must create a helper method to be able to recursively add the nodes
    * @param groot tree to be added
    * @return the result of keySumNode which finds the sum of the tree.
    */
  public int keySum (BinarySearchTree groot) {
   if (groot.root == null)
       return 0;
   else 
       return keySumNode(groot.root);
  }
  /**
   *  This is a helper method that lets the keySum method work recursively by adding the tree as it traverses it recursively. 
   * @param node is the root of the tree that is being use in KeySum
   * @return the sum of all the keys
   */
  public int keySumNode(BinarySearchTreeNode node){
      if (node == null)
          return 0;
      else{
            int sum = node.key;
            sum += keySumNode(node.left);
            sum += keySumNode(node.right);
            return sum;
      }
  }
  
  // END OF PROBLEM 1.A
  //
  
  
  // PROBLEM 1.2
  //
  
  /**
   * This method deletes the minimum value in a tree by going all the way to the left of the tree until it finds a null.
   * @param groot is the binary tree being used.
   */
  public void deleteMin(BinarySearchTree groot){
      BinarySearchTreeNode node = groot.root;
      while (node.left != null){
         node = node.left;
      }
      groot.delete(node.key);
  }
  
  // END OF PROBLEM 1.B
  //
  
  // PROBLEM 1.C
  //
  
  
  /**
   * This method prints the tree in ascending number with the most left key first. It requires the helper method printTreeNode 
   * in order to function at optimal efficiency 
   * @param groot is the tree that ill be used in this method
   */
  public void printTree(BinarySearchTree groot){
    printTreeNode(groot.root);
  }
  
 /**
  * This is a recursive method that first finds the most left node. Once it reaches the most left it prints it out and checks if 
  *  there is a right node. If there is it inputs it into the recursion.
  * @param node the root of the tree from the printTree method.
  */
  private void printTreeNode(BinarySearchTreeNode node) {
if (node.left != null) {
printTreeNode(node.left);
}
System.out.print(node.key + " ");
if (node.right != null) {
printTreeNode(node.right);
}
  } 
  
   // END OF PROBLEM 1.C
  //
  
   // PROBLEM 1.D
  //
  
  /**
   * This method prints outs binary trees according to a "postorder" traversal. It uses the printPostorderNode helper method
   * to be able to do the function recursively.
   * @param groot is the binary tree being used
   */
  public void printPostorder(BinarySearchTree groot){
   printPostorderNode(groot.root);   
  }
  
  /**
   * This method prints out nodes according to a "postorder" traversal. it first finds the most left tree via recursion,
   * then checks if it has a right leaf. if it does, it in puts into a the method again (recursion) 
   * @param node the root node of the main tree from the printPostorder method
   */
  private void printPostorderNode(BinarySearchTreeNode node) {
if (node.left != null) {
printPostorderNode(node.left);
}
if (node.right != null) {
printPostorderNode(node.right);
}
System.out.print(node.key + " ");
}
  
    // END OF PROBLEM 1.D
  //
  
  
  
   }
    
