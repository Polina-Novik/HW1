package by.teachmeskills.novik.lesson7.homework.Post;

public class TestPost {
    public static void main(String[] args) {
        Post[] arr=new Post[3];
        arr[0]=new Director();
        arr[1]=new Worker();
        arr[2]=new Accountant();
        for(Post p : arr) {
            p.post();
        }
    }
}
