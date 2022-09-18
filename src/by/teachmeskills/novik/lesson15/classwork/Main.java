package by.teachmeskills.novik.lesson15.classwork;

public class Main {
    public static void main(String[] args) {
        Person firstPerson=new Person(20,"Vova");
        Person secondPerson=new Person(25,"Nikita");
        secondPerson.setNickname("Nick");
        if (secondPerson.getOptionalNickname().isPresent()){  //better
        secondPerson.getOptionalNickname().get();} //not to use
        secondPerson.getOptionalNickname()
                .map(nick ->"Nick: "+ nick)
                .ifPresentOrElse(nick -> System.out.println(nick),
                () -> System.out.println("Empty nick")); //if,else
        secondPerson.getOptionalNickname()
                .map(nick ->nick.length()+3).filter(value -> value>7)
                .ifPresentOrElse(nick -> System.out.println(nick),
                        () -> System.out.println("Empty nick"));
//        if (secondPerson.getNickname() != null) {
//            System.out.println(secondPerson.getNickname().length());
//        } else {
//            System.out.println(0);
//        }
//        if (firstPerson.getNickname() != null) {
//            System.out.println(secondPerson.getNickname().length());
//        } else {
//            System.out.println(0);
//        }
//        if (firstPerson.getOptionalNickname().isPresent()) {
//            //not very good  variant. chech if there is something. yes true, no false
//        }
//       firstPerson.getOptionalNickname()
//               .ifPresent(nick -> System.out.println(nick));
//        System.out.println("ababa " + firstPerson.getNickname());
//       // String nickName= firstPerson.getOptionalNickname().orElseThrow(); //if null throw mistake
//        String nickName2= firstPerson.getOptionalNickname().orElseThrow(() -> new RuntimeException("Allo sho tvorish..."));
//        System.out.println(nickName2);
//        System.out.println(firstPerson.getOptionalNickname().orElse("").length());
//        System.out.println(secondPerson.getOptionalNickname().orElse(getTestString()).length());
////or Else use method anyway
//        System.out.println(firstPerson.getOptionalNickname().orElseGet(() -> "").length());
//        System.out.println(secondPerson.getOptionalNickname().orElseGet(() -> getTestString()).length());//supplier
    } //orElseGet uses method if we don't use method
    private static String getTestString() {
        System.out.println("this is a test String");
        return  "";
    }
}
