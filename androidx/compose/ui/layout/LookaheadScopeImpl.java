package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001A\u00020\u0003*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u0006R\u0018\u0010\u0011\u001A\u00020\u0003*\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScope;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "scopeCoordinates", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "a", "Lkotlin/jvm/functions/Function0;", "getScopeCoordinates", "()Lkotlin/jvm/functions/Function0;", "setScopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LookaheadScopeImpl implements LookaheadScope {
    public static final int $stable = 8;
    public Function0 a;

    public LookaheadScopeImpl() {
        this(null, 1, null);
    }

    public LookaheadScopeImpl(@Nullable Function0 function00) {
        this.a = function00;
    }

    public LookaheadScopeImpl(Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        this(function00);
    }

    @Override  // androidx.compose.ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull PlacementScope placeable$PlacementScope0) {
        Function0 function00 = this.a;
        Intrinsics.checkNotNull(function00);
        return (LayoutCoordinates)function00.invoke();
    }

    @Nullable
    public final Function0 getScopeCoordinates() {
        return this.a;
    }

    public final void setScopeCoordinates(@Nullable Function0 function00) {
        this.a = function00;
    }

    @Override  // androidx.compose.ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates1 = layoutCoordinates0 instanceof LookaheadLayoutCoordinates ? ((LookaheadLayoutCoordinates)layoutCoordinates0) : null;
        if(layoutCoordinates1 == null) {
            Intrinsics.checkNotNull(layoutCoordinates0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            LookaheadDelegate lookaheadDelegate0 = ((NodeCoordinator)layoutCoordinates0).getLookaheadDelegate();
            if(lookaheadDelegate0 == null) {
                return (NodeCoordinator)layoutCoordinates0;
            }
            layoutCoordinates1 = lookaheadDelegate0.getLookaheadLayoutCoordinates();
            if(layoutCoordinates1 == null) {
                return (NodeCoordinator)layoutCoordinates0;
            }
        }
        return layoutCoordinates1;
    }
}

