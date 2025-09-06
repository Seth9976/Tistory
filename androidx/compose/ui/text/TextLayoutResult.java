package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0010\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001A\u00020\u00142\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001A\u00020\u00142\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u001A\u0010\u0016J\u0015\u0010\u001C\u001A\u00020\n2\u0006\u0010\u001B\u001A\u00020\n\u00A2\u0006\u0004\b\u001C\u0010\rJ\u0015\u0010\u001E\u001A\u00020\n2\u0006\u0010\u001D\u001A\u00020\u0014\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001D\u0010!\u001A\u00020\u00142\u0006\u0010\u001B\u001A\u00020\n2\u0006\u0010 \u001A\u00020\u000E\u00A2\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001A\u00020#2\u0006\u0010\u001B\u001A\u00020\n\u00A2\u0006\u0004\b$\u0010%J\u0015\u0010&\u001A\u00020#2\u0006\u0010\u001B\u001A\u00020\n\u00A2\u0006\u0004\b&\u0010%J\u0018\u0010+\u001A\u00020\n2\u0006\u0010(\u001A\u00020\'\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*J\u0015\u0010-\u001A\u00020,2\u0006\u0010\u001B\u001A\u00020\n\u00A2\u0006\u0004\b-\u0010.J\u001B\u00102\u001A\u00020/2\u0006\u0010\u001B\u001A\u00020\n\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101J\u0015\u00103\u001A\u00020,2\u0006\u0010\u001B\u001A\u00020\n\u00A2\u0006\u0004\b3\u0010.J\u001D\u00107\u001A\u0002062\u0006\u00104\u001A\u00020\n2\u0006\u00105\u001A\u00020\n\u00A2\u0006\u0004\b7\u00108J$\u0010;\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00F8\u0001\u0000\u00A2\u0006\u0004\b9\u0010:J\u001A\u0010=\u001A\u00020\u000E2\b\u0010<\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b=\u0010>J\u000F\u0010?\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b?\u0010@J\u000F\u0010B\u001A\u00020AH\u0016\u00A2\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010GR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\u001D\u0010\u0007\u001A\u00020\u00068\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR\u0017\u0010T\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010SR\u0017\u0010W\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bU\u0010Q\u001A\u0004\bV\u0010SR\u001F\u0010]\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010,0X8\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\R\u0011\u0010`\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\b^\u0010_R\u0011\u0010b\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\ba\u0010_R\u0011\u0010d\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\bc\u0010_R\u0011\u0010f\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\be\u0010@\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006g"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "layoutInput", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/unit/IntSize;", "size", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "lineIndex", "getLineStart", "(I)I", "", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "", "getLineTop", "(I)F", "getLineBaseline", "getLineBottom", "getLineLeft", "getLineRight", "offset", "getLineForOffset", "vertical", "getLineForVerticalPosition", "(F)I", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/TextLayoutInput;", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "b", "Landroidx/compose/ui/text/MultiParagraph;", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", "c", "J", "getSize-YbymL2g", "()J", "d", "F", "getFirstBaseline", "()F", "firstBaseline", "e", "getLastBaseline", "lastBaseline", "", "f", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "getDidOverflowHeight", "()Z", "didOverflowHeight", "getDidOverflowWidth", "didOverflowWidth", "getHasVisualOverflow", "hasVisualOverflow", "getLineCount", "lineCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextLayoutResult {
    public static final int $stable = 8;
    public final TextLayoutInput a;
    public final MultiParagraph b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public TextLayoutResult(TextLayoutInput textLayoutInput0, MultiParagraph multiParagraph0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = textLayoutInput0;
        this.b = multiParagraph0;
        this.c = v;
        this.d = multiParagraph0.getFirstBaseline();
        this.e = multiParagraph0.getLastBaseline();
        this.f = multiParagraph0.getPlaceholderRects();
    }

    @NotNull
    public final TextLayoutResult copy-O0kMr_c(@NotNull TextLayoutInput textLayoutInput0, long v) {
        return new TextLayoutResult(textLayoutInput0, this.b, v, null);
    }

    public static TextLayoutResult copy-O0kMr_c$default(TextLayoutResult textLayoutResult0, TextLayoutInput textLayoutInput0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textLayoutInput0 = textLayoutResult0.a;
        }
        if((v1 & 2) != 0) {
            v = textLayoutResult0.c;
        }
        return textLayoutResult0.copy-O0kMr_c(textLayoutInput0, v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextLayoutResult)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((TextLayoutResult)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TextLayoutResult)object0).b)) {
            return false;
        }
        return IntSize.equals-impl0(this.c, ((TextLayoutResult)object0).c) ? this.d == ((TextLayoutResult)object0).d && this.e == ((TextLayoutResult)object0).e && Intrinsics.areEqual(this.f, ((TextLayoutResult)object0).f) : false;
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int v) {
        return this.b.getBidiRunDirection(v);
    }

    @NotNull
    public final Rect getBoundingBox(int v) {
        return this.b.getBoundingBox(v);
    }

    @NotNull
    public final Rect getCursorRect(int v) {
        return this.b.getCursorRect(v);
    }

    public final boolean getDidOverflowHeight() {
        return this.b.getDidExceedMaxLines() || ((float)IntSize.getHeight-impl(this.c)) < this.b.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float)IntSize.getWidth-impl(this.c)) < this.b.getWidth();
    }

    public final float getFirstBaseline() {
        return this.d;
    }

    // 去混淆评级： 低(20)
    public final boolean getHasVisualOverflow() {
        return this.getDidOverflowWidth() || this.getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int v, boolean z) {
        return this.b.getHorizontalPosition(v, z);
    }

    public final float getLastBaseline() {
        return this.e;
    }

    @NotNull
    public final TextLayoutInput getLayoutInput() {
        return this.a;
    }

    public final float getLineBaseline(int v) {
        return this.b.getLineBaseline(v);
    }

    public final float getLineBottom(int v) {
        return this.b.getLineBottom(v);
    }

    public final int getLineCount() {
        return this.b.getLineCount();
    }

    public final int getLineEnd(int v, boolean z) {
        return this.b.getLineEnd(v, z);
    }

    public static int getLineEnd$default(TextLayoutResult textLayoutResult0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayoutResult0.getLineEnd(v, z);
    }

    public final int getLineForOffset(int v) {
        return this.b.getLineForOffset(v);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.b.getLineForVerticalPosition(f);
    }

    public final float getLineLeft(int v) {
        return this.b.getLineLeft(v);
    }

    public final float getLineRight(int v) {
        return this.b.getLineRight(v);
    }

    public final int getLineStart(int v) {
        return this.b.getLineStart(v);
    }

    public final float getLineTop(int v) {
        return this.b.getLineTop(v);
    }

    @NotNull
    public final MultiParagraph getMultiParagraph() {
        return this.b;
    }

    public final int getOffsetForPosition-k-4lQ0M(long v) {
        return this.b.getOffsetForPosition-k-4lQ0M(v);
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int v) {
        return this.b.getParagraphDirection(v);
    }

    @NotNull
    public final Path getPathForRange(int v, int v1) {
        return this.b.getPathForRange(v, v1);
    }

    @NotNull
    public final List getPlaceholderRects() {
        return this.f;
    }

    public final long getSize-YbymL2g() {
        return this.c;
    }

    public final long getWordBoundary--jx7JFs(int v) {
        return this.b.getWordBoundary--jx7JFs(v);
    }

    @Override
    public int hashCode() {
        return this.f.hashCode() + a.b(this.e, a.b(this.d, (IntSize.hashCode-impl(this.c) + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F), 0x1F);
    }

    public final boolean isLineEllipsized(int v) {
        return this.b.isLineEllipsized(v);
    }

    @Override
    @NotNull
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + IntSize.toString-impl(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}

