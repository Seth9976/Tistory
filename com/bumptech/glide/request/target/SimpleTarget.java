package com.bumptech.glide.request.target;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.Util;

@Deprecated
public abstract class SimpleTarget extends BaseTarget {
    public final int b;
    public final int c;

    public SimpleTarget() {
        this(0x80000000, 0x80000000);
    }

    public SimpleTarget(int v, int v1) {
        this.b = v;
        this.c = v1;
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback0) {
        int v = this.b;
        int v1 = this.c;
        if(!Util.isValidDimensions(v, v1)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + v + " and height: " + v1 + ", either provide dimensions in the constructor or call override()");
        }
        sizeReadyCallback0.onSizeReady(v, v1);
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback0) {
    }
}

