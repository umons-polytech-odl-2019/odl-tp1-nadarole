package exercise2;

class Person
{
	int age;
	private static int totalAge =0;
	private static int populationSize =0;
	public Person ( int Age)
	{
		this.age = age;
		totalAge += this.age;
		populationSize++;
	}
}
