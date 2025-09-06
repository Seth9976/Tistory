package androidx.emoji2.text.flatbuffer;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FlexBuffersBuilder {
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    public final ReadWriteBuf a;
    public final ArrayList b;
    public final HashMap c;
    public final HashMap d;
    public final int e;
    public final c f;

    public FlexBuffersBuilder() {
        this(0x100);
    }

    public FlexBuffersBuilder(int v) {
        this(new ArrayReadWriteBuf(v), 1);
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf0, int v) {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = new c(this);
        this.a = readWriteBuf0;
        this.e = v;
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer0) {
        this(byteBuffer0, 1);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer0, int v) {
        this(new ArrayReadWriteBuf(byteBuffer0.array()), v);
    }

    public final int a(int v) {
        ReadWriteBuf readWriteBuf0 = this.a;
        for(int v1 = (1 << v) - 1 & -readWriteBuf0.writePosition(); v1 != 0; --v1) {
            readWriteBuf0.put(0);
        }
        return 1 << v;
    }

    public final d b(int v, int v1, int v2, boolean z, boolean z1, d d0) {
        ArrayList arrayList0;
        int v5;
        int v3 = Math.max(0, FlexBuffersBuilder.e(v2));
        ReadWriteBuf readWriteBuf0 = this.a;
        if(d0 == null) {
            v5 = 1;
        }
        else {
            int v4 = readWriteBuf0.writePosition();
            v3 = Math.max(v3, d.a(d0.a, d0.b, v4, 0, d0.d));
            v5 = 3;
        }
        int v6 = v3;
        int v7 = 4;
        for(int v8 = v1; true; ++v8) {
            arrayList0 = this.b;
            if(v8 >= arrayList0.size()) {
                break;
            }
            d d1 = (d)arrayList0.get(v8);
            int v9 = readWriteBuf0.writePosition();
            v6 = Math.max(v6, d.a(d1.a, d1.b, v9, v8 + v5, d1.d));
            if(z && v8 == v1) {
                v7 = ((d)arrayList0.get(v8)).a;
                if((v7 < 1 || v7 > 4) && v7 != 26) {
                    throw new FlexBufferException("TypedVector does not support this element type");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        int v10 = this.a(v6);
        if(d0 != null) {
            this.h(v10, ((long)(((int)(((long)readWriteBuf0.writePosition()) - d0.d)))));
            this.h(v10, 1L << d0.b);
        }
        if(!z1) {
            this.h(v10, ((long)v2));
        }
        int v11 = readWriteBuf0.writePosition();
        for(int v12 = v1; v12 < arrayList0.size(); ++v12) {
            this.f(((d)arrayList0.get(v12)), v10);
        }
        if(!z) {
            for(int v13 = v1; v13 < arrayList0.size(); ++v13) {
                d d2 = (d)arrayList0.get(v13);
                d2.getClass();
                readWriteBuf0.put(((byte)((d2.a > 3 && d2.a != 26 ? Math.max(d2.b, v6) : d2.b) | d2.a << 2)));
            }
        }
        if(d0 != null) {
            return new d(v, 9, v6, ((long)v11));
        }
        if(z) {
            if(!z1) {
                v2 = 0;
            }
            return new d(v, FlexBuffers.e(v7, v2), v6, ((long)v11));
        }
        return new d(v, 10, v6, ((long)v11));
    }

    public final int c(String s) {
        if(s == null) {
            return -1;
        }
        ReadWriteBuf readWriteBuf0 = this.a;
        int v = readWriteBuf0.writePosition();
        HashMap hashMap0 = this.c;
        if((this.e & 1) != 0) {
            Integer integer0 = (Integer)hashMap0.get(s);
            if(integer0 == null) {
                byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
                readWriteBuf0.put(arr_b, 0, arr_b.length);
                readWriteBuf0.put(0);
                hashMap0.put(s, v);
                return v;
            }
            return (int)integer0;
        }
        byte[] arr_b1 = s.getBytes(StandardCharsets.UTF_8);
        readWriteBuf0.put(arr_b1, 0, arr_b1.length);
        readWriteBuf0.put(0);
        hashMap0.put(s, v);
        return v;
    }

    public final void d(long v) {
        d d0;
        int v1 = FlexBuffersBuilder.e(v);
        if(v1 == 0) {
            d0 = new d(-1, 2, 0, ((long)(((int)v))));
        }
        else {
            switch(v1) {
                case 1: {
                    d0 = new d(-1, 2, 1, ((long)(((int)v))));
                    break;
                }
                case 2: {
                    d0 = new d(-1, 2, 2, ((long)(((int)v))));
                    break;
                }
                default: {
                    d0 = new d(-1, 2, 3, v);
                }
            }
        }
        this.b.add(d0);
    }

    public static int e(long v) {
        if(v <= 0xFFL) {
            return 0;
        }
        if(v <= 0xFFFFL) {
            return 1;
        }
        return v > 0xFFFFFFFFL ? 3 : 2;
    }

    public int endMap(String s, int v) {
        ReadWriteBuf readWriteBuf0;
        int v1 = this.c(s);
        ArrayList arrayList0 = this.b;
        Collections.sort(arrayList0.subList(v, arrayList0.size()), this.f);
        long v2 = (long)(arrayList0.size() - v);
        int v3 = Math.max(0, FlexBuffersBuilder.e(v2));
        int v4 = v;
        while(true) {
            readWriteBuf0 = this.a;
            if(v4 >= arrayList0.size()) {
                break;
            }
            long v5 = (long)((d)arrayList0.get(v4)).e;
            ++v4;
            v3 = Math.max(v3, d.a(4, 0, readWriteBuf0.writePosition(), v4, v5));
        }
        int v6 = this.a(v3);
        this.h(v6, v2);
        int v7 = readWriteBuf0.writePosition();
        for(int v8 = v; v8 < arrayList0.size(); ++v8) {
            d d0 = (d)arrayList0.get(v8);
            long v9 = (long)((d)arrayList0.get(v8)).e;
            this.h(v6, ((long)(((int)(((long)readWriteBuf0.writePosition()) - v9)))));
        }
        d d1 = this.b(v1, v, arrayList0.size() - v, false, false, new d(-1, 14, v3, ((long)v7)));
        while(arrayList0.size() > v) {
            arrayList0.remove(arrayList0.size() - 1);
        }
        arrayList0.add(d1);
        return (int)d1.d;
    }

    public int endVector(String s, int v, boolean z, boolean z1) {
        int v1 = this.c(s);
        ArrayList arrayList0 = this.b;
        d d0 = this.b(v1, v, arrayList0.size() - v, z, z1, null);
        while(arrayList0.size() > v) {
            arrayList0.remove(arrayList0.size() - 1);
        }
        arrayList0.add(d0);
        return (int)d0.d;
    }

    public final void f(d d0, int v) {
        double f;
        int v1 = d0.a;
        long v2 = d0.d;
        if(v1 == 0 || v1 == 1 || v1 == 2) {
            this.h(v, v2);
        }
        else {
            ReadWriteBuf readWriteBuf0 = this.a;
            switch(v1) {
                case 3: {
                    f = d0.c;
                    if(v == 4) {
                        readWriteBuf0.putFloat(((float)f));
                        return;
                    }
                    break;
                }
                case 26: {
                    this.h(v, v2);
                    return;
                }
                default: {
                    this.h(v, ((long)(((int)(((long)readWriteBuf0.writePosition()) - v2)))));
                    return;
                }
            }
            if(v == 8) {
                readWriteBuf0.putDouble(f);
            }
        }
    }

    public ByteBuffer finish() {
        d d0 = (d)this.b.get(0);
        int v = this.a.writePosition();
        int v1 = this.a(d.a(d0.a, d0.b, v, 0, d0.d));
        this.f(((d)this.b.get(0)), v1);
        d d1 = (d)this.b.get(0);
        d1.getClass();
        this.a.put(((byte)((d1.a > 3 && d1.a != 26 ? Math.max(d1.b, 0) : d1.b) | d1.a << 2)));
        this.a.put(((byte)v1));
        return ByteBuffer.wrap(this.a.data(), 0, this.a.writePosition());
    }

    public final d g(byte[] arr_b, int v, int v1, boolean z) {
        int v2 = FlexBuffersBuilder.e(arr_b.length);
        this.h(this.a(v2), ((long)arr_b.length));
        ReadWriteBuf readWriteBuf0 = this.a;
        int v3 = readWriteBuf0.writePosition();
        readWriteBuf0.put(arr_b, 0, arr_b.length);
        if(z) {
            readWriteBuf0.put(0);
        }
        return new d(v, v1, v2, ((long)v3));
    }

    public ReadWriteBuf getBuffer() {
        return this.a;
    }

    public final void h(int v, long v1) {
        ReadWriteBuf readWriteBuf0 = this.a;
        switch(v) {
            case 1: {
                readWriteBuf0.put(((byte)(((int)v1))));
                return;
            }
            case 2: {
                readWriteBuf0.putShort(((short)(((int)v1))));
                return;
            }
            case 4: {
                readWriteBuf0.putInt(((int)v1));
                return;
            }
            case 8: {
                readWriteBuf0.putLong(v1);
            }
        }
    }

    public int putBlob(String s, byte[] arr_b) {
        d d0 = this.g(arr_b, this.c(s), 25, false);
        this.b.add(d0);
        return (int)d0.d;
    }

    public int putBlob(byte[] arr_b) {
        return this.putBlob(null, arr_b);
    }

    public void putBoolean(String s, boolean z) {
        int v = this.c(s);
        this.b.add(new d(v, 26, 0, (z ? 1L : 0L)));
    }

    public void putBoolean(boolean z) {
        this.putBoolean(null, z);
    }

    public void putFloat(double f) {
        this.putFloat(null, f);
    }

    public void putFloat(float f) {
        this.putFloat(null, f);
    }

    public void putFloat(String s, double f) {
        d d0 = new d(this.c(s), 3, f);
        this.b.add(d0);
    }

    public void putFloat(String s, float f) {
        d d0 = new d(this.c(s), 2, ((double)f));
        this.b.add(d0);
    }

    public void putInt(int v) {
        this.putInt(null, v);
    }

    public void putInt(long v) {
        this.putInt(null, v);
    }

    public void putInt(String s, int v) {
        this.putInt(s, ((long)v));
    }

    public void putInt(String s, long v) {
        int v1 = this.c(s);
        ArrayList arrayList0 = this.b;
        if(Long.compare(0xFFFFFFFFFFFFFF80L, v) <= 0 && v <= 0x7FL) {
            arrayList0.add(new d(v1, 1, 0, ((long)(((int)v)))));
            return;
        }
        if(0xFFFFFFFFFFFF8000L <= v && v <= 0x7FFFL) {
            arrayList0.add(new d(v1, 1, 1, ((long)(((int)v)))));
            return;
        }
        if(0xFFFFFFFF80000000L <= v && v <= 0x7FFFFFFFL) {
            arrayList0.add(new d(v1, 1, 2, ((long)(((int)v)))));
            return;
        }
        arrayList0.add(new d(v1, 1, 3, v));
    }

    public int putString(String s) {
        return this.putString(null, s);
    }

    public int putString(String s, String s1) {
        int v = this.c(s);
        ArrayList arrayList0 = this.b;
        if((this.e & 2) != 0) {
            HashMap hashMap0 = this.d;
            Object object0 = hashMap0.get(s1);
            if(((Integer)object0) == null) {
                d d0 = this.g(s1.getBytes(StandardCharsets.UTF_8), v, 5, true);
                hashMap0.put(s1, ((int)d0.d));
                arrayList0.add(d0);
                return (int)d0.d;
            }
            arrayList0.add(new d(v, 5, FlexBuffersBuilder.e(s1.length()), ((long)(((int)(((Integer)object0)))))));
            return (int)(((Integer)object0));
        }
        d d1 = this.g(s1.getBytes(StandardCharsets.UTF_8), v, 5, true);
        arrayList0.add(d1);
        return (int)d1.d;
    }

    public void putUInt(int v) {
        this.d(((long)v));
    }

    public void putUInt(long v) {
        this.d(v);
    }

    public void putUInt64(BigInteger bigInteger0) {
        d d0 = new d(-1, 2, 3, bigInteger0.longValue());
        this.b.add(d0);
    }

    public int startMap() {
        return this.b.size();
    }

    public int startVector() {
        return this.b.size();
    }
}

