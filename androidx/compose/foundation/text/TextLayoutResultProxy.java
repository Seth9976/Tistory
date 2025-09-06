package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001E\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u0010\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0013\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u0017\u001A\u00020\r2\u0006\u0010\u0015\u001A\u00020\r2\b\b\u0002\u0010\u0016\u001A\u00020\u000B¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001C\u001A\u00020\u000B2\u0006\u0010\u0019\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001F\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R$\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0006\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b,\u0010\'\u001A\u0004\b-\u0010)\"\u0004\b.\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "innerTextFieldCoordinates", "decorationBoxCoordinates", "<init>", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/geometry/Offset;", "position", "", "coerceInVisibleBounds", "", "getOffsetForPosition-3MmeM6k", "(JZ)I", "getOffsetForPosition", "", "vertical", "getLineForVerticalPosition", "(F)I", "lineIndex", "visibleEnd", "getLineEnd", "(IZ)I", "offset", "isPositionOnText-k-4lQ0M", "(J)Z", "isPositionOnText", "translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release", "(J)J", "translateDecorationToInnerCoordinates", "translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release", "translateInnerToDecorationCoordinates", "a", "Landroidx/compose/ui/text/TextLayoutResult;", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "b", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getInnerTextFieldCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setInnerTextFieldCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "c", "getDecorationBoxCoordinates", "setDecorationBoxCoordinates", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class TextLayoutResultProxy {
    public static final int $stable = 8;
    public final TextLayoutResult a;
    public LayoutCoordinates b;
    public LayoutCoordinates c;

    public TextLayoutResultProxy(@NotNull TextLayoutResult textLayoutResult0, @Nullable LayoutCoordinates layoutCoordinates0, @Nullable LayoutCoordinates layoutCoordinates1) {
        this.a = textLayoutResult0;
        this.b = layoutCoordinates0;
        this.c = layoutCoordinates1;
    }

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult0, LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            layoutCoordinates0 = null;
        }
        if((v & 4) != 0) {
            layoutCoordinates1 = null;
        }
        this(textLayoutResult0, layoutCoordinates0, layoutCoordinates1);
    }

    public final long a(long v) {
        Rect rect0;
        LayoutCoordinates layoutCoordinates0 = this.b;
        if(layoutCoordinates0 != null) {
            if(layoutCoordinates0.isAttached()) {
                LayoutCoordinates layoutCoordinates1 = this.c;
                rect0 = null;
                if(layoutCoordinates1 != null) {
                    rect0 = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates1, layoutCoordinates0, false, 2, null);
                    return rect0 == null ? TextLayoutResultProxyKt.access$coerceIn-3MmeM6k(v, Rect.Companion.getZero()) : TextLayoutResultProxyKt.access$coerceIn-3MmeM6k(v, rect0);
                }
            }
            else {
                rect0 = Rect.Companion.getZero();
            }
            return rect0 == null ? TextLayoutResultProxyKt.access$coerceIn-3MmeM6k(v, Rect.Companion.getZero()) : TextLayoutResultProxyKt.access$coerceIn-3MmeM6k(v, rect0);
        }
        return TextLayoutResultProxyKt.access$coerceIn-3MmeM6k(v, Rect.Companion.getZero());
    }

    @Nullable
    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.c;
    }

    @Nullable
    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.b;
    }

    public final int getLineEnd(int v, boolean z) {
        return this.a.getLineEnd(v, z);
    }

    public static int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayoutResultProxy0.getLineEnd(v, z);
    }

    public final int getLineForVerticalPosition(float f) {
        float f1 = Offset.getY-impl(this.translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release(this.a(OffsetKt.Offset(0.0f, f))));
        return this.a.getLineForVerticalPosition(f1);
    }

    public final int getOffsetForPosition-3MmeM6k(long v, boolean z) {
        if(z) {
            v = this.a(v);
        }
        long v1 = this.translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release(v);
        return this.a.getOffsetForPosition-k-4lQ0M(v1);
    }

    public static int getOffsetForPosition-3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy0, long v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy0.getOffsetForPosition-3MmeM6k(v, z);
    }

    @NotNull
    public final TextLayoutResult getValue() {
        return this.a;
    }

    public final boolean isPositionOnText-k-4lQ0M(long v) {
        long v1 = this.translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release(this.a(v));
        int v2 = this.a.getLineForVerticalPosition(Offset.getY-impl(v1));
        return Offset.getX-impl(v1) >= this.a.getLineLeft(v2) && Offset.getX-impl(v1) <= this.a.getLineRight(v2);
    }

    public final void setDecorationBoxCoordinates(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.c = layoutCoordinates0;
    }

    public final void setInnerTextFieldCoordinates(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.b = layoutCoordinates0;
    }

    public final long translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release(long v) {
        LayoutCoordinates layoutCoordinates0 = null;
        LayoutCoordinates layoutCoordinates1 = this.b;
        if(layoutCoordinates1 != null) {
            if(!layoutCoordinates1.isAttached()) {
                layoutCoordinates1 = null;
            }
            if(layoutCoordinates1 != null) {
                LayoutCoordinates layoutCoordinates2 = this.c;
                if(layoutCoordinates2 != null) {
                    if(layoutCoordinates2.isAttached()) {
                        layoutCoordinates0 = layoutCoordinates2;
                    }
                    return layoutCoordinates0 == null ? v : layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, v);
                }
            }
        }
        return v;
    }

    public final long translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release(long v) {
        LayoutCoordinates layoutCoordinates0 = null;
        LayoutCoordinates layoutCoordinates1 = this.b;
        if(layoutCoordinates1 != null) {
            if(!layoutCoordinates1.isAttached()) {
                layoutCoordinates1 = null;
            }
            if(layoutCoordinates1 != null) {
                LayoutCoordinates layoutCoordinates2 = this.c;
                if(layoutCoordinates2 != null) {
                    if(layoutCoordinates2.isAttached()) {
                        layoutCoordinates0 = layoutCoordinates2;
                    }
                    return layoutCoordinates0 == null ? v : layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates1, v);
                }
            }
        }
        return v;
    }
}

