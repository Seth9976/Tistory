package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

public final class i extends FloatPropertyCompat {
    public final int a;
    public final Object b;

    public i(FloatValueHolder floatValueHolder0) {
        this.a = 0;
        this.b = floatValueHolder0;
        super("FloatValueHolder");
    }

    public i(String s, FloatProperty floatProperty0) {
        this.a = 1;
        this.b = floatProperty0;
        super(s);
    }

    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float getValue(Object object0) {
        return this.a == 0 ? ((FloatValueHolder)this.b).getValue() : ((float)(((Float)((FloatProperty)this.b).get(object0))));
    }

    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void setValue(Object object0, float f) {
        if(this.a != 0) {
            ((FloatProperty)this.b).setValue(object0, f);
            return;
        }
        ((FloatValueHolder)this.b).setValue(f);
    }
}

