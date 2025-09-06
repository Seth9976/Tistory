package com.google.android.datatransport.runtime;

import androidx.room.a;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class b implements ObjectEncoder {
    public static final b a;
    public static final FieldDescriptor b;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b.b = a.e(1, FieldDescriptor.builder("storageMetrics"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        StorageMetrics storageMetrics0 = ((GlobalMetrics)object0).getStorageMetricsInternal();
        ((ObjectEncoderContext)object1).add(b.b, storageMetrics0);
    }
}

