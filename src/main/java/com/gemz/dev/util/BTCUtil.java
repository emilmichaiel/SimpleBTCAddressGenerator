package com.gemz.dev.util;

import com.gemz.dev.model.BTC;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.LegacyAddress;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.SegwitAddress;
import org.bitcoinj.params.MainNetParams;

import java.math.BigInteger;

public class BTCUtil {

    private BTC btc;

    public BTCUtil(String privateKey) {
        btc = new BTC();
        NetworkParameters params = MainNetParams.get();
        BigInteger privKey = new BigInteger(privateKey, 16);
        ECKey key = ECKey.fromPrivate(privKey);

        btc.setPrivateKey(privateKey);

        btc.setPublicKeyCompressed(key.getPublicKeyAsHex());
        btc.setWifCompressed(key.getPrivateKeyAsWiF(params));
        btc.setAddressCompressed(LegacyAddress.fromKey(params, key).toString());

        btc.setPublicKeyDecompressed(key.decompress().getPublicKeyAsHex());
        btc.setWifDecompressed(key.decompress().getPrivateKeyAsWiF(params));
        btc.setAddressDecompressed(LegacyAddress.fromKey(params, key.decompress()).toString());

        btc.setSegwitAddress(SegwitAddress.fromKey(params, key).toString());
    }

    public BTC getBTC() {
        return this.btc;
    }
}
