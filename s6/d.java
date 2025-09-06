package s6;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.util.List;

public final class d implements ObjectEncoder {
    public static final d a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;

    static {
        d.a = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d.b = FieldDescriptor.of("requestTimeMs");
        d.c = FieldDescriptor.of("requestUptimeMs");
        d.d = FieldDescriptor.of("clientInfo");
        d.e = FieldDescriptor.of("logSource");
        d.f = FieldDescriptor.of("logSourceName");
        d.g = FieldDescriptor.of("logEvent");
        d.h = FieldDescriptor.of("qosTier");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((LogRequest)object0).getRequestTimeMs();
        ((ObjectEncoderContext)object1).add(d.b, v);
        long v1 = ((LogRequest)object0).getRequestUptimeMs();
        ((ObjectEncoderContext)object1).add(d.c, v1);
        ClientInfo clientInfo0 = ((LogRequest)object0).getClientInfo();
        ((ObjectEncoderContext)object1).add(d.d, clientInfo0);
        Integer integer0 = ((LogRequest)object0).getLogSource();
        ((ObjectEncoderContext)object1).add(d.e, integer0);
        String s = ((LogRequest)object0).getLogSourceName();
        ((ObjectEncoderContext)object1).add(d.f, s);
        List list0 = ((LogRequest)object0).getLogEvents();
        ((ObjectEncoderContext)object1).add(d.g, list0);
        QosTier qosTier0 = ((LogRequest)object0).getQosTier();
        ((ObjectEncoderContext)object1).add(d.h, qosTier0);
    }
}

