package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u00012\u00020\u0002J?\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00032\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00A2\u0006\u0002\b\bH\u0096A\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u0010\u001A\u00020\r*\u00020\fH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\r*\u00020\u0011H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001A\u00020\f*\u00020\u0011H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0016\u001A\u00020\f*\u00020\u0017H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u0016\u001A\u00020\f*\u00020\rH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u001AJ\u0017\u0010\u001F\u001A\u00020\u001C*\u00020\u001BH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010!\u001A\u00020\u0017*\u00020\fH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u0019J\u0017\u0010!\u001A\u00020\u0017*\u00020\u0011H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010\u0015J\u0014\u0010%\u001A\u00020$*\u00020#H\u0097\u0001\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001A\u00020\u001B*\u00020\u001CH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010\u001EJ\u0017\u0010+\u001A\u00020\u0011*\u00020\fH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*J\u001A\u0010+\u001A\u00020\u0011*\u00020\u0017H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010*J\u001A\u0010+\u001A\u00020\u0011*\u00020\rH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-J\u0017\u00101\u001A\u0002002\u0006\u0010/\u001A\u00020.H\u0016\u00A2\u0006\u0004\b1\u00102R\u0014\u00105\u001A\u00020\u00178\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b3\u00104R\u001A\u00108\u001A\u00020\u001B8VX\u0096\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b6\u00107R\u0014\u0010:\u001A\u00020\u00178\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b9\u00104R$\u0010A\u001A\u00020;2\u0006\u0010<\u001A\u00020;8V@VX\u0096\u000F\u00A2\u0006\f\u001A\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001A\u0010D\u001A\u00020B8\u0016X\u0096\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bC\u00107R\u0014\u0010H\u001A\u00020E8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bF\u0010G\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006I"}, d2 = {"androidx/compose/foundation/draganddrop/DragAndDropSourceNode$1$1", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "", "startTransfer", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;)V", "getDensity", "()F", "density", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "getFontScale", "fontScale", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DragAndDropSourceNode.1.1 implements DragAndDropSourceScope, PointerInputScope {
    public final PointerInputScope a;
    public final DragAndDropModifierNode b;
    public final DragAndDropSourceNode c;

    public DragAndDropSourceNode.1.1(PointerInputScope pointerInputScope0, DragAndDropModifierNode dragAndDropModifierNode0, DragAndDropSourceNode dragAndDropSourceNode0) {
        this.b = dragAndDropModifierNode0;
        this.c = dragAndDropSourceNode0;
        this.a = pointerInputScope0;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    @Nullable
    public Object awaitPointerEventScope(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        return this.a.awaitPointerEventScope(function20, continuation0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public long getExtendedTouchPadding-NH-jbRc() {
        return this.a.getExtendedTouchPadding-NH-jbRc();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.a.getFontScale();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.a.getInterceptOutOfBoundsChildEvents();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public long getSize-YbymL2g() {
        return this.a.getSize-YbymL2g();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.a.getViewConfiguration();
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx--R2X_6o(long v) {
        return this.a.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx-0680j_4(float f) {
        return this.a.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.a.setInterceptOutOfBoundsChildEvents(z);
    }

    @Override  // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
    public void startTransfer(@NotNull DragAndDropTransferData dragAndDropTransferData0) {
        long v = IntSizeKt.toSize-ozmzZPI(this.getSize-YbymL2g());
        this.b.drag-12SF9DM(dragAndDropTransferData0, v, this.c.getDrawDragDecoration());
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public float toDp-GaN1DYA(long v) {
        return this.a.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(float f) {
        return this.a.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(int v) {
        return this.a.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toDpSize-k-rfVVM(long v) {
        return this.a.toDpSize-k-rfVVM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx--R2X_6o(long v) {
        return this.a.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx-0680j_4(float f) {
        return this.a.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect0) {
        return this.a.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSize-XkaWNTQ(long v) {
        return this.a.toSize-XkaWNTQ(v);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public long toSp-0xMU5do(float f) {
        return this.a.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(float f) {
        return this.a.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(int v) {
        return this.a.toSp-kPz2Gy4(v);
    }
}

