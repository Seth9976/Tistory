package androidx.compose.foundation.gestures;

import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.x;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001,B)\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001A\u00020\u00142\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000F0\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001A\u00020\u00142\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001F\u001A\u00020\u00142\u0006\u0010\u001C\u001A\u00020\u001BH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001EJ\'\u0010 \u001A\u00020\u00142\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\t2\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b \u0010!R*\u0010\'\u001A\u00020\u001B2\u0006\u0010\"\u001A\u00020\u001B8\u0000@BX\u0080\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001A\u0010(\u001A\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "", "reverseDirection", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "Landroidx/compose/ui/geometry/Rect;", "localRect", "calculateRectForParent", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Lkotlin/Function0;", "", "bringChildIntoView", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newBounds", "onFocusBoundsChanged", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "update", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "<set-?>", "v", "J", "getViewportSize-YbymL2g$foundation_release", "()J", "viewportSize", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "Request", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,438:1\n314#2,11:439\n1#3:450\n106#4,2:451\n108#4:464\n492#5,11:453\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n130#1:439,11\n334#1:451,2\n334#1:464\n334#1:453,11\n*E\n"})
public final class ContentInViewNode extends Node implements BringIntoViewResponder, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fR\u001F\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function0;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "b", "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,438:1\n1#2:439\n*E\n"})
    public static final class Request {
        public static final int $stable = 8;
        public final Function0 a;
        public final CancellableContinuation b;

        public Request(@NotNull Function0 function00, @NotNull CancellableContinuation cancellableContinuation0) {
            this.a = function00;
            this.b = cancellableContinuation0;
        }

        @NotNull
        public final CancellableContinuation getContinuation() {
            return this.b;
        }

        @NotNull
        public final Function0 getCurrentBounds() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            String s2;
            CancellableContinuation cancellableContinuation0 = this.b;
            CoroutineName coroutineName0 = (CoroutineName)cancellableContinuation0.getContext().get(CoroutineName.Key);
            String s = coroutineName0 == null ? null : coroutineName0.getName();
            StringBuilder stringBuilder0 = new StringBuilder("Request@");
            String s1 = Integer.toString(this.hashCode(), b.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this, checkRadix(radix))");
            stringBuilder0.append(s1);
            if(s == null) {
                s2 = "(";
            }
            else {
                s2 = "[" + s + "](";
                if(s2 == null) {
                    s2 = "(";
                }
            }
            stringBuilder0.append(s2);
            stringBuilder0.append("currentBounds()=");
            stringBuilder0.append(this.a.invoke());
            stringBuilder0.append(", continuation=");
            stringBuilder0.append(cancellableContinuation0);
            stringBuilder0.append(')');
            return stringBuilder0.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.Vertical.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.Horizontal.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public Orientation n;
    public final ScrollingLogic o;
    public boolean p;
    public BringIntoViewSpec q;
    public final BringIntoViewRequestPriorityQueue r;
    public LayoutCoordinates s;
    public Rect t;
    public boolean u;
    public long v;
    public boolean w;

    public ContentInViewNode(@NotNull Orientation orientation0, @NotNull ScrollingLogic scrollingLogic0, boolean z, @Nullable BringIntoViewSpec bringIntoViewSpec0) {
        this.n = orientation0;
        this.o = scrollingLogic0;
        this.p = z;
        this.q = bringIntoViewSpec0;
        this.r = new BringIntoViewRequestPriorityQueue();
        this.v = 0L;
    }

    public static final float access$calculateScrollDelta(ContentInViewNode contentInViewNode0, BringIntoViewSpec bringIntoViewSpec0) {
        int v4;
        Rect rect1;
        if(!IntSize.equals-impl0(contentInViewNode0.v, 0L)) {
            MutableVector mutableVector0 = contentInViewNode0.r.a;
            int v = mutableVector0.getSize();
            Rect rect0 = null;
            if(v > 0) {
                int v1 = v - 1;
                Object[] arr_object = mutableVector0.getContent();
                rect1 = null;
                do {
                    Rect rect2 = (Rect)((Request)arr_object[v1]).getCurrentBounds().invoke();
                    if(rect2 != null) {
                        long v2 = rect2.getSize-NH-jbRc();
                        long v3 = IntSizeKt.toSize-ozmzZPI(contentInViewNode0.v);
                        switch(contentInViewNode0.n) {
                            case 1: {
                                v4 = Float.compare(Size.getHeight-impl(v2), Size.getHeight-impl(v3));
                                break;
                            }
                            case 2: {
                                v4 = Float.compare(Size.getWidth-impl(v2), Size.getWidth-impl(v3));
                                break;
                            }
                            default: {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if(v4 <= 0) {
                            rect1 = rect2;
                            goto label_23;
                        }
                        if(rect1 != null) {
                            break;
                        }
                        rect1 = rect2;
                        break;
                    }
                label_23:
                    --v1;
                }
                while(v1 >= 0);
            }
            else {
                rect1 = null;
            }
            if(rect1 != null) {
                goto label_32;
            }
            if(contentInViewNode0.u) {
                rect0 = contentInViewNode0.b();
            }
            if(rect0 != null) {
                rect1 = rect0;
            label_32:
                long v5 = IntSizeKt.toSize-ozmzZPI(contentInViewNode0.v);
                switch(contentInViewNode0.n) {
                    case 1: {
                        return bringIntoViewSpec0.calculateScrollDistance(rect1.getTop(), rect1.getBottom() - rect1.getTop(), Size.getHeight-impl(v5));
                    }
                    case 2: {
                        return bringIntoViewSpec0.calculateScrollDistance(rect1.getLeft(), rect1.getRight() - rect1.getLeft(), Size.getWidth-impl(v5));
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return 0.0f;
    }

    public final Rect b() {
        if(!this.isAttached()) {
            return null;
        }
        LayoutCoordinates layoutCoordinates0 = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates1 = this.s;
        if(layoutCoordinates1 != null) {
            if(!layoutCoordinates1.isAttached()) {
                layoutCoordinates1 = null;
            }
            return layoutCoordinates1 == null ? null : layoutCoordinates0.localBoundingBoxOf(layoutCoordinates1, false);
        }
        return null;
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringChildIntoView(@NotNull Function0 function00, @NotNull Continuation continuation0) {
        Rect rect0 = (Rect)function00.invoke();
        if(rect0 != null && !this.c(this.v, rect0)) {
            CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
            cancellableContinuationImpl0.initCancellability();
            if(this.r.enqueue(new Request(function00, cancellableContinuationImpl0)) && !this.w) {
                this.d();
            }
            Object object0 = cancellableContinuationImpl0.getResult();
            if(object0 == a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation0);
            }
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final boolean c(long v, Rect rect0) {
        long v1 = this.e(v, rect0);
        return Math.abs(Offset.getX-impl(v1)) <= 0.5f && Math.abs(Offset.getY-impl(v1)) <= 0.5f;
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect calculateRectForParent(@NotNull Rect rect0) {
        if(IntSize.equals-impl0(this.v, 0L)) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return rect0.translate-k-4lQ0M(Offset.unaryMinus-F1C5BW0(this.e(this.v, rect0)));
    }

    public final void d() {
        BringIntoViewSpec bringIntoViewSpec0 = this.q == null ? ((BringIntoViewSpec)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec())) : this.q;
        if(this.w) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        UpdatableAnimationState updatableAnimationState0 = new UpdatableAnimationState(bringIntoViewSpec0.getScrollAnimationSpec());
        CoroutineScope coroutineScope0 = this.getCoroutineScope();
        x x0 = new x(this, updatableAnimationState0, bringIntoViewSpec0, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, x0, 1, null);
    }

    public final long e(long v, Rect rect0) {
        long v1 = IntSizeKt.toSize-ozmzZPI(v);
        switch(this.n) {
            case 1: {
                return OffsetKt.Offset(0.0f, (this.q == null ? ((BringIntoViewSpec)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec())) : this.q).calculateScrollDistance(rect0.getTop(), rect0.getBottom() - rect0.getTop(), Size.getHeight-impl(v1)));
            }
            case 2: {
                return OffsetKt.Offset((this.q == null ? ((BringIntoViewSpec)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec())) : this.q).calculateScrollDistance(rect0.getLeft(), rect0.getRight() - rect0.getLeft(), Size.getWidth-impl(v1)), 0.0f);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final long getViewportSize-YbymL2g$foundation_release() {
        return this.v;
    }

    public final void onFocusBoundsChanged(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.s = layoutCoordinates0;
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onRemeasured-ozmzZPI(long v) {
        int v2;
        long v1 = this.v;
        this.v = v;
        switch(this.n) {
            case 1: {
                v2 = Intrinsics.compare(IntSize.getHeight-impl(v), IntSize.getHeight-impl(v1));
                break;
            }
            case 2: {
                v2 = Intrinsics.compare(IntSize.getWidth-impl(v), IntSize.getWidth-impl(v1));
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        if(v2 >= 0) {
            return;
        }
        Rect rect0 = this.b();
        if(rect0 != null) {
            if(!this.w && !this.u && this.c(v1, (this.t == null ? rect0 : this.t)) && !this.c(v, rect0)) {
                this.u = true;
                this.d();
            }
            this.t = rect0;
        }
    }

    public final void update(@NotNull Orientation orientation0, boolean z, @Nullable BringIntoViewSpec bringIntoViewSpec0) {
        this.n = orientation0;
        this.p = z;
        this.q = bringIntoViewSpec0;
    }
}

