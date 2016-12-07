package main;

public class BinarySearchTree {

  private BSTNode root;

  BinarySearchTree() {}

  BinarySearchTree(int rootValue) {
    root = new BSTNode(rootValue);
  }

  public void insert(int value) {
    if (root == null) {
      root = new BSTNode(value);
      return;
    }
    insert(root, value);
  }

  private void insert(BSTNode node, int value) {
    //TODO
    if (value > node.value) {
      if (node.right == null) {
        node.right = new BSTNode(value);
      } else {
        insert(node.right, value);
      }
    } else {
      if (node.left == null) {
        node.left = new BSTNode(value);
      } else {
        insert(node.left, value);
      }
    }
  }

  public boolean search(int value) {
    return search(root, value);
  }

  private boolean search(BSTNode node, int value) {
    //TODO
    if (node.value == value) {
      return true;
    }

    if (value > node.value) {
      if (node.right == null) {
        return false;
      } else {
        return search(node.right, value);
      }
    } else {
      if (node.left == null) {
        return false;
      } else {
        return search(node.left, value);
      }
    }
  }

  public void delete(int value)
  {
     root = delete(root, value);
  }

  private BSTNode delete(BSTNode node, int value)
  {
    //TODO
    if (value > node.value) {
      //right
      if (node.right == null) {
        return null;
      } else if (node.right.value == value) {
        if (node.right.right != null && node.right.left != null) {
          BSTNode candidate = node.right.left;

          while(candidate != null) {
            if (candidate.right == null) {
              break;
            } else {
              candidate = candidate.right;
            }
          }

          candidate.right = node.right.right;
          // delete(node.right.left, candidate.value);

          BSTNode subCandidate = candidate;
          while(subCandidate != null) {
            if (subCandidate.left == null) {
              subCandidate.left = node.right.left;
              break;
            } else {
              subCandidate = subCandidate.left;
            }
          }

          node.right = candidate;
        } else if (node.right.right != null ) {
          node.right = node.right.right;
        } else if (node.right.left != null) {
          node.right = node.right.left;
        } else {
          node.right = null;
        }
        return node;
      } else {
        delete(node.right, value);
      }
    } else {
      //left
      if (node.left == null) {
        return null;
      } else if (node.left.value == value) {
        if (node.left.right != null ) {
          node.left = node.left.right;
        } else if (node.left.left != null) {
          node.left = node.left.left;
        } else {
          node.left = null;
        }
        return node;
      } else {
        delete(node.left, value);
      }
    }

     return node;
  }

  public BSTNode getRoot() {
    return root;
  }
}
