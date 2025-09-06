package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001J\'\u0010\t\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/Ruler;", "", "", "coordinate", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "targetCoordinates", "calculateCoordinate$ui_release", "(FLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)F", "calculateCoordinate", "Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class Ruler {
    public static final int $stable;

    public Ruler(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract float calculateCoordinate$ui_release(float arg1, @NotNull LayoutCoordinates arg2, @NotNull LayoutCoordinates arg3);
}

