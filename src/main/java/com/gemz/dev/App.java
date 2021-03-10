package com.gemz.dev;

import com.gemz.dev.model.BTC;
import com.gemz.dev.util.BTCUtil;
import com.gemz.dev.util.RandomPrivateKeyGenerator;

public class App {

    public static void main(String[] args) {
        BTC btc = new BTCUtil(new RandomPrivateKeyGenerator().getRandomPrivateKey()).getBTC();
        System.out.println("Private Key             : " + btc.getPrivateKey());
        System.out.println("Public Key Compressed   : " + btc.getPublicKeyCompressed());
        System.out.println("Address Compressed      : " + btc.getAddressCompressed());
        System.out.println("WIF Compressed          : " + btc.getWifCompressed());
        System.out.println("Public Key Uncompressed : " + btc.getPublicKeyDecompressed());
        System.out.println("Address Uncompressed    : " + btc.getAddressDecompressed());
        System.out.println("WIF Uncompressed        : " + btc.getWifDecompressed());
        System.out.println("Segwit Address          : " + btc.getSegwitAddress());
    }

}
