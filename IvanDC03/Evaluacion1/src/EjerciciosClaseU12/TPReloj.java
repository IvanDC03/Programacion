package EjerciciosClaseU12;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TPReloj extends TareaPeriodica {
	public TPReloj() {
		super();

	}

	public String LeerHora() {
		Calendar cal = new GregorianCalendar();
		return cal.get(Calendar.HOUR_OF_DAY) + ":" + (Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
	}
}
