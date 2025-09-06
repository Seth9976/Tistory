package androidx.compose.foundation;

import android.view.Surface;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import u.w;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003JW\u0010\r\u001A\u00020\u000B*\u00020\u00042A\u0010\r\u001A=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0005¢\u0006\u0002\b\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000EJ-\u0010\u0010\u001A\u00020\u000B*\u00020\u00042\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000B0\u000F¢\u0006\u0002\b\fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001A\u00020\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"androidx/compose/foundation/BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Landroidx/compose/foundation/SurfaceScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/Surface;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "width", "height", "", "Lkotlin/ExtensionFunctionType;", "onChanged", "(Landroid/view/Surface;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function1;", "onDestroyed", "(Landroid/view/Surface;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BaseAndroidExternalSurfaceState.dispatchSurfaceCreated.1.receiver.1 implements SurfaceCoroutineScope, SurfaceScope, CoroutineScope {
    public final w a;
    public final CoroutineScope b;

    public BaseAndroidExternalSurfaceState.dispatchSurfaceCreated.1.receiver.1(w w0, CoroutineScope coroutineScope0) {
        this.a = w0;
        this.b = coroutineScope0;
    }

    @Override  // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // androidx.compose.foundation.SurfaceScope
    public void onChanged(@NotNull Surface surface0, @NotNull Function3 function30) {
        this.a.c = function30;
    }

    @Override  // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(@NotNull Surface surface0, @NotNull Function1 function10) {
        this.a.d = function10;
    }
}

