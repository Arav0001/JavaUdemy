public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        SearchTree tree = new SearchTree(null);

        list.traverse(list.getRoot());
        System.out.println("============");
        tree.traverse(tree.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");

        for (String s : data) {

            list.addItem(new Node(s));
            tree.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        System.out.println("============");
        tree.traverse(tree.getRoot());
    }
}