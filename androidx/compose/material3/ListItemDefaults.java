package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001Jl\u0010\u000F\u001A\u00020\f2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000ER\u001D\u0010\u0015\u001A\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001A\u00020\u00168G¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u001D\u001A\u00020\u00028Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/material3/ListItemDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "headlineColor", "leadingIconColor", "overlineColor", "supportingColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "Landroidx/compose/material3/ListItemColors;", "colors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ListItemColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getElevation-D9Ej5fM", "()F", "Elevation", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "getContentColor", "contentColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ListItemDefaults {
    public static final int $stable;
    @NotNull
    public static final ListItemDefaults INSTANCE;
    public static final float a;

    static {
        ListItemDefaults.INSTANCE = new ListItemDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        ListItemDefaults.a = ListTokens.INSTANCE.getListItemContainerElevation-D9Ej5fM();
    }

    @Composable
    @NotNull
    public final ListItemColors colors-J08w3-E(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, @Nullable Composer composer0, int v9, int v10) {
        long v11 = (v10 & 1) == 0 ? v : ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer0, 6);
        long v12 = (v10 & 2) == 0 ? v1 : ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer0, 6);
        long v13 = (v10 & 4) == 0 ? v2 : ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLeadingIconColor(), composer0, 6);
        long v14 = (v10 & 8) == 0 ? v3 : ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemOverlineColor(), composer0, 6);
        long v15 = (v10 & 16) == 0 ? v4 : ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemSupportingTextColor(), composer0, 6);
        long v16 = (v10 & 0x20) == 0 ? v5 : ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemTrailingIconColor(), composer0, 6);
        long v17 = (v10 & 0x40) == 0 ? v6 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemDisabledLabelTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v18 = (v10 & 0x80) == 0 ? v7 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v19 = (v10 & 0x100) == 0 ? v8 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEAFD0997, v9, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:582)");
        }
        ListItemColors listItemColors0 = new ListItemColors(v11, v12, v13, v14, v15, v16, v17, v18, v19, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listItemColors0;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB547E367, v, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:539)");
        }
        long v1 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getContentColor")
    public final long getContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x40237FE7, v, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:543)");
        }
        long v1 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE2625753, v, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:535)");
        }
        Shape shape0 = ShapesKt.getValue(ListTokens.INSTANCE.getListItemContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }
}

