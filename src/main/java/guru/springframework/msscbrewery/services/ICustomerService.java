package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;

public interface ICustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
