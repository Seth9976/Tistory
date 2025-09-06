package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import com.kakao.tistory.domain.entity.Account;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SavedStateViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "init", "()V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SavedStateViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final SavedStateHandle g;
    public final AccountRepository h;
    public final String i;
    public final Account j;

    @Inject
    public SavedStateViewModel(@NotNull SavedStateHandle savedStateHandle0, @NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.g = savedStateHandle0;
        this.h = accountRepository0;
        this.i = "BUNDLE_KEY_ACCOUNT";
        this.j = (Account)accountRepository0.getOldAccount().getValue();
    }

    public final void init() {
        Account account0 = (Account)this.h.getOldAccount().getValue();
        if(account0 == null) {
            account0 = (Account)this.g.get(this.i);
        }
        this.g.set(this.i, account0);
        if(!Intrinsics.areEqual(this.j, account0)) {
            this.h.getOldAccount().postValue(account0);
        }
    }
}

