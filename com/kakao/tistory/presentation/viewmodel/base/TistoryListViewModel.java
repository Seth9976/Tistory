package com.kakao.tistory.presentation.viewmodel.base;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR(\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u000B\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/base/TistoryListViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "<init>", "()V", "", "isLoading", "()Z", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "isShowFooter", "()Landroidx/lifecycle/MutableLiveData;", "setShowFooter", "(Landroidx/lifecycle/MutableLiveData;)V", "h", "isShowRefresh", "setShowRefresh", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class TistoryListViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public MutableLiveData g;
    public MutableLiveData h;

    public TistoryListViewModel() {
        this.g = new MutableLiveData();
        this.h = new MutableLiveData();
    }

    // 去混淆评级： 低(30)
    public final boolean isLoading() {
        return Intrinsics.areEqual(this.g.getValue(), Boolean.TRUE) || Intrinsics.areEqual(this.h.getValue(), Boolean.TRUE) || Intrinsics.areEqual(this.isShowProgress().getValue(), Boolean.TRUE);
    }

    @NotNull
    public final MutableLiveData isShowFooter() {
        return this.g;
    }

    @NotNull
    public final MutableLiveData isShowRefresh() {
        return this.h;
    }

    public final void setShowFooter(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.g = mutableLiveData0;
    }

    public final void setShowRefresh(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.h = mutableLiveData0;
    }
}

