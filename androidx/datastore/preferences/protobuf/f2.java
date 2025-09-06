package androidx.datastore.preferences.protobuf;

public abstract class f2 {
    public static final MapFieldSchema a;
    public static final e2 b;

    static {
        MapFieldSchema mapFieldSchema0 = null;
        try {
            mapFieldSchema0 = (MapFieldSchema)Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        f2.a = mapFieldSchema0;
        f2.b = new e2();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

