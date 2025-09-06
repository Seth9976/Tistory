package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;

public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState a;
    public final int b;
    public final int c;

    public c(Drawable.ConstantState drawable$ConstantState0, int v, int v1) {
        this.a = drawable$ConstantState0;
        this.b = v;
        this.c = v1;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        return new FixedSizeDrawable(this, this.a.newDrawable());
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        return new FixedSizeDrawable(this, this.a.newDrawable(resources0));
    }
}

