package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

public class MultiTransformation implements Transformation {
    public final Collection a;

    public MultiTransformation(@NonNull Collection collection0) {
        if(collection0.isEmpty()) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.a = collection0;
    }

    @SafeVarargs
    public MultiTransformation(@NonNull Transformation[] arr_transformation) {
        if(arr_transformation.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.a = Arrays.asList(arr_transformation);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof MultiTransformation ? this.a.equals(((MultiTransformation)object0).a) : false;
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource transform(@NonNull Context context0, @NonNull Resource resource0, int v, int v1) {
        Resource resource1 = resource0;
        for(Object object0: this.a) {
            Resource resource2 = ((Transformation)object0).transform(context0, resource1, v, v1);
            if(resource1 != null && !resource1.equals(resource0) && !resource1.equals(resource2)) {
                resource1.recycle();
            }
            resource1 = resource2;
        }
        return resource1;
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        for(Object object0: this.a) {
            ((Transformation)object0).updateDiskCacheKey(messageDigest0);
        }
    }
}

