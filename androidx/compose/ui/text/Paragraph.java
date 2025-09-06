package androidx.compose.ui.text;

import androidx.annotation.IntRange;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u009E\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J,\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020 2\u0006\u0010!\u001A\u00020\"2\b\b\u0001\u0010#\u001A\u00020\u000FH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\'2\u0006\u0010(\u001A\u00020\u000FH&J\u0010\u0010)\u001A\u00020\u00182\u0006\u0010(\u001A\u00020\u000FH&J\u0010\u0010*\u001A\u00020\u00182\u0006\u0010(\u001A\u00020\u000FH&J\u0018\u0010+\u001A\u00020\u00072\u0006\u0010(\u001A\u00020\u000F2\u0006\u0010,\u001A\u00020\u0003H&J\u0010\u0010-\u001A\u00020\u00072\u0006\u0010.\u001A\u00020\u000FH&J\u0010\u0010/\u001A\u00020\u00072\u0006\u0010.\u001A\u00020\u000FH&J\u001A\u00100\u001A\u00020\u000F2\u0006\u0010.\u001A\u00020\u000F2\b\b\u0002\u00101\u001A\u00020\u0003H&J\u0010\u00102\u001A\u00020\u000F2\u0006\u0010(\u001A\u00020\u000FH&J\u0010\u00103\u001A\u00020\u000F2\u0006\u00104\u001A\u00020\u0007H&J\u0010\u00105\u001A\u00020\u00072\u0006\u0010.\u001A\u00020\u000FH&J\u0010\u00106\u001A\u00020\u00072\u0006\u0010.\u001A\u00020\u000FH&J\u0010\u00107\u001A\u00020\u00072\u0006\u0010.\u001A\u00020\u000FH&J\u0010\u00108\u001A\u00020\u000F2\u0006\u0010.\u001A\u00020\u000FH&J\u0010\u00109\u001A\u00020\u00072\u0006\u0010.\u001A\u00020\u000FH&J\u0010\u0010:\u001A\u00020\u00072\u0006\u0010.\u001A\u00020\u000FH&J\u001A\u0010;\u001A\u00020\u000F2\u0006\u0010<\u001A\u00020=H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b>\u0010?J\u0010\u0010@\u001A\u00020\'2\u0006\u0010(\u001A\u00020\u000FH&J\u0018\u0010A\u001A\u00020B2\u0006\u0010C\u001A\u00020\u000F2\u0006\u0010D\u001A\u00020\u000FH&J*\u0010E\u001A\u00020 2\u0006\u0010F\u001A\u00020\u00182\u0006\u0010G\u001A\u00020H2\u0006\u0010I\u001A\u00020JH&\u00F8\u0001\u0000\u00A2\u0006\u0004\bK\u0010LJ\u001D\u0010M\u001A\u00020 2\u0006\u0010(\u001A\u00020\u000FH&\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001A\u00020\u00032\u0006\u0010.\u001A\u00020\u000FH&JZ\u0010Q\u001A\u00020\u001E2\u0006\u0010R\u001A\u00020S2\u0006\u0010T\u001A\u00020U2\b\b\u0002\u0010V\u001A\u00020\u00072\n\b\u0002\u0010W\u001A\u0004\u0018\u00010X2\n\b\u0002\u0010Y\u001A\u0004\u0018\u00010Z2\n\b\u0002\u0010[\u001A\u0004\u0018\u00010\\2\b\b\u0002\u0010]\u001A\u00020^H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b_\u0010`J<\u0010Q\u001A\u00020\u001E2\u0006\u0010R\u001A\u00020S2\b\b\u0002\u0010a\u001A\u00020b2\n\b\u0002\u0010W\u001A\u0004\u0018\u00010X2\n\b\u0002\u0010Y\u001A\u0004\u0018\u00010ZH&\u00F8\u0001\u0000\u00A2\u0006\u0004\bc\u0010dJR\u0010Q\u001A\u00020\u001E2\u0006\u0010R\u001A\u00020S2\b\b\u0002\u0010a\u001A\u00020b2\n\b\u0002\u0010W\u001A\u0004\u0018\u00010X2\n\b\u0002\u0010Y\u001A\u0004\u0018\u00010Z2\n\b\u0002\u0010[\u001A\u0004\u0018\u00010\\2\b\b\u0002\u0010]\u001A\u00020^H&\u00F8\u0001\u0000\u00A2\u0006\u0004\be\u0010fR\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\tR\u0012\u0010\f\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\tR\u0012\u0010\u000E\u001A\u00020\u000FX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\tR\u001A\u0010\u0016\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0012\u0010\u001B\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\t\u0082\u0001\u0001g\u00F8\u0001\u0002\u0082\u0002\u0011\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001\u00A8\u0006h\u00C0\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "didExceedMaxLines", "", "getDidExceedMaxLines", "()Z", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "lineCount", "", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "minIntrinsicWidth", "getMinIntrinsicWidth", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "width", "getWidth", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBaseline", "lineIndex", "getLineBottom", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getRangeForRect", "rect", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/text/AndroidParagraph;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Paragraph {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static int getLineEnd$default(Paragraph paragraph0, int v, boolean z, int v1, Object object0) {
            return Paragraph.getLineEnd$default(paragraph0, v, z, v1, object0);
        }

        public static void paint-LG529CI$default(Paragraph paragraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v1, int v2, Object object0) {
            Paragraph.paint-LG529CI$default(paragraph0, canvas0, v, shadow0, textDecoration0, drawStyle0, v1, v2, object0);
        }

        public static void paint-RPmYEkk$default(Paragraph paragraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, int v1, Object object0) {
            Paragraph.paint-RPmYEkk$default(paragraph0, canvas0, v, shadow0, textDecoration0, v1, object0);
        }

        public static void paint-hn5TExg$default(Paragraph paragraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v, int v1, Object object0) {
            Paragraph.paint-hn5TExg$default(paragraph0, canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v, v1, object0);
        }
    }

    void fillBoundingBoxes-8ffj60Q(long arg1, @NotNull float[] arg2, @IntRange(from = 0L) int arg3);

    @NotNull
    ResolvedTextDirection getBidiRunDirection(int arg1);

    @NotNull
    Rect getBoundingBox(int arg1);

    @NotNull
    Rect getCursorRect(int arg1);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int arg1, boolean arg2);

    float getLastBaseline();

    float getLineBaseline(int arg1);

    float getLineBottom(int arg1);

    int getLineCount();

    int getLineEnd(int arg1, boolean arg2);

    static int getLineEnd$default(Paragraph paragraph0, int v, boolean z, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        return paragraph0.getLineEnd(v, z);
    }

    int getLineForOffset(int arg1);

    int getLineForVerticalPosition(float arg1);

    float getLineHeight(int arg1);

    float getLineLeft(int arg1);

    float getLineRight(int arg1);

    int getLineStart(int arg1);

    float getLineTop(int arg1);

    float getLineWidth(int arg1);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    int getOffsetForPosition-k-4lQ0M(long arg1);

    @NotNull
    ResolvedTextDirection getParagraphDirection(int arg1);

    @NotNull
    Path getPathForRange(int arg1, int arg2);

    @NotNull
    List getPlaceholderRects();

    long getRangeForRect-8-6BmAI(@NotNull Rect arg1, int arg2, @NotNull TextInclusionStrategy arg3);

    float getWidth();

    long getWordBoundary--jx7JFs(int arg1);

    boolean isLineEllipsized(int arg1);

    void paint-LG529CI(@NotNull Canvas arg1, long arg2, @Nullable Shadow arg3, @Nullable TextDecoration arg4, @Nullable DrawStyle arg5, int arg6);

    static void paint-LG529CI$default(Paragraph paragraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v1, int v2, Object object0) {
        DrawStyle drawStyle1 = null;
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        if((v2 & 16) == 0) {
            drawStyle1 = drawStyle0;
        }
        paragraph0.paint-LG529CI(canvas0, ((v2 & 2) == 0 ? v : 0L), ((v2 & 4) == 0 ? shadow0 : null), ((v2 & 8) == 0 ? textDecoration0 : null), drawStyle1, ((v2 & 0x20) == 0 ? v1 : 3));
    }

    void paint-RPmYEkk(@NotNull Canvas arg1, long arg2, @Nullable Shadow arg3, @Nullable TextDecoration arg4);

    static void paint-RPmYEkk$default(Paragraph paragraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        paragraph0.paint-RPmYEkk(canvas0, v, ((v1 & 4) == 0 ? shadow0 : null), ((v1 & 8) == 0 ? textDecoration0 : null));
    }

    void paint-hn5TExg(@NotNull Canvas arg1, @NotNull Brush arg2, float arg3, @Nullable Shadow arg4, @Nullable TextDecoration arg5, @Nullable DrawStyle arg6, int arg7);

    static void paint-hn5TExg$default(Paragraph paragraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        paragraph0.paint-hn5TExg(canvas0, brush0, ((v1 & 4) == 0 ? f : NaNf), ((v1 & 8) == 0 ? shadow0 : null), ((v1 & 16) == 0 ? textDecoration0 : null), ((v1 & 0x20) == 0 ? drawStyle0 : null), ((v1 & 0x40) == 0 ? v : 3));
    }
}

