package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b \b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u000B\u001A\u00020\t\u00A2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000E\u001A\u00020\u0004*\u00020\u0004\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0011\u0010\u0010\u001A\u00020\u0004*\u00020\u0004\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u0011\u0010\u0011\u001A\u00020\u0004*\u00020\u0004\u00A2\u0006\u0004\b\u0011\u0010\u000FJ\u0011\u0010\u0012\u001A\u00020\u0004*\u00020\u0004\u00A2\u0006\u0004\b\u0012\u0010\u000FJ\u0011\u0010\u0013\u001A\u00020\t*\u00020\t\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001A\u00020\t*\u00020\t\u00A2\u0006\u0004\b\u0015\u0010\u0014J\u0014\u0010\u0019\u001A\u00020\u0016*\u00020\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001B\u001A\u00020\u001A*\u00020\u001A\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0011\u0010\u0019\u001A\u00020\u001A*\u00020\u001A\u00A2\u0006\u0004\b\u0019\u0010\u001CJ\u0011\u0010\u001B\u001A\u00020\u001D*\u00020\u001D\u00A2\u0006\u0004\b\u001B\u0010\u001EJ\u001E\u0010\u001B\u001A\u00020\u001F*\u00020\u001F2\b\b\u0002\u0010!\u001A\u00020 \u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\'J\u0010\u0010)\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\'J\u0010\u0010*\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010\'J\u0010\u0010+\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b-\u0010,JV\u0010.\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\tH\u00C6\u0001\u00A2\u0006\u0004\b.\u0010/J\u0010\u00101\u001A\u000200H\u00D6\u0001\u00A2\u0006\u0004\b1\u00102J\u0010\u00103\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b3\u0010\'J\u001A\u00105\u001A\u00020 2\b\u00104\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010%R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010\'R\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b=\u0010;\u001A\u0004\b>\u0010\'R\"\u0010\u0007\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b?\u0010;\u001A\u0004\b@\u0010\'\"\u0004\bA\u0010BR\"\u0010\b\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010;\u001A\u0004\bD\u0010\'\"\u0004\bE\u0010BR\"\u0010\n\u001A\u00020\t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bF\u0010G\u001A\u0004\bH\u0010,\"\u0004\bI\u0010JR\"\u0010\u000B\u001A\u00020\t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bK\u0010G\u001A\u0004\bL\u0010,\"\u0004\bM\u0010JR\u0011\u0010O\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\bN\u0010\'\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006P"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "Landroidx/compose/ui/text/Paragraph;", "paragraph", "", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "", "top", "bottom", "<init>", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "toLocalIndex", "(I)I", "toGlobalIndex", "toLocalLineIndex", "toGlobalLineIndex", "toGlobalYPosition", "(F)F", "toLocalYPosition", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "(J)J", "toLocal", "Landroidx/compose/ui/geometry/Rect;", "toGlobal", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "", "treatZeroAsNull", "toGlobal-xdX6-G0", "(JZ)J", "component1", "()Landroidx/compose/ui/text/Paragraph;", "component2", "()I", "component3", "component4", "component5", "component6", "()F", "component7", "copy", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)Landroidx/compose/ui/text/ParagraphInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/Paragraph;", "getParagraph", "b", "I", "getStartIndex", "c", "getEndIndex", "d", "getStartLineIndex", "setStartLineIndex", "(I)V", "e", "getEndLineIndex", "setEndLineIndex", "f", "F", "getTop", "setTop", "(F)V", "g", "getBottom", "setBottom", "getLength", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ParagraphInfo {
    public static final int $stable = 8;
    public final Paragraph a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public float f;
    public float g;

    public ParagraphInfo(@NotNull Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1) {
        this.a = paragraph0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = f;
        this.g = f1;
    }

    public ParagraphInfo(Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(paragraph0, v, v1, ((v4 & 8) == 0 ? v2 : -1), ((v4 & 16) == 0 ? v3 : -1), ((v4 & 0x20) == 0 ? f : -1.0f), ((v4 & 0x40) == 0 ? f1 : -1.0f));
    }

    @NotNull
    public final Paragraph component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final float component6() {
        return this.f;
    }

    public final float component7() {
        return this.g;
    }

    @NotNull
    public final ParagraphInfo copy(@NotNull Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1) {
        return new ParagraphInfo(paragraph0, v, v1, v2, v3, f, f1);
    }

    public static ParagraphInfo copy$default(ParagraphInfo paragraphInfo0, Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1, int v4, Object object0) {
        if((v4 & 1) != 0) {
            paragraph0 = paragraphInfo0.a;
        }
        if((v4 & 2) != 0) {
            v = paragraphInfo0.b;
        }
        if((v4 & 4) != 0) {
            v1 = paragraphInfo0.c;
        }
        if((v4 & 8) != 0) {
            v2 = paragraphInfo0.d;
        }
        if((v4 & 16) != 0) {
            v3 = paragraphInfo0.e;
        }
        if((v4 & 0x20) != 0) {
            f = paragraphInfo0.f;
        }
        if((v4 & 0x40) != 0) {
            f1 = paragraphInfo0.g;
        }
        return paragraphInfo0.copy(paragraph0, v, v1, v2, v3, f, f1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((ParagraphInfo)object0).a)) {
            return false;
        }
        if(this.b != ((ParagraphInfo)object0).b) {
            return false;
        }
        if(this.c != ((ParagraphInfo)object0).c) {
            return false;
        }
        if(this.d != ((ParagraphInfo)object0).d) {
            return false;
        }
        if(this.e != ((ParagraphInfo)object0).e) {
            return false;
        }
        return Float.compare(this.f, ((ParagraphInfo)object0).f) == 0 ? Float.compare(this.g, ((ParagraphInfo)object0).g) == 0 : false;
    }

    public final float getBottom() {
        return this.g;
    }

    public final int getEndIndex() {
        return this.c;
    }

    public final int getEndLineIndex() {
        return this.e;
    }

    public final int getLength() {
        return this.c - this.b;
    }

    @NotNull
    public final Paragraph getParagraph() {
        return this.a;
    }

    public final int getStartIndex() {
        return this.b;
    }

    public final int getStartLineIndex() {
        return this.d;
    }

    public final float getTop() {
        return this.f;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.g) + a.b(this.f, a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    public final void setBottom(float f) {
        this.g = f;
    }

    public final void setEndLineIndex(int v) {
        this.e = v;
    }

    public final void setStartLineIndex(int v) {
        this.d = v;
    }

    public final void setTop(float f) {
        this.f = f;
    }

    @NotNull
    public final Rect toGlobal(@NotNull Rect rect0) {
        return rect0.translate-k-4lQ0M(OffsetKt.Offset(0.0f, this.f));
    }

    @NotNull
    public final Path toGlobal(@NotNull Path path0) {
        path0.translate-k-4lQ0M(OffsetKt.Offset(0.0f, this.f));
        return path0;
    }

    // 去混淆评级： 中等(60)
    public final long toGlobal-xdX6-G0(long v, boolean z) {
        return !z || !TextRange.equals-impl0(v, 0L) ? TextRangeKt.TextRange(this.toGlobalIndex(TextRange.getStart-impl(v)), this.toGlobalIndex(TextRange.getEnd-impl(v))) : 0L;
    }

    public static long toGlobal-xdX6-G0$default(ParagraphInfo paragraphInfo0, long v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = true;
        }
        return paragraphInfo0.toGlobal-xdX6-G0(v, z);
    }

    public final int toGlobalIndex(int v) {
        return v + this.b;
    }

    public final int toGlobalLineIndex(int v) {
        return v + this.d;
    }

    public final float toGlobalYPosition(float f) {
        return f + this.f;
    }

    @NotNull
    public final Rect toLocal(@NotNull Rect rect0) {
        return rect0.translate-k-4lQ0M(OffsetKt.Offset(0.0f, -this.f));
    }

    public final long toLocal-MK-Hz9U(long v) {
        return OffsetKt.Offset(Offset.getX-impl(v), Offset.getY-impl(v) - this.f);
    }

    public final int toLocalIndex(int v) {
        return c.coerceIn(v, this.b, this.c) - this.b;
    }

    public final int toLocalLineIndex(int v) {
        return v - this.d;
    }

    public final float toLocalYPosition(float f) {
        return f - this.f;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ParagraphInfo(paragraph=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", startIndex=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", endIndex=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", startLineIndex=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", endLineIndex=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", top=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", bottom=");
        return a.n(stringBuilder0, this.g, ')');
    }
}

