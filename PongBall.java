public class PongBall {
    private int x;
    private int y;
    private int vx;
    private int vy;
    
    public PongBall(int x, int y, int vx, int vy)
    {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void move()
    {
        x += vx;
        y += vy;
        
    }
    public void bounceX()
    {
        vx = vx * -1;;

    }
    public void bounceY()
    {
        vy = vy * -1;;

    }
}
