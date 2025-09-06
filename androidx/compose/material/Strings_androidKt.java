package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.R.string;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001A\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0006"}, d2 = {"getString", "", "string", "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n74#2:40\n74#2:41\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n26#1:40\n27#1:41\n*E\n"})
public final class Strings_androidKt {
    @Composable
    @NotNull
    public static final String getString-4foXLRw(int v, @Nullable Composer composer0, int v1) {
        String s;
        composer0.startReplaceableGroup(0xD4B06095);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD4B06095, v1, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources0 = ((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        if(Strings.equals-impl0(v, 0)) {
            s = resources0.getString(string.navigation_menu);
        }
        else if(Strings.equals-impl0(v, 1)) {
            s = resources0.getString(string.close_drawer);
        }
        else if(Strings.equals-impl0(v, 2)) {
            s = resources0.getString(string.close_sheet);
        }
        else if(Strings.equals-impl0(v, 3)) {
            s = resources0.getString(string.default_error_message);
        }
        else if(Strings.equals-impl0(v, 4)) {
            s = resources0.getString(string.dropdown_menu);
        }
        else if(Strings.equals-impl0(v, 5)) {
            s = resources0.getString(string.range_start);
        }
        else {
            s = Strings.equals-impl0(v, 6) ? resources0.getString(string.range_end) : "";
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return s;
    }
}

