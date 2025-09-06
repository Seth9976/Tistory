package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;

public class DataRewinderRegistry {
    public final HashMap a;
    public static final a b;

    static {
        DataRewinderRegistry.b = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public DataRewinderRegistry() {
        this.a = new HashMap();
    }

    @NonNull
    public DataRewinder build(@NonNull Object object0) {
        synchronized(this) {
            Preconditions.checkNotNull(object0);
            Class class0 = object0.getClass();
            Factory dataRewinder$Factory0 = (Factory)this.a.get(class0);
            if(dataRewinder$Factory0 == null) {
                for(Object object1: this.a.values()) {
                    Factory dataRewinder$Factory1 = (Factory)object1;
                    if(dataRewinder$Factory1.getDataClass().isAssignableFrom(object0.getClass())) {
                        dataRewinder$Factory0 = dataRewinder$Factory1;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(dataRewinder$Factory0 == null) {
                dataRewinder$Factory0 = DataRewinderRegistry.b;
            }
            return dataRewinder$Factory0.build(object0);
        }
    }

    public void register(@NonNull Factory dataRewinder$Factory0) {
        synchronized(this) {
            Class class0 = dataRewinder$Factory0.getDataClass();
            this.a.put(class0, dataRewinder$Factory0);
        }
    }
}

