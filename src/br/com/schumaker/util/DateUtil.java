package br.com.schumaker.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

	private static final String	PATTERN_DATA_MYSQL	= "yyyy-MM-dd";
	private static final String	PATTERN_DATA_SAIDA	= "dd/MM/yyyy";

	public static Date obterDataAtual() {
		return Calendar.getInstance().getTime();
	}

	public static Date obterDataAnterior(int nrDias) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -nrDias);
		return cal.getTime();
	}

	public static Date toDate(final String data) {
		Date retorno;
		if (data == null) {
			return null;
		}
		String trim = data.trim();
		if ("".equalsIgnoreCase(trim)) {
			return null;
		}
		try {
			final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN_DATA_MYSQL, Locale.ENGLISH);
			retorno = simpleDateFormat.parse(trim);
		} catch (ParseException ex) {
			System.err.println(ex);
			retorno = null;
		}
		return retorno;
	}

	public static java.sql.Date utilDateToSqlDate(String utilDate) {
		return new java.sql.Date(toDate(utilDate).getTime());
	}

	public static java.sql.Date utilDateToSqlDate(Date utilDate) {
		return new java.sql.Date(utilDate.getTime());
	}

	public static String utilTimestampToDataAsString(Timestamp data) {
		SimpleDateFormat formato = new SimpleDateFormat(PATTERN_DATA_SAIDA);
		return formato.format(data);
	}

	public static String asString(Date date) {
		SimpleDateFormat formato = new SimpleDateFormat(PATTERN_DATA_SAIDA);
		return formato.format(date);
	}
	
	public static String dateToMesAno(Date date) {
		String aux = DateUtil.asString(date);
		return aux.substring(3, aux.length());
	}

}
