package com.kakao.tistory.presentation.viewmodel.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0019\u001A\u00020\u001AH\u0016J5\u0010\u001B\u001A\u00020\u001A2\b\u0010\u001C\u001A\u0004\u0018\u00010\u00052\b\u0010\u001D\u001A\u0004\u0018\u00010\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00052\b\u0010\u0012\u001A\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010 J\b\u0010!\u001A\u00020\u001AH&J\u0010\u0010\"\u001A\u00020\u001A2\u0006\u0010#\u001A\u00020\tH&R\u001E\u0010\u0002\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007R\u001E\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u0007\"\u0004\b\u000B\u0010\fR\u0018\u0010\r\u001A\b\u0012\u0004\u0012\u00020\t0\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u0007R\u001E\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000FX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0007R\u001A\u0010\u0014\u001A\u0004\u0018\u00010\u0005X¦\u000E¢\u0006\f\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/base/IProtectedEntryDialogViewModel;", "", "_okCallback", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "", "get_okCallback", "()Landroidx/lifecycle/MutableLiveData;", "errorEnabled", "", "getErrorEnabled", "setErrorEnabled", "(Landroidx/lifecycle/MutableLiveData;)V", "isCreateMode", "okCallback", "Landroidx/lifecycle/LiveData;", "getOkCallback", "()Landroidx/lifecycle/LiveData;", "password", "getPassword", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "clearPassword", "", "init", "blogName", "entryId", "", "slogan", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "onClickOK", "updateErrorEnabled", "enabled", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface IProtectedEntryDialogViewModel {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void clearPassword(@NotNull IProtectedEntryDialogViewModel iProtectedEntryDialogViewModel0) {
            iProtectedEntryDialogViewModel0.getPassword().postValue("");
        }
    }

    void clearPassword();

    @NotNull
    MutableLiveData getErrorEnabled();

    @NotNull
    LiveData getOkCallback();

    @NotNull
    MutableLiveData getPassword();

    @Nullable
    String getTitle();

    @NotNull
    MutableLiveData get_okCallback();

    void init(@Nullable String arg1, @Nullable Long arg2, @Nullable String arg3, @Nullable String arg4);

    @NotNull
    MutableLiveData isCreateMode();

    void onClickOK();

    void setErrorEnabled(@NotNull MutableLiveData arg1);

    void setTitle(@Nullable String arg1);

    void updateErrorEnabled(boolean arg1);
}

