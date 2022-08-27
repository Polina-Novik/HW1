package by.teachmeskills.novik.lesson9.classwork;
import static by.teachmeskills.novik.lesson9.classwork.Tree.TreeHolder.*;
import static java.lang.System.*; //убрать систем
public class TreeTest {
    static {
        System.out.println("blabla");
    }
    public static void main(String[] args) {

       out.println("here");
        // System.out.println(Tree.TREE_COUNT);
        addTree();
        Tree.printTreeCount();

      Garden garden=new Garden();
        out.println(garden.getTreeCount());
    }
    public static void addTree() {
        Tree tree = getInstance(); //единственный экземпл€р типо. сократили с помощью второй сточки
      Tree.TREE_COUNT++;
    }
}
