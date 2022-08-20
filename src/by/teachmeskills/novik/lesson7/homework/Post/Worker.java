package by.teachmeskills.novik.lesson7.homework.Post;

import by.teachmeskills.novik.lesson7.homework.Post.Post;

public class Worker implements Post {
    @Override
    public void post() {
        System.out.println("Post: worker");
    }
}
