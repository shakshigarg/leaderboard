import exceptions.UserAlreadyExists;
import service.LeaderBoardService;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello world!");
        LeaderBoardService leaderBoardService= new LeaderBoardService();
       try {
           leaderBoardService.registerUser("user1", "India", 10);
           leaderBoardService.registerUser("user2", "India", 9);
           leaderBoardService.registerUser("user3", "India", 8);
           leaderBoardService.registerUser("user4", "Thailand", 10);
           leaderBoardService.registerUser("user6", "India", 4);
           leaderBoardService.registerUser("user7", "India", 1);
           leaderBoardService.registerUser("user9", "India", 17);
       } catch (UserAlreadyExists e) {
           System.out.println(e.getMessage());
       }

       leaderBoardService.getUserCountry("India",3);



    }
}