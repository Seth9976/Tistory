package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f3.a;
import f3.b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class DrawableCompat {
    public static void applyTheme(@NonNull Drawable drawable0, @NonNull Resources.Theme resources$Theme0) {
        a.a(drawable0, resources$Theme0);
    }

    public static boolean canApplyTheme(@NonNull Drawable drawable0) {
        return a.b(drawable0);
    }

    public static void clearColorFilter(@NonNull Drawable drawable0) {
        drawable0.clearColorFilter();
    }

    public static int getAlpha(@NonNull Drawable drawable0) {
        return drawable0.getAlpha();
    }

    @Nullable
    public static ColorFilter getColorFilter(@NonNull Drawable drawable0) {
        return a.c(drawable0);
    }

    public static int getLayoutDirection(@NonNull Drawable drawable0) {
        return b.a(drawable0);
    }

    public static void inflate(@NonNull Drawable drawable0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        a.d(drawable0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
    }

    public static boolean isAutoMirrored(@NonNull Drawable drawable0) {
        return drawable0.isAutoMirrored();
    }

    @Deprecated
    public static void jumpToCurrentState(@NonNull Drawable drawable0) {
        drawable0.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable drawable0, boolean z) {
        drawable0.setAutoMirrored(z);
    }

    public static void setHotspot(@NonNull Drawable drawable0, float f, float f1) {
        a.e(drawable0, f, f1);
    }

    public static void setHotspotBounds(@NonNull Drawable drawable0, int v, int v1, int v2, int v3) {
        a.f(drawable0, v, v1, v2, v3);
    }

    public static boolean setLayoutDirection(@NonNull Drawable drawable0, int v) {
        return b.b(drawable0, v);
    }

    public static void setTint(@NonNull Drawable drawable0, @ColorInt int v) {
        a.g(drawable0, v);
    }

    public static void setTintList(@NonNull Drawable drawable0, @Nullable ColorStateList colorStateList0) {
        a.h(drawable0, colorStateList0);
    }

    public static void setTintMode(@NonNull Drawable drawable0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        a.i(drawable0, porterDuff$Mode0);
    }

    // 去混淆评级： 低(20)
    public static Drawable unwrap(@NonNull Drawable drawable0) {
        return drawable0 instanceof WrappedDrawable ? ((WrappedDrawable)drawable0).getWrappedDrawable() : drawable0;
    }

    @NonNull
    public static Drawable wrap(@NonNull Drawable drawable0) [...] // Inlined contents
}

