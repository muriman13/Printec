package com.printec.printecTask.Repository;

import com.printec.printecTask.Dto.CatBreed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatBreedRepo extends JpaRepository<CatBreed, Long> {
}
