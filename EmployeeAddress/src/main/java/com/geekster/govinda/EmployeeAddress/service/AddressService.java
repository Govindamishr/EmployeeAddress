package com.geekster.govinda.EmployeeAddress.service;

import com.geekster.govinda.EmployeeAddress.model.Address;
import com.geekster.govinda.EmployeeAddress.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AddressService {
    @Autowired
    IAddressRepository addressRepository;

    public String addAddresses(List<Address> addresses) {
        Iterable<Address> addressList = addressRepository.saveAll(addresses);
        if ( addressList == null ) {
            return "Addresses cannot be added";
        }
        return "Addresses Added SuccessFully";
    }

    public Optional<Address> getById(Long id) {

        return addressRepository.findById(id);
    }
    public String removeAddress(Long id) {
        Optional<Address> addresses = addressRepository.findById(id);
        if (addresses.isEmpty()) {
            return "Address with address Id: " + id + " not found";
        }
        else  {
            addressRepository.deleteById(id);
            return "Address with address Id: " + id + " deleted successfully";
        }
    }

    public String updateAddress(Long id, Address addresses) {
        Optional<Address> addressList = addressRepository.findById(id);
        addresses.setId(id);
        if (addressList.isEmpty()) {
            return "Address with address Id: " + id + " not found";
        }
        else  {
            addressRepository.save(addresses);
            return "Address with address Id: " + id + " deleted successfully";
        }
    }
}
