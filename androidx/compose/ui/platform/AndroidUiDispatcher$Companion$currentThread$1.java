package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001A\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "initialValue", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
public final class AndroidUiDispatcher.Companion.currentThread.1 extends ThreadLocal {
    @Override
    public Object initialValue() {
        return this.initialValue();
    }

    @NotNull
    public CoroutineContext initialValue() {
        Choreographer choreographer0 = Choreographer.getInstance();
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        AndroidUiDispatcher androidUiDispatcher0 = new AndroidUiDispatcher(choreographer0, HandlerCompat.createAsync(looper0), null);
        return androidUiDispatcher0.plus(androidUiDispatcher0.getFrameClock());
    }
}

