package com.learn.pattern.model;

import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
public class AssetStrategyFactory {
    private final Map<AssetType, OperationStrategy> map = new EnumMap<>(AssetType.class);

    public AssetStrategyFactory(List<OperationStrategy> strategies) {
        for(OperationStrategy strategy: strategies){
            map.put(strategy.getSupportedAssetType(), strategy);
        }
    }

    public OperationStrategy getOperationType(AssetType assetType){
        return map.get(assetType);
    }
}
