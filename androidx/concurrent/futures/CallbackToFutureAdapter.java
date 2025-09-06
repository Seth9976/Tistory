package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class CallbackToFutureAdapter {
    public static final class Completer {
        public Object a;
        public b b;
        public ResolvableFuture c;
        public boolean d;

        public void addCancellationListener(@NonNull Runnable runnable0, @NonNull Executor executor0) {
            ResolvableFuture resolvableFuture0 = this.c;
            if(resolvableFuture0 != null) {
                resolvableFuture0.addListener(runnable0, executor0);
            }
        }

        @Override
        public void finalize() {
            b b0 = this.b;
            if(b0 != null) {
                a a0 = b0.b;
                if(!a0.isDone()) {
                    a0.setException(new androidx.work.impl.utils.futures.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
                }
            }
            if(!this.d) {
                ResolvableFuture resolvableFuture0 = this.c;
                if(resolvableFuture0 != null) {
                    resolvableFuture0.set(null);
                }
            }
        }

        public boolean set(Object object0) {
            this.d = true;
            if(this.b == null || !this.b.b.set(object0)) {
                return false;
            }
            this.a = null;
            this.b = null;
            this.c = null;
            return true;
        }

        public boolean setCancelled() {
            this.d = true;
            if(this.b == null || !this.b.b.cancel(true)) {
                return false;
            }
            this.a = null;
            this.b = null;
            this.c = null;
            return true;
        }

        public boolean setException(@NonNull Throwable throwable0) {
            this.d = true;
            if(this.b == null || !this.b.b.setException(throwable0)) {
                return false;
            }
            this.a = null;
            this.b = null;
            this.c = null;
            return true;
        }
    }

    public interface Resolver {
        @Nullable
        Object attachCompleter(@NonNull Completer arg1) throws Exception;
    }

    @NonNull
    public static ListenableFuture getFuture(@NonNull Resolver callbackToFutureAdapter$Resolver0) {
        Completer callbackToFutureAdapter$Completer0 = new Completer();  // 初始化器: Ljava/lang/Object;-><init>()V
        callbackToFutureAdapter$Completer0.c = ResolvableFuture.create();
        b b0 = new b(callbackToFutureAdapter$Completer0);
        callbackToFutureAdapter$Completer0.b = b0;
        callbackToFutureAdapter$Completer0.a = callbackToFutureAdapter$Resolver0.getClass();
        try {
            Object object0 = callbackToFutureAdapter$Resolver0.attachCompleter(callbackToFutureAdapter$Completer0);
            if(object0 != null) {
                callbackToFutureAdapter$Completer0.a = object0;
                return b0;
            }
        }
        catch(Exception exception0) {
            b0.b.setException(exception0);
        }
        return b0;
    }
}

