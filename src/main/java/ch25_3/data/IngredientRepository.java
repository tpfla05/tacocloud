package ch25_3.data;

import org.springframework.data.repository.CrudRepository;
import ch25_3.Ingredient;

public interface IngredientRepository
            extends CrudRepository<Ingredient, String> {
}
