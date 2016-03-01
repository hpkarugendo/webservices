package ie.dit.dt354.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class EmployeeEnote {
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	private Employee noteFrom;
	@ManyToOne
	private Employee noteTo;
	@OneToOne
	private Enote eNote;
	
	public EmployeeEnote() {
		super();
	}

	public EmployeeEnote(Employee noteFrom, Employee noteTo, Enote eNote) {
		super();
		this.noteFrom = noteFrom;
		this.noteTo = noteTo;
		this.eNote = eNote;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Employee getNoteFrom() {
		return noteFrom;
	}

	public void setNoteFrom(Employee noteFrom) {
		this.noteFrom = noteFrom;
	}

	public Employee getNoteTo() {
		return noteTo;
	}

	public void setNoteTo(Employee noteTo) {
		this.noteTo = noteTo;
	}

	public Enote geteNote() {
		return eNote;
	}

	public void seteNote(Enote eNote) {
		this.eNote = eNote;
	}

	@Override
	public String toString() {
		return "EmployeeNote [id=" + id + ", noteFrom=" + noteFrom.getName() + ", noteTo=" + noteTo.getName() + ", eNote=" + eNote.getNoteBody() + "]";
	}
}
