package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

@KeepForSdk
public class ListenerHolders {
    public final Set a;

    public ListenerHolders() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    @NonNull
    @KeepForSdk
    public static ListenerHolder createListenerHolder(@NonNull Object object0, @NonNull Looper looper0, @NonNull String s) {
        Preconditions.checkNotNull(object0, "Listener must not be null");
        Preconditions.checkNotNull(looper0, "Looper must not be null");
        Preconditions.checkNotNull(s, "Listener type must not be null");
        return new ListenerHolder(object0, looper0, s);
    }

    @NonNull
    @KeepForSdk
    public static ListenerHolder createListenerHolder(@NonNull Object object0, @NonNull Executor executor0, @NonNull String s) {
        Preconditions.checkNotNull(object0, "Listener must not be null");
        Preconditions.checkNotNull(executor0, "Executor must not be null");
        Preconditions.checkNotNull(s, "Listener type must not be null");
        return new ListenerHolder(object0, executor0, s);
    }

    @NonNull
    @KeepForSdk
    public static ListenerKey createListenerKey(@NonNull Object object0, @NonNull String s) {
        Preconditions.checkNotNull(object0, "Listener must not be null");
        Preconditions.checkNotNull(s, "Listener type must not be null");
        Preconditions.checkNotEmpty(s, "Listener type must not be empty");
        return new ListenerKey(object0, s);
    }

    @NonNull
    public final ListenerHolder zaa(@NonNull Object object0, @NonNull Looper looper0, @NonNull String s) {
        ListenerHolder listenerHolder0 = ListenerHolders.createListenerHolder(object0, looper0, "NO_TYPE");
        this.a.add(listenerHolder0);
        return listenerHolder0;
    }

    public final void zab() {
        Set set0 = this.a;
        for(Object object0: set0) {
            ((ListenerHolder)object0).clear();
        }
        set0.clear();
    }
}

