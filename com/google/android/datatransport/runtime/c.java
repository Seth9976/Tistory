package com.google.android.datatransport.runtime;

import androidx.room.a;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class c implements ObjectEncoder {
    public static final c a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c.b = a.e(1, FieldDescriptor.builder("eventsDroppedCount"));
        c.c = a.e(3, FieldDescriptor.builder("reason"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((LogEventDropped)object0).getEventsDroppedCount();
        ((ObjectEncoderContext)object1).add(c.b, v);
        Reason logEventDropped$Reason0 = ((LogEventDropped)object0).getReason();
        ((ObjectEncoderContext)object1).add(c.c, logEventDropped$Reason0);
    }
}

