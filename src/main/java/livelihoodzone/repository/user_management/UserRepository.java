package livelihoodzone.repository.user_management;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import livelihoodzone.entity.user_management.User;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

  boolean existsByUserEmail(@Param("UserEmail") String userName);

  //User findByUserName(@Param("UserName") String userName);

  User findByUserEmail(@Param("UserEmail") String userEmail);

  @Transactional
  void deleteByUserEmail(@Param("UserEmail") String userEmail);

}