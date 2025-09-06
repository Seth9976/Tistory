package com.google.android.datatransport.runtime.scheduling.persistence;

public final class a extends c {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public a(long v, int v1, int v2, long v3, int v4) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof c && (this.b == ((a)(((c)object0))).b && this.c == ((a)(((c)object0))).c && this.d == ((a)(((c)object0))).d && this.e == ((a)(((c)object0))).e && this.f == ((a)(((c)object0))).f);
    }

    @Override
    public final int hashCode() {
        return ((((((int)(this.b ^ this.b >>> 0x20)) ^ 1000003) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e >>> 0x20 ^ this.e))) * 1000003 ^ this.f;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", loadBatchSize=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", criticalSectionEnterTimeoutMs=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", eventCleanUpAge=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", maxBlobByteSizePerRow=");
        return wb.a.c(this.f, "}", stringBuilder0);
    }
}

