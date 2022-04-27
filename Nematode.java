package ie.tudublin;

import processing.data.TableRow;

public class Nematode extends NematodeVisualiser{
    public String Nam;//name
    public Integer lth;//length
    public Boolean legs;//body parts
    public Boolean eye;//eyes at the top

    public Nematode(TableRow r)
    {
        this (
            r.getString("Nam"),
            r.getInt("lth"),
            r.getInt("legs") == 1,
            r.getInt("eye") == 1


        );
      
    }

    public Nematode(String string) {
    }

    public Nematode(String string, int int1, boolean b, boolean c) {
    }

}
