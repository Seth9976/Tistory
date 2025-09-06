package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.util.List;

public final class a implements ObjectEncoder {
    public static final a a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a.b = androidx.room.a.e(1, FieldDescriptor.builder("window"));
        a.c = androidx.room.a.e(2, FieldDescriptor.builder("logSourceMetrics"));
        a.d = androidx.room.a.e(3, FieldDescriptor.builder("globalMetrics"));
        a.e = androidx.room.a.e(4, FieldDescriptor.builder("appNamespace"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        TimeWindow timeWindow0 = ((ClientMetrics)object0).getWindowInternal();
        ((ObjectEncoderContext)object1).add(a.b, timeWindow0);
        List list0 = ((ClientMetrics)object0).getLogSourceMetricsList();
        ((ObjectEncoderContext)object1).add(a.c, list0);
        GlobalMetrics globalMetrics0 = ((ClientMetrics)object0).getGlobalMetricsInternal();
        ((ObjectEncoderContext)object1).add(a.d, globalMetrics0);
        String s = ((ClientMetrics)object0).getAppNamespace();
        ((ObjectEncoderContext)object1).add(a.e, s);
    }
}

