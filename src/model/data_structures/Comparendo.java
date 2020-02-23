package model.data_structures;

import java.util.Date;

public class Comparendo implements Comparable<Comparendo> {

	public int OBJECTID;
	public Date FECHA_HORA;
	public String DES_INFRAC;
	public String MEDIO_DETE;
	public String CLASE_VEHI;
	public String TIPO_SERVI;
	public String INFRACCION;
	public String LOCALIDAD;

	public double latitud;
	public double longitud;


	public String retornarDatos(){
		//	Mostrar la información del comparendo (OBJECTID, FECHA_HORA, INFRACCION, CLASE_VEHI, TIPO_SERVI, LOCALIDAD) 

		String rta = "OBJECTID: "+OBJECTID +" FECHA_HORA: " + FECHA_HORA + " INFRACCION: " + INFRACCION + " CLASE_VEHI: "+CLASE_VEHI + " TIPO_SERVI: " +
				TIPO_SERVI + " LOCALIDAD: "+ LOCALIDAD;
		return rta;
	}


	public int compareTo(Comparendo comp) {

		if(FECHA_HORA.compareTo(comp.FECHA_HORA)==0){
			return (OBJECTID - comp.OBJECTID);
		}
		else{
			return FECHA_HORA.compareTo(comp.FECHA_HORA);
		}

	}
}
