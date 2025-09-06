package androidx.compose.material3;

import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BR\u0018\u0010\u000F\u001A\u00020\u0002*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/RadioButtonDefaults;", "", "Landroidx/compose/material3/RadioButtonColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RadioButtonColors;", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "colors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RadioButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultRadioButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RadioButtonColors;", "defaultRadioButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
public final class RadioButtonDefaults {
    public static final int $stable;
    @NotNull
    public static final RadioButtonDefaults INSTANCE;

    static {
        RadioButtonDefaults.INSTANCE = new RadioButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final RadioButtonColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB8FA24CE, v, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:140)");
        }
        RadioButtonColors radioButtonColors0 = this.getDefaultRadioButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return radioButtonColors0;
    }

    @Composable
    @NotNull
    public final RadioButtonColors colors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-351083046, v4, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:160)");
        }
        RadioButtonColors radioButtonColors0 = this.getDefaultRadioButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0L), ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return radioButtonColors0;
    }

    @NotNull
    public final RadioButtonColors getDefaultRadioButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        RadioButtonColors radioButtonColors0 = colorScheme0.getDefaultRadioButtonColorsCached$material3_release();
        if(radioButtonColors0 == null) {
            radioButtonColors0 = new RadioButtonColors(ColorSchemeKt.fromToken(colorScheme0, RadioButtonTokens.INSTANCE.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme0, RadioButtonTokens.INSTANCE.getUnselectedIconColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, RadioButtonTokens.INSTANCE.getDisabledSelectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, RadioButtonTokens.INSTANCE.getDisabledUnselectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultRadioButtonColorsCached$material3_release(radioButtonColors0);
        }
        return radioButtonColors0;
    }
}

