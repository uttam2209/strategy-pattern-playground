package com.learn.pattern.controller;

import com.learn.pattern.exception.InputIdException;
import com.learn.pattern.exception.InvalidAssetTypeException;
import com.learn.pattern.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    private final AssetStrategyFactory assetStrategyFactory;

    public TestController(AssetStrategyFactory assetStrategyFactory) {
        this.assetStrategyFactory = assetStrategyFactory;
    }

    @PostMapping("/asset")
    public ResponseEntity<ControllerResponse> assetController(@RequestBody AssetRequest input){
        try{
            int id = input.getId();
            if(id <= 0){
                throw new InputIdException("Id must be greater than 0");
            }
            String assetType = input.getAsset();
            OperationStrategy strategy = assetStrategyFactory.getOperationType(AssetType.valueOf(assetType));
            var result = strategy.perform(input);
            ControllerResponse response = ControllerResponse
                    .builder()
                    .result(result)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (IllegalArgumentException exception){
            throw new InvalidAssetTypeException("Invalid input asset type");
        }
    }
}
