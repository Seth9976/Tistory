package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.presentation.view.editor.EditorTagTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B!\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000E\u001A\u00020\r2\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0010\u001A\u00020\r2\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000FJ\u0013\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\u000B¢\u0006\u0004\b\u0018\u0010\u0019R\u001F\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u001A8\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER#\u0010%\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R#\u0010(\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n0 8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001A\u0004\b\'\u0010$R\u001D\u0010.\u001A\b\u0012\u0004\u0012\u00020\u00140)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EditorTagViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "", "list", "", "initSelectedTag", "(Ljava/util/List;)V", "setExclusiveTagList", "getCompleteTagList", "()Ljava/util/List;", "tag", "", "isRecentTagClick", "addTag", "(Ljava/lang/String;Z)Z", "removeTag", "(Ljava/lang/String;)V", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getCurrentBlogName", "()Landroidx/lifecycle/LiveData;", "currentBlogName", "Landroidx/lifecycle/MutableLiveData;", "j", "Landroidx/lifecycle/MutableLiveData;", "getRecentTagList", "()Landroidx/lifecycle/MutableLiveData;", "recentTagList", "l", "getInputTagList", "inputTagList", "Lkotlinx/coroutines/flow/StateFlow;", "m", "Lkotlinx/coroutines/flow/StateFlow;", "getEnableEditField", "()Lkotlinx/coroutines/flow/StateFlow;", "enableEditField", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditorTagViewModel extends TistoryViewModel {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EditorTagViewModel$Companion;", "", "", "BUNDLE_KEY_TAG_LIST", "Ljava/lang/String;", "", "TAG_LIMIT_COUNT", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int TAG_LIMIT_COUNT = 10;
    public final SavedStateHandle g;
    public final EntryRepository h;
    public final LiveData i;
    public final MutableLiveData j;
    public final MutableStateFlow k;
    public final MutableLiveData l;
    public final StateFlow m;

    static {
        EditorTagViewModel.Companion = new Companion(null);
        EditorTagViewModel.$stable = 8;
    }

    @Inject
    public EditorTagViewModel(@NotNull SavedStateHandle savedStateHandle0, @NotNull EntryRepository entryRepository0, @NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "savedStateHandle");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.g = savedStateHandle0;
        this.h = entryRepository0;
        this.i = accountRepository0.getOldCurrentBlogName();
        this.j = new MutableLiveData(CollectionsKt__CollectionsKt.emptyList());
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.k = mutableStateFlow0;
        MutableLiveData mutableLiveData0 = new MutableLiveData(CollectionsKt__CollectionsKt.emptyList());
        this.l = mutableLiveData0;
        this.m = FlowKt.stateIn(FlowKt.combine(FlowLiveDataConversions.asFlow(mutableLiveData0), mutableStateFlow0, new e0(null)), ViewModelKt.getViewModelScope(this), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Boolean.FALSE);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f0(this, null), 3, null);
    }

    public final boolean addTag(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "tag");
        if(p.isBlank(s)) {
            return false;
        }
        List list0 = (List)this.l.getValue();
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if(((Boolean)this.m.getValue()).booleanValue() && !list0.contains(s)) {
            if(z) {
                EditorTagTiara.INSTANCE.trackClickRecentTag();
            }
            else {
                EditorTagTiara.INSTANCE.trackAddTag(s);
            }
            List list1 = CollectionsKt___CollectionsKt.plus(list0, s);
            this.g.set("BUNDLE_KEY_TAG_LIST", list1);
            this.l.postValue(list1);
            return true;
        }
        return false;
    }

    @NotNull
    public final List getCompleteTagList() {
        List list0 = (List)this.l.getValue();
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @NotNull
    public final LiveData getCurrentBlogName() {
        return this.i;
    }

    @NotNull
    public final StateFlow getEnableEditField() {
        return this.m;
    }

    @NotNull
    public final MutableLiveData getInputTagList() {
        return this.l;
    }

    @NotNull
    public final MutableLiveData getRecentTagList() {
        return this.j;
    }

    public final void initSelectedTag(@Nullable List list0) {
        MutableLiveData mutableLiveData0 = this.l;
        List list1 = (List)this.g.get("BUNDLE_KEY_TAG_LIST");
        if(list1 != null) {
            list0 = list1;
        }
        mutableLiveData0.postValue(list0);
    }

    public final void removeTag(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "tag");
        EditorTagTiara.INSTANCE.trackRemoveTag(s);
        List list0 = (List)this.l.getValue();
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = CollectionsKt___CollectionsKt.minus(list0, s);
        this.g.set("BUNDLE_KEY_TAG_LIST", list1);
        this.l.postValue(list1);
    }

    public final void setExclusiveTagList(@Nullable List list0) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g0(this, list0, null), 3, null);
    }
}

