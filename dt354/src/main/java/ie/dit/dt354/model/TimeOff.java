package ie.dit.dt354.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TimeOff {
	@Id
	@GeneratedValue
	private long id;
	private String rReason;
	private String rNote;
	private String rStatus;
	private Date dateFrom;
	private Date dateTo;
	@ManyToOne
	private Employee employee;
	public TimeOff() {
		super();
	}
	public TimeOff(String rReason, String rNote, Date dateFrom, Date dateTo, Employee employee) {
		super();
		this.rReason = rReason;
		this.rNote = rNote;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.employee = employee;
		this.rStatus = "NEW";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getrReason() {
		return rReason;
	}
	public void setrReason(String rReason) {
		this.rReason = rReason;
	}
	public String getrNote() {
		return rNote;
	}
	public void setrNote(String rNote) {
		this.rNote = rNote;
	}
	public String getrStatus() {
		return rStatus;
	}
	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "TimeOff [id=" + id + ", rReason=" + rReason + ", rNote=" + rNote + ", rStatus=" + rStatus
				+ ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", employee=" + employee.getName() + "]";
	}
	
	
}
