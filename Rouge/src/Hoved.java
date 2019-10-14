import java.util.Scanner;
public class Hoved {
	public static Room maps[];
	public static int  location = 8;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		int test = 25;
		maps = new Room[test];
		
		
	maps = roomGen();
		

	
	Player player1 = new Player(40, 4, maps[8]);
	char valg = 'o';
	maps[8].hasPlayer = true;

	System.out.println("Controls; WASD");
		while(valg != 'p') {
			
			System.out.println("You are in room posX: " + player1.where().posX + " and posY" + player1.where().posY);
			draw();
			
		valg = input.next().charAt(0);
		switch(valg) {
		case 'w':
			player1.moveNorth();
			
			break;
		case 's':
			player1.moveSouth();
			break;
		case 'a':
			player1.moveWest();
			break;
		case 'd':
			player1.moveEast();
			break;
		default:
			System.out.println("Ugyldig input");
		
		}

			
		}
		
	}
	
	public static void draw() {

		
		System.out.println();
		int count= 0;
		
		for(int i = 0 ; i < 5; i ++) {
			for(int j = 0 ; j < 5 ; j ++) {
				if(count == location) {
				System.out.print("X");
				} else {
					System.out.print("▢");
				}
				
				count++;
				}System.out.println();
			}
	}
	
	public static Room[] roomGen(){
		
int count = 0;
		
for(int i = 0 ; i < 5; i ++) {
	for(int j = 0 ; j < 5 ; j ++) {
	
	maps[count] = new Room(i,j,count, false);
	count++;
	}
}
Room genMep[] = maps;
		
		return genMep;
	}
	
}
