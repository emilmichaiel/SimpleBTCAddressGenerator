package com.gemz.dev.model;

import lombok.Data;

@Data
public class BTC {

    private String privateKey;

    private String publicKeyCompressed;
    private String addressCompressed;
    private String wifCompressed;

    private String publicKeyDecompressed;
    private String addressDecompressed;
    private String wifDecompressed;

    private String segwitAddress;
}
