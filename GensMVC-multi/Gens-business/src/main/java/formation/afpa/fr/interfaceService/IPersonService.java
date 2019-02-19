package formation.afpa.fr.interfaceService;

import java.util.List;

import formation.afpa.fr.entity.Person;
import formation.afpa.fr.exception.PersonAlreadyExistsException;
import formation.afpa.fr.exception.PersonFirstNameNotValidException;
import formation.afpa.fr.exception.PersonNotAvailableException;
import formation.afpa.fr.exception.PersonNotFoundException;
import formation.afpa.fr.exception.PersonNotValidException;

/**
 * 
 * @author 34011-65-08
 *
 */
public interface IPersonService {
	/**
	 * return the list of all entities in the BDD
	 * @return
	 * @throws PersonNotAvailableException
	 */
	
	public List<Person> list() throws PersonNotAvailableException;
	/**
	 * 
	 * @param firstName
	 * @return find a person by firstName
	 * @throws PersonNotFoundException
	 * @throws PersonFirstNameNotValidException
	 */
	
	public List<Person> findByFirstName(String firstName) throws PersonNotFoundException, PersonFirstNameNotValidException;
	
	/**
	 *  return an entity by id
	 * @param id of type long
	 * @return an entity
	 * @throws PersonNotFoundException
	 */
	public Person findById(Long id) throws PersonNotFoundException;
	/**
	 * Retrieves an entity by its id.
	 * <b>CREATE an entity.</b><br/>
	 * @param p Entity to create.
	 * @return
	 * @throws PersonNotValidException
	 * @throws PersonAlreadyExistsException
	 */
	public Person create(Person p) throws PersonNotValidException, PersonAlreadyExistsException;
	/**
	 * <b>Update the entity
	 * @param p
	 * @return updated
	 * @throws PersonNotValidException
	 * @throws PersonNotFoundException
	 */
	public Person update(Person p) throws PersonNotValidException, PersonNotFoundException;
	/**
	 * this method delete the entity.
	 * @param id
	 * @throws PersonNotFoundException
	 */
	public void deleteById(Long id) throws PersonNotFoundException;
	
	

}
