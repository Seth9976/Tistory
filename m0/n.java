package m0;

import a5.b;
import r0.a;

public final class n {
    public int a;
    public int b;
    public int c;
    public int d;

    public n(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(this.a != ((n)object0).a) {
            return false;
        }
        if(this.b != ((n)object0).b) {
            return false;
        }
        return this.c == ((n)object0).c ? this.d == ((n)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return this.d + a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Change(preStart=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", preEnd=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", originalStart=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", originalEnd=");
        return b.p(stringBuilder0, this.d, ')');
    }
}

