import java.util.HashMap;
import java.util.Iterator;

class Student
{
	
}

public class Course 
{
	HashMap<Student , Integer> gradeBook;
	
	public Course()
	{
		this.gradeBook = new HashMap<Student , Integer>();
	}
	
	public Iterator getGradeBookIterator()
	{
		return this.gradeBook.values().iterator();
	}
	
	public void addGrade(Student s , int grade)
	{
		this.gradeBook.put(s, grade);
	}
	
	public static void main(String args[])
	{
		Course course = new Course();
		course.addGrade(new Student() , 100);
		new GradeComputer().computeAverage(course);
		course.addGrade(new Student() , 0);
		new GradeComputer().computeAverage(course);
	}
}

class GradeComputer
{
	void computeAverage(Course c)
	{
		Iterator<Integer> list = c.getGradeBookIterator();
		double averageGrade = 0;
		int i = 0;
		while(list.hasNext() )
		{
			averageGrade += list.next();
			i++;
		}
		averageGrade /= i;
		System.out.println(averageGrade);
	}
}