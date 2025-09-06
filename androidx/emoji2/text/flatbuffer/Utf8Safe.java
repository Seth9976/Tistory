package androidx.emoji2.text.flatbuffer;

import g.a;
import java.nio.ByteBuffer;

public final class Utf8Safe extends Utf8 {
    // 去混淆评级： 低(20)
    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer0, int v, int v1) throws IllegalArgumentException {
        return byteBuffer0.hasArray() ? Utf8Safe.decodeUtf8Array(byteBuffer0.array(), byteBuffer0.arrayOffset() + v, v1) : Utf8Safe.decodeUtf8Buffer(byteBuffer0, v, v1);
    }

    public static String decodeUtf8Array(byte[] arr_b, int v, int v1) {
        if((v | v1 | arr_b.length - v - v1) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v, v1));
        }
        int v2 = v + v1;
        char[] arr_c = new char[v1];
        int v3;
        for(v3 = 0; v < v2; ++v3) {
            int v4 = arr_b[v];
            if(!a.K(((byte)v4))) {
                break;
            }
            ++v;
            arr_c[v3] = (char)v4;
        }
        int v5 = v3;
        while(v < v2) {
            int v6 = v + 1;
            int v7 = arr_b[v];
            if(a.K(((byte)v7))) {
                int v8 = v5 + 1;
                arr_c[v5] = (char)v7;
                while(v6 < v2) {
                    int v9 = arr_b[v6];
                    if(!a.K(((byte)v9))) {
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
                    a.F(((byte)v7), arr_b[v6], arr_c, v5);
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
                    a.D(((byte)v7), ((byte)v11), ((byte)v13), arr_b[v12], arr_c, v5);
                    v5 += 2;
                    continue;
                }
            }
            else if(v6 < v2 - 1) {
                int v10 = v + 2;
                v += 3;
                a.E(((byte)v7), arr_b[v6], arr_b[v10], arr_c, v5);
                ++v5;
                continue;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        return new String(arr_c, 0, v5);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer0, int v, int v1) {
        if((v | v1 | byteBuffer0.limit() - v - v1) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v, v1));
        }
        int v2 = v + v1;
        char[] arr_c = new char[v1];
        int v3;
        for(v3 = 0; v < v2; ++v3) {
            int v4 = byteBuffer0.get(v);
            if(!a.K(((byte)v4))) {
                break;
            }
            ++v;
            arr_c[v3] = (char)v4;
        }
        int v5 = v3;
        while(v < v2) {
            int v6 = v + 1;
            int v7 = byteBuffer0.get(v);
            if(a.K(((byte)v7))) {
                int v8 = v5 + 1;
                arr_c[v5] = (char)v7;
                while(v6 < v2) {
                    int v9 = byteBuffer0.get(v6);
                    if(!a.K(((byte)v9))) {
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
                    a.F(((byte)v7), byteBuffer0.get(v6), arr_c, v5);
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
                    a.D(((byte)v7), ((byte)v11), ((byte)v13), byteBuffer0.get(v12), arr_c, v5);
                    v5 += 2;
                    continue;
                }
            }
            else if(v6 < v2 - 1) {
                int v10 = v + 2;
                v += 3;
                a.E(((byte)v7), byteBuffer0.get(v6), byteBuffer0.get(v10), arr_c, v5);
                ++v5;
                continue;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        return new String(arr_c, 0, v5);
    }

    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        int v20;
        int v21;
        int v7;
        int v = 0;
        if(byteBuffer0.hasArray()) {
            int v1 = byteBuffer0.arrayOffset();
            byte[] arr_b = byteBuffer0.array();
            int v2 = byteBuffer0.position() + v1;
            int v3 = charSequence0.length();
            int v4 = byteBuffer0.remaining() + v2;
            while(v < v3) {
                int v5 = v + v2;
                if(v5 >= v4) {
                    break;
                }
                int v6 = charSequence0.charAt(v);
                if(v6 >= 0x80) {
                    break;
                }
                arr_b[v5] = (byte)v6;
                ++v;
            }
            if(v == v3) {
                v7 = v2 + v3;
            }
            else {
                v7 = v2 + v;
                while(v < v3) {
                    int v8 = charSequence0.charAt(v);
                    if(v8 < 0x80 && v7 < v4) {
                        arr_b[v7] = (byte)v8;
                        ++v7;
                    }
                    else if(v8 < 0x800 && v7 <= v4 - 2) {
                        int v9 = v7 + 1;
                        arr_b[v7] = (byte)(v8 >>> 6 | 960);
                        v7 += 2;
                        arr_b[v9] = (byte)(v8 & 0x3F | 0x80);
                    }
                    else if(v8 >= 0xD800 && 0xDFFF >= v8 || v7 > v4 - 3) {
                        if(v7 > v4 - 4) {
                            goto label_54;
                        }
                        if(v + 1 == charSequence0.length()) {
                            throw new h(v - 1, v3);
                        }
                        int v11 = charSequence0.charAt(v + 1);
                        if(!Character.isSurrogatePair(((char)v8), ((char)v11))) {
                            goto label_52;
                        }
                        int v12 = Character.toCodePoint(((char)v8), ((char)v11));
                        arr_b[v7] = (byte)(v12 >>> 18 | 0xF0);
                        arr_b[v7 + 1] = (byte)(v12 >>> 12 & 0x3F | 0x80);
                        int v13 = v7 + 3;
                        arr_b[v7 + 2] = (byte)(v12 >>> 6 & 0x3F | 0x80);
                        v7 += 4;
                        arr_b[v13] = (byte)(v12 & 0x3F | 0x80);
                        ++v;
                    }
                    else {
                        arr_b[v7] = (byte)(v8 >>> 12 | 480);
                        int v10 = v7 + 2;
                        arr_b[v7 + 1] = (byte)(v8 >>> 6 & 0x3F | 0x80);
                        v7 += 3;
                        arr_b[v10] = (byte)(v8 & 0x3F | 0x80);
                    }
                    ++v;
                    continue;
                label_52:
                    ++v;
                    throw new h(v - 1, v3);
                label_54:
                    if(0xD800 > v8 || v8 > 0xDFFF || v + 1 != charSequence0.length() && Character.isSurrogatePair(((char)v8), charSequence0.charAt(v + 1))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v8) + " at index " + v7);
                    }
                    throw new h(v, v3);
                }
            }
            byteBuffer0.position(v7 - v1);
            return;
        }
        int v14 = charSequence0.length();
        int v15 = byteBuffer0.position();
        try {
            while(v < v14) {
                int v16 = charSequence0.charAt(v);
                if(v16 >= 0x80) {
                    break;
                }
                byteBuffer0.put(v15 + v, ((byte)v16));
                ++v;
            }
            if(v == v14) {
                byteBuffer0.position(v15 + v);
                return;
            }
            v15 += v;
            while(true) {
                if(v >= v14) {
                    byteBuffer0.position(v15);
                    return;
                }
                int v17 = charSequence0.charAt(v);
                if(v17 < 0x80) {
                    byteBuffer0.put(v15, ((byte)v17));
                }
                else if(v17 < 0x800) {
                    try {
                        byteBuffer0.put(v15, ((byte)(v17 >>> 6 | 0xC0)));
                        byteBuffer0.put(v15 + 1, ((byte)(v17 & 0x3F | 0x80)));
                        ++v15;
                    }
                    catch(IndexOutOfBoundsException unused_ex) {
                        ++v15;
                        break;
                    }
                }
                else if(v17 < 0xD800 || 0xDFFF < v17) {
                    try {
                        v21 = v15 + 1;
                        byteBuffer0.put(v15, ((byte)(v17 >>> 12 | 0xE0)));
                        v15 += 2;
                    }
                    catch(IndexOutOfBoundsException unused_ex) {
                        v15 = v21;
                        break;
                    }
                    byteBuffer0.put(v21, ((byte)(v17 >>> 6 & 0x3F | 0x80)));
                    byteBuffer0.put(v15, ((byte)(v17 & 0x3F | 0x80)));
                }
                else {
                    if(v + 1 == v14) {
                        throw new h(v, v14);
                    }
                    try {
                        int v18 = charSequence0.charAt(v + 1);
                        if(Character.isSurrogatePair(((char)v17), ((char)v18))) {
                            int v19 = Character.toCodePoint(((char)v17), ((char)v18));
                            try {
                                byteBuffer0.put(v15, ((byte)(v19 >>> 18 | 0xF0)));
                                v20 = v15 + 2;
                            }
                            catch(IndexOutOfBoundsException unused_ex) {
                                ++v15;
                                goto label_107;
                            }
                            try {
                                byteBuffer0.put(v15 + 1, ((byte)(v19 >>> 12 & 0x3F | 0x80)));
                                v15 += 3;
                            }
                            catch(IndexOutOfBoundsException unused_ex) {
                                ++v;
                                v15 = v20;
                                break;
                            }
                            byteBuffer0.put(v20, ((byte)(v19 >>> 6 & 0x3F | 0x80)));
                            byteBuffer0.put(v15, ((byte)(v19 & 0x3F | 0x80)));
                            ++v;
                            goto label_118;
                        }
                        else {
                            ++v;
                        }
                        throw new h(v, v14);
                    }
                    catch(IndexOutOfBoundsException unused_ex) {
                    }
                label_107:
                    ++v;
                    break;
                }
            label_118:
                ++v;
                ++v15;
            }
        }
        catch(IndexOutOfBoundsException unused_ex) {
        }
        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v) + " at index " + (Math.max(v, v15 - byteBuffer0.position() + 1) + byteBuffer0.position()));
    }

    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v && charSequence0.charAt(v2) < 0x80; ++v2) {
        }
        int v3 = v;
        while(v2 < v) {
            int v4 = charSequence0.charAt(v2);
            if(v4 < 0x800) {
                v3 += 0x7F - v4 >>> 0x1F;
                ++v2;
            }
            else {
                int v5 = charSequence0.length();
                while(v2 < v5) {
                    int v6 = charSequence0.charAt(v2);
                    if(v6 < 0x800) {
                        v1 += 0x7F - v6 >>> 0x1F;
                    }
                    else {
                        v1 += 2;
                        if(0xD800 <= v6 && v6 <= 0xDFFF) {
                            if(Character.codePointAt(charSequence0, v2) < 0x10000) {
                                throw new h(v2, v5);
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
}

