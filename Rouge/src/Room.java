
public class Room {
int posX;
int posY;
int id;
boolean hasPlayer;

Monster goblin = new Monster();
public Room(int x, int y, int id, boolean play){
	this.posX = x;
	this.posY = y;
	this.id = id;
	this.hasPlayer = play;
}

}
