package androidx.compose.ui.viewinterop;

import aa.r;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;
import u2.a;
import u2.b;
import u2.c;
import u2.d;
import u2.e;
import u2.f;
import u2.g;
import u2.h;
import u2.i;
import u2.j;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00C6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 \u00B4\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00B4\u0001B9\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001A\n\u0018\u00010\rj\u0004\u0018\u0001`\u0013\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001C\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001BJ\u001F\u0010 \u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\t2\u0006\u0010\u001F\u001A\u00020\tH\u0014\u00A2\u0006\u0004\b \u0010!J\r\u0010\"\u001A\u00020\u0019\u00A2\u0006\u0004\b\"\u0010\u001BJ7\u0010)\u001A\u00020\u00192\u0006\u0010$\u001A\u00020#2\u0006\u0010%\u001A\u00020\t2\u0006\u0010&\u001A\u00020\t2\u0006\u0010\'\u001A\u00020\t2\u0006\u0010(\u001A\u00020\tH\u0014\u00A2\u0006\u0004\b)\u0010*J\u0011\u0010,\u001A\u0004\u0018\u00010+H\u0016\u00A2\u0006\u0004\b,\u0010-J\u0017\u0010/\u001A\u00020\u00192\u0006\u0010.\u001A\u00020#H\u0016\u00A2\u0006\u0004\b/\u00100J\u000F\u00101\u001A\u00020\u0019H\u0014\u00A2\u0006\u0004\b1\u0010\u001BJ\u000F\u00102\u001A\u00020\u0019H\u0014\u00A2\u0006\u0004\b2\u0010\u001BJ%\u00108\u001A\u0004\u0018\u0001072\b\u00104\u001A\u0004\u0018\u0001032\b\u00106\u001A\u0004\u0018\u000105H\u0016\u00A2\u0006\u0004\b8\u00109J\u001F\u0010<\u001A\u00020\u00192\u0006\u0010:\u001A\u00020\r2\u0006\u0010;\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b<\u0010=J\r\u0010>\u001A\u00020\u0019\u00A2\u0006\u0004\b>\u0010\u001BJ\u0017\u0010@\u001A\u00020\u00192\u0006\u0010?\u001A\u00020\tH\u0014\u00A2\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001A\u00020#2\b\u0010C\u001A\u0004\u0018\u00010BH\u0016\u00A2\u0006\u0004\bD\u0010EJ\u000F\u0010F\u001A\u00020#H\u0016\u00A2\u0006\u0004\bF\u0010GJ/\u0010J\u001A\u00020#2\u0006\u0010:\u001A\u00020\r2\u0006\u0010;\u001A\u00020\r2\u0006\u0010H\u001A\u00020\t2\u0006\u0010I\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bJ\u0010KJ\u000F\u0010L\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bL\u0010MJ/\u0010N\u001A\u00020\u00192\u0006\u0010:\u001A\u00020\r2\u0006\u0010;\u001A\u00020\r2\u0006\u0010H\u001A\u00020\t2\u0006\u0010I\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bN\u0010OJ\u001F\u0010P\u001A\u00020\u00192\u0006\u0010;\u001A\u00020\r2\u0006\u0010I\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bP\u0010QJG\u0010W\u001A\u00020\u00192\u0006\u0010;\u001A\u00020\r2\u0006\u0010R\u001A\u00020\t2\u0006\u0010S\u001A\u00020\t2\u0006\u0010T\u001A\u00020\t2\u0006\u0010U\u001A\u00020\t2\u0006\u0010I\u001A\u00020\t2\u0006\u0010V\u001A\u000203H\u0016\u00A2\u0006\u0004\bW\u0010XJ?\u0010W\u001A\u00020\u00192\u0006\u0010;\u001A\u00020\r2\u0006\u0010R\u001A\u00020\t2\u0006\u0010S\u001A\u00020\t2\u0006\u0010T\u001A\u00020\t2\u0006\u0010U\u001A\u00020\t2\u0006\u0010I\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bW\u0010YJ7\u0010\\\u001A\u00020\u00192\u0006\u0010;\u001A\u00020\r2\u0006\u0010Z\u001A\u00020\t2\u0006\u0010[\u001A\u00020\t2\u0006\u0010V\u001A\u0002032\u0006\u0010I\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\\\u0010]J/\u0010a\u001A\u00020#2\u0006\u0010;\u001A\u00020\r2\u0006\u0010_\u001A\u00020^2\u0006\u0010`\u001A\u00020^2\u0006\u0010V\u001A\u00020#H\u0016\u00A2\u0006\u0004\ba\u0010bJ\'\u0010c\u001A\u00020#2\u0006\u0010;\u001A\u00020\r2\u0006\u0010_\u001A\u00020^2\u0006\u0010`\u001A\u00020^H\u0016\u00A2\u0006\u0004\bc\u0010dJ\u000F\u0010e\u001A\u00020#H\u0016\u00A2\u0006\u0004\be\u0010GR\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b(\u0010f\u001A\u0004\bg\u0010\u0015R6\u0010p\u001A\b\u0012\u0004\u0012\u00020\u00190h2\f\u0010i\u001A\b\u0012\u0004\u0012\u00020\u00190h8\u0006@DX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bj\u0010k\u001A\u0004\bl\u0010m\"\u0004\bn\u0010oR6\u0010u\u001A\b\u0012\u0004\u0012\u00020\u00190h2\f\u0010q\u001A\b\u0012\u0004\u0012\u00020\u00190h8\u0006@DX\u0086\u000E\u00A2\u0006\u0012\n\u0004\br\u0010k\u001A\u0004\bs\u0010m\"\u0004\bt\u0010oR6\u0010y\u001A\b\u0012\u0004\u0012\u00020\u00190h2\f\u0010q\u001A\b\u0012\u0004\u0012\u00020\u00190h8\u0006@DX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bv\u0010k\u001A\u0004\bw\u0010m\"\u0004\bx\u0010oR,\u0010\u0081\u0001\u001A\u00020z2\u0006\u0010i\u001A\u00020z8\u0006@FX\u0086\u000E\u00A2\u0006\u0013\n\u0004\b{\u0010|\u001A\u0004\b}\u0010~\"\u0005\b\u007F\u0010\u0080\u0001R8\u0010\u0089\u0001\u001A\u0011\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0082\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001A\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R3\u0010\u0091\u0001\u001A\u00030\u008A\u00012\u0007\u0010i\u001A\u00030\u008A\u00018\u0006@FX\u0086\u000E\u00A2\u0006\u0018\n\u0006\b\u008B\u0001\u0010\u008C\u0001\u001A\u0006\b\u008D\u0001\u0010\u008E\u0001\"\u0006\b\u008F\u0001\u0010\u0090\u0001R9\u0010\u0095\u0001\u001A\u0012\u0012\u0005\u0012\u00030\u008A\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0082\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0084\u0001\u001A\u0006\b\u0093\u0001\u0010\u0086\u0001\"\u0006\b\u0094\u0001\u0010\u0088\u0001R6\u0010\u009C\u0001\u001A\u0005\u0018\u00010\u0096\u00012\t\u0010i\u001A\u0005\u0018\u00010\u0096\u00018\u0006@FX\u0086\u000E\u00A2\u0006\u0017\n\u0005\b%\u0010\u0097\u0001\u001A\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009A\u0001\u0010\u009B\u0001R7\u0010\u00A4\u0001\u001A\u0005\u0018\u00010\u009D\u00012\t\u0010i\u001A\u0005\u0018\u00010\u009D\u00018\u0006@FX\u0086\u000E\u00A2\u0006\u0018\n\u0006\b\u009E\u0001\u0010\u009F\u0001\u001A\u0006\b\u00A0\u0001\u0010\u00A1\u0001\"\u0006\b\u00A2\u0001\u0010\u00A3\u0001R8\u0010\u00A8\u0001\u001A\u0011\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0082\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00A5\u0001\u0010\u0084\u0001\u001A\u0006\b\u00A6\u0001\u0010\u0086\u0001\"\u0006\b\u00A7\u0001\u0010\u0088\u0001R\u001D\u0010\u00AE\u0001\u001A\u00030\u00A9\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00AA\u0001\u0010\u00AB\u0001\u001A\u0006\b\u00AC\u0001\u0010\u00AD\u0001R\u0016\u0010\u00AF\u0001\u001A\u00020#8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00AF\u0001\u0010GR\u0018\u0010\u00B3\u0001\u001A\u00030\u00B0\u00018BX\u0082\u0004\u00A2\u0006\b\u001A\u0006\b\u00B1\u0001\u0010\u00B2\u0001\u00A8\u0006\u00B5\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "onReuse", "()V", "onDeactivate", "onRelease", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "remeasure", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "invalidateOrDefer", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "Landroid/view/View;", "getView", "Lkotlin/Function0;", "value", "d", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "<set-?>", "f", "getReset", "setReset", "reset", "g", "getRelease", "setRelease", "release", "Landroidx/compose/ui/Modifier;", "h", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Landroidx/compose/ui/unit/Density;", "j", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "k", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "m", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "savedStateRegistryOwner", "p", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "Landroidx/compose/ui/node/LayoutNode;", "v", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "isValidOwnerScope", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,622:1\n42#2,7:623\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n*L\n173#1:623,7\n*E\n"})
public class AndroidViewHolder extends ViewGroup implements ComposeNodeLifecycleCallback, OwnerScope, NestedScrollingParent3 {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "", "OnCommitAffectingUpdate", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final NestedScrollDispatcher a;
    public final View b;
    public final Owner c;
    public Function0 d;
    public boolean e;
    public Function0 f;
    public Function0 g;
    public Modifier h;
    public Function1 i;
    public Density j;
    public Function1 k;
    public LifecycleOwner l;
    public SavedStateRegistryOwner m;
    public final j n;
    public final j o;
    public Function1 p;
    public final int[] q;
    public int r;
    public int s;
    public final NestedScrollingParentHelper t;
    public boolean u;
    public final LayoutNode v;
    public static final a w;

    static {
        AndroidViewHolder.Companion = new Companion(null);
        AndroidViewHolder.$stable = 8;
        AndroidViewHolder.w = a.x;
    }

    public AndroidViewHolder(@NotNull Context context0, @Nullable CompositionContext compositionContext0, int v, @NotNull NestedScrollDispatcher nestedScrollDispatcher0, @NotNull View view0, @NotNull Owner owner0) {
        super(context0);
        this.a = nestedScrollDispatcher0;
        this.b = view0;
        this.c = owner0;
        if(compositionContext0 != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext0);
        }
        this.setSaveFromParentEnabled(false);
        this.addView(view0);
        this.d = i.z;
        this.f = i.y;
        this.g = i.x;
        this.h = Modifier.Companion;
        this.j = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.n = new j(this, 1);
        this.o = new j(this, 0);
        this.q = new int[2];
        this.r = 0x80000000;
        this.s = 0x80000000;
        this.t = new NestedScrollingParentHelper(this);
        LayoutNode layoutNode0 = new LayoutNode(false, 0, 3, null);
        layoutNode0.setInteropViewFactoryHolder$ui_release(this);
        Modifier modifier0 = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(Modifier.Companion, AndroidViewHolder_androidKt.access$getNoOpScrollConnection$p(), nestedScrollDispatcher0), true, a.y), this), new r(this, layoutNode0, 25, this)), new c(this, layoutNode0, 1));
        layoutNode0.setCompositeKeyHash(v);
        layoutNode0.setModifier(this.h.then(modifier0));
        this.i = new b(0, layoutNode0, modifier0);
        layoutNode0.setDensity(this.j);
        this.k = new h1(layoutNode0, 13);
        layoutNode0.setOnAttach$ui_release(new c(this, layoutNode0, 0));
        layoutNode0.setOnDetach$ui_release(new d(this, 0));
        layoutNode0.setMeasurePolicy(new MeasurePolicy() {
            public final AndroidViewHolder a;
            public final LayoutNode b;

            {
                AndroidViewHolder androidViewHolder0 = layoutNode0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = androidViewHolder0;
                this.b = layoutNode0;
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams0);
                int v1 = AndroidViewHolder.access$obtainMeasureSpec(this.a, 0, v, viewGroup$LayoutParams0.width);
                this.a.measure(v1, 0);
                return this.a.getMeasuredHeight();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams0);
                int v1 = AndroidViewHolder.access$obtainMeasureSpec(this.a, 0, v, viewGroup$LayoutParams0.height);
                this.a.measure(0, v1);
                return this.a.getMeasuredWidth();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
                AndroidViewHolder androidViewHolder0 = this.a;
                if(androidViewHolder0.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, e.w, 4, null);
                }
                if(Constraints.getMinWidth-impl(v) != 0) {
                    androidViewHolder0.getChildAt(0).setMinimumWidth(Constraints.getMinWidth-impl(v));
                }
                if(Constraints.getMinHeight-impl(v) != 0) {
                    androidViewHolder0.getChildAt(0).setMinimumHeight(Constraints.getMinHeight-impl(v));
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = androidViewHolder0.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams0);
                int v1 = AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder0, Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v), viewGroup$LayoutParams0.width);
                ViewGroup.LayoutParams viewGroup$LayoutParams1 = androidViewHolder0.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams1);
                androidViewHolder0.measure(v1, AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder0, Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v), viewGroup$LayoutParams1.height));
                return MeasureScope.layout$default(measureScope0, androidViewHolder0.getMeasuredWidth(), androidViewHolder0.getMeasuredHeight(), null, new f(androidViewHolder0, this.b), 4, null);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams0);
                int v1 = AndroidViewHolder.access$obtainMeasureSpec(this.a, 0, v, viewGroup$LayoutParams0.width);
                this.a.measure(v1, 0);
                return this.a.getMeasuredHeight();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams0);
                int v1 = AndroidViewHolder.access$obtainMeasureSpec(this.a, 0, v, viewGroup$LayoutParams0.height);
                this.a.measure(0, v1);
                return this.a.getMeasuredWidth();
            }
        });
        this.v = layoutNode0;
    }

    public static final int access$obtainMeasureSpec(AndroidViewHolder androidViewHolder0, int v, int v1, int v2) {
        androidViewHolder0.getClass();
        if(v2 < 0 && v != v1) {
            if(v2 == -2 && v1 != 0x7FFFFFFF) {
                return View.MeasureSpec.makeMeasureSpec(v1, 0x80000000);
            }
            return v2 != -1 || v1 == 0x7FFFFFFF ? 0 : View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
        }
        return View.MeasureSpec.makeMeasureSpec(kotlin.ranges.c.coerceIn(v2, v, v1), 0x40000000);
    }

    @Override  // android.view.ViewGroup
    public boolean gatherTransparentRegion(@Nullable Region region0) {
        if(region0 == null) {
            return true;
        }
        this.getLocationInWindow(this.q);
        int v = this.q[0];
        int v1 = this.q[1];
        int v2 = this.getWidth();
        int v3 = this.q[1];
        region0.op(v, v1, v2 + v, this.getHeight() + v3, Region.Op.DIFFERENCE);
        return true;
    }

    @Override  // android.view.ViewGroup
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return this.getClass().getName();
    }

    @NotNull
    public final Density getDensity() {
        return this.j;
    }

    @Nullable
    public final View getInteropView() {
        return this.b;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.v;
    }

    @Override  // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
        return viewGroup$LayoutParams0 == null ? new ViewGroup.LayoutParams(-1, -1) : viewGroup$LayoutParams0;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.l;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.h;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.t.getNestedScrollAxes();
    }

    @Nullable
    public final Function1 getOnDensityChanged$ui_release() {
        return this.k;
    }

    @Nullable
    public final Function1 getOnModifierChanged$ui_release() {
        return this.i;
    }

    @Nullable
    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.p;
    }

    @NotNull
    public final Function0 getRelease() {
        return this.g;
    }

    @NotNull
    public final Function0 getReset() {
        return this.f;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.m;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        if(!this.isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.getSnapshotObserver();
    }

    @NotNull
    public final Function0 getUpdate() {
        return this.d;
    }

    @NotNull
    public final View getView() {
        return this.b;
    }

    @Override  // android.view.ViewGroup
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] arr_v, @Nullable Rect rect0) {
        super.invalidateChildInParent(arr_v, rect0);
        this.invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if(this.u) {
            m5.a a0 = new m5.a(this.o, 3);
            this.b.postOnAnimation(a0);
            return;
        }
        this.v.invalidateLayer$ui_release();
    }

    @Override  // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.isAttachedToWindow();
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.invoke();
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.f.invoke();
        this.removeAllViewsInLayout();
    }

    @Override  // android.view.ViewGroup
    public void onDescendantInvalidated(@NotNull View view0, @NotNull View view1) {
        super.onDescendantInvalidated(view0, view1);
        this.invalidateOrDefer();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getSnapshotObserver().clear$ui_release(this);
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.b.layout(0, 0, v2 - v, v3 - v1);
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        View view0 = this.b;
        if(view0.getParent() != this) {
            this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
            return;
        }
        if(view0.getVisibility() == 8) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        view0.measure(v, v1);
        this.setMeasuredDimension(view0.getMeasuredWidth(), view0.getMeasuredHeight());
        this.r = v;
        this.s = v1;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NotNull View view0, float f, float f1, boolean z) {
        if(!this.isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt.launch$default(this.a.getCoroutineScope(), null, null, new g(z, this, VelocityKt.Velocity(f * -1.0f, f1 * -1.0f), null), 3, null);
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NotNull View view0, float f, float f1) {
        if(!this.isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt.launch$default(this.a.getCoroutineScope(), null, null, new h(this, VelocityKt.Velocity(f * -1.0f, f1 * -1.0f), null), 3, null);
        return false;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull View view0, int v, int v1, @NotNull int[] arr_v, int v2) {
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        int v3 = AndroidViewHolder_androidKt.access$toNestedScrollSource(v2);
        long v4 = this.a.dispatchPreScroll-OzD1aCk(OffsetKt.Offset(((float)v) * -1.0f, ((float)v1) * -1.0f), v3);
        arr_v[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getX-impl(v4));
        arr_v[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getY-impl(v4));
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull View view0, int v, int v1, int v2, int v3, int v4) {
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        int v5 = AndroidViewHolder_androidKt.access$toNestedScrollSource(v4);
        this.a.dispatchPostScroll-DzOQY0M(OffsetKt.Offset(((float)v) * -1.0f, ((float)v1) * -1.0f), OffsetKt.Offset(((float)v2) * -1.0f, ((float)v3) * -1.0f), v5);
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull View view0, int v, int v1, int v2, int v3, int v4, @NotNull int[] arr_v) {
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        int v5 = AndroidViewHolder_androidKt.access$toNestedScrollSource(v4);
        long v6 = this.a.dispatchPostScroll-DzOQY0M(OffsetKt.Offset(((float)v) * -1.0f, ((float)v1) * -1.0f), OffsetKt.Offset(((float)v2) * -1.0f, ((float)v3) * -1.0f), v5);
        arr_v[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getX-impl(v6));
        arr_v[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.getY-impl(v6));
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull View view0, @NotNull View view1, int v, int v1) {
        this.t.onNestedScrollAccepted(view0, view1, v, v1);
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.g.invoke();
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        View view0 = this.b;
        if(view0.getParent() != this) {
            this.addView(view0);
            return;
        }
        this.f.invoke();
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull View view0, @NotNull View view1, int v, int v1) {
        return (v & 2) != 0 || (v & 1) != 0;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull View view0, int v) {
        this.t.onStopNestedScroll(view0, v);
    }

    @Override  // android.view.View
    public void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
    }

    public final void remeasure() {
        int v = this.r;
        if(v != 0x80000000) {
            int v1 = this.s;
            if(v1 != 0x80000000) {
                this.measure(v, v1);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function10 = this.p;
        if(function10 != null) {
            function10.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(@NotNull Density density0) {
        if(density0 != this.j) {
            this.j = density0;
            Function1 function10 = this.k;
            if(function10 != null) {
                function10.invoke(density0);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner0) {
        if(lifecycleOwner0 != this.l) {
            this.l = lifecycleOwner0;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner0);
        }
    }

    public final void setModifier(@NotNull Modifier modifier0) {
        if(modifier0 != this.h) {
            this.h = modifier0;
            Function1 function10 = this.i;
            if(function10 != null) {
                function10.invoke(modifier0);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1 function10) {
        this.k = function10;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1 function10) {
        this.i = function10;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1 function10) {
        this.p = function10;
    }

    public final void setRelease(@NotNull Function0 function00) {
        this.g = function00;
    }

    public final void setReset(@NotNull Function0 function00) {
        this.f = function00;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner0) {
        if(savedStateRegistryOwner0 != this.m) {
            this.m = savedStateRegistryOwner0;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner0);
        }
    }

    public final void setUpdate(@NotNull Function0 function00) {
        this.d = function00;
        this.e = true;
        this.n.invoke();
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }
}

