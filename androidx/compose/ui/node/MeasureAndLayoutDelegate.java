package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u00015B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006\u00F8\u0001\u0000\u00A2\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000F\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0011\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u001F\u0010\u0012\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\u0012\u0010\u0010J\u001F\u0010\u0013\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0005J\u001F\u0010\u0017\u001A\u00020\r2\u0010\b\u0002\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\b\u00A2\u0006\u0004\b\u0019\u0010\u001AJ \u0010\u0017\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0015\u0010\u001F\u001A\u00020\b2\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001F\u0010 J\u001D\u0010\"\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010!\u001A\u00020\r\u00A2\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001A\u00020\b2\b\b\u0002\u0010$\u001A\u00020\r\u00A2\u0006\u0004\b%\u0010&J\u0015\u0010(\u001A\u00020\b2\u0006\u0010\'\u001A\u00020\u0002\u00A2\u0006\u0004\b(\u0010\u0005R$\u0010/\u001A\u00020)2\u0006\u0010*\u001A\u00020)8F@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R\u0011\u00102\u001A\u00020\r8F\u00A2\u0006\u0006\u001A\u0004\b0\u00101R\u0011\u00104\u001A\u00020\r8F\u00A2\u0006\u0006\u001A\u0004\b3\u00101\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00066"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "updateRootConstraints-BRTryo0", "(J)V", "updateRootConstraints", "layoutNode", "", "forced", "requestLookaheadRemeasure", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "requestRemeasure", "requestLookaheadRelayout", "requestRelayout", "requestOnPositionedCallback", "Lkotlin/Function0;", "onLayout", "measureAndLayout", "(Lkotlin/jvm/functions/Function0;)Z", "measureOnly", "()V", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "listener", "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "affectsLookahead", "forceMeasureTheSubtree", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "forceDispatch", "dispatchOnPositionedCallbacks", "(Z)V", "node", "onNodeDetached", "", "<set-?>", "g", "J", "getMeasureIteration", "()J", "measureIteration", "getHasPendingMeasureOrLayout", "()Z", "hasPendingMeasureOrLayout", "getHasPendingOnPositionedCallbacks", "hasPendingOnPositionedCallbacks", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 5 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,746:1\n487#1:774\n488#1:780\n490#1,12:782\n503#1,6:801\n487#1:807\n488#1:813\n490#1,19:815\n487#1:853\n488#1:859\n490#1:861\n491#1:867\n493#1:869\n494#1:875\n497#1,12:877\n1208#2:747\n1187#2,2:748\n1208#2:750\n1187#2,2:751\n96#3,7:753\n96#3,7:760\n42#3,7:767\n96#3,5:775\n102#3:781\n96#3,5:808\n102#3:814\n96#3,7:846\n96#3,5:854\n102#3:860\n96#3,5:862\n102#3:868\n96#3,5:870\n102#3:876\n96#3,7:901\n96#3,7:908\n96#3,7:915\n42#3,7:946\n96#3,7:953\n178#4,2:794\n180#4,4:797\n102#5:796\n203#6:834\n203#6:889\n203#6:960\n460#7,11:835\n460#7,11:890\n728#7,2:922\n460#7,11:924\n460#7,11:935\n460#7,11:961\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n387#1:774\n387#1:780\n387#1:782,12\n387#1:801,6\n408#1:807\n408#1:813\n408#1:815,19\n447#1:853\n447#1:859\n447#1:861\n447#1:867\n447#1:869\n447#1:875\n447#1:877,12\n75#1:747\n75#1:748,2\n96#1:750\n96#1:751,2\n83#1:753,7\n105#1:760,7\n139#1:767,7\n387#1:775,5\n387#1:781\n408#1:808,5\n408#1:814\n446#1:846,7\n447#1:854,5\n447#1:860\n447#1:862,5\n447#1:868\n447#1:870,5\n447#1:876\n487#1:901,7\n490#1:908,7\n493#1:915,7\n640#1:946,7\n645#1:953,7\n389#1:794,2\n389#1:797,4\n389#1:796\n426#1:834\n475#1:889\n665#1:960\n426#1:835,11\n475#1:890,11\n511#1:922,2\n515#1:924,11\n591#1:935,11\n665#1:961,11\n*E\n"})
public final class MeasureAndLayoutDelegate {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u0005\u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000E\u001A\u0004\b\u0006\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "a", "Landroidx/compose/ui/node/LayoutNode;", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "b", "Z", "()Z", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class PostponedRequest {
        public static final int $stable = 8;
        public final LayoutNode a;
        public final boolean b;
        public final boolean c;

        public PostponedRequest(@NotNull LayoutNode layoutNode0, boolean z, boolean z1) {
            this.a = layoutNode0;
            this.b = z;
            this.c = z1;
        }

        @NotNull
        public final LayoutNode getNode() {
            return this.a;
        }

        public final boolean isForced() {
            return this.c;
        }

        public final boolean isLookahead() {
            return this.b;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutState.values().length];
            try {
                arr_v[LayoutState.LookaheadMeasuring.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.Measuring.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.LookaheadLayingOut.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.LayingOut.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.Idle.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final LayoutNode a;
    public final DepthSortedSetsForDifferentPasses b;
    public boolean c;
    public boolean d;
    public final OnPositionedDispatcher e;
    public final MutableVector f;
    public final long g;
    public final MutableVector h;
    public Constraints i;
    public final LayoutTreeConsistencyChecker j;

    public MeasureAndLayoutDelegate(@NotNull LayoutNode layoutNode0) {
        this.a = layoutNode0;
        this.b = new DepthSortedSetsForDifferentPasses(false);
        this.e = new OnPositionedDispatcher();
        this.f = new MutableVector(new OnLayoutCompletedListener[16], 0);
        this.g = 1L;
        this.h = new MutableVector(new PostponedRequest[16], 0);
        this.j = null;
    }

    public final void a() {
        MutableVector mutableVector0 = this.f;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((OnLayoutCompletedListener)arr_object[v1]).onLayoutComplete();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        mutableVector0.clear();
    }

    public static boolean b(LayoutNode layoutNode0, Constraints constraints0) {
        if(layoutNode0.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        boolean z = constraints0 == null ? LayoutNode.lookaheadRemeasure-_Sx5XlM$ui_release$default(layoutNode0, null, 1, null) : layoutNode0.lookaheadRemeasure-_Sx5XlM$ui_release(constraints0);
        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
        if(z && layoutNode1 != null) {
            if(layoutNode1.getLookaheadRoot$ui_release() == null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode1, false, false, false, 3, null);
                return z;
            }
            if(layoutNode0.getMeasuredByParentInLookahead$ui_release() == UsageByParent.InMeasureBlock) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode1, false, false, false, 3, null);
                return z;
            }
            if(layoutNode0.getMeasuredByParentInLookahead$ui_release() == UsageByParent.InLayoutBlock) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode1, false, 1, null);
            }
        }
        return z;
    }

    public static boolean c(LayoutNode layoutNode0, Constraints constraints0) {
        boolean z = constraints0 == null ? LayoutNode.remeasure-_Sx5XlM$ui_release$default(layoutNode0, null, 1, null) : layoutNode0.remeasure-_Sx5XlM$ui_release(constraints0);
        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
        if(z && layoutNode1 != null) {
            if(layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode1, false, false, false, 3, null);
                return z;
            }
            if(layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InLayoutBlock) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode1, false, 1, null);
            }
        }
        return z;
    }

    public final void d() {
        MutableVector mutableVector0 = this.h;
        if(mutableVector0.isNotEmpty()) {
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    PostponedRequest measureAndLayoutDelegate$PostponedRequest0 = (PostponedRequest)arr_object[v1];
                    if(measureAndLayoutDelegate$PostponedRequest0.getNode().isAttached()) {
                        if(measureAndLayoutDelegate$PostponedRequest0.isLookahead()) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(measureAndLayoutDelegate$PostponedRequest0.getNode(), measureAndLayoutDelegate$PostponedRequest0.isForced(), false, false, 2, null);
                        }
                        else {
                            LayoutNode.requestRemeasure$ui_release$default(measureAndLayoutDelegate$PostponedRequest0.getNode(), measureAndLayoutDelegate$PostponedRequest0.isForced(), false, false, 2, null);
                        }
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
            mutableVector0.clear();
        }
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        OnPositionedDispatcher onPositionedDispatcher0 = this.e;
        if(z) {
            onPositionedDispatcher0.onRootNodePositioned(this.a);
        }
        onPositionedDispatcher0.dispatch();
    }

    public static void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate0.dispatchOnPositionedCallbacks(z);
    }

    public final void e(LayoutNode layoutNode0) {
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                if(Intrinsics.areEqual(layoutNode1.isPlacedInLookahead(), Boolean.TRUE) && !layoutNode1.isDeactivated()) {
                    if(this.b.contains(layoutNode1, true)) {
                        layoutNode1.lookaheadReplace$ui_release();
                    }
                    this.e(layoutNode1);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void f(LayoutNode layoutNode0, boolean z) {
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v = mutableVector0.getSize();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses0 = this.b;
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                if(!z && MeasureAndLayoutDelegate.g(layoutNode1) || z && MeasureAndLayoutDelegate.h(layoutNode1)) {
                    if(LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode1) && !z) {
                        if(!layoutNode1.getLookaheadMeasurePending$ui_release() || !depthSortedSetsForDifferentPasses0.contains(layoutNode1, true)) {
                            this.forceMeasureTheSubtree(layoutNode1, true);
                        }
                        else {
                            this.i(layoutNode1, true, false);
                        }
                    }
                    if((z ? layoutNode1.getLookaheadMeasurePending$ui_release() : layoutNode1.getMeasurePending$ui_release()) && depthSortedSetsForDifferentPasses0.contains(layoutNode1, z)) {
                        this.i(layoutNode1, z, false);
                    }
                    if(!(z ? layoutNode1.getLookaheadMeasurePending$ui_release() : layoutNode1.getMeasurePending$ui_release())) {
                        this.f(layoutNode1, z);
                    }
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        if((z ? layoutNode0.getLookaheadMeasurePending$ui_release() : layoutNode0.getMeasurePending$ui_release()) && depthSortedSetsForDifferentPasses0.contains(layoutNode0, z)) {
            this.i(layoutNode0, z, false);
        }
    }

    public final void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode0, boolean z) {
        if(this.b.isEmpty(z)) {
            return;
        }
        if(!this.c) {
            InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if((z ? layoutNode0.getLookaheadMeasurePending$ui_release() : layoutNode0.getMeasurePending$ui_release())) {
            InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
        }
        this.f(layoutNode0, z);
    }

    public static boolean g(LayoutNode layoutNode0) {
        return layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock || layoutNode0.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.b.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.e.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if(!this.c) {
            InlineClassHelperKt.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.g;
    }

    public static boolean h(LayoutNode layoutNode0) {
        if(layoutNode0.getMeasuredByParentInLookahead$ui_release() != UsageByParent.InMeasureBlock) {
            AlignmentLinesOwner alignmentLinesOwner0 = layoutNode0.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
            if(alignmentLinesOwner0 != null) {
                AlignmentLines alignmentLines0 = alignmentLinesOwner0.getAlignmentLines();
                return alignmentLines0 != null && alignmentLines0.getRequired$ui_release();
            }
            return false;
        }
        return true;
    }

    public final boolean i(LayoutNode layoutNode0, boolean z, boolean z1) {
        Constraints constraints0;
        boolean z2 = false;
        if(layoutNode0.isDeactivated()) {
            return false;
        }
        if(layoutNode0.isPlaced() || layoutNode0.isPlacedByParent() || layoutNode0.getMeasurePending$ui_release() && MeasureAndLayoutDelegate.g(layoutNode0) || Intrinsics.areEqual(layoutNode0.isPlacedInLookahead(), Boolean.TRUE) || layoutNode0.getLookaheadMeasurePending$ui_release() && MeasureAndLayoutDelegate.h(layoutNode0) || layoutNode0.getAlignmentLinesRequired$ui_release()) {
            LayoutNode layoutNode1 = this.a;
            if(layoutNode0 == layoutNode1) {
                constraints0 = this.i;
                Intrinsics.checkNotNull(constraints0);
            }
            else {
                constraints0 = null;
            }
            if(z) {
                if(layoutNode0.getLookaheadMeasurePending$ui_release()) {
                    z2 = MeasureAndLayoutDelegate.b(layoutNode0, constraints0);
                }
                if(z1 && (z2 || layoutNode0.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual(layoutNode0.isPlacedInLookahead(), Boolean.TRUE)) {
                    layoutNode0.lookaheadReplace$ui_release();
                }
            }
            else {
                boolean z3 = layoutNode0.getMeasurePending$ui_release() ? MeasureAndLayoutDelegate.c(layoutNode0, constraints0) : false;
                if(z1 && layoutNode0.getLayoutPending$ui_release()) {
                    if(layoutNode0 == layoutNode1) {
                    label_21:
                        if(layoutNode0 == layoutNode1) {
                            layoutNode0.place$ui_release(0, 0);
                        }
                        else {
                            layoutNode0.replace$ui_release();
                        }
                        this.e.onNodePositioned(layoutNode0);
                        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.j;
                        if(layoutTreeConsistencyChecker0 != null) {
                            layoutTreeConsistencyChecker0.assertConsistent();
                        }
                    }
                    else {
                        LayoutNode layoutNode2 = layoutNode0.getParent$ui_release();
                        if(layoutNode2 != null && layoutNode2.isPlaced() && layoutNode0.isPlacedByParent()) {
                            goto label_21;
                        }
                    }
                }
                z2 = z3;
            }
            this.d();
        }
        return z2;
    }

    public final void j(LayoutNode layoutNode0) {
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                if(MeasureAndLayoutDelegate.g(layoutNode1)) {
                    if(LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode1)) {
                        this.k(layoutNode1, true);
                    }
                    else {
                        this.j(layoutNode1);
                    }
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void k(LayoutNode layoutNode0, boolean z) {
        Constraints constraints0;
        if(layoutNode0.isDeactivated()) {
            return;
        }
        if(layoutNode0 == this.a) {
            constraints0 = this.i;
            Intrinsics.checkNotNull(constraints0);
        }
        else {
            constraints0 = null;
        }
        if(z) {
            MeasureAndLayoutDelegate.b(layoutNode0, constraints0);
            return;
        }
        MeasureAndLayoutDelegate.c(layoutNode0, constraints0);
    }

    public final boolean measureAndLayout(@Nullable Function0 function00) {
        boolean z1;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses0 = this.b;
        LayoutNode layoutNode0 = this.a;
        if(!layoutNode0.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if(!layoutNode0.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if(this.c) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z = false;
        if(this.i != null) {
            try {
                this.c = true;
                this.d = true;
                if(depthSortedSetsForDifferentPasses0.isNotEmpty()) {
                    z1 = false;
                    while(depthSortedSetsForDifferentPasses0.isNotEmpty()) {
                        boolean z2 = depthSortedSetsForDifferentPasses0.a.isEmpty();
                        LayoutNode layoutNode1 = (z2 ? depthSortedSetsForDifferentPasses0.b : depthSortedSetsForDifferentPasses0.a).pop();
                        if(layoutNode1 == this.a && this.i(layoutNode1, !z2, true)) {
                            z1 = true;
                        }
                    }
                    if(function00 != null) {
                        function00.invoke();
                    }
                }
                else {
                    z1 = false;
                }
            }
            finally {
                this.c = false;
                this.d = false;
            }
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.j;
            if(layoutTreeConsistencyChecker0 != null) {
                layoutTreeConsistencyChecker0.assertConsistent();
            }
            z = z1;
        }
        this.a();
        return z;
    }

    public static boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        return measureAndLayoutDelegate0.measureAndLayout(function00);
    }

    public final void measureAndLayout-0kLqBqw(@NotNull LayoutNode layoutNode0, long v) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0;
        if(layoutNode0.isDeactivated()) {
            return;
        }
        LayoutNode layoutNode1 = this.a;
        if(Intrinsics.areEqual(layoutNode0, layoutNode1)) {
            InlineClassHelperKt.throwIllegalArgumentException("measureAndLayout called on root");
        }
        if(!layoutNode1.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if(!layoutNode1.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if(this.c) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if(this.i != null) {
            try {
                this.c = true;
                this.d = false;
                this.b.remove(layoutNode0);
                if((MeasureAndLayoutDelegate.b(layoutNode0, Constraints.box-impl(v)) || layoutNode0.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual(layoutNode0.isPlacedInLookahead(), Boolean.TRUE)) {
                    layoutNode0.lookaheadReplace$ui_release();
                }
                this.e(layoutNode0);
                MeasureAndLayoutDelegate.c(layoutNode0, Constraints.box-impl(v));
                if(layoutNode0.getLayoutPending$ui_release() && layoutNode0.isPlaced()) {
                    layoutNode0.replace$ui_release();
                    this.e.onNodePositioned(layoutNode0);
                }
                this.d();
                this.c = false;
                this.d = false;
                layoutTreeConsistencyChecker0 = this.j;
            }
            catch(Throwable throwable0) {
                this.c = false;
                this.d = false;
                throw throwable0;
            }
            if(layoutTreeConsistencyChecker0 != null) {
                layoutTreeConsistencyChecker0.assertConsistent();
            }
        }
        this.a();
    }

    public final void measureOnly() {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses0 = this.b;
        if(depthSortedSetsForDifferentPasses0.isNotEmpty()) {
            LayoutNode layoutNode0 = this.a;
            if(!layoutNode0.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if(!layoutNode0.isPlaced()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if(this.c) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if(this.i != null) {
                try {
                    this.c = true;
                    this.d = false;
                    if(!depthSortedSetsForDifferentPasses0.isEmpty(true)) {
                        if(layoutNode0.getLookaheadRoot$ui_release() == null) {
                            this.j(layoutNode0);
                        }
                        else {
                            this.k(layoutNode0, true);
                        }
                    }
                    this.k(layoutNode0, false);
                    this.c = false;
                    this.d = false;
                    layoutTreeConsistencyChecker0 = this.j;
                }
                catch(Throwable throwable0) {
                    this.c = false;
                    this.d = false;
                    throw throwable0;
                }
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                }
            }
        }
    }

    public final void onNodeDetached(@NotNull LayoutNode layoutNode0) {
        this.b.remove(layoutNode0);
        this.e.remove(layoutNode0);
    }

    public final void registerOnLayoutCompletedListener(@NotNull OnLayoutCompletedListener owner$OnLayoutCompletedListener0) {
        this.f.add(owner$OnLayoutCompletedListener0);
    }

    public final boolean requestLookaheadRelayout(@NotNull LayoutNode layoutNode0, boolean z) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.j;
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()]) {
            case 1: 
            case 3: {
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                }
                break;
            }
            case 2: 
            case 4: 
            case 5: {
                if(!layoutNode0.getLookaheadMeasurePending$ui_release() && !layoutNode0.getLookaheadLayoutPending$ui_release() || z) {
                    layoutNode0.markLookaheadLayoutPending$ui_release();
                    layoutNode0.markLayoutPending$ui_release();
                    if(!layoutNode0.isDeactivated()) {
                        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
                        boolean z1 = Intrinsics.areEqual(layoutNode0.isPlacedInLookahead(), Boolean.TRUE);
                        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses0 = this.b;
                        if(z1 && (layoutNode1 == null || !layoutNode1.getLookaheadMeasurePending$ui_release()) && (layoutNode1 == null || !layoutNode1.getLookaheadLayoutPending$ui_release())) {
                            depthSortedSetsForDifferentPasses0.add(layoutNode0, true);
                            return !this.d;
                        }
                        if(layoutNode0.isPlaced() && (layoutNode1 == null || !layoutNode1.getLayoutPending$ui_release()) && (layoutNode1 == null || !layoutNode1.getMeasurePending$ui_release())) {
                            depthSortedSetsForDifferentPasses0.add(layoutNode0, false);
                        }
                        return !this.d;
                    }
                }
                else if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                    return false;
                }
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public static boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate0.requestLookaheadRelayout(layoutNode0, z);
    }

    public final boolean requestLookaheadRemeasure(@NotNull LayoutNode layoutNode0, boolean z) {
        if(layoutNode0.getLookaheadRoot$ui_release() == null) {
            InlineClassHelperKt.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()]) {
            case 1: {
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                PostponedRequest measureAndLayoutDelegate$PostponedRequest0 = new PostponedRequest(layoutNode0, true, z);
                this.h.add(measureAndLayoutDelegate$PostponedRequest0);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.j;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                }
                break;
            }
            case 5: {
                if(!layoutNode0.getLookaheadMeasurePending$ui_release() || z) {
                    layoutNode0.markLookaheadMeasurePending$ui_release();
                    layoutNode0.markMeasurePending$ui_release();
                    if(!layoutNode0.isDeactivated()) {
                        boolean z1 = Intrinsics.areEqual(layoutNode0.isPlacedInLookahead(), Boolean.TRUE);
                        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses0 = this.b;
                        if(z1 || layoutNode0.getLookaheadMeasurePending$ui_release() && MeasureAndLayoutDelegate.h(layoutNode0)) {
                            LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
                            if(layoutNode1 == null || !layoutNode1.getLookaheadMeasurePending$ui_release()) {
                                depthSortedSetsForDifferentPasses0.add(layoutNode0, true);
                                return !this.d;
                            }
                        }
                        if(layoutNode0.isPlaced() || layoutNode0.getMeasurePending$ui_release() && MeasureAndLayoutDelegate.g(layoutNode0)) {
                            LayoutNode layoutNode2 = layoutNode0.getParent$ui_release();
                            if(layoutNode2 == null || !layoutNode2.getMeasurePending$ui_release()) {
                                depthSortedSetsForDifferentPasses0.add(layoutNode0, false);
                                return !this.d;
                            }
                        }
                        return !this.d;
                    }
                }
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public static boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate0.requestLookaheadRemeasure(layoutNode0, z);
    }

    public final void requestOnPositionedCallback(@NotNull LayoutNode layoutNode0) {
        this.e.onNodePositioned(layoutNode0);
    }

    public final boolean requestRelayout(@NotNull LayoutNode layoutNode0, boolean z) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.j;
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                    return false;
                }
                break;
            }
            case 5: {
                if(z || layoutNode0.isPlaced() != layoutNode0.isPlacedByParent() || !layoutNode0.getMeasurePending$ui_release() && !layoutNode0.getLayoutPending$ui_release()) {
                    layoutNode0.markLayoutPending$ui_release();
                    if(!layoutNode0.isDeactivated() && layoutNode0.isPlacedByParent()) {
                        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
                        if((layoutNode1 == null || !layoutNode1.getLayoutPending$ui_release()) && (layoutNode1 == null || !layoutNode1.getMeasurePending$ui_release())) {
                            this.b.add(layoutNode0, false);
                        }
                        return !this.d;
                    }
                }
                else if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                    return false;
                }
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public static boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate0.requestRelayout(layoutNode0, z);
    }

    public final boolean requestRemeasure(@NotNull LayoutNode layoutNode0, boolean z) {
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()]) {
            case 1: 
            case 2: {
                break;
            }
            case 3: 
            case 4: {
                PostponedRequest measureAndLayoutDelegate$PostponedRequest0 = new PostponedRequest(layoutNode0, false, z);
                this.h.add(measureAndLayoutDelegate$PostponedRequest0);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.j;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                    return false;
                }
                break;
            }
            case 5: {
                if(!layoutNode0.getMeasurePending$ui_release() || z) {
                    layoutNode0.markMeasurePending$ui_release();
                    if(!layoutNode0.isDeactivated() && (layoutNode0.isPlaced() || layoutNode0.getMeasurePending$ui_release() && MeasureAndLayoutDelegate.g(layoutNode0))) {
                        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
                        if(layoutNode1 == null || !layoutNode1.getMeasurePending$ui_release()) {
                            this.b.add(layoutNode0, false);
                        }
                        return !this.d;
                    }
                }
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public static boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate0.requestRemeasure(layoutNode0, z);
    }

    public final void updateRootConstraints-BRTryo0(long v) {
        boolean z = false;
        if(!(this.i == null ? false : Constraints.equals-impl0(this.i.unbox-impl(), v))) {
            if(this.c) {
                InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
            }
            this.i = Constraints.box-impl(v);
            LayoutNode layoutNode0 = this.a;
            if(layoutNode0.getLookaheadRoot$ui_release() != null) {
                layoutNode0.markLookaheadMeasurePending$ui_release();
            }
            layoutNode0.markMeasurePending$ui_release();
            if(layoutNode0.getLookaheadRoot$ui_release() != null) {
                z = true;
            }
            this.b.add(layoutNode0, z);
        }
    }
}

