package com.example.caching.repository;

import com.example.caching.HazelCastDataModel.HazelCast;
import com.hazelcast.instance.impl.HazelcastManagedContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HazelCastRepository extends JpaRepository<HazelCast,Long> {

    List<HazelCast> getAll();

}
