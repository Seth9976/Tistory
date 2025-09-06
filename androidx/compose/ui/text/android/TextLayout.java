package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Trace;
import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u00C5\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001A\u00020\b\u0012\b\b\u0002\u0010\r\u001A\u00020\u0004\u0012\b\b\u0003\u0010\u000E\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\b\u0012\b\b\u0002\u0010\u0013\u001A\u00020\b\u0012\b\b\u0002\u0010\u0014\u001A\u00020\b\u0012\b\b\u0002\u0010\u0015\u001A\u00020\b\u0012\b\b\u0002\u0010\u0016\u001A\u00020\b\u0012\b\b\u0002\u0010\u0017\u001A\u00020\b\u0012\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010 \u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b \u0010!J\u0015\u0010\"\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b\"\u0010!J\u0015\u0010$\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\b\u00A2\u0006\u0004\b$\u0010!J\u0015\u0010%\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\b\u00A2\u0006\u0004\b%\u0010!J\u0015\u0010&\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\b\u00A2\u0006\u0004\b&\u0010!J\u0015\u0010\'\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\b\u00A2\u0006\u0004\b\'\u0010!J\u0015\u0010(\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\b\u00A2\u0006\u0004\b(\u0010!J\u0015\u0010)\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b)\u0010!J\u0015\u0010*\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b*\u0010!J\u0015\u0010+\u001A\u00020\b2\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b+\u0010,J\u0015\u0010-\u001A\u00020\b2\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b-\u0010,J\u0015\u0010.\u001A\u00020\b2\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b.\u0010,J\u0015\u0010/\u001A\u00020\u000F2\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b/\u00100J\u0015\u00101\u001A\u00020\b2\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b1\u0010,J\u0015\u00102\u001A\u00020\b2\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b2\u0010,J\u0015\u00104\u001A\u00020\b2\u0006\u00103\u001A\u00020\b\u00A2\u0006\u0004\b4\u0010,J\u001D\u00106\u001A\u00020\b2\u0006\u0010#\u001A\u00020\b2\u0006\u00105\u001A\u00020\u0004\u00A2\u0006\u0004\b6\u00107J\u001F\u0010:\u001A\u00020\u00042\u0006\u00108\u001A\u00020\b2\b\b\u0002\u00109\u001A\u00020\u000F\u00A2\u0006\u0004\b:\u0010;J\u001F\u0010<\u001A\u00020\u00042\u0006\u00108\u001A\u00020\b2\b\b\u0002\u00109\u001A\u00020\u000F\u00A2\u0006\u0004\b<\u0010;J\u0015\u0010=\u001A\u00020\b2\u0006\u00108\u001A\u00020\b\u00A2\u0006\u0004\b=\u0010,J\u0015\u0010>\u001A\u00020\u000F2\u0006\u00108\u001A\u00020\b\u00A2\u0006\u0004\b>\u00100J\u0015\u0010?\u001A\u00020\b2\u0006\u0010#\u001A\u00020\b\u00A2\u0006\u0004\b?\u0010,J%\u0010E\u001A\u00020D2\u0006\u0010@\u001A\u00020\b2\u0006\u0010A\u001A\u00020\b2\u0006\u0010C\u001A\u00020B\u00A2\u0006\u0004\bE\u0010FJ9\u0010L\u001A\u0004\u0018\u00010\u00182\u0006\u0010H\u001A\u00020G2\u0006\u0010I\u001A\u00020\b2\u0018\u0010K\u001A\u0014\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u000F0J\u00A2\u0006\u0004\bL\u0010MJ\u001F\u0010R\u001A\u00020D2\u0006\u0010\u001F\u001A\u00020\b2\u0006\u0010O\u001A\u00020NH\u0000\u00A2\u0006\u0004\bP\u0010QJ-\u0010V\u001A\u00020D2\u0006\u0010S\u001A\u00020\b2\u0006\u0010T\u001A\u00020\b2\u0006\u0010O\u001A\u00020N2\u0006\u0010U\u001A\u00020\b\u00A2\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001A\u00020G2\u0006\u00108\u001A\u00020\b\u00A2\u0006\u0004\bX\u0010YJ\u0015\u0010\\\u001A\u00020D2\u0006\u0010[\u001A\u00020Z\u00A2\u0006\u0004\b\\\u0010]J\u000F\u0010`\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b^\u0010_R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\ba\u0010b\u001A\u0004\bc\u0010dR\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\be\u0010f\u001A\u0004\bg\u0010_R\u0017\u0010\u0011\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bh\u0010f\u001A\u0004\bi\u0010_R\u0017\u0010\u001C\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\bj\u0010k\u001A\u0004\bl\u0010mR\u0017\u0010p\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bn\u0010f\u001A\u0004\bo\u0010_R \u0010x\u001A\u00020q8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010w\u001A\u0004\bt\u0010uR\u0017\u0010}\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\by\u0010z\u001A\u0004\b{\u0010|R\"\u0010\u0081\u0001\u001A\u00020\b8\u0000X\u0081\u0004\u00A2\u0006\u0013\n\u0004\b~\u0010z\u0012\u0005\b\u0080\u0001\u0010w\u001A\u0004\b\u007F\u0010|R$\u0010\u0085\u0001\u001A\u00020\b8\u0000X\u0081\u0004\u00A2\u0006\u0015\n\u0005\b\u0082\u0001\u0010z\u0012\u0005\b\u0084\u0001\u0010w\u001A\u0005\b\u0083\u0001\u0010|R\u0014\u0010\u0088\u0001\u001A\u00020\u00048F\u00A2\u0006\b\u001A\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0014\u0010\u008A\u0001\u001A\u00020\u00048F\u00A2\u0006\b\u001A\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0015\u0010\u008E\u0001\u001A\u00030\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u008C\u0001\u0010\u008D\u0001R\u0014\u0010\u0091\u0001\u001A\u00020\u00028F\u00A2\u0006\b\u001A\u0006\b\u008F\u0001\u0010\u0090\u0001R\u0013\u0010\u0093\u0001\u001A\u00020\b8F\u00A2\u0006\u0007\u001A\u0005\b\u0092\u0001\u0010|\u00A8\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "getLineEnd", "getLineVisibleEnd", "isLineEllipsized", "(I)Z", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", "(IF)I", "offset", "upstream", "getPrimaryHorizontal", "(IZ)F", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "", "getSelectionPath", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "getRangeForRect", "(Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "", "array", "fillLineHorizontalBounds$ui_text_release", "(I[F)V", "fillLineHorizontalBounds", "startOffset", "endOffset", "arrayStart", "fillBoundingBoxes", "(II[FI)V", "getBoundingBox", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "paint", "(Landroid/graphics/Canvas;)V", "isFallbackLinespacingApplied$ui_text_release", "()Z", "isFallbackLinespacingApplied", "a", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "b", "Z", "getIncludePadding", "c", "getFallbackLineSpacing", "d", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "e", "getDidExceedMaxLines", "didExceedMaxLines", "Landroid/text/Layout;", "g", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", "h", "I", "getLineCount", "()I", "lineCount", "i", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", "j", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "Landroidx/compose/ui/text/android/selection/WordIterator;", "getWordIterator", "()Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1155:1\n1#2:1156\n*E\n"})
public final class TextLayout {
    public static final int $stable = 8;
    public final TextPaint a;
    public final boolean b;
    public final boolean c;
    public final LayoutIntrinsics d;
    public final boolean e;
    public WordIterator f;
    public final Layout g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final Paint.FontMetricsInt n;
    public final int o;
    public final Rect p;
    public LayoutHelper q;

    public TextLayout(@NotNull CharSequence charSequence0, float f, @NotNull TextPaint textPaint0, int v, @Nullable TextUtils.TruncateAt textUtils$TruncateAt0, int v1, float f1, @Px float f2, boolean z, boolean z1, int v2, int v3, int v4, int v5, int v6, int v7, @Nullable int[] arr_v, @Nullable int[] arr_v1, @NotNull LayoutIntrinsics layoutIntrinsics0) {
        boolean z3;
        StaticLayout staticLayout0;
        this.a = textPaint0;
        this.b = z;
        this.c = z1;
        this.d = layoutIntrinsics0;
        this.p = new Rect();
        int v8 = charSequence0.length();
        TextDirectionHeuristic textDirectionHeuristic0 = TextLayout_androidKt.getTextDirectionHeuristic(v1);
        Layout.Alignment layout$Alignment0 = TextAlignmentAdapter.INSTANCE.get(v);
        boolean z2 = charSequence0 instanceof Spanned && ((Spanned)charSequence0).nextSpanTransition(-1, v8, BaselineShiftSpan.class) < v8;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringLayout$Metrics0 = layoutIntrinsics0.getBoringMetrics();
            int v10 = (int)(((float)Math.ceil(f)));
            if(boringLayout$Metrics0 == null || layoutIntrinsics0.getMaxIntrinsicWidth() > f || z2) {
                this.m = false;
                int v11 = charSequence0.length();
                staticLayout0 = StaticLayoutFactory.INSTANCE.create(charSequence0, textPaint0, v10, 0, v11, textDirectionHeuristic0, layout$Alignment0, v2, textUtils$TruncateAt0, ((int)(((float)Math.ceil(f)))), f1, f2, v7, z, z1, v3, v4, v5, v6, arr_v, arr_v1);
            }
            else {
                this.m = true;
                staticLayout0 = BoringLayoutFactory.INSTANCE.create(charSequence0, textPaint0, v10, boringLayout$Metrics0, layout$Alignment0, z, z1, textUtils$TruncateAt0, v10);
            }
            this.g = staticLayout0;
        }
        finally {
            Trace.endSection();
        }
        int v12 = Math.min(staticLayout0.getLineCount(), v2);
        this.h = v12;
        if(v12 < v2) {
            z3 = false;
        }
        else if(staticLayout0.getEllipsisCount(v12 - 1) > 0 || staticLayout0.getLineEnd(v12 - 1) != charSequence0.length()) {
            z3 = true;
        }
        else {
            z3 = false;
        }
        this.e = z3;
        long v13 = TextLayout_androidKt.access$getVerticalPaddings(this);
        LineHeightStyleSpan[] arr_lineHeightStyleSpan = TextLayout_androidKt.access$getLineHeightSpans(this);
        long v14 = arr_lineHeightStyleSpan == null ? 0L : TextLayout_androidKt.access$getLineHeightPaddings(arr_lineHeightStyleSpan);
        this.i = Math.max(VerticalPaddings.getTopPadding-impl(v13), VerticalPaddings.getTopPadding-impl(v14));
        this.j = Math.max(VerticalPaddings.getBottomPadding-impl(v13), VerticalPaddings.getBottomPadding-impl(v14));
        Paint.FontMetricsInt paint$FontMetricsInt0 = TextLayout_androidKt.access$getLastLineMetrics(this, textPaint0, textDirectionHeuristic0, arr_lineHeightStyleSpan);
        this.o = paint$FontMetricsInt0 == null ? 0 : paint$FontMetricsInt0.bottom - ((int)this.getLineHeight(v12 - 1));
        this.n = paint$FontMetricsInt0;
        this.k = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(staticLayout0, v12 - 1, null, 2, null);
        this.l = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(staticLayout0, v12 - 1, null, 2, null);
    }

    public TextLayout(CharSequence charSequence0, float f, TextPaint textPaint0, int v, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, float f1, float f2, boolean z, boolean z1, int v2, int v3, int v4, int v5, int v6, int v7, int[] arr_v, int[] arr_v1, LayoutIntrinsics layoutIntrinsics0, int v8, DefaultConstructorMarker defaultConstructorMarker0) {
        int v9 = (v8 & 0x20) == 0 ? v1 : 2;
        this(charSequence0, f, textPaint0, ((v8 & 8) == 0 ? v : 0), ((v8 & 16) == 0 ? textUtils$TruncateAt0 : null), v9, ((v8 & 0x40) == 0 ? f1 : 1.0f), ((v8 & 0x80) == 0 ? f2 : 0.0f), ((v8 & 0x100) == 0 ? z : false), ((v8 & 0x200) == 0 ? z1 : true), ((v8 & 0x400) == 0 ? v2 : 0x7FFFFFFF), ((v8 & 0x800) == 0 ? v3 : 0), ((v8 & 0x1000) == 0 ? v4 : 0), ((v8 & 0x2000) == 0 ? v5 : 0), ((v8 & 0x4000) == 0 ? v6 : 0), ((0x8000 & v8) == 0 ? v7 : 0), ((0x10000 & v8) == 0 ? arr_v : null), ((0x20000 & v8) == 0 ? arr_v1 : null), ((v8 & 0x40000) == 0 ? layoutIntrinsics0 : new LayoutIntrinsics(charSequence0, textPaint0, v9)));
    }

    public final float a(int v) {
        return v == this.h - 1 ? this.k + this.l : 0.0f;
    }

    public final LayoutHelper b() {
        LayoutHelper layoutHelper0 = this.q;
        if(layoutHelper0 == null) {
            LayoutHelper layoutHelper1 = new LayoutHelper(this.g);
            this.q = layoutHelper1;
            return layoutHelper1;
        }
        Intrinsics.checkNotNull(layoutHelper0);
        return layoutHelper0;
    }

    public final void fillBoundingBoxes(int v, int v1, @NotNull float[] arr_f, int v2) {
        float f3;
        float f2;
        int v3 = this.getText().length();
        if(v < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if(v >= v3) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if(v1 <= v) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if(v1 > v3) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if(arr_f.length - v2 < (v1 - v) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int v4 = this.getLineForOffset(v);
        int v5 = this.getLineForOffset(v1 - 1);
        i i0 = new i(this);
        if(v4 <= v5) {
            int v6 = v4;
            int v7 = v2;
            while(true) {
                int v8 = Math.max(v, this.getLineStart(v6));
                int v9 = Math.min(v1, this.getLineEnd(v6));
                float f = this.getLineTop(v6);
                float f1 = this.getLineBottom(v6);
                boolean z = this.getParagraphDirection(v6) == 1;
                while(v8 < v9) {
                    boolean z1 = this.isRtlCharAt(v8);
                    if(z && !z1) {
                        f2 = i0.a(false, false, true, v8);
                        f3 = i0.a(true, true, true, v8 + 1);
                    }
                    else if(z && z1) {
                        float f4 = i0.a(false, false, false, v8);
                        f2 = i0.a(true, true, false, v8 + 1);
                        f3 = f4;
                    }
                    else if(z || !z1) {
                        f2 = i0.a(false, false, false, v8);
                        f3 = i0.a(true, true, false, v8 + 1);
                    }
                    else {
                        f3 = i0.a(false, false, true, v8);
                        f2 = i0.a(true, true, true, v8 + 1);
                    }
                    arr_f[v7] = f2;
                    arr_f[v7 + 1] = f;
                    arr_f[v7 + 2] = f3;
                    arr_f[v7 + 3] = f1;
                    v7 += 4;
                    ++v8;
                }
                if(v6 == v5) {
                    break;
                }
                ++v6;
            }
        }
    }

    public final void fillLineHorizontalBounds$ui_text_release(int v, @NotNull float[] arr_f) {
        float f1;
        float f;
        int v1 = this.getLineStart(v);
        int v2 = this.getLineEnd(v);
        if(arr_f.length < (v2 - v1) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        i i0 = new i(this);
        boolean z = this.getParagraphDirection(v) == 1;
        int v3 = 0;
        while(v1 < v2) {
            boolean z1 = this.isRtlCharAt(v1);
            if(z && !z1) {
                f = i0.a(false, false, true, v1);
                f1 = i0.a(true, true, true, v1 + 1);
            }
            else if(z && z1) {
                f1 = i0.a(false, false, false, v1);
                f = i0.a(true, true, false, v1 + 1);
            }
            else if(z1) {
                f1 = i0.a(false, false, true, v1);
                f = i0.a(true, true, true, v1 + 1);
            }
            else {
                f = i0.a(false, false, false, v1);
                f1 = i0.a(true, true, false, v1 + 1);
            }
            arr_f[v3] = f;
            arr_f[v3 + 1] = f1;
            v3 += 2;
            ++v1;
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.j;
    }

    @VisibleForTesting
    public static void getBottomPadding$ui_text_release$annotations() {
    }

    @NotNull
    public final RectF getBoundingBox(int v) {
        float f2;
        int v1 = this.getLineForOffset(v);
        float f = this.getLineTop(v1);
        float f1 = this.getLineBottom(v1);
        boolean z = this.getParagraphDirection(v1) == 1;
        boolean z1 = this.g.isRtlCharAt(v);
        if(z && !z1) {
            return new RectF(this.getPrimaryHorizontal(v, false), f, this.getPrimaryHorizontal(v + 1, true), f1);
        }
        if(z && z1) {
            f2 = this.getSecondaryHorizontal(v, false);
            return new RectF(this.getSecondaryHorizontal(v + 1, true), f, f2, f1);
        }
        if(z1) {
            f2 = this.getPrimaryHorizontal(v, false);
            return new RectF(this.getPrimaryHorizontal(v + 1, true), f, f2, f1);
        }
        return new RectF(this.getSecondaryHorizontal(v, false), f, this.getSecondaryHorizontal(v + 1, true), f1);
    }

    public final boolean getDidExceedMaxLines() {
        return this.e;
    }

    public final boolean getFallbackLineSpacing() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    public final int getHeight() {
        return this.e ? this.g.getLineBottom(this.h - 1) + this.i + this.j + this.o : this.g.getHeight() + this.i + this.j + this.o;
    }

    public final boolean getIncludePadding() {
        return this.b;
    }

    @NotNull
    public final Layout getLayout() {
        return this.g;
    }

    @VisibleForTesting
    public static void getLayout$annotations() {
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.d;
    }

    public final float getLineAscent(int v) {
        if(v == this.h - 1) {
            return this.n == null ? ((float)this.g.getLineAscent(v)) : ((float)this.n.ascent);
        }
        return (float)this.g.getLineAscent(v);
    }

    public final float getLineBaseline(int v) {
        float f = (float)this.i;
        if(v == this.h - 1) {
            return this.n == null ? f + ((float)this.g.getLineBaseline(v)) : f + (this.getLineTop(v) - ((float)this.n.ascent));
        }
        return f + ((float)this.g.getLineBaseline(v));
    }

    public final float getLineBottom(int v) {
        int v1 = this.h;
        Layout layout0 = this.g;
        if(v == v1 - 1) {
            Paint.FontMetricsInt paint$FontMetricsInt0 = this.n;
            if(paint$FontMetricsInt0 != null) {
                return ((float)layout0.getLineBottom(v - 1)) + ((float)paint$FontMetricsInt0.bottom);
            }
        }
        float f = (float)layout0.getLineBottom(v);
        float f1 = ((float)this.i) + f;
        return v == v1 - 1 ? f1 + ((float)this.j) : f1 + 0.0f;
    }

    public final int getLineCount() {
        return this.h;
    }

    public final float getLineDescent(int v) {
        if(v == this.h - 1) {
            return this.n == null ? ((float)this.g.getLineDescent(v)) : ((float)this.n.descent);
        }
        return (float)this.g.getLineDescent(v);
    }

    public final int getLineEllipsisCount(int v) {
        return this.g.getEllipsisCount(v);
    }

    public final int getLineEllipsisOffset(int v) {
        return this.g.getEllipsisStart(v);
    }

    public final int getLineEnd(int v) {
        return this.g.getEllipsisStart(v) == 0 ? this.g.getLineEnd(v) : this.g.getText().length();
    }

    public final int getLineForOffset(int v) {
        return this.g.getLineForOffset(v);
    }

    public final int getLineForVertical(int v) {
        return this.g.getLineForVertical(v - this.i);
    }

    public final float getLineHeight(int v) {
        return this.getLineBottom(v) - this.getLineTop(v);
    }

    public final float getLineLeft(int v) {
        float f = this.g.getLineLeft(v);
        return v == this.h - 1 ? f + this.k : f + 0.0f;
    }

    public final float getLineRight(int v) {
        float f = this.g.getLineRight(v);
        return v == this.h - 1 ? f + this.l : f + 0.0f;
    }

    public final int getLineStart(int v) {
        return this.g.getLineStart(v);
    }

    public final float getLineTop(int v) {
        float f = (float)this.g.getLineTop(v);
        return v == 0 ? f + 0.0f : f + ((float)this.i);
    }

    public final int getLineVisibleEnd(int v) {
        Layout layout0 = this.g;
        if(layout0.getEllipsisStart(v) == 0) {
            return this.b().getLineVisibleEnd(v);
        }
        int v1 = layout0.getLineStart(v);
        return layout0.getEllipsisStart(v) + v1;
    }

    public final float getLineWidth(int v) {
        return this.g.getLineWidth(v);
    }

    public final float getMaxIntrinsicWidth() {
        return this.d.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.d.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int v, float f) {
        float f1 = this.a(v);
        return this.g.getOffsetForHorizontal(v, f1 * -1.0f + f);
    }

    public final int getParagraphDirection(int v) {
        return this.g.getParagraphDirection(v);
    }

    public final float getPrimaryHorizontal(int v, boolean z) {
        float f = this.b().getHorizontalPosition(v, true, z);
        return this.a(this.getLineForOffset(v)) + f;
    }

    public static float getPrimaryHorizontal$default(TextLayout textLayout0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayout0.getPrimaryHorizontal(v, z);
    }

    @Nullable
    public final int[] getRangeForRect(@NotNull RectF rectF0, int v, @NotNull Function2 function20) {
        if(Build.VERSION.SDK_INT >= 34) {
            return AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text_release(this, rectF0, v, function20);
        }
        LayoutHelper layoutHelper0 = this.b();
        return TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.g, layoutHelper0, rectF0, v, function20);
    }

    public final float getSecondaryHorizontal(int v, boolean z) {
        float f = this.b().getHorizontalPosition(v, false, z);
        return this.a(this.getLineForOffset(v)) + f;
    }

    public static float getSecondaryHorizontal$default(TextLayout textLayout0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayout0.getSecondaryHorizontal(v, z);
    }

    public final void getSelectionPath(int v, int v1, @NotNull Path path0) {
        this.g.getSelectionPath(v, v1, path0);
        int v2 = this.i;
        if(v2 != 0 && !path0.isEmpty()) {
            path0.offset(0.0f, ((float)v2));
        }
    }

    @NotNull
    public final CharSequence getText() {
        return this.g.getText();
    }

    @NotNull
    public final TextPaint getTextPaint() {
        return this.a;
    }

    public final int getTopPadding$ui_text_release() {
        return this.i;
    }

    @VisibleForTesting
    public static void getTopPadding$ui_text_release$annotations() {
    }

    @NotNull
    public final WordIterator getWordIterator() {
        WordIterator wordIterator0 = this.f;
        if(wordIterator0 != null) {
            return wordIterator0;
        }
        WordIterator wordIterator1 = new WordIterator(this.g.getText(), 0, this.g.getText().length(), this.a.getTextLocale());
        this.f = wordIterator1;
        return wordIterator1;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        Layout layout0 = this.g;
        if(this.m) {
            Intrinsics.checkNotNull(layout0, "null cannot be cast to non-null type android.text.BoringLayout");
            return BoringLayoutFactory.INSTANCE.isFallbackLineSpacingEnabled(((BoringLayout)layout0));
        }
        Intrinsics.checkNotNull(layout0, "null cannot be cast to non-null type android.text.StaticLayout");
        return StaticLayoutFactory.INSTANCE.isFallbackLineSpacingEnabled(((StaticLayout)layout0), this.c);
    }

    public final boolean isLineEllipsized(int v) {
        return TextLayout_androidKt.isLineEllipsized(this.g, v);
    }

    public final boolean isRtlCharAt(int v) {
        return this.g.isRtlCharAt(v);
    }

    public final void paint(@NotNull Canvas canvas0) {
        if(!canvas0.getClipBounds(this.p)) {
            return;
        }
        int v = this.i;
        if(v != 0) {
            canvas0.translate(0.0f, ((float)v));
        }
        TextAndroidCanvas textAndroidCanvas0 = TextLayout_androidKt.a;
        textAndroidCanvas0.setCanvas(canvas0);
        this.g.draw(textAndroidCanvas0);
        if(v != 0) {
            canvas0.translate(0.0f, -1.0f * ((float)v));
        }
    }
}

