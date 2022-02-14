package ReposetoryClass;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import EntityClass.UserDetails;

@Repository
public interface UserDetailsReporasatory extends CrudRepository<UserDetails,Long>
{

}
