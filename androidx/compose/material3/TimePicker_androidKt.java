package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001A\u0010\u0000\u001A\u00020\u00018AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"defaultTimePickerLayoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "getDefaultTimePickerLayoutType$annotations", "()V", "getDefaultTimePickerLayoutType", "(Landroidx/compose/runtime/Composer;I)I", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTimePicker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,35:1\n77#2:36\n*S KotlinDebug\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n*L\n28#1:36\n*E\n"})
public final class TimePicker_androidKt {
    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getDefaultTimePickerLayoutType")
    public static final int getDefaultTimePickerLayoutType(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8A04973B, v, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:27)");
        }
        Configuration configuration0 = (Configuration)composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        int v1 = configuration0.screenHeightDp >= configuration0.screenWidthDp ? 1 : 0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public static void getDefaultTimePickerLayoutType$annotations() {
    }
}

