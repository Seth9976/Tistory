package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

public abstract class g4 {
    public static final e4 a;

    // 去混淆评级： 低(25)
    static {
        g4.a = d4.d ? new e4(1) : new e4(0);
    }

    public static int a(byte[] arr_b, int v, int v1) {
        int v2 = arr_b[v - 1];
        switch(v1 - v) {
            case 0: {
                return v2 <= -12 ? v2 : -1;
            }
            case 1: {
                return g4.f(v2, arr_b[v]);
            }
            case 2: {
                return g4.g(v2, arr_b[v], arr_b[v + 1]);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static int b(int v, int v1, int v2, ByteBuffer byteBuffer0) {
        switch(v2) {
            case 0: {
                return v <= -12 ? v : -1;
            }
            case 1: {
                return g4.f(v, byteBuffer0.get(v1));
            }
            case 2: {
                return g4.g(v, byteBuffer0.get(v1), byteBuffer0.get(v1 + 1));
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static String c(ByteBuffer byteBuffer0, int v, int v1) {
        e4 e40 = g4.a;
        e40.getClass();
        if(byteBuffer0.hasArray()) {
            int v2 = byteBuffer0.arrayOffset();
            return e40.e(byteBuffer0.array(), v2 + v, v1);
        }
        if(byteBuffer0.isDirect() && e40.a != 0) {
            if((v | v1 | byteBuffer0.limit() - v - v1) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v, v1));
            }
            long v3 = d4.b(byteBuffer0) + ((long)v);
            long v4 = ((long)v1) + v3;
            char[] arr_c = new char[v1];
            int v5;
            for(v5 = 0; Long.compare(v3, v4) < 0; ++v5) {
                int v6 = d4.c.f(v3);
                if(!e4.b(((byte)v6))) {
                    break;
                }
                ++v3;
                arr_c[v5] = (char)v6;
            }
            int v7 = v5;
            while(v3 < v4) {
                long v8 = v3 + 1L;
                c4 c40 = d4.c;
                int v9 = c40.f(v3);
                if(e4.b(((byte)v9))) {
                    int v10 = v7 + 1;
                    arr_c[v7] = (char)v9;
                    while(v8 < v4) {
                        int v11 = d4.c.f(v8);
                        if(!e4.b(((byte)v11))) {
                            break;
                        }
                        ++v8;
                        arr_c[v10] = (char)v11;
                        ++v10;
                    }
                    v7 = v10;
                    v3 = v8;
                    continue;
                }
                if(v9 < 0xFFFFFFE0) {
                    if(v8 < v4) {
                        v3 += 2L;
                        e4.c(((byte)v9), c40.f(v8), arr_c, v7);
                        ++v7;
                        continue;
                    }
                }
                else if(v9 >= -16) {
                    if(v8 < v4 - 2L) {
                        int v13 = c40.f(v8);
                        long v14 = v3 + 3L;
                        int v15 = c40.f(v3 + 2L);
                        v3 += 4L;
                        e4.a(((byte)v9), ((byte)v13), ((byte)v15), c40.f(v14), arr_c, v7);
                        v7 += 2;
                        continue;
                    }
                }
                else if(v8 < v4 - 1L) {
                    long v12 = v3 + 2L;
                    v3 += 3L;
                    e4.d(((byte)v9), c40.f(v8), c40.f(v12), arr_c, v7);
                    ++v7;
                    continue;
                }
                throw InvalidProtocolBufferException.c();
            }
            return new String(arr_c, 0, v7);
        }
        return e4.f(byteBuffer0, v, v1);
    }

    public static void d(ByteBuffer byteBuffer0, String s) {
        int v9;
        long v8;
        e4 e40 = g4.a;
        e40.getClass();
        if(byteBuffer0.hasArray()) {
            int v = byteBuffer0.arrayOffset();
            byteBuffer0.position(e40.g(s, byteBuffer0.array(), byteBuffer0.position() + v, byteBuffer0.remaining()) - v);
            return;
        }
        if(byteBuffer0.isDirect()) {
            if(e40.a != 0) {
                long v1 = d4.b(byteBuffer0);
                long v2 = ((long)byteBuffer0.position()) + v1;
                long v3 = ((long)byteBuffer0.limit()) + v1;
                int v4 = s.length();
                if(Long.compare(v4, v3 - v2) > 0) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v4 - 1) + " at index " + byteBuffer0.limit());
                }
                int v5 = 0;
                while(v5 < v4) {
                    int v6 = s.charAt(v5);
                    if(v6 >= 0x80) {
                        break;
                    }
                    d4.q(v2, ((byte)v6));
                    ++v5;
                    ++v2;
                }
                if(v5 == v4) {
                    byteBuffer0.position(((int)(v2 - v1)));
                    return;
                }
                while(v5 < v4) {
                    int v7 = s.charAt(v5);
                    if(v7 < 0x80 && v2 < v3) {
                        d4.q(v2, ((byte)v7));
                        v8 = v1;
                        v9 = v5;
                        ++v2;
                    }
                    else if(v7 >= 0x800 || v2 > v3 - 2L) {
                        v8 = v1;
                        if(v7 >= 0xD800 && 0xDFFF >= v7 || v2 > v3 - 3L) {
                            if(v2 > v3 - 4L) {
                                goto label_66;
                            }
                            v9 = v5 + 1;
                            if(v9 == v4) {
                                throw new f4(v5 - 1, v4);
                            }
                            int v12 = s.charAt(v9);
                            if(!Character.isSurrogatePair(((char)v7), ((char)v12))) {
                                goto label_64;
                            }
                            int v13 = Character.toCodePoint(((char)v7), ((char)v12));
                            d4.q(v2, ((byte)(v13 >>> 18 | 0xF0)));
                            d4.q(v2 + 1L, ((byte)(v13 >>> 12 & 0x3F | 0x80)));
                            long v14 = v2 + 3L;
                            d4.q(v2 + 2L, ((byte)(v13 >>> 6 & 0x3F | 0x80)));
                            v2 += 4L;
                            d4.q(v14, ((byte)(v13 & 0x3F | 0x80)));
                        }
                        else {
                            d4.q(v2, ((byte)(v7 >>> 12 | 480)));
                            long v11 = v2 + 2L;
                            d4.q(v2 + 1L, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                            v2 += 3L;
                            d4.q(v11, ((byte)(v7 & 0x3F | 0x80)));
                            v9 = v5;
                        }
                    }
                    else {
                        v8 = v1;
                        long v10 = v2 + 1L;
                        d4.q(v2, ((byte)(v7 >>> 6 | 960)));
                        v2 += 2L;
                        d4.q(v10, ((byte)(v7 & 0x3F | 0x80)));
                        v9 = v5;
                    }
                    v1 = v8;
                    v5 = v9 + 1;
                    continue;
                label_64:
                    v5 = v9;
                    throw new f4(v5 - 1, v4);
                label_66:
                    if(!(0xD800 <= v7 && v7 <= 0xDFFF && (v5 + 1 == v4 || !Character.isSurrogatePair(((char)v7), s.charAt(v5 + 1))))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v2);
                    }
                    throw new f4(v5, v4);
                }
                byteBuffer0.position(((int)(v2 - v1)));
                return;
            }
            e4.h(byteBuffer0, s);
            return;
        }
        e4.h(byteBuffer0, s);
        return;
    }

    public static int e(String s) {
        int v = s.length();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v && s.charAt(v2) < 0x80; ++v2) {
        }
        int v3 = v;
        while(v2 < v) {
            int v4 = s.charAt(v2);
            if(v4 < 0x800) {
                v3 += 0x7F - v4 >>> 0x1F;
                ++v2;
            }
            else {
                int v5 = s.length();
                while(v2 < v5) {
                    int v6 = s.charAt(v2);
                    if(v6 < 0x800) {
                        v1 += 0x7F - v6 >>> 0x1F;
                    }
                    else {
                        v1 += 2;
                        if(0xD800 <= v6 && v6 <= 0xDFFF) {
                            if(Character.codePointAt(s, v2) < 0x10000) {
                                throw new f4(v2, v5);
                            }
                            ++v2;
                        }
                    }
                    ++v2;
                }
                v3 += v1;
                if(true) {
                    break;
                }
            }
        }
        if(v3 < v) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long)v3) + 0x100000000L));
        }
        return v3;
    }

    public static int f(int v, int v1) {
        return v > -12 || v1 > -65 ? -1 : v ^ v1 << 8;
    }

    public static int g(int v, int v1, int v2) {
        return v > -12 || v1 > -65 || v2 > -65 ? -1 : v ^ v1 << 8 ^ v2 << 16;
    }

    public static boolean h(byte[] arr_b, int v, int v1) {
        return g4.a.l(0, arr_b, v, v1) == 0;
    }
}

