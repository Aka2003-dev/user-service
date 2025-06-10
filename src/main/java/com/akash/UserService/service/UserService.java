package com.akash.UserService.service;

import com.akash.UserService.dtos.ServiceBookingRequest;
//import com.akash.UserService.kafka.BookingEventPublisher;
import com.akash.UserService.model.User;
import com.akash.UserService.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;
    //private final BookingEventPublisher eventPublisher;
    private final WebClient.Builder webClientBuilder;


    public void saveUser(User user) {
        userRepo.save(user);
    }

    public void bookService(ServiceBookingRequest request) {
        // eventPublisher.publish(request);

        webClientBuilder.build()
                .post()
                .uri("https://bill-service-6fnu.onrender.com/api/bill/save")
                .bodyValue(request)
                .retrieve()
                .toBodilessEntity()
                .block();
        return;
    }


}
