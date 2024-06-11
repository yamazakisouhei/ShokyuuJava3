
public class PlayerAnimation extends MyFrame{
    public void run() {
        car player =new Car(100,100,0,0); 
        
        addKeyListener(player);
        while(true) {
            clear();
            player.draw(this);
        }
    }
}