import java.util.Scanner;

public class Person
{
	private String name;
	private String surname;
	private double age;
	private double weight;
	
	public Person(String aName, String aSurname, double aAge, double aWeight)
	{
		this.name = aName;
		this.surname = aSurname;
		this.age = aAge;
		this.weight = aWeight;
	}
	
	public Person()
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter surname");
		surname = sc.nextLine();
		System.out.println("Enter age");
		age = Double.parseDouble(sc.nextLine());
		System.out.println("Enter weight");
		weight = Double.parseDouble(sc.nextLine());
	}
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSurname()
	{
		return surname;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	public double getAge()
	{
		return age;
	}
	public void setAge(double age)
	{
		this.age = age;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(age);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Double.doubleToLongBits(age) != Double.doubleToLongBits(other.age))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null)
		{
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
