package androidx.compose.ui.text;

import a5.b;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00D2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BB[\b\u0017\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0014\b\u0002\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u0012\u0006\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\n\u0010\u0018B[\b\u0017\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u0012\u0006\u0010\u001A\u001A\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\n\u0010\u001BB+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u001D\u001A\u00020\u001C\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\n\u0010\u001EB[\b\u0016\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u001D\u001A\u00020\u001C\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u0012\u0006\u0010\u001A\u001A\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\n\u0010\u001FJ<\u0010+\u001A\u00020(2\u0006\u0010!\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020\"2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*JP\u0010+\u001A\u00020(2\u0006\u0010!\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020\"2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\n\b\u0002\u0010-\u001A\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001A\u00020.\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101JX\u0010+\u001A\u00020(2\u0006\u0010!\u001A\u00020 2\u0006\u00103\u001A\u0002022\b\b\u0002\u00104\u001A\u00020\b2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\n\b\u0002\u0010-\u001A\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001A\u00020.\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106J\u001D\u0010:\u001A\u0002092\u0006\u00107\u001A\u00020\u00042\u0006\u00108\u001A\u00020\u0004\u00A2\u0006\u0004\b:\u0010;J\u0015\u0010=\u001A\u00020\u00042\u0006\u0010<\u001A\u00020\b\u00A2\u0006\u0004\b=\u0010>J\u0018\u0010C\u001A\u00020\u00042\u0006\u0010@\u001A\u00020?\u00F8\u0001\u0000\u00A2\u0006\u0004\bA\u0010BJ(\u0010M\u001A\u00020J2\u0006\u0010E\u001A\u00020D2\u0006\u0010G\u001A\u00020F2\u0006\u0010I\u001A\u00020H\u00F8\u0001\u0000\u00A2\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001A\u00020D2\u0006\u0010N\u001A\u00020\u0004\u00A2\u0006\u0004\bO\u0010PJ*\u0010W\u001A\u00020R2\u0006\u0010Q\u001A\u00020J2\u0006\u0010S\u001A\u00020R2\b\b\u0001\u0010T\u001A\u00020\u0004\u00F8\u0001\u0000\u00A2\u0006\u0004\bU\u0010VJ\u001D\u0010Y\u001A\u00020\b2\u0006\u0010N\u001A\u00020\u00042\u0006\u0010X\u001A\u00020\u0006\u00A2\u0006\u0004\bY\u0010ZJ\u0015\u0010\\\u001A\u00020[2\u0006\u0010N\u001A\u00020\u0004\u00A2\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001A\u00020[2\u0006\u0010N\u001A\u00020\u0004\u00A2\u0006\u0004\b^\u0010]J\u001B\u0010a\u001A\u00020J2\u0006\u0010N\u001A\u00020\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b_\u0010`J\u0015\u0010b\u001A\u00020D2\u0006\u0010N\u001A\u00020\u0004\u00A2\u0006\u0004\bb\u0010PJ\u0015\u0010c\u001A\u00020\u00042\u0006\u0010N\u001A\u00020\u0004\u00A2\u0006\u0004\bc\u0010dJ\u0015\u0010f\u001A\u00020\b2\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\bf\u0010gJ\u0015\u0010h\u001A\u00020\b2\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\bh\u0010gJ\u0015\u0010i\u001A\u00020\b2\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\bi\u0010gJ\u0015\u0010j\u001A\u00020\b2\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\bj\u0010gJ\u0015\u0010k\u001A\u00020\b2\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\bk\u0010gJ\u0015\u0010l\u001A\u00020\b2\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\bl\u0010gJ\u0015\u0010m\u001A\u00020\b2\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\bm\u0010gJ\u0015\u0010n\u001A\u00020\u00042\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\bn\u0010dJ\u001F\u0010p\u001A\u00020\u00042\u0006\u0010e\u001A\u00020\u00042\b\b\u0002\u0010o\u001A\u00020\u0006\u00A2\u0006\u0004\bp\u0010qJ\u0015\u0010r\u001A\u00020\u00062\u0006\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\br\u0010sR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010wR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bx\u0010y\u001A\u0004\bz\u0010{R\u0018\u0010\u0080\u0001\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b|\u0010}\u001A\u0004\b~\u0010\u007FR\u001B\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001A\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001C\u0010\u0087\u0001\u001A\u00020\b8\u0006\u00A2\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0082\u0001\u001A\u0006\b\u0086\u0001\u0010\u0084\u0001R\u001A\u0010\u008A\u0001\u001A\u00020\u00048\u0006\u00A2\u0006\u000E\n\u0005\b\u0088\u0001\u0010y\u001A\u0005\b\u0089\u0001\u0010{R$\u0010\u008F\u0001\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u00108\u0006\u00A2\u0006\u0010\n\u0006\b\u008B\u0001\u0010\u008C\u0001\u001A\u0006\b\u008D\u0001\u0010\u008E\u0001R&\u0010\u0093\u0001\u001A\t\u0012\u0005\u0012\u00030\u0090\u00010\u00108\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u008C\u0001\u001A\u0006\b\u0092\u0001\u0010\u008E\u0001R\u0014\u0010\u0095\u0001\u001A\u00020\b8F\u00A2\u0006\b\u001A\u0006\b\u0094\u0001\u0010\u0084\u0001R\u0014\u0010\u0097\u0001\u001A\u00020\b8F\u00A2\u0006\b\u001A\u0006\b\u0096\u0001\u0010\u0084\u0001R\u0014\u0010\u0099\u0001\u001A\u00020\b8F\u00A2\u0006\b\u001A\u0006\b\u0098\u0001\u0010\u0084\u0001R\u0014\u0010\u009B\u0001\u001A\u00020\b8F\u00A2\u0006\b\u001A\u0006\b\u009A\u0001\u0010\u0084\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u009C\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "", "maxLines", "", "ellipsis", "", "width", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "offset", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "fillBoundingBoxes", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "(I)I", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBaseline", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "a", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "b", "I", "getMaxLines", "()I", "c", "Z", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "d", "F", "getWidth", "()F", "e", "getHeight", "height", "f", "getLineCount", "lineCount", "g", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/ParagraphInfo;", "h", "getParagraphInfoList$ui_text_release", "paragraphInfoList", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1145:1\n508#2,3:1146\n33#2,4:1149\n511#2:1153\n151#2,3:1154\n33#2,4:1157\n154#2,2:1161\n38#2:1163\n156#2:1164\n512#2,2:1165\n38#2:1167\n514#2:1168\n33#2,6:1170\n33#2,6:1176\n1#3:1169\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n372#1:1146,3\n372#1:1149,4\n372#1:1153\n374#1:1154,3\n374#1:1157,4\n374#1:1161,2\n374#1:1163\n374#1:1164\n372#1:1165,2\n372#1:1167\n372#1:1168\n400#1:1170,6\n417#1:1176,6\n*E\n"})
public final class MultiParagraph {
    public static final int $stable = 8;
    public final MultiParagraphIntrinsics a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final List g;
    public final ArrayList h;

    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, float f, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, @NotNull List list0, int v, boolean z) {
        this(new MultiParagraphIntrinsics(annotatedString0, textStyle0, list0, density0, fontFamily$Resolver0), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), v, z, null);
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, float f, Density density0, Resolver fontFamily$Resolver0, List list0, int v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, f, density0, fontFamily$Resolver0, ((v1 & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v1 & 0x40) == 0 ? v : 0x7FFFFFFF), ((v1 & 0x80) == 0 ? z : false));
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, long v, Density density0, Resolver fontFamily$Resolver0, List list0, int v1, boolean z, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, v, density0, fontFamily$Resolver0, ((v2 & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v2 & 0x40) == 0 ? v1 : 0x7FFFFFFF), ((v2 & 0x80) == 0 ? z : false), null);
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, long v, Density density0, Resolver fontFamily$Resolver0, List list0, int v1, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this(new MultiParagraphIntrinsics(annotatedString0, textStyle0, list0, density0, fontFamily$Resolver0), v, v1, z, null);
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(@NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, @NotNull List list0, int v, boolean z, float f, @NotNull Density density0, @NotNull ResourceLoader font$ResourceLoader0) {
        this(new MultiParagraphIntrinsics(annotatedString0, textStyle0, list0, density0, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(font$ResourceLoader0)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), v, z, null);
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, ((v1 & 4) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v1 & 8) == 0 ? v : 0x7FFFFFFF), ((v1 & 16) == 0 ? z : false), f, density0, font$ResourceLoader0);
    }

    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@NotNull MultiParagraphIntrinsics multiParagraphIntrinsics0, int v, boolean z, float f) {
        this(multiParagraphIntrinsics0, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), v, z, null);
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, int v, boolean z, float f, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        this(multiParagraphIntrinsics0, v, z, f);
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, long v, int v1, boolean z, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            v1 = 0x7FFFFFFF;
        }
        if((v2 & 8) != 0) {
            z = false;
        }
        this(multiParagraphIntrinsics0, v, v1, z, null);
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, long v, int v1, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = multiParagraphIntrinsics0;
        this.b = v1;
        if(Constraints.getMinWidth-impl(v) != 0 || Constraints.getMinHeight-impl(v) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        boolean z1 = false;
        ArrayList arrayList0 = new ArrayList();
        List list0 = multiParagraphIntrinsics0.getInfoList$ui_text_release();
        int v2 = list0.size();
        int v3 = 0;
        float f = 0.0f;
        int v4 = 0;
        while(v4 < v2) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo0 = (ParagraphIntrinsicInfo)list0.get(v4);
            Paragraph paragraph0 = ParagraphKt.Paragraph-_EkL_-Y(paragraphIntrinsicInfo0.getIntrinsics(), ConstraintsKt.Constraints$default(0, Constraints.getMaxWidth-impl(v), 0, (Constraints.getHasBoundedHeight-impl(v) ? c.coerceAtLeast(Constraints.getMaxHeight-impl(v) - ParagraphKt.ceilToInt(f), 0) : Constraints.getMaxHeight-impl(v)), 5, null), this.b - v3, z);
            float f1 = paragraph0.getHeight() + f;
            int v5 = paragraph0.getLineCount() + v3;
            int v6 = v5;
            arrayList0.add(new ParagraphInfo(paragraph0, paragraphIntrinsicInfo0.getStartIndex(), paragraphIntrinsicInfo0.getEndIndex(), v3, v5, f, f1));
            if(paragraph0.getDidExceedMaxLines() || v6 == this.b && v4 != CollectionsKt__CollectionsKt.getLastIndex(this.a.getInfoList$ui_text_release())) {
                z1 = true;
                v3 = v6;
                f = f1;
                break;
            }
            ++v4;
            v3 = v6;
            f = f1;
        }
        this.e = f;
        this.f = v3;
        this.c = z1;
        this.h = arrayList0;
        this.d = (float)Constraints.getMaxWidth-impl(v);
        List list1 = new ArrayList(arrayList0.size());
        int v7 = arrayList0.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)arrayList0.get(v8);
            List list2 = paragraphInfo0.getParagraph().getPlaceholderRects();
            ArrayList arrayList1 = new ArrayList(list2.size());
            int v9 = list2.size();
            for(int v10 = 0; v10 < v9; ++v10) {
                Rect rect0 = (Rect)list2.get(v10);
                arrayList1.add((rect0 == null ? null : paragraphInfo0.toGlobal(rect0)));
            }
            o.addAll(list1, arrayList1);
        }
        if(((ArrayList)list1).size() < this.a.getPlaceholders().size()) {
            int v11 = this.a.getPlaceholders().size() - ((ArrayList)list1).size();
            ArrayList arrayList2 = new ArrayList(v11);
            for(int v12 = 0; v12 < v11; ++v12) {
                arrayList2.add(null);
            }
            list1 = CollectionsKt___CollectionsKt.plus(list1, arrayList2);
        }
        this.g = list1;
    }

    public final void a(int v) {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.a;
        if(v >= 0 && v < multiParagraphIntrinsics0.getAnnotatedString().getText().length()) {
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "offset(", ") is out of bounds [0, ");
        stringBuilder0.append(multiParagraphIntrinsics0.getAnnotatedString().length());
        stringBuilder0.append(')');
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    public final void b(int v) {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.a;
        if(v >= 0 && v <= multiParagraphIntrinsics0.getAnnotatedString().getText().length()) {
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "offset(", ") is out of bounds [0, ");
        stringBuilder0.append(multiParagraphIntrinsics0.getAnnotatedString().length());
        stringBuilder0.append(']');
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    public final void c(int v) {
        int v1 = this.f;
        if(v < 0 || v >= v1) {
            throw new IllegalArgumentException(("lineIndex(" + v + ") is out of bounds [0, " + v1 + ')').toString());
        }
    }

    @NotNull
    public final float[] fillBoundingBoxes-8ffj60Q(long v, @NotNull float[] arr_f, @IntRange(from = 0L) int v1) {
        this.a(TextRange.getMin-impl(v));
        this.b(TextRange.getMax-impl(v));
        IntRef ref$IntRef0 = new IntRef();
        ref$IntRef0.element = v1;
        h h0 = new h(v, arr_f, ref$IntRef0, new FloatRef());
        MultiParagraphKt.findParagraphsByRange-Sb-Bc2M(this.h, v, h0);
        return arr_f;
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int v) {
        this.b(v);
        int v1 = v == this.a.getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.h) : MultiParagraphKt.findParagraphByIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.getParagraph().getBidiRunDirection(paragraphInfo0.toLocalIndex(v));
    }

    @NotNull
    public final Rect getBoundingBox(int v) {
        this.a(v);
        int v1 = MultiParagraphKt.findParagraphByIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.toGlobal(paragraphInfo0.getParagraph().getBoundingBox(paragraphInfo0.toLocalIndex(v)));
    }

    @NotNull
    public final Rect getCursorRect(int v) {
        this.b(v);
        int v1 = v == this.a.getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.h) : MultiParagraphKt.findParagraphByIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.toGlobal(paragraphInfo0.getParagraph().getCursorRect(paragraphInfo0.toLocalIndex(v)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    public final float getFirstBaseline() {
        return this.h.isEmpty() ? 0.0f : ((ParagraphInfo)this.h.get(0)).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.e;
    }

    public final float getHorizontalPosition(int v, boolean z) {
        this.b(v);
        int v1 = v == this.a.getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.h) : MultiParagraphKt.findParagraphByIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.getParagraph().getHorizontalPosition(paragraphInfo0.toLocalIndex(v), z);
    }

    @NotNull
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.a;
    }

    public final float getLastBaseline() {
        ArrayList arrayList0 = this.h;
        if(arrayList0.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)CollectionsKt___CollectionsKt.last(arrayList0);
        return paragraphInfo0.toGlobalYPosition(paragraphInfo0.getParagraph().getLastBaseline());
    }

    public final float getLineBaseline(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.toGlobalYPosition(paragraphInfo0.getParagraph().getLineBaseline(paragraphInfo0.toLocalLineIndex(v)));
    }

    public final float getLineBottom(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.toGlobalYPosition(paragraphInfo0.getParagraph().getLineBottom(paragraphInfo0.toLocalLineIndex(v)));
    }

    public final int getLineCount() {
        return this.f;
    }

    public final int getLineEnd(int v, boolean z) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.toGlobalIndex(paragraphInfo0.getParagraph().getLineEnd(paragraphInfo0.toLocalLineIndex(v), z));
    }

    public static int getLineEnd$default(MultiParagraph multiParagraph0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return multiParagraph0.getLineEnd(v, z);
    }

    public final int getLineForOffset(int v) {
        int v1;
        ArrayList arrayList0 = this.h;
        if(v >= this.a.getAnnotatedString().length()) {
            v1 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
        }
        else {
            v1 = v >= 0 ? MultiParagraphKt.findParagraphByIndex(arrayList0, v) : 0;
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)arrayList0.get(v1);
        return paragraphInfo0.toGlobalLineIndex(paragraphInfo0.getParagraph().getLineForOffset(paragraphInfo0.toLocalIndex(v)));
    }

    public final int getLineForVerticalPosition(float f) {
        int v = MultiParagraphKt.findParagraphByY(this.h, f);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v);
        return paragraphInfo0.getLength() == 0 ? paragraphInfo0.getStartLineIndex() : paragraphInfo0.toGlobalLineIndex(paragraphInfo0.getParagraph().getLineForVerticalPosition(paragraphInfo0.toLocalYPosition(f)));
    }

    public final float getLineHeight(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.getParagraph().getLineHeight(paragraphInfo0.toLocalLineIndex(v));
    }

    public final float getLineLeft(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.getParagraph().getLineLeft(paragraphInfo0.toLocalLineIndex(v));
    }

    public final float getLineRight(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.getParagraph().getLineRight(paragraphInfo0.toLocalLineIndex(v));
    }

    public final int getLineStart(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.toGlobalIndex(paragraphInfo0.getParagraph().getLineStart(paragraphInfo0.toLocalLineIndex(v)));
    }

    public final float getLineTop(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.toGlobalYPosition(paragraphInfo0.getParagraph().getLineTop(paragraphInfo0.toLocalLineIndex(v)));
    }

    public final float getLineWidth(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.getParagraph().getLineWidth(paragraphInfo0.toLocalLineIndex(v));
    }

    public final float getMaxIntrinsicWidth() {
        return this.a.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.b;
    }

    public final float getMinIntrinsicWidth() {
        return this.a.getMinIntrinsicWidth();
    }

    public final int getOffsetForPosition-k-4lQ0M(long v) {
        int v1 = MultiParagraphKt.findParagraphByY(this.h, Offset.getY-impl(v));
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.getLength() == 0 ? paragraphInfo0.getStartIndex() : paragraphInfo0.toGlobalIndex(paragraphInfo0.getParagraph().getOffsetForPosition-k-4lQ0M(paragraphInfo0.toLocal-MK-Hz9U(v)));
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int v) {
        this.b(v);
        int v1 = v == this.a.getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.h) : MultiParagraphKt.findParagraphByIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.getParagraph().getParagraphDirection(paragraphInfo0.toLocalIndex(v));
    }

    @NotNull
    public final List getParagraphInfoList$ui_text_release() {
        return this.h;
    }

    @NotNull
    public final Path getPathForRange(int v, int v1) {
        MultiParagraphIntrinsics multiParagraphIntrinsics0 = this.a;
        if(v >= 0 && v <= v1 && v1 <= multiParagraphIntrinsics0.getAnnotatedString().getText().length()) {
            if(v == v1) {
                return AndroidPath_androidKt.Path();
            }
            Path path0 = AndroidPath_androidKt.Path();
            long v2 = TextRangeKt.TextRange(v, v1);
            i i0 = new i(v, v1, 0, path0);
            MultiParagraphKt.findParagraphsByRange-Sb-Bc2M(this.h, v2, i0);
            return path0;
        }
        StringBuilder stringBuilder0 = q.u("Start(", v, ") or End(", v1, ") is out of range [0..");
        stringBuilder0.append(multiParagraphIntrinsics0.getAnnotatedString().getText().length());
        stringBuilder0.append("), or start > end!");
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @NotNull
    public final List getPlaceholderRects() {
        return this.g;
    }

    public final long getRangeForRect-8-6BmAI(@NotNull Rect rect0, int v, @NotNull TextInclusionStrategy textInclusionStrategy0) {
        ArrayList arrayList0 = this.h;
        int v1 = MultiParagraphKt.findParagraphByY(arrayList0, rect0.getTop());
        if(((ParagraphInfo)arrayList0.get(v1)).getBottom() < rect0.getBottom() && v1 != CollectionsKt__CollectionsKt.getLastIndex(arrayList0)) {
            int v2 = MultiParagraphKt.findParagraphByY(arrayList0, rect0.getBottom());
            long v3 = 0L;
            while(TextRange.equals-impl0(v3, 0L) && v1 <= v2) {
                Object object0 = arrayList0.get(v1);
                v3 = ParagraphInfo.toGlobal-xdX6-G0$default(((ParagraphInfo)object0), ((ParagraphInfo)object0).getParagraph().getRangeForRect-8-6BmAI(((ParagraphInfo)object0).toLocal(rect0), v, textInclusionStrategy0), false, 1, null);
                ++v1;
            }
            if(TextRange.equals-impl0(v3, 0L)) {
                return 0L;
            }
            long v4 = 0L;
            while(TextRange.equals-impl0(v4, 0L) && v1 <= v2) {
                Object object1 = arrayList0.get(v2);
                v4 = ParagraphInfo.toGlobal-xdX6-G0$default(((ParagraphInfo)object1), ((ParagraphInfo)object1).getParagraph().getRangeForRect-8-6BmAI(((ParagraphInfo)object1).toLocal(rect0), v, textInclusionStrategy0), false, 1, null);
                --v2;
            }
            return TextRange.equals-impl0(v4, 0L) ? v3 : TextRangeKt.TextRange(TextRange.getStart-impl(v3), TextRange.getEnd-impl(v4));
        }
        Object object2 = arrayList0.get(v1);
        return ParagraphInfo.toGlobal-xdX6-G0$default(((ParagraphInfo)object2), ((ParagraphInfo)object2).getParagraph().getRangeForRect-8-6BmAI(((ParagraphInfo)object2).toLocal(rect0), v, textInclusionStrategy0), false, 1, null);
    }

    public final float getWidth() {
        return this.d;
    }

    public final long getWordBoundary--jx7JFs(int v) {
        this.b(v);
        int v1 = v == this.a.getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.h) : MultiParagraphKt.findParagraphByIndex(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.toGlobal-xdX6-G0(paragraphInfo0.getParagraph().getWordBoundary--jx7JFs(paragraphInfo0.toLocalIndex(v)), false);
    }

    public final boolean isLineEllipsized(int v) {
        this.c(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.h, v);
        return ((ParagraphInfo)this.h.get(v1)).getParagraph().isLineEllipsized(v);
    }

    public final void paint-LG529CI(@NotNull Canvas canvas0, long v, @Nullable Shadow shadow0, @Nullable TextDecoration textDecoration0, @Nullable DrawStyle drawStyle0, int v1) {
        canvas0.save();
        ArrayList arrayList0 = this.h;
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)arrayList0.get(v3);
            paragraphInfo0.getParagraph().paint-LG529CI(canvas0, v, shadow0, textDecoration0, drawStyle0, v1);
            canvas0.translate(0.0f, paragraphInfo0.getParagraph().getHeight());
        }
        canvas0.restore();
    }

    // 去混淆评级： 低(25)
    public static void paint-LG529CI$default(MultiParagraph multiParagraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v1, int v2, Object object0) {
        multiParagraph0.paint-LG529CI(canvas0, ((v2 & 2) == 0 ? v : 0L), ((v2 & 4) == 0 ? shadow0 : null), ((v2 & 8) == 0 ? textDecoration0 : null), ((v2 & 16) == 0 ? drawStyle0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    public final void paint-RPmYEkk(Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0) {
        canvas0.save();
        ArrayList arrayList0 = this.h;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)arrayList0.get(v2);
            paragraphInfo0.getParagraph().paint-RPmYEkk(canvas0, v, shadow0, textDecoration0);
            canvas0.translate(0.0f, paragraphInfo0.getParagraph().getHeight());
        }
        canvas0.restore();
    }

    public static void paint-RPmYEkk$default(MultiParagraph multiParagraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        multiParagraph0.paint-RPmYEkk(canvas0, v, ((v1 & 4) == 0 ? shadow0 : null), ((v1 & 8) == 0 ? textDecoration0 : null));
    }

    public final void paint-hn5TExg(@NotNull Canvas canvas0, @NotNull Brush brush0, float f, @Nullable Shadow shadow0, @Nullable TextDecoration textDecoration0, @Nullable DrawStyle drawStyle0, int v) {
        AndroidMultiParagraphDraw_androidKt.drawMultiParagraph-7AXcY_I(this, canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v);
    }

    public static void paint-hn5TExg$default(MultiParagraph multiParagraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v, int v1, Object object0) {
        multiParagraph0.paint-hn5TExg(canvas0, brush0, ((v1 & 4) == 0 ? f : NaNf), ((v1 & 8) == 0 ? shadow0 : null), ((v1 & 16) == 0 ? textDecoration0 : null), ((v1 & 0x20) == 0 ? drawStyle0 : null), ((v1 & 0x40) == 0 ? v : 3));
    }
}

