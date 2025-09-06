package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel.DefaultImpls;
import com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000E\u001A\u00020\r2\b\u0010\b\u001A\u0004\u0018\u00010\u00072\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\u00072\b\u0010\f\u001A\u0004\u0018\u00010\u0007H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00120\u00168\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR(\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00120\u00168\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\u001B\u0010\u0018\u001A\u0004\b\u001C\u0010\u001A\"\u0004\b\u001D\u0010\u001ER\"\u0010\f\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00168\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b \u0010\u0018\u001A\u0004\b!\u0010\u001AR$\u0010(\u001A\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R&\u0010,\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070)0\u00168\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b*\u0010\u0018\u001A\u0004\b+\u0010\u001AR\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\f\n\u0004\b-\u0010\u0018\u001A\u0004\b.\u0010\u001AR\u001F\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00168\u0006\u00A2\u0006\f\n\u0004\b/\u0010\u0018\u001A\u0004\b0\u0010\u001AR\u001F\u0010\u000B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00168\u0006\u00A2\u0006\f\n\u0004\b1\u0010\u0018\u001A\u0004\b2\u0010\u001AR\"\u00105\u001A\u00020\u00128\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u0010\u0015R \u0010;\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070)088VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010:\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/ProtectedEntryCheckViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/IProtectedEntryDialogViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/EntryRepository;)V", "", "blogName", "", "entryId", "slogan", "password", "", "init", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "onClickOK", "()V", "", "enabled", "updateErrorEnabled", "(Z)V", "Landroidx/lifecycle/MutableLiveData;", "h", "Landroidx/lifecycle/MutableLiveData;", "isCreateMode", "()Landroidx/lifecycle/MutableLiveData;", "i", "getErrorEnabled", "setErrorEnabled", "(Landroidx/lifecycle/MutableLiveData;)V", "errorEnabled", "j", "getPassword", "k", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "Lcom/kakao/tistory/presentation/common/extension/Event;", "l", "get_okCallback", "_okCallback", "m", "getBlogName", "n", "getEntryId", "o", "getSlogan", "p", "Z", "isSlogan", "()Z", "setSlogan", "Landroidx/lifecycle/LiveData;", "getOkCallback", "()Landroidx/lifecycle/LiveData;", "okCallback", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ProtectedEntryCheckViewModel extends TistoryViewModel implements IProtectedEntryDialogViewModel {
    public static final int $stable = 8;
    public final EntryRepository g;
    public final MutableLiveData h;
    public MutableLiveData i;
    public final MutableLiveData j;
    public String k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public boolean p;

    @Inject
    public ProtectedEntryCheckViewModel(@NotNull EntryRepository entryRepository0) {
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        super();
        this.g = entryRepository0;
        this.h = new MutableLiveData();
        this.i = new MutableLiveData();
        this.j = new MutableLiveData();
        this.k = BaseKt.getAppContext().getString(string.label_dialog_protected_entry_title);
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.isCreateMode().setValue(Boolean.FALSE);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void clearPassword() {
        DefaultImpls.clearPassword(this);
    }

    @NotNull
    public final MutableLiveData getBlogName() {
        return this.m;
    }

    @NotNull
    public final MutableLiveData getEntryId() {
        return this.n;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData getErrorEnabled() {
        return this.i;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public LiveData getOkCallback() {
        return this.get_okCallback();
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData getPassword() {
        return this.j;
    }

    @NotNull
    public final MutableLiveData getSlogan() {
        return this.o;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @Nullable
    public String getTitle() {
        return this.k;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData get_okCallback() {
        return this.l;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void init(@Nullable String s, @Nullable Long long0, @Nullable String s1, @Nullable String s2) {
        this.m.setValue(s);
        this.n.setValue(long0);
        this.o.setValue(s1);
        this.p = 1 ^ (s1 == null || p.isBlank(s1) ? 1 : 0);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData isCreateMode() {
        return this.h;
    }

    public final boolean isSlogan() {
        return this.p;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void onClickOK() {
        Object object0 = this.m.getValue();
        if(((String)object0) == null) {
            return;
        }
        Long long0 = (Long)this.n.getValue();
        if(long0 == null) {
            return;
        }
        long v = long0.longValue();
        Object object1 = this.getPassword().getValue();
        if(((String)object1) != null) {
            if(this.p) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c3(this, ((String)object0), ((String)object1), null), 3, null);
                return;
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new d3(this, ((String)object0), v, ((String)object1), null), 3, null);
        }
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void setErrorEnabled(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.i = mutableLiveData0;
    }

    public final void setSlogan(boolean z) {
        this.p = z;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void setTitle(@Nullable String s) {
        this.k = s;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void updateErrorEnabled(boolean z) {
        this.getErrorEnabled().setValue(Boolean.valueOf(z));
    }
}

