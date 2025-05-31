class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BST {
    Node root;

    // 1. Search a node in BST
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (key == root.data) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    // 2. Insert a node in BST
    Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        return root;
    }

    // 3. Delete a node in BST
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // 4. Height of BST
    int height(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // 5. Number of nodes
    int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // 6. Number of internal nodes (non-leaf)
    int countInternal(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 + countInternal(root.left) + countInternal(root.right);
    }

    // 7. Number of external nodes (leaf)
    int countExternal(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countExternal(root.left) + countExternal(root.right);
    }

    // 8. Mirror image of BST
    Node mirror(Node root) {
        if (root == null) return null;
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    // 9. Delete the whole tree
    Node deleteTree(Node root) {
        if (root == null) return null;
        root.left = deleteTree(root.left);
        root.right = deleteTree(root.right);
        root = null;
        return null;
    }

    // 10. Smallest node
    int minValue(Node root) {
        while (root.left != null) root = root.left;
        return root.data;
    }

    // 11. Largest node
    int maxValue(Node root) {
        while (root.right != null) root = root.right;
        return root.data;
    }

    // Helper: In-order traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

public class Tree_Operations {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values)
            tree.root = tree.insert(tree.root, val);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Search 60: " + tree.search(tree.root, 60)); // true
        System.out.println("Search 25: " + tree.search(tree.root, 25)); // false

        System.out.println("Height: " + tree.height(tree.root));
        System.out.println("Total Nodes: " + tree.countNodes(tree.root));
        System.out.println("Internal Nodes: " + tree.countInternal(tree.root));
        System.out.println("External Nodes: " + tree.countExternal(tree.root));

        System.out.println("Min Value: " + tree.minValue(tree.root));
        System.out.println("Max Value: " + tree.maxValue(tree.root));

        System.out.println("Deleting node 70");
        tree.root = tree.delete(tree.root, 70);
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Mirroring tree...");
        tree.root = tree.mirror(tree.root);
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Deleting entire tree...");
        tree.root = tree.deleteTree(tree.root);
        System.out.println("Tree root is now: " + tree.root); // null
    }
}
