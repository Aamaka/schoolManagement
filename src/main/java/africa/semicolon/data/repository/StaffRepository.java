package africa.semicolon.data.repository;

import africa.semicolon.data.model.Staffs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends MongoRepository<Staffs, String> {

}
