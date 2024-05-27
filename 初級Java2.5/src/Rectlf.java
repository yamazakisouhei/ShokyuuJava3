
public class Rectlf extends MyFrame{
    public void run() {
        int x = 30;
        int y = 50;
        int h = 20;
        setColor(0,128,0);
        
        int i;
        for(i=0; i<9;i++) {
        for(i=0; i<10;i++) {

            fillRect(x,y,10,100);
            fillRect(x,50,10,h);
        
            x+=20;
            y+=20;
            h+=20;
        }
    }
}
}