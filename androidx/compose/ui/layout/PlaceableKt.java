package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z1.i;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "lookaheadCapablePlaceable", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "PlacementScope", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/node/Owner;", "owner", "(Landroidx/compose/ui/node/Owner;)Landroidx/compose/ui/layout/Placeable$PlacementScope;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PlaceableKt {
    public static final i a;
    public static final long b;

    static {
        PlaceableKt.a = i.z;
        PlaceableKt.b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @NotNull
    public static final PlacementScope PlacementScope(@NotNull LookaheadCapablePlaceable lookaheadCapablePlaceable0) {
        return new g(lookaheadCapablePlaceable0);
    }

    @NotNull
    public static final PlacementScope PlacementScope(@NotNull Owner owner0) {
        return new j(owner0);
    }

    public static final long access$getDefaultConstraints$p() [...] // 潜在的解密器
}

