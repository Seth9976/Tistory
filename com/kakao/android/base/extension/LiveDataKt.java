package com.kakao.android.base.extension;

import androidx.compose.material3.ti;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.viewmodel.Event;
import d9.a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u001E\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001A4\u0010\u0004\u001A\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00072\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\tH\u0007\u001A:\u0010\n\u001A\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000B0\u00012\u0006\u0010\u0006\u001A\u00020\u00072\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\tH\u0007\u001A4\u0010\f\u001A\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00072\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\tH\u0007\u001A+\u0010\r\u001A\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000B0\u00032\u0006\u0010\u000E\u001A\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u000F¨\u0006\u0010"}, d2 = {"asLiveData", "Landroidx/lifecycle/LiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "observe", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "func", "Lkotlin/Function1;", "observeEvent", "Lcom/kakao/android/base/viewmodel/Event;", "observeValue", "postEvent", "value", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class LiveDataKt {
    @Deprecated(message = "don\'t use")
    @NotNull
    public static final LiveData asLiveData(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<this>");
        return mutableLiveData0;
    }

    @Deprecated(message = "use sdk observe")
    public static final void observe(@NotNull LiveData liveData0, @NotNull LifecycleOwner lifecycleOwner0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(function10, "func");
        liveData0.observe(lifecycleOwner0, new a(function10, 0));
    }

    @Deprecated(message = "don\'t use")
    public static final void observeEvent(@NotNull LiveData liveData0, @NotNull LifecycleOwner lifecycleOwner0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(function10, "func");
        liveData0.observe(lifecycleOwner0, new EventObserver(new ti(function10, 3)));
    }

    @Deprecated(message = "use sdk observe")
    public static final void observeValue(@NotNull LiveData liveData0, @NotNull LifecycleOwner lifecycleOwner0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(function10, "func");
        liveData0.observe(lifecycleOwner0, new a(function10, 1));
    }

    @Deprecated(message = "don\'t use")
    public static final void postEvent(@NotNull MutableLiveData mutableLiveData0, Object object0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<this>");
        mutableLiveData0.postValue(new Event(object0));
    }
}

