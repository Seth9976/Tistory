package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;

public final class j extends ViewOutlineProvider {
    public final int a;
    public final Object b;

    public j(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.ViewOutlineProvider
    public final void getOutline(View view0, Outline outline0) {
        switch(this.a) {
            case 0: {
                k k0 = (k)this.b;
                if(k0.c != null && !k0.d.isEmpty()) {
                    outline0.setRoundRect(((int)k0.d.left), ((int)k0.d.top), ((int)k0.d.right), ((int)k0.d.bottom), k0.g);
                }
                return;
            }
            case 1: {
                l l0 = (l)this.b;
                if(!l0.e.isEmpty()) {
                    outline0.setPath(l0.e);
                }
                return;
            }
            default: {
                ChipDrawable chipDrawable0 = ((Chip)this.b).e;
                if(chipDrawable0 != null) {
                    chipDrawable0.getOutline(outline0);
                    return;
                }
                outline0.setAlpha(0.0f);
            }
        }
    }
}

