package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import j0.i3;
import j0.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001F\b\u0001\u0018\u0000 52\u00020\u0001:\u00015B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\'\u0010\u0016\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001B\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001AR+\u0010#\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u00048F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R+\u0010\'\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u00048F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001E\u001A\u0004\b%\u0010 \"\u0004\b&\u0010\"R(\u0010.\u001A\u00020\u00178\u0006@\u0006X\u0086\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u0010\t\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00028F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001A\u0004\b1\u00102\"\u0004\b3\u00104\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "initialOrientation", "", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "", "update", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/geometry/Rect;II)V", "cursorStart", "cursorEnd", "coerceOffset$foundation_release", "(FFI)V", "coerceOffset", "Landroidx/compose/ui/text/TextRange;", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "getOffsetToFollow", "<set-?>", "a", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "()F", "setOffset", "(F)V", "offset", "b", "getMaximum", "setMaximum", "maximum", "d", "J", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "previousSelection", "e", "Landroidx/compose/runtime/MutableState;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,371:1\n76#2:372\n109#2,2:373\n76#2:375\n109#2,2:376\n81#3:378\n107#3,2:379\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n254#1:372\n254#1:373,2\n260#1:375\n260#1:376,2\n275#1:378\n275#1:379,2\n*E\n"})
public final class TextFieldScrollerPosition {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return TextFieldScrollerPosition.f;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableFloatState a;
    public final MutableFloatState b;
    public Rect c;
    public long d;
    public final MutableState e;
    public static final Saver f;

    static {
        TextFieldScrollerPosition.Companion = new Companion(null);
        TextFieldScrollerPosition.f = ListSaverKt.listSaver(i3.w, o.L);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }

    public TextFieldScrollerPosition(@NotNull Orientation orientation0, float f) {
        this.a = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.b = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.c = Rect.Companion.getZero();
        this.d = 0L;
        this.e = SnapshotStateKt.mutableStateOf(orientation0, SnapshotStateKt.structuralEqualityPolicy());
    }

    public TextFieldScrollerPosition(Orientation orientation0, float f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            f = 0.0f;
        }
        this(orientation0, f);
    }

    public final void coerceOffset$foundation_release(float f, float f1, int v) {
        float f4;
        float f2 = this.getOffset();
        float f3 = f2 + ((float)v);
        if(f1 <= f3) {
            int v1 = Float.compare(f, f2);
            if(v1 < 0 && f1 - f > ((float)v)) {
                f4 = f1 - f3;
            }
            else {
                f4 = v1 >= 0 || f1 - f > ((float)v) ? 0.0f : f - f2;
            }
        }
        else {
            f4 = f1 - f3;
        }
        this.setOffset(this.getOffset() + f4);
    }

    public final float getMaximum() {
        return this.b.getFloatValue();
    }

    public final float getOffset() {
        return this.a.getFloatValue();
    }

    public final int getOffsetToFollow-5zc-tL8(long v) {
        if(TextRange.getStart-impl(v) != TextRange.getStart-impl(this.d)) {
            return TextRange.getStart-impl(v);
        }
        return TextRange.getEnd-impl(v) == TextRange.getEnd-impl(this.d) ? TextRange.getMin-impl(v) : TextRange.getEnd-impl(v);
    }

    @NotNull
    public final Orientation getOrientation() {
        return (Orientation)this.e.getValue();
    }

    public final long getPreviousSelection-d9O1mEE() {
        return this.d;
    }

    public final void setOffset(float f) {
        this.a.setFloatValue(f);
    }

    public final void setOrientation(@NotNull Orientation orientation0) {
        this.e.setValue(orientation0);
    }

    public final void setPreviousSelection-5zc-tL8(long v) {
        this.d = v;
    }

    public final void update(@NotNull Orientation orientation0, @NotNull Rect rect0, int v, int v1) {
        float f = (float)(v1 - v);
        this.b.setFloatValue(f);
        if(rect0.getLeft() != this.c.getLeft() || rect0.getTop() != this.c.getTop()) {
            boolean z = orientation0 == Orientation.Vertical;
            this.coerceOffset$foundation_release((z ? rect0.getTop() : rect0.getLeft()), (z ? rect0.getBottom() : rect0.getRight()), v);
            this.c = rect0;
        }
        this.setOffset(c.coerceIn(this.getOffset(), 0.0f, f));
    }
}

