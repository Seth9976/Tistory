package f3;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DoNotInline;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class a {
    @DoNotInline
    public static void a(Drawable drawable0, Resources.Theme resources$Theme0) {
        drawable0.applyTheme(resources$Theme0);
    }

    @DoNotInline
    public static boolean b(Drawable drawable0) {
        return drawable0.canApplyTheme();
    }

    @DoNotInline
    public static ColorFilter c(Drawable drawable0) {
        return drawable0.getColorFilter();
    }

    @DoNotInline
    public static void d(Drawable drawable0, Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        drawable0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
    }

    @DoNotInline
    public static void e(Drawable drawable0, float f, float f1) {
        drawable0.setHotspot(f, f1);
    }

    @DoNotInline
    public static void f(Drawable drawable0, int v, int v1, int v2, int v3) {
        drawable0.setHotspotBounds(v, v1, v2, v3);
    }

    @DoNotInline
    public static void g(Drawable drawable0, int v) {
        drawable0.setTint(v);
    }

    @DoNotInline
    public static void h(Drawable drawable0, ColorStateList colorStateList0) {
        drawable0.setTintList(colorStateList0);
    }

    @DoNotInline
    public static void i(Drawable drawable0, PorterDuff.Mode porterDuff$Mode0) {
        drawable0.setTintMode(porterDuff$Mode0);
    }
}

