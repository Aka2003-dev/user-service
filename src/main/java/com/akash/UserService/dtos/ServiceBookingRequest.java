package com.akash.UserService.dtos;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceBookingRequest {
    private String userName;
    private String serviceType;    // e.g., AC Repair
    private String dateSlot;       // e.g., 2025-06-05 3-5PM
    private String address;
    private String vendorName;
    private Double amount;


}