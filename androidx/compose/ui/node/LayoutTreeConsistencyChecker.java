package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "", "assertConsistent", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,143:1\n33#2,6:144\n116#2,2:150\n33#2,6:152\n118#2:158\n116#2,2:159\n33#2,6:161\n118#2:167\n33#2,6:168\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:144,6\n59#1:150,2\n59#1:152,6\n59#1:158\n84#1:159,2\n84#1:161,6\n84#1:167\n136#1:168,6\n*E\n"})
public final class LayoutTreeConsistencyChecker {
    public static final int $stable = 8;
    public final LayoutNode a;
    public final DepthSortedSetsForDifferentPasses b;
    public final List c;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode layoutNode0, @NotNull DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses0, @NotNull List list0) {
        this.a = layoutNode0;
        this.b = depthSortedSetsForDifferentPasses0;
        this.c = list0;
    }

    public final boolean a(LayoutNode layoutNode0) {
        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
        Object object0 = null;
        LayoutState layoutNode$LayoutState0 = layoutNode1 == null ? null : layoutNode1.getLayoutState$ui_release();
        List list0 = this.c;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses0 = this.b;
        if(layoutNode0.isPlaced() || layoutNode0.getPlaceOrder$ui_release() != 0x7FFFFFFF && layoutNode1 != null && layoutNode1.isPlaced()) {
            if(layoutNode0.getMeasurePending$ui_release()) {
                int v = list0.size();
                for(int v1 = 0; true; ++v1) {
                    Object object1 = null;
                    if(v1 >= v) {
                        break;
                    }
                    Object object2 = list0.get(v1);
                    if(Intrinsics.areEqual(((PostponedRequest)object2).getNode(), layoutNode0) && !((PostponedRequest)object2).isLookahead()) {
                        object1 = object2;
                        break;
                    }
                }
                if(object1 != null) {
                    return true;
                }
            }
            if(layoutNode0.getMeasurePending$ui_release()) {
                return depthSortedSetsForDifferentPasses0.contains(layoutNode0) || layoutNode0.getLayoutState$ui_release() == LayoutState.LookaheadMeasuring || layoutNode1 != null && layoutNode1.getMeasurePending$ui_release() || layoutNode1 != null && layoutNode1.getLookaheadMeasurePending$ui_release() || layoutNode$LayoutState0 == LayoutState.Measuring;
            }
            if(layoutNode0.getLayoutPending$ui_release()) {
                return depthSortedSetsForDifferentPasses0.contains(layoutNode0) || layoutNode1 == null || layoutNode1.getMeasurePending$ui_release() || layoutNode1.getLayoutPending$ui_release() || layoutNode$LayoutState0 == LayoutState.Measuring || layoutNode$LayoutState0 == LayoutState.LayingOut;
            }
        }
        if(Intrinsics.areEqual(layoutNode0.isPlacedInLookahead(), Boolean.TRUE)) {
            if(layoutNode0.getLookaheadMeasurePending$ui_release()) {
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    Object object3 = list0.get(v3);
                    if(Intrinsics.areEqual(((PostponedRequest)object3).getNode(), layoutNode0) && ((PostponedRequest)object3).isLookahead()) {
                        object0 = object3;
                        break;
                    }
                }
                if(object0 != null) {
                    return true;
                }
            }
            return layoutNode0.getLookaheadMeasurePending$ui_release() ? depthSortedSetsForDifferentPasses0.contains(layoutNode0, true) || layoutNode1 != null && layoutNode1.getLookaheadMeasurePending$ui_release() || layoutNode$LayoutState0 == LayoutState.LookaheadMeasuring || layoutNode1 != null && layoutNode1.getMeasurePending$ui_release() && Intrinsics.areEqual(layoutNode0.getLookaheadRoot$ui_release(), layoutNode0) : !layoutNode0.getLookaheadLayoutPending$ui_release() || (depthSortedSetsForDifferentPasses0.contains(layoutNode0, true) || layoutNode1 == null || layoutNode1.getLookaheadMeasurePending$ui_release() || layoutNode1.getLookaheadLayoutPending$ui_release() || layoutNode$LayoutState0 == LayoutState.LookaheadMeasuring || layoutNode$LayoutState0 == LayoutState.LookaheadLayingOut || layoutNode1.getLayoutPending$ui_release() && Intrinsics.areEqual(layoutNode0.getLookaheadRoot$ui_release(), layoutNode0));
        }
        return true;
    }

    public final void assertConsistent() {
        LayoutNode layoutNode0 = this.a;
        if(this.b(layoutNode0)) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        LayoutTreeConsistencyChecker.c(this, stringBuilder0, layoutNode0, 0);
        System.out.println(stringBuilder0.toString());
        throw new IllegalStateException("Inconsistency found!");
    }

    public final boolean b(LayoutNode layoutNode0) {
        if(!this.a(layoutNode0)) {
            return false;
        }
        List list0 = layoutNode0.getChildren$ui_release();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.b(((LayoutNode)list0.get(v1)))) {
                return false;
            }
        }
        return true;
    }

    public static final void c(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0, StringBuilder stringBuilder0, LayoutNode layoutNode0, int v) {
        layoutTreeConsistencyChecker0.getClass();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(layoutNode0);
        stringBuilder1.append("[" + layoutNode0.getLayoutState$ui_release() + ']');
        if(!layoutNode0.isPlaced()) {
            stringBuilder1.append("[!isPlaced]");
        }
        stringBuilder1.append("[measuredByParent=" + layoutNode0.getMeasuredByParent$ui_release() + ']');
        if(!layoutTreeConsistencyChecker0.a(layoutNode0)) {
            stringBuilder1.append("[INCONSISTENT]");
        }
        String s = stringBuilder1.toString();
        if(s.length() > 0) {
            for(int v2 = 0; v2 < v; ++v2) {
                stringBuilder0.append("..");
            }
            stringBuilder0.append(s);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
            ++v;
        }
        List list0 = layoutNode0.getChildren$ui_release();
        int v3 = list0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            LayoutTreeConsistencyChecker.c(layoutTreeConsistencyChecker0, stringBuilder0, ((LayoutNode)list0.get(v1)), v);
        }
    }
}

