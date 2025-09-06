package s6;

import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class c implements ObjectEncoder {
    public static final c a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c.b = FieldDescriptor.of("eventTimeMs");
        c.c = FieldDescriptor.of("eventCode");
        c.d = FieldDescriptor.of("eventUptimeMs");
        c.e = FieldDescriptor.of("sourceExtension");
        c.f = FieldDescriptor.of("sourceExtensionJsonProto3");
        c.g = FieldDescriptor.of("timezoneOffsetSeconds");
        c.h = FieldDescriptor.of("networkConnectionInfo");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((LogEvent)object0).getEventTimeMs();
        ((ObjectEncoderContext)object1).add(c.b, v);
        Integer integer0 = ((LogEvent)object0).getEventCode();
        ((ObjectEncoderContext)object1).add(c.c, integer0);
        long v1 = ((LogEvent)object0).getEventUptimeMs();
        ((ObjectEncoderContext)object1).add(c.d, v1);
        byte[] arr_b = ((LogEvent)object0).getSourceExtension();
        ((ObjectEncoderContext)object1).add(c.e, arr_b);
        String s = ((LogEvent)object0).getSourceExtensionJsonProto3();
        ((ObjectEncoderContext)object1).add(c.f, s);
        long v2 = ((LogEvent)object0).getTimezoneOffsetSeconds();
        ((ObjectEncoderContext)object1).add(c.g, v2);
        NetworkConnectionInfo networkConnectionInfo0 = ((LogEvent)object0).getNetworkConnectionInfo();
        ((ObjectEncoderContext)object1).add(c.h, networkConnectionInfo0);
    }
}

