package com.mobiloitte.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.com.model.Csvmodel;

public interface Csvdao extends JpaRepository<Csvmodel,Long> {

}
