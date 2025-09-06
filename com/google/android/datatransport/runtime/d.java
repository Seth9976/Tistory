package com.google.android.datatransport.runtime;

import androidx.room.a;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.util.List;

public final class d implements ObjectEncoder {
    public static final d a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        d.a = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d.b = a.e(1, FieldDescriptor.builder("logSource"));
        d.c = a.e(2, FieldDescriptor.builder("logEventDropped"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((LogSourceMetrics)object0).getLogSource();
        ((ObjectEncoderContext)object1).add(d.b, s);
        List list0 = ((LogSourceMetrics)object0).getLogEventDroppedList();
        ((ObjectEncoderContext)object1).add(d.c, list0);
    }
}

