package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.a;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRectKt;
import f2.h;
import f2.i;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import pd.c;

@RequiresApi(0x1F)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000F\u0010\u0011\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u001A\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00128F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCapture;", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "", "onScrollCaptureSearch", "(Landroid/view/View;Landroidx/compose/ui/semantics/SemanticsOwner;Lkotlin/coroutines/CoroutineContext;Ljava/util/function/Consumer;)V", "onSessionStarted", "onSessionEnded", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getScrollCaptureInProgress", "()Z", "setScrollCaptureInProgress", "(Z)V", "scrollCaptureInProgress", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n81#2:239\n107#2,2:240\n1208#3:242\n1187#3,2:243\n637#4:245\n48#4:246\n523#4:247\n1#5:248\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture\n*L\n54#1:239\n54#1:240,2\n81#1:242\n81#1:243,2\n93#1:245\n93#1:246\n93#1:247\n*E\n"})
public final class ScrollCapture implements ScrollCaptureSessionListener {
    public static final int $stable;
    public final MutableState a;

    public ScrollCapture() {
        this.a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final boolean getScrollCaptureInProgress() {
        return ((Boolean)this.a.getValue()).booleanValue();
    }

    @DoNotInline
    public final void onScrollCaptureSearch(@NotNull View view0, @NotNull SemanticsOwner semanticsOwner0, @NotNull CoroutineContext coroutineContext0, @NotNull Consumer consumer0) {
        MutableVector mutableVector0 = new MutableVector(new i[16], 0);
        ScrollCapture_androidKt.a(semanticsOwner0.getUnmergedRootSemanticsNode(), 0, new h(1, mutableVector0, MutableVector.class, "add", "add(Ljava/lang/Object;)Z", 8));  // 初始化器: Lkotlin/jvm/internal/AdaptedFunctionReference;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        mutableVector0.sortWith(c.compareBy(new Function1[]{f2.c.y, f2.c.z}));
        Object object0 = mutableVector0.isEmpty() ? null : mutableVector0.getContent()[mutableVector0.getSize() - 1];
        if(((i)object0) == null) {
            return;
        }
        CoroutineScope coroutineScope0 = CoroutineScopeKt.CoroutineScope(coroutineContext0);
        ComposeScrollCaptureCallback composeScrollCaptureCallback0 = new ComposeScrollCaptureCallback(((i)object0).a, ((i)object0).c, coroutineScope0, this);
        Rect rect0 = LayoutCoordinatesKt.boundsInRoot(((i)object0).d);
        long v = ((i)object0).c.getTopLeft-nOcc-ac();
        ScrollCaptureTarget scrollCaptureTarget0 = a.n(view0, RectHelper_androidKt.toAndroidRect(IntRectKt.roundToIntRect(rect0)), new Point(IntOffset.getX-impl(v), IntOffset.getY-impl(v)), composeScrollCaptureCallback0);
        scrollCaptureTarget0.setScrollBounds(RectHelper_androidKt.toAndroidRect(((i)object0).c));
        consumer0.accept(scrollCaptureTarget0);
    }

    @Override  // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$ScrollCaptureSessionListener
    public void onSessionEnded() {
        this.a.setValue(Boolean.FALSE);
    }

    @Override  // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$ScrollCaptureSessionListener
    public void onSessionStarted() {
        this.a.setValue(Boolean.TRUE);
    }
}

