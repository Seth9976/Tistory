package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

public final class Options implements Key {
    public final CachedHashCodeArrayMap a;

    public Options() {
        this.a = new CachedHashCodeArrayMap();
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof Options ? this.a.equals(((Options)object0).a) : false;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public Object get(@NonNull Option option0) {
        return this.a.containsKey(option0) ? this.a.get(option0) : option0.getDefaultValue();
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.a.hashCode();
    }

    public void putAll(@NonNull Options options0) {
        this.a.putAll(options0.a);
    }

    public Options remove(@NonNull Option option0) {
        this.a.remove(option0);
        return this;
    }

    @NonNull
    public Options set(@NonNull Option option0, @NonNull Object object0) {
        this.a.put(option0, object0);
        return this;
    }

    @Override
    public String toString() {
        return "Options{values=" + this.a + '}';
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        for(int v = 0; true; ++v) {
            CachedHashCodeArrayMap cachedHashCodeArrayMap0 = this.a;
            if(v >= cachedHashCodeArrayMap0.size()) {
                break;
            }
            ((Option)cachedHashCodeArrayMap0.keyAt(v)).update(cachedHashCodeArrayMap0.valueAt(v), messageDigest0);
        }
    }
}

