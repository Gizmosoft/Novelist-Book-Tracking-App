package com.gizmosoft.novelist.user;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface BooksByUserRepository extends CassandraRepository<BooksByUser, String> {

    // Overloading findAllById method to return a Slice/Page of a data - Collection of Books by user
    Slice<BooksByUser> findAllById(String id, Pageable pageable);
    
}
