package com.gizmosoft.novelist.userbooks;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserBooksRepository extends CassandraRepository<UserBooks, UserBooksPrimarykey>{
    
}
