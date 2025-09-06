package com.google.android.gms.common.api.internal;

public final class m0 extends ThreadLocal {
    public final int a;

    public m0(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object initialValue() {
        return this.a != 0 ? 0L : false;
    }
}

