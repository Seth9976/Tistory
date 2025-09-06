package c8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.R.attr;
import com.google.android.material.color.MaterialColors;

public abstract class b {
    @DoNotInline
    private static Drawable b(@NonNull Context context0, @Px int v) {
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setColor(-1);
        gradientDrawable0.setShape(1);
        InsetDrawable insetDrawable0 = new InsetDrawable(gradientDrawable0, v, v, v, v);
        return new RippleDrawable(MaterialColors.getColorStateList(context0, attr.colorControlHighlight, ColorStateList.valueOf(0)), null, insetDrawable0);
    }
}

