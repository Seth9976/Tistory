package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.function.Function;

public final class a implements Function {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                DynamicScheme dynamicScheme0 = (DynamicScheme)object0;
                return (TonalPalette)this.b;
            }
            case 1: {
                DynamicScheme dynamicScheme1 = (DynamicScheme)object0;
                return ((Hct)this.b).getTone();
            }
            default: {
                return (Double)((HashMap)((TemperatureCache)this.b).c()).get(((Hct)object0));
            }
        }
    }
}

