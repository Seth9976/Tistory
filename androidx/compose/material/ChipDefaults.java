package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.g3;
import p0.y2;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001JN\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJN\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000BJl\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016Jl\u0010\u0019\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0016R\u001D\u0010\u001F\u001A\u00020\u001A8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0014\u0010!\u001A\u00020 8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b!\u0010\u001CR\u0014\u0010\"\u001A\u00020 8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\"\u0010\u001CR\u0014\u0010#\u001A\u00020 8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b#\u0010\u001CR\u001D\u0010&\u001A\u00020\u001A8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b$\u0010\u001C\u001A\u0004\b%\u0010\u001ER\u001D\u0010)\u001A\u00020\u001A8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\'\u0010\u001C\u001A\u0004\b(\u0010\u001ER\u001D\u0010,\u001A\u00020\u001A8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b*\u0010\u001C\u001A\u0004\b+\u0010\u001ER\u0011\u00100\u001A\u00020-8G\u00A2\u0006\u0006\u001A\u0004\b.\u0010/\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00061"}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "Landroidx/compose/material/ChipColors;", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "chipColors", "outlinedChipColors-5tl4gsc", "outlinedChipColors", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "Landroidx/compose/material/SelectableChipColors;", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "filterChipColors", "outlinedFilterChipColors-J08w3-E", "outlinedFilterChipColors", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "", "LeadingIconOpacity", "ContentOpacity", "OutlinedBorderOpacity", "b", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "c", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "d", "getSelectedIconSize-D9Ej5fM", "SelectedIconSize", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,761:1\n154#2:762\n154#2:763\n154#2:764\n154#2:765\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n377#1:762\n572#1:763\n577#1:764\n582#1:765\n*E\n"})
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    @NotNull
    public static final ChipDefaults INSTANCE = null;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        ChipDefaults.INSTANCE = new ChipDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        ChipDefaults.a = 32.0f;
        ChipDefaults.b = 1.0f;
        ChipDefaults.c = 20.0f;
        ChipDefaults.d = 18.0f;
    }

    @Composable
    @NotNull
    public final ChipColors chipColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        composer0.startReplaceableGroup(1838505436);
        long v8 = (v7 & 1) == 0 ? v : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v9 = (v7 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        long v10 = (v7 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(v9, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v11 = (v7 & 8) == 0 ? v3 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v12 = (v7 & 16) == 0 ? v4 : Color.copy-wmQWz5c$default(v9, ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        long v13 = (v7 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(v10, ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, v6, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:405)");
        }
        ChipColors chipColors0 = new y2(v8, v9, v10, v11, v12, v13);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return chipColors0;
    }

    @Composable
    @NotNull
    public final SelectableChipColors filterChipColors-J08w3-E(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, @Nullable Composer composer0, int v9, int v10) {
        composer0.startReplaceableGroup(0x317AF0D5);
        long v11 = (v10 & 1) == 0 ? v : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v12 = (v10 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        long v13 = (v10 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(v12, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v14 = (v10 & 8) == 0 ? v3 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v15 = (v10 & 16) == 0 ? v4 : Color.copy-wmQWz5c$default(v12, ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        long v16 = (v10 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(v13, ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v17 = (v10 & 0x40) == 0 ? v6 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), v11);
        long v18 = (v10 & 0x80) == 0 ? v7 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), v12);
        long v19 = (v10 & 0x100) == 0 ? v8 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), v13);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x317AF0D5, v9, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:485)");
        }
        SelectableChipColors selectableChipColors0 = new g3(v11, v12, v13, v14, v15, v16, v17, v18, v19);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return selectableChipColors0;
    }

    public final float getLeadingIconSize-D9Ej5fM() {
        return ChipDefaults.c;
    }

    public final float getMinHeight-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(-1650225597);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, v, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:549)");
        }
        long v1 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(ChipDefaults.b, v1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return borderStroke0;
    }

    public final float getOutlinedBorderSize-D9Ej5fM() {
        return ChipDefaults.b;
    }

    public final float getSelectedIconSize-D9Ej5fM() {
        return ChipDefaults.d;
    }

    @Composable
    @NotNull
    public final ChipColors outlinedChipColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        composer0.startReplaceableGroup(0x96DCAD1A);
        long v8 = (v7 & 1) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU();
        long v9 = (v7 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        long v10 = (v7 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(v9, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v11 = (v7 & 16) == 0 ? v4 : Color.copy-wmQWz5c$default(v9, ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        long v12 = (v7 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(v10, ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x96DCAD1A, v6, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:437)");
        }
        ChipColors chipColors0 = this.chipColors-5tl4gsc(v8, v9, v10, ((v7 & 8) == 0 ? v3 : v8), v11, v12, composer0, v6 & 0x3FFFFE, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return chipColors0;
    }

    @Composable
    @NotNull
    public final SelectableChipColors outlinedFilterChipColors-J08w3-E(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, @Nullable Composer composer0, int v9, int v10) {
        composer0.startReplaceableGroup(0x14ACF093);
        long v11 = (v10 & 1) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU();
        long v12 = (v10 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        long v13 = (v10 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(v12, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v14 = (v10 & 16) == 0 ? v4 : Color.copy-wmQWz5c$default(v12, ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        long v15 = (v10 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(v13, ContentAlpha.INSTANCE.getDisabled(composer0, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v16 = (v10 & 0x40) == 0 ? v6 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), v11);
        long v17 = (v10 & 0x80) == 0 ? v7 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), v12);
        long v18 = (v10 & 0x100) == 0 ? v8 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), v13);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x14ACF093, v9, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:532)");
        }
        SelectableChipColors selectableChipColors0 = new g3(v11, v12, v13, ((v10 & 8) == 0 ? v3 : v11), v14, v15, v16, v17, v18);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return selectableChipColors0;
    }
}

