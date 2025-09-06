package androidx.datastore.preferences.protobuf;

public abstract class t0 {
    public static final s0 a;
    public static final q0 b;

    static {
        t0.a = new s0();  // 初始化器: Ljava/lang/Object;-><init>()V
        q0 q00 = null;
        try {
            q00 = (q0)Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        t0.b = q00;
    }
}

