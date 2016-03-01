package ie.dit.dt354.model;

import java.io.File;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Roster {
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	private Department rosterDept;
	private Date rosterDate;
	private File rosterFile;
	public Roster() {
		super();
	}
	public Roster(Department rosterDept, Date rosterDate, File rosterFile) {
		super();
		this.rosterDept = rosterDept;
		this.rosterDate = rosterDate;
		this.rosterFile = rosterFile;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Department getRosterDept() {
		return rosterDept;
	}
	public void setRosterDept(Department rosterDept) {
		this.rosterDept = rosterDept;
	}
	public Date getRosterDate() {
		return rosterDate;
	}
	public void setRosterDate(Date rosterDate) {
		this.rosterDate = rosterDate;
	}
	public File getRosterFile() {
		return rosterFile;
	}
	public void setRosterFile(File rosterFile) {
		this.rosterFile = rosterFile;
	}
	@Override
	public String toString() {
		return "Roster [id=" + id + ", rosterDept=" + rosterDept + ", rosterDate=" + rosterDate + ", rosterFile="
				+ rosterFile.getName() + "]";
	}
	
}
