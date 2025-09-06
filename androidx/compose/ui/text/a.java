package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public a(Object object0, int v, int v1, String s) {
        this.a = object0;
        this.b = v;
        this.c = v1;
        this.d = s;
    }

    public a(String s, int v, int v1, int v2, Object object0) {
        if((v2 & 4) != 0) {
            v1 = 0x80000000;
        }
        if((v2 & 8) != 0) {
            s = "";
        }
        this(object0, v, v1, s);
    }

    public final Range a(int v) {
        int v1 = this.c;
        if(v1 != 0x80000000) {
            v = v1;
        }
        if(v == 0x80000000) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new Range(this.a, this.b, v, this.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((a)object0).a)) {
            return false;
        }
        if(this.b != ((a)object0).b) {
            return false;
        }
        return this.c == ((a)object0).c ? Intrinsics.areEqual(this.d, ((a)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.d.hashCode() + r0.a.c(this.c, r0.a.c(this.b, 0, 0x1F), 0x1F) : this.d.hashCode() + r0.a.c(this.c, r0.a.c(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MutableRange(item=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", start=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", end=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", tag=");
        return wb.a.b(')', this.d, stringBuilder0);
    }
}

