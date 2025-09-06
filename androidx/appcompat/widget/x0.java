package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import java.util.Locale;

public abstract class x0 {
    @DoNotInline
    public static Drawable[] a(TextView textView0) {
        return textView0.getCompoundDrawablesRelative();
    }

    @DoNotInline
    public static void b(TextView textView0, Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
    }

    @DoNotInline
    public static void c(TextView textView0, Locale locale0) {
        textView0.setTextLocale(locale0);
    }
}

