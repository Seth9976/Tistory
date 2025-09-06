package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ClassVerificationFailure"})
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\n\n\u0002\u0010\u000E\n\u0000\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0087\b\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0003H\u0087\b\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0004H\u0087\b\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toHalf", "Landroid/util/Half;", "", "", "", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,60:1\n43#1:61\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n51#1:61\n*E\n"})
public final class HalfKt {
    @RequiresApi(26)
    @NotNull
    public static final Half toHalf(double f) {
        return Half.valueOf(((float)f));
    }

    @RequiresApi(26)
    @NotNull
    public static final Half toHalf(float f) {
        return Half.valueOf(f);
    }

    @RequiresApi(26)
    @NotNull
    public static final Half toHalf(@NotNull String s) {
        return Half.valueOf(s);
    }

    @RequiresApi(26)
    @NotNull
    public static final Half toHalf(short v) {
        return Half.valueOf(v);
    }
}

