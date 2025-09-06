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
import p0.f3;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J0\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledColor", "Landroidx/compose/material/RadioButtonColors;", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "colors", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n67#2,3:234\n66#2:237\n1116#3,6:238\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n168#1:234,3\n168#1:237\n168#1:238,6\n*E\n"})
public final class RadioButtonDefaults {
    public static final int $stable;
    @NotNull
    public static final RadioButtonDefaults INSTANCE;

    static {
        RadioButtonDefaults.INSTANCE = new RadioButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final RadioButtonColors colors-RGew2ao(long v, long v1, long v2, @Nullable Composer composer0, int v3, int v4) {
        composer0.startReplaceableGroup(1370708026);
        long v5 = (v4 & 1) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSecondary-0d7_KjU();
        long v6 = (v4 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        long v7 = (v4 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1370708026, v3, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:166)");
        }
        Color color0 = Color.box-impl(v5);
        Color color1 = Color.box-impl(v6);
        Color color2 = Color.box-impl(v7);
        composer0.startReplaceableGroup(0x607FB4C4);
        boolean z = composer0.changed(color0);
        boolean z1 = composer0.changed(color1);
        boolean z2 = composer0.changed(color2);
        f3 f30 = composer0.rememberedValue();
        if((z | z1 | z2) != 0 || f30 == Composer.Companion.getEmpty()) {
            f30 = new f3(v5, v6, v7);
            composer0.updateRememberedValue(f30);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return f30;
    }
}

