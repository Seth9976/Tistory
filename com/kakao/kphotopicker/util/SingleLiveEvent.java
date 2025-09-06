package com.kakao.kphotopicker.util;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import gc.b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\'\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u000E\u0010\b\u001A\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\r\u001A\u00020\t2\b\u0010\f\u001A\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\tH\u0007¢\u0006\u0004\b\u000F\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/kakao/kphotopicker/util/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Observer;", "observer", "", "observe", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "t", "setValue", "(Ljava/lang/Object;)V", "call", "Companion", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SingleLiveEvent extends MutableLiveData {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kphotopicker/util/SingleLiveEvent$Companion;", "", "", "TAG", "Ljava/lang/String;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final AtomicBoolean o;

    static {
        SingleLiveEvent.Companion = new Companion(null);
    }

    public SingleLiveEvent() {
        this.o = new AtomicBoolean(false);
    }

    @MainThread
    public final void call() {
        this.setValue(null);
    }

    @Override  // androidx.lifecycle.LiveData
    @MainThread
    public void observe(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Observer observer0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        Intrinsics.checkNotNullParameter(observer0, "observer");
        if(this.hasActiveObservers()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(lifecycleOwner0, new b(7, this, observer0));
    }

    @Override  // androidx.lifecycle.MutableLiveData
    @MainThread
    public void setValue(@Nullable Object object0) {
        this.o.set(true);
        super.setValue(object0);
    }
}

