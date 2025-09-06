package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.d;
import zd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u001D\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0014\u001A\u00020\n2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FH&¢\u0006\u0004\b\u0014\u0010\u0015R0\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\bR\u0014\u0010\u001E\u001A\u00020\u001B8DX\u0084\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "coordinates", "", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "onDetach", "()V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroid/graphics/Rect;", "currentRects", "()Landroidx/compose/runtime/collection/MutableVector;", "rects", "updateRects", "(Landroidx/compose/runtime/collection/MutableVector;)V", "n", "Lkotlin/jvm/functions/Function1;", "getRect", "()Lkotlin/jvm/functions/Function1;", "setRect", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,97:1\n1#2:98\n728#3,2:99\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n67#1:99,2\n*E\n"})
public abstract class RectListNode extends Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    public Function1 n;
    public Rect o;

    public RectListNode(@Nullable Function1 function10) {
        this.n = function10;
    }

    @NotNull
    public abstract MutableVector currentRects();

    @Nullable
    public Function1 getRect() {
        return this.n;
    }

    @NotNull
    public final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        super.onDetach();
        MutableVector mutableVector0 = this.currentRects();
        Rect rect0 = this.o;
        if(rect0 != null) {
            mutableVector0.remove(rect0);
        }
        this.updateRects(mutableVector0);
        this.o = null;
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        Rect rect1;
        if(this.getRect() == null) {
            androidx.compose.ui.geometry.Rect rect0 = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates0);
            rect1 = new Rect(c.roundToInt(rect0.getLeft()), c.roundToInt(rect0.getTop()), c.roundToInt(rect0.getRight()), c.roundToInt(rect0.getBottom()));
        }
        else {
            Function1 function10 = this.getRect();
            Intrinsics.checkNotNull(function10);
            androidx.compose.ui.geometry.Rect rect2 = (androidx.compose.ui.geometry.Rect)function10.invoke(layoutCoordinates0);
            LayoutCoordinates layoutCoordinates1 = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates0);
            long v = layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, rect2.getTopLeft-F1C5BW0());
            long v1 = layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, rect2.getTopRight-F1C5BW0());
            long v2 = layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, rect2.getBottomLeft-F1C5BW0());
            long v3 = layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, rect2.getBottomRight-F1C5BW0());
            float f = d.minOf(Offset.getX-impl(v), new float[]{Offset.getX-impl(v1), Offset.getX-impl(v2), Offset.getX-impl(v3)});
            float f1 = d.minOf(Offset.getY-impl(v), new float[]{Offset.getY-impl(v1), Offset.getY-impl(v2), Offset.getY-impl(v3)});
            float f2 = d.maxOf(Offset.getX-impl(v), new float[]{Offset.getX-impl(v1), Offset.getX-impl(v2), Offset.getX-impl(v3)});
            float f3 = d.maxOf(Offset.getY-impl(v), new float[]{Offset.getY-impl(v1), Offset.getY-impl(v2), Offset.getY-impl(v3)});
            rect1 = new Rect(c.roundToInt(f), c.roundToInt(f1), c.roundToInt(f2), c.roundToInt(f3));
        }
        MutableVector mutableVector0 = this.currentRects();
        Rect rect3 = this.o;
        if(rect3 != null) {
            mutableVector0.remove(rect3);
        }
        if(!rect1.isEmpty()) {
            mutableVector0.add(rect1);
        }
        this.updateRects(mutableVector0);
        this.o = rect1;
    }

    public void setRect(@Nullable Function1 function10) {
        this.n = function10;
    }

    public abstract void updateRects(@NotNull MutableVector arg1);
}

