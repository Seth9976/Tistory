package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.m;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000B\u001A\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\"\u0010$\u001A\u00020\u001D8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001A\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00103\u001A\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\u0017\u00109\u001A\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u0017\u0010?\u001A\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R\u0017\u0010E\u001A\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u0017\u0010K\u001A\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR\u0017\u0010N\u001A\u00020F8\u0006¢\u0006\f\n\u0004\bL\u0010H\u001A\u0004\bM\u0010J¨\u0006O"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "Landroid/content/Context;", "context", "", "name", "Landroid/content/Intent;", "serviceIntent", "Landroidx/room/InvalidationTracker;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/InvalidationTracker;Ljava/util/concurrent/Executor;)V", "", "stop", "()V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "c", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "", "e", "I", "getClientId", "()I", "setClientId", "(I)V", "clientId", "Landroidx/room/InvalidationTracker$Observer;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "setObserver", "(Landroidx/room/InvalidationTracker$Observer;)V", "Landroidx/room/IMultiInstanceInvalidationService;", "f", "Landroidx/room/IMultiInstanceInvalidationService;", "getService", "()Landroidx/room/IMultiInstanceInvalidationService;", "setService", "(Landroidx/room/IMultiInstanceInvalidationService;)V", "service", "Landroidx/room/IMultiInstanceInvalidationCallback;", "g", "Landroidx/room/IMultiInstanceInvalidationCallback;", "getCallback", "()Landroidx/room/IMultiInstanceInvalidationCallback;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getStopped", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "i", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "getSetUpRunnable", "()Ljava/lang/Runnable;", "setUpRunnable", "k", "getRemoveObserverRunnable", "removeObserverRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n95#1:131,2\n*E\n"})
public final class MultiInstanceInvalidationClient {
    public final String a;
    public final InvalidationTracker b;
    public final Executor c;
    public final Context d;
    public int e;
    public IMultiInstanceInvalidationService f;
    public final androidx.room.MultiInstanceInvalidationClient.callback.1 g;
    public final AtomicBoolean h;
    public final androidx.room.MultiInstanceInvalidationClient.serviceConnection.1 i;
    public final t0 j;
    public final t0 k;
    public Observer observer;

    public MultiInstanceInvalidationClient(@NotNull Context context0, @NotNull String s, @NotNull Intent intent0, @NotNull InvalidationTracker invalidationTracker0, @NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(intent0, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker0, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        super();
        this.a = s;
        this.b = invalidationTracker0;
        this.c = executor0;
        Context context1 = context0.getApplicationContext();
        this.d = context1;
        this.g = new Stub() {
            public static final int b;

            @Override  // androidx.room.IMultiInstanceInvalidationCallback
            public void onInvalidation(@NotNull String[] arr_s) {
                Intrinsics.checkNotNullParameter(arr_s, "tables");
                this.a.getExecutor().execute(new m(4, this.a, arr_s));
            }
        };
        this.h = new AtomicBoolean(false);
        androidx.room.MultiInstanceInvalidationClient.serviceConnection.1 multiInstanceInvalidationClient$serviceConnection$10 = new ServiceConnection() {
            public final MultiInstanceInvalidationClient a;

            {
                this.a = multiInstanceInvalidationClient0;
            }

            @Override  // android.content.ServiceConnection
            public void onServiceConnected(@NotNull ComponentName componentName0, @NotNull IBinder iBinder0) {
                Intrinsics.checkNotNullParameter(componentName0, "name");
                Intrinsics.checkNotNullParameter(iBinder0, "service");
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = androidx.room.IMultiInstanceInvalidationService.Stub.asInterface(iBinder0);
                this.a.setService(iMultiInstanceInvalidationService0);
                Runnable runnable0 = this.a.getSetUpRunnable();
                this.a.getExecutor().execute(runnable0);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(@NotNull ComponentName componentName0) {
                Intrinsics.checkNotNullParameter(componentName0, "name");
                Runnable runnable0 = this.a.getRemoveObserverRunnable();
                this.a.getExecutor().execute(runnable0);
                this.a.setService(null);
            }
        };
        this.i = multiInstanceInvalidationClient$serviceConnection$10;
        this.j = new t0(this, 0);
        this.k = new t0(this, 1);
        this.setObserver(new Observer(/*ERROR_MISSING_ARG_1/*) {
            @Override  // androidx.room.InvalidationTracker$Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override  // androidx.room.InvalidationTracker$Observer
            public void onInvalidated(@NotNull Set set0) {
                Intrinsics.checkNotNullParameter(set0, "tables");
                MultiInstanceInvalidationClient multiInstanceInvalidationClient0 = ((String[])invalidationTracker0.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0]));
                if(multiInstanceInvalidationClient0.getStopped().get()) {
                    return;
                }
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = multiInstanceInvalidationClient0.getService();
                if(iMultiInstanceInvalidationService0 != null) {
                    try {
                        iMultiInstanceInvalidationService0.broadcastInvalidation(multiInstanceInvalidationClient0.getClientId(), ((String[])set0.toArray(new String[0])));
                    }
                    catch(RemoteException remoteException0) {
                        Log.w("ROOM", "Cannot broadcast invalidation", remoteException0);
                    }
                }
            }
        });
        context1.bindService(intent0, multiInstanceInvalidationClient$serviceConnection$10, 1);
    }

    @NotNull
    public final IMultiInstanceInvalidationCallback getCallback() {
        return this.g;
    }

    public final int getClientId() {
        return this.e;
    }

    @NotNull
    public final Executor getExecutor() {
        return this.c;
    }

    @NotNull
    public final InvalidationTracker getInvalidationTracker() {
        return this.b;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @NotNull
    public final Observer getObserver() {
        Observer invalidationTracker$Observer0 = this.observer;
        if(invalidationTracker$Observer0 != null) {
            return invalidationTracker$Observer0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    @NotNull
    public final Runnable getRemoveObserverRunnable() {
        return this.k;
    }

    @Nullable
    public final IMultiInstanceInvalidationService getService() {
        return this.f;
    }

    @NotNull
    public final ServiceConnection getServiceConnection() {
        return this.i;
    }

    @NotNull
    public final Runnable getSetUpRunnable() {
        return this.j;
    }

    @NotNull
    public final AtomicBoolean getStopped() {
        return this.h;
    }

    public final void setClientId(int v) {
        this.e = v;
    }

    public final void setObserver(@NotNull Observer invalidationTracker$Observer0) {
        Intrinsics.checkNotNullParameter(invalidationTracker$Observer0, "<set-?>");
        this.observer = invalidationTracker$Observer0;
    }

    public final void setService(@Nullable IMultiInstanceInvalidationService iMultiInstanceInvalidationService0) {
        this.f = iMultiInstanceInvalidationService0;
    }

    public final void stop() {
        if(this.h.compareAndSet(false, true)) {
            Observer invalidationTracker$Observer0 = this.getObserver();
            this.b.removeObserver(invalidationTracker$Observer0);
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = this.f;
            if(iMultiInstanceInvalidationService0 != null) {
                try {
                    iMultiInstanceInvalidationService0.unregisterCallback(this.g, this.e);
                }
                catch(RemoteException remoteException0) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", remoteException0);
                }
            }
            this.d.unbindService(this.i);
        }
    }
}

