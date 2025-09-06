package androidx.compose.ui.res;

import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001A\u001F\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001A3\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0012\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001A\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000B\u001A\u0017\u0010\f\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\r\u001A+\u0010\f\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\u000E¨\u0006\u000F"}, d2 = {"pluralStringResource", "", "id", "", "count", "(IILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "(II[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "stringArrayResource", "(ILandroidx/compose/runtime/Composer;I)[Ljava/lang/String;", "stringResource", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class StringResources_androidKt {
    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String pluralStringResource(@PluralsRes int v, int v1, @Nullable Composer composer0, int v2) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6A60FE9A, v2, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String s = Resources_androidKt.resources(composer0, 0).getQuantityString(v, v1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return s;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String pluralStringResource(@PluralsRes int v, int v1, @NotNull Object[] arr_object, @Nullable Composer composer0, int v2) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1F2F822D, v2, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String s = Resources_androidKt.resources(composer0, 0).getQuantityString(v, v1, Arrays.copyOf(arr_object, arr_object.length));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return s;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String[] stringArrayResource(@ArrayRes int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1562162650, v1, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] arr_s = Resources_androidKt.resources(composer0, 0).getStringArray(v);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return arr_s;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String stringResource(@StringRes int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x48F30C41, v1, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String s = Resources_androidKt.resources(composer0, 0).getString(v);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return s;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String stringResource(@StringRes int v, @NotNull Object[] arr_object, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2071230100, v1, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String s = Resources_androidKt.resources(composer0, 0).getString(v, Arrays.copyOf(arr_object, arr_object.length));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return s;
    }
}

