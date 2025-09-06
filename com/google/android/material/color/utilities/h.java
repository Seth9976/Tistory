package com.google.android.material.color.utilities;

import java.util.function.Function;

public final class h implements Function {
    public final int a;

    public h(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object apply(Object object0) {
        if(this.a != 0) {
            return ((DynamicScheme)object0).isDark ? 80.0 : 30.0;
        }
        if(MaterialDynamicColors.b(((DynamicScheme)object0))) {
            return ((DynamicScheme)object0).isDark ? 60.0 : 49.0;
        }
        if(!MaterialDynamicColors.a(((DynamicScheme)object0))) {
            return ((DynamicScheme)object0).isDark ? 30.0 : 90.0;
        }
        double f = MaterialDynamicColors.c(((DynamicScheme)object0).tertiaryPalette.getHct(((DynamicScheme)object0).sourceColorHct.getTone()), ((DynamicScheme)object0));
        return DislikeAnalyzer.fixIfDisliked(((DynamicScheme)object0).tertiaryPalette.getHct(f)).getTone();
    }
}

