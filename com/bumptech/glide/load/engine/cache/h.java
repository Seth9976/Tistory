package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.pool.FactoryPools.Factory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class h implements Factory {
    @Override  // com.bumptech.glide.util.pool.FactoryPools$Factory
    public final Object create() {
        try {
            return new i(MessageDigest.getInstance("SHA-256"));
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
    }
}

