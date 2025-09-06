package androidx.arch.core.executor;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.h;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l4.b;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class DefaultTaskExecutor extends TaskExecutor {
    public final Object a;
    public final ExecutorService b;
    public volatile Handler c;

    public DefaultTaskExecutor() {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(4, new b(1));
    }

    public static Handler a(Looper looper0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return h.c(looper0);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, 0, Boolean.TRUE);
        }
        catch(IllegalAccessException | InstantiationException | NoSuchMethodException unused_ex) {
            return new Handler(looper0);
        }
        catch(InvocationTargetException unused_ex) {
            return new Handler(looper0);
        }
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@NonNull Runnable runnable0) {
        this.b.execute(runnable0);
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@NonNull Runnable runnable0) {
        if(this.c == null) {
            Object object0 = this.a;
            synchronized(object0) {
                if(this.c == null) {
                    this.c = DefaultTaskExecutor.a(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable0);
    }
}

