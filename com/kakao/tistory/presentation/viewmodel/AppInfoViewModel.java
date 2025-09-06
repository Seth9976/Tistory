package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.usecase.GetAppInfoUseCase;
import com.kakao.tistory.presentation.common.utils.DeviceUtilsKt;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R(\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001A\u0004\b\u0013\u0010\u000E\"\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/AppInfoViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/usecase/GetAppInfoUseCase;", "getAppInfoUseCase", "<init>", "(Lcom/kakao/tistory/domain/usecase/GetAppInfoUseCase;)V", "", "getVersion", "()V", "Landroidx/lifecycle/MutableLiveData;", "", "h", "Landroidx/lifecycle/MutableLiveData;", "getNowVersion", "()Landroidx/lifecycle/MutableLiveData;", "setNowVersion", "(Landroidx/lifecycle/MutableLiveData;)V", "nowVersion", "i", "getLatestVersion", "setLatestVersion", "latestVersion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AppInfoViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final GetAppInfoUseCase g;
    public MutableLiveData h;
    public MutableLiveData i;

    @Inject
    public AppInfoViewModel(@NotNull GetAppInfoUseCase getAppInfoUseCase0) {
        Intrinsics.checkNotNullParameter(getAppInfoUseCase0, "getAppInfoUseCase");
        super();
        this.g = getAppInfoUseCase0;
        this.h = new MutableLiveData();
        this.i = new MutableLiveData();
    }

    @NotNull
    public final MutableLiveData getLatestVersion() {
        return this.i;
    }

    @NotNull
    public final MutableLiveData getNowVersion() {
        return this.h;
    }

    public final void getVersion() {
        this.h.postValue(DeviceUtilsKt.getAppVersion());
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(this, null), 3, null);
    }

    public final void setLatestVersion(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.i = mutableLiveData0;
    }

    public final void setNowVersion(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.h = mutableLiveData0;
    }
}

