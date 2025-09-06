package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class e4 {
    public final int a;
    public static final g3 b;
    public static final h3 c;

    static {
        e4.b = new g3();  // 初始化器: Ljava/lang/Object;-><init>()V
        e4.c = new h3();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public e4(int v) {
        this.a = v;
        super();
    }

    public static void a(byte b, byte b1, byte b2, byte b3, char[] arr_c, int v) {
        if(e4.j(b1) || b1 + 0x70 + (b << 28) >> 30 != 0 || e4.j(b2) || e4.j(b3)) {
            throw InvalidProtocolBufferException.c();
        }
        int v1 = (b & 7) << 18 | (b1 & 0x3F) << 12 | (b2 & 0x3F) << 6 | b3 & 0x3F;
        arr_c[v] = (char)((v1 >>> 10) + 0xD7C0);
        arr_c[v + 1] = (char)((v1 & 0x3FF) + 0xDC00);
    }

    public static boolean b(byte b) {
        return b >= 0;
    }

    public static void c(byte b, byte b1, char[] arr_c, int v) {
        if(b < -62 || e4.j(b1)) {
            throw InvalidProtocolBufferException.c();
        }
        arr_c[v] = (char)((b & 0x1F) << 6 | b1 & 0x3F);
    }

    public static void d(byte b, byte b1, byte b2, char[] arr_c, int v) {
        if(e4.j(b1) || b == 0xFFFFFFE0 && b1 < 0xFFFFFFA0 || b == -19 && b1 >= 0xFFFFFFA0 || e4.j(b2)) {
            throw InvalidProtocolBufferException.c();
        }
        arr_c[v] = (char)((b & 15) << 12 | (b1 & 0x3F) << 6 | b2 & 0x3F);
    }

    public final String e(byte[] arr_b, int v, int v1) {
        if(this.a != 0) {
            String s = new String(arr_b, v, v1, Internal.a);
            if(s.contains("\uFFFD") && !Arrays.equals(s.getBytes(Internal.a), Arrays.copyOfRange(arr_b, v, v1 + v))) {
                throw InvalidProtocolBufferException.c();
            }
            return s;
        }
        if((v | v1 | arr_b.length - v - v1) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v, v1));
        }
        int v2 = v + v1;
        char[] arr_c = new char[v1];
        int v3;
        for(v3 = 0; v < v2; ++v3) {
            int v4 = arr_b[v];
            if(!e4.b(((byte)v4))) {
                break;
            }
            ++v;
            arr_c[v3] = (char)v4;
        }
        int v5 = v3;
        while(v < v2) {
            int v6 = v + 1;
            int v7 = arr_b[v];
            if(e4.b(((byte)v7))) {
                int v8 = v5 + 1;
                arr_c[v5] = (char)v7;
                while(v6 < v2) {
                    int v9 = arr_b[v6];
                    if(!e4.b(((byte)v9))) {
                        break;
                    }
                    ++v6;
                    arr_c[v8] = (char)v9;
                    ++v8;
                }
                v5 = v8;
                v = v6;
                continue;
            }
            if(v7 < 0xFFFFFFE0) {
                if(v6 < v2) {
                    v += 2;
                    e4.c(((byte)v7), arr_b[v6], arr_c, v5);
                    ++v5;
                    continue;
                }
            }
            else if(v7 >= -16) {
                if(v6 < v2 - 2) {
                    int v11 = arr_b[v6];
                    int v12 = v + 3;
                    int v13 = arr_b[v + 2];
                    v += 4;
                    e4.a(((byte)v7), ((byte)v11), ((byte)v13), arr_b[v12], arr_c, v5);
                    v5 += 2;
                    continue;
                }
            }
            else if(v6 < v2 - 1) {
                int v10 = v + 2;
                v += 3;
                e4.d(((byte)v7), arr_b[v6], arr_b[v10], arr_c, v5);
                ++v5;
                continue;
            }
            throw InvalidProtocolBufferException.c();
        }
        return new String(arr_c, 0, v5);
    }

    public static String f(ByteBuffer byteBuffer0, int v, int v1) {
        if((v | v1 | byteBuffer0.limit() - v - v1) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v, v1));
        }
        int v2 = v + v1;
        char[] arr_c = new char[v1];
        int v3;
        for(v3 = 0; v < v2; ++v3) {
            int v4 = byteBuffer0.get(v);
            if(!e4.b(((byte)v4))) {
                break;
            }
            ++v;
            arr_c[v3] = (char)v4;
        }
        int v5 = v3;
        while(v < v2) {
            int v6 = v + 1;
            int v7 = byteBuffer0.get(v);
            if(e4.b(((byte)v7))) {
                int v8 = v5 + 1;
                arr_c[v5] = (char)v7;
                while(v6 < v2) {
                    int v9 = byteBuffer0.get(v6);
                    if(!e4.b(((byte)v9))) {
                        break;
                    }
                    ++v6;
                    arr_c[v8] = (char)v9;
                    ++v8;
                }
                v5 = v8;
                v = v6;
                continue;
            }
            if(v7 < 0xFFFFFFE0) {
                if(v6 < v2) {
                    v += 2;
                    e4.c(((byte)v7), byteBuffer0.get(v6), arr_c, v5);
                    ++v5;
                    continue;
                }
            }
            else if(v7 >= -16) {
                if(v6 < v2 - 2) {
                    int v11 = byteBuffer0.get(v6);
                    int v12 = v + 3;
                    int v13 = byteBuffer0.get(v + 2);
                    v += 4;
                    e4.a(((byte)v7), ((byte)v11), ((byte)v13), byteBuffer0.get(v12), arr_c, v5);
                    v5 += 2;
                    continue;
                }
            }
            else if(v6 < v2 - 1) {
                int v10 = v + 2;
                v += 3;
                e4.d(((byte)v7), byteBuffer0.get(v6), byteBuffer0.get(v10), arr_c, v5);
                ++v5;
                continue;
            }
            throw InvalidProtocolBufferException.c();
        }
        return new String(arr_c, 0, v5);
    }

    public final int g(String s, byte[] arr_b, int v, int v1) {
        if(this.a != 0) {
            long v2 = (long)v;
            long v3 = ((long)v1) + v2;
            int v4 = s.length();
            if(v4 > v1 || arr_b.length - v1 < v) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v4 - 1) + " at index " + (v + v1));
            }
            int v5 = 0;
            while(v5 < v4) {
                int v6 = s.charAt(v5);
                if(v6 >= 0x80) {
                    break;
                }
                d4.r(arr_b, v2, ((byte)v6));
                ++v5;
                ++v2;
            }
            if(v5 != v4) {
                while(v5 < v4) {
                    int v7 = s.charAt(v5);
                    if(v7 < 0x80 && v2 < v3) {
                        d4.r(arr_b, v2, ((byte)v7));
                        ++v2;
                    }
                    else if(v7 < 0x800 && v2 <= v3 - 2L) {
                        long v8 = v2 + 1L;
                        d4.r(arr_b, v2, ((byte)(v7 >>> 6 | 960)));
                        v2 += 2L;
                        d4.r(arr_b, v8, ((byte)(v7 & 0x3F | 0x80)));
                    }
                    else if(v7 >= 0xD800 && 0xDFFF >= v7 || v2 > v3 - 3L) {
                        if(v2 > v3 - 4L) {
                            goto label_49;
                        }
                        if(v5 + 1 == v4) {
                            throw new f4(v5 - 1, v4);
                        }
                        int v10 = s.charAt(v5 + 1);
                        if(!Character.isSurrogatePair(((char)v7), ((char)v10))) {
                            goto label_47;
                        }
                        int v11 = Character.toCodePoint(((char)v7), ((char)v10));
                        d4.r(arr_b, v2, ((byte)(v11 >>> 18 | 0xF0)));
                        d4.r(arr_b, v2 + 1L, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                        long v12 = v2 + 3L;
                        d4.r(arr_b, v2 + 2L, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                        v2 += 4L;
                        d4.r(arr_b, v12, ((byte)(v11 & 0x3F | 0x80)));
                        ++v5;
                    }
                    else {
                        d4.r(arr_b, v2, ((byte)(v7 >>> 12 | 480)));
                        long v9 = v2 + 2L;
                        d4.r(arr_b, v2 + 1L, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                        v2 += 3L;
                        d4.r(arr_b, v9, ((byte)(v7 & 0x3F | 0x80)));
                    }
                    ++v5;
                    continue;
                label_47:
                    ++v5;
                    throw new f4(v5 - 1, v4);
                label_49:
                    if(!(0xD800 <= v7 && v7 <= 0xDFFF && (v5 + 1 == v4 || !Character.isSurrogatePair(((char)v7), s.charAt(v5 + 1))))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v2);
                    }
                    throw new f4(v5, v4);
                }
            }
            return (int)v2;
        }
        int v13 = s.length();
        int v14 = v1 + v;
        int v15;
        for(v15 = 0; v15 < v13; ++v15) {
            int v16 = v15 + v;
            if(v16 >= v14) {
                break;
            }
            int v17 = s.charAt(v15);
            if(v17 >= 0x80) {
                break;
            }
            arr_b[v16] = (byte)v17;
        }
        if(v15 == v13) {
            return v + v13;
        }
        int v18 = v + v15;
        while(v15 < v13) {
            int v19 = s.charAt(v15);
            if(v19 < 0x80 && v18 < v14) {
                arr_b[v18] = (byte)v19;
                ++v18;
            }
            else if(v19 < 0x800 && v18 <= v14 - 2) {
                int v20 = v18 + 1;
                arr_b[v18] = (byte)(v19 >>> 6 | 960);
                v18 += 2;
                arr_b[v20] = (byte)(v19 & 0x3F | 0x80);
            }
            else if(v19 >= 0xD800 && 0xDFFF >= v19 || v18 > v14 - 3) {
                if(v18 > v14 - 4) {
                    goto label_103;
                }
                if(v15 + 1 == s.length()) {
                    throw new f4(v15 - 1, v13);
                }
                int v22 = s.charAt(v15 + 1);
                if(!Character.isSurrogatePair(((char)v19), ((char)v22))) {
                    goto label_101;
                }
                int v23 = Character.toCodePoint(((char)v19), ((char)v22));
                arr_b[v18] = (byte)(v23 >>> 18 | 0xF0);
                arr_b[v18 + 1] = (byte)(v23 >>> 12 & 0x3F | 0x80);
                int v24 = v18 + 3;
                arr_b[v18 + 2] = (byte)(v23 >>> 6 & 0x3F | 0x80);
                v18 += 4;
                arr_b[v24] = (byte)(v23 & 0x3F | 0x80);
                ++v15;
            }
            else {
                arr_b[v18] = (byte)(v19 >>> 12 | 480);
                int v21 = v18 + 2;
                arr_b[v18 + 1] = (byte)(v19 >>> 6 & 0x3F | 0x80);
                v18 += 3;
                arr_b[v21] = (byte)(v19 & 0x3F | 0x80);
            }
            ++v15;
            continue;
        label_101:
            ++v15;
            throw new f4(v15 - 1, v13);
        label_103:
            if(!(0xD800 <= v19 && v19 <= 0xDFFF && (v15 + 1 == s.length() || !Character.isSurrogatePair(((char)v19), s.charAt(v15 + 1))))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v19) + " at index " + v18);
            }
            throw new f4(v15, v13);
        }
        return v18;
    }

    public static void h(ByteBuffer byteBuffer0, String s) {
        int v8;
        int v7;
        int v5;
        int v4;
        int v = s.length();
        int v1 = byteBuffer0.position();
        int v2 = 0;
        try {
            while(v2 < v) {
                int v3 = s.charAt(v2);
                if(v3 >= 0x80) {
                    break;
                }
                byteBuffer0.put(v1 + v2, ((byte)v3));
                ++v2;
            }
            if(v2 == v) {
                byteBuffer0.position(v1 + v2);
                return;
            }
            v1 += v2;
            while(true) {
            label_13:
                if(v2 >= v) {
                    byteBuffer0.position(v1);
                    return;
                }
                v4 = s.charAt(v2);
                if(v4 >= 0x80) {
                    break;
                }
                byteBuffer0.put(v1, ((byte)v4));
                ++v2;
                ++v1;
            }
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
        }
        if(v4 < 0x800) {
            try {
                v5 = v1 + 1;
                byteBuffer0.put(v1, ((byte)(v4 >>> 6 | 0xC0)));
                byteBuffer0.put(v5, ((byte)(v4 & 0x3F | 0x80)));
                v1 = v5;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                v1 = v5;
                throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
            }
        }
        else if(v4 < 0xD800 || 0xDFFF < v4) {
            try {
                v5 = v1 + 1;
                byteBuffer0.put(v1, ((byte)(v4 >>> 12 | 0xE0)));
                v1 += 2;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                v1 = v5;
                throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
            }
            try {
                byteBuffer0.put(v5, ((byte)(v4 >>> 6 & 0x3F | 0x80)));
                byteBuffer0.put(v1, ((byte)(v4 & 0x3F | 0x80)));
                ++v2;
                ++v1;
                goto label_13;
            }
            catch(IndexOutOfBoundsException unused_ex) {
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
        }
        else {
            if(v2 + 1 != v) {
                try {
                    int v6 = s.charAt(v2 + 1);
                    if(Character.isSurrogatePair(((char)v4), ((char)v6))) {
                        v7 = Character.toCodePoint(((char)v4), ((char)v6));
                        goto label_31;
                    }
                    else {
                        goto label_46;
                    }
                    throw new f4(v2, v);
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    ++v2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
                }
                try {
                label_31:
                    byteBuffer0.put(v1, ((byte)(v7 >>> 18 | 0xF0)));
                    v8 = v1 + 2;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    ++v1;
                    ++v2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
                }
                try {
                    byteBuffer0.put(v1 + 1, ((byte)(v7 >>> 12 & 0x3F | 0x80)));
                    v1 += 3;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    ++v2;
                    v1 = v8;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
                }
                try {
                    byteBuffer0.put(v8, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                    byteBuffer0.put(v1, ((byte)(v7 & 0x3F | 0x80)));
                    ++v2;
                    ++v2;
                    ++v1;
                    goto label_13;
                label_46:
                    ++v2;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    ++v2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
                }
            }
            try {
                throw new f4(v2, v);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v2) + " at index " + (Math.max(v2, v1 - byteBuffer0.position() + 1) + byteBuffer0.position()));
            }
        }
        ++v2;
        ++v1;
        goto label_13;
    }

    public static String i(ByteString byteString0) {
        StringBuilder stringBuilder0 = new StringBuilder(byteString0.size());
        for(int v = 0; v < byteString0.size(); ++v) {
            int v1 = byteString0.byteAt(v);
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

    public static boolean j(byte b) {
        return b > -65;
    }

    public int k(int v, int v1, int v2, ByteBuffer byteBuffer0) {
        int v8;
        int v17;
        int v10;
        if(byteBuffer0.hasArray()) {
            int v3 = byteBuffer0.arrayOffset();
            return this.l(v, byteBuffer0.array(), v1 + v3, v3 + v2);
        }
        if(byteBuffer0.isDirect() && this.a != 0) {
            if((v1 | v2 | byteBuffer0.limit() - v2) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v1, v2));
            }
            long v4 = d4.b(byteBuffer0) + ((long)v1);
            long v5 = ((long)(v2 - v1)) + v4;
            if(v == 0) {
            label_43:
                int v9 = (int)(v5 - v4);
                if(v9 < 16) {
                    v10 = 0;
                }
                else {
                    int v11 = (int)(-v4 & 7L);
                    int v12 = v11;
                    for(long v13 = v4; true; ++v13) {
                        if(v12 <= 0) {
                            int v14;
                            for(v14 = v9 - v11; v14 >= 8 && (d4.c.k(v13) & 0x8080808080808080L) == 0L; v14 -= 8) {
                                v13 += 8L;
                            }
                            v10 = v9 - v14;
                            break;
                        }
                        if(d4.c.f(v13) < 0) {
                            v10 = v11 - v12;
                            break;
                        }
                        --v12;
                    }
                }
                long v15 = v4 + ((long)v10);
                int v16 = v9 - v10;
            alab1:
                while(true) {
                    while(true) {
                    label_66:
                        v17 = 0;
                        while(v16 > 0) {
                            v17 = d4.c.f(v15);
                            if(v17 >= 0) {
                                --v16;
                                ++v15;
                            }
                            else {
                                ++v15;
                                if(true) {
                                    break;
                                }
                            }
                        }
                        if(v16 == 0) {
                            return 0;
                        }
                        if(v17 < 0xFFFFFFE0) {
                            if(v16 - 1 == 0) {
                                return v17;
                            }
                            v16 -= 2;
                            if(v17 < -62 || d4.c.f(v15) > -65) {
                                break alab1;
                            }
                            ++v15;
                            continue;
                        }
                        if(v17 < -16) {
                            if(v16 - 1 < 2) {
                                return e4.n(v15, v17, v16 - 1);
                            }
                            v16 -= 3;
                            long v18 = v15 + 1L;
                            c4 c40 = d4.c;
                            int v19 = c40.f(v15);
                            if(v19 > -65 || v17 == 0xFFFFFFE0 && v19 < 0xFFFFFFA0 || v17 == -19 && v19 >= 0xFFFFFFA0) {
                                break alab1;
                            }
                            v15 += 2L;
                            if(c40.f(v18) <= -65) {
                                continue;
                            }
                            break;
                        }
                        goto label_95;
                    }
                    return -1;
                label_95:
                    if(v16 - 1 < 3) {
                        return e4.n(v15, v17, v16 - 1);
                    }
                    v16 -= 4;
                    c4 c41 = d4.c;
                    int v20 = c41.f(v15);
                    if(v20 > -65 || v20 + 0x70 + (v17 << 28) >> 30 != 0) {
                        break;
                    }
                    long v21 = v15 + 2L;
                    if(c41.f(v15 + 1L) > -65) {
                        break;
                    }
                    v15 += 3L;
                    if(c41.f(v21) <= -65) {
                        goto label_66;
                    }
                    break;
                }
            }
            else {
                if(v4 >= v5) {
                    return v;
                }
                if(((byte)v) >= 0xFFFFFFE0) {
                    if(((byte)v) < -16) {
                        int v6 = (byte)(~(v >> 8));
                        if(v6 == 0) {
                            v6 = d4.c.f(v4);
                            if(v4 + 1L >= v5) {
                                return g4.f(((byte)v), v6);
                            }
                            ++v4;
                        }
                        if(v6 > -65 || ((byte)v) == 0xFFFFFFE0 && v6 < 0xFFFFFFA0 || ((byte)v) == -19 && v6 >= 0xFFFFFFA0 || d4.c.f(v4) > -65) {
                            return -1;
                        }
                    }
                    else {
                        int v7 = (byte)(~(v >> 8));
                        if(v7 == 0) {
                            v7 = d4.c.f(v4);
                            if(v4 + 1L >= v5) {
                                return g4.f(((byte)v), v7);
                            }
                            ++v4;
                            v8 = 0;
                        }
                        else {
                            v8 = (byte)(v >> 16);
                        }
                        if(v8 == 0) {
                            v8 = d4.c.f(v4);
                            if(v4 + 1L >= v5) {
                                return g4.g(((byte)v), v7, v8);
                            }
                            ++v4;
                        }
                        if(v7 > -65 || v7 + 0x70 + (((byte)v) << 28) >> 30 != 0 || v8 > -65 || d4.c.f(v4) > -65) {
                            return -1;
                        }
                    }
                    ++v4;
                    goto label_43;
                }
                else if(((byte)v) >= -62 && d4.c.f(v4) <= -65) {
                    ++v4;
                    goto label_43;
                }
            }
            return -1;
        }
        return e4.m(v, v1, v2, byteBuffer0);
    }

    public final int l(int v, byte[] arr_b, int v1, int v2) {
        int v24;
        int v23;
        int v21;
        int v20;
        long v5;
        int v8;
        int v14;
        int v10;
        int v3 = v1;
        if(this.a != 0) {
            if((v3 | v2 | arr_b.length - v2) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", ((int)arr_b.length), v1, v2));
            }
            long v4 = (long)v3;
            if(v == 0) {
            label_43:
                int v9 = (int)(((long)v2) - v4);
                if(v9 < 16) {
                    v10 = 0;
                }
                else {
                    long v11 = v4;
                    v10 = 0;
                alab1:
                    while(true) {
                        if(v10 >= 8 - (((int)v4) & 7)) {
                            while(v10 + 8 <= v9 && (d4.c.l(arr_b, d4.f + v11) & 0x8080808080808080L) == 0L) {
                                v11 += 8L;
                                v10 += 8;
                            }
                            while(v10 < v9) {
                                if(d4.i(arr_b, v11) < 0) {
                                    break alab1;
                                }
                                ++v10;
                                ++v11;
                            }
                            v10 = v9;
                            break;
                        }
                        if(d4.i(arr_b, v11) < 0) {
                            break;
                        }
                        ++v10;
                        ++v11;
                    }
                }
                int v12 = v9 - v10;
                long v13 = v4 + ((long)v10);
            alab2:
                while(true) {
                    while(true) {
                        v14 = 0;
                        while(v12 > 0) {
                            v14 = d4.i(arr_b, v13);
                            if(v14 >= 0) {
                                --v12;
                                ++v13;
                            }
                            else {
                                ++v13;
                                if(true) {
                                    break;
                                }
                            }
                        }
                        if(v12 == 0) {
                            return 0;
                        }
                        if(v14 < 0xFFFFFFE0) {
                            if(v12 - 1 == 0) {
                                return v14;
                            }
                            v12 -= 2;
                            if(v14 < -62 || d4.i(arr_b, v13) > -65) {
                                break alab2;
                            }
                            ++v13;
                            continue;
                        }
                        if(v14 < -16) {
                            if(v12 - 1 < 2) {
                                return e4.o(v13, arr_b, v14, v12 - 1);
                            }
                            v12 -= 3;
                            long v15 = v13 + 1L;
                            int v16 = d4.i(arr_b, v13);
                            if(v16 > -65 || v14 == 0xFFFFFFE0 && v16 < 0xFFFFFFA0 || v14 == -19 && v16 >= 0xFFFFFFA0) {
                                break alab2;
                            }
                            v13 += 2L;
                            if(d4.i(arr_b, v15) <= -65) {
                                continue;
                            }
                            break;
                        }
                        goto label_95;
                    }
                    return -1;
                label_95:
                    if(v12 - 1 < 3) {
                        return e4.o(v13, arr_b, v14, v12 - 1);
                    }
                    v12 -= 4;
                    int v17 = d4.i(arr_b, v13);
                    if(v17 > -65 || v17 + 0x70 + (v14 << 28) >> 30 != 0) {
                        break;
                    }
                    long v18 = v13 + 2L;
                    if(d4.i(arr_b, v13 + 1L) > -65) {
                        break;
                    }
                    v13 += 3L;
                    if(d4.i(arr_b, v18) > -65) {
                        return -1;
                    }
                }
            }
            else {
                if(v4 >= ((long)v2)) {
                    return v;
                }
                if(((byte)v) >= 0xFFFFFFE0) {
                    if(((byte)v) < -16) {
                        int v6 = (byte)(~(v >> 8));
                        if(v6 == 0) {
                            v6 = d4.i(arr_b, v4);
                            if(v4 + 1L >= ((long)v2)) {
                                return g4.f(((byte)v), v6);
                            }
                            ++v4;
                        }
                        if(v6 <= -65 && (((byte)v) != 0xFFFFFFE0 || v6 >= 0xFFFFFFA0) && (((byte)v) != -19 || v6 < 0xFFFFFFA0)) {
                            v5 = v4 + 1L;
                            if(d4.i(arr_b, v4) > -65) {
                                return -1;
                            }
                            v4 = v5;
                            goto label_43;
                        }
                    }
                    else {
                        int v7 = (byte)(~(v >> 8));
                        if(v7 == 0) {
                            v7 = d4.i(arr_b, v4);
                            if(v4 + 1L >= ((long)v2)) {
                                return g4.f(((byte)v), v7);
                            }
                            ++v4;
                            v8 = 0;
                        }
                        else {
                            v8 = (byte)(v >> 16);
                        }
                        if(v8 == 0) {
                            v8 = d4.i(arr_b, v4);
                            if(v4 + 1L >= ((long)v2)) {
                                return g4.g(((byte)v), v7, v8);
                            }
                            ++v4;
                        }
                        if(v7 > -65 || v7 + 0x70 + (((byte)v) << 28) >> 30 != 0 || v8 > -65 || d4.i(arr_b, v4) > -65) {
                            return -1;
                        }
                        ++v4;
                        goto label_43;
                    }
                }
                else if(((byte)v) >= -62) {
                    v5 = v4 + 1L;
                    if(d4.i(arr_b, v4) <= -65) {
                        v4 = v5;
                        goto label_43;
                    }
                }
            }
            return -1;
        }
        if(v != 0) {
            if(v3 >= v2) {
                return v;
            }
            if(((byte)v) < 0xFFFFFFE0) {
                if(((byte)v) < -62 || arr_b[v3] > -65) {
                    return -1;
                }
                ++v3;
            }
            else if(((byte)v) < -16) {
                int v19 = (byte)(~(v >> 8));
                if(v19 == 0) {
                    v20 = v3 + 1;
                    v21 = arr_b[v3];
                    if(v20 >= v2) {
                        return g4.f(((byte)v), v21);
                    }
                }
                else {
                    v21 = v19;
                    v20 = v3;
                }
                if(v21 > -65 || ((byte)v) == 0xFFFFFFE0 && v21 < 0xFFFFFFA0 || ((byte)v) == -19 && v21 >= 0xFFFFFFA0) {
                    return -1;
                }
                v3 = v20 + 1;
                if(arr_b[v20] > -65) {
                    return -1;
                }
            }
            else {
                int v22 = (byte)(~(v >> 8));
                if(v22 == 0) {
                    v23 = v3 + 1;
                    v22 = arr_b[v3];
                    if(v23 >= v2) {
                        return g4.f(((byte)v), v22);
                    }
                    v24 = 0;
                }
                else {
                    v24 = (byte)(v >> 16);
                    v23 = v3;
                }
                if(v24 == 0) {
                    int v25 = arr_b[v23];
                    if(v23 + 1 >= v2) {
                        return g4.g(((byte)v), v22, v25);
                    }
                    v24 = v25;
                    ++v23;
                }
                if(v22 > -65 || v22 + 0x70 + (((byte)v) << 28) >> 30 != 0 || v24 > -65) {
                    return -1;
                }
                v3 = v23 + 1;
                if(arr_b[v23] > -65) {
                    return -1;
                }
            }
        }
        while(v3 < v2 && arr_b[v3] >= 0) {
            ++v3;
        }
        if(v3 < v2) {
            while(v3 < v2) {
                int v26 = v3 + 1;
                int v27 = arr_b[v3];
                if(v27 < 0) {
                    if(v27 < 0xFFFFFFE0) {
                        if(v26 >= v2) {
                            return v27;
                        }
                        if(v27 >= -62) {
                            v3 += 2;
                            if(arr_b[v26] <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                    else if(v27 < -16) {
                        if(v26 >= v2 - 1) {
                            return g4.a(arr_b, v26, v2);
                        }
                        int v28 = v3 + 2;
                        int v29 = arr_b[v26];
                        if(v29 <= -65 && (v27 != 0xFFFFFFE0 || v29 >= 0xFFFFFFA0) && (v27 != -19 || v29 < 0xFFFFFFA0)) {
                            v3 += 3;
                            if(arr_b[v28] <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                    else {
                        if(v26 >= v2 - 2) {
                            return g4.a(arr_b, v26, v2);
                        }
                        int v30 = arr_b[v26];
                        if(v30 <= -65 && v30 + 0x70 + (v27 << 28) >> 30 == 0) {
                            int v31 = v3 + 3;
                            if(arr_b[v3 + 2] <= -65) {
                                v3 += 4;
                                if(arr_b[v31] <= -65) {
                                    continue;
                                }
                                return -1;
                            }
                        }
                    }
                    return -1;
                }
                v3 = v26;
            }
        }
        return 0;
    }

    public static int m(int v, int v1, int v2, ByteBuffer byteBuffer0) {
        int v8;
        int v7;
        int v5;
        int v4;
        if(v != 0) {
            if(v1 >= v2) {
                return v;
            }
            if(((byte)v) < 0xFFFFFFE0) {
                if(((byte)v) >= -62 && byteBuffer0.get(v1) <= -65) {
                    ++v1;
                    goto label_41;
                }
                return -1;
            }
            else if(((byte)v) < -16) {
                int v3 = (byte)(~(v >> 8));
                if(v3 == 0) {
                    v4 = v1 + 1;
                    v5 = byteBuffer0.get(v1);
                    if(v4 >= v2) {
                        return g4.f(((byte)v), v5);
                    }
                }
                else {
                    v5 = v3;
                    v4 = v1;
                }
                if(v5 > -65 || ((byte)v) == 0xFFFFFFE0 && v5 < 0xFFFFFFA0 || ((byte)v) == -19 && v5 >= 0xFFFFFFA0) {
                    return -1;
                }
                v1 = v4 + 1;
                if(byteBuffer0.get(v4) > -65) {
                    return -1;
                }
            }
            else {
                int v6 = (byte)(~(v >> 8));
                if(v6 == 0) {
                    v7 = v1 + 1;
                    v6 = byteBuffer0.get(v1);
                    if(v7 >= v2) {
                        return g4.f(((byte)v), v6);
                    }
                    v8 = 0;
                }
                else {
                    v8 = (byte)(v >> 16);
                    v7 = v1;
                }
                if(v8 == 0) {
                    int v9 = byteBuffer0.get(v7);
                    if(v7 + 1 >= v2) {
                        return g4.g(((byte)v), v6, v9);
                    }
                    v8 = v9;
                    ++v7;
                }
                if(v6 > -65 || v6 + 0x70 + (((byte)v) << 28) >> 30 != 0 || v8 > -65) {
                    return -1;
                }
                v1 = v7 + 1;
                if(byteBuffer0.get(v7) > -65) {
                    return -1;
                }
            }
        }
    label_41:
        int v10;
        for(v10 = v1; v10 < v2 - 7 && (byteBuffer0.getLong(v10) & 0x8080808080808080L) == 0L; v10 += 8) {
        }
        int v11 = v10;
        while(v11 < v2) {
            int v12 = byteBuffer0.get(v11);
            if(v12 < 0) {
                if(v12 < 0xFFFFFFE0) {
                    if(v11 + 1 >= v2) {
                        return v12;
                    }
                    if(v12 >= -62 && byteBuffer0.get(v11 + 1) <= -65) {
                        v11 += 2;
                        continue;
                    }
                }
                else if(v12 < -16) {
                    if(v11 + 1 >= v2 - 1) {
                        return g4.b(v12, v11 + 1, v2 - (v11 + 1), byteBuffer0);
                    }
                    int v13 = byteBuffer0.get(v11 + 1);
                    if(v13 <= -65 && (v12 != 0xFFFFFFE0 || v13 >= 0xFFFFFFA0) && (v12 != -19 || v13 < 0xFFFFFFA0) && byteBuffer0.get(v11 + 2) <= -65) {
                        v11 += 3;
                        continue;
                    }
                }
                else {
                    if(v11 + 1 >= v2 - 2) {
                        return g4.b(v12, v11 + 1, v2 - (v11 + 1), byteBuffer0);
                    }
                    int v14 = byteBuffer0.get(v11 + 1);
                    if(v14 <= -65 && v14 + 0x70 + (v12 << 28) >> 30 == 0) {
                        int v15 = v11 + 3;
                        if(byteBuffer0.get(v11 + 2) <= -65) {
                            v11 += 4;
                            if(byteBuffer0.get(v15) <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                }
                return -1;
            }
            ++v11;
        }
        return 0;
    }

    public static int n(long v, int v1, int v2) {
        switch(v2) {
            case 0: {
                return v1 <= -12 ? v1 : -1;
            }
            case 1: {
                return g4.f(v1, d4.c.f(v));
            }
            case 2: {
                return g4.g(v1, d4.c.f(v), d4.c.f(v + 1L));
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static int o(long v, byte[] arr_b, int v1, int v2) {
        switch(v2) {
            case 0: {
                return v1 <= -12 ? v1 : -1;
            }
            case 1: {
                return g4.f(v1, d4.i(arr_b, v));
            }
            case 2: {
                return g4.g(v1, d4.i(arr_b, v), d4.i(arr_b, v + 1L));
            }
            default: {
                throw new AssertionError();
            }
        }
    }
}

