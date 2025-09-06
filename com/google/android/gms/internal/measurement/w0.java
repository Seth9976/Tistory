package com.google.android.gms.internal.measurement;

public abstract class w0 {
    public static final v0 a;
    public static final v0 b;

    static {
        w0.a = new v0();  // 初始化器: Ljava/lang/Object;-><init>()V
        v0 v00 = null;
        try {
            v00 = (v0)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        w0.b = v00;
    }
}

