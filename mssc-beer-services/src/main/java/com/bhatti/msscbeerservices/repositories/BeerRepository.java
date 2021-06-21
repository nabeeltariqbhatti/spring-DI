package com.bhatti.msscbeerservices.repositories;

import com.bhatti.msscbeerservices.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}