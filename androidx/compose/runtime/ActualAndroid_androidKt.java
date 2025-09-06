package androidx.compose.runtime;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import md.c;
import org.jetbrains.annotations.NotNull;
import y0.a;

@Metadata(d1 = {"\u0000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A1\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001A\u00028\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001A\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u0001\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u0017\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0001\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0001\u001A\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001A\u001F\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u0019H\u0000¢\u0006\u0004\b\u001C\u0010\u001D\"!\u0010%\u001A\u00020\u001E8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001F\u0010 \u0012\u0004\b#\u0010$\u001A\u0004\b!\u0010\"\"\u001A\u0010*\u001A\u00020\u000B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)*\f\b\u0000\u0010,\"\u00020+2\u00020+¨\u0006-"}, d2 = {"T", "value", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "createSnapshotMutableState", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "Landroidx/compose/runtime/MutableIntState;", "createSnapshotMutableIntState", "(I)Landroidx/compose/runtime/MutableIntState;", "", "Landroidx/compose/runtime/MutableLongState;", "createSnapshotMutableLongState", "(J)Landroidx/compose/runtime/MutableLongState;", "", "Landroidx/compose/runtime/MutableFloatState;", "createSnapshotMutableFloatState", "(F)Landroidx/compose/runtime/MutableFloatState;", "", "Landroidx/compose/runtime/MutableDoubleState;", "createSnapshotMutableDoubleState", "(D)Landroidx/compose/runtime/MutableDoubleState;", "", "message", "", "e", "", "logError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Landroidx/compose/runtime/MonotonicFrameClock;", "a", "Lkotlin/Lazy;", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "b", "J", "getMainThreadId", "()J", "MainThreadId", "Landroidx/annotation/CheckResult;", "CheckResult", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ActualAndroid_androidKt {
    public static final Lazy a;
    public static final long b;

    static {
        long v;
        ActualAndroid_androidKt.a = c.lazy(a.x);
        try {
            v = -1L;
            v = Looper.getMainLooper().getThread().getId();
        }
        catch(Exception unused_ex) {
        }
        ActualAndroid_androidKt.b = v;
    }

    @NotNull
    public static final MutableDoubleState createSnapshotMutableDoubleState(double f) {
        return new ParcelableSnapshotMutableDoubleState(f);
    }

    @NotNull
    public static final MutableFloatState createSnapshotMutableFloatState(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    @NotNull
    public static final MutableIntState createSnapshotMutableIntState(int v) {
        return new ParcelableSnapshotMutableIntState(v);
    }

    @NotNull
    public static final MutableLongState createSnapshotMutableLongState(long v) {
        return new ParcelableSnapshotMutableLongState(v);
    }

    @NotNull
    public static final SnapshotMutableState createSnapshotMutableState(Object object0, @NotNull SnapshotMutationPolicy snapshotMutationPolicy0) {
        return new ParcelableSnapshotMutableState(object0, snapshotMutationPolicy0);
    }

    @NotNull
    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock)ActualAndroid_androidKt.a.getValue();
    }

    @Deprecated(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static void getDefaultMonotonicFrameClock$annotations() {
    }

    public static final long getMainThreadId() [...] // 潜在的解密器

    public static final void logError(@NotNull String s, @NotNull Throwable throwable0) {
        Log.e("ComposeInternal", s, throwable0);
    }
}

