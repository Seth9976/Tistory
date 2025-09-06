package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004JN\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001A\u00020\u0002*\u00020\u000E8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/CheckboxDefaults;", "", "Landroidx/compose/material3/CheckboxColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CheckboxColors;", "Landroidx/compose/ui/graphics/Color;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "colors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CheckboxColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCheckboxColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CheckboxColors;", "defaultCheckboxColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,607:1\n1#2:608\n*E\n"})
public final class CheckboxDefaults {
    public static final int $stable;
    @NotNull
    public static final CheckboxDefaults INSTANCE;

    static {
        CheckboxDefaults.INSTANCE = new CheckboxDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final CheckboxColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9530498, v, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:193)");
        }
        CheckboxColors checkboxColors0 = this.getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return checkboxColors0;
    }

    // 去混淆评级： 低(22)
    @Composable
    @NotNull
    public final CheckboxColors colors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        long v8 = (v7 & 1) == 0 ? v : 0L;
        long v9 = (v7 & 8) == 0 ? v3 : 0L;
        long v10 = (v7 & 0x20) == 0 ? v5 : 0L;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFAA9C960, v6, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:219)");
        }
        CheckboxColors checkboxColors0 = this.getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-2qZNXz8(((v7 & 4) == 0 ? v2 : 0L), 0L, v8, 0L, v9, 0L, v10, v8, ((v7 & 2) == 0 ? v1 : 0L), v9, ((v7 & 16) == 0 ? v4 : 0L), v10);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return checkboxColors0;
    }

    @NotNull
    public final CheckboxColors getDefaultCheckboxColors$material3_release(@NotNull ColorScheme colorScheme0) {
        CheckboxColors checkboxColors0 = colorScheme0.getDefaultCheckboxColorsCached$material3_release();
        if(checkboxColors0 == null) {
            checkboxColors0 = new CheckboxColors(ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getSelectedIconColor()), 0L, ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getSelectedContainerColor()), 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getUnselectedOutlineColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultCheckboxColorsCached$material3_release(checkboxColors0);
        }
        return checkboxColors0;
    }
}

