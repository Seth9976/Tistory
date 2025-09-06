package s6;

import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.util.List;

public final class b implements ObjectEncoder {
    public static final b a;
    public static final FieldDescriptor b;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b.b = FieldDescriptor.of("logRequest");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        List list0 = ((BatchedLogRequest)object0).getLogRequests();
        ((ObjectEncoderContext)object1).add(b.b, list0);
    }
}

