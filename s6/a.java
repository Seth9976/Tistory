package s6;

import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class a implements ObjectEncoder {
    public static final a a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;
    public static final FieldDescriptor i;
    public static final FieldDescriptor j;
    public static final FieldDescriptor k;
    public static final FieldDescriptor l;
    public static final FieldDescriptor m;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a.b = FieldDescriptor.of("sdkVersion");
        a.c = FieldDescriptor.of("model");
        a.d = FieldDescriptor.of("hardware");
        a.e = FieldDescriptor.of("device");
        a.f = FieldDescriptor.of("product");
        a.g = FieldDescriptor.of("osBuild");
        a.h = FieldDescriptor.of("manufacturer");
        a.i = FieldDescriptor.of("fingerprint");
        a.j = FieldDescriptor.of("locale");
        a.k = FieldDescriptor.of("country");
        a.l = FieldDescriptor.of("mccMnc");
        a.m = FieldDescriptor.of("applicationBuild");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        Integer integer0 = ((AndroidClientInfo)object0).getSdkVersion();
        ((ObjectEncoderContext)object1).add(a.b, integer0);
        String s = ((AndroidClientInfo)object0).getModel();
        ((ObjectEncoderContext)object1).add(a.c, s);
        String s1 = ((AndroidClientInfo)object0).getHardware();
        ((ObjectEncoderContext)object1).add(a.d, s1);
        String s2 = ((AndroidClientInfo)object0).getDevice();
        ((ObjectEncoderContext)object1).add(a.e, s2);
        String s3 = ((AndroidClientInfo)object0).getProduct();
        ((ObjectEncoderContext)object1).add(a.f, s3);
        String s4 = ((AndroidClientInfo)object0).getOsBuild();
        ((ObjectEncoderContext)object1).add(a.g, s4);
        String s5 = ((AndroidClientInfo)object0).getManufacturer();
        ((ObjectEncoderContext)object1).add(a.h, s5);
        String s6 = ((AndroidClientInfo)object0).getFingerprint();
        ((ObjectEncoderContext)object1).add(a.i, s6);
        String s7 = ((AndroidClientInfo)object0).getLocale();
        ((ObjectEncoderContext)object1).add(a.j, s7);
        String s8 = ((AndroidClientInfo)object0).getCountry();
        ((ObjectEncoderContext)object1).add(a.k, s8);
        String s9 = ((AndroidClientInfo)object0).getMccMnc();
        ((ObjectEncoderContext)object1).add(a.l, s9);
        String s10 = ((AndroidClientInfo)object0).getApplicationBuild();
        ((ObjectEncoderContext)object1).add(a.m, s10);
    }
}

