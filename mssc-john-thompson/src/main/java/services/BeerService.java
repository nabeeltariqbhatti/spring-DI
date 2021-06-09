package services;

import model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
