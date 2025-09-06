package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalLayoutApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0015J\u000F\u0010\u0005\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u000E\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00022\u0017\u0010\u000B\u001A\u0013\u0012\u000F\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u0007H\u0000¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "createOverflowState$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "createOverflowState", "state", "", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "list", "addOverflowComposables$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V", "addOverflowComposables", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "a", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "type", "OverflowType", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,906:1\n1#2:907\n*E\n"})
public abstract class FlowLayoutOverflow {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "", "Visible", "Clip", "ExpandIndicator", "ExpandOrCollapseIndicator", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum OverflowType {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator;

    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[OverflowType.values().length];
            try {
                arr_v[OverflowType.ExpandIndicator.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public final OverflowType a;
    public final int b;
    public final int c;
    public final Function1 d;
    public final Function1 e;

    public FlowLayoutOverflow(OverflowType flowLayoutOverflow$OverflowType0, int v, int v1, Function1 function10, Function1 function11, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(flowLayoutOverflow$OverflowType0, ((v2 & 2) == 0 ? v : 0), ((v2 & 4) == 0 ? v1 : 0), ((v2 & 8) == 0 ? function10 : null), ((v2 & 16) == 0 ? function11 : null), null);
    }

    public FlowLayoutOverflow(OverflowType flowLayoutOverflow$OverflowType0, int v, int v1, Function1 function10, Function1 function11, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = flowLayoutOverflow$OverflowType0;
        this.b = v;
        this.c = v1;
        this.d = function10;
        this.e = function11;
    }

    public final void addOverflowComposables$foundation_layout_release(@NotNull FlowLayoutOverflowState flowLayoutOverflowState0, @NotNull List list0) {
        Function2 function20 = null;
        Function2 function21 = this.d == null ? null : ((Function2)this.d.invoke(flowLayoutOverflowState0));
        Function1 function10 = this.e;
        if(function10 != null) {
            function20 = (Function2)function10.invoke(flowLayoutOverflowState0);
        }
        switch(this.a) {
            case 1: {
                if(function21 != null) {
                    list0.add(function21);
                    return;
                }
                break;
            }
            case 2: {
                if(function21 != null) {
                    list0.add(function21);
                }
                if(function20 != null) {
                    list0.add(function20);
                    return;
                }
                break;
            }
        }
    }

    @NotNull
    public final FlowLayoutOverflowState createOverflowState$foundation_layout_release() {
        return new FlowLayoutOverflowState(this.a, this.b, this.c);
    }

    @NotNull
    public final OverflowType getType$foundation_layout_release() {
        return this.a;
    }
}

