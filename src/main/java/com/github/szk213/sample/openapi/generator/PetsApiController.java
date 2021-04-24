package com.github.szk213.sample.openapi.generator;

import java.util.Optional;

import org.openapi.example.api.PetsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

@RestController
@RequestMapping("${pet.api.path}")
public class PetsApiController implements PetsApi {
    private final NativeWebRequest request;

    @Autowired
    public PetsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
}
