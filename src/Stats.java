

public class Stats {
	
	private Integer [] subject;

	public Stats() {
		
	}	

	public Stats(Integer[] subject) {
		super();
		this.subject = subject;
	}
	
	public Integer[] getSubject() {
		return subject;
	}
	
	public void setSubject(Integer[] subject) {
		this.subject = subject;
	}

	public void sort() {
		int temp;
		for(int i = 1 ; i < subject.length; i++) {
			for(int j = i ; j < subject.length ; j++) {
				if(subject[i-1] >  subject[j]) {
				temp = subject[i-1] ;
				subject[i-1] = subject[j];
				subject[j] = temp;
				}
			
			}
		
		}
		
	}
	
	public int range() {
		this.sort();
		return subject[subject.length - 1] - subject[0];
	}
	
	public int mean() {
		int average = 0;
		for(int num : subject) {
			average = average + num;			
		}
		average = average / subject.length;
		return average;
	}
	
	public int mode() {
		int mode = subject[0];
		int counter = 0;
		this.sort();		
		for(int num : subject) {
			int anotherCounter = 0;
			for(int numnum : subject) {
				if(num == numnum) {
					anotherCounter++;
				}
				if(anotherCounter > counter) {
					counter = anotherCounter;
					mode = num;
				}
			}
		}
		
		return mode;
	}
	
	public boolean isEven() {
		boolean b = false;
	
		if((subject.length%2) == 0) {
			b = true;
		}
		return b;
	}
		
		
	public int median() {
		this.sort();
		int mean = 0;
		if(this.isEven()) {
			mean = (subject[subject.length/2] + subject[(subject.length/2) -1])/2;
		}else {
			mean = subject[(subject.length/2)];
		}
		
		return mean;
	}
	
	
	
	
	
	
	
	
	
	
	

}


