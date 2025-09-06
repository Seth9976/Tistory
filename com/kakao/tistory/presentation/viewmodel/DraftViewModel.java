package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\b\u00A2\u0006\u0004\b\u0016\u0010\nJ\u0015\u0010\u0017\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001A\u00020\b\u00A2\u0006\u0004\b\u0018\u0010\nJ\u0015\u0010\u001A\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\u0012\u00A2\u0006\u0004\b\u001A\u0010\u0015J\r\u0010\u001B\u001A\u00020\b\u00A2\u0006\u0004\b\u001B\u0010\nR#\u0010\"\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001D0\u001C8\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u001D\u0010(\u001A\b\u0012\u0004\u0012\u00020\u000B0#8\u0006\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u001D\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120*0)8F\u00A2\u0006\u0006\u001A\u0004\b+\u0010,R\u001D\u0010/\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0*0)8F\u00A2\u0006\u0006\u001A\u0004\b.\u0010,R\u001D\u00101\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120*0)8F\u00A2\u0006\u0006\u001A\u0004\b0\u0010,R\u001D\u00103\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0*0)8F\u00A2\u0006\u0006\u001A\u0004\b2\u0010,R\u0017\u00105\u001A\b\u0012\u0004\u0012\u00020\u000F0)8F\u00A2\u0006\u0006\u001A\u0004\b4\u0010,R\u001D\u00107\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120*0)8F\u00A2\u0006\u0006\u001A\u0004\b6\u0010,\u00A8\u00068"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/DraftViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "getSavedDraftCount", "()V", "", "sequence", "deleteDraft", "(J)V", "", "onBackPressed", "()Z", "Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "draftItem", "onClickDelete", "(Lcom/kakao/tistory/domain/entity/entry/DraftItem;)V", "onClickShowDraftList", "onClickShowAccessibilityDraftList", "dismissDraftListDialog", "item", "onClickDraftItem", "requestRefresh", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "i", "Lkotlinx/coroutines/flow/Flow;", "getDraftList", "()Lkotlinx/coroutines/flow/Flow;", "draftList", "Landroidx/lifecycle/MutableLiveData;", "j", "Landroidx/lifecycle/MutableLiveData;", "getDraftCount", "()Landroidx/lifecycle/MutableLiveData;", "draftCount", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getRequestLoadDraft", "()Landroidx/lifecycle/LiveData;", "requestLoadDraft", "getDeleteComplete", "deleteComplete", "getShowDeleteDialog", "showDeleteDialog", "getRefreshDraftList", "refreshDraftList", "getShowDraftBottomSheet", "showDraftBottomSheet", "getShowDraftAccessibilityBottomSheet", "showDraftAccessibilityBottomSheet", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DraftViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final EntryRepository g;
    public final AccountRepository h;
    public final Flow i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final MutableLiveData p;

    @Inject
    public DraftViewModel(@NotNull EntryRepository entryRepository0, @NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.g = entryRepository0;
        this.h = accountRepository0;
        this.i = new Pager(new PagingConfig(20, 10, false, 20, 0, 0, 52, null), null, new a0(this), 2, null).getFlow();
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.p = new MutableLiveData();
        this.getSavedDraftCount();
    }

    public final void deleteDraft(long v) {
        Logger.INSTANCE.log("deleteDraft : " + v);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new z(this, v, null), 3, null);
    }

    public final void dismissDraftListDialog() {
        this.o.postValue(Boolean.FALSE);
    }

    @NotNull
    public final LiveData getDeleteComplete() {
        return this.l;
    }

    @NotNull
    public final MutableLiveData getDraftCount() {
        return this.j;
    }

    @NotNull
    public final Flow getDraftList() {
        return this.i;
    }

    @NotNull
    public final LiveData getRefreshDraftList() {
        return this.n;
    }

    @NotNull
    public final LiveData getRequestLoadDraft() {
        return this.k;
    }

    public final void getSavedDraftCount() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b0(this, null), 3, null);
    }

    @NotNull
    public final LiveData getShowDeleteDialog() {
        return this.m;
    }

    @NotNull
    public final LiveData getShowDraftAccessibilityBottomSheet() {
        return this.p;
    }

    @NotNull
    public final LiveData getShowDraftBottomSheet() {
        return this.o;
    }

    public final boolean onBackPressed() {
        if(Intrinsics.areEqual(this.o.getValue(), Boolean.TRUE)) {
            this.o.postValue(Boolean.FALSE);
            return true;
        }
        return false;
    }

    public final void onClickDelete(@NotNull DraftItem draftItem0) {
        Intrinsics.checkNotNullParameter(draftItem0, "draftItem");
        Event event0 = new Event(draftItem0);
        this.m.postValue(event0);
    }

    public final void onClickDraftItem(@NotNull DraftItem draftItem0) {
        Intrinsics.checkNotNullParameter(draftItem0, "item");
        Logger.INSTANCE.log("onClickDraftItem :" + draftItem0);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c0(this, draftItem0, null), 3, null);
    }

    public final void onClickShowAccessibilityDraftList(@NotNull DraftItem draftItem0) {
        Intrinsics.checkNotNullParameter(draftItem0, "draftItem");
        Event event0 = new Event(draftItem0);
        this.p.postValue(event0);
    }

    public final void onClickShowDraftList() {
        Event event0 = new Event(Unit.INSTANCE);
        this.n.postValue(event0);
        this.o.postValue(Boolean.TRUE);
    }

    public final void requestRefresh() {
        Event event0 = new Event(Unit.INSTANCE);
        this.n.postValue(event0);
        this.getSavedDraftCount();
    }
}

