
public class Player {
	
	int hp;
	int attack;
	int defence;
	
	Room currentRoom;
	
	public Player( int hp, int attack, Room room) {
		this.hp = hp;
		this.attack = attack;
		this.currentRoom = room;
	}

	public void moveNorth(){
		if(this.currentRoom.posX ==0) {
			
			System.out.println("Cannot go further north");
			return;
		}
		
		this.currentRoom = Hoved.maps[this.currentRoom.id-5];
	
		Hoved.location = Hoved.location-5;
		
		
		
	}
	
	public void moveSouth(){
		if(this.currentRoom.posX ==4) {
			
			System.out.println("Cannot go further south");
			return;
		}
		
		this.currentRoom = Hoved.maps[this.currentRoom.id+5];
		
		Hoved.location = Hoved.location+5;
		
		
	}
	
	public void moveEast(){
		if(this.currentRoom.posY ==4) {
			
			System.out.println("Cannot go further east");
			return;
		}
	
		this.currentRoom = Hoved.maps[this.currentRoom.id+1];
	
		Hoved.location = Hoved.location+1;
		
		
	}
	public void moveWest(){
		if(this.currentRoom.posY ==0) {
			
			System.out.println("Cannot go further west");
			return;
		}
	
		this.currentRoom = Hoved.maps[this.currentRoom.id-1];
	
		Hoved.location = Hoved.location-1;
		
		
	}
	
	public Room where() {
		
		return this.currentRoom;
	}
	
	}

