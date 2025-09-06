package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

public abstract class FloatPropertyCompat {
    public FloatPropertyCompat(String s) {
    }

    @RequiresApi(24)
    public static FloatPropertyCompat createFloatPropertyCompat(FloatProperty floatProperty0) {
        return new i(floatProperty0.getName(), floatProperty0);
    }

    public abstract float getValue(Object arg1);

    public abstract void setValue(Object arg1, float arg2);
}

