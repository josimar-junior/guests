package com.jj.guest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jj.guest.model.Guest;

public interface Guests extends JpaRepository<Guest, Long> {

}
