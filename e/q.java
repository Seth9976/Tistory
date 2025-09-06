package e;

import kotlin.jvm.internal.Intrinsics;
import wb.a;

public final class q {
    public final long a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;

    public q(long v, String s, int v1, long v2, String s1) {
        Intrinsics.checkNotNullParameter(s, "uri");
        Intrinsics.checkNotNullParameter(s1, "json");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(this.a != ((q)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((q)object0).b)) {
            return false;
        }
        if(this.c != ((q)object0).c) {
            return false;
        }
        return this.d == ((q)object0).d ? Intrinsics.areEqual(this.e, ((q)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + a.k(this.d, r0.a.c(this.c, kotlin.text.q.c(Long.hashCode(this.a) * 0x1F, 0x1F, this.b), 0x1F), 0x1F);
    }

    @Override
    public final String toString() {
        return "HistoryEntity(id=" + this.a + ", uri=" + this.b + ", step=" + this.c + ", lastUpdatedTime=" + this.d + ", json=" + this.e + ")";
    }
}

