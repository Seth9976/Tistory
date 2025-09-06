package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalRoomApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001A\u00020\t8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR&\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R \u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "a", "I", "getMaxClientId$room_runtime_release", "()I", "setMaxClientId$room_runtime_release", "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "getClientNames$room_runtime_release", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "c", "Landroid/os/RemoteCallbackList;", "getCallbackList$room_runtime_release", "()Landroid/os/RemoteCallbackList;", "callbackList", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final LinkedHashMap b;
    public final androidx.room.MultiInstanceInvalidationService.callbackList.1 c;
    public final androidx.room.MultiInstanceInvalidationService.binder.1 d;

    public MultiInstanceInvalidationService() {
        this.b = new LinkedHashMap();
        this.c = new RemoteCallbackList() {
            @Override  // android.os.RemoteCallbackList
            public void onCallbackDied(IInterface iInterface0, Object object0) {
                this.onCallbackDied(((IMultiInstanceInvalidationCallback)iInterface0), object0);
            }

            public void onCallbackDied(@NotNull IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, @NotNull Object object0) {
                Intrinsics.checkNotNullParameter(iMultiInstanceInvalidationCallback0, "callback");
                Intrinsics.checkNotNullParameter(object0, "cookie");
                this.a.getClientNames$room_runtime_release().remove(((Integer)object0));
            }
        };
        this.d = new Stub() {
            @Override  // androidx.room.IMultiInstanceInvalidationService
            public void broadcastInvalidation(int v, @NotNull String[] arr_s) {
                int v4;
                Intrinsics.checkNotNullParameter(arr_s, "tables");
                RemoteCallbackList remoteCallbackList0 = this.a.getCallbackList$room_runtime_release();
                MultiInstanceInvalidationService multiInstanceInvalidationService0 = this.a;
                synchronized(remoteCallbackList0) {
                    String s = (String)multiInstanceInvalidationService0.getClientNames$room_runtime_release().get(v);
                    if(s == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int v2 = multiInstanceInvalidationService0.getCallbackList$room_runtime_release().beginBroadcast();
                    v4 = FIN.finallyOpen$NT();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        Object object0 = multiInstanceInvalidationService0.getCallbackList$room_runtime_release().getBroadcastCookie(v3);
                        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Int");
                        if(v != ((int)(((Integer)object0))) && Intrinsics.areEqual(s, ((String)multiInstanceInvalidationService0.getClientNames$room_runtime_release().get(((Integer)object0))))) {
                            try {
                                ((IMultiInstanceInvalidationCallback)multiInstanceInvalidationService0.getCallbackList$room_runtime_release().getBroadcastItem(v3)).onInvalidation(arr_s);
                            }
                            catch(RemoteException remoteException0) {
                                Log.w("ROOM", "Error invoking a remote callback", remoteException0);
                            }
                        }
                    }
                    FIN.finallyCodeBegin$NT(v4);
                    multiInstanceInvalidationService0.getCallbackList$room_runtime_release().finishBroadcast();
                }
                FIN.finallyCodeEnd$NT(v4);
            }

            @Override  // androidx.room.IMultiInstanceInvalidationService
            public int registerCallback(@NotNull IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, @Nullable String s) {
                Intrinsics.checkNotNullParameter(iMultiInstanceInvalidationCallback0, "callback");
                int v = 0;
                if(s == null) {
                    return 0;
                }
                RemoteCallbackList remoteCallbackList0 = this.a.getCallbackList$room_runtime_release();
                MultiInstanceInvalidationService multiInstanceInvalidationService0 = this.a;
                synchronized(remoteCallbackList0) {
                    multiInstanceInvalidationService0.setMaxClientId$room_runtime_release(multiInstanceInvalidationService0.getMaxClientId$room_runtime_release() + 1);
                    int v2 = multiInstanceInvalidationService0.getMaxClientId$room_runtime_release();
                    if(multiInstanceInvalidationService0.getCallbackList$room_runtime_release().register(iMultiInstanceInvalidationCallback0, v2)) {
                        multiInstanceInvalidationService0.getClientNames$room_runtime_release().put(v2, s);
                        v = v2;
                    }
                    else {
                        multiInstanceInvalidationService0.setMaxClientId$room_runtime_release(multiInstanceInvalidationService0.getMaxClientId$room_runtime_release() - 1);
                    }
                    return v;
                }
            }

            @Override  // androidx.room.IMultiInstanceInvalidationService
            public void unregisterCallback(@NotNull IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, int v) {
                Intrinsics.checkNotNullParameter(iMultiInstanceInvalidationCallback0, "callback");
                synchronized(this.a.getCallbackList$room_runtime_release()) {
                    this.a.getCallbackList$room_runtime_release().unregister(iMultiInstanceInvalidationCallback0);
                    String s = (String)this.a.getClientNames$room_runtime_release().remove(v);
                }
            }
        };
    }

    @NotNull
    public final RemoteCallbackList getCallbackList$room_runtime_release() {
        return this.c;
    }

    @NotNull
    public final Map getClientNames$room_runtime_release() {
        return this.b;
    }

    public final int getMaxClientId$room_runtime_release() {
        return this.a;
    }

    @Override  // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        return this.d;
    }

    public final void setMaxClientId$room_runtime_release(int v) {
        this.a = v;
    }
}

