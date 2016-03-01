package ie.dit.dt354.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Enote {
	@Id
	@GeneratedValue
	private long id;
	private String noteTitle;
	private String noteBody;
	private Date noteDate;
	private boolean noteNew;

	public Enote() {
		super();
	}

	public Enote(String title, String body) {
		super();
		this.noteTitle = title;
		this.noteBody = body;
		this.noteDate = new Date();
		this.noteNew = true;
	}

	public long getId() {
		return id;
	}

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public String getNoteBody() {
		return noteBody;
	}

	public void setNoteBody(String noteBody) {
		this.noteBody = noteBody;
	}

	public Date getNoteDate() {
		return noteDate;
	}

	public void setNoteDate(Date noteDate) {
		this.noteDate = noteDate;
	}

	public boolean isNoteNew() {
		return noteNew;
	}

	public void setNoteNew(boolean noteNew) {
		this.noteNew = noteNew;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Enote [id=" + id + ", noteTitle=" + noteTitle + ", noteBody=" + noteBody + "]";
	}
	
	
}
