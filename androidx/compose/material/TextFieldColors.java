package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001B\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0007J\u001B\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0007J+\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\fH\'¢\u0006\u0002\u0010\rJ+\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\fH\'¢\u0006\u0002\u0010\rJ#\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0011J+\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u001B\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0007J\u001B\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0007J#\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\'¢\u0006\u0002\u0010\u0011J+\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\fH\u0017¢\u0006\u0002\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "backgroundColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "cursorColor", "isError", "indicatorColor", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", "error", "leadingIconColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "placeholderColor", "textColor", "trailingIconColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TextFieldColors {
    @Composable
    @NotNull
    State backgroundColor(boolean arg1, @Nullable Composer arg2, int arg3);

    @Composable
    @NotNull
    State cursorColor(boolean arg1, @Nullable Composer arg2, int arg3);

    @Composable
    @NotNull
    State indicatorColor(boolean arg1, boolean arg2, @NotNull InteractionSource arg3, @Nullable Composer arg4, int arg5);

    @Composable
    @NotNull
    State labelColor(boolean arg1, boolean arg2, @NotNull InteractionSource arg3, @Nullable Composer arg4, int arg5);

    @Composable
    @NotNull
    default State leadingIconColor(boolean z, boolean z1, @NotNull InteractionSource interactionSource0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(-1036335134);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1036335134, v, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:128)");
        }
        State state0 = this.leadingIconColor(z, z1, composer0, v & 0x7E | v >> 3 & 0x380);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @ReplaceWith(expression = "leadingIconColor(enabled, isError, interactionSource)", imports = {}))
    @NotNull
    State leadingIconColor(boolean arg1, boolean arg2, @Nullable Composer arg3, int arg4);

    @Composable
    @NotNull
    State placeholderColor(boolean arg1, @Nullable Composer arg2, int arg3);

    @Composable
    @NotNull
    State textColor(boolean arg1, @Nullable Composer arg2, int arg3);

    @Composable
    @NotNull
    default State trailingIconColor(boolean z, boolean z1, @NotNull InteractionSource interactionSource0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(454310320);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(454310320, v, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:161)");
        }
        State state0 = this.trailingIconColor(z, z1, composer0, v & 0x7E | v >> 3 & 0x380);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @ReplaceWith(expression = "trailingIconColor(enabled, isError, interactionSource)", imports = {}))
    @NotNull
    State trailingIconColor(boolean arg1, boolean arg2, @Nullable Composer arg3, int arg4);
}

