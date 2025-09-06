package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001A#\u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "scope", "", "Landroidx/compose/ui/layout/Measurable;", "getChildrenOfVirtualChildren", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;)Ljava/util/List;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n151#2,3:48\n33#2,4:51\n154#2,2:55\n38#2:57\n156#2:58\n1#3:59\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:48,3\n32#1:51,4\n32#1:55,2\n32#1:57\n32#1:58\n*E\n"})
public final class MeasureScopeWithLayoutNodeKt {
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
                arr_v[LayoutState.LookaheadLayingOut.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.Measuring.ordinal()] = 3;
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

    public static final boolean a(LayoutNode layoutNode0) {
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()]) {
            case 1: 
            case 2: {
                return true;
            }
            case 3: 
            case 4: {
                return false;
            }
            case 5: {
                LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
                if(layoutNode1 == null) {
                    throw new IllegalArgumentException("no parent for idle node");
                }
                return MeasureScopeWithLayoutNodeKt.a(layoutNode1);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final List getChildrenOfVirtualChildren(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0) {
        Intrinsics.checkNotNull(intrinsicMeasureScope0, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode0 = ((MeasureScopeWithLayoutNode)intrinsicMeasureScope0).getLayoutNode();
        boolean z = MeasureScopeWithLayoutNodeKt.a(layoutNode0);
        List list0 = layoutNode0.getFoldedChildren$ui_release();
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            LayoutNode layoutNode1 = (LayoutNode)list0.get(v1);
            list1.add((z ? layoutNode1.getChildLookaheadMeasurables$ui_release() : layoutNode1.getChildMeasurables$ui_release()));
        }
        return list1;
    }
}

