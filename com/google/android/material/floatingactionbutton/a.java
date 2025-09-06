package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;

public final class a extends Property {
    public final b a;

    public a(b b0) {
        this.a = b0;
        super(Float.class, "LABEL_OPACITY_PROPERTY");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        int v = Color.alpha(((ExtendedFloatingActionButton)object0).originalTextCsl.getColorForState(((ExtendedFloatingActionButton)object0).getDrawableState(), this.a.b.originalTextCsl.getDefaultColor()));
        return AnimationUtils.lerp(0.0f, 1.0f, ((float)Color.alpha(((ExtendedFloatingActionButton)object0).getCurrentTextColor())) / 255.0f / ((float)v));
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        int v = ((ExtendedFloatingActionButton)object0).originalTextCsl.getColorForState(((ExtendedFloatingActionButton)object0).getDrawableState(), this.a.b.originalTextCsl.getDefaultColor());
        ColorStateList colorStateList0 = ColorStateList.valueOf(Color.argb(((int)(AnimationUtils.lerp(0.0f, ((float)Color.alpha(v)) / 255.0f, ((float)(((Float)object1)))) * 255.0f)), Color.red(v), Color.green(v), Color.blue(v)));
        if(((float)(((Float)object1))) == 1.0f) {
            ((ExtendedFloatingActionButton)object0).silentlyUpdateTextColor(((ExtendedFloatingActionButton)object0).originalTextCsl);
            return;
        }
        ((ExtendedFloatingActionButton)object0).silentlyUpdateTextColor(colorStateList0);
    }
}

