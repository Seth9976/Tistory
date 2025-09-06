package androidx.compose.ui.text.android;

import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u001F\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001A\u001B\u0010\r\u001A\u00020\f*\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "getTextDirectionHeuristic", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Landroidx/compose/ui/text/android/VerticalPaddings;", "VerticalPaddings", "(II)J", "Landroid/text/Layout;", "lineIndex", "", "isLineEllipsized", "(Landroid/text/Layout;I)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1155:1\n25#2:1156\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n*L\n986#1:1156\n*E\n"})
public final class TextLayout_androidKt {
    public static final TextAndroidCanvas a;
    public static final long b;

    static {
        TextLayout_androidKt.a = new TextAndroidCanvas();
        TextLayout_androidKt.b = 0L;
    }

    public static final long VerticalPaddings(int v, int v1) [...] // 潜在的解密器

    public static final Paint.FontMetricsInt access$getLastLineMetrics(TextLayout textLayout0, TextPaint textPaint0, TextDirectionHeuristic textDirectionHeuristic0, LineHeightStyleSpan[] arr_lineHeightStyleSpan) {
        int v = textLayout0.getLineCount();
        if(textLayout0.getLayout().getLineStart(v - 1) == textLayout0.getLayout().getLineEnd(v - 1) && arr_lineHeightStyleSpan != null && arr_lineHeightStyleSpan.length != 0) {
            SpannableString spannableString0 = new SpannableString("​");
            LineHeightStyleSpan lineHeightStyleSpan0 = (LineHeightStyleSpan)ArraysKt___ArraysKt.first(arr_lineHeightStyleSpan);
            spannableString0.setSpan(lineHeightStyleSpan0.copy$ui_text_release(0, spannableString0.length(), (v - 1 == 0 || !lineHeightStyleSpan0.getTrimLastLineBottom() ? lineHeightStyleSpan0.getTrimLastLineBottom() : false)), 0, spannableString0.length(), 33);
            int v1 = spannableString0.length();
            StaticLayout staticLayout0 = StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, spannableString0, textPaint0, 0x7FFFFFFF, 0, v1, textDirectionHeuristic0, null, 0, null, 0, 0.0f, 0.0f, 0, textLayout0.getIncludePadding(), textLayout0.getFallbackLineSpacing(), 0, 0, 0, 0, null, null, 0x1F9FC0, null);
            Paint.FontMetricsInt paint$FontMetricsInt0 = new Paint.FontMetricsInt();
            paint$FontMetricsInt0.ascent = staticLayout0.getLineAscent(0);
            paint$FontMetricsInt0.descent = staticLayout0.getLineDescent(0);
            paint$FontMetricsInt0.top = staticLayout0.getLineTop(0);
            paint$FontMetricsInt0.bottom = staticLayout0.getLineBottom(0);
            return paint$FontMetricsInt0;
        }
        return null;
    }

    public static final long access$getLineHeightPaddings(LineHeightStyleSpan[] arr_lineHeightStyleSpan) {
        int v1 = 0;
        int v2 = 0;
        for(int v = 0; v < arr_lineHeightStyleSpan.length; ++v) {
            LineHeightStyleSpan lineHeightStyleSpan0 = arr_lineHeightStyleSpan[v];
            if(lineHeightStyleSpan0.getFirstAscentDiff() < 0) {
                v1 = Math.max(v1, Math.abs(lineHeightStyleSpan0.getFirstAscentDiff()));
            }
            if(lineHeightStyleSpan0.getLastDescentDiff() < 0) {
                v2 = Math.max(v1, Math.abs(lineHeightStyleSpan0.getLastDescentDiff()));
            }
        }
        return v1 != 0 || v2 != 0 ? TextLayout_androidKt.VerticalPaddings(v1, v2) : TextLayout_androidKt.b;
    }

    public static final LineHeightStyleSpan[] access$getLineHeightSpans(TextLayout textLayout0) {
        if(textLayout0.getText() instanceof Spanned) {
            CharSequence charSequence0 = textLayout0.getText();
            Intrinsics.checkNotNull(charSequence0, "null cannot be cast to non-null type android.text.Spanned");
            Class class0 = LineHeightStyleSpan.class;
            if(SpannedExtensions_androidKt.hasSpan(((Spanned)charSequence0), class0) || textLayout0.getText().length() <= 0) {
                CharSequence charSequence1 = textLayout0.getText();
                Intrinsics.checkNotNull(charSequence1, "null cannot be cast to non-null type android.text.Spanned");
                return (LineHeightStyleSpan[])((Spanned)charSequence1).getSpans(0, textLayout0.getText().length(), class0);
            }
        }
        return null;
    }

    public static final long access$getVerticalPaddings(TextLayout textLayout0) {
        long v = TextLayout_androidKt.b;
        if(!textLayout0.getIncludePadding() && !textLayout0.isFallbackLinespacingApplied$ui_text_release()) {
            TextPaint textPaint0 = textLayout0.getLayout().getPaint();
            CharSequence charSequence0 = textLayout0.getLayout().getText();
            Rect rect0 = PaintExtensions_androidKt.getCharSequenceBounds(textPaint0, charSequence0, textLayout0.getLayout().getLineStart(0), textLayout0.getLayout().getLineEnd(0));
            int v1 = textLayout0.getLayout().getLineAscent(0);
            int v2 = rect0.top;
            int v3 = v2 >= v1 ? textLayout0.getLayout().getTopPadding() : v1 - v2;
            if(textLayout0.getLineCount() != 1) {
                int v4 = textLayout0.getLineCount();
                rect0 = PaintExtensions_androidKt.getCharSequenceBounds(textPaint0, charSequence0, textLayout0.getLayout().getLineStart(v4 - 1), textLayout0.getLayout().getLineEnd(v4 - 1));
            }
            int v5 = textLayout0.getLayout().getLineDescent(textLayout0.getLineCount() - 1);
            int v6 = rect0.bottom;
            int v7 = v6 <= v5 ? textLayout0.getLayout().getBottomPadding() : v6 - v5;
            return v3 == 0 && v7 == 0 ? v : TextLayout_androidKt.VerticalPaddings(v3, v7);
        }
        return v;
    }

    public static final long access$getZeroVerticalPadding$p() [...] // 潜在的解密器

    @NotNull
    public static final TextDirectionHeuristic getTextDirectionHeuristic(int v) {
        switch(v) {
            case 0: {
                return TextDirectionHeuristics.LTR;
            }
            case 1: {
                return TextDirectionHeuristics.RTL;
            }
            case 2: {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            case 3: {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            case 4: {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            case 5: {
                return TextDirectionHeuristics.LOCALE;
            }
            default: {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }
    }

    public static final boolean isLineEllipsized(@NotNull Layout layout0, int v) {
        return layout0.getEllipsisCount(v) > 0;
    }
}

