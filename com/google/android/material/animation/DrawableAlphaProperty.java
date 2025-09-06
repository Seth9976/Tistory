package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

public class DrawableAlphaProperty extends Property {
    public static final Property DRAWABLE_ALPHA_COMPAT;

    static {
        DrawableAlphaProperty drawableAlphaProperty0 = new DrawableAlphaProperty(Integer.class, "drawableAlphaCompat");  // 初始化器: Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V
        new WeakHashMap();
        DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT = drawableAlphaProperty0;
    }

    @Nullable
    public Integer get(@NonNull Drawable drawable0) {
        return drawable0.getAlpha();
    }

    @Override  // android.util.Property
    @Nullable
    public Object get(@NonNull Object object0) {
        return this.get(((Drawable)object0));
    }

    public void set(@NonNull Drawable drawable0, @NonNull Integer integer0) {
        drawable0.setAlpha(((int)integer0));
    }

    @Override  // android.util.Property
    public void set(@NonNull Object object0, @NonNull Object object1) {
        this.set(((Drawable)object0), ((Integer)object1));
    }
}

