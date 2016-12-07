package Module08.Mod08Lessons.LessonPart1806;
/**
 * This program demonstrates overloading methods and 
 * creating separate classes in different files.
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 05/30/07
 */
class OverloadedMethodsV3
{   
    //default constructor
    OverloadedMethodsV3()
    {
    }
    
    //first circle area method takes two ints
    public int calcRectArea(int s1, int s2)
    {
        return s1 * s2;
    }
    
    //second cricle area method takes two doubles
    public double calcRectArea(double s3, double s4)
    {
        return s3 * s4;
    }
    
    //third circle area method takes one int
    public int calcRectArea(int s1)
    {
        return (int)Math.pow(s1,2);
    }

    //Int circle
    public double calcCircArea(int radius)
        {
            return Math.PI * Math.pow(radius, 2);
        }

    //double circle
    public double calcCircArea(double radius)
        {
            return Math.PI * Math.pow(radius, 2);
        }

    //Double preimeter rectangle
    public double calcRectPer(double length, double width)
        {
            return 2 * length + 2 * width;
        }

}