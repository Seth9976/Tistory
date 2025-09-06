package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BR\u0018\u0010\r\u001A\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "", "_preHandler", "Ljava/lang/Object;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidExceptionPreHandler extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    @Nullable
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.Key);
        this._preHandler = this;
    }

    @Override  // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext coroutineContext0, @NotNull Throwable throwable0) {
        Method method0;
        if(Build.VERSION.SDK_INT < 28) {
            Object object0 = this._preHandler;
            Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = null;
            if(object0 == this) {
                try {
                    method0 = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                    if(!Modifier.isPublic(method0.getModifiers()) || !Modifier.isStatic(method0.getModifiers())) {
                    label_9:
                        method0 = null;
                    }
                }
                catch(Throwable unused_ex) {
                    goto label_9;
                }
                this._preHandler = method0;
            }
            else {
                method0 = (Method)object0;
            }
            Object object1 = method0 == null ? null : method0.invoke(null, null);
            if(object1 instanceof Thread.UncaughtExceptionHandler) {
                thread$UncaughtExceptionHandler0 = (Thread.UncaughtExceptionHandler)object1;
            }
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(Thread.currentThread(), throwable0);
            }
        }
    }
}

