package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001B\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0007J\u001B\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0007J\u001B\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0007J\u001B\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/NavigationDrawerItemColors;", "", "badgeColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "selected", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "iconColor", "textColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface NavigationDrawerItemColors {
    @Composable
    @NotNull
    State badgeColor(boolean arg1, @Nullable Composer arg2, int arg3);

    @Composable
    @NotNull
    State containerColor(boolean arg1, @Nullable Composer arg2, int arg3);

    @Composable
    @NotNull
    State iconColor(boolean arg1, @Nullable Composer arg2, int arg3);

    @Composable
    @NotNull
    State textColor(boolean arg1, @Nullable Composer arg2, int arg3);
}

