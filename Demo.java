package Assignment1;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		TreeSet<Emp> emps=new TreeSet<>();
		emps.add(new Emp(101,"Neha",900000));
		emps.add(new Emp(105,"Sakshi",694838));
		emps.add(new Emp(109,"Amisha",2847563));
		emps.add(new Emp(101,"Anjali",375876));
		emps.add(new Emp(103,"Dev",476978));
		System.out.println(emps);
	}

}
