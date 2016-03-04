/**
 * Created by kevin_000 on 2/4/2016.
 * Instance fields
 •	Constructors
 */
public class Carpet
{
    private int length;
    private int width;
    public Carpet(int lin, int win)
    {
        length=lin;
        width=win;
    }
    public Carpet(int area)
    {

    }

    public int calcArea()
    {
        return length * width;
    }
}
