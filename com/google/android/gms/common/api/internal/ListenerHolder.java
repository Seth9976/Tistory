package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

@KeepForSdk
public final class ListenerHolder {
    @KeepForSdk
    public static final class ListenerKey {
        public final Object a;
        public final String b;

        public ListenerKey(Object object0, String s) {
            this.a = object0;
            this.b = s;
        }

        @Override
        @KeepForSdk
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ListenerKey ? this.a == ((ListenerKey)object0).a && this.b.equals(((ListenerKey)object0).b) : false;
        }

        @Override
        @KeepForSdk
        public int hashCode() {
            return this.b.hashCode() + System.identityHashCode(this.a) * 0x1F;
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            return this.b + "@" + System.identityHashCode(this.a);
        }
    }

    @KeepForSdk
    public interface Notifier {
        @KeepForSdk
        void notifyListener(@NonNull Object arg1);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    public final Executor a;
    public volatile Object b;
    public volatile ListenerKey c;

    public ListenerHolder(Object object0, Looper looper0, String s) {
        this.a = new HandlerExecutor(looper0);
        this.b = Preconditions.checkNotNull(object0, "Listener must not be null");
        this.c = new ListenerKey(object0, Preconditions.checkNotEmpty(s));
    }

    public ListenerHolder(Object object0, Executor executor0, String s) {
        this.a = (Executor)Preconditions.checkNotNull(executor0, "Executor must not be null");
        this.b = Preconditions.checkNotNull(object0, "Listener must not be null");
        this.c = new ListenerKey(object0, Preconditions.checkNotEmpty(s));
    }

    @KeepForSdk
    public void clear() {
        this.b = null;
        this.c = null;
    }

    @Nullable
    @KeepForSdk
    public ListenerKey getListenerKey() {
        return this.c;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.b != null;
    }

    @KeepForSdk
    public void notifyListener(@NonNull Notifier listenerHolder$Notifier0) {
        Preconditions.checkNotNull(listenerHolder$Notifier0, "Notifier must not be null");
        zacb zacb0 = new zacb(this, listenerHolder$Notifier0);
        this.a.execute(zacb0);
    }
}

