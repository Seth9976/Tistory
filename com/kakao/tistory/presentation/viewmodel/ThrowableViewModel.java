package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.viewmodel.Event;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\r\u0010\fR\u001D\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000F0\u000E8F¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u001D\u0010\r\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000F0\u000E8F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/ThrowableViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/ThrowableRepository;", "throwableRepository", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/ThrowableRepository;Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "", "showSessionDialog", "(Lcom/kakao/android/base/model/ErrorModel;)V", "showInspectionDialog", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/android/base/viewmodel/Event;", "getShowSessionErrorDialog", "()Landroidx/lifecycle/LiveData;", "showSessionErrorDialog", "getShowInspectionDialog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ThrowableViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final ThrowableRepository g;
    public final AccountRepository h;
    public final MutableLiveData i;
    public final MutableLiveData j;

    @Inject
    public ThrowableViewModel(@NotNull ThrowableRepository throwableRepository0, @NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(throwableRepository0, "throwableRepository");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.g = throwableRepository0;
        this.h = accountRepository0;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new y6(this, null), 3, null);
        this.i = new MutableLiveData();
        this.j = new MutableLiveData();
    }

    @NotNull
    public final LiveData getShowInspectionDialog() {
        return this.j;
    }

    @NotNull
    public final LiveData getShowSessionErrorDialog() {
        return this.i;
    }

    public final void showInspectionDialog(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        this.isShowProgress().setValue(Boolean.FALSE);
        Event event0 = new Event(errorModel0);
        this.j.setValue(event0);
    }

    public final void showSessionDialog(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        this.isShowProgress().setValue(Boolean.FALSE);
        this.h.clearAppSession();
        Event event0 = new Event(errorModel0);
        this.i.setValue(event0);
    }
}

