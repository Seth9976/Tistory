package e4;

public final class f {
    public final long a;
    public final long b;

    public f(double f) {
        this(((long)(f * 10000.0)), 10000L);
    }

    public f(long v, long v1) {
        if(v1 == 0L) {
            this.a = 0L;
            this.b = 1L;
            return;
        }
        this.a = v;
        this.b = v1;
    }

    @Override
    public final String toString() {
        return this.a + "/" + this.b;
    }
}

