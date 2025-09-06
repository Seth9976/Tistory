package com.google.android.gms.internal.measurement;

public abstract class f2 {
    public static final f a;

    static {
        f2.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static int a(byte[] arr_b, int v, int v1) {
        int v2 = arr_b[v - 1];
        switch(v1 - v) {
            case 0: {
                return v2 > -12 ? -1 : v2;
            }
            case 1: {
                int v3 = arr_b[v];
                return v2 > -12 || v3 > -65 ? -1 : v2 ^ v3 << 8;
            }
            case 2: {
                int v4 = arr_b[v];
                int v5 = arr_b[v + 1];
                return v2 <= -12 && v4 <= -65 && v5 <= -65 ? v4 << 8 ^ v2 ^ v5 << 16 : -1;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static int b(String s, byte[] arr_b, int v, int v1) {
        int v2 = s.length();
        int v3 = v1 + v;
        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            int v5 = v4 + v;
            if(v5 >= v3) {
                break;
            }
            int v6 = s.charAt(v4);
            if(v6 >= 0x80) {
                break;
            }
            arr_b[v5] = (byte)v6;
        }
        if(v4 == v2) {
            return v + v2;
        }
        int v7 = v + v4;
        while(v4 < v2) {
            int v8 = s.charAt(v4);
            if(v8 < 0x80 && v7 < v3) {
                arr_b[v7] = (byte)v8;
                ++v7;
            }
            else if(v8 < 0x800 && v7 <= v3 - 2) {
                int v9 = v7 + 1;
                arr_b[v7] = (byte)(v8 >>> 6 | 960);
                v7 += 2;
                arr_b[v9] = (byte)(v8 & 0x3F | 0x80);
            }
            else if(v8 >= 0xD800 && v8 <= 0xDFFF || v7 > v3 - 3) {
                if(v7 > v3 - 4) {
                    goto label_49;
                }
                if(v4 + 1 == s.length()) {
                    throw new e2(v4 - 1, v2);
                }
                int v11 = s.charAt(v4 + 1);
                if(!Character.isSurrogatePair(((char)v8), ((char)v11))) {
                    goto label_47;
                }
                int v12 = Character.toCodePoint(((char)v8), ((char)v11));
                arr_b[v7] = (byte)(v12 >>> 18 | 0xF0);
                arr_b[v7 + 1] = (byte)(v12 >>> 12 & 0x3F | 0x80);
                int v13 = v7 + 3;
                arr_b[v7 + 2] = (byte)(v12 >>> 6 & 0x3F | 0x80);
                v7 += 4;
                arr_b[v13] = (byte)(v12 & 0x3F | 0x80);
                ++v4;
            }
            else {
                arr_b[v7] = (byte)(v8 >>> 12 | 480);
                int v10 = v7 + 2;
                arr_b[v7 + 1] = (byte)(v8 >>> 6 & 0x3F | 0x80);
                v7 += 3;
                arr_b[v10] = (byte)(v8 & 0x3F | 0x80);
            }
            ++v4;
            continue;
        label_47:
            ++v4;
            throw new e2(v4 - 1, v2);
        label_49:
            if(!(v8 >= 0xD800 && v8 <= 0xDFFF && (v4 + 1 == s.length() || !Character.isSurrogatePair(((char)v8), s.charAt(v4 + 1))))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v8) + " at index " + v7);
            }
            throw new e2(v4, v2);
        }
        return v7;
    }

    public static int c(String s) {
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
                        if(v6 >= 0xD800 && v6 <= 0xDFFF) {
                            if(Character.codePointAt(s, v2) < 0x10000) {
                                throw new e2(v2, v5);
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

    public static boolean d(byte[] arr_b, int v, int v1) {
        f2.a.getClass();
        return f.a(arr_b, v, v1);
    }
}

