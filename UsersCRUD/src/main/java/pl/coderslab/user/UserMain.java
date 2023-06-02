package pl.coderslab.user;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("Tomek");
        user.setEmail("tomek@op.pl");
        user.setPassword("123aaa");
       // System.out.println(userDao.read(1));

        System.out.println(userDao.findAll());
        User[] tab = userDao.findAll();
        for (User u : tab) {
            System.out.println(u);
        }
    }
}
