package com.kakao.android.base.extension;

import androidx.lifecycle.Observer;
import com.kakao.android.base.viewmodel.Event;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\n\u001A\u00020\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/android/base/extension/EventObserver;", "T", "Landroidx/lifecycle/Observer;", "Lcom/kakao/android/base/viewmodel/Event;", "Lkotlin/Function1;", "", "onEventUnHandledContent", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "event", "onChanged", "(Lcom/kakao/android/base/viewmodel/Event;)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\ncom/kakao/android/base/extension/EventObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class EventObserver implements Observer {
    public final Function1 a;

    public EventObserver(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onEventUnHandledContent");
        super();
        this.a = function10;
    }

    public void onChanged(@NotNull Event event0) {
        Intrinsics.checkNotNullParameter(event0, "event");
        boolean z = event0.getContentIfNotHandled();
        if((z ? Boolean.valueOf(z) : null) != null) {
            this.a.invoke(event0.getContent());
        }
    }

    @Override  // androidx.lifecycle.Observer
    public void onChanged(Object object0) {
        this.onChanged(((Event)object0));
    }
}

