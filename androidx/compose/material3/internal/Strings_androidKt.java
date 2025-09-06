package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001A\u001A\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A.\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"getString", "", "string", "Landroidx/compose/material3/internal/Strings;", "getString-2EP1pXo", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "getString-qBjtwXw", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/internal/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,243:1\n77#2:244\n77#2:245\n77#2:246\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/internal/Strings_androidKt\n*L\n32#1:244\n33#1:245\n42#1:246\n*E\n"})
public final class Strings_androidKt {
    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String getString-2EP1pXo(int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC9E5EFED, v1, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        String s = ((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(v);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return s;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String getString-qBjtwXw(int v, @NotNull Object[] arr_object, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAAED9C00, v1, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String s = Strings_androidKt.getString-2EP1pXo(v, composer0, v1 & 14);
        Locale locale0 = ConfigurationCompat.getLocales(((Configuration)composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration()))).get(0);
        if(locale0 == null) {
            locale0 = Locale.getDefault();
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        String s1 = String.format(locale0, s, Arrays.copyOf(arr_object1, arr_object1.length));
        Intrinsics.checkNotNullExpressionValue(s1, "format(locale, format, *args)");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return s1;
    }
}

