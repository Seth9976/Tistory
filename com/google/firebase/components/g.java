package com.google.firebase.components;

public final class g {
    public final Class a;
    public final boolean b;

    public g(Class class0, boolean z) {
        this.a = class0;
        this.b = z;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof g && ((g)object0).a.equals(this.a) && ((g)object0).b == this.b;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
    }
}

