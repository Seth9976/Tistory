package androidx.core.text;

import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static Spanned a(String s, int v) {
        return Html.fromHtml(s, v);
    }

    @DoNotInline
    public static Spanned b(String s, int v, Html.ImageGetter html$ImageGetter0, Html.TagHandler html$TagHandler0) {
        return Html.fromHtml(s, v, html$ImageGetter0, html$TagHandler0);
    }

    @DoNotInline
    public static String c(Spanned spanned0, int v) {
        return Html.toHtml(spanned0, v);
    }
}

