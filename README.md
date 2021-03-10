# Description

This is a simple application to generate Bitcoin address on the go, implemented using [BitcoinJ Library](https://github.com/bitcoinj/bitcoinj)

# Prerequest

Java JDK 8+

# Usage

download the release from [here](https://github.com/emilmichaiel/SimpleBTCAddressGenerator/releases/tag/1.0-SNAPSHOT)

```sh
java -jar BTCAddressGenerator.jar
```

# Output Example

```sh
Private Key             : 3f7c506a1fe74e869b418e8e433d361cab1b08d29e28c5214141c8d22431e144
Public Key Compressed   : 023feced7f367e738ef2e450b33c7cbc52b325035d51a2d67343c5342b72547c5e
Address Compressed      : 1Pr7RckmKBnqmZda3RuZWDRyNT14CNCsGd
WIF Compressed          : KyM7qD6byqLPkAjJUWk6Yf2NT7BASvm4DSoucva8RjL6cCSqiGQc
Public Key Uncompressed : 043feced7f367e738ef2e450b33c7cbc52b325035d51a2d67343c5342b72547c5ed24f89b20c0e003f8e4bb502ab21abf0a557fbbd802222e9c1e907723f5ec05c
Address Uncompressed    : 1LWJTSr7gwXiWos87b5GzQvNdR6yv27bv2
WIF Uncompressed        : 5JJFEeBLFgx9KqspTdC89XpSFXQ9V5UetJdTRTBgHvzo8ajhKTc
Segwit Address          : bc1ql2wgxgq09rxe5e85gzql8u6pj36hgfr8cwh5kn
```
