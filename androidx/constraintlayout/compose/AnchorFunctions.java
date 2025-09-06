package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\bÀ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R@\u0010\u0010\u001A+\u0012\'\u0012%\u0012!\u0012\u001F\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000B0\b0\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR:\u0010\u0016\u001A%\u0012!\u0012\u001F\u0012\u001B\u0012\u0019\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0002\b\u000B0\b0\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R.\u0010\u001B\u001A\u0019\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0002\b\u000B8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/constraintlayout/compose/AnchorFunctions;", "", "", "index", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "verticalAnchorIndexToFunctionIndex", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "", "Lkotlin/Function3;", "Landroidx/constraintlayout/core/state/ConstraintReference;", "Lkotlin/ExtensionFunctionType;", "a", "[[Lkotlin/jvm/functions/Function3;", "getVerticalAnchorFunctions", "()[[Lkotlin/jvm/functions/Function3;", "verticalAnchorFunctions", "Lkotlin/Function2;", "b", "[[Lkotlin/jvm/functions/Function2;", "getHorizontalAnchorFunctions", "()[[Lkotlin/jvm/functions/Function2;", "horizontalAnchorFunctions", "c", "Lkotlin/jvm/functions/Function2;", "getBaselineAnchorFunction", "()Lkotlin/jvm/functions/Function2;", "baselineAnchorFunction", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AnchorFunctions {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            arr_v[LayoutDirection.Ltr.ordinal()] = 1;
            arr_v[LayoutDirection.Rtl.ordinal()] = 2;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final AnchorFunctions INSTANCE;
    public static final Function3[][] a;
    public static final Function2[][] b;
    public static final a c;

    static {
        AnchorFunctions.INSTANCE = new AnchorFunctions();  // 初始化器: Ljava/lang/Object;-><init>()V
        AnchorFunctions.a = new Function3[][]{new Function3[]{b.x, b.y}, new Function3[]{b.z, b.A}};
        AnchorFunctions.b = new Function2[][]{new Function2[]{a.y, a.z}, new Function2[]{a.A, a.B}};
        AnchorFunctions.c = a.x;
    }

    public static final void access$clearLeft(AnchorFunctions anchorFunctions0, ConstraintReference constraintReference0, LayoutDirection layoutDirection0) {
        anchorFunctions0.getClass();
        constraintReference0.leftToLeft(null);
        constraintReference0.leftToRight(null);
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
            case 1: {
                constraintReference0.startToStart(null);
                constraintReference0.startToEnd(null);
                return;
            }
            case 2: {
                constraintReference0.endToStart(null);
                constraintReference0.endToEnd(null);
            }
        }
    }

    public static final void access$clearRight(AnchorFunctions anchorFunctions0, ConstraintReference constraintReference0, LayoutDirection layoutDirection0) {
        anchorFunctions0.getClass();
        constraintReference0.rightToLeft(null);
        constraintReference0.rightToRight(null);
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
            case 1: {
                constraintReference0.endToStart(null);
                constraintReference0.endToEnd(null);
                return;
            }
            case 2: {
                constraintReference0.startToStart(null);
                constraintReference0.startToEnd(null);
            }
        }
    }

    @NotNull
    public final Function2 getBaselineAnchorFunction() {
        return AnchorFunctions.c;
    }

    @NotNull
    public final Function2[][] getHorizontalAnchorFunctions() {
        return AnchorFunctions.b;
    }

    @NotNull
    public final Function3[][] getVerticalAnchorFunctions() {
        return AnchorFunctions.a;
    }

    public final int verticalAnchorIndexToFunctionIndex(int v, @NotNull LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        if(v < 0) {
            return layoutDirection0 == LayoutDirection.Ltr ? v + 2 : -v - 1;
        }
        return v;
    }
}

