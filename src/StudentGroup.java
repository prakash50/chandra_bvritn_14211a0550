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
		if(students!=null)
			return students;
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++) {
			students[i].setId(0);
			students[i].setFullName(null);
			students[i].setBirthDate(null);
			students[i].setAvgMark(0);
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else {
			students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		students[students.length]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		students[0]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		for(int i=index;i<students.length;i++)
			students[i]=students[i+1];
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		int flag=0;
		for(int i=0;i<students.length;i++) {
			if(students[i]==student) {
				for(int j=i;j<students.length;j++)
					students[j]=students[j+1];
				flag=1;
				break;
			}
		}
		if(flag==0)
			throw new IllegalArgumentException("Student not exist");
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	        
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null)
			throw new IllegalArgumentException();
		int k=0;
		Student s[]=new Student[students.length];
		for(int i=0;i<students.length;i++) {
			Date d=students[i].getBirthDate();
			if(d.compareTo(date)==0)
				s[k++]=students[i];
		}
		return s;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null||lastDate==null)
			throw new IllegalArgumentException();
		int k=0;
		Student s[]=new Student[students.length];
		for(int i=0;i<students.length;i++) {
			Date d=students[i].getBirthDate();
			if(d.compareTo(firstDate)>0 && d.compareTo(lastDate)<0)
				s[k++]=students[i];
		}
		return s;
	}
	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==null)
			throw new IllegalArgumentException();
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
