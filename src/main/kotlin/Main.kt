class Node(val value: Int, var left: Node? = null, var right: Node? = null)
//left, Root, right
fun inOrderTraversal(node: Node?) {
    if (node != null) {
        inOrderTraversal(node.left)
        println(node.value)
        inOrderTraversal(node.right)
    }
}
//Root, left, right
fun preOrderTraversal(node: Node?) {
    if (node != null) {
        println(node.value)
        preOrderTraversal(node.left)
        preOrderTraversal(node.right)
    }
}
// left-right-Root
fun postOrderTraversal(node: Node?) {
    if (node != null) {
        postOrderTraversal(node.left)
        postOrderTraversal(node.right)
        println(node.value)
    }
}
fun main() {

    val root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left?.left = Node(4)
    root.left?.right = Node(5)


    println("In-order traversal:")
    inOrderTraversal(root)


    println("\nPre-order traversal:")
    preOrderTraversal(root)


    println("\nPost-order traversal:")
    postOrderTraversal(root)
}

/*  Binarytree
*
*                      1
*                     /  \
*                    2    3
*                   / \
*                  4   5
*
*   */