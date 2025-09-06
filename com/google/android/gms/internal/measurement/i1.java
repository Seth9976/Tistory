package com.google.android.gms.internal.measurement;

public abstract class i1 {
    public static final h1 a;
    public static final h1 b;

    static {
        h1 h10 = null;
        try {
            h10 = (h1)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        i1.a = h10;
        i1.b = new h1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

