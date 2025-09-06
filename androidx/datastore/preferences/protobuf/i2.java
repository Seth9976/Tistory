package androidx.datastore.preferences.protobuf;

import a5.b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import sun.misc.Unsafe;

public final class i2 implements Schema {
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final MessageLite e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final NewInstanceSchema m;
    public final x1 n;
    public final w3 o;
    public final q0 p;
    public final MapFieldSchema q;
    public static final int[] r;
    public static final Unsafe s;

    static {
        i2.r = new int[0];
        i2.s = d4.o();
    }

    public i2(int[] arr_v, Object[] arr_object, int v, int v1, MessageLite messageLite0, boolean z, boolean z1, int[] arr_v1, int v2, int v3, NewInstanceSchema newInstanceSchema0, x1 x10, w3 w30, q0 q00, MapFieldSchema mapFieldSchema0) {
        this.a = arr_v;
        this.b = arr_object;
        this.c = v;
        this.d = v1;
        this.g = messageLite0 instanceof GeneratedMessageLite;
        this.h = z;
        this.f = q00 != null && messageLite0 instanceof ExtendableMessage;
        this.i = z1;
        this.j = arr_v1;
        this.k = v2;
        this.l = v3;
        this.m = newInstanceSchema0;
        this.n = x10;
        this.o = w30;
        this.p = q00;
        this.e = messageLite0;
        this.q = mapFieldSchema0;
    }

    public final int A(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, int v8, g g0) {
        int v10;
        Unsafe unsafe0 = i2.s;
        long v9 = (long)(this.a[v8 + 2] & 0xFFFFF);
        switch(v6) {
            case 51: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, h.d(v, arr_b));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 8;
                }
                break;
            }
            case 52: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, h.k(v, arr_b));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 4;
                }
                break;
            }
            case 53: 
            case 54: {
                if(v4 == 0) {
                    v10 = h.J(arr_b, v, g0);
                    unsafe0.putObject(object0, v7, g0.b);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 58: {
                if(v4 == 0) {
                    v10 = h.J(arr_b, v, g0);
                    unsafe0.putObject(object0, v7, Boolean.valueOf(g0.b != 0L));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 59: {
                if(v4 == 2) {
                    v10 = h.H(arr_b, v, g0);
                    int v11 = g0.a;
                    if(v11 == 0) {
                        unsafe0.putObject(object0, v7, "");
                    }
                    else {
                        if((v5 & 0x20000000) != 0 && !g4.h(arr_b, v10, v10 + v11)) {
                            throw InvalidProtocolBufferException.c();
                        }
                        unsafe0.putObject(object0, v7, new String(arr_b, v10, v11, Internal.a));
                        v10 += v11;
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 60: {
                if(v4 == 2) {
                    Object object1 = this.t(v3, v8, object0);
                    v10 = h.M(object1, this.g(v8), arr_b, v, v1, g0);
                    this.N(v3, object0, v8, object1);
                    return v10;
                }
                break;
            }
            case 61: {
                if(v4 == 2) {
                    v10 = h.b(arr_b, v, g0);
                    unsafe0.putObject(object0, v7, g0.c);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 55: 
            case 62: {
                if(v4 == 0) {
                    v10 = h.H(arr_b, v, g0);
                    unsafe0.putObject(object0, v7, g0.a);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 0x3F: {
                if(v4 == 0) {
                    int v12 = h.H(arr_b, v, g0);
                    int v13 = g0.a;
                    EnumVerifier internal$EnumVerifier0 = this.e(v8);
                    if(internal$EnumVerifier0 != null && !internal$EnumVerifier0.isInRange(v13)) {
                        i2.h(object0).e(v2, ((long)v13));
                        return v12;
                    }
                    unsafe0.putObject(object0, v7, v13);
                    unsafe0.putInt(object0, v9, v3);
                    return v12;
                }
                break;
            }
            case 57: 
            case 0x40: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, h.g(v, arr_b));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 4;
                }
                break;
            }
            case 56: 
            case 65: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, h.i(v, arr_b));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 8;
                }
                break;
            }
            case 66: {
                if(v4 == 0) {
                    v10 = h.H(arr_b, v, g0);
                    unsafe0.putObject(object0, v7, ((int)(-(g0.a & 1) ^ g0.a >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 67: {
                if(v4 == 0) {
                    v10 = h.J(arr_b, v, g0);
                    unsafe0.putObject(object0, v7, ((long)(-(g0.b & 1L) ^ g0.b >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 68: {
                if(v4 == 3) {
                    Object object2 = this.t(v3, v8, object0);
                    v10 = h.L(object2, this.g(v8), arr_b, v, v1, v2 & -8 | 4, g0);
                    this.N(v3, object0, v8, object2);
                    return v10;
                }
                break;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    public final int B(Object object0, byte[] arr_b, int v, int v1, int v2, g g0) {
        int v46;
        int v45;
        int v44;
        int v43;
        int v36;
        int v35;
        int v34;
        int v33;
        int v32;
        int v38;
        int v39;
        int v37;
        int v31;
        int v30;
        int v23;
        int v22;
        int v21;
        int v20;
        int v19;
        int v18;
        int v17;
        int v16;
        int v12;
        int v11;
        int v3 = v2;
        i2.b(object0);
        Unsafe unsafe0 = i2.s;
        int v4 = v;
        int v5 = -1;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0xFFFFF;
        while(true) {
            if(v4 >= v1) {
                v45 = v3;
                v46 = v4;
                v22 = v7;
                break;
            }
            int v10 = arr_b[v4];
            if(v10 < 0) {
                v11 = h.G(v10, arr_b, v4 + 1, g0);
                v12 = g0.a;
            }
            else {
                v12 = v10;
                v11 = v4 + 1;
            }
            int v13 = v12 >>> 3;
            int v14 = this.d;
            int v15 = this.c;
            if(v13 > v5) {
                v16 = v13 < v15 || v13 > v14 ? -1 : this.L(v13, v6 / 3);
            }
            else {
                v16 = v13 < v15 || v13 > v14 ? -1 : this.L(v13, 0);
            }
            if(v16 == -1) {
                v17 = v11;
                v18 = v9;
                v19 = 0;
                v20 = v13;
                v21 = v3;
                v22 = v12;
                v23 = v8;
            }
            else {
                int[] arr_v = this.a;
                int v24 = arr_v[v16 + 1];
                int v25 = (v24 & 0xFF00000) >>> 20;
                long v26 = (long)(v24 & 0xFFFFF);
                if(v25 <= 17) {
                    int v27 = arr_v[v16 + 2];
                    int v28 = 1 << (v27 >>> 20);
                    int v29 = v27 & 0xFFFFF;
                    if(v29 == v9) {
                        v31 = v8;
                        v30 = v9;
                    }
                    else {
                        if(v9 != 0xFFFFF) {
                            unsafe0.putInt(object0, ((long)v9), v8);
                        }
                        v30 = v29;
                        v31 = unsafe0.getInt(object0, ((long)v29));
                    }
                    switch(v25) {
                        case 0: {
                            v32 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 1) {
                                d4.u(object0, v26, h.d(v32, arr_b));
                                v4 = v32 + 8;
                                v8 = v31 | v28;
                                v9 = v34;
                                goto label_215;
                            }
                            break;
                        }
                        case 1: {
                            v32 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 5) {
                                d4.v(object0, v26, h.k(v32, arr_b));
                                v4 = v32 + 4;
                                v8 = v31 | v28;
                                v9 = v34;
                                goto label_215;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v32 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 0) {
                                v37 = h.J(arr_b, v32, g0);
                                unsafe0.putLong(object0, v26, g0.b);
                                goto label_212;
                            }
                            break;
                        }
                        case 7: {
                            v39 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 0) {
                                int v40 = h.J(arr_b, v39, g0);
                                d4.p(object0, v26, g0.b != 0L);
                                v3 = v2;
                                v6 = v36;
                                v7 = v35;
                                v5 = v33;
                                v9 = v34;
                                v8 = v31 | v28;
                                v4 = v40;
                                continue;
                            }
                            v32 = v39;
                            break;
                        }
                        case 8: {
                            v39 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 2) {
                                v4 = (v24 & 0x20000000) == 0 ? h.B(arr_b, v39, g0) : h.E(arr_b, v39, g0);
                                unsafe0.putObject(object0, v26, g0.c);
                                goto label_163;
                            }
                            v32 = v39;
                            break;
                        }
                        case 9: {
                            v39 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 2) {
                                Object object1 = this.s(v36, object0);
                                v4 = h.M(object1, this.g(v36), arr_b, v39, v1, g0);
                                this.M(v36, object0, object1);
                                v8 = v31 | v28;
                                v9 = v34;
                                goto label_215;
                            }
                            v32 = v39;
                            break;
                        }
                        case 10: {
                            v39 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 2) {
                                v4 = h.b(arr_b, v39, g0);
                                unsafe0.putObject(object0, v26, g0.c);
                            label_163:
                                v8 = v31 | v28;
                                v3 = v2;
                                v6 = v36;
                                v7 = v35;
                                v5 = v33;
                                v9 = v34;
                                continue;
                            }
                            v32 = v39;
                            break;
                        }
                        case 4: 
                        case 11: {
                            v32 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 0) {
                                v4 = h.H(arr_b, v32, g0);
                                unsafe0.putInt(object0, v26, g0.a);
                                v8 = v31 | v28;
                                v9 = v34;
                                goto label_215;
                            }
                            break;
                        }
                        case 12: {
                            v38 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 0) {
                                v4 = h.H(arr_b, v38, g0);
                                int v41 = g0.a;
                                EnumVerifier internal$EnumVerifier0 = this.e(v36);
                                if(internal$EnumVerifier0 == null || internal$EnumVerifier0.isInRange(v41)) {
                                    unsafe0.putInt(object0, v26, v41);
                                    v8 = v31 | v28;
                                    v9 = v34;
                                    goto label_215;
                                }
                                else {
                                    i2.h(object0).e(v35, ((long)v41));
                                    v9 = v34;
                                    v6 = v36;
                                    v8 = v31;
                                    v7 = v35;
                                    v5 = v33;
                                    v3 = v2;
                                    continue;
                                }
                                goto label_193;
                            }
                            v32 = v38;
                            break;
                        }
                        case 6: 
                        case 13: {
                            v39 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 5) {
                                unsafe0.putInt(object0, v26, h.g(v39, arr_b));
                                v4 = v39 + 4;
                                goto label_163;
                            }
                            v32 = v39;
                            break;
                        }
                        case 5: 
                        case 14: {
                            v38 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 1) {
                                unsafe0.putLong(object0, v26, h.i(v38, arr_b));
                                v4 = v38 + 8;
                                v8 = v31 | v28;
                                v9 = v34;
                                goto label_215;
                            }
                            v32 = v38;
                            break;
                        }
                        case 15: {
                        label_193:
                            v38 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 0) {
                                v4 = h.H(arr_b, v38, g0);
                                unsafe0.putInt(object0, v26, -(g0.a & 1) ^ g0.a >>> 1);
                                v8 = v31 | v28;
                                v9 = v34;
                                goto label_215;
                            }
                            v32 = v38;
                            break;
                        }
                        case 16: {
                            v38 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                            if((v12 & 7) == 0) {
                                v37 = h.J(arr_b, v38, g0);
                                unsafe0.putLong(object0, v26, -(g0.b & 1L) ^ g0.b >>> 1);
                            label_212:
                                v8 = v31 | v28;
                                v9 = v34;
                                v4 = v37;
                            label_215:
                                v6 = v36;
                                v7 = v35;
                                v5 = v33;
                                v3 = v2;
                                continue;
                            }
                            v32 = v38;
                            break;
                        }
                        case 17: {
                            if((v12 & 7) == 3) {
                                Object object2 = this.s(v16, object0);
                                v4 = h.L(object2, this.g(v16), arr_b, v11, v1, v13 << 3 | 4, g0);
                                this.M(v16, object0, object2);
                                v8 = v31 | v28;
                                v9 = v30;
                                v3 = v2;
                                v6 = v16;
                                v7 = v12;
                                v5 = v13;
                                continue;
                            }
                            else {
                                v33 = v13;
                                v34 = v30;
                                v35 = v12;
                                v36 = v16;
                                v32 = v11;
                            }
                            break;
                        }
                        default: {
                            v32 = v11;
                            v33 = v13;
                            v34 = v30;
                            v35 = v12;
                            v36 = v16;
                        }
                    }
                    v18 = v34;
                    v17 = v32;
                    v23 = v31;
                    v20 = v33;
                    v21 = v2;
                    v19 = v36;
                    v22 = v35;
                }
                else if(v25 == 27) {
                    if((v12 & 7) == 2) {
                        ProtobufList internal$ProtobufList0 = (ProtobufList)unsafe0.getObject(object0, v26);
                        if(!internal$ProtobufList0.isModifiable()) {
                            int v42 = internal$ProtobufList0.size();
                            internal$ProtobufList0 = internal$ProtobufList0.mutableCopyWithCapacity((v42 == 0 ? 10 : v42 * 2));
                            unsafe0.putObject(object0, v26, internal$ProtobufList0);
                        }
                        v4 = h.p(this.g(v16), v12, arr_b, v11, v1, internal$ProtobufList0, g0);
                        v3 = v2;
                        v6 = v16;
                        v7 = v12;
                        v5 = v13;
                        continue;
                    }
                    else {
                        v23 = v8;
                        v18 = v9;
                        v43 = v11;
                        v44 = v12;
                        v20 = v13;
                        v19 = v16;
                        v22 = v44;
                        v21 = v2;
                        v17 = v43;
                        goto label_300;
                    }
                    goto label_266;
                }
                else {
                label_266:
                    v23 = v8;
                    v18 = v9;
                    if(v25 <= 49) {
                        v20 = v13;
                        v19 = v16;
                        v44 = v12;
                        v4 = this.D(object0, arr_b, v11, v1, v12, v13, v12 & 7, v16, ((long)v24), v25, v26, g0);
                        if(v4 != v11) {
                            goto label_290;
                        }
                    }
                    else {
                        v43 = v11;
                        v44 = v12;
                        v20 = v13;
                        v19 = v16;
                        if(v25 != 50) {
                            v4 = this.A(object0, arr_b, v43, v1, v44, v20, v12 & 7, v24, v25, v26, v19, g0);
                            if(v4 != v43) {
                            label_290:
                                v7 = v44;
                                v3 = v2;
                                v5 = v20;
                                v6 = v19;
                                v8 = v23;
                                v9 = v18;
                                continue;
                            }
                        }
                        else if((v12 & 7) == 2) {
                            v4 = this.z(object0, arr_b, v43, v1, v19, v26, g0);
                            if(v4 != v43) {
                                goto label_290;
                            }
                        }
                        else {
                            v22 = v44;
                            v21 = v2;
                            v17 = v43;
                            goto label_300;
                        }
                    }
                    v22 = v44;
                    v17 = v4;
                    v21 = v2;
                }
            }
        label_300:
            if(v22 == v21 && v21 != 0) {
                v45 = v21;
                v46 = v17;
                v8 = v23;
                v9 = v18;
                break;
            }
            if(this.f) {
                ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.getEmptyRegistry();
                if(g0.d != extensionRegistryLite0) {
                    v4 = h.f(v22, arr_b, v17, v1, object0, this.e, this.o, g0);
                }
            }
            else {
                v4 = h.F(v22, arr_b, v17, v1, i2.h(object0), g0);
            }
            v7 = v22;
            v5 = v20;
            v6 = v19;
            v8 = v23;
            v9 = v18;
            v3 = v21;
        }
        if(v9 != 0xFFFFF) {
            unsafe0.putInt(object0, ((long)v9), v8);
        }
        UnknownFieldSetLite unknownFieldSetLite0 = null;
        for(int v47 = this.k; v47 < this.l; ++v47) {
            unknownFieldSetLite0 = (UnknownFieldSetLite)this.d(object0, this.j[v47], unknownFieldSetLite0, this.o, object0);
        }
        if(unknownFieldSetLite0 != null) {
            this.o.d(object0, unknownFieldSetLite0);
        }
        if(v45 == 0) {
            if(v46 != v1) {
                throw InvalidProtocolBufferException.g();
            }
            return v46;
        }
        if(v46 > v1 || v22 != v45) {
            throw InvalidProtocolBufferException.g();
        }
        return v46;
    }

    public final void C(Object object0, byte[] arr_b, int v, int v1, g g0) {
        int v29;
        int v26;
        int v27;
        int v25;
        int v24;
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        int v9;
        int v8;
        i2.b(object0);
        Unsafe unsafe0 = i2.s;
        int v2 = v;
        int v3 = 0;
        int v4 = 0;
        int v5 = -1;
        int v6 = 0xFFFFF;
        while(v2 < v1) {
            int v7 = arr_b[v2];
            if(v7 < 0) {
                v8 = h.G(v7, arr_b, v2 + 1, g0);
                v9 = g0.a;
            }
            else {
                v9 = v7;
                v8 = v2 + 1;
            }
            int v10 = this.d;
            int v11 = this.c;
            if(v9 >>> 3 <= v5) {
                if(v9 >>> 3 >= v11 && v9 >>> 3 <= v10) {
                    v12 = this.L(v9 >>> 3, 0);
                }
            }
            else if(v9 >>> 3 >= v11 && v9 >>> 3 <= v10) {
                v12 = this.L(v9 >>> 3, v3 / 3);
            }
            else {
                v12 = -1;
            }
            if(v12 == -1) {
                v13 = v9 >>> 3;
                v14 = v8;
                v15 = v4;
                v16 = 0;
            }
            else {
                int[] arr_v = this.a;
                int v17 = arr_v[v12 + 1];
                int v18 = (v17 & 0xFF00000) >>> 20;
                long v19 = (long)(v17 & 0xFFFFF);
                int v20 = v17;
                if(v18 <= 17) {
                    int v21 = arr_v[v12 + 2];
                    int v22 = 1 << (v21 >>> 20);
                    int v23 = v21 & 0xFFFFF;
                    if(v23 == v6) {
                        v25 = v6;
                    }
                    else {
                        if(v6 != 0xFFFFF) {
                            unsafe0.putInt(object0, ((long)v6), v4);
                        }
                        v24 = v23;
                        if(v24 != 0xFFFFF) {
                            v4 = unsafe0.getInt(object0, ((long)v24));
                        }
                        v25 = v24;
                    }
                    switch(v18) {
                        case 0: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                            if((v9 & 7) == 1) {
                                d4.u(object0, v19, h.d(v26, arr_b));
                                v2 = v26 + 8;
                                goto label_119;
                            }
                            break;
                        }
                        case 1: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                            if((v9 & 7) == 5) {
                                d4.v(object0, v19, h.k(v26, arr_b));
                                v2 = v26 + 4;
                                goto label_119;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                            if((v9 & 7) == 0) {
                                v27 = h.J(arr_b, v26, g0);
                                unsafe0.putLong(object0, v19, g0.b);
                                goto label_128;
                            }
                            break;
                        }
                        case 7: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = h.J(arr_b, v8, g0);
                                d4.p(object0, v19, g0.b != 0L);
                                goto label_119;
                            }
                            v26 = v8;
                            break;
                        }
                        case 8: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                v2 = (v20 & 0x20000000) == 0 ? h.B(arr_b, v8, g0) : h.E(arr_b, v8, g0);
                                unsafe0.putObject(object0, v19, g0.c);
                                goto label_119;
                            }
                            v26 = v8;
                            break;
                        }
                        case 9: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                Object object1 = this.s(v12, object0);
                                v2 = h.M(object1, this.g(v12), arr_b, v8, v1, g0);
                                this.M(v12, object0, object1);
                                goto label_119;
                            }
                            v26 = v8;
                            break;
                        }
                        case 10: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                v2 = h.b(arr_b, v8, g0);
                                unsafe0.putObject(object0, v19, g0.c);
                                goto label_119;
                            }
                            v26 = v8;
                            break;
                        }
                        case 4: 
                        case 11: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                            if((v9 & 7) == 0) {
                                v2 = h.H(arr_b, v26, g0);
                                unsafe0.putInt(object0, v19, g0.a);
                                goto label_119;
                            }
                            break;
                        }
                        case 12: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = h.H(arr_b, v8, g0);
                                unsafe0.putInt(object0, v19, g0.a);
                                goto label_119;
                            }
                            v26 = v8;
                            break;
                        }
                        case 6: 
                        case 13: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 5) {
                                unsafe0.putInt(object0, v19, h.g(v8, arr_b));
                                v2 = v8 + 4;
                                goto label_119;
                            }
                            v26 = v8;
                            break;
                        }
                        case 5: 
                        case 14: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 1) {
                                unsafe0.putLong(object0, v19, h.i(v8, arr_b));
                                v2 = v8 + 8;
                                goto label_119;
                            }
                            v26 = v8;
                            break;
                        }
                        case 15: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = h.H(arr_b, v8, g0);
                                unsafe0.putInt(object0, v19, -(g0.a & 1) ^ g0.a >>> 1);
                            label_119:
                                v4 |= v22;
                                v3 = v12;
                                v6 = v25;
                                v5 = v13;
                                continue;
                            }
                            v26 = v8;
                            break;
                        }
                        case 16: {
                            if((v9 & 7) == 0) {
                                v27 = h.J(arr_b, v8, g0);
                                v13 = v9 >>> 3;
                                unsafe0.putLong(object0, v19, -(g0.b & 1L) ^ g0.b >>> 1);
                            label_128:
                                v4 |= v22;
                                v3 = v12;
                                v2 = v27;
                                v6 = v25;
                                v5 = v13;
                                continue;
                            }
                            else {
                                v13 = v9 >>> 3;
                            }
                            v26 = v8;
                            break;
                        }
                        default: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                        }
                    }
                    v15 = v4;
                    v16 = v12;
                    v14 = v26;
                    v6 = v25;
                }
                else {
                    v13 = v9 >>> 3;
                    if(v18 == 27) {
                        if((v9 & 7) == 2) {
                            ProtobufList internal$ProtobufList0 = (ProtobufList)unsafe0.getObject(object0, v19);
                            if(!internal$ProtobufList0.isModifiable()) {
                                int v28 = internal$ProtobufList0.size();
                                internal$ProtobufList0 = internal$ProtobufList0.mutableCopyWithCapacity((v28 == 0 ? 10 : v28 * 2));
                                unsafe0.putObject(object0, v19, internal$ProtobufList0);
                            }
                            v2 = h.p(this.g(v12), v9, arr_b, v8, v1, internal$ProtobufList0, g0);
                            v3 = v12;
                            v5 = v13;
                            continue;
                        }
                        else {
                            v15 = v4;
                            v29 = v6;
                            v16 = v12;
                            v14 = v8;
                            goto label_183;
                        }
                        goto label_158;
                    }
                    else {
                    label_158:
                        if(v18 <= 49) {
                            v15 = v4;
                            v29 = v6;
                            v16 = v12;
                            v2 = this.D(object0, arr_b, v8, v1, v9, v13, v9 & 7, v12, ((long)v20), v18, v19, g0);
                            if(v2 != v8) {
                                goto label_177;
                            }
                        }
                        else {
                            v15 = v4;
                            v29 = v6;
                            v16 = v12;
                            if(v18 != 50) {
                                v2 = this.A(object0, arr_b, v8, v1, v9, v13, v9 & 7, v20, v18, v19, v16, g0);
                                if(v2 != v8) {
                                label_177:
                                    v3 = v16;
                                    v5 = v13;
                                    v4 = v15;
                                    v6 = v29;
                                    continue;
                                }
                            }
                            else if((v9 & 7) == 2) {
                                v2 = this.z(object0, arr_b, v8, v1, v16, v19, g0);
                                if(v2 != v8) {
                                    goto label_177;
                                }
                            }
                            else {
                                v14 = v8;
                                goto label_183;
                            }
                        }
                        v14 = v2;
                    }
                label_183:
                    v6 = v29;
                }
            }
            v2 = h.F(v9, arr_b, v14, v1, i2.h(object0), g0);
            v3 = v16;
            v5 = v13;
            v4 = v15;
        }
        if(v6 != 0xFFFFF) {
            unsafe0.putInt(object0, ((long)v6), v4);
        }
        if(v2 != v1) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final int D(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, long v6, int v7, long v8, g g0) {
        int v10;
        Unsafe unsafe0 = i2.s;
        ProtobufList internal$ProtobufList0 = (ProtobufList)unsafe0.getObject(object0, v8);
        if(!internal$ProtobufList0.isModifiable()) {
            int v9 = internal$ProtobufList0.size();
            internal$ProtobufList0 = internal$ProtobufList0.mutableCopyWithCapacity((v9 == 0 ? 10 : v9 * 2));
            unsafe0.putObject(object0, v8, internal$ProtobufList0);
        }
        switch(v7) {
            case 26: {
                if(v4 == 2) {
                    return (v6 & 0x20000000L) == 0L ? h.C(v2, arr_b, v, v1, internal$ProtobufList0, g0) : h.D(v2, arr_b, v, v1, internal$ProtobufList0, g0);
                }
                break;
            }
            case 27: {
                return v4 == 2 ? h.p(this.g(v5), v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 28: {
                return v4 == 2 ? h.c(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 18: 
            case 35: {
                if(v4 == 2) {
                    return h.r(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 1 ? h.e(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 19: 
            case 36: {
                if(v4 == 2) {
                    return h.u(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 5 ? h.l(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if(v4 == 2) {
                    return h.y(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 0 ? h.K(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 25: 
            case 42: {
                if(v4 == 2) {
                    return h.q(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 0 ? h.a(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if(v4 == 2) {
                    return h.x(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 0 ? h.I(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 30: 
            case 44: {
                if(v4 == 2) {
                    v10 = h.x(arr_b, v, internal$ProtobufList0, g0);
                }
                else if(v4 == 0) {
                    v10 = h.I(v2, arr_b, v, v1, internal$ProtobufList0, g0);
                }
                else {
                    break;
                }
                c3.A(object0, v3, internal$ProtobufList0, this.e(v5), null, this.o);
                return v10;
            }
            case 24: 
            case 0x1F: 
            case 41: 
            case 45: {
                if(v4 == 2) {
                    return h.s(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 5 ? h.h(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 23: 
            case 0x20: 
            case 40: 
            case 46: {
                if(v4 == 2) {
                    return h.t(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 1 ? h.j(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 33: 
            case 0x2F: {
                if(v4 == 2) {
                    return h.v(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 0 ? h.z(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 34: 
            case 0x30: {
                if(v4 == 2) {
                    return h.w(arr_b, v, internal$ProtobufList0, g0);
                }
                return v4 == 0 ? h.A(v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            case 49: {
                return v4 == 3 ? h.n(this.g(v5), v2, arr_b, v, v1, internal$ProtobufList0, g0) : v;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    public final void E(Object object0, long v, Reader reader0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        reader0.readGroupList(this.n.c(object0, v), schema0, extensionRegistryLite0);
    }

    public final void F(Object object0, int v, Reader reader0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        reader0.readMessageList(this.n.c(object0, ((long)(v & 0xFFFFF))), schema0, extensionRegistryLite0);
    }

    public final void G(Object object0, int v, Reader reader0) {
        if((0x20000000 & v) != 0) {
            d4.y(v & 0xFFFFF, object0, reader0.readStringRequireUtf8());
            return;
        }
        if(this.g) {
            d4.y(v & 0xFFFFF, object0, reader0.readString());
            return;
        }
        d4.y(v & 0xFFFFF, object0, reader0.readBytes());
    }

    public final void H(Object object0, int v, Reader reader0) {
        x1 x10 = this.n;
        if((0x20000000 & v) != 0) {
            reader0.readStringListRequireUtf8(x10.c(object0, ((long)(v & 0xFFFFF))));
            return;
        }
        reader0.readStringList(x10.c(object0, ((long)(v & 0xFFFFF))));
    }

    public static Field I(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException unused_ex) {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName())) {
                    return field0;
                }
            }
            StringBuilder stringBuilder0 = b.v("Field ", s, " for ");
            stringBuilder0.append(class0.getName());
            stringBuilder0.append(" not found. Known fields are ");
            stringBuilder0.append(Arrays.toString(arr_field));
            throw new RuntimeException(stringBuilder0.toString());
        }
    }

    public final void J(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        d4.w(1 << (v1 >>> 20) | d4.c.j(object0, ((long)(0xFFFFF & v1))), ((long)(0xFFFFF & v1)), object0);
    }

    public final void K(int v, int v1, Object object0) {
        d4.w(v, ((long)(this.a[v1 + 2] & 0xFFFFF)), object0);
    }

    public final int L(int v, int v1) {
        int[] arr_v = this.a;
        int v2 = arr_v.length / 3 - 1;
        while(v1 <= v2) {
            int v3 = v2 + v1 >>> 1;
            int v4 = v3 * 3;
            int v5 = arr_v[v4];
            if(v == v5) {
                return v4;
            }
            if(v < v5) {
                v2 = v3 - 1;
            }
            else {
                v1 = v3 + 1;
            }
        }
        return -1;
    }

    public final void M(int v, Object object0, Object object1) {
        int v1 = this.P(v);
        i2.s.putObject(object0, ((long)(v1 & 0xFFFFF)), object1);
        this.J(v, object0);
    }

    public final void N(int v, Object object0, int v1, Object object1) {
        int v2 = this.P(v1);
        i2.s.putObject(object0, ((long)(v2 & 0xFFFFF)), object1);
        this.K(v, v1, object0);
    }

    public static int O(int v) [...] // Inlined contents

    public final int P(int v) {
        return this.a[v + 1];
    }

    public final void Q(Object object0, Writer writer0) {
        Unsafe unsafe1;
        int v8;
        Map.Entry map$Entry0;
        Iterator iterator0;
        q0 q00 = this.p;
        if(this.f) {
            d1 d10 = q00.c(object0);
            if(d10.j()) {
                iterator0 = null;
                map$Entry0 = null;
            }
            else {
                iterator0 = d10.m();
                Object object1 = iterator0.next();
                map$Entry0 = (Map.Entry)object1;
            }
        }
        else {
            iterator0 = null;
            map$Entry0 = null;
        }
        int[] arr_v = this.a;
        Unsafe unsafe0 = i2.s;
        int v = 0;
        int v1 = 0xFFFFF;
        int v2 = 0;
        while(v < arr_v.length) {
            int v3 = this.P(v);
            int v4 = arr_v[v];
            int v5 = (v3 & 0xFF00000) >>> 20;
            if(v5 <= 17) {
                int v6 = arr_v[v + 2];
                int v7 = v6 & 0xFFFFF;
                if(v7 != v1) {
                    v2 = unsafe0.getInt(object0, ((long)v7));
                    v1 = v7;
                }
                v8 = 1 << (v6 >>> 20);
            }
            else {
                v8 = 0;
            }
            while(map$Entry0 != null && q00.a(map$Entry0) <= v4) {
                q00.g(writer0, map$Entry0);
                if(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    map$Entry0 = (Map.Entry)object2;
                }
                else {
                    map$Entry0 = null;
                }
            }
            long v9 = (long)(v3 & 0xFFFFF);
            switch(v5) {
                case 0: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeDouble(v4, d4.c.h(object0, v9));
                    }
                    break;
                }
                case 1: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeFloat(v4, d4.c.i(object0, v9));
                    }
                    break;
                }
                case 2: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeInt64(v4, unsafe1.getLong(object0, v9));
                    }
                    break;
                }
                case 3: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeUInt64(v4, unsafe1.getLong(object0, v9));
                    }
                    break;
                }
                case 4: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeInt32(v4, unsafe1.getInt(object0, v9));
                    }
                    break;
                }
                case 5: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeFixed64(v4, unsafe1.getLong(object0, v9));
                    }
                    break;
                }
                case 6: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeFixed32(v4, unsafe1.getInt(object0, v9));
                    }
                    break;
                }
                case 7: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeBool(v4, d4.c.e(object0, v9));
                    }
                    break;
                }
                case 8: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        i2.S(v4, unsafe1.getObject(object0, v9), writer0);
                    }
                    break;
                }
                case 9: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeMessage(v4, unsafe1.getObject(object0, v9), this.g(v));
                    }
                    break;
                }
                case 10: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeBytes(v4, ((ByteString)unsafe1.getObject(object0, v9)));
                    }
                    break;
                }
                case 11: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeUInt32(v4, unsafe1.getInt(object0, v9));
                    }
                    break;
                }
                case 12: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeEnum(v4, unsafe1.getInt(object0, v9));
                    }
                    break;
                }
                case 13: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeSFixed32(v4, unsafe1.getInt(object0, v9));
                    }
                    break;
                }
                case 14: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeSFixed64(v4, unsafe1.getLong(object0, v9));
                    }
                    break;
                }
                case 15: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeSInt32(v4, unsafe1.getInt(object0, v9));
                    }
                    break;
                }
                case 16: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeSInt64(v4, unsafe1.getLong(object0, v9));
                    }
                    break;
                }
                case 17: {
                    unsafe1 = unsafe0;
                    if((v8 & v2) != 0) {
                        writer0.writeGroup(v4, unsafe1.getObject(object0, v9), this.g(v));
                    }
                    break;
                }
                case 18: {
                    unsafe1 = unsafe0;
                    c3.H(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 19: {
                    unsafe1 = unsafe0;
                    c3.L(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 20: {
                    unsafe1 = unsafe0;
                    c3.O(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 21: {
                    unsafe1 = unsafe0;
                    c3.W(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 22: {
                    unsafe1 = unsafe0;
                    c3.N(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 23: {
                    unsafe1 = unsafe0;
                    c3.K(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 24: {
                    unsafe1 = unsafe0;
                    c3.J(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 25: {
                    unsafe1 = unsafe0;
                    c3.F(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 26: {
                    unsafe1 = unsafe0;
                    c3.U(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0);
                    break;
                }
                case 27: {
                    unsafe1 = unsafe0;
                    c3.P(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, this.g(v));
                    break;
                }
                case 28: {
                    unsafe1 = unsafe0;
                    c3.G(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0);
                    break;
                }
                case 29: {
                    unsafe1 = unsafe0;
                    c3.V(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 30: {
                    unsafe1 = unsafe0;
                    c3.I(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 0x1F: {
                    unsafe1 = unsafe0;
                    c3.Q(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 0x20: {
                    unsafe1 = unsafe0;
                    c3.R(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 33: {
                    unsafe1 = unsafe0;
                    c3.S(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 34: {
                    unsafe1 = unsafe0;
                    c3.T(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, false);
                    break;
                }
                case 35: {
                    unsafe1 = unsafe0;
                    c3.H(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 36: {
                    unsafe1 = unsafe0;
                    c3.L(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 37: {
                    unsafe1 = unsafe0;
                    c3.O(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 38: {
                    unsafe1 = unsafe0;
                    c3.W(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 39: {
                    unsafe1 = unsafe0;
                    c3.N(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 40: {
                    unsafe1 = unsafe0;
                    c3.K(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 41: {
                    unsafe1 = unsafe0;
                    c3.J(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 42: {
                    unsafe1 = unsafe0;
                    c3.F(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 43: {
                    unsafe1 = unsafe0;
                    c3.V(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 44: {
                    unsafe1 = unsafe0;
                    c3.I(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 45: {
                    unsafe1 = unsafe0;
                    c3.Q(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 46: {
                    unsafe1 = unsafe0;
                    c3.R(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 0x2F: {
                    unsafe1 = unsafe0;
                    c3.S(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 0x30: {
                    unsafe1 = unsafe0;
                    c3.T(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, true);
                    break;
                }
                case 49: {
                    unsafe1 = unsafe0;
                    c3.M(arr_v[v], ((List)unsafe1.getObject(object0, v9)), writer0, this.g(v));
                    break;
                }
                case 50: {
                    unsafe1 = unsafe0;
                    this.R(writer0, v4, unsafe1.getObject(object0, v9), v);
                    break;
                }
                case 51: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeDouble(v4, ((double)(((Double)d4.c.m(object0, v9)))));
                    }
                    break;
                }
                case 52: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeFloat(v4, ((float)(((Float)d4.c.m(object0, v9)))));
                    }
                    break;
                }
                case 53: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeInt64(v4, i2.y(object0, v9));
                    }
                    break;
                }
                case 54: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeUInt64(v4, i2.y(object0, v9));
                    }
                    break;
                }
                case 55: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeInt32(v4, i2.x(object0, v9));
                    }
                    break;
                }
                case 56: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeFixed64(v4, i2.y(object0, v9));
                    }
                    break;
                }
                case 57: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeFixed32(v4, i2.x(object0, v9));
                    }
                    break;
                }
                case 58: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeBool(v4, ((Boolean)d4.c.m(object0, v9)).booleanValue());
                    }
                    break;
                }
                case 59: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        i2.S(v4, unsafe1.getObject(object0, v9), writer0);
                    }
                    break;
                }
                case 60: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeMessage(v4, unsafe1.getObject(object0, v9), this.g(v));
                    }
                    break;
                }
                case 61: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeBytes(v4, ((ByteString)unsafe1.getObject(object0, v9)));
                    }
                    break;
                }
                case 62: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeUInt32(v4, i2.x(object0, v9));
                    }
                    break;
                }
                case 0x3F: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeEnum(v4, i2.x(object0, v9));
                    }
                    break;
                }
                case 0x40: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeSFixed32(v4, i2.x(object0, v9));
                    }
                    break;
                }
                case 65: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeSFixed64(v4, i2.y(object0, v9));
                    }
                    break;
                }
                case 66: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeSInt32(v4, i2.x(object0, v9));
                    }
                    break;
                }
                case 67: {
                    unsafe1 = unsafe0;
                    if(this.m(v4, v, object0)) {
                        writer0.writeSInt64(v4, i2.y(object0, v9));
                    }
                    break;
                }
                case 68: {
                    if(this.m(v4, v, object0)) {
                        unsafe1 = unsafe0;
                        writer0.writeGroup(v4, unsafe1.getObject(object0, v9), this.g(v));
                    }
                    else {
                        unsafe1 = unsafe0;
                    }
                    break;
                }
                default: {
                    unsafe1 = unsafe0;
                }
            }
            v += 3;
            unsafe0 = unsafe1;
        }
        while(map$Entry0 != null) {
            q00.g(writer0, map$Entry0);
            if(iterator0.hasNext()) {
                Object object3 = iterator0.next();
                map$Entry0 = (Map.Entry)object3;
            }
            else {
                map$Entry0 = null;
            }
        }
        ((x3)this.o).getClass();
        ((GeneratedMessageLite)object0).unknownFields.writeTo(writer0);
    }

    public final void R(Writer writer0, int v, Object object0, int v1) {
        if(object0 != null) {
            Object object1 = this.f(v1);
            writer0.writeMap(v, this.q.forMapMetadata(object1), this.q.forMapData(object0));
        }
    }

    public static void S(int v, Object object0, Writer writer0) {
        if(object0 instanceof String) {
            writer0.writeString(v, ((String)object0));
            return;
        }
        writer0.writeBytes(v, ((ByteString)object0));
    }

    public final boolean a(int v, Object object0, Object object1) {
        return this.k(v, object0) == this.k(v, object1);
    }

    public static void b(Object object0) {
        if(!i2.l(object0)) {
            throw new IllegalArgumentException("Mutating immutable message: " + object0);
        }
    }

    public static int c(byte[] arr_b, int v, int v1, FieldType wireFormat$FieldType0, Class class0, g g0) {
        int v2;
        switch(wireFormat$FieldType0) {
            case 1: {
                v2 = h.J(arr_b, v, g0);
                g0.c = Boolean.valueOf(g0.b != 0L);
                return v2;
            }
            case 2: {
                return h.b(arr_b, v, g0);
            }
            case 3: {
                g0.c = h.d(v, arr_b);
                return v + 8;
            }
            case 4: 
            case 5: {
                g0.c = h.g(v, arr_b);
                return v + 4;
            }
            case 6: 
            case 7: {
                g0.c = h.i(v, arr_b);
                return v + 8;
            }
            case 8: {
                g0.c = h.k(v, arr_b);
                return v + 4;
            }
            case 9: 
            case 10: 
            case 11: {
                v2 = h.H(arr_b, v, g0);
                g0.c = g0.a;
                return v2;
            }
            case 12: 
            case 13: {
                v2 = h.J(arr_b, v, g0);
                g0.c = g0.b;
                return v2;
            }
            case 14: {
                return h.o(v2.c.a(class0), arr_b, v, v1, g0);
            }
            case 15: {
                v2 = h.H(arr_b, v, g0);
                g0.c = (int)(-(g0.a & 1) ^ g0.a >>> 1);
                return v2;
            }
            case 16: {
                v2 = h.J(arr_b, v, g0);
                g0.c = (long)(-(g0.b & 1L) ^ g0.b >>> 1);
                return v2;
            }
            case 17: {
                return h.E(arr_b, v, g0);
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
    }

    public final Object d(Object object0, int v, Object object1, w3 w30, Object object2) {
        int v1 = this.a[v];
        int v2 = this.P(v);
        Object object3 = d4.c.m(object0, ((long)(v2 & 0xFFFFF)));
        if(object3 == null) {
            return object1;
        }
        EnumVerifier internal$EnumVerifier0 = this.e(v);
        if(internal$EnumVerifier0 == null) {
            return object1;
        }
        Map map0 = this.q.forMutableMapData(object3);
        Object object4 = this.f(v);
        d2 d20 = this.q.forMapMetadata(object4);
        Iterator iterator0 = map0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object5 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object5;
            if(!internal$EnumVerifier0.isInRange(((int)(((Integer)map$Entry0.getValue()))))) {
                if(object1 == null) {
                    object1 = w30.a(object2);
                }
                byte[] arr_b = new byte[MapEntryLite.a(d20, map$Entry0.getKey(), map$Entry0.getValue())];
                CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(arr_b);
                try {
                    MapEntryLite.c(codedOutputStream0, d20, map$Entry0.getKey(), map$Entry0.getValue());
                }
                catch(IOException iOException0) {
                    throw new RuntimeException(iOException0);
                }
                codedOutputStream0.checkNoSpaceLeft();
                q q0 = new q(arr_b);
                ((x3)w30).getClass();
                ((UnknownFieldSetLite)object1).e(v1 << 3 | 2, q0);
                iterator0.remove();
            }
        }
        return object1;
    }

    public final EnumVerifier e(int v) {
        return (EnumVerifier)this.b[v / 3 * 2 + 1];
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final boolean equals(Object object0, Object object1) {
        int[] arr_v = this.a;
        for(int v = 0; true; v += 3) {
            boolean z = true;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = this.P(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(!this.a(v, object0, object1) || Double.doubleToLongBits(d4.c.h(object0, v2)) != Double.doubleToLongBits(d4.c.h(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 1: {
                    if(!this.a(v, object0, object1) || Float.floatToIntBits(d4.c.i(object0, v2)) != Float.floatToIntBits(d4.c.i(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 2: {
                    if(!this.a(v, object0, object1) || d4.c.l(object0, v2) != d4.c.l(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 3: {
                    if(!this.a(v, object0, object1) || d4.c.l(object0, v2) != d4.c.l(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 4: {
                    if(!this.a(v, object0, object1) || d4.c.j(object0, v2) != d4.c.j(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 5: {
                    if(!this.a(v, object0, object1) || d4.c.l(object0, v2) != d4.c.l(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 6: {
                    if(!this.a(v, object0, object1) || d4.c.j(object0, v2) != d4.c.j(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 7: {
                    if(!this.a(v, object0, object1) || d4.c.e(object0, v2) != d4.c.e(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 8: {
                    if(!this.a(v, object0, object1) || !c3.D(d4.c.m(object0, v2), d4.c.m(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 9: {
                    if(!this.a(v, object0, object1) || !c3.D(d4.c.m(object0, v2), d4.c.m(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 10: {
                    if(!this.a(v, object0, object1) || !c3.D(d4.c.m(object0, v2), d4.c.m(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 11: {
                    if(!this.a(v, object0, object1) || d4.c.j(object0, v2) != d4.c.j(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 12: {
                    if(!this.a(v, object0, object1) || d4.c.j(object0, v2) != d4.c.j(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 13: {
                    if(!this.a(v, object0, object1) || d4.c.j(object0, v2) != d4.c.j(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 14: {
                    if(!this.a(v, object0, object1) || d4.c.l(object0, v2) != d4.c.l(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 15: {
                    if(!this.a(v, object0, object1) || d4.c.j(object0, v2) != d4.c.j(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 16: {
                    if(!this.a(v, object0, object1) || d4.c.l(object0, v2) != d4.c.l(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 17: {
                    if(!this.a(v, object0, object1) || !c3.D(d4.c.m(object0, v2), d4.c.m(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    z = c3.D(d4.c.m(object0, v2), d4.c.m(object1, v2));
                    break;
                }
                case 50: {
                    z = c3.D(d4.c.m(object0, v2), d4.c.m(object1, v2));
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: 
                case 68: {
                    long v3 = (long)(arr_v[v + 2] & 0xFFFFF);
                    if(d4.c.j(object0, v3) != d4.c.j(object1, v3) || !c3.D(d4.c.m(object0, v2), d4.c.m(object1, v2))) {
                        z = false;
                    }
                }
            }
            if(!z) {
                return false;
            }
        }
        ((x3)this.o).getClass();
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        ((x3)this.o).getClass();
        if(!unknownFieldSetLite0.equals(((GeneratedMessageLite)object1).unknownFields)) {
            return false;
        }
        if(this.f) {
            ((s0)this.p).getClass();
            d1 d10 = ((ExtendableMessage)object0).extensions;
            ((s0)this.p).getClass();
            return d10.equals(((ExtendableMessage)object1).extensions);
        }
        return true;
    }

    public final Object f(int v) {
        return this.b[v / 3 * 2];
    }

    public final Schema g(int v) {
        int v1 = v / 3 * 2;
        Object[] arr_object = this.b;
        Schema schema0 = (Schema)arr_object[v1];
        if(schema0 != null) {
            return schema0;
        }
        Schema schema1 = v2.c.a(((Class)arr_object[v1 + 1]));
        arr_object[v1] = schema1;
        return schema1;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final int getSerializedSize(Object object0) {
        return this.h ? this.j(object0) : this.i(object0);
    }

    public static UnknownFieldSetLite h(Object object0) {
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        if(unknownFieldSetLite0 == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite0 = new UnknownFieldSetLite();
            ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
        }
        return unknownFieldSetLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final int hashCode(Object object0) {
        int v7;
        int v6;
        int[] arr_v = this.a;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; v += 3) {
            int v2 = this.P(v);
            int v3 = arr_v[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    v6 = v1 * 53;
                    v7 = Internal.hashLong(Double.doubleToLongBits(d4.c.h(object0, v4)));
                    v1 = v7 + v6;
                    break;
                }
                case 1: {
                    v6 = v1 * 53;
                    v7 = Float.floatToIntBits(d4.c.i(object0, v4));
                    v1 = v7 + v6;
                    break;
                }
                case 2: {
                    v6 = v1 * 53;
                    v7 = Internal.hashLong(d4.c.l(object0, v4));
                    v1 = v7 + v6;
                    break;
                }
                case 3: {
                    v6 = v1 * 53;
                    v7 = Internal.hashLong(d4.c.l(object0, v4));
                    v1 = v7 + v6;
                    break;
                }
                case 4: {
                    v1 = d4.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 5: {
                    v1 = Internal.hashLong(d4.c.l(object0, v4)) + v1 * 53;
                    break;
                }
                case 6: {
                    v1 = d4.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 7: {
                    v1 = Internal.hashBoolean(d4.c.e(object0, v4)) + v1 * 53;
                    break;
                }
                case 8: {
                    v1 = ((String)d4.c.m(object0, v4)).hashCode() + v1 * 53;
                    break;
                }
                case 9: {
                    Object object1 = d4.c.m(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v1 = d4.c.m(object0, v4).hashCode() + v1 * 53;
                    break;
                }
                case 11: {
                    v1 = d4.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 12: {
                    v1 = d4.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 13: {
                    v1 = d4.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 14: {
                    v1 = Internal.hashLong(d4.c.l(object0, v4)) + v1 * 53;
                    break;
                }
                case 15: {
                    v1 = d4.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 16: {
                    v1 = Internal.hashLong(d4.c.l(object0, v4)) + v1 * 53;
                    break;
                }
                case 17: {
                    Object object2 = d4.c.m(object0, v4);
                    if(object2 != null) {
                        v5 = object2.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    v1 = d4.c.m(object0, v4).hashCode() + v1 * 53;
                    break;
                }
                case 50: {
                    v1 = d4.c.m(object0, v4).hashCode() + v1 * 53;
                    break;
                }
                case 51: {
                    if(this.m(v3, v, object0)) {
                        v1 = Internal.hashLong(Double.doubleToLongBits(((double)(((Double)d4.c.m(object0, v4)))))) + v1 * 53;
                    }
                    break;
                }
                case 52: {
                    if(this.m(v3, v, object0)) {
                        v1 = Float.floatToIntBits(((float)(((Float)d4.c.m(object0, v4))))) + v1 * 53;
                    }
                    break;
                }
                case 53: {
                    if(this.m(v3, v, object0)) {
                        v1 = Internal.hashLong(i2.y(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 54: {
                    if(this.m(v3, v, object0)) {
                        v1 = Internal.hashLong(i2.y(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 55: {
                    if(this.m(v3, v, object0)) {
                        v1 = i2.x(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 56: {
                    if(this.m(v3, v, object0)) {
                        v1 = Internal.hashLong(i2.y(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 57: {
                    if(this.m(v3, v, object0)) {
                        v1 = i2.x(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 58: {
                    if(this.m(v3, v, object0)) {
                        v1 = Internal.hashBoolean(((Boolean)d4.c.m(object0, v4)).booleanValue()) + v1 * 53;
                    }
                    break;
                }
                case 59: {
                    if(this.m(v3, v, object0)) {
                        v1 = ((String)d4.c.m(object0, v4)).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 60: {
                    if(this.m(v3, v, object0)) {
                        v1 = d4.c.m(object0, v4).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 61: {
                    if(this.m(v3, v, object0)) {
                        v1 = d4.c.m(object0, v4).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 62: {
                    if(this.m(v3, v, object0)) {
                        v1 = i2.x(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.m(v3, v, object0)) {
                        v1 = i2.x(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 0x40: {
                    if(this.m(v3, v, object0)) {
                        v1 = i2.x(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 65: {
                    if(this.m(v3, v, object0)) {
                        v1 = Internal.hashLong(i2.y(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 66: {
                    if(this.m(v3, v, object0)) {
                        v1 = i2.x(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 67: {
                    if(this.m(v3, v, object0)) {
                        v1 = Internal.hashLong(i2.y(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 68: {
                    if(this.m(v3, v, object0)) {
                        v1 = d4.c.m(object0, v4).hashCode() + v1 * 53;
                    }
                }
            }
        }
        ((x3)this.o).getClass();
        int v8 = ((GeneratedMessageLite)object0).unknownFields.hashCode() + v1 * 53;
        if(this.f) {
            ((s0)this.p).getClass();
            return v8 * 53 + ((ExtendableMessage)object0).extensions.a.hashCode();
        }
        return v8;
    }

    public final int i(Object object0) {
        int v14;
        int v13;
        int v12;
        int v11;
        int v9;
        int v7;
        Unsafe unsafe0 = i2.s;
        int v = 0xFFFFF;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; true; v1 += 3) {
            int[] arr_v = this.a;
            if(v1 >= arr_v.length) {
                break;
            }
            int v4 = this.P(v1);
            int v5 = arr_v[v1];
            int v6 = (v4 & 0xFF00000) >>> 20;
            boolean z = this.i;
            if(v6 <= 17) {
                v7 = arr_v[v1 + 2];
                int v8 = v7 & 0xFFFFF;
                v9 = 1 << (v7 >>> 20);
                if(v8 != v) {
                    v3 = unsafe0.getInt(object0, ((long)v8));
                    v = v8;
                }
            }
            else {
                v7 = !z || v6 < androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED.id() || v6 > androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED.id() ? 0 : arr_v[v1 + 2] & 0xFFFFF;
                v9 = 0;
            }
            long v10 = (long)(v4 & 0xFFFFF);
            switch(v6) {
                case 0: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.computeDoubleSize(v5, 0.0);
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 1: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.computeFloatSize(v5, 0.0f);
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 2: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.computeInt64Size(v5, unsafe0.getLong(object0, v10));
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 3: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.computeUInt64Size(v5, unsafe0.getLong(object0, v10));
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 4: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.computeInt32Size(v5, unsafe0.getInt(object0, v10));
                        v2 += v11;
                        break;
                    }
                    break;
                }
                case 5: {
                    if((v3 & v9) != 0) {
                        v11 = CodedOutputStream.computeFixed64Size(v5, 0L);
                        v2 += v11;
                    }
                    break;
                }
                case 6: {
                    if((v3 & v9) != 0) {
                        v2 += CodedOutputStream.computeFixed32Size(v5, 0);
                    }
                    break;
                }
                case 7: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.computeBoolSize(v5, true);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 8: {
                    if((v3 & v9) != 0) {
                        Object object1 = unsafe0.getObject(object0, v10);
                        v13 = object1 instanceof ByteString ? CodedOutputStream.computeBytesSize(v5, ((ByteString)object1)) : CodedOutputStream.computeStringSize(v5, ((String)object1));
                        v2 = v13 + v2;
                        break;
                    }
                    break;
                }
                case 9: {
                    if((v3 & v9) != 0) {
                        v12 = c3.o(v5, unsafe0.getObject(object0, v10), this.g(v1));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 10: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.computeBytesSize(v5, ((ByteString)unsafe0.getObject(object0, v10)));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 11: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.computeUInt32Size(v5, unsafe0.getInt(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 12: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.computeEnumSize(v5, unsafe0.getInt(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 13: {
                    if((v3 & v9) != 0) {
                        v14 = CodedOutputStream.computeSFixed32Size(v5, 0);
                        v2 += v14;
                        break;
                    }
                    break;
                }
                case 14: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.computeSFixed64Size(v5, 0L);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 15: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.computeSInt32Size(v5, unsafe0.getInt(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 16: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.computeSInt64Size(v5, unsafe0.getLong(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 17: {
                    if((v3 & v9) != 0) {
                        v12 = CodedOutputStream.a(v5, ((MessageLite)unsafe0.getObject(object0, v10)), this.g(v1));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 18: {
                    v12 = c3.h(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 19: {
                    v12 = c3.f(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 20: {
                    v12 = c3.m(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 21: {
                    v12 = c3.x(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 22: {
                    v12 = c3.k(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 23: {
                    v12 = c3.h(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 24: {
                    v12 = c3.f(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 25: {
                    v12 = c3.a(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 26: {
                    v12 = c3.u(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 27: {
                    v12 = c3.p(v5, ((List)unsafe0.getObject(object0, v10)), this.g(v1));
                    v2 += v12;
                    break;
                }
                case 28: {
                    v12 = c3.c(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 29: {
                    v12 = c3.v(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 30: {
                    v12 = c3.d(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 0x1F: {
                    v12 = c3.f(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 0x20: {
                    v12 = c3.h(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 33: {
                    v12 = c3.q(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 34: {
                    v12 = c3.s(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v12;
                    break;
                }
                case 35: {
                    int v15 = c3.i(((List)unsafe0.getObject(object0, v10)));
                    if(v15 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v15);
                        }
                        v2 = b.b(v15, CodedOutputStream.computeTagSize(v5), v15, v2);
                    }
                    break;
                }
                case 36: {
                    int v16 = c3.g(((List)unsafe0.getObject(object0, v10)));
                    if(v16 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v16);
                        }
                        v2 = b.b(v16, CodedOutputStream.computeTagSize(v5), v16, v2);
                    }
                    break;
                }
                case 37: {
                    int v17 = c3.n(((List)unsafe0.getObject(object0, v10)));
                    if(v17 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v17);
                        }
                        v2 = b.b(v17, CodedOutputStream.computeTagSize(v5), v17, v2);
                    }
                    break;
                }
                case 38: {
                    int v18 = c3.y(((List)unsafe0.getObject(object0, v10)));
                    if(v18 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v18);
                        }
                        v2 = b.b(v18, CodedOutputStream.computeTagSize(v5), v18, v2);
                    }
                    break;
                }
                case 39: {
                    int v19 = c3.l(((List)unsafe0.getObject(object0, v10)));
                    if(v19 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v19);
                        }
                        v2 = b.b(v19, CodedOutputStream.computeTagSize(v5), v19, v2);
                    }
                    break;
                }
                case 40: {
                    int v20 = c3.i(((List)unsafe0.getObject(object0, v10)));
                    if(v20 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v20);
                        }
                        v2 = b.b(v20, CodedOutputStream.computeTagSize(v5), v20, v2);
                    }
                    break;
                }
                case 41: {
                    int v21 = c3.g(((List)unsafe0.getObject(object0, v10)));
                    if(v21 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v21);
                        }
                        v2 = b.b(v21, CodedOutputStream.computeTagSize(v5), v21, v2);
                    }
                    break;
                }
                case 42: {
                    int v22 = c3.b(((List)unsafe0.getObject(object0, v10)));
                    if(v22 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v22);
                        }
                        v2 = b.b(v22, CodedOutputStream.computeTagSize(v5), v22, v2);
                    }
                    break;
                }
                case 43: {
                    int v23 = c3.w(((List)unsafe0.getObject(object0, v10)));
                    if(v23 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v23);
                        }
                        v2 = b.b(v23, CodedOutputStream.computeTagSize(v5), v23, v2);
                    }
                    break;
                }
                case 44: {
                    int v24 = c3.e(((List)unsafe0.getObject(object0, v10)));
                    if(v24 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v24);
                        }
                        v2 = b.b(v24, CodedOutputStream.computeTagSize(v5), v24, v2);
                    }
                    break;
                }
                case 45: {
                    int v25 = c3.g(((List)unsafe0.getObject(object0, v10)));
                    if(v25 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v25);
                        }
                        v2 = b.b(v25, CodedOutputStream.computeTagSize(v5), v25, v2);
                    }
                    break;
                }
                case 46: {
                    int v26 = c3.i(((List)unsafe0.getObject(object0, v10)));
                    if(v26 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v26);
                        }
                        v2 = b.b(v26, CodedOutputStream.computeTagSize(v5), v26, v2);
                    }
                    break;
                }
                case 0x2F: {
                    int v27 = c3.r(((List)unsafe0.getObject(object0, v10)));
                    if(v27 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v27);
                        }
                        v2 = b.b(v27, CodedOutputStream.computeTagSize(v5), v27, v2);
                    }
                    break;
                }
                case 0x30: {
                    int v28 = c3.t(((List)unsafe0.getObject(object0, v10)));
                    if(v28 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v7), v28);
                        }
                        v2 = b.b(v28, CodedOutputStream.computeTagSize(v5), v28, v2);
                    }
                    break;
                }
                case 49: {
                    v12 = c3.j(v5, ((List)unsafe0.getObject(object0, v10)), this.g(v1));
                    v2 += v12;
                    break;
                }
                case 50: {
                    Object object2 = unsafe0.getObject(object0, v10);
                    Object object3 = this.f(v1);
                    v2 += this.q.getSerializedSize(v5, object2, object3);
                    break;
                }
                case 51: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeDoubleSize(v5, 0.0);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeFloatSize(v5, 0.0f);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeInt64Size(v5, i2.y(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeUInt64Size(v5, i2.y(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeInt32Size(v5, i2.x(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeFixed64Size(v5, 0L);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.m(v5, v1, object0)) {
                        v14 = CodedOutputStream.computeFixed32Size(v5, 0);
                        v2 += v14;
                    }
                    break;
                }
                case 58: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeBoolSize(v5, true);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 59: {
                    if(this.m(v5, v1, object0)) {
                        Object object4 = unsafe0.getObject(object0, v10);
                        v13 = object4 instanceof ByteString ? CodedOutputStream.computeBytesSize(v5, ((ByteString)object4)) : CodedOutputStream.computeStringSize(v5, ((String)object4));
                        v2 = v13 + v2;
                    }
                    break;
                }
                case 60: {
                    if(this.m(v5, v1, object0)) {
                        v12 = c3.o(v5, unsafe0.getObject(object0, v10), this.g(v1));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeBytesSize(v5, ((ByteString)unsafe0.getObject(object0, v10)));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeUInt32Size(v5, i2.x(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeEnumSize(v5, i2.x(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.m(v5, v1, object0)) {
                        v2 += CodedOutputStream.computeSFixed32Size(v5, 0);
                    }
                    break;
                }
                case 65: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeSFixed64Size(v5, 0L);
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeSInt32Size(v5, i2.x(object0, v10));
                        v2 += v12;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.m(v5, v1, object0)) {
                        v12 = CodedOutputStream.computeSInt64Size(v5, i2.y(object0, v10));
                        v2 += v12;
                    }
                    break;
                }
                case 68: {
                    if(this.m(v5, v1, object0)) {
                        v2 += CodedOutputStream.a(v5, ((MessageLite)unsafe0.getObject(object0, v10)), this.g(v1));
                    }
                }
            }
        }
        ((x3)this.o).getClass();
        int v29 = ((GeneratedMessageLite)object0).unknownFields.getSerializedSize() + v2;
        return this.f ? v29 + this.p.c(object0).i() : v29;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object object0) {
        int v = 0xFFFFF;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            boolean z = true;
            if(v1 >= this.k) {
                break;
            }
            int v3 = this.j[v1];
            int v4 = this.a[v3];
            int v5 = this.P(v3);
            int v6 = this.a[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 != v) {
                if(v7 != 0xFFFFF) {
                    v2 = i2.s.getInt(object0, ((long)v7));
                }
                v = v7;
            }
            if((0x10000000 & v5) != 0 && !(v == 0xFFFFF ? this.k(v3, object0) : (v2 & v8) != 0)) {
                return false;
            }
            switch((v5 & 0xFF00000) >>> 20) {
                case 9: 
                case 17: {
                    if(v == 0xFFFFF) {
                        z = this.k(v3, object0);
                    }
                    else if((v8 & v2) == 0) {
                        z = false;
                    }
                    if(z && !this.g(v3).isInitialized(d4.c.m(object0, ((long)(v5 & 0xFFFFF))))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)d4.c.m(object0, ((long)(v5 & 0xFFFFF)));
                    if(!list0.isEmpty()) {
                        Schema schema1 = this.g(v3);
                        for(int v9 = 0; v9 < list0.size(); ++v9) {
                            if(!schema1.isInitialized(list0.get(v9))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    Object object1 = d4.c.m(object0, ((long)(v5 & 0xFFFFF)));
                    Map map0 = this.q.forMapData(object1);
                    if(!map0.isEmpty() && this.q.forMapMetadata(this.f(v3)).c.getJavaType() == JavaType.MESSAGE) {
                        Schema schema0 = null;
                        Iterator iterator0 = map0.values().iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                break;
                            }
                            Object object2 = iterator0.next();
                            if(schema0 == null) {
                                Class class0 = object2.getClass();
                                schema0 = v2.c.a(class0);
                            }
                            if(schema0.isInitialized(object2)) {
                                continue;
                            }
                            return false;
                        }
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.m(v4, v3, object0) && !this.g(v3).isInitialized(d4.c.m(object0, ((long)(v5 & 0xFFFFF))))) {
                        return false;
                    }
                }
            }
            ++v1;
        }
        return !this.f || this.p.c(object0).k();
    }

    public final int j(Object object0) {
        int v8;
        int v7;
        Unsafe unsafe0 = i2.s;
        int v1 = 0;
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v2 = this.P(v);
            int v3 = (v2 & 0xFF00000) >>> 20;
            int v4 = arr_v[v];
            long v5 = (long)(v2 & 0xFFFFF);
            int v6 = v3 < androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED.id() || v3 > androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED.id() ? 0 : arr_v[v + 2] & 0xFFFFF;
            boolean z = this.i;
            switch(v3) {
                case 0: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeDoubleSize(v4, 0.0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 1: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeFloatSize(v4, 0.0f);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 2: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeInt64Size(v4, d4.m(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 3: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeUInt64Size(v4, d4.m(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 4: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeInt32Size(v4, d4.l(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 5: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeFixed64Size(v4, 0L);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 6: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeFixed32Size(v4, 0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 7: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeBoolSize(v4, true);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 8: {
                    if(this.k(v, object0)) {
                        Object object1 = d4.n(object0, v5);
                        v8 = object1 instanceof ByteString ? CodedOutputStream.computeBytesSize(v4, ((ByteString)object1)) : CodedOutputStream.computeStringSize(v4, ((String)object1));
                        v1 = v8 + v1;
                        break;
                    }
                    break;
                }
                case 9: {
                    if(this.k(v, object0)) {
                        v7 = c3.o(v4, d4.n(object0, v5), this.g(v));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 10: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeBytesSize(v4, ((ByteString)d4.n(object0, v5)));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 11: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeUInt32Size(v4, d4.l(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 12: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeEnumSize(v4, d4.l(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 13: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeSFixed32Size(v4, 0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 14: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeSFixed64Size(v4, 0L);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 15: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeSInt32Size(v4, d4.l(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 16: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.computeSInt64Size(v4, d4.m(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 17: {
                    if(this.k(v, object0)) {
                        v7 = CodedOutputStream.a(v4, ((MessageLite)d4.n(object0, v5)), this.g(v));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 18: {
                    v7 = c3.h(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 19: {
                    v7 = c3.f(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 20: {
                    v7 = c3.m(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 21: {
                    v7 = c3.x(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 22: {
                    v7 = c3.k(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 23: {
                    v7 = c3.h(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 24: {
                    v7 = c3.f(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 25: {
                    v7 = c3.a(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 26: {
                    v7 = c3.u(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 27: {
                    v7 = c3.p(v4, i2.n(object0, v5), this.g(v));
                    v1 += v7;
                    break;
                }
                case 28: {
                    v7 = c3.c(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 29: {
                    v7 = c3.v(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 30: {
                    v7 = c3.d(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 0x1F: {
                    v7 = c3.f(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 0x20: {
                    v7 = c3.h(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 33: {
                    v7 = c3.q(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 34: {
                    v7 = c3.s(v4, i2.n(object0, v5));
                    v1 += v7;
                    break;
                }
                case 35: {
                    int v9 = c3.i(((List)unsafe0.getObject(object0, v5)));
                    if(v9 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v9);
                        }
                        v1 = b.b(v9, CodedOutputStream.computeTagSize(v4), v9, v1);
                    }
                    break;
                }
                case 36: {
                    int v10 = c3.g(((List)unsafe0.getObject(object0, v5)));
                    if(v10 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v10);
                        }
                        v1 = b.b(v10, CodedOutputStream.computeTagSize(v4), v10, v1);
                    }
                    break;
                }
                case 37: {
                    int v11 = c3.n(((List)unsafe0.getObject(object0, v5)));
                    if(v11 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v11);
                        }
                        v1 = b.b(v11, CodedOutputStream.computeTagSize(v4), v11, v1);
                    }
                    break;
                }
                case 38: {
                    int v12 = c3.y(((List)unsafe0.getObject(object0, v5)));
                    if(v12 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v12);
                        }
                        v1 = b.b(v12, CodedOutputStream.computeTagSize(v4), v12, v1);
                    }
                    break;
                }
                case 39: {
                    int v13 = c3.l(((List)unsafe0.getObject(object0, v5)));
                    if(v13 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v13);
                        }
                        v1 = b.b(v13, CodedOutputStream.computeTagSize(v4), v13, v1);
                    }
                    break;
                }
                case 40: {
                    int v14 = c3.i(((List)unsafe0.getObject(object0, v5)));
                    if(v14 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v14);
                        }
                        v1 = b.b(v14, CodedOutputStream.computeTagSize(v4), v14, v1);
                    }
                    break;
                }
                case 41: {
                    int v15 = c3.g(((List)unsafe0.getObject(object0, v5)));
                    if(v15 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v15);
                        }
                        v1 = b.b(v15, CodedOutputStream.computeTagSize(v4), v15, v1);
                    }
                    break;
                }
                case 42: {
                    int v16 = c3.b(((List)unsafe0.getObject(object0, v5)));
                    if(v16 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v16);
                        }
                        v1 = b.b(v16, CodedOutputStream.computeTagSize(v4), v16, v1);
                    }
                    break;
                }
                case 43: {
                    int v17 = c3.w(((List)unsafe0.getObject(object0, v5)));
                    if(v17 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v17);
                        }
                        v1 = b.b(v17, CodedOutputStream.computeTagSize(v4), v17, v1);
                    }
                    break;
                }
                case 44: {
                    int v18 = c3.e(((List)unsafe0.getObject(object0, v5)));
                    if(v18 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v18);
                        }
                        v1 = b.b(v18, CodedOutputStream.computeTagSize(v4), v18, v1);
                    }
                    break;
                }
                case 45: {
                    int v19 = c3.g(((List)unsafe0.getObject(object0, v5)));
                    if(v19 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v19);
                        }
                        v1 = b.b(v19, CodedOutputStream.computeTagSize(v4), v19, v1);
                    }
                    break;
                }
                case 46: {
                    int v20 = c3.i(((List)unsafe0.getObject(object0, v5)));
                    if(v20 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v20);
                        }
                        v1 = b.b(v20, CodedOutputStream.computeTagSize(v4), v20, v1);
                    }
                    break;
                }
                case 0x2F: {
                    int v21 = c3.r(((List)unsafe0.getObject(object0, v5)));
                    if(v21 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v21);
                        }
                        v1 = b.b(v21, CodedOutputStream.computeTagSize(v4), v21, v1);
                    }
                    break;
                }
                case 0x30: {
                    int v22 = c3.t(((List)unsafe0.getObject(object0, v5)));
                    if(v22 > 0) {
                        if(z) {
                            unsafe0.putInt(object0, ((long)v6), v22);
                        }
                        v1 = b.b(v22, CodedOutputStream.computeTagSize(v4), v22, v1);
                    }
                    break;
                }
                case 49: {
                    v7 = c3.j(v4, i2.n(object0, v5), this.g(v));
                    v1 += v7;
                    break;
                }
                case 50: {
                    Object object2 = d4.n(object0, v5);
                    Object object3 = this.f(v);
                    v1 += this.q.getSerializedSize(v4, object2, object3);
                    break;
                }
                case 51: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeDoubleSize(v4, 0.0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeFloatSize(v4, 0.0f);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeInt64Size(v4, i2.y(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeUInt64Size(v4, i2.y(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeInt32Size(v4, i2.x(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeFixed64Size(v4, 0L);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeFixed32Size(v4, 0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 58: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeBoolSize(v4, true);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 59: {
                    if(this.m(v4, v, object0)) {
                        Object object4 = d4.n(object0, v5);
                        v8 = object4 instanceof ByteString ? CodedOutputStream.computeBytesSize(v4, ((ByteString)object4)) : CodedOutputStream.computeStringSize(v4, ((String)object4));
                        v1 = v8 + v1;
                    }
                    break;
                }
                case 60: {
                    if(this.m(v4, v, object0)) {
                        v7 = c3.o(v4, d4.n(object0, v5), this.g(v));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeBytesSize(v4, ((ByteString)d4.n(object0, v5)));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeUInt32Size(v4, i2.x(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeEnumSize(v4, i2.x(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeSFixed32Size(v4, 0);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 65: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeSFixed64Size(v4, 0L);
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeSInt32Size(v4, i2.x(object0, v5));
                        v1 += v7;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.m(v4, v, object0)) {
                        v7 = CodedOutputStream.computeSInt64Size(v4, i2.y(object0, v5));
                        v1 += v7;
                    }
                    break;
                }
                case 68: {
                    if(this.m(v4, v, object0)) {
                        v1 += CodedOutputStream.a(v4, ((MessageLite)d4.n(object0, v5)), this.g(v));
                    }
                }
            }
        }
        ((x3)this.o).getClass();
        return ((GeneratedMessageLite)object0).unknownFields.getSerializedSize() + v1;
    }

    public final boolean k(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(Long.compare(v1 & 0xFFFFF, 0xFFFFFL) == 0) {
            int v2 = this.P(v);
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    return Double.doubleToRawLongBits(d4.c.h(object0, ((long)(v2 & 0xFFFFF)))) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(d4.c.i(object0, ((long)(v2 & 0xFFFFF)))) != 0;
                }
                case 2: {
                    return d4.c.l(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return d4.c.l(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return d4.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return d4.c.l(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return d4.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return d4.c.e(object0, ((long)(v2 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = d4.c.m(object0, ((long)(v2 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    return !ByteString.EMPTY.equals(object1);
                }
                case 9: {
                    return d4.c.m(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = d4.c.m(object0, ((long)(v2 & 0xFFFFF)));
                    return !ByteString.EMPTY.equals(object2);
                }
                case 11: {
                    return d4.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return d4.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return d4.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return d4.c.l(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return d4.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return d4.c.l(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return d4.c.m(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (1 << (v1 >>> 20) & d4.c.j(object0, ((long)(v1 & 0xFFFFF)))) != 0;
    }

    public static boolean l(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 instanceof GeneratedMessageLite ? ((GeneratedMessageLite)object0).j() : true;
    }

    public final boolean m(int v, int v1, Object object0) {
        return d4.c.j(object0, ((long)(this.a[v1 + 2] & 0xFFFFF))) == v;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void makeImmutable(Object object0) {
        if(!i2.l(object0)) {
            return;
        }
        if(object0 instanceof GeneratedMessageLite) {
            ((GeneratedMessageLite)object0).g();
            ((GeneratedMessageLite)object0).f();
            ((GeneratedMessageLite)object0).k();
        }
        int[] arr_v = this.a;
        for(int v = 0; v < arr_v.length; v += 3) {
            int v1 = this.P(v);
            long v2 = (long)(0xFFFFF & v1);
            switch((v1 & 0xFF00000) >>> 20) {
                case 9: 
                case 17: {
                    if(this.k(v, object0)) {
                        this.g(v).makeImmutable(i2.s.getObject(object0, v2));
                    }
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.n.a(object0, v2);
                    break;
                }
                case 50: {
                    Unsafe unsafe0 = i2.s;
                    Object object1 = unsafe0.getObject(object0, v2);
                    if(object1 != null) {
                        unsafe0.putObject(object0, v2, this.q.toImmutable(object1));
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.m(arr_v[v], v, object0)) {
                        this.g(v).makeImmutable(i2.s.getObject(object0, v2));
                    }
                }
            }
        }
        this.o.b(object0);
        if(this.f) {
            this.p.e(object0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object object0, Reader reader0, ExtensionRegistryLite extensionRegistryLite0) {
        extensionRegistryLite0.getClass();
        i2.b(object0);
        this.o(this.o, this.p, object0, reader0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object object0, Object object1) {
        i2.b(object0);
        object1.getClass();
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = this.P(v);
            long v2 = (long)(0xFFFFF & v1);
            int v3 = arr_v[v];
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(this.k(v, object1)) {
                        d4.u(object0, v2, d4.c.h(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 1: {
                    if(this.k(v, object1)) {
                        d4.v(object0, v2, d4.c.i(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 2: {
                    if(this.k(v, object1)) {
                        d4.x(object0, v2, d4.c.l(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 3: {
                    if(this.k(v, object1)) {
                        d4.x(object0, v2, d4.c.l(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 4: {
                    if(this.k(v, object1)) {
                        d4.w(d4.c.j(object1, v2), v2, object0);
                        this.J(v, object0);
                    }
                    break;
                }
                case 5: {
                    if(this.k(v, object1)) {
                        d4.x(object0, v2, d4.c.l(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 6: {
                    if(this.k(v, object1)) {
                        d4.w(d4.c.j(object1, v2), v2, object0);
                        this.J(v, object0);
                    }
                    break;
                }
                case 7: {
                    if(this.k(v, object1)) {
                        d4.p(object0, v2, d4.c.e(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 8: {
                    if(this.k(v, object1)) {
                        d4.y(v2, object0, d4.c.m(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 9: {
                    this.q(v, object0, object1);
                    break;
                }
                case 10: {
                    if(this.k(v, object1)) {
                        d4.y(v2, object0, d4.c.m(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 11: {
                    if(this.k(v, object1)) {
                        d4.w(d4.c.j(object1, v2), v2, object0);
                        this.J(v, object0);
                    }
                    break;
                }
                case 12: {
                    if(this.k(v, object1)) {
                        d4.w(d4.c.j(object1, v2), v2, object0);
                        this.J(v, object0);
                    }
                    break;
                }
                case 13: {
                    if(this.k(v, object1)) {
                        d4.w(d4.c.j(object1, v2), v2, object0);
                        this.J(v, object0);
                    }
                    break;
                }
                case 14: {
                    if(this.k(v, object1)) {
                        d4.x(object0, v2, d4.c.l(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 15: {
                    if(this.k(v, object1)) {
                        d4.w(d4.c.j(object1, v2), v2, object0);
                        this.J(v, object0);
                    }
                    break;
                }
                case 16: {
                    if(this.k(v, object1)) {
                        d4.x(object0, v2, d4.c.l(object1, v2));
                        this.J(v, object0);
                    }
                    break;
                }
                case 17: {
                    this.q(v, object0, object1);
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.n.b(v2, object0, object1);
                    break;
                }
                case 50: {
                    Object object2 = d4.c.m(object0, v2);
                    Object object3 = d4.c.m(object1, v2);
                    d4.y(v2, object0, this.q.mergeFrom(object2, object3));
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if(this.m(v3, v, object1)) {
                        d4.y(v2, object0, d4.c.m(object1, v2));
                        this.K(v3, v, object0);
                    }
                    break;
                }
                case 60: {
                    this.r(v, object0, object1);
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.m(v3, v, object1)) {
                        d4.y(v2, object0, d4.c.m(object1, v2));
                        this.K(v3, v, object0);
                    }
                    break;
                }
                case 68: {
                    this.r(v, object0, object1);
                }
            }
        }
        c3.C(this.o, object0, object1);
        if(this.f) {
            ((s0)this.p).getClass();
            d1 d10 = ((ExtendableMessage)object1).extensions;
            if(!d10.a.isEmpty()) {
                ((ExtendableMessage)object0).p().o(d10);
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object object0, byte[] arr_b, int v, int v1, g g0) {
        if(this.h) {
            this.C(object0, arr_b, v, v1, g0);
            return;
        }
        this.B(object0, arr_b, v, v1, 0, g0);
    }

    public static List n(Object object0, long v) {
        return (List)d4.c.m(object0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final Object newInstance() {
        return this.m.newInstance(this.e);
    }

    public final void o(w3 w30, q0 q00, Object object0, Reader reader0, ExtensionRegistryLite extensionRegistryLite0) {
        Object object4;
        EnumVerifier internal$EnumVerifier2;
        List list1;
        ExtensionRegistryLite extensionRegistryLite4;
        EnumVerifier internal$EnumVerifier1;
        List list0;
        Schema schema0;
        ExtensionRegistryLite extensionRegistryLite3;
        ExtensionRegistryLite extensionRegistryLite2;
        x1 x10;
        int v7;
        d1 d11;
        Object object3;
        GeneratedExtension generatedMessageLite$GeneratedExtension0;
        int v4;
        UnknownFieldSetLite unknownFieldSetLite1;
        Object object2;
        int v3;
        int v2;
        Object object1 = object0;
        ExtensionRegistryLite extensionRegistryLite1 = extensionRegistryLite0;
        int[] arr_v = this.j;
        int v = this.l;
        int v1 = this.k;
        UnknownFieldSetLite unknownFieldSetLite0 = null;
        d1 d10 = null;
        while(true) {
            try {
            label_7:
                v2 = reader0.getFieldNumber();
            }
            catch(Throwable throwable0) {
                object2 = object1;
                goto label_446;
            }
            try {
                v3 = v2 < this.c || v2 > this.d ? -1 : this.L(v2, 0);
            }
            catch(Throwable throwable0) {
                object2 = object1;
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                unknownFieldSetLite0 = unknownFieldSetLite1;
                goto label_447;
            }
            if(v3 < 0) {
                if(v2 == 0x7FFFFFFF) {
                    for(int v5 = v1; v5 < v; ++v5) {
                        unknownFieldSetLite0 = this.d(object0, arr_v[v5], unknownFieldSetLite0, w30, object0);
                    }
                    if(unknownFieldSetLite0 != null) {
                        w30.d(object1, unknownFieldSetLite0);
                    }
                    return;
                }
                try {
                    generatedMessageLite$GeneratedExtension0 = this.f ? q00.b(extensionRegistryLite1, this.e, v2) : null;
                }
                catch(Throwable throwable0) {
                    object3 = object1;
                    v4 = v1;
                    object2 = object3;
                    goto label_447;
                }
                if(generatedMessageLite$GeneratedExtension0 == null) {
                    goto label_45;
                label_55:
                    for(int v6 = v1; v6 < v; ++v6) {
                        unknownFieldSetLite0 = this.d(object0, arr_v[v6], unknownFieldSetLite0, w30, object0);
                    }
                    if(unknownFieldSetLite0 != null) {
                        w30.d(object3, unknownFieldSetLite0);
                    }
                    return;
                }
                else {
                    if(d10 == null) {
                        try {
                            d11 = q00.d(object0);
                        }
                        catch(Throwable throwable0) {
                            object2 = object1;
                            goto label_446;
                        }
                    }
                    else {
                        d11 = d10;
                    }
                    try {
                        object3 = object1;
                        unknownFieldSetLite0 = q00.f(object0, reader0, generatedMessageLite$GeneratedExtension0, extensionRegistryLite0, d11, unknownFieldSetLite0, w30);
                        d10 = d11;
                        object1 = object3;
                        goto label_7;
                    label_45:
                        object3 = object1;
                        w30.getClass();
                        if(unknownFieldSetLite0 == null) {
                            unknownFieldSetLite0 = w30.a(object3);
                        }
                        if(!w30.c(unknownFieldSetLite0, reader0)) {
                            goto label_55;
                        }
                    }
                    catch(Throwable throwable0) {
                        v4 = v1;
                        object2 = object3;
                        goto label_447;
                    }
                }
                object1 = object3;
                goto label_7;
            }
            try {
                object2 = object1;
                v7 = this.P(v3);
                x10 = this.n;
                switch((v7 & 0xFF00000) >>> 20) {
                    case 0: {
                        goto label_80;
                    }
                    case 1: {
                        goto label_86;
                    }
                    case 2: {
                        goto label_92;
                    }
                    case 3: {
                        goto label_98;
                    }
                    case 4: {
                        goto label_104;
                    }
                    case 5: {
                        goto label_110;
                    }
                    case 6: {
                        goto label_116;
                    }
                    case 7: {
                        goto label_122;
                    }
                    case 8: {
                        goto label_128;
                    }
                    case 9: {
                        goto label_134;
                    }
                    case 10: {
                        goto label_141;
                    }
                    case 11: {
                        goto label_147;
                    }
                    case 12: {
                        goto label_153;
                    }
                    case 13: {
                        goto label_164;
                    }
                    case 14: {
                        goto label_170;
                    }
                    case 15: {
                        goto label_176;
                    }
                    case 16: {
                        goto label_182;
                    }
                    case 17: {
                        goto label_188;
                    }
                    case 18: {
                        goto label_195;
                    }
                    case 19: {
                        goto label_200;
                    }
                    case 20: {
                        goto label_205;
                    }
                    case 21: {
                        goto label_210;
                    }
                    case 22: {
                        goto label_215;
                    }
                    case 23: {
                        goto label_220;
                    }
                    case 24: {
                        goto label_225;
                    }
                    case 25: {
                        goto label_230;
                    }
                    case 26: {
                        goto label_235;
                    }
                    case 27: {
                        goto label_240;
                    }
                    case 28: {
                        goto label_246;
                    }
                    case 29: {
                        unknownFieldSetLite1 = unknownFieldSetLite0;
                        v4 = v1;
                        goto label_311;
                    }
                    case 30: {
                        goto label_253;
                    }
                    case 0x1F: {
                        goto label_261;
                    }
                    case 0x20: {
                        goto label_265;
                    }
                    case 33: {
                        goto label_269;
                    }
                    case 34: {
                        goto label_273;
                    }
                    case 35: {
                        goto label_277;
                    }
                    case 36: {
                        goto label_281;
                    }
                    case 37: {
                        goto label_285;
                    }
                    case 38: {
                        goto label_289;
                    }
                    case 39: {
                        goto label_293;
                    }
                    case 40: {
                        goto label_297;
                    }
                    case 41: {
                        goto label_301;
                    }
                    case 42: {
                        goto label_305;
                    }
                    case 43: {
                        goto label_309;
                    }
                    case 44: {
                        goto label_313;
                    }
                    case 45: {
                        goto label_325;
                    }
                    case 46: {
                        goto label_329;
                    }
                    case 0x2F: {
                        goto label_333;
                    }
                    case 0x30: {
                        goto label_337;
                    }
                    case 49: {
                        goto label_343;
                    }
                    case 50: {
                        goto label_348;
                    }
                    case 51: {
                        goto label_362;
                    }
                    case 52: {
                        goto label_365;
                    }
                    case 53: {
                        goto label_368;
                    }
                    case 54: {
                        goto label_371;
                    }
                    case 55: {
                        goto label_374;
                    }
                    case 56: {
                        goto label_377;
                    }
                    case 57: {
                        goto label_380;
                    }
                    case 58: {
                        goto label_383;
                    }
                    case 59: {
                        goto label_386;
                    }
                    case 60: {
                        goto label_389;
                    }
                    case 61: {
                        goto label_393;
                    }
                    case 62: {
                        goto label_396;
                    }
                    case 0x3F: {
                        goto label_399;
                    }
                    case 0x40: {
                        goto label_409;
                    }
                    case 65: {
                        goto label_412;
                    }
                    case 66: {
                        goto label_415;
                    }
                    case 67: {
                        goto label_418;
                    }
                    case 68: {
                        goto label_421;
                    }
                    default: {
                        try {
                            if(unknownFieldSetLite0 == null) {
                                unknownFieldSetLite0 = w30.a(object2);
                            }
                            if(!w30.c(unknownFieldSetLite0, reader0)) {
                                break;
                            }
                            v4 = v1;
                            extensionRegistryLite2 = extensionRegistryLite1;
                            goto label_455;
                        }
                        catch(InvalidWireTypeException unused_ex) {
                            goto label_430;
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_446;
            }
            for(int v8 = v1; v8 < v; ++v8) {
                unknownFieldSetLite0 = this.d(object0, arr_v[v8], unknownFieldSetLite0, w30, object0);
            }
            if(unknownFieldSetLite0 != null) {
                w30.d(object2, unknownFieldSetLite0);
            }
            return;
            try {
                try {
                label_80:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.u(object2, ((long)(v7 & 0xFFFFF)), reader0.readDouble());
                    this.J(v3, object2);
                    goto label_454;
                label_86:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.v(object2, ((long)(v7 & 0xFFFFF)), reader0.readFloat());
                    this.J(v3, object2);
                    goto label_454;
                label_92:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.x(object2, ((long)(v7 & 0xFFFFF)), reader0.readInt64());
                    this.J(v3, object2);
                    goto label_454;
                label_98:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.x(object2, ((long)(v7 & 0xFFFFF)), reader0.readUInt64());
                    this.J(v3, object2);
                    goto label_454;
                label_104:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.w(reader0.readInt32(), ((long)(v7 & 0xFFFFF)), object2);
                    this.J(v3, object2);
                    goto label_454;
                label_110:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.x(object2, ((long)(v7 & 0xFFFFF)), reader0.readFixed64());
                    this.J(v3, object2);
                    goto label_454;
                label_116:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.w(reader0.readFixed32(), ((long)(v7 & 0xFFFFF)), object2);
                    this.J(v3, object2);
                    goto label_454;
                label_122:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.p(object2, ((long)(v7 & 0xFFFFF)), reader0.readBool());
                    this.J(v3, object2);
                    goto label_454;
                label_128:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    this.G(object2, v7, reader0);
                    this.J(v3, object2);
                    goto label_454;
                label_134:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    MessageLite messageLite0 = (MessageLite)this.s(v3, object2);
                    reader0.mergeMessageField(messageLite0, this.g(v3), extensionRegistryLite2);
                    this.M(v3, object2, messageLite0);
                    goto label_454;
                label_141:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.y(v7 & 0xFFFFF, object2, reader0.readBytes());
                    this.J(v3, object2);
                    goto label_454;
                label_147:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.w(reader0.readUInt32(), ((long)(v7 & 0xFFFFF)), object2);
                    this.J(v3, object2);
                    goto label_454;
                label_153:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    int v9 = reader0.readEnum();
                    EnumVerifier internal$EnumVerifier0 = this.e(v3);
                    if(internal$EnumVerifier0 == null || internal$EnumVerifier0.isInRange(v9)) {
                        d4.w(v9, ((long)(v7 & 0xFFFFF)), object2);
                        this.J(v3, object2);
                        goto label_454;
                    }
                    else {
                        unknownFieldSetLite0 = c3.E(object2, v2, v9, unknownFieldSetLite1, w30);
                        goto label_455;
                    }
                label_164:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.w(reader0.readSFixed32(), ((long)(v7 & 0xFFFFF)), object2);
                    this.J(v3, object2);
                    goto label_454;
                label_170:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.x(object2, ((long)(v7 & 0xFFFFF)), reader0.readSFixed64());
                    this.J(v3, object2);
                    goto label_454;
                label_176:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.w(reader0.readSInt32(), ((long)(v7 & 0xFFFFF)), object2);
                    this.J(v3, object2);
                    goto label_454;
                label_182:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    d4.x(object2, ((long)(v7 & 0xFFFFF)), reader0.readSInt64());
                    this.J(v3, object2);
                    goto label_454;
                label_188:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    MessageLite messageLite1 = (MessageLite)this.s(v3, object2);
                    reader0.mergeGroupField(messageLite1, this.g(v3), extensionRegistryLite2);
                    this.M(v3, object2, messageLite1);
                    goto label_454;
                label_195:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    reader0.readDoubleList(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    goto label_454;
                label_200:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    reader0.readFloatList(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    goto label_454;
                label_205:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    reader0.readInt64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    goto label_454;
                label_210:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    reader0.readUInt64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    goto label_454;
                label_215:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    reader0.readInt32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    goto label_454;
                label_220:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    reader0.readFixed64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    goto label_454;
                label_225:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    reader0.readFixed32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    goto label_454;
                label_230:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    reader0.readBoolList(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    goto label_454;
                }
                catch(InvalidWireTypeException unused_ex) {
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                try {
                label_235:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite3 = extensionRegistryLite1;
                    this.H(object2, v7, reader0);
                    extensionRegistryLite2 = extensionRegistryLite3;
                    goto label_454;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite3;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                try {
                label_240:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    schema0 = this.g(v3);
                    extensionRegistryLite3 = extensionRegistryLite1;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite1;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                try {
                    this.F(object0, v7, reader0, schema0, extensionRegistryLite0);
                    extensionRegistryLite2 = extensionRegistryLite3;
                    goto label_454;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite3;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                try {
                label_246:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readBytesList(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite1;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                goto label_311;
                try {
                label_253:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    list0 = x10.c(object2, ((long)(v7 & 0xFFFFF)));
                    reader0.readEnumList(list0);
                    internal$EnumVerifier1 = this.e(v3);
                    extensionRegistryLite4 = extensionRegistryLite1;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite1;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                try {
                    unknownFieldSetLite0 = c3.A(object0, v2, list0, internal$EnumVerifier1, unknownFieldSetLite1, w30);
                    extensionRegistryLite2 = extensionRegistryLite4;
                    goto label_455;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite4;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                try {
                label_261:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readSFixed32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_265:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readSFixed64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_269:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readSInt32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_273:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readSInt64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_277:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readDoubleList(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_281:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readFloatList(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_285:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readInt64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_289:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readUInt64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_293:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readInt32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_297:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readFixed64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_301:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readFixed32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_305:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readBoolList(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite1;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
            label_309:
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                try {
                label_311:
                    reader0.readUInt32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_313:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    list1 = x10.c(object2, ((long)(v7 & 0xFFFFF)));
                    reader0.readEnumList(list1);
                    internal$EnumVerifier2 = this.e(v3);
                    extensionRegistryLite4 = extensionRegistryLite1;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite1;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                try {
                    unknownFieldSetLite0 = c3.A(object0, v2, list1, internal$EnumVerifier2, unknownFieldSetLite1, w30);
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite4;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
                extensionRegistryLite2 = extensionRegistryLite4;
                goto label_455;
                try {
                label_325:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readSFixed32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_329:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readSFixed64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_333:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readSInt32List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                label_337:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    reader0.readSInt64List(x10.c(object2, ((long)(v7 & 0xFFFFF))));
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                }
                catch(InvalidWireTypeException unused_ex) {
                }
                extensionRegistryLite2 = extensionRegistryLite1;
                unknownFieldSetLite0 = unknownFieldSetLite1;
                goto label_432;
                try {
                label_343:
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite3 = extensionRegistryLite1;
                    this.E(object0, ((long)(v7 & 0xFFFFF)), reader0, this.g(v3), extensionRegistryLite0);
                    extensionRegistryLite2 = extensionRegistryLite3;
                    goto label_454;
                }
                catch(InvalidWireTypeException unused_ex) {
                    extensionRegistryLite2 = extensionRegistryLite3;
                    unknownFieldSetLite0 = unknownFieldSetLite1;
                    goto label_432;
                }
            }
            catch(Throwable throwable0) {
                unknownFieldSetLite0 = unknownFieldSetLite1;
                goto label_447;
            }
            try {
            label_348:
                object4 = this.f(v3);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite3 = extensionRegistryLite1;
            }
            catch(InvalidWireTypeException unused_ex) {
                goto label_430;
            }
            catch(Throwable throwable0) {
                goto label_446;
            }
            try {
                this.p(object0, v3, object4, extensionRegistryLite0, reader0);
                extensionRegistryLite2 = extensionRegistryLite3;
                goto label_454;
            }
            catch(InvalidWireTypeException unused_ex) {
                extensionRegistryLite2 = extensionRegistryLite3;
                unknownFieldSetLite0 = unknownFieldSetLite1;
                goto label_432;
            }
            catch(Throwable throwable0) {
            }
            unknownFieldSetLite0 = unknownFieldSetLite1;
            goto label_447;
            try {
            label_362:
                d4.y(v7 & 0xFFFFF, object2, reader0.readDouble());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_365:
                d4.y(v7 & 0xFFFFF, object2, reader0.readFloat());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_368:
                d4.y(v7 & 0xFFFFF, object2, reader0.readInt64());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_371:
                d4.y(v7 & 0xFFFFF, object2, reader0.readUInt64());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_374:
                d4.y(v7 & 0xFFFFF, object2, reader0.readInt32());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_377:
                d4.y(v7 & 0xFFFFF, object2, reader0.readFixed64());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_380:
                d4.y(v7 & 0xFFFFF, object2, reader0.readFixed32());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_383:
                d4.y(v7 & 0xFFFFF, object2, Boolean.valueOf(reader0.readBool()));
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_386:
                this.G(object2, v7, reader0);
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_389:
                MessageLite messageLite2 = (MessageLite)this.t(v2, v3, object2);
                reader0.mergeMessageField(messageLite2, this.g(v3), extensionRegistryLite1);
                this.N(v2, object2, v3, messageLite2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_393:
                d4.y(v7 & 0xFFFFF, object2, reader0.readBytes());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_396:
                d4.y(v7 & 0xFFFFF, object2, reader0.readUInt32());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_399:
                int v10 = reader0.readEnum();
                EnumVerifier internal$EnumVerifier3 = this.e(v3);
                if(internal$EnumVerifier3 == null || internal$EnumVerifier3.isInRange(v10)) {
                    d4.y(v7 & 0xFFFFF, object2, v10);
                    this.K(v2, v3, object2);
                    unknownFieldSetLite1 = unknownFieldSetLite0;
                    v4 = v1;
                    extensionRegistryLite2 = extensionRegistryLite1;
                    goto label_454;
                }
                else {
                    unknownFieldSetLite0 = c3.E(object2, v2, v10, unknownFieldSetLite0, w30);
                }
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_455;
            label_409:
                d4.y(v7 & 0xFFFFF, object2, reader0.readSFixed32());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_412:
                d4.y(v7 & 0xFFFFF, object2, reader0.readSFixed64());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_415:
                d4.y(v7 & 0xFFFFF, object2, reader0.readSInt32());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_418:
                d4.y(v7 & 0xFFFFF, object2, reader0.readSInt64());
                this.K(v2, v3, object2);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_421:
                MessageLite messageLite3 = (MessageLite)this.t(v2, v3, object2);
                reader0.mergeGroupField(messageLite3, this.g(v3), extensionRegistryLite1);
                this.N(v2, object2, v3, messageLite3);
                unknownFieldSetLite1 = unknownFieldSetLite0;
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
                goto label_454;
            label_430:
                v4 = v1;
                extensionRegistryLite2 = extensionRegistryLite1;
            }
            catch(InvalidWireTypeException unused_ex) {
                goto label_430;
            }
            catch(Throwable throwable0) {
                goto label_446;
            }
            try {
            label_432:
                w30.getClass();
                if(unknownFieldSetLite0 == null) {
                    unknownFieldSetLite0 = w30.a(object2);
                }
                if(!w30.c(unknownFieldSetLite0, reader0)) {
                    goto label_439;
                }
                goto label_455;
            }
            catch(Throwable throwable0) {
                goto label_447;
            }
        label_439:
            while(v4 < v) {
                unknownFieldSetLite0 = this.d(object0, arr_v[v4], unknownFieldSetLite0, w30, object0);
                ++v4;
            }
            if(unknownFieldSetLite0 != null) {
                w30.d(object2, unknownFieldSetLite0);
            }
            return;
        label_446:
            v4 = v1;
        label_447:
            while(v4 < v) {
                unknownFieldSetLite0 = this.d(object0, arr_v[v4], unknownFieldSetLite0, w30, object0);
                ++v4;
            }
            if(unknownFieldSetLite0 != null) {
                w30.d(object2, unknownFieldSetLite0);
            }
            throw throwable0;
        label_454:
            unknownFieldSetLite0 = unknownFieldSetLite1;
        label_455:
            extensionRegistryLite1 = extensionRegistryLite2;
            v1 = v4;
            object1 = object2;
        }
    }

    public final void p(Object object0, int v, Object object1, ExtensionRegistryLite extensionRegistryLite0, Reader reader0) {
        int v1 = this.P(v);
        Object object2 = d4.c.m(object0, ((long)(v1 & 0xFFFFF)));
        MapFieldSchema mapFieldSchema0 = this.q;
        if(object2 == null) {
            object2 = mapFieldSchema0.newMapField(object1);
            d4.y(v1 & 0xFFFFF, object0, object2);
        }
        else if(mapFieldSchema0.isImmutable(object2)) {
            Object object3 = mapFieldSchema0.newMapField(object1);
            mapFieldSchema0.mergeFrom(object3, object2);
            d4.y(v1 & 0xFFFFF, object0, object3);
            object2 = object3;
        }
        reader0.readMap(mapFieldSchema0.forMutableMapData(object2), mapFieldSchema0.forMapMetadata(object1), extensionRegistryLite0);
    }

    public final void q(int v, Object object0, Object object1) {
        if(!this.k(v, object1)) {
            return;
        }
        int v1 = this.P(v);
        Unsafe unsafe0 = i2.s;
        Object object2 = unsafe0.getObject(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.a[v] + " is present but null: " + object1);
        }
        Schema schema0 = this.g(v);
        if(!this.k(v, object0)) {
            if(i2.l(object2)) {
                Object object3 = schema0.newInstance();
                schema0.mergeFrom(object3, object2);
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object2);
            }
            this.J(v, object0);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(!i2.l(object4)) {
            Object object5 = schema0.newInstance();
            schema0.mergeFrom(object5, object4);
            unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object5);
            object4 = object5;
        }
        schema0.mergeFrom(object4, object2);
    }

    public final void r(int v, Object object0, Object object1) {
        int[] arr_v = this.a;
        int v1 = arr_v[v];
        if(!this.m(v1, v, object1)) {
            return;
        }
        int v2 = this.P(v);
        Unsafe unsafe0 = i2.s;
        Object object2 = unsafe0.getObject(object1, ((long)(v2 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + arr_v[v] + " is present but null: " + object1);
        }
        Schema schema0 = this.g(v);
        if(!this.m(v1, v, object0)) {
            if(i2.l(object2)) {
                Object object3 = schema0.newInstance();
                schema0.mergeFrom(object3, object2);
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object2);
            }
            this.K(v1, v, object0);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(!i2.l(object4)) {
            Object object5 = schema0.newInstance();
            schema0.mergeFrom(object5, object4);
            unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object5);
            object4 = object5;
        }
        schema0.mergeFrom(object4, object2);
    }

    public final Object s(int v, Object object0) {
        Schema schema0 = this.g(v);
        int v1 = this.P(v);
        if(!this.k(v, object0)) {
            return schema0.newInstance();
        }
        Object object1 = i2.s.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(i2.l(object1)) {
            return object1;
        }
        Object object2 = schema0.newInstance();
        if(object1 != null) {
            schema0.mergeFrom(object2, object1);
        }
        return object2;
    }

    public final Object t(int v, int v1, Object object0) {
        Schema schema0 = this.g(v1);
        if(!this.m(v, v1, object0)) {
            return schema0.newInstance();
        }
        int v2 = this.P(v1);
        Object object1 = i2.s.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(i2.l(object1)) {
            return object1;
        }
        Object object2 = schema0.newInstance();
        if(object1 != null) {
            schema0.mergeFrom(object2, object1);
        }
        return object2;
    }

    public static i2 u(MessageInfo messageInfo0, NewInstanceSchema newInstanceSchema0, x1 x10, w3 w30, q0 q00, MapFieldSchema mapFieldSchema0) {
        Class class0;
        c4 c41;
        int v16;
        p3 p31;
        int v15;
        int v14;
        int v13;
        boolean z1;
        int v1;
        int v;
        if(messageInfo0 instanceof x2) {
            return i2.v(((x2)messageInfo0), newInstanceSchema0, x10, w30, q00, mapFieldSchema0);
        }
        p3 p30 = (p3)messageInfo0;
        boolean z = p30.a == ProtoSyntax.PROTO3;
        a1[] arr_a1 = p30.d;
        if(arr_a1.length == 0) {
            v = 0;
            v1 = 0;
        }
        else {
            v = arr_a1[0].c;
            v1 = arr_a1[arr_a1.length - 1].c;
        }
        int[] arr_v = new int[arr_a1.length * 3];
        Object[] arr_object = new Object[arr_a1.length * 2];
        int v3 = 0;
        int v4 = 0;
        for(int v2 = 0; v2 < arr_a1.length; ++v2) {
            a1 a10 = arr_a1[v2];
            androidx.datastore.preferences.protobuf.FieldType fieldType0 = a10.b;
            if(fieldType0 == androidx.datastore.preferences.protobuf.FieldType.MAP) {
                ++v3;
            }
            else if(fieldType0.id() >= 18 && a10.b.id() <= 49) {
                ++v4;
            }
        }
        int[] arr_v1 = v3 <= 0 ? null : new int[v3];
        int[] arr_v2 = v4 <= 0 ? null : new int[v4];
        int[] arr_v3 = i2.r;
        int[] arr_v4 = p30.c == null ? arr_v3 : p30.c;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        while(v6 < arr_a1.length) {
            a1 a11 = arr_a1[v6];
            int v10 = a11.c;
            c4 c40 = d4.c;
            Field field0 = a11.a;
            int v11 = (int)c40.n(field0);
            androidx.datastore.preferences.protobuf.FieldType fieldType1 = a11.b;
            int v12 = fieldType1.id();
            if(fieldType1.isList() || fieldType1.isMap()) {
                z1 = z;
                v14 = v6;
                Field field2 = a11.h;
                if(field2 == null) {
                    p31 = p30;
                    v13 = 0;
                }
                else {
                    v13 = (int)c40.n(field2);
                    p31 = p30;
                }
                v15 = 0;
            }
            else {
                z1 = z;
                Field field1 = a11.d;
                if(field1 == null) {
                    v13 = 0xFFFFF;
                    v14 = v6;
                }
                else {
                    v14 = v6;
                    v13 = (int)c40.n(field1);
                }
                v15 = Integer.numberOfTrailingZeros(a11.e);
                p31 = p30;
            }
            arr_v[v7] = a11.c;
            if(a11.g) {
                v16 = 0x20000000;
                c41 = c40;
            }
            else {
                c41 = c40;
                v16 = 0;
            }
            arr_v[v7 + 1] = (a11.f ? 0x10000000 : 0) | v16 | v12 << 20 | v11;
            arr_v[v7 + 2] = v15 << 20 | v13;
            switch(z0.a[fieldType1.ordinal()]) {
                case 1: 
                case 2: {
                    if(field0 != null) {
                        class0 = field0.getType();
                        goto label_80;
                    }
                }
            }
            class0 = null;
        label_80:
            EnumVerifier internal$EnumVerifier0 = a11.j;
            Object object0 = a11.i;
            if(object0 != null) {
                int v17 = v7 / 3 * 2;
                arr_object[v17] = object0;
                if(class0 != null) {
                    arr_object[v17 + 1] = class0;
                }
                else if(internal$EnumVerifier0 != null) {
                    arr_object[v17 + 1] = internal$EnumVerifier0;
                }
            }
            else if(class0 != null) {
                arr_object[v7 / 3 * 2 + 1] = class0;
            }
            else if(internal$EnumVerifier0 != null) {
                arr_object[v7 / 3 * 2 + 1] = internal$EnumVerifier0;
            }
            if(v5 < arr_v4.length && arr_v4[v5] == v10) {
                arr_v4[v5] = v7;
                ++v5;
            }
            if(fieldType1 == androidx.datastore.preferences.protobuf.FieldType.MAP) {
                arr_v1[v8] = v7;
                ++v8;
            }
            else if(fieldType1.id() >= 18 && fieldType1.id() <= 49) {
                arr_v2[v9] = (int)c41.n(field0);
                ++v9;
            }
            v6 = v14 + 1;
            v7 += 3;
            z = z1;
            p30 = p31;
        }
        if(arr_v1 == null) {
            arr_v1 = arr_v3;
        }
        int[] arr_v5 = arr_v2 == null ? arr_v3 : arr_v2;
        int[] arr_v6 = new int[arr_v4.length + arr_v1.length + arr_v5.length];
        System.arraycopy(arr_v4, 0, arr_v6, 0, arr_v4.length);
        System.arraycopy(arr_v1, 0, arr_v6, arr_v4.length, arr_v1.length);
        System.arraycopy(arr_v5, 0, arr_v6, arr_v4.length + arr_v1.length, arr_v5.length);
        return new i2(arr_v, arr_object, v, v1, p30.e, z, true, arr_v6, arr_v4.length, arr_v4.length + arr_v1.length, newInstanceSchema0, x10, w30, q00, mapFieldSchema0);
    }

    public static i2 v(x2 x20, NewInstanceSchema newInstanceSchema0, x1 x10, w3 w30, q0 q00, MapFieldSchema mapFieldSchema0) {
        Field field3;
        int v87;
        int v81;
        int v80;
        int v79;
        int v78;
        int v77;
        Field field1;
        int v74;
        int v73;
        Field field0;
        int v69;
        int v66;
        int v60;
        int v14;
        int[] arr_v;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v2;
        boolean z = x20.getSyntax() == ProtoSyntax.PROTO3;
        String s = x20.b();
        int v = s.length();
        if(s.charAt(0) >= 0xD800) {
            for(int v1 = 1; true; v1 = v2) {
                v2 = v1 + 1;
                if(s.charAt(v1) < 0xD800) {
                    break;
                }
            }
        }
        else {
            v2 = 1;
        }
        int v3 = v2 + 1;
        int v4 = s.charAt(v2);
        if(v4 >= 0xD800) {
            int v5 = v4 & 0x1FFF;
            int v6 = 13;
            int v7;
            while((v7 = s.charAt(v3)) >= 0xD800) {
                v5 |= (v7 & 0x1FFF) << v6;
                v6 += 13;
                ++v3;
            }
            v4 = v5 | v7 << v6;
            ++v3;
        }
        if(v4 == 0) {
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v11 = 0;
            v12 = 0;
            v13 = 0;
            arr_v = i2.r;
            v14 = 0;
        }
        else {
            int v15 = v3 + 1;
            int v16 = s.charAt(v3);
            if(v16 >= 0xD800) {
                int v17 = v16 & 0x1FFF;
                int v18 = 13;
                int v19;
                while((v19 = s.charAt(v15)) >= 0xD800) {
                    v17 |= (v19 & 0x1FFF) << v18;
                    v18 += 13;
                    ++v15;
                }
                v16 = v17 | v19 << v18;
                ++v15;
            }
            int v20 = v15 + 1;
            int v21 = s.charAt(v15);
            if(v21 >= 0xD800) {
                int v22 = v21 & 0x1FFF;
                int v23 = 13;
                int v24;
                while((v24 = s.charAt(v20)) >= 0xD800) {
                    v22 |= (v24 & 0x1FFF) << v23;
                    v23 += 13;
                    ++v20;
                }
                v21 = v22 | v24 << v23;
                ++v20;
            }
            int v25 = v20 + 1;
            v8 = s.charAt(v20);
            if(v8 >= 0xD800) {
                int v26 = v8 & 0x1FFF;
                int v27 = 13;
                int v28;
                while((v28 = s.charAt(v25)) >= 0xD800) {
                    v26 |= (v28 & 0x1FFF) << v27;
                    v27 += 13;
                    ++v25;
                }
                v8 = v26 | v28 << v27;
                ++v25;
            }
            int v29 = v25 + 1;
            v9 = s.charAt(v25);
            if(v9 >= 0xD800) {
                int v30 = v9 & 0x1FFF;
                int v31 = 13;
                int v32;
                while((v32 = s.charAt(v29)) >= 0xD800) {
                    v30 |= (v32 & 0x1FFF) << v31;
                    v31 += 13;
                    ++v29;
                }
                v9 = v30 | v32 << v31;
                ++v29;
            }
            int v33 = v29 + 1;
            v10 = s.charAt(v29);
            if(v10 >= 0xD800) {
                int v34 = v10 & 0x1FFF;
                int v35 = 13;
                int v36;
                while((v36 = s.charAt(v33)) >= 0xD800) {
                    v34 |= (v36 & 0x1FFF) << v35;
                    v35 += 13;
                    ++v33;
                }
                v10 = v34 | v36 << v35;
                ++v33;
            }
            int v37 = v33 + 1;
            v11 = s.charAt(v33);
            if(v11 >= 0xD800) {
                int v38 = v11 & 0x1FFF;
                int v39 = 13;
                int v40;
                while((v40 = s.charAt(v37)) >= 0xD800) {
                    v38 |= (v40 & 0x1FFF) << v39;
                    v39 += 13;
                    ++v37;
                }
                v11 = v38 | v40 << v39;
                ++v37;
            }
            int v41 = v37 + 1;
            int v42 = s.charAt(v37);
            if(v42 >= 0xD800) {
                int v43 = v42 & 0x1FFF;
                int v44 = 13;
                int v45;
                while((v45 = s.charAt(v41)) >= 0xD800) {
                    v43 |= (v45 & 0x1FFF) << v44;
                    v44 += 13;
                    ++v41;
                }
                v42 = v43 | v45 << v44;
                ++v41;
            }
            int v46 = v41 + 1;
            v12 = s.charAt(v41);
            if(v12 >= 0xD800) {
                int v47 = v12 & 0x1FFF;
                int v48 = 13;
                int v49;
                while((v49 = s.charAt(v46)) >= 0xD800) {
                    v47 |= (v49 & 0x1FFF) << v48;
                    v48 += 13;
                    ++v46;
                }
                v12 = v47 | v49 << v48;
                ++v46;
            }
            arr_v = new int[v12 + v11 + v42];
            v13 = v16 * 2 + v21;
            v14 = v16;
            v3 = v46;
        }
        Unsafe unsafe0 = i2.s;
        Object[] arr_object = x20.a();
        Class class0 = x20.getDefaultInstance().getClass();
        int[] arr_v1 = new int[v10 * 3];
        Object[] arr_object1 = new Object[v10 * 2];
        int v50 = v12 + v11;
        int v51 = v12;
        int v52 = v50;
        int v53 = 0;
        int v54 = 0;
        while(v3 < v) {
            int v55 = s.charAt(v3);
            if(v55 >= 0xD800) {
                int v56 = v55 & 0x1FFF;
                int v57 = v3 + 1;
                int v58 = 13;
                int v59;
                while((v59 = s.charAt(v57)) >= 0xD800) {
                    v56 |= (v59 & 0x1FFF) << v58;
                    v58 += 13;
                    ++v57;
                }
                v55 = v56 | v59 << v58;
                v60 = v57 + 1;
            }
            else {
                v60 = v3 + 1;
            }
            int v61 = s.charAt(v60);
            if(v61 >= 0xD800) {
                int v62 = v61 & 0x1FFF;
                int v63 = v60 + 1;
                int v64 = 13;
                int v65;
                while((v65 = s.charAt(v63)) >= 0xD800) {
                    v62 |= (v65 & 0x1FFF) << v64;
                    v64 += 13;
                    ++v63;
                }
                v61 = v62 | v65 << v64;
                v66 = v63 + 1;
            }
            else {
                v66 = v60 + 1;
            }
            if((v61 & 0x400) != 0) {
                arr_v[v53] = v54;
                ++v53;
            }
            if((v61 & 0xFF) >= 51) {
                int v67 = v66 + 1;
                int v68 = s.charAt(v66);
                v69 = v53;
                if(v68 >= 0xD800) {
                    int v70 = v68 & 0x1FFF;
                    int v71 = 13;
                    int v72;
                    while((v72 = s.charAt(v67)) >= 0xD800) {
                        v70 |= (v72 & 0x1FFF) << v71;
                        v71 += 13;
                        ++v67;
                    }
                    v68 = v70 | v72 << v71;
                    ++v67;
                }
                switch((v61 & 0xFF) - 51) {
                    case 12: {
                        if(!z) {
                            arr_object1[v54 / 3 * 2 + 1] = arr_object[v13];
                            ++v13;
                        }
                        break;
                    }
                    case 9: 
                    case 17: {
                        arr_object1[v54 / 3 * 2 + 1] = arr_object[v13];
                        ++v13;
                    }
                }
                Object object0 = arr_object[v68 * 2];
                if(object0 instanceof Field) {
                    field0 = (Field)object0;
                }
                else {
                    field0 = i2.I(class0, ((String)object0));
                    arr_object[v68 * 2] = field0;
                }
                v73 = v8;
                v74 = v9;
                int v75 = (int)unsafe0.objectFieldOffset(field0);
                int v76 = v68 * 2 + 1;
                Object object1 = arr_object[v76];
                if(object1 instanceof Field) {
                    field1 = (Field)object1;
                }
                else {
                    field1 = i2.I(class0, ((String)object1));
                    arr_object[v76] = field1;
                }
                v77 = (int)unsafe0.objectFieldOffset(field1);
                v78 = v67;
                v79 = v75;
                v80 = 0;
            }
            else {
                v73 = v8;
                v74 = v9;
                v69 = v53;
                Field field2 = i2.I(class0, ((String)arr_object[v13]));
                switch(v61 & 0xFF) {
                    case 9: 
                    case 17: {
                        arr_object1[v54 / 3 * 2 + 1] = field2.getType();
                        v81 = v13 + 1;
                        break;
                    }
                    case 12: 
                    case 30: 
                    case 44: {
                        if(!z) {
                            arr_object1[v54 / 3 * 2 + 1] = arr_object[v13 + 1];
                            v81 = v13 + 2;
                            break;
                        }
                        v81 = v13 + 1;
                        break;
                    }
                    case 27: 
                    case 49: {
                        arr_object1[v54 / 3 * 2 + 1] = arr_object[v13 + 1];
                        v81 = v13 + 2;
                        break;
                    }
                    case 50: {
                        arr_v[v51] = v54;
                        int v82 = v54 / 3 * 2;
                        arr_object1[v82] = arr_object[v13 + 1];
                        if((v61 & 0x800) == 0) {
                            ++v51;
                            v81 = v13 + 2;
                        }
                        else {
                            arr_object1[v82 + 1] = arr_object[v13 + 2];
                            ++v51;
                            v81 = v13 + 3;
                        }
                        break;
                    }
                    default: {
                        v81 = v13 + 1;
                        break;
                    }
                }
                v79 = (int)unsafe0.objectFieldOffset(field2);
                v13 = v81;
                if((v61 & 0x1000) != 0x1000 || (v61 & 0xFF) > 17) {
                    v77 = 0xFFFFF;
                    v78 = v66;
                    v80 = 0;
                }
                else {
                    int v83 = v66 + 1;
                    int v84 = s.charAt(v66);
                    if(v84 >= 0xD800) {
                        int v85 = v84 & 0x1FFF;
                        int v86 = 13;
                        while(true) {
                            v78 = v83 + 1;
                            v87 = s.charAt(v83);
                            if(v87 < 0xD800) {
                                break;
                            }
                            v85 |= (v87 & 0x1FFF) << v86;
                            v86 += 13;
                            v83 = v78;
                        }
                        v84 = v85 | v87 << v86;
                    }
                    else {
                        v78 = v83;
                    }
                    int v88 = v84 / 0x20 + v14 * 2;
                    Object object2 = arr_object[v88];
                    if(object2 instanceof Field) {
                        field3 = (Field)object2;
                    }
                    else {
                        field3 = i2.I(class0, ((String)object2));
                        arr_object[v88] = field3;
                    }
                    v77 = (int)unsafe0.objectFieldOffset(field3);
                    v80 = v84 % 0x20;
                }
                if((v61 & 0xFF) >= 18 && (v61 & 0xFF) <= 49) {
                    arr_v[v52] = v79;
                    ++v52;
                }
            }
            arr_v1[v54] = v55;
            int v89 = v54 + 2;
            arr_v1[v54 + 1] = ((v61 & 0x200) == 0 ? 0 : 0x20000000) | ((v61 & 0x100) == 0 ? 0 : 0x10000000) | (v61 & 0xFF) << 20 | v79;
            v54 += 3;
            arr_v1[v89] = v80 << 20 | v77;
            v8 = v73;
            v53 = v69;
            v3 = v78;
            v9 = v74;
        }
        return new i2(arr_v1, arr_object1, v8, v9, x20.getDefaultInstance(), z, false, arr_v, v12, v50, newInstanceSchema0, x10, w30, q00, mapFieldSchema0);
    }

    public static long w(int v) [...] // Inlined contents

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void writeTo(Object object0, Writer writer0) {
        Map.Entry map$Entry1;
        Iterator iterator1;
        Map.Entry map$Entry0;
        Iterator iterator0;
        FieldOrder writer$FieldOrder0 = writer0.fieldOrder();
        int[] arr_v = this.a;
        q0 q00 = this.p;
        boolean z = this.f;
        w3 w30 = this.o;
        if(writer$FieldOrder0 == FieldOrder.DESCENDING) {
            ((x3)w30).getClass();
            ((GeneratedMessageLite)object0).unknownFields.writeTo(writer0);
            if(z) {
                ((s0)q00).getClass();
                d1 d10 = ((ExtendableMessage)object0).extensions;
                if(d10.a.isEmpty()) {
                    map$Entry0 = null;
                    iterator0 = null;
                }
                else {
                    d3 d30 = d10.a;
                    if(d10.c) {
                        if(d30.g == null) {
                            d30.g = new f3(d30);
                        }
                        iterator0 = new t1(d30.g.iterator());
                    }
                    else {
                        if(d30.g == null) {
                            d30.g = new f3(d30);
                        }
                        iterator0 = d30.g.iterator();
                    }
                    Object object1 = iterator0.next();
                    map$Entry0 = (Map.Entry)object1;
                }
            }
            else {
                map$Entry0 = null;
                iterator0 = null;
            }
            for(int v = arr_v.length - 3; v >= 0; v -= 3) {
                int v1 = this.P(v);
                int v2 = arr_v[v];
                while(map$Entry0 != null) {
                    ((s0)q00).getClass();
                    if(((j1)map$Entry0.getKey()).b <= v2) {
                        break;
                    }
                    q00.g(writer0, map$Entry0);
                    if(iterator0.hasNext()) {
                        Object object2 = iterator0.next();
                        map$Entry0 = (Map.Entry)object2;
                    }
                    else {
                        map$Entry0 = null;
                    }
                }
                switch((v1 & 0xFF00000) >>> 20) {
                    case 0: {
                        if(this.k(v, object0)) {
                            writer0.writeDouble(v2, d4.c.h(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 1: {
                        if(this.k(v, object0)) {
                            writer0.writeFloat(v2, d4.c.i(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 2: {
                        if(this.k(v, object0)) {
                            writer0.writeInt64(v2, d4.c.l(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 3: {
                        if(this.k(v, object0)) {
                            writer0.writeUInt64(v2, d4.c.l(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 4: {
                        if(this.k(v, object0)) {
                            writer0.writeInt32(v2, d4.c.j(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 5: {
                        if(this.k(v, object0)) {
                            writer0.writeFixed64(v2, d4.c.l(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 6: {
                        if(this.k(v, object0)) {
                            writer0.writeFixed32(v2, d4.c.j(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 7: {
                        if(this.k(v, object0)) {
                            writer0.writeBool(v2, d4.c.e(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 8: {
                        if(this.k(v, object0)) {
                            i2.S(v2, d4.c.m(object0, ((long)(v1 & 0xFFFFF))), writer0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.k(v, object0)) {
                            writer0.writeMessage(v2, d4.c.m(object0, ((long)(v1 & 0xFFFFF))), this.g(v));
                        }
                        break;
                    }
                    case 10: {
                        if(this.k(v, object0)) {
                            writer0.writeBytes(v2, ((ByteString)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 11: {
                        if(this.k(v, object0)) {
                            writer0.writeUInt32(v2, d4.c.j(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 12: {
                        if(this.k(v, object0)) {
                            writer0.writeEnum(v2, d4.c.j(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 13: {
                        if(this.k(v, object0)) {
                            writer0.writeSFixed32(v2, d4.c.j(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 14: {
                        if(this.k(v, object0)) {
                            writer0.writeSFixed64(v2, d4.c.l(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 15: {
                        if(this.k(v, object0)) {
                            writer0.writeSInt32(v2, d4.c.j(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 16: {
                        if(this.k(v, object0)) {
                            writer0.writeSInt64(v2, d4.c.l(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 17: {
                        if(this.k(v, object0)) {
                            writer0.writeGroup(v2, d4.c.m(object0, ((long)(v1 & 0xFFFFF))), this.g(v));
                        }
                        break;
                    }
                    case 18: {
                        c3.H(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 19: {
                        c3.L(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 20: {
                        c3.O(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 21: {
                        c3.W(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 22: {
                        c3.N(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 23: {
                        c3.K(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 24: {
                        c3.J(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 25: {
                        c3.F(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 26: {
                        c3.U(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0);
                        break;
                    }
                    case 27: {
                        c3.P(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, this.g(v));
                        break;
                    }
                    case 28: {
                        c3.G(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0);
                        break;
                    }
                    case 29: {
                        c3.V(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 30: {
                        c3.I(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 0x1F: {
                        c3.Q(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 0x20: {
                        c3.R(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 33: {
                        c3.S(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 34: {
                        c3.T(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 35: {
                        c3.H(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 36: {
                        c3.L(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 37: {
                        c3.O(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 38: {
                        c3.W(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 39: {
                        c3.N(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 40: {
                        c3.K(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 41: {
                        c3.J(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 42: {
                        c3.F(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 43: {
                        c3.V(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 44: {
                        c3.I(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 45: {
                        c3.Q(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 46: {
                        c3.R(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 0x2F: {
                        c3.S(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 0x30: {
                        c3.T(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 49: {
                        c3.M(arr_v[v], ((List)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))), writer0, this.g(v));
                        break;
                    }
                    case 50: {
                        this.R(writer0, v2, d4.c.m(object0, ((long)(v1 & 0xFFFFF))), v);
                        break;
                    }
                    case 51: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeDouble(v2, ((double)(((Double)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeFloat(v2, ((float)(((Float)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeInt64(v2, i2.y(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 54: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeUInt64(v2, i2.y(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 55: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeInt32(v2, i2.x(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 56: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeFixed64(v2, i2.y(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 57: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeFixed32(v2, i2.x(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 58: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeBool(v2, ((Boolean)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))).booleanValue());
                        }
                        break;
                    }
                    case 59: {
                        if(this.m(v2, v, object0)) {
                            i2.S(v2, d4.c.m(object0, ((long)(v1 & 0xFFFFF))), writer0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeMessage(v2, d4.c.m(object0, ((long)(v1 & 0xFFFFF))), this.g(v));
                        }
                        break;
                    }
                    case 61: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeBytes(v2, ((ByteString)d4.c.m(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 62: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeUInt32(v2, i2.x(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeEnum(v2, i2.x(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeSFixed32(v2, i2.x(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 65: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeSFixed64(v2, i2.y(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 66: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeSInt32(v2, i2.x(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 67: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeSInt64(v2, i2.y(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 68: {
                        if(this.m(v2, v, object0)) {
                            writer0.writeGroup(v2, d4.c.m(object0, ((long)(v1 & 0xFFFFF))), this.g(v));
                        }
                    }
                }
            }
            while(map$Entry0 != null) {
                q00.g(writer0, map$Entry0);
                if(iterator0.hasNext()) {
                    Object object3 = iterator0.next();
                    map$Entry0 = (Map.Entry)object3;
                }
                else {
                    map$Entry0 = null;
                }
            }
            return;
        }
        if(this.h) {
            if(z) {
                ((s0)q00).getClass();
                d1 d11 = ((ExtendableMessage)object0).extensions;
                if(d11.a.isEmpty()) {
                    iterator1 = null;
                    map$Entry1 = null;
                }
                else {
                    iterator1 = d11.m();
                    Object object4 = iterator1.next();
                    map$Entry1 = (Map.Entry)object4;
                }
            }
            else {
                iterator1 = null;
                map$Entry1 = null;
            }
            for(int v3 = 0; v3 < arr_v.length; v3 += 3) {
                int v4 = this.P(v3);
                int v5 = arr_v[v3];
                while(map$Entry1 != null) {
                    ((s0)q00).getClass();
                    if(((j1)map$Entry1.getKey()).b > v5) {
                        break;
                    }
                    q00.g(writer0, map$Entry1);
                    if(iterator1.hasNext()) {
                        Object object5 = iterator1.next();
                        map$Entry1 = (Map.Entry)object5;
                    }
                    else {
                        map$Entry1 = null;
                    }
                }
                switch((v4 & 0xFF00000) >>> 20) {
                    case 0: {
                        if(this.k(v3, object0)) {
                            writer0.writeDouble(v5, d4.c.h(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 1: {
                        if(this.k(v3, object0)) {
                            writer0.writeFloat(v5, d4.c.i(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 2: {
                        if(this.k(v3, object0)) {
                            writer0.writeInt64(v5, d4.c.l(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 3: {
                        if(this.k(v3, object0)) {
                            writer0.writeUInt64(v5, d4.c.l(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 4: {
                        if(this.k(v3, object0)) {
                            writer0.writeInt32(v5, d4.c.j(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 5: {
                        if(this.k(v3, object0)) {
                            writer0.writeFixed64(v5, d4.c.l(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 6: {
                        if(this.k(v3, object0)) {
                            writer0.writeFixed32(v5, d4.c.j(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 7: {
                        if(this.k(v3, object0)) {
                            writer0.writeBool(v5, d4.c.e(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 8: {
                        if(this.k(v3, object0)) {
                            i2.S(v5, d4.c.m(object0, ((long)(v4 & 0xFFFFF))), writer0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.k(v3, object0)) {
                            writer0.writeMessage(v5, d4.c.m(object0, ((long)(v4 & 0xFFFFF))), this.g(v3));
                        }
                        break;
                    }
                    case 10: {
                        if(this.k(v3, object0)) {
                            writer0.writeBytes(v5, ((ByteString)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 11: {
                        if(this.k(v3, object0)) {
                            writer0.writeUInt32(v5, d4.c.j(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 12: {
                        if(this.k(v3, object0)) {
                            writer0.writeEnum(v5, d4.c.j(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 13: {
                        if(this.k(v3, object0)) {
                            writer0.writeSFixed32(v5, d4.c.j(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 14: {
                        if(this.k(v3, object0)) {
                            writer0.writeSFixed64(v5, d4.c.l(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 15: {
                        if(this.k(v3, object0)) {
                            writer0.writeSInt32(v5, d4.c.j(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 16: {
                        if(this.k(v3, object0)) {
                            writer0.writeSInt64(v5, d4.c.l(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 17: {
                        if(this.k(v3, object0)) {
                            writer0.writeGroup(v5, d4.c.m(object0, ((long)(v4 & 0xFFFFF))), this.g(v3));
                        }
                        break;
                    }
                    case 18: {
                        c3.H(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 19: {
                        c3.L(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 20: {
                        c3.O(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 21: {
                        c3.W(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 22: {
                        c3.N(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 23: {
                        c3.K(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 24: {
                        c3.J(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 25: {
                        c3.F(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 26: {
                        c3.U(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0);
                        break;
                    }
                    case 27: {
                        c3.P(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, this.g(v3));
                        break;
                    }
                    case 28: {
                        c3.G(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0);
                        break;
                    }
                    case 29: {
                        c3.V(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 30: {
                        c3.I(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 0x1F: {
                        c3.Q(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 0x20: {
                        c3.R(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 33: {
                        c3.S(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 34: {
                        c3.T(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, false);
                        break;
                    }
                    case 35: {
                        c3.H(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 36: {
                        c3.L(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 37: {
                        c3.O(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 38: {
                        c3.W(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 39: {
                        c3.N(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 40: {
                        c3.K(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 41: {
                        c3.J(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 42: {
                        c3.F(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 43: {
                        c3.V(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 44: {
                        c3.I(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 45: {
                        c3.Q(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 46: {
                        c3.R(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 0x2F: {
                        c3.S(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 0x30: {
                        c3.T(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, true);
                        break;
                    }
                    case 49: {
                        c3.M(arr_v[v3], ((List)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))), writer0, this.g(v3));
                        break;
                    }
                    case 50: {
                        this.R(writer0, v5, d4.c.m(object0, ((long)(v4 & 0xFFFFF))), v3);
                        break;
                    }
                    case 51: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeDouble(v5, ((double)(((Double)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeFloat(v5, ((float)(((Float)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeInt64(v5, i2.y(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 54: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeUInt64(v5, i2.y(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 55: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeInt32(v5, i2.x(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 56: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeFixed64(v5, i2.y(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 57: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeFixed32(v5, i2.x(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 58: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeBool(v5, ((Boolean)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))).booleanValue());
                        }
                        break;
                    }
                    case 59: {
                        if(this.m(v5, v3, object0)) {
                            i2.S(v5, d4.c.m(object0, ((long)(v4 & 0xFFFFF))), writer0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeMessage(v5, d4.c.m(object0, ((long)(v4 & 0xFFFFF))), this.g(v3));
                        }
                        break;
                    }
                    case 61: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeBytes(v5, ((ByteString)d4.c.m(object0, ((long)(v4 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 62: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeUInt32(v5, i2.x(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeEnum(v5, i2.x(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeSFixed32(v5, i2.x(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 65: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeSFixed64(v5, i2.y(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 66: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeSInt32(v5, i2.x(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 67: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeSInt64(v5, i2.y(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 68: {
                        if(this.m(v5, v3, object0)) {
                            writer0.writeGroup(v5, d4.c.m(object0, ((long)(v4 & 0xFFFFF))), this.g(v3));
                        }
                    }
                }
            }
            while(map$Entry1 != null) {
                q00.g(writer0, map$Entry1);
                if(iterator1.hasNext()) {
                    Object object6 = iterator1.next();
                    map$Entry1 = (Map.Entry)object6;
                }
                else {
                    map$Entry1 = null;
                }
            }
            ((x3)w30).getClass();
            ((GeneratedMessageLite)object0).unknownFields.writeTo(writer0);
            return;
        }
        this.Q(object0, writer0);
    }

    public static int x(Object object0, long v) {
        return (int)(((Integer)d4.c.m(object0, v)));
    }

    public static long y(Object object0, long v) {
        return (long)(((Long)d4.c.m(object0, v)));
    }

    public final int z(Object object0, byte[] arr_b, int v, int v1, int v2, long v3, g g0) {
        Unsafe unsafe0 = i2.s;
        Object object1 = this.f(v2);
        Object object2 = unsafe0.getObject(object0, v3);
        MapFieldSchema mapFieldSchema0 = this.q;
        if(mapFieldSchema0.isImmutable(object2)) {
            Object object3 = mapFieldSchema0.newMapField(object1);
            mapFieldSchema0.mergeFrom(object3, object2);
            unsafe0.putObject(object0, v3, object3);
            object2 = object3;
        }
        d2 d20 = mapFieldSchema0.forMapMetadata(object1);
        Map map0 = mapFieldSchema0.forMutableMapData(object2);
        int v4 = h.H(arr_b, v, g0);
        int v5 = g0.a;
        if(v5 < 0 || v5 > v1 - v4) {
            throw InvalidProtocolBufferException.h();
        }
        int v6 = v4 + v5;
        Object object4 = d20.d;
        Object object5 = d20.b;
        Object object6 = object4;
        while(v4 < v6) {
            int v7 = v4 + 1;
            int v8 = arr_b[v4];
            if(v8 < 0) {
                v7 = h.G(v8, arr_b, v7, g0);
                v8 = g0.a;
            }
            switch(v8 >>> 3) {
                case 1: {
                    if((v8 & 7) == d20.a.getWireType()) {
                        v4 = i2.c(arr_b, v7, v1, d20.a, null, g0);
                        object5 = g0.c;
                        continue;
                    }
                    break;
                }
                case 2: {
                    if((v8 & 7) == d20.c.getWireType()) {
                        Class class0 = object4.getClass();
                        v4 = i2.c(arr_b, v7, v1, d20.c, class0, g0);
                        object6 = g0.c;
                        continue;
                    }
                }
            }
            v4 = h.N(v8, arr_b, v7, v1, g0);
        }
        if(v4 != v6) {
            throw InvalidProtocolBufferException.g();
        }
        map0.put(object5, object6);
        return v6;
    }
}

