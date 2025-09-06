package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.DoNotInline;
import java.util.Objects;

public abstract class g {
    @DoNotInline
    public static Color a(Color color0, Color color1) {
        if(!Objects.equals(color0.getModel(), color1.getModel())) {
            throw new IllegalArgumentException("Color models must match (" + color0.getModel() + " vs. " + color1.getModel() + ")");
        }
        if(!Objects.equals(color1.getColorSpace(), color0.getColorSpace())) {
            color0 = color0.convert(color1.getColorSpace());
        }
        float[] arr_f = color0.getComponents();
        float[] arr_f1 = color1.getComponents();
        float f = color0.alpha();
        float f1 = (1.0f - f) * color1.alpha();
        int v = color1.getComponentCount();
        float f2 = f + f1;
        arr_f1[v - 1] = f2;
        if(f2 > 0.0f) {
            f /= f2;
            f1 /= f2;
        }
        for(int v1 = 0; v1 < v - 1; ++v1) {
            arr_f1[v1] = arr_f1[v1] * f1 + arr_f[v1] * f;
        }
        return Color.valueOf(arr_f1, color1.getColorSpace());
    }
}

