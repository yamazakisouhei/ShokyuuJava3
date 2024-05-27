
public class Rectlf extends MyFrame{
    public void run() {
        int x = 30;
        int h = 20;
        setColor(0,128,0);
        int color = 0;

        
        int i;
        for(i=0; i<10;i++) {

            fillRect(x,50,10,h);
            setColor(color,color,color);
            fillRect(x,50,10,100);
        
            x+=20;
            h+=20;
            color+=20;
        }
    }
}