package com.google.android.datatransport.runtime;

import androidx.room.a;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class f implements ObjectEncoder {
    public static final f a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        f.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        f.b = a.e(1, FieldDescriptor.builder("currentCacheSizeBytes"));
        f.c = a.e(2, FieldDescriptor.builder("maxCacheSizeBytes"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((StorageMetrics)object0).getCurrentCacheSizeBytes();
        ((ObjectEncoderContext)object1).add(f.b, v);
        long v1 = ((StorageMetrics)object0).getMaxCacheSizeBytes();
        ((ObjectEncoderContext)object1).add(f.c, v1);
    }
}

