package by.teachmeskills.novik.lesson7.homework.post;

public class Worker implements Postable {
    @Override
    public void post() {
        System.out.println("Post: worker");
    }
}
