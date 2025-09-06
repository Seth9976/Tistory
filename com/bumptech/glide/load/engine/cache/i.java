package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;

public final class i implements Poolable {
    public final MessageDigest a;
    public final StateVerifier b;

    public i(MessageDigest messageDigest0) {
        this.b = StateVerifier.newInstance();
        this.a = messageDigest0;
    }

    @Override  // com.bumptech.glide.util.pool.FactoryPools$Poolable
    public final StateVerifier getVerifier() {
        return this.b;
    }
}

