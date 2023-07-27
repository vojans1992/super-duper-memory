package com.tim1.cook.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tim1.cook.entities.RecipeIngredientRatioEntity;
import com.tim1.cook.entities.RecipeIngredientRatioKey;

public interface RecipeIngredientRatioRepository extends CrudRepository<RecipeIngredientRatioEntity, RecipeIngredientRatioKey> {

}