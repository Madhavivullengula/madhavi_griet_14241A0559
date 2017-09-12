import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
      int j;
     String temp=null;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
               int i;
               for(i=0;i<Student.length;i++)
                {
                  this.students[i]=Student[i];
		}
                try 
		{
                 if(students==null)
		{
		  throw IllegalArgumentException;
		}
		}
		catch(IllegalArgumentException e)
		{
		System.out.println(e);
		}
                
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
           try
        {
             if(students==null)
             throw("IllegalArgumentException");
	}
        catch(IllegalArgumentException e)
	{
	 System.out.println(e);
	}
     }

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
         try
         {
          if((index<0)||index>=students.length)
              {
               throw("IllegalArgumentException");
              }
          }
           catch(IllegalArgumentException e)
            {
             System.out.println(e); 
            }

		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
    		try
		{
               if(student==null||index<0||index>=students.length)
               {
                 throw IllegalArgumentException;
		}
		
		else if(index!=0)
		{
			students.Index(index)=student;
		}
		}
               catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}

	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
        try
		{
              if(student==null||index<0||index>=students.length)
               {
                 throw IllegalArgumentException;
		}
		

                else
                    {
                     students.Index(0)=student;
			}
                }
                    catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
               }
	

	@Override
	public void addLast(Student student) {
		// Add your implementation here
 		try
		{
		 if(student==null)
               {
                 throw IllegalArgumentException;
		}
		else
 		{
		students.Index(students.length)=student;
	        }
		}
               catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
       }

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try
		{
		 if(student==null)
                 {
                 throw IllegalArgumentException;
		 }
		else
 		{
                  students.Index(index);
 		}}
		catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
          try
		{
		 if(student==null)
               {
                 throw IllegalArgumentException;
		}
		else
 		{
                  students.Index(index)=null;
 		}
}
		catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
          
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try
		{
		 if(student==null)
               {
                 throw IllegalArgumentException;
		}
		else
 		{
                  for(int i=0;i<students.length;i++)
		{
		 if(students[i].equals(student))
			{
                          students[i]=null;
			}
 		}
}
		catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
          
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try
		{
		 if(student==null)
               {
                 throw IllegalArgumentException;
		}
		else
		{
		for(int i=index+1;i<students.length;i++)
			{
                          students[i]=null;
			}
			}
		}
      catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
	
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try
		{
		 if(student==null)
               {
                 throw IllegalArgumentException;
		}
		else
                 {
			for(i=0;i<students.length;i++)
			{
			if(students[i].equals(student))
				{
                                 int j=i;
				}
				}
                               for(int k=i;k<students.length;k++)
				{
				students[k]=null;
				}
				}
}
 				catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
	
				
			
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try
		{
		 if(student==null)
               {
                 throw IllegalArgumentException;
		}
		else
		{
		for(int i=0;i<index-1;i++)
			{
                          students[i]=null;
			}
		}
}
			catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		try
		{
		 if(student==null)
               {
                 throw IllegalArgumentException;
		}
		else
                 {
			for(i=0;i<students.length;i++)
			{
			if(students[i].equals(student))
				{
                                 int j=i;
				}
				}
                               for(int k=0;k<i-1;k++)
				{
				students[k]=null;
				}
				}
}
				catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
          for(i=0;i<students.length;i++)
		{
		for(j=i+1;j<students.length;j++)
		{
		if(students[j].comapreTo(students[i]<0))
		{
	         temp=students[j];
		students[j]=students[i];
		students[i]=temp;
	        }
		}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		try
		{
		 if(date==null)
               {
                 throw IllegalArgumentException;
		}
		else
                 {
			for(i=0;i<students.length;i++)
			{
			if(students[i].birthDate==date)
			{
			j=i;
			}
			}
			for(k=i;k<students.length;i++)
				{
					return students[i];
				}
			}
}
		catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
		
		

		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		try
		{
		 if(date==null)
               {
                 throw IllegalArgumentException;
		}
		else
                 {
			for(i=0;i<students.length;i++)
			{
                         if(students[i].birthDate==firstDate)
			{
			j=i;
			}
			else if(students[i].birthDate==lastDate)
				{
				k=i;
					}
				}

}
}
                                for(i=j;i<j;i++)
				{
				return students[i];
				}
              catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		try
		{
		 if(date==null)
               {
                 throw IllegalArgumentException;
		}
		else
                 {
		 for(i=0;i<students.length;i++)
			{
                          if(students[i].birthDate==date||students[i].birthDate==days)
                            {
				return students[i];
				}
		        }
			}
}
			catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		try
		{
		if(indexOfStudent==0)
		{
		throw IllegalArgumentException;
		}
		else
		{
		student=students.index(indexOfStudent);
		return (int)students(date);
		}
}
		catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
                for(i=0;i<students.length;i++)
		{
		if((int)students[i].birthDate==age)
		{
		return students[i];
		}
		}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
                for(i=0;i<students.length;i++)
		{
		if(students[i].avgMark>students[i+1].avgMark)
		{
			return students[i];
		}
                }
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		try
		{
		 if(student==null)
               {
                 throw IllegalArgumentException;
		}
		else
		{
		for(i=0;i<students.length;i++)
		{
		if(students[i].equals(student))
		{
		j=++i;
		}
		}
		return students[j];
		}
		}
                
		catch(IllegalArgumentException e)
		{
                  System.out.println(e);
		}
		
		return null;
	}
}
