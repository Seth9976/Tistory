package androidx.datastore.preferences.protobuf;

public abstract class o2 {
    public static final NewInstanceSchema a;
    public static final n2 b;

    static {
        NewInstanceSchema newInstanceSchema0 = null;
        try {
            newInstanceSchema0 = (NewInstanceSchema)Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        o2.a = newInstanceSchema0;
        o2.b = new n2();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

