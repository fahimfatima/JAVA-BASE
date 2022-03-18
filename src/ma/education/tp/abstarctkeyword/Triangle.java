package ma.education.tp.abstarctkeyword;

public abstract class Triangle extends FormeGeoTypeA{
  int h;
    int l ;
    @Override
    public double calculerSurface() {

        return (h*l)/2;
    }
}
