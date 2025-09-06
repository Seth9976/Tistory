package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"InlinedApi"})
public final class HtmlCompat {
    public static final int FROM_HTML_MODE_COMPACT = 0x3F;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 0x100;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 0x20;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    @NonNull
    public static Spanned fromHtml(@NonNull String s, int v) {
        return b.a(s, v);
    }

    @NonNull
    public static Spanned fromHtml(@NonNull String s, int v, @Nullable Html.ImageGetter html$ImageGetter0, @Nullable Html.TagHandler html$TagHandler0) {
        return b.b(s, v, html$ImageGetter0, html$TagHandler0);
    }

    @NonNull
    public static String toHtml(@NonNull Spanned spanned0, int v) {
        return b.c(spanned0, v);
    }
}

