package com.pinet.app.service;

import com.pinet.app.dao.UserDataEntity;
import com.pinet.app.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by ashmeet on 7/15/17.
 */
@Service
public class InsertService {
    @Autowired
    UserDataRepository userDataRepository;

    public String insertUser(){
        UserDataEntity userDataEntity=new UserDataEntity();
        userDataEntity.setName("Ashmeet");
        userDataEntity.setUsername("ashmeet4293");
        userDataEntity.setDob(new Date());
        userDataEntity.setGender('M');
        userDataEntity.setNationality("Nepali");
        userDataEntity.setCitizenNo("101-10101-101001");
        userDataEntity.setPassportNo("202-202-0222-22");
        userDataEntity.setFatherName("Pawan Tiwary");
        userDataEntity.setEmail("ashmeet4293@gmail.com");
        userDataEntity.setAddress("Pokhara");
        userDataEntity.setMobileNo("9846744037");
        userDataEntity.setPhoneNo("061-44037");
        userDataEntity.setOccupancyType("Trainer and Developer");
        userDataEntity.setServiceCode("001");
        userDataEntity.setSubscriptionType("Wireless");
        userDataEntity.setInstallationAddress("Pokhara-6 jarebar");

        userDataRepository.save(userDataEntity);
        return "Data Inserted successfully ";


    }
}
