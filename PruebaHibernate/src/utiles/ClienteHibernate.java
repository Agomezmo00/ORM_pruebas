package utiles;


import java.util.HashSet;
import java.util.Set;
import java.util.List;
import modelos.Equipos;
import modelos.Jugadores;
import modelos.Partidos;

import org.hibernate.Session;

public class ClienteHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ClienteHibernate();
		
	}
	
	public ClienteHibernate() {
		//crearAlmacenarEquipo();
		listarEquipos();
		//listarJugadores();
		//listarPartidos();
	}
	
	private List<Equipos> listarEquipos(){
		
		//Generamos la Session a partir del SessionFactory que tenemos en HibernateUtil
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		//Una vez con la session creada, podemos hacer operaciones que van englobadas dentro de una transacciï¿½n
		session.beginTransaction();
		
		//Crea un objeto consulta
		List<Equipos> result = (List<Equipos>)session.createQuery("from Equipos where nombre like 'B%'").list();
		
		//Finaliza la transacciï¿½n con commit
		session.getTransaction().commit();
		
		for(Equipos equipo: result) {
			System.out.println("Equipo: "+equipo.toString());
			
			System.out.println("************El Plantel****************");
			for (Jugadores jug: equipo.getJugadores()) {
				System.out.println(jug.toString());
			}
			
		}
		return result;
	}
	
	private List<Jugadores> listarJugadores(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Jugadores> result = (List<Jugadores>)session.createQuery("from Jugadores WHERE procedencia like 'Sp%'").list();
		session.getTransaction().commit();
		for(Jugadores jugador: result) {
			System.out.println("Jugador: "+jugador.toString());
		}
		return result;
	}
	
	private List<Partidos> listarPartidos(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		List<Partidos> result = (List<Partidos>)session.createQuery("from Partidos WHERE temporada = '07/08' and equipo_local='Lakers'").list();
		
		session.getTransaction().commit();
		for(Partidos p: result) {
			
			if(p.getPuntos_visitante() > p.getPuntos_local()) {
				System.out.println(p.getVisitante().getNombre());			
				}
			
		}
		return result;
	}

	private String crearAlmacenarEquipo() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Equipos e = new Equipos();
		e.setNombre("Basket Jaca B");
		e.setCiudad("Jaca");
		e.setDivision("Atlantic");
		e.setConferencia("East");
		
		Jugadores j = new Jugadores();
		j.setNombre("Rodrigo San Miguel");
		j.setAltura("6-4");
		j.setPeso(88);
		j.setProcedencia("Zaragoza");
		j.setEquipo(e);
		j.setPosicion("G");
		
		session.save(e);
		session.save(j);
		session.getTransaction().commit();
		System.out.println("Insertado el equipo de Sabiñánigo");
		
		this.listarEquipos();
		return e.getNombre();
		
		
		
	}
}
