package com.learn.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssetRequest {
    private int id;
    private String asset;
    private AssetInfo assetInfo;

}
