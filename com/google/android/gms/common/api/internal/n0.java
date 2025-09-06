package com.google.android.gms.common.api.internal;

public final class n0 {
    public final BasePendingResult a;

    public n0(BasePendingResult basePendingResult0) {
        this.a = basePendingResult0;
    }

    @Override
    public final void finalize() {
        BasePendingResult.zal(this.a.f);
        super.finalize();
    }
}

