package com.google.android.material.button;

import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;

public final class e {
    public final CornerSize a;
    public final CornerSize b;
    public final CornerSize c;
    public final CornerSize d;
    public static final AbsoluteCornerSize e;

    static {
        e.e = new AbsoluteCornerSize(0.0f);
    }

    public e(CornerSize cornerSize0, CornerSize cornerSize1, CornerSize cornerSize2, CornerSize cornerSize3) {
        this.a = cornerSize0;
        this.b = cornerSize2;
        this.c = cornerSize3;
        this.d = cornerSize1;
    }
}

