package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel.DefaultImpls;
import com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001A\u00020\u000B2\b\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u00072\b\u0010\t\u001A\u0004\u0018\u00010\u00052\b\u0010\n\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0012\u0010\u0004R \u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R&\u0010\u001B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00180\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001A\u0004\b\u001A\u0010\u0017R\"\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u0015\u001A\u0004\b\u001D\u0010\u0017R$\u0010$\u001A\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010)\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00138\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001A\u0004\b&\u0010\u0017\"\u0004\b\'\u0010(R \u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00180*8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/ProtectedEntryCreateViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/IProtectedEntryDialogViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "<init>", "()V", "", "blogName", "", "entryId", "slogan", "password", "", "init", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "", "enabled", "updateErrorEnabled", "(Z)V", "onClickOK", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "isCreateMode", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "h", "get_okCallback", "_okCallback", "i", "getPassword", "j", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "k", "getErrorEnabled", "setErrorEnabled", "(Landroidx/lifecycle/MutableLiveData;)V", "errorEnabled", "Landroidx/lifecycle/LiveData;", "getOkCallback", "()Landroidx/lifecycle/LiveData;", "okCallback", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ProtectedEntryCreateViewModel extends TistoryViewModel implements IProtectedEntryDialogViewModel {
    public static final int $stable = 8;
    public final MutableLiveData g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public String j;
    public MutableLiveData k;

    public ProtectedEntryCreateViewModel() {
        this.g = new MutableLiveData();
        this.h = new MutableLiveData();
        this.i = new MutableLiveData();
        this.j = BaseKt.getAppContext().getString(string.label_editor_setting_dialog_protected_password_title);
        this.k = new MutableLiveData();
        this.isCreateMode().setValue(Boolean.TRUE);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void clearPassword() {
        DefaultImpls.clearPassword(this);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData getErrorEnabled() {
        return this.k;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public LiveData getOkCallback() {
        return this.get_okCallback();
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData getPassword() {
        return this.i;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @Nullable
    public String getTitle() {
        return this.j;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData get_okCallback() {
        return this.h;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void init(@Nullable String s, @Nullable Long long0, @Nullable String s1, @Nullable String s2) {
        Logger.INSTANCE.log("init " + s2);
        this.getPassword().setValue(s2);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData isCreateMode() {
        return this.g;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void onClickOK() {
        String s = (String)this.getPassword().getValue();
        if(s != null) {
            this.get_okCallback().setValue(new Event(s));
        }
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void setErrorEnabled(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.k = mutableLiveData0;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void setTitle(@Nullable String s) {
        this.j = s;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void updateErrorEnabled(boolean z) {
        this.getErrorEnabled().setValue(Boolean.valueOf(z));
    }
}

