package p3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.TextView;
import androidx.annotation.DoNotInline;

public abstract class l {
    @DoNotInline
    public static int a(TextView textView0) {
        return textView0.getBreakStrategy();
    }

    @DoNotInline
    public static ColorStateList b(TextView textView0) {
        return textView0.getCompoundDrawableTintList();
    }

    @DoNotInline
    public static PorterDuff.Mode c(TextView textView0) {
        return textView0.getCompoundDrawableTintMode();
    }

    @DoNotInline
    public static int d(TextView textView0) {
        return textView0.getHyphenationFrequency();
    }

    @DoNotInline
    public static void e(TextView textView0, int v) {
        textView0.setBreakStrategy(v);
    }

    @DoNotInline
    public static void f(TextView textView0, ColorStateList colorStateList0) {
        textView0.setCompoundDrawableTintList(colorStateList0);
    }

    @DoNotInline
    public static void g(TextView textView0, PorterDuff.Mode porterDuff$Mode0) {
        textView0.setCompoundDrawableTintMode(porterDuff$Mode0);
    }

    @DoNotInline
    public static void h(TextView textView0, int v) {
        textView0.setHyphenationFrequency(v);
    }
}

