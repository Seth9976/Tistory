package com.google.android.datatransport.runtime;

import androidx.room.a;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class g implements ObjectEncoder {
    public static final g a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        g.b = a.e(1, FieldDescriptor.builder("startMs"));
        g.c = a.e(2, FieldDescriptor.builder("endMs"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((TimeWindow)object0).getStartMs();
        ((ObjectEncoderContext)object1).add(g.b, v);
        long v1 = ((TimeWindow)object0).getEndMs();
        ((ObjectEncoderContext)object1).add(g.c, v1);
    }
}

