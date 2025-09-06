package androidx.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import androidx.databinding.BindingConversion;

public class Converters {
    @BindingConversion
    public static ColorStateList convertColorToColorStateList(int v) {
        return ColorStateList.valueOf(v);
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable(int v) {
        return new ColorDrawable(v);
    }
}

