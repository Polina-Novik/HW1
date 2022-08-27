package by.teachmeskills.novik.lesson9.classwork;

public class Tree {
    private String treeName="tree ";
    public static int TREE_COUNT=0; //пример статик прем она типо везде видна
    public static void printTreeCount() {
        System.out.println(TREE_COUNT);
       // System.out.println(treeName); нельзя в статик приват!!!!!статик исп только сати
    }
    public static class TreeHolder {
        public static final Tree INSTANCE = new Tree();
        public static Tree getInstance() {
            return INSTANCE;
        }
        //делает  в единственном экземпляре
    }
    static { //статик блк выплняется до всего в тесте, но до движа с трии класом, пр после соут. методов нет - не выполн
        System.out.println("we start doing it" + TREE_COUNT);
    }
    private Tree() {

    };
 /*  public Tree() {
       TREE_COUNT++;
   } */
   public String getTreeName() {
        return treeName + TREE_COUNT; //не статик, поэтому его видно.а статик в нестатик можно
   }
}
