package androidx.emoji2.text.flatbuffer;

public final class d {
    public final int a;
    public final int b;
    public final double c;
    public final long d;
    public final int e;

    public d(int v, int v1, double f) {
        this.e = v;
        this.a = 3;
        this.b = v1;
        this.c = f;
        this.d = 0x8000000000000000L;
    }

    public d(int v, int v1, int v2, long v3) {
        this.e = v;
        this.a = v1;
        this.b = v2;
        this.d = v3;
        this.c = 4.900000E-324;
    }

    public static int a(int v, int v1, int v2, int v3, long v4) {
        if(v > 3 && v != 26) {
            for(int v5 = 1; v5 <= 0x20; v5 *= 2) {
                int v6 = FlexBuffersBuilder.e(((int)(((long)(v3 * v5 + ((-v2 & v5 - 1) + v2))) - v4)));
                if(1L << v6 == ((long)v5)) {
                    return v6;
                }
            }
            return 3;
        }
        return v1;
    }
}

