package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u009E\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u00052\b\b\u0002\u0010\u0012\u001A\u00020\u00052\b\b\u0002\u0010\u0013\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001A\u00020\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001D\u001A\u00020\u0002*\u00020\u001A8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/material3/TimePickerDefaults;", "", "Landroidx/compose/material3/TimePickerColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TimePickerColors;", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "colors-u3YEpmA", "(JJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TimePickerColors;", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType-sDNSZnc", "(Landroidx/compose/runtime/Composer;I)I", "layoutType", "Landroidx/compose/material3/ColorScheme;", "getDefaultTimePickerColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TimePickerColors;", "defaultTimePickerColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2008:1\n1#2:2009\n*E\n"})
public final class TimePickerDefaults {
    public static final int $stable;
    @NotNull
    public static final TimePickerDefaults INSTANCE;

    static {
        TimePickerDefaults.INSTANCE = new TimePickerDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final TimePickerColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085808058, v, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:270)");
        }
        TimePickerColors timePickerColors0 = this.getDefaultTimePickerColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerColors0;
    }

    // 去混淆评级： 中等(50)
    @Composable
    @NotNull
    public final TimePickerColors colors-u3YEpmA(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, @Nullable Composer composer0, int v14, int v15, int v16) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD9797260, v14, v15, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:317)");
        }
        TimePickerColors timePickerColors0 = this.getDefaultTimePickerColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-dVHXu7A(((v16 & 1) == 0 ? v : 0L), ((v16 & 8) == 0 ? v3 : 0L), ((v16 & 16) == 0 ? v4 : 0L), ((v16 & 0x20) == 0 ? v5 : 0L), ((v16 & 2) == 0 ? v1 : 0L), ((v16 & 4) == 0 ? v2 : 0L), ((v16 & 0x40) == 0 ? v6 : 0L), ((v16 & 0x80) == 0 ? v7 : 0L), ((v16 & 0x100) == 0 ? v8 : 0L), ((v16 & 0x200) == 0 ? v9 : 0L), ((v16 & 0x400) == 0 ? v10 : 0L), ((v16 & 0x800) == 0 ? v11 : 0L), ((v16 & 0x1000) == 0 ? v12 : 0L), ((v16 & 0x2000) == 0 ? v13 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerColors0;
    }

    @NotNull
    public final TimePickerColors getDefaultTimePickerColors$material3_release(@NotNull ColorScheme colorScheme0) {
        TimePickerColors timePickerColors0 = colorScheme0.getDefaultTimePickerColorsCached$material3_release();
        if(timePickerColors0 == null) {
            long v = ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getClockDialColor());
            long v1 = ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getClockDialSelectedLabelTextColor());
            long v2 = ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getClockDialUnselectedLabelTextColor());
            timePickerColors0 = new TimePickerColors(v, ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getClockDialSelectorHandleContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getPeriodSelectorOutlineColor()), v1, v2, ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getPeriodSelectorSelectedContainerColor()), Color.Companion.getTransparent-0d7_KjU(), ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getPeriodSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getPeriodSelectorUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getTimeSelectorSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getTimeSelectorUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getTimeSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, TimePickerTokens.INSTANCE.getTimeSelectorUnselectedLabelTextColor()), null);
            colorScheme0.setDefaultTimePickerColorsCached$material3_release(timePickerColors0);
        }
        return timePickerColors0;
    }

    @Composable
    @ReadOnlyComposable
    public final int layoutType-sDNSZnc(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(517161502, v, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:367)");
        }
        int v1 = TimePicker_androidKt.getDefaultTimePickerLayoutType(composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }
}

