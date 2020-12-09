package utiles;


import java.util.HashSet;
import java.util.Set;
import java.util.List;
import modelos.Equipos;
import modelos.Jugadores;

import org.hibernate.Session;

public class ClienteHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ClienteHibernate();
		
	}
	
	public ClienteHibernate() {
		listarEquipos();
		//listarJugadores();
	}
	
	private List<Equipos> listarEquipos(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Equipos> result = (List<Equipos>)session.createQuery("from Equipos").list();
		session.getTransaction().commit();
		for(Equipos equipo: result) {
			System.out.println("Equipo: "+equipo.toString());
			System.out.println("************El Plantel****************");
			//Set<Jugadores> hset = equipo.getJugadores();
			for (Jugadores jug: equipo.getJugadores()) {
				System.out.println(jug.toString());
			}
		}
		return result;
	}
	
	
	private List<Jugadores> listarJugadores(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Jugadores> result = (List<Jugadores>)session.createQuery("from Jugadores").list();
		session.getTransaction().commit();
		for(Jugadores jugador: result) {
			System.out.println("Jugador: "+jugador.toString());
		}
		return result;
	}

}
