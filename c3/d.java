package c3;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class d {
    @DoNotInline
    public static int a(Resources resources0, int v, Resources.Theme resources$Theme0) {
        return resources0.getColor(v, resources$Theme0);
    }

    @DoNotInline
    @NonNull
    public static ColorStateList b(@NonNull Resources resources0, @ColorRes int v, @Nullable Resources.Theme resources$Theme0) {
        return resources0.getColorStateList(v, resources$Theme0);
    }
}

