package com.kkhindigyan.app.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kkhindigyan.app.entities.User;

public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User, Integer> {

}
