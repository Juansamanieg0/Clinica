import java.util.Date;

public class Appointment {
	Date appointment;
	Doctors doctor;
	Patient patient;
	public Appointment(Date appointment, Doctors doctor, Patient patient) {
		super();
		this.appointment = appointment;
		this.doctor = doctor;
		this.patient = patient;
	}
	
	public String getDateString() {
		String s="";
		s+=appointment.getDate()+"/"+appointment.getMonth()+"/"+appointment.getYear()+"  "+appointment.getHours()+":"+appointment.getMinutes();
		return s;
	}
	
	@Override
	public String toString() {
		return "Appointment [appointment=" + getDateString() + ", doctor=" + doctor + ", patient=" + patient + "]";
	}
	
}
