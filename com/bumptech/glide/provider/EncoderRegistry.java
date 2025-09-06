package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Encoder;
import g6.a;
import java.util.ArrayList;

public class EncoderRegistry {
    public final ArrayList a;

    public EncoderRegistry() {
        this.a = new ArrayList();
    }

    public void append(@NonNull Class class0, @NonNull Encoder encoder0) {
        synchronized(this) {
            a a0 = new a(class0, encoder0);
            this.a.add(a0);
        }
    }

    @Nullable
    public Encoder getEncoder(@NonNull Class class0) {
        synchronized(this) {
            for(Object object0: this.a) {
                a a0 = (a)object0;
                if(a0.a.isAssignableFrom(class0)) {
                    return a0.b;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    public void prepend(@NonNull Class class0, @NonNull Encoder encoder0) {
        synchronized(this) {
            a a0 = new a(class0, encoder0);
            this.a.add(0, a0);
        }
    }
}

