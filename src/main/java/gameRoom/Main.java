package gameRoom;

import gameRoom.model.enums.ChildMale;

import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;


public class Main {
    static String CONTENT_BUNDLE_NAME = "content";
    static ResourceBundle bundle1 = ResourceBundle.getBundle(CONTENT_BUNDLE_NAME); //, new Locale("ua", "UA")
    static ResourceBundle bundle2 = ResourceBundle.getBundle(CONTENT_BUNDLE_NAME, new Locale("ua"));


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(bundle2.getString("a.move.gameRoom"));

         /*BallDao ballDao;
         CarDao carDao;
         CubeDao cubeDao;
         DollDao dollDao;
        ballDao = new BallDaoImpl();
        carDao = new CarDaoImpl();
        cubeDao = new CubeDaoImpl();
        dollDao = new DollDaoImpl();

        System.out.println(ballDao.getAll());
        System.out.println(carDao.getAll());
        System.out.println(cubeDao.getAll());
        System.out.println(dollDao.getAll());*/

       /* ToyService toyService = new ToyServiceImpl();

        System.out.println(toyService.getAllToys());*/

/*       Toy toy = new Ball(1, "adidas", 1000, AgeGroup.TEENAGER, ChildMale.BOY, 100, BallType.FOOTBALL);

        System.out.println((Ball)toy);*/

        ChildMale cm = ChildMale.valueOf(null);
        System.out.println(cm);
    }
}
