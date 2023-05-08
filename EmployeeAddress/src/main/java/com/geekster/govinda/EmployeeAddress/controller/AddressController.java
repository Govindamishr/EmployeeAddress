package com.geekster.govinda.EmployeeAddress.controller;

import com.geekster.govinda.EmployeeAddress.model.Address;
import com.geekster.govinda.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")

public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "/")
    public String addAddresses(@RequestBody List<Address> addresses) {
        return addressService.addAddresses(addresses);

    }
    @GetMapping("/byId/{id}")

    public Optional<Address> getById(@PathVariable Long id){
        return addressService.getById(id);
    }
    @DeleteMapping(value = "/addresses/{id}")
    public String removeAddress(@PathVariable Long id) {
        return addressService.removeAddress(id);
    }
    @PutMapping(value = "/{id}")
    public String updateAddress(@PathVariable Long id, @RequestBody Address addresses) {
        return addressService.updateAddress(id, addresses);
    }

}
