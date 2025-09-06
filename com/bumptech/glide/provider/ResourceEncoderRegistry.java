package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ResourceEncoder;
import g6.c;
import java.util.ArrayList;

public class ResourceEncoderRegistry {
    public final ArrayList a;

    public ResourceEncoderRegistry() {
        this.a = new ArrayList();
    }

    public void append(@NonNull Class class0, @NonNull ResourceEncoder resourceEncoder0) {
        synchronized(this) {
            c c0 = new c(class0, resourceEncoder0);
            this.a.add(c0);
        }
    }

    @Nullable
    public ResourceEncoder get(@NonNull Class class0) {
        synchronized(this) {
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                c c0 = (c)this.a.get(v2);
                if(c0.a.isAssignableFrom(class0)) {
                    return c0.b;
                }
            }
            return null;
        }
    }

    public void prepend(@NonNull Class class0, @NonNull ResourceEncoder resourceEncoder0) {
        synchronized(this) {
            c c0 = new c(class0, resourceEncoder0);
            this.a.add(0, c0);
        }
    }
}

