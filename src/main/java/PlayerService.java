import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PlayerService {

    private List<Player> players = Arrays.asList(
            new Player(1, "Djokovic", "Serbia", new Date(1987-05-22), 81),
            new Player(2, "Monfils", "France", new Date(1986-07-01), 10),
            new Player(3, "Isner", "USA", new Date(1985-04-26), 15)
    );

    public Player getPlayerByName(String name) {
        return players.stream().filter(player -> player.getName().equals(name)).findFirst().get();
    }
}
