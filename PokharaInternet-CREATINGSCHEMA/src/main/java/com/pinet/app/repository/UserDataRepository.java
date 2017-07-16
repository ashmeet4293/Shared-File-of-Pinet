package com.pinet.app.repository;

import com.pinet.app.dao.UserDataEntity;
import com.pinet.app.dao.UserDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ashmeet on 7/15/17.
 */
public interface UserDataRepository extends JpaRepository<UserDataEntity,Integer > {
}
