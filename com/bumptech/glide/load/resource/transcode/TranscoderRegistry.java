package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import f6.a;
import java.util.ArrayList;
import java.util.List;

public class TranscoderRegistry {
    public final ArrayList a;

    public TranscoderRegistry() {
        this.a = new ArrayList();
    }

    @NonNull
    public ResourceTranscoder get(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            if(class1.isAssignableFrom(class0)) {
                return UnitTranscoder.get();
            }
            for(Object object0: this.a) {
                a a0 = (a)object0;
                if(a0.a.isAssignableFrom(class0) && class1.isAssignableFrom(a0.b)) {
                    return a0.c;
                }
                if(false) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + class0 + " to " + class1);
    }

    @NonNull
    public List getTranscodeClasses(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            List list0 = new ArrayList();
            if(class1.isAssignableFrom(class0)) {
                ((ArrayList)list0).add(class1);
                return list0;
            }
            for(Object object0: this.a) {
                a a0 = (a)object0;
                if(a0.a.isAssignableFrom(class0) && class1.isAssignableFrom(a0.b) && !((ArrayList)list0).contains(a0.b)) {
                    ((ArrayList)list0).add(a0.b);
                }
            }
            return list0;
        }
    }

    public void register(@NonNull Class class0, @NonNull Class class1, @NonNull ResourceTranscoder resourceTranscoder0) {
        synchronized(this) {
            a a0 = new a(class0, class1, resourceTranscoder0);
            this.a.add(a0);
        }
    }
}

