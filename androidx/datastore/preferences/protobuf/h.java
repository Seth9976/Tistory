package androidx.datastore.preferences.protobuf;

public abstract class h {
    public static int A(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.J(arr_b, v1, g0);
        ((z1)internal$ProtobufList0).addLong(-(g0.b & 1L) ^ g0.b >>> 1);
        while(v3 < v2) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            v3 = h.J(arr_b, v4, g0);
            ((z1)internal$ProtobufList0).addLong(-(g0.b & 1L) ^ g0.b >>> 1);
        }
        return v3;
    }

    public static int B(byte[] arr_b, int v, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if(v2 == 0) {
            g0.c = "";
            return v1;
        }
        g0.c = new String(arr_b, v1, v2, Internal.a);
        return v1 + v2;
    }

    public static int C(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.H(arr_b, v1, g0);
        int v4 = g0.a;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add("");
            goto label_8;
        }
        else {
            internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.a));
        }
    alab1:
        while(true) {
            v3 += v4;
            while(true) {
            label_8:
                if(v3 >= v2) {
                    break alab1;
                }
                int v5 = h.H(arr_b, v3, g0);
                if(v != g0.a) {
                    break alab1;
                }
                v3 = h.H(arr_b, v5, g0);
                v4 = g0.a;
                if(v4 < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                if(v4 != 0) {
                    internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.a));
                    break;
                }
                internal$ProtobufList0.add("");
            }
        }
        return v3;
    }

    public static int D(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.H(arr_b, v1, g0);
        int v4 = g0.a;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add("");
            goto label_10;
        }
        int v5 = v3 + v4;
        if(g4.a.l(0, arr_b, v3, v5) != 0) {
            throw InvalidProtocolBufferException.c();
        }
        internal$ProtobufList0.add(new String(arr_b, v3, v4, Internal.a));
    alab1:
        while(true) {
            v3 = v5;
            while(true) {
            label_10:
                if(v3 >= v2) {
                    return v3;
                }
                int v6 = h.H(arr_b, v3, g0);
                if(v != g0.a) {
                    return v3;
                }
                v3 = h.H(arr_b, v6, g0);
                int v7 = g0.a;
                if(v7 < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                if(v7 != 0) {
                    v5 = v3 + v7;
                    if(g4.a.l(0, arr_b, v3, v5) != 0) {
                        break alab1;
                    }
                    internal$ProtobufList0.add(new String(arr_b, v3, v7, Internal.a));
                    break;
                }
                internal$ProtobufList0.add("");
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public static int E(byte[] arr_b, int v, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if(v2 == 0) {
            g0.c = "";
            return v1;
        }
        g0.c = g4.a.e(arr_b, v1, v2);
        return v1 + v2;
    }

    public static int F(int v, byte[] arr_b, int v1, int v2, UnknownFieldSetLite unknownFieldSetLite0, g g0) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v9 = h.J(arr_b, v1, g0);
                    unknownFieldSetLite0.e(v, g0.b);
                    return v9;
                }
                case 1: {
                    unknownFieldSetLite0.e(v, h.i(v1, arr_b));
                    return v1 + 8;
                }
                case 2: {
                    int v7 = h.H(arr_b, v1, g0);
                    int v8 = g0.a;
                    if(v8 < 0) {
                        throw InvalidProtocolBufferException.f();
                    }
                    if(v8 > arr_b.length - v7) {
                        throw InvalidProtocolBufferException.h();
                    }
                    if(v8 == 0) {
                        unknownFieldSetLite0.e(v, ByteString.EMPTY);
                        return v7;
                    }
                    unknownFieldSetLite0.e(v, ByteString.copyFrom(arr_b, v7, v8));
                    return v7 + v8;
                }
                case 3: {
                    UnknownFieldSetLite unknownFieldSetLite1 = new UnknownFieldSetLite();
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        int v5 = h.H(arr_b, v1, g0);
                        int v6 = g0.a;
                        if(v6 == v3) {
                            v4 = v6;
                            v1 = v5;
                            break;
                        }
                        v4 = v6;
                        v1 = h.F(v6, arr_b, v5, v2, unknownFieldSetLite1, g0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw InvalidProtocolBufferException.g();
                    }
                    unknownFieldSetLite0.e(v, unknownFieldSetLite1);
                    return v1;
                }
                case 5: {
                    unknownFieldSetLite0.e(v, h.g(v1, arr_b));
                    return v1 + 4;
                }
                default: {
                    throw InvalidProtocolBufferException.b();
                }
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public static int G(int v, byte[] arr_b, int v1, g g0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            g0.a = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            g0.a = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            g0.a = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            g0.a = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        g0.a = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    public static int H(byte[] arr_b, int v, g g0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            g0.a = v1;
            return v + 1;
        }
        return h.G(v1, arr_b, v + 1, g0);
    }

    public static int I(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.H(arr_b, v1, g0);
        ((m1)internal$ProtobufList0).addInt(g0.a);
        while(v3 < v2) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            v3 = h.H(arr_b, v4, g0);
            ((m1)internal$ProtobufList0).addInt(g0.a);
        }
        return v3;
    }

    public static int J(byte[] arr_b, int v, g g0) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            g0.b = v1;
            return v + 1;
        }
        int v2 = v + 2;
        int v3 = arr_b[v + 1];
        long v4 = v1 & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            v3 = v6;
            ++v2;
        }
        g0.b = v4;
        return v2;
    }

    public static int K(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.J(arr_b, v1, g0);
        ((z1)internal$ProtobufList0).addLong(g0.b);
        while(v3 < v2) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            v3 = h.J(arr_b, v4, g0);
            ((z1)internal$ProtobufList0).addLong(g0.b);
        }
        return v3;
    }

    public static int L(Object object0, Schema schema0, byte[] arr_b, int v, int v1, int v2, g g0) {
        int v3 = ((i2)schema0).B(object0, arr_b, v, v1, v2, g0);
        g0.c = object0;
        return v3;
    }

    public static int M(Object object0, Schema schema0, byte[] arr_b, int v, int v1, g g0) {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = h.G(v3, arr_b, v2, g0);
            v3 = g0.a;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw InvalidProtocolBufferException.h();
        }
        int v4 = v3 + v2;
        schema0.mergeFrom(object0, arr_b, v2, v4, g0);
        g0.c = object0;
        return v4;
    }

    public static int N(int v, byte[] arr_b, int v1, int v2, g g0) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return h.J(arr_b, v1, g0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return h.H(arr_b, v1, g0) + g0.a;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = h.H(arr_b, v1, g0);
                        v4 = g0.a;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = h.N(v4, arr_b, v1, v2, g0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw InvalidProtocolBufferException.g();
                    }
                    return v1;
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw InvalidProtocolBufferException.b();
                }
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public static int a(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.J(arr_b, v1, g0);
        ((j)internal$ProtobufList0).addBoolean(Long.compare(g0.b, 0L) != 0);
        while(v3 < v2) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            v3 = h.J(arr_b, v4, g0);
            ((j)internal$ProtobufList0).addBoolean(g0.b != 0L);
        }
        return v3;
    }

    public static int b(byte[] arr_b, int v, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a;
        if(v2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if(v2 > arr_b.length - v1) {
            throw InvalidProtocolBufferException.h();
        }
        if(v2 == 0) {
            g0.c = ByteString.EMPTY;
            return v1;
        }
        g0.c = ByteString.copyFrom(arr_b, v1, v2);
        return v1 + v2;
    }

    public static int c(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.H(arr_b, v1, g0);
        int v4 = g0.a;
        if(v4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if(v4 > arr_b.length - v3) {
            throw InvalidProtocolBufferException.h();
        }
        if(v4 == 0) {
            internal$ProtobufList0.add(ByteString.EMPTY);
            goto label_9;
        }
        else {
            internal$ProtobufList0.add(ByteString.copyFrom(arr_b, v3, v4));
        }
    alab1:
        while(true) {
            v3 += v4;
            while(true) {
            label_9:
                if(v3 >= v2) {
                    return v3;
                }
                int v5 = h.H(arr_b, v3, g0);
                if(v != g0.a) {
                    return v3;
                }
                v3 = h.H(arr_b, v5, g0);
                v4 = g0.a;
                if(v4 < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                if(v4 > arr_b.length - v3) {
                    break alab1;
                }
                if(v4 != 0) {
                    internal$ProtobufList0.add(ByteString.copyFrom(arr_b, v3, v4));
                    break;
                }
                internal$ProtobufList0.add(ByteString.EMPTY);
            }
        }
        throw InvalidProtocolBufferException.h();
    }

    public static double d(int v, byte[] arr_b) {
        return Double.longBitsToDouble(h.i(v, arr_b));
    }

    public static int e(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        ((h0)internal$ProtobufList0).addDouble(h.d(v1, arr_b));
        int v3;
        for(v3 = v1 + 8; v3 < v2; v3 = v4 + 8) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            ((h0)internal$ProtobufList0).addDouble(Double.longBitsToDouble(h.i(v4, arr_b)));
        }
        return v3;
    }

    public static int f(int v, byte[] arr_b, int v1, int v2, Object object0, MessageLite messageLite0, w3 w30, g g0) {
        int v3;
        GeneratedExtension generatedMessageLite$GeneratedExtension0 = g0.d.findLiteExtensionByNumber(messageLite0, v >>> 3);
        if(generatedMessageLite$GeneratedExtension0 == null) {
            return h.F(v, arr_b, v1, v2, i2.h(object0), g0);
        }
        Object object1 = null;
        ((ExtendableMessage)object0).p();
        d1 d10 = ((ExtendableMessage)object0).extensions;
        j1 j10 = generatedMessageLite$GeneratedExtension0.d;
        boolean z = false;
        if(j10.d && j10.e) {
            switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
                case 1: {
                    h0 h00 = new h0(new double[10], 0);
                    v3 = h.r(arr_b, v1, h00, g0);
                    d10.q(j10, h00);
                    return v3;
                }
                case 2: {
                    f1 f10 = new f1(0, new float[10]);
                    v3 = h.u(arr_b, v1, f10, g0);
                    d10.q(j10, f10);
                    return v3;
                }
                case 3: 
                case 4: {
                    z1 z10 = new z1();
                    v3 = h.y(arr_b, v1, z10, g0);
                    d10.q(j10, z10);
                    return v3;
                }
                case 5: 
                case 6: {
                    m1 m10 = new m1();
                    v3 = h.x(arr_b, v1, m10, g0);
                    d10.q(j10, m10);
                    return v3;
                }
                case 7: 
                case 8: {
                    z1 z11 = new z1();
                    v3 = h.t(arr_b, v1, z11, g0);
                    d10.q(j10, z11);
                    return v3;
                }
                case 9: 
                case 10: {
                    m1 m11 = new m1();
                    v3 = h.s(arr_b, v1, m11, g0);
                    d10.q(j10, m11);
                    return v3;
                }
                case 11: {
                    j j0 = new j(new boolean[10], 0);
                    v3 = h.q(arr_b, v1, j0, g0);
                    d10.q(j10, j0);
                    return v3;
                }
                case 12: {
                    m1 m12 = new m1();
                    v3 = h.v(arr_b, v1, m12, g0);
                    d10.q(j10, m12);
                    return v3;
                }
                case 13: {
                    z1 z12 = new z1();
                    v3 = h.w(arr_b, v1, z12, g0);
                    d10.q(j10, z12);
                    return v3;
                }
                case 14: {
                    m1 m13 = new m1();
                    v3 = h.x(arr_b, v1, m13, g0);
                    c3.z(((ExtendableMessage)object0), v >>> 3, m13, j10.a, null, w30);
                    d10.q(j10, m13);
                    return v3;
                }
                default: {
                    throw new IllegalStateException("Type cannot be packed: " + j10.c);
                }
            }
        }
        if(generatedMessageLite$GeneratedExtension0.getLiteType() == FieldType.ENUM) {
            v1 = h.H(arr_b, v1, g0);
            if(j10.a.findValueByNumber(g0.a) == null) {
                c3.E(((ExtendableMessage)object0), v >>> 3, g0.a, null, w30);
                return v1;
            }
            object1 = g0.a;
        }
        else {
            switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
                case 1: {
                    object1 = h.d(v1, arr_b);
                    v1 += 8;
                    break;
                }
                case 2: {
                    object1 = h.k(v1, arr_b);
                    v1 += 4;
                    break;
                }
                case 3: 
                case 4: {
                    v1 = h.J(arr_b, v1, g0);
                    object1 = g0.b;
                    break;
                }
                case 5: 
                case 6: {
                    v1 = h.H(arr_b, v1, g0);
                    object1 = g0.a;
                    break;
                }
                case 7: 
                case 8: {
                    object1 = h.i(v1, arr_b);
                    v1 += 8;
                    break;
                }
                case 9: 
                case 10: {
                    object1 = h.g(v1, arr_b);
                    v1 += 4;
                    break;
                }
                case 11: {
                    v1 = h.J(arr_b, v1, g0);
                    if(g0.b != 0L) {
                        z = true;
                    }
                    object1 = Boolean.valueOf(z);
                    break;
                }
                case 12: {
                    v1 = h.H(arr_b, v1, g0);
                    object1 = (int)(-(g0.a & 1) ^ g0.a >>> 1);
                    break;
                }
                case 13: {
                    v1 = h.J(arr_b, v1, g0);
                    object1 = (long)(-(g0.b & 1L) ^ g0.b >>> 1);
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn\'t reach here.");
                }
                case 15: {
                    v1 = h.b(arr_b, v1, g0);
                    object1 = g0.c;
                    break;
                }
                case 16: {
                    v1 = h.B(arr_b, v1, g0);
                    object1 = g0.c;
                    break;
                }
                case 17: {
                    int v4 = v >>> 3 << 3 | 4;
                    Class class0 = generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass();
                    Schema schema0 = v2.c.a(class0);
                    if(generatedMessageLite$GeneratedExtension0.isRepeated()) {
                        v3 = h.m(schema0, arr_b, v1, v2, v4, g0);
                        d10.a(j10, g0.c);
                        return v3;
                    }
                    Object object2 = d10.f(j10);
                    if(object2 == null) {
                        object2 = schema0.newInstance();
                        d10.q(j10, object2);
                    }
                    return h.L(object2, schema0, arr_b, v1, v2, v4, g0);
                }
                case 18: {
                    Class class1 = generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass();
                    Schema schema1 = v2.c.a(class1);
                    if(generatedMessageLite$GeneratedExtension0.isRepeated()) {
                        v3 = h.o(schema1, arr_b, v1, v2, g0);
                        d10.a(j10, g0.c);
                        return v3;
                    }
                    Object object3 = d10.f(j10);
                    if(object3 == null) {
                        object3 = schema1.newInstance();
                        d10.q(j10, object3);
                    }
                    return h.M(object3, schema1, arr_b, v1, v2, g0);
                }
            }
        }
        if(generatedMessageLite$GeneratedExtension0.isRepeated()) {
            d10.a(j10, object1);
            return v1;
        }
        d10.q(j10, object1);
        return v1;
    }

    public static int g(int v, byte[] arr_b) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    public static int h(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        ((m1)internal$ProtobufList0).addInt(h.g(v1, arr_b));
        int v3;
        for(v3 = v1 + 4; v3 < v2; v3 = v4 + 4) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            ((m1)internal$ProtobufList0).addInt(h.g(v4, arr_b));
        }
        return v3;
    }

    public static long i(int v, byte[] arr_b) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }

    public static int j(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        ((z1)internal$ProtobufList0).addLong(h.i(v1, arr_b));
        int v3;
        for(v3 = v1 + 8; v3 < v2; v3 = v4 + 8) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            ((z1)internal$ProtobufList0).addLong(h.i(v4, arr_b));
        }
        return v3;
    }

    public static float k(int v, byte[] arr_b) {
        return Float.intBitsToFloat(h.g(v, arr_b));
    }

    public static int l(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        ((f1)internal$ProtobufList0).addFloat(h.k(v1, arr_b));
        int v3;
        for(v3 = v1 + 4; v3 < v2; v3 = v4 + 4) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            ((f1)internal$ProtobufList0).addFloat(Float.intBitsToFloat(h.g(v4, arr_b)));
        }
        return v3;
    }

    public static int m(Schema schema0, byte[] arr_b, int v, int v1, int v2, g g0) {
        Object object0 = schema0.newInstance();
        int v3 = h.L(object0, schema0, arr_b, v, v1, v2, g0);
        schema0.makeImmutable(object0);
        g0.c = object0;
        return v3;
    }

    public static int n(Schema schema0, int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = v & -8 | 4;
        int v4 = h.m(schema0, arr_b, v1, v2, v3, g0);
        internal$ProtobufList0.add(g0.c);
        while(v4 < v2) {
            int v5 = h.H(arr_b, v4, g0);
            if(v != g0.a) {
                break;
            }
            v4 = h.m(schema0, arr_b, v5, v2, v3, g0);
            internal$ProtobufList0.add(g0.c);
        }
        return v4;
    }

    public static int o(Schema schema0, byte[] arr_b, int v, int v1, g g0) {
        Object object0 = schema0.newInstance();
        int v2 = h.M(object0, schema0, arr_b, v, v1, g0);
        schema0.makeImmutable(object0);
        g0.c = object0;
        return v2;
    }

    public static int p(Schema schema0, int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.o(schema0, arr_b, v1, v2, g0);
        internal$ProtobufList0.add(g0.c);
        while(v3 < v2) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            v3 = h.o(schema0, arr_b, v4, v2, g0);
            internal$ProtobufList0.add(g0.c);
        }
        return v3;
    }

    public static int q(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            v1 = h.J(arr_b, v1, g0);
            ((j)internal$ProtobufList0).addBoolean(g0.b != 0L);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int r(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            ((h0)internal$ProtobufList0).addDouble(Double.longBitsToDouble(h.i(v1, arr_b)));
            v1 += 8;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int s(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            ((m1)internal$ProtobufList0).addInt(h.g(v1, arr_b));
            v1 += 4;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int t(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            ((z1)internal$ProtobufList0).addLong(h.i(v1, arr_b));
            v1 += 8;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int u(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            ((f1)internal$ProtobufList0).addFloat(Float.intBitsToFloat(h.g(v1, arr_b)));
            v1 += 4;
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int v(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            v1 = h.H(arr_b, v1, g0);
            ((m1)internal$ProtobufList0).addInt(-(g0.a & 1) ^ g0.a >>> 1);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int w(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            v1 = h.J(arr_b, v1, g0);
            ((z1)internal$ProtobufList0).addLong(-(g0.b & 1L) ^ g0.b >>> 1);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int x(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            v1 = h.H(arr_b, v1, g0);
            ((m1)internal$ProtobufList0).addInt(g0.a);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int y(byte[] arr_b, int v, ProtobufList internal$ProtobufList0, g g0) {
        int v1 = h.H(arr_b, v, g0);
        int v2 = g0.a + v1;
        while(v1 < v2) {
            v1 = h.J(arr_b, v1, g0);
            ((z1)internal$ProtobufList0).addLong(g0.b);
        }
        if(v1 != v2) {
            throw InvalidProtocolBufferException.h();
        }
        return v1;
    }

    public static int z(int v, byte[] arr_b, int v1, int v2, ProtobufList internal$ProtobufList0, g g0) {
        int v3 = h.H(arr_b, v1, g0);
        ((m1)internal$ProtobufList0).addInt(-(g0.a & 1) ^ g0.a >>> 1);
        while(v3 < v2) {
            int v4 = h.H(arr_b, v3, g0);
            if(v != g0.a) {
                break;
            }
            v3 = h.H(arr_b, v4, g0);
            ((m1)internal$ProtobufList0).addInt(-(g0.a & 1) ^ g0.a >>> 1);
        }
        return v3;
    }
}

