package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerQuantityBadQuery extends Exception {

    public BeerQuantityBadQuery(String search) {
        super(String.format("Tried to query beers by quantitities with %s. Expected: /beers?search=quantity>X", search));
    }
}
