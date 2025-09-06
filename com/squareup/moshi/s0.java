package com.squareup.moshi;

public abstract class s0 {
    public static final p0 a;
    public static final n0 b;
    public static final n0 c;
    public static final n0 d;
    public static final n0 e;
    public static final n0 f;
    public static final n0 g;
    public static final n0 h;
    public static final n0 i;
    public static final n0 j;

    static {
        s0.a = new p0();  // 初始化器: Ljava/lang/Object;-><init>()V
        s0.b = new n0(1);
        s0.c = new n0(2);
        s0.d = new n0(3);
        s0.e = new n0(4);
        s0.f = new n0(5);
        s0.g = new n0(6);
        s0.h = new n0(7);
        s0.i = new n0(8);
        s0.j = new n0(0);
    }

    public static int a(JsonReader jsonReader0, String s, int v, int v1) {
        int v2 = jsonReader0.nextInt();
        if(v2 < v || v2 > v1) {
            throw new JsonDataException("Expected " + s + " but was " + v2 + " at path " + "$");
        }
        return v2;
    }
}

