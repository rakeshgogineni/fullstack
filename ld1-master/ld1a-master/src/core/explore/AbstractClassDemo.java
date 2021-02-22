package core.explore;

public class AbstractClassDemo {
public static void main(String[] args) {
	//Education education  = new Education();
//	ITCompany itCompany = new ITCompany();
//	itCompany.teaching();
	Education education = null;
	int random = (int) (Math.random()*10);
	System.out.println(random);
	//System.out.println(random);
	if(random < 6)
	education = new ITCompanyEducation();
	else
	education = new ManufacturingCompanyEducation();
	
	education.teaching();
	education.fees();
}
}
abstract class Education{
	public Education() {
		System.out.println("Eudcation()");
	}
	public abstract  void teaching();
	public void fees() {
		System.out.println("Bulky fees....");
	}
}
class ITCompanyEducation extends Education{
	@Override
	public void teaching() {
		System.out.println("Development Training");
	}
}
class ManufacturingCompanyEducation extends Education{

	public void teaching() {
		System.out.println("Field Work");
	}
}