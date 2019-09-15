package my.learning.inheritence;
//inheritence
public class NewBox extends Box {
    //NewBox class acquired properties of Box class
    @Override
    public double calculateArea(int lngth, int wdth){
        return lngth/wdth;
    }
}
