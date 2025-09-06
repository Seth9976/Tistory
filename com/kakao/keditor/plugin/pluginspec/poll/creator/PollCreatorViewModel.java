package com.kakao.keditor.plugin.pluginspec.poll.creator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.kakao.keditor.plugin.itemspec.poll.PollItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001A\u00020\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\nR\u001C\u0010\u0005\u001A\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\rR\u0019\u0010\u000E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\f¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_isEditMode", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_pollItem", "Lcom/kakao/keditor/plugin/itemspec/poll/PollItem;", "isEditMode", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "pollItem", "getPollItem", "setItem", "", "item", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PollCreatorViewModel extends ViewModel {
    @NotNull
    private final MutableLiveData _isEditMode;
    @NotNull
    private final MutableLiveData _pollItem;
    @NotNull
    private final LiveData isEditMode;
    @NotNull
    private final LiveData pollItem;

    public PollCreatorViewModel(@NotNull SavedStateHandle savedStateHandle0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        super();
        MutableLiveData mutableLiveData0 = savedStateHandle0.getLiveData("data", null);
        this._pollItem = mutableLiveData0;
        this.pollItem = mutableLiveData0;
        MutableLiveData mutableLiveData1 = new MutableLiveData(Boolean.valueOf(mutableLiveData0.getValue() != null));
        this._isEditMode = mutableLiveData1;
        this.isEditMode = mutableLiveData1;
    }

    @NotNull
    public final LiveData getPollItem() {
        return this.pollItem;
    }

    @NotNull
    public final LiveData isEditMode() {
        return this.isEditMode;
    }

    public final void setItem(@Nullable PollItem pollItem0) {
        MutableLiveData mutableLiveData0 = this._pollItem;
        if(pollItem0 == null) {
            pollItem0 = new PollItem();
        }
        mutableLiveData0.setValue(pollItem0);
    }
}

