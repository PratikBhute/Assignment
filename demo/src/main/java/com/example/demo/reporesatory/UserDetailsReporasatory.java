package com.example.demo.reporesatory;
import com.example.demo.model.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsReporasatory extends CrudRepository<UserDetails,Long>
{

}
