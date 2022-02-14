package ReposetoryClass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EntityClass.Address;

@Repository
public interface AddressReporesatory extends JpaRepository<Address, Long>
{

}
