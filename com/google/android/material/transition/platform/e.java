package com.google.android.material.transition.platform;

import android.graphics.Path;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

public final class e {
    public final Path a;
    public final Path b;
    public final Path c;
    public final ShapeAppearancePathProvider d;
    public ShapeAppearanceModel e;

    public e() {
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
        this.d = ShapeAppearancePathProvider.getInstance();
    }
}

