package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003R#\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u001D\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t8F¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u000ER\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00120\t8F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u000E¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/BlogSwitchViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "<init>", "()V", "", "showBlogSwitchBottomSheet", "dismissBlogSwitchBottomSheet", "onClickSetting", "onClickBlogSwitch", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "i", "Landroidx/lifecycle/LiveData;", "getGoToMain", "()Landroidx/lifecycle/LiveData;", "goToMain", "getGoToSettingListActivity", "goToSettingListActivity", "", "getShowBlogSwitchBottomSheet", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSwitchViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final MutableLiveData g;
    public final MutableLiveData h;
    public final LiveData i;
    public final MutableLiveData j;

    @Inject
    public BlogSwitchViewModel() {
        this.g = new MutableLiveData();
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.h = mutableLiveData0;
        this.i = LiveDataExtensionKt.asLiveData(mutableLiveData0);
        this.j = new MutableLiveData();
    }

    public final void dismissBlogSwitchBottomSheet() {
        this.j.setValue(Boolean.FALSE);
    }

    @NotNull
    public final LiveData getGoToMain() {
        return this.i;
    }

    @NotNull
    public final LiveData getGoToSettingListActivity() {
        return this.g;
    }

    @NotNull
    public final LiveData getShowBlogSwitchBottomSheet() {
        return this.j;
    }

    public final void onClickBlogSwitch() {
        Event event0 = new Event(Unit.INSTANCE);
        this.h.setValue(event0);
    }

    public final void onClickSetting() {
        Event event0 = new Event(Unit.INSTANCE);
        this.g.setValue(event0);
    }

    public final void showBlogSwitchBottomSheet() {
        this.j.setValue(Boolean.TRUE);
    }
}

