package com.anudeep.jobquestbackend;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JobRepository extends MongoRepository<Job, ObjectId> {
    List<Job> findByCandidateEmail(String email);
}
