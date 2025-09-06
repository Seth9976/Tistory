package androidx.appcompat.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;

@SuppressLint({"RestrictedAPI"})
public final class AppCompatResources {
    public static ColorStateList getColorStateList(@NonNull Context context0, @ColorRes int v) {
        return ContextCompat.getColorStateList(context0, v);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context0, @DrawableRes int v) {
        return ResourceManagerInternal.get().getDrawable(context0, v);
    }
}

