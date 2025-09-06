package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.x2;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001JD\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "Landroidx/compose/material/CheckboxColors;", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "colors", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n83#2,3:486\n1116#3,6:489\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n234#1:486,3\n234#1:489,6\n*E\n"})
public final class CheckboxDefaults {
    public static final int $stable;
    @NotNull
    public static final CheckboxDefaults INSTANCE;

    static {
        CheckboxDefaults.INSTANCE = new CheckboxDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final CheckboxColors colors-zjMxDiM(long v, long v1, long v2, long v3, long v4, @Nullable Composer composer0, int v5, int v6) {
        composer0.startReplaceableGroup(0x1BFC5E88);
        long v7 = (v6 & 1) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSecondary-0d7_KjU();
        long v8 = (v6 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        long v9 = (v6 & 4) == 0 ? v2 : MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU();
        long v10 = (v6 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v11 = (v6 & 16) == 0 ? v4 : Color.copy-wmQWz5c$default(v7, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1BFC5E88, v5, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:232)");
        }
        Object[] arr_object = {Color.box-impl(v7), Color.box-impl(v8), Color.box-impl(v9), Color.box-impl(v10), Color.box-impl(v11)};
        composer0.startReplaceableGroup(0xDE219177);
        boolean z = false;
        for(int v12 = 0; v12 < 5; ++v12) {
            z |= composer0.changed(arr_object[v12]);
        }
        x2 x20 = composer0.rememberedValue();
        if(z || x20 == Composer.Companion.getEmpty()) {
            x20 = new x2(v9, Color.copy-wmQWz5c$default(v9, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), v7, Color.copy-wmQWz5c$default(v7, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), v10, Color.copy-wmQWz5c$default(v10, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), v11, v7, v8, v10, v11);
            composer0.updateRememberedValue(x20);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return x20;
    }
}

