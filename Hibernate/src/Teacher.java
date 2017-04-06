import javax.persistence.*;

@Entity
@Table(name="vi")
public class Teacher implements java.io.Serializable{
	
	//Subjects subject;
	@Id
	@Column(name="name")
	String name;
	
	@Id
	@Column(name="subject")
	String subject;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
