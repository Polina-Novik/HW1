package by.teachmeskills.novik.lesson9.classwork;

public class Tree {
    private String treeName="tree ";
    public static int TREE_COUNT=0; //������ ������ ���� ��� ���� ����� �����
    public static void printTreeCount() {
        System.out.println(TREE_COUNT);
       // System.out.println(treeName); ������ � ������ ������!!!!!������ ��� ������ ����
    }
    public static class TreeHolder {
        public static final Tree INSTANCE = new Tree();
        public static Tree getInstance() {
            return INSTANCE;
        }
        //������  � ������������ ����������
    }
    static { //������ ��� ���������� �� ����� � �����, �� �� ����� � ���� ������, �� ����� ����. ������� ��� - �� ������
        System.out.println("we start doing it" + TREE_COUNT);
    }
    private Tree() {

    };
 /*  public Tree() {
       TREE_COUNT++;
   } */
   public String getTreeName() {
        return treeName + TREE_COUNT; //�� ������, ������� ��� �����.� ������ � �������� �����
   }
}
