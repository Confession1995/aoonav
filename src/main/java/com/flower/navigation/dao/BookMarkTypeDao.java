package com.flower.navigation.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.flower.navigation.entity.BookmarkTypeEntity;
import com.flower.navigation.entity.UserEntity;


@Repository
@Transactional
public interface BookMarkTypeDao extends PagingAndSortingRepository<BookmarkTypeEntity, Integer>, JpaSpecificationExecutor<BookmarkTypeEntity>{

	List<BookmarkTypeEntity>  findAll();

}
