package com.google.android.gms.internal.measurement;

public abstract class n0 {
    public static final u1 a;
    public static final v1 b;

    static {
        n0.a = new u1();  // 初始化器: Ljava/lang/Object;-><init>()V
        n0.b = new v1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static int a(byte[] arr_b, int v, m0 m00) {
        int v1 = n0.k(arr_b, v, m00);
        int v2 = m00.a;
        if(v2 < 0) {
            throw zzkp.b();
        }
        if(v2 > arr_b.length - v1) {
            throw zzkp.d();
        }
        if(v2 == 0) {
            m00.c = zzje.zzb;
            return v1;
        }
        m00.c = zzje.zzl(arr_b, v1, v2);
        return v1 + v2;
    }

    public static String b(zzje zzje0) {
        StringBuilder stringBuilder0 = new StringBuilder(zzje0.zzd());
        for(int v = 0; v < zzje0.zzd(); ++v) {
            int v1 = zzje0.zza(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        stringBuilder0.append(((char)((v1 & 7) + 0x30)));
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public static int c(int v, byte[] arr_b) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    public static int d(zzlx zzlx0, byte[] arr_b, int v, int v1, int v2, m0 m00) {
        Object object0 = zzlx0.zze();
        int v3 = n0.o(object0, zzlx0, arr_b, v, v1, v2, m00);
        zzlx0.zzf(object0);
        m00.c = object0;
        return v3;
    }

    public static int e(zzlx zzlx0, int v, byte[] arr_b, int v1, int v2, zzkm zzkm0, m0 m00) {
        Object object0 = zzlx0.zze();
        int v3 = n0.p(object0, zzlx0, arr_b, v1, v2, m00);
        zzlx0.zzf(object0);
        m00.c = object0;
        zzkm0.add(object0);
        while(v3 < v2) {
            int v4 = n0.k(arr_b, v3, m00);
            if(v != m00.a) {
                break;
            }
            Object object1 = zzlx0.zze();
            int v5 = n0.p(object1, zzlx0, arr_b, v4, v2, m00);
            zzlx0.zzf(object1);
            m00.c = object1;
            zzkm0.add(object1);
            v3 = v5;
        }
        return v3;
    }

    public static boolean f(byte b) {
        return b > -65;
    }

    public static int g(byte[] arr_b, int v, zzkm zzkm0, m0 m00) {
        int v1 = n0.k(arr_b, v, m00);
        int v2 = m00.a + v1;
        while(v1 < v2) {
            v1 = n0.k(arr_b, v1, m00);
            ((a1)zzkm0).a(m00.a);
        }
        if(v1 != v2) {
            throw zzkp.d();
        }
        return v1;
    }

    public static int h(byte[] arr_b, int v, m0 m00) {
        int v1 = n0.k(arr_b, v, m00);
        int v2 = m00.a;
        if(v2 < 0) {
            throw zzkp.b();
        }
        if(v2 == 0) {
            m00.c = "";
            return v1;
        }
        m00.c = new String(arr_b, v1, v2, zzkn.a);
        return v1 + v2;
    }

    public static int i(byte[] arr_b, int v, m0 m00) {
        int v1 = n0.k(arr_b, v, m00);
        int v2 = m00.a;
        if(v2 < 0) {
            throw zzkp.b();
        }
        if(v2 == 0) {
            m00.c = "";
            return v1;
        }
        if((v1 | v2 | arr_b.length - v1 - v2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v1, v2));
        }
        int v3 = v1 + v2;
        char[] arr_c = new char[v2];
        int v4;
        for(v4 = 0; v1 < v3; ++v4) {
            int v5 = arr_b[v1];
            if(v5 < 0) {
                break;
            }
            ++v1;
            arr_c[v4] = (char)v5;
        }
        while(v1 < v3) {
            int v6 = v1 + 1;
            int v7 = arr_b[v1];
            if(v7 >= 0) {
                arr_c[v4] = (char)v7;
                ++v4;
                v1 = v6;
                while(v1 < v3) {
                    int v8 = arr_b[v1];
                    if(v8 < 0) {
                        break;
                    }
                    ++v1;
                    arr_c[v4] = (char)v8;
                    ++v4;
                }
                continue;
            }
            if(v7 < 0xFFFFFFE0) {
                if(v6 < v3) {
                    v1 += 2;
                    int v9 = arr_b[v6];
                    if(v7 < -62 || n0.f(((byte)v9))) {
                        throw zzkp.a();
                    }
                    arr_c[v4] = (char)(v9 & 0x3F | (v7 & 0x1F) << 6);
                    ++v4;
                    continue;
                }
            }
            else if(v7 < -16) {
                if(v6 < v3 - 1) {
                    int v10 = v1 + 2;
                    v1 += 3;
                    int v11 = arr_b[v6];
                    int v12 = arr_b[v10];
                    if(!n0.f(((byte)v11))) {
                        if(v7 != 0xFFFFFFE0) {
                        label_52:
                            if(v7 != -19) {
                            label_55:
                                if(!n0.f(((byte)v12))) {
                                    arr_c[v4] = (char)((v11 & 0x3F) << 6 | (v7 & 15) << 12 | v12 & 0x3F);
                                    ++v4;
                                    continue;
                                }
                            }
                            else if(v11 < 0xFFFFFFA0) {
                                v7 = -19;
                                goto label_55;
                            }
                        }
                        else if(v11 >= 0xFFFFFFA0) {
                            v7 = 0xFFFFFFE0;
                            goto label_52;
                        }
                    }
                    throw zzkp.a();
                }
            }
            else if(v6 < v3 - 2) {
                int v13 = v1 + 2;
                int v14 = v1 + 3;
                v1 += 4;
                int v15 = arr_b[v6];
                int v16 = arr_b[v13];
                int v17 = arr_b[v14];
                if(n0.f(((byte)v15)) || v15 + 0x70 + (v7 << 28) >> 30 != 0 || n0.f(((byte)v16)) || n0.f(((byte)v17))) {
                    throw zzkp.a();
                }
                int v18 = (v15 & 0x3F) << 12 | (v7 & 7) << 18 | (v16 & 0x3F) << 6 | v17 & 0x3F;
                arr_c[v4] = (char)((v18 >>> 10) + 0xD7C0);
                arr_c[v4 + 1] = (char)((v18 & 0x3FF) + 0xDC00);
                v4 += 2;
                continue;
            }
            throw zzkp.a();
        }
        m00.c = new String(arr_c, 0, v4);
        return v3;
    }

    public static int j(int v, byte[] arr_b, int v1, int v2, zzmp zzmp0, m0 m00) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = n0.n(arr_b, v1, m00);
                    zzmp0.b(v, m00.b);
                    return v3;
                }
                case 1: {
                    zzmp0.b(v, n0.q(v1, arr_b));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = n0.k(arr_b, v1, m00);
                    int v5 = m00.a;
                    if(v5 < 0) {
                        throw zzkp.b();
                    }
                    if(v5 > arr_b.length - v4) {
                        throw zzkp.d();
                    }
                    if(v5 == 0) {
                        zzmp0.b(v, zzje.zzb);
                        return v4;
                    }
                    zzmp0.b(v, zzje.zzl(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    int v6 = v & -8 | 4;
                    zzmp zzmp1 = zzmp.a();
                    int v7 = 0;
                    while(v1 < v2) {
                        int v8 = n0.k(arr_b, v1, m00);
                        int v9 = m00.a;
                        if(v9 == v6) {
                            v7 = v9;
                            v1 = v8;
                            break;
                        }
                        v7 = v9;
                        v1 = n0.j(v9, arr_b, v8, v2, zzmp1, m00);
                    }
                    if(v1 > v2 || v7 != v6) {
                        throw zzkp.c();
                    }
                    zzmp0.b(v, zzmp1);
                    return v1;
                }
                case 5: {
                    zzmp0.b(v, n0.c(v1, arr_b));
                    return v1 + 4;
                }
                default: {
                    throw new zzkp("Protocol message contained an invalid tag (zero).");
                }
            }
        }
        throw new zzkp("Protocol message contained an invalid tag (zero).");
    }

    public static int k(byte[] arr_b, int v, m0 m00) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            m00.a = v1;
            return v + 1;
        }
        return n0.l(v1, arr_b, v + 1, m00);
    }

    public static int l(int v, byte[] arr_b, int v1, m0 m00) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            m00.a = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            m00.a = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            m00.a = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            m00.a = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        m00.a = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    public static int m(int v, byte[] arr_b, int v1, int v2, zzkm zzkm0, m0 m00) {
        int v3 = n0.k(arr_b, v1, m00);
        ((a1)zzkm0).a(m00.a);
        while(v3 < v2) {
            int v4 = n0.k(arr_b, v3, m00);
            if(v != m00.a) {
                break;
            }
            v3 = n0.k(arr_b, v4, m00);
            ((a1)zzkm0).a(m00.a);
        }
        return v3;
    }

    public static int n(byte[] arr_b, int v, m0 m00) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            m00.b = v1;
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
        m00.b = v4;
        return v2;
    }

    public static int o(Object object0, zzlx zzlx0, byte[] arr_b, int v, int v1, int v2, m0 m00) {
        int v3 = ((k1)zzlx0).v(object0, arr_b, v, v1, v2, m00);
        m00.c = object0;
        return v3;
    }

    public static int p(Object object0, zzlx zzlx0, byte[] arr_b, int v, int v1, m0 m00) {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = n0.l(v3, arr_b, v2, m00);
            v3 = m00.a;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw zzkp.d();
        }
        int v4 = v3 + v2;
        zzlx0.zzh(object0, arr_b, v2, v4, m00);
        m00.c = object0;
        return v4;
    }

    public static long q(int v, byte[] arr_b) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }
}

