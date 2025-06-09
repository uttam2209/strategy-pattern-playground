package com.learn.pattern.model;

import org.springframework.stereotype.Component;

@Component
public interface OperationStrategy {
    String perform(AssetRequest input);
    AssetType getSupportedAssetType();
}
