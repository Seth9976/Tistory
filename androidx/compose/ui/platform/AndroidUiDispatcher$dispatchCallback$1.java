package androidx.compose.ui.platform;

import android.view.Choreographer.FrameCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000F\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n36#2:192\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:192\n*E\n"})
public final class AndroidUiDispatcher.dispatchCallback.1 implements Choreographer.FrameCallback, Runnable {
    public final AndroidUiDispatcher a;

    public AndroidUiDispatcher.dispatchCallback.1(AndroidUiDispatcher androidUiDispatcher0) {
        this.a = androidUiDispatcher0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public void doFrame(long v) {
        AndroidUiDispatcher.access$getHandler$p(this.a).removeCallbacks(this);
        AndroidUiDispatcher.access$performTrampolineDispatch(this.a);
        AndroidUiDispatcher.access$performFrameDispatch(this.a, v);
    }

    @Override
    public void run() {
        AndroidUiDispatcher.access$performTrampolineDispatch(this.a);
        Object object0 = AndroidUiDispatcher.access$getLock$p(this.a);
        AndroidUiDispatcher androidUiDispatcher0 = this.a;
        synchronized(object0) {
            if(AndroidUiDispatcher.access$getToRunOnFrame$p(androidUiDispatcher0).isEmpty()) {
                androidUiDispatcher0.getChoreographer().removeFrameCallback(this);
                AndroidUiDispatcher.access$setScheduledFrameDispatch$p(androidUiDispatcher0, false);
            }
        }
    }
}

