package core.ast;

public class GetterSetterAst {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        System.out.println( m1.getPhoneModel());
        m1.setsimNo(1);
        m1.setconnectivity("4g");
        System.out.println(m1.getsimNo());
        System.out.println(m1.getconnectivity());

    }
}
class Mobile
{
    private String phoneModel="Iphone 12";
    private int simNo;
    private String connectivity;
    public String getPhoneModel()
    {
        return phoneModel;
    }
    public int getsimNo()
    {
        return simNo;
    }
    public String getconnectivity()
    {
        return connectivity;
    }
    public void setsimNo(int n)
    {
        if(n>=1 && n<=2)
        {
            simNo=n;
        }
        else{
            System.out.println("Invalid SIM numbers, give either 1 or 2");
        }
    }
    public void setconnectivity(String c)
    {
        if(c.equals("3g") || c.equals("4g"))
        {
            connectivity=c;
        }
        else{
            System.out.println("Invalid connectivity give either 3g or 4g");
        }
    }
}