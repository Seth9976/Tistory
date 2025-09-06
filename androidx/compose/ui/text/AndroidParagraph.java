package androidx.compose.ui.text;

import a5.b;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00E2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BBi\b\u0016\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0012\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\u0012\u0010\u0015\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u0017\u001A\u00020\u0016\u0012\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b\n\u0010\u001AJ\u0017\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010#\u001A\u00020\u00042\u0006\u0010 \u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"J*\u0010-\u001A\u00020*2\u0006\u0010%\u001A\u00020$2\u0006\u0010\'\u001A\u00020&2\u0006\u0010)\u001A\u00020(H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,J\u0017\u0010/\u001A\u00020$2\u0006\u0010.\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b/\u00100J,\u00108\u001A\u0002052\u0006\u00101\u001A\u00020*2\u0006\u00103\u001A\u0002022\b\b\u0001\u00104\u001A\u00020\u0004H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b6\u00107J\u001F\u0010<\u001A\u00020;2\u0006\u00109\u001A\u00020\u00042\u0006\u0010:\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b<\u0010=J\u0017\u0010>\u001A\u00020$2\u0006\u0010.\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b>\u00100J\u001D\u0010A\u001A\u00020*2\u0006\u0010.\u001A\u00020\u0004H\u0016\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b?\u0010@J\u0017\u0010C\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bE\u0010DJ\u0017\u0010F\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bF\u0010DJ\u0017\u0010H\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\bG\u0010DJ\u0017\u0010I\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bI\u0010DJ\u0017\u0010K\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\bJ\u0010DJ\u0017\u0010L\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bL\u0010DJ\u0017\u0010M\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bM\u0010DJ\u0017\u0010N\u001A\u00020\u001B2\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bN\u0010DJ\u0017\u0010O\u001A\u00020\u00042\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bO\u0010PJ\u001F\u0010R\u001A\u00020\u00042\u0006\u0010B\u001A\u00020\u00042\u0006\u0010Q\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001A\u00020\u00062\u0006\u0010B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001A\u00020\u00042\u0006\u0010.\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bV\u0010PJ\u001F\u0010X\u001A\u00020\u001B2\u0006\u0010.\u001A\u00020\u00042\u0006\u0010W\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001A\u00020Z2\u0006\u0010.\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001A\u00020Z2\u0006\u0010.\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b]\u0010\\J6\u0010h\u001A\u0002052\u0006\u0010_\u001A\u00020^2\u0006\u0010a\u001A\u00020`2\b\u0010c\u001A\u0004\u0018\u00010b2\b\u0010e\u001A\u0004\u0018\u00010dH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bf\u0010gJH\u0010h\u001A\u0002052\u0006\u0010_\u001A\u00020^2\u0006\u0010a\u001A\u00020`2\b\u0010c\u001A\u0004\u0018\u00010b2\b\u0010e\u001A\u0004\u0018\u00010d2\b\u0010j\u001A\u0004\u0018\u00010i2\u0006\u0010l\u001A\u00020kH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bm\u0010nJP\u0010h\u001A\u0002052\u0006\u0010_\u001A\u00020^2\u0006\u0010p\u001A\u00020o2\u0006\u0010q\u001A\u00020\u001B2\b\u0010c\u001A\u0004\u0018\u00010b2\b\u0010e\u001A\u0004\u0018\u00010d2\b\u0010j\u001A\u0004\u0018\u00010i2\u0006\u0010l\u001A\u00020kH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\br\u0010sR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010wR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bx\u0010y\u001A\u0004\bz\u0010{R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b|\u0010}\u001A\u0004\b~\u0010\u007FR!\u0010\t\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001A\u0006\b\u0082\u0001\u0010\u0083\u0001R(\u0010\u008B\u0001\u001A\u00030\u0084\u00018\u0000X\u0081\u0004\u00A2\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u0012\u0006\b\u0089\u0001\u0010\u008A\u0001\u001A\u0006\b\u0087\u0001\u0010\u0088\u0001R\'\u0010\u0090\u0001\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00108\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u008C\u0001\u0010\u008D\u0001\u001A\u0006\b\u008E\u0001\u0010\u008F\u0001R\u0017\u0010\u0093\u0001\u001A\u00020\u001B8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0095\u0001\u001A\u00020\u001B8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0094\u0001\u0010\u0092\u0001R\u0017\u0010\u0097\u0001\u001A\u00020\u001B8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0096\u0001\u0010\u0092\u0001R\u0017\u0010\u0099\u0001\u001A\u00020\u001B8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0098\u0001\u0010\u0092\u0001R\u0017\u0010\u009B\u0001\u001A\u00020\u001B8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u009A\u0001\u0010\u0092\u0001R\u0017\u0010\u009D\u0001\u001A\u00020\u001B8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u009C\u0001\u0010\u0092\u0001R\u0016\u0010\u009F\u0001\u001A\u00020\u00068VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u009E\u0001\u0010\u007FR \u0010\u00A4\u0001\u001A\u00030\u00A0\u00018@X\u0081\u0004\u00A2\u0006\u0010\u0012\u0006\b\u00A3\u0001\u0010\u008A\u0001\u001A\u0006\b\u00A1\u0001\u0010\u00A2\u0001R\u0016\u0010\u00A6\u0001\u001A\u00020\u00048VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A5\u0001\u0010{R \u0010\u00AB\u0001\u001A\u00030\u00A7\u00018@X\u0081\u0004\u00A2\u0006\u0010\u0012\u0006\b\u00AA\u0001\u0010\u008A\u0001\u001A\u0006\b\u00A8\u0001\u0010\u00A9\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00AC\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "", "maxLines", "", "ellipsis", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "offset", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", "", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "getCursorRect", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineAscent$ui_text_release", "getLineAscent", "getLineBaseline", "getLineDescent$ui_text_release", "getLineDescent", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "a", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "b", "I", "getMaxLines", "()I", "c", "Z", "getEllipsis", "()Z", "d", "J", "getConstraints-msEJaDk", "()J", "", "f", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", "g", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "getWidth", "()F", "width", "getHeight", "height", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "didExceedMaxLines", "Ljava/util/Locale;", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "textLocale", "getLineCount", "lineCount", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "textPaint", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,656:1\n1#2:657\n11335#3:658\n11670#3,3:659\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n254#1:658\n254#1:659,3\n*E\n"})
public final class AndroidParagraph implements Paragraph {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ResolvedTextDirection.values().length];
            try {
                arr_v[ResolvedTextDirection.Ltr.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ResolvedTextDirection.Rtl.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final AndroidParagraphIntrinsics a;
    public final int b;
    public final boolean c;
    public final long d;
    public final TextLayout e;
    public final CharSequence f;
    public final List g;

    public AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics0, int v, boolean z, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        List list0;
        Rect rect0;
        float f4;
        float f2;
        float f;
        ShaderBrushSpan[] arr_shaderBrushSpan;
        this.a = androidParagraphIntrinsics0;
        this.b = v;
        this.c = z;
        this.d = v1;
        if(Constraints.getMinHeight-impl(v1) != 0 || Constraints.getMinWidth-impl(v1) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if(v < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle textStyle0 = androidParagraphIntrinsics0.getStyle();
        this.f = AndroidParagraph_androidKt.access$shouldAttachIndentationFixSpan(textStyle0, z) ? AndroidParagraph_androidKt.access$attachIndentationFixSpan(androidParagraphIntrinsics0.getCharSequence$ui_text_release()) : androidParagraphIntrinsics0.getCharSequence$ui_text_release();
        int v2 = AndroidParagraph_androidKt.access$toLayoutAlign-aXe7zB0(textStyle0.getTextAlign-e0LSkKk());
        boolean z1 = TextAlign.equals-impl0(textStyle0.getTextAlign-e0LSkKk(), 4);
        int v3 = AndroidParagraph_androidKt.access$toLayoutHyphenationFrequency--3fSNIE(textStyle0.getParagraphStyle$ui_text_release().getHyphens-vmbZdU8());
        int v4 = AndroidParagraph_androidKt.access$toLayoutBreakStrategy-xImikfE(LineBreak.getStrategy-fcGXIks(textStyle0.getLineBreak-rAG3T2k()));
        int v5 = AndroidParagraph_androidKt.access$toLayoutLineBreakStyle-hpcqdu8(LineBreak.getStrictness-usljTpc(textStyle0.getLineBreak-rAG3T2k()));
        int v6 = AndroidParagraph_androidKt.access$toLayoutLineBreakWordStyle-wPN0Rpw(LineBreak.getWordBreak-jp8hJ3c(textStyle0.getLineBreak-rAG3T2k()));
        TextUtils.TruncateAt textUtils$TruncateAt0 = z ? TextUtils.TruncateAt.END : null;
        TextLayout textLayout0 = this.a(v2, ((int)z1), textUtils$TruncateAt0, v, v3, v4, v5, v6);
        if(z && textLayout0.getHeight() > Constraints.getMaxHeight-impl(v1) && v > 1) {
            int v7 = AndroidParagraph_androidKt.access$numberOfLinesThatFitMaxHeight(textLayout0, Constraints.getMaxHeight-impl(v1));
            if(v7 >= 0 && v7 != v) {
                textLayout0 = this.a(v2, ((int)z1), textUtils$TruncateAt0, c.coerceAtLeast(v7, 1), v3, v4, v5, v6);
            }
        }
        this.e = textLayout0;
        this.getTextPaint$ui_text_release().setBrush-12SF9DM(textStyle0.getBrush(), SizeKt.Size(this.getWidth(), this.getHeight()), textStyle0.getAlpha());
        TextLayout textLayout1 = this.e;
        if(textLayout1.getText() instanceof Spanned) {
            CharSequence charSequence0 = textLayout1.getText();
            Intrinsics.checkNotNull(charSequence0, "null cannot be cast to non-null type android.text.Spanned");
            int v8 = ((Spanned)charSequence0).length();
            Class class0 = ShaderBrushSpan.class;
            if(((Spanned)charSequence0).nextSpanTransition(-1, v8, class0) == ((Spanned)charSequence0).length()) {
                arr_shaderBrushSpan = null;
            }
            else {
                CharSequence charSequence1 = textLayout1.getText();
                Intrinsics.checkNotNull(charSequence1, "null cannot be cast to non-null type android.text.Spanned");
                arr_shaderBrushSpan = (ShaderBrushSpan[])((Spanned)charSequence1).getSpans(0, textLayout1.getText().length(), class0);
            }
        }
        else {
            arr_shaderBrushSpan = null;
        }
        if(arr_shaderBrushSpan != null) {
            for(Object object0: arr_shaderBrushSpan) {
                ((ShaderBrushSpan)object0).setSize-uvyYCjk(SizeKt.Size(this.getWidth(), this.getHeight()));
            }
        }
        CharSequence charSequence2 = this.f;
        if(charSequence2 instanceof Spanned) {
            Object[] arr_object = ((Spanned)charSequence2).getSpans(0, charSequence2.length(), PlaceholderSpan.class);
            ArrayList arrayList0 = new ArrayList(arr_object.length);
            for(int v9 = 0; v9 < arr_object.length; ++v9) {
                PlaceholderSpan placeholderSpan0 = (PlaceholderSpan)arr_object[v9];
                int v10 = ((Spanned)charSequence2).getSpanStart(placeholderSpan0);
                int v11 = ((Spanned)charSequence2).getSpanEnd(placeholderSpan0);
                int v12 = this.e.getLineForOffset(v10);
                if(this.e.getLineEllipsisCount(v12) > 0 && v11 > this.e.getLineEllipsisOffset(v12) || v11 > this.e.getLineEnd(v12) || v12 >= this.b) {
                    rect0 = null;
                }
                else {
                    switch(WhenMappings.$EnumSwitchMapping$0[this.getBidiRunDirection(v10).ordinal()]) {
                        case 1: {
                            f = this.getHorizontalPosition(v10, true);
                            break;
                        }
                        case 2: {
                            f = this.getHorizontalPosition(v10, true) - ((float)placeholderSpan0.getWidthPx());
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    float f1 = ((float)placeholderSpan0.getWidthPx()) + f;
                    TextLayout textLayout2 = this.e;
                    switch(placeholderSpan0.getVerticalAlign()) {
                        case 0: {
                            f2 = textLayout2.getLineBaseline(v12) - ((float)placeholderSpan0.getHeightPx());
                            break;
                        }
                        case 1: {
                            f2 = textLayout2.getLineTop(v12);
                            break;
                        }
                        case 2: {
                            f2 = textLayout2.getLineBottom(v12) - ((float)placeholderSpan0.getHeightPx());
                            break;
                        }
                        case 3: {
                            float f3 = textLayout2.getLineTop(v12);
                            f2 = (textLayout2.getLineBottom(v12) + f3 - ((float)placeholderSpan0.getHeightPx())) / 2.0f;
                            break;
                        }
                        case 4: {
                            f4 = (float)placeholderSpan0.getFontMetrics().ascent;
                            f2 = textLayout2.getLineBaseline(v12) + f4;
                            break;
                        }
                        case 5: {
                            float f5 = (float)placeholderSpan0.getFontMetrics().descent;
                            f2 = textLayout2.getLineBaseline(v12) + f5 - ((float)placeholderSpan0.getHeightPx());
                            break;
                        }
                        case 6: {
                            Paint.FontMetricsInt paint$FontMetricsInt0 = placeholderSpan0.getFontMetrics();
                            f4 = (float)((paint$FontMetricsInt0.ascent + paint$FontMetricsInt0.descent - placeholderSpan0.getHeightPx()) / 2);
                            f2 = textLayout2.getLineBaseline(v12) + f4;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    rect0 = new Rect(f, f2, f1, ((float)placeholderSpan0.getHeightPx()) + f2);
                }
                arrayList0.add(rect0);
            }
            list0 = arrayList0;
        }
        else {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this.g = list0;
    }

    public AndroidParagraph(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, long v1, Resolver fontFamily$Resolver0, Density density0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, fontFamily$Resolver0, density0), v, z, v1, null);
    }

    public final TextLayout a(int v, int v1, TextUtils.TruncateAt textUtils$TruncateAt0, int v2, int v3, int v4, int v5, int v6) {
        AndroidTextPaint androidTextPaint0 = this.getTextPaint$ui_text_release();
        boolean z = AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.a.getStyle());
        return new TextLayout(this.f, this.getWidth(), androidTextPaint0, v, textUtils$TruncateAt0, this.a.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, z, true, v2, v4, v5, v6, v3, v1, null, null, this.a.getLayoutIntrinsics$ui_text_release(), 0x30080, null);
    }

    public final void b(Canvas canvas0) {
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
        if(this.getDidExceedMaxLines()) {
            canvas1.save();
            canvas1.clipRect(0.0f, 0.0f, this.getWidth(), this.getHeight());
        }
        this.e.paint(canvas1);
        if(this.getDidExceedMaxLines()) {
            canvas1.restore();
        }
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public void fillBoundingBoxes-8ffj60Q(long v, @NotNull float[] arr_f, @IntRange(from = 0L) int v1) {
        this.e.fillBoundingBoxes(TextRange.getMin-impl(v), TextRange.getMax-impl(v), arr_f, v1);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getBidiRunDirection(int v) {
        return this.e.isRtlCharAt(v) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getBoundingBox(int v) {
        CharSequence charSequence0 = this.f;
        if(v >= 0 && v < charSequence0.length()) {
            RectF rectF0 = this.e.getBoundingBox(v);
            return new Rect(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
        }
        StringBuilder stringBuilder0 = b.s(v, "offset(", ") is out of bounds [0,");
        stringBuilder0.append(charSequence0.length());
        stringBuilder0.append(')');
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @NotNull
    public final CharSequence getCharSequence$ui_text_release() {
        return this.f;
    }

    @VisibleForTesting
    public static void getCharSequence$ui_text_release$annotations() {
    }

    public final long getConstraints-msEJaDk() {
        return this.d;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getCursorRect(int v) {
        CharSequence charSequence0 = this.f;
        if(v >= 0 && v <= charSequence0.length()) {
            float f = TextLayout.getPrimaryHorizontal$default(this.e, v, false, 2, null);
            int v1 = this.e.getLineForOffset(v);
            return new Rect(f, this.e.getLineTop(v1), f, this.e.getLineBottom(v1));
        }
        StringBuilder stringBuilder0 = b.s(v, "offset(", ") is out of bounds [0,");
        stringBuilder0.append(charSequence0.length());
        stringBuilder0.append(']');
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.e.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.c;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return this.getLineBaseline(0);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return (float)this.e.getHeight();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int v, boolean z) {
        return z ? TextLayout.getPrimaryHorizontal$default(this.e, v, false, 2, null) : TextLayout.getSecondaryHorizontal$default(this.e, v, false, 2, null);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return this.getLineBaseline(this.getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int v) {
        return this.e.getLineAscent(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineBaseline(int v) {
        return this.e.getLineBaseline(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int v) {
        return this.e.getLineBottom(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.e.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int v) {
        return this.e.getLineDescent(v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int v, boolean z) {
        return z ? this.e.getLineVisibleEnd(v) : this.e.getLineEnd(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int v) {
        return this.e.getLineForOffset(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f) {
        return this.e.getLineForVertical(((int)f));
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int v) {
        return this.e.getLineHeight(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int v) {
        return this.e.getLineLeft(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineRight(int v) {
        return this.e.getLineRight(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineStart(int v) {
        return this.e.getLineStart(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineTop(int v) {
        return this.e.getLineTop(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int v) {
        return this.e.getLineWidth(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.a.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.b;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.a.getMinIntrinsicWidth();
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getOffsetForPosition-k-4lQ0M(long v) {
        int v1 = this.e.getLineForVertical(((int)Offset.getY-impl(v)));
        return this.e.getOffsetForHorizontal(v1, Offset.getX-impl(v));
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getParagraphDirection(int v) {
        int v1 = this.e.getLineForOffset(v);
        return this.e.getParagraphDirection(v1) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @NotNull
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @NotNull
    public Path getPathForRange(int v, int v1) {
        CharSequence charSequence0 = this.f;
        if(v >= 0 && v <= v1 && v1 <= charSequence0.length()) {
            android.graphics.Path path0 = new android.graphics.Path();
            this.e.getSelectionPath(v, v1, path0);
            return AndroidPath_androidKt.asComposePath(path0);
        }
        StringBuilder stringBuilder0 = q.u("start(", v, ") or end(", v1, ") is out of range [0..");
        stringBuilder0.append(charSequence0.length());
        stringBuilder0.append("], or start > end!");
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @NotNull
    public List getPlaceholderRects() {
        return this.g;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public long getRangeForRect-8-6BmAI(@NotNull Rect rect0, int v, @NotNull TextInclusionStrategy textInclusionStrategy0) {
        RectF rectF0 = RectHelper_androidKt.toAndroidRectF(rect0);
        int v1 = AndroidParagraph_androidKt.access$toLayoutTextGranularity-duNsdkg(v);
        b1 b10 = new b1(textInclusionStrategy0, 7);
        int[] arr_v = this.e.getRangeForRect(rectF0, v1, b10);
        return arr_v == null ? 0L : TextRangeKt.TextRange(arr_v[0], arr_v[1]);
    }

    @NotNull
    public final Locale getTextLocale$ui_text_release() {
        return this.a.getTextPaint$ui_text_release().getTextLocale();
    }

    @VisibleForTesting
    public static void getTextLocale$ui_text_release$annotations() {
    }

    @NotNull
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.a.getTextPaint$ui_text_release();
    }

    @VisibleForTesting
    public static void getTextPaint$ui_text_release$annotations() {
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return (float)Constraints.getMaxWidth-impl(this.d);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public long getWordBoundary--jx7JFs(int v) {
        WordIterator wordIterator0 = this.e.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator0, v), WordBoundary_androidKt.getWordEnd(wordIterator0, v));
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int v) {
        return this.e.isLineEllipsized(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public void paint-LG529CI(@NotNull Canvas canvas0, long v, @Nullable Shadow shadow0, @Nullable TextDecoration textDecoration0, @Nullable DrawStyle drawStyle0, int v1) {
        int v2 = this.getTextPaint$ui_text_release().getBlendMode-0nO6VwU();
        AndroidTextPaint androidTextPaint0 = this.getTextPaint$ui_text_release();
        androidTextPaint0.setColor-8_81llA(v);
        androidTextPaint0.setShadow(shadow0);
        androidTextPaint0.setTextDecoration(textDecoration0);
        androidTextPaint0.setDrawStyle(drawStyle0);
        androidTextPaint0.setBlendMode-s9anfk8(v1);
        this.b(canvas0);
        this.getTextPaint$ui_text_release().setBlendMode-s9anfk8(v2);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public void paint-RPmYEkk(@NotNull Canvas canvas0, long v, @Nullable Shadow shadow0, @Nullable TextDecoration textDecoration0) {
        AndroidTextPaint androidTextPaint0 = this.getTextPaint$ui_text_release();
        androidTextPaint0.setColor-8_81llA(v);
        androidTextPaint0.setShadow(shadow0);
        androidTextPaint0.setTextDecoration(textDecoration0);
        this.b(canvas0);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public void paint-hn5TExg(@NotNull Canvas canvas0, @NotNull Brush brush0, float f, @Nullable Shadow shadow0, @Nullable TextDecoration textDecoration0, @Nullable DrawStyle drawStyle0, int v) {
        int v1 = this.getTextPaint$ui_text_release().getBlendMode-0nO6VwU();
        AndroidTextPaint androidTextPaint0 = this.getTextPaint$ui_text_release();
        androidTextPaint0.setBrush-12SF9DM(brush0, SizeKt.Size(this.getWidth(), this.getHeight()), f);
        androidTextPaint0.setShadow(shadow0);
        androidTextPaint0.setTextDecoration(textDecoration0);
        androidTextPaint0.setDrawStyle(drawStyle0);
        androidTextPaint0.setBlendMode-s9anfk8(v);
        this.b(canvas0);
        this.getTextPaint$ui_text_release().setBlendMode-s9anfk8(v1);
    }
}

