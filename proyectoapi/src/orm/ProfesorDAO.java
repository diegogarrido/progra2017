/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ProfesorDAO {
	public static Profesor loadProfesorByORMID(int id_pk) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return loadProfesorByORMID(session, id_pk);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor getProfesorByORMID(int id_pk) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return getProfesorByORMID(session, id_pk);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor loadProfesorByORMID(int id_pk, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return loadProfesorByORMID(session, id_pk, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor getProfesorByORMID(int id_pk, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return getProfesorByORMID(session, id_pk, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor loadProfesorByORMID(PersistentSession session, int id_pk) throws PersistentException {
		try {
			return (Profesor) session.load(orm.Profesor.class, new Integer(id_pk));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor getProfesorByORMID(PersistentSession session, int id_pk) throws PersistentException {
		try {
			return (Profesor) session.get(orm.Profesor.class, new Integer(id_pk));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor loadProfesorByORMID(PersistentSession session, int id_pk, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Profesor) session.load(orm.Profesor.class, new Integer(id_pk), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor getProfesorByORMID(PersistentSession session, int id_pk, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Profesor) session.get(orm.Profesor.class, new Integer(id_pk), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return queryProfesor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return queryProfesor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor[] listProfesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return listProfesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor[] listProfesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return listProfesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Profesor as Profesor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Profesor as Profesor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Profesor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor[] listProfesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProfesor(session, condition, orderBy);
			return (Profesor[]) list.toArray(new Profesor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor[] listProfesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProfesor(session, condition, orderBy, lockMode);
			return (Profesor[]) list.toArray(new Profesor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor loadProfesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return loadProfesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor loadProfesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return loadProfesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor loadProfesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Profesor[] profesors = listProfesorByQuery(session, condition, orderBy);
		if (profesors != null && profesors.length > 0)
			return profesors[0];
		else
			return null;
	}
	
	public static Profesor loadProfesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Profesor[] profesors = listProfesorByQuery(session, condition, orderBy, lockMode);
		if (profesors != null && profesors.length > 0)
			return profesors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProfesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return iterateProfesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Proyecto1PersistentManager.instance().getSession();
			return iterateProfesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Profesor as Profesor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Profesor as Profesor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Profesor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor createProfesor() {
		return new orm.Profesor();
	}
	
	public static boolean save(orm.Profesor profesor) throws PersistentException {
		try {
			orm.Proyecto1PersistentManager.instance().saveObject(profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Profesor profesor) throws PersistentException {
		try {
			orm.Proyecto1PersistentManager.instance().deleteObject(profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Profesor profesor)throws PersistentException {
		try {
			orm.Asignatura[] lAsignaturas = profesor.asignatura.toArray();
			for(int i = 0; i < lAsignaturas.length; i++) {
				lAsignaturas[i].setProfesorid_id_fk(null);
			}
			return delete(profesor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Profesor profesor, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Asignatura[] lAsignaturas = profesor.asignatura.toArray();
			for(int i = 0; i < lAsignaturas.length; i++) {
				lAsignaturas[i].setProfesorid_id_fk(null);
			}
			try {
				session.delete(profesor);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Profesor profesor) throws PersistentException {
		try {
			orm.Proyecto1PersistentManager.instance().getSession().refresh(profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Profesor profesor) throws PersistentException {
		try {
			orm.Proyecto1PersistentManager.instance().getSession().evict(profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Profesor loadProfesorByCriteria(ProfesorCriteria profesorCriteria) {
		Profesor[] profesors = listProfesorByCriteria(profesorCriteria);
		if(profesors == null || profesors.length == 0) {
			return null;
		}
		return profesors[0];
	}
	
	public static Profesor[] listProfesorByCriteria(ProfesorCriteria profesorCriteria) {
		return profesorCriteria.listProfesor();
	}
}
