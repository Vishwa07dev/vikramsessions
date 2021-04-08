package weblab;

import java.util.*;

class Solution {

  /**
   * See the description of the exercise.
   */
  public static int restrictedCountChildren(MultiWaySearchTree mwsTree) {
    if(mwsTree==null || mwsTree.getRoot() ==null){
      return 0;
    }

    return restrictedCountChildren(mwsTree.getRoot());
  }

  private static int restrictedCountChildren(MWSTNode root){
    if(root ==null ){
      return 0 ;
    }
    int count = countNotNullNodes(root) ==4 ? 1 :0 ;
    for(MWSTNode node : root.getChildren()){
      count = count + restrictedCountChildren(node);
    }
    return count ;
  }

  private static int countNotNullNodes(MWSTNode node){
    if(node ==null){
      return 0 ;
    }
    int count =0 ;

    for(MWSTNode n : node.getChildren()){
      if(n!=null){
        count++;
      }
    }
    return count ;
  }

  /**
   * See the description of the exercise.
   */
  public static List<Integer> modifiedRetrieveKeys(MultiWaySearchTree mwsTree) {

    List<Integer> list  = new ArrayList<>();


    if(mwsTree==null || mwsTree.getRoot()==null){
      return list ;
    }
    MWSTNode root = mwsTree.getRoot();
    modifiedRetrieveKeys(root , list);
    return list ;

  }

  private static void modifiedRetrieveKeys(MWSTNode root, List<Integer> list) {

    if(root==null){
      return ;
    }

    int secondKey = findTheSecondKey(root) ;
    if(secondKey !=-1){
      list.add(secondKey);
    }

    for(MWSTNode node : root.getChildren()){
      modifiedRetrieveKeys(node, list);
    }
  }

  private static int findTheSecondKey(MWSTNode root) {
      if(root ==null){
        return -1 ;
      }
      int result = -1 ;

      if(root.getKeys().size()>=2){
        result = root.getKeys().get(1);
      }

      return result ;
  }

  /**
   * See the description of the exercise.
   */
  public static List<Integer> getSortedKeys(MultiWaySearchTree mwsTree) {
    List<Integer> list  = new ArrayList<>();

    if(mwsTree==null || mwsTree.getRoot()==null){
      return list;
    }

    getSortedKeys(mwsTree.getRoot(), list);
    Collections.sort(list);

    return list ;
  }

  private static void getSortedKeys(MWSTNode root, List<Integer> list) {

    if(root ==null){
      return ;
    }
    list.addAll(root.getKeys());


    for(MWSTNode node : root.getChildren()){
      getSortedKeys(node, list);
    }

  }
}

