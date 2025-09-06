package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001A\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\u000F\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\u0010\r\u001A\u0004\u0018\u00010\t2\b\u0010\u000E\u001A\u0004\u0018\u00010\tH\u0096\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001A\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bJ\r\u0010\u0018\u001A\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bR \u0010\u001D\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001A0\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\"\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00130\u00198\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b\u001E\u0010\u001C\"\u0004\b\u001F\u0010 R\u001A\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00130\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\"\u0010\u001CR \u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001A0#8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b$\u0010%R\u001C\u0010\u000E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\'\u0010\u001CR\u001E\u0010,\u001A\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001D\u0010.\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001A0#8F¢\u0006\u0006\u001A\u0004\b-\u0010%¨\u0006/"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/ProtectedEntryDialogViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/IProtectedEntryDialogViewModel;", "protectedEntryImpl", "<init>", "(Lcom/kakao/tistory/presentation/viewmodel/base/IProtectedEntryDialogViewModel;)V", "", "clearPassword", "()V", "", "blogName", "", "entryId", "slogan", "password", "init", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "onClickOK", "onClickCancel", "", "enabled", "updateErrorEnabled", "(Z)V", "onTextChanged", "afterTextChanged", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "get_okCallback", "()Landroidx/lifecycle/MutableLiveData;", "_okCallback", "getErrorEnabled", "setErrorEnabled", "(Landroidx/lifecycle/MutableLiveData;)V", "errorEnabled", "isCreateMode", "Landroidx/lifecycle/LiveData;", "getOkCallback", "()Landroidx/lifecycle/LiveData;", "okCallback", "getPassword", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "getCancelCallback", "cancelCallback", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ProtectedEntryDialogViewModel extends TistoryViewModel implements IProtectedEntryDialogViewModel {
    public static final int $stable = 8;
    public final IProtectedEntryDialogViewModel g;
    public final MutableLiveData h;

    public ProtectedEntryDialogViewModel(@NotNull IProtectedEntryDialogViewModel iProtectedEntryDialogViewModel0) {
        Intrinsics.checkNotNullParameter(iProtectedEntryDialogViewModel0, "protectedEntryImpl");
        super();
        this.g = iProtectedEntryDialogViewModel0;
        this.h = new MutableLiveData();
    }

    public final void afterTextChanged() {
        CharSequence charSequence0 = (CharSequence)this.getPassword().getValue();
        if(charSequence0 == null || charSequence0.length() == 0) {
            this.updateErrorEnabled(false);
        }
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void clearPassword() {
        this.g.clearPassword();
    }

    @NotNull
    public final LiveData getCancelCallback() {
        return this.h;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData getErrorEnabled() {
        return this.g.getErrorEnabled();
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public LiveData getOkCallback() {
        return this.g.getOkCallback();
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData getPassword() {
        return this.g.getPassword();
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @Nullable
    public String getTitle() {
        return this.g.getTitle();
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData get_okCallback() {
        return this.g.get_okCallback();
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void init(@Nullable String s, @Nullable Long long0, @Nullable String s1, @Nullable String s2) {
        this.g.init(s, long0, s1, s2);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    @NotNull
    public MutableLiveData isCreateMode() {
        return this.g.isCreateMode();
    }

    public final void onClickCancel() {
        Event event0 = new Event(Unit.INSTANCE);
        this.h.setValue(event0);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void onClickOK() {
        this.g.onClickOK();
    }

    public final void onTextChanged() {
        this.updateErrorEnabled(false);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void setErrorEnabled(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.g.setErrorEnabled(mutableLiveData0);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void setTitle(@Nullable String s) {
        this.g.setTitle(s);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.IProtectedEntryDialogViewModel
    public void updateErrorEnabled(boolean z) {
        this.getErrorEnabled().setValue(Boolean.valueOf(z));
    }
}

