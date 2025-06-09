package com.learn.pattern.service;

import com.learn.pattern.model.AssetRequest;
import com.learn.pattern.model.AssetType;
import com.learn.pattern.model.OperationStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AssociateOperation implements OperationStrategy {

    @Override
    public String perform(AssetRequest input) {
        return "associate";
    }

    @Override
    public AssetType getSupportedAssetType() {
        return AssetType.ASSOCIATE;
    }
}
