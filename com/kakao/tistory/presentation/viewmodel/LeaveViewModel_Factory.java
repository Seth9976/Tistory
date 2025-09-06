package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.usecase.LeaveUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class LeaveViewModel_Factory implements Factory {
    public final Provider a;

    public LeaveViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static LeaveViewModel_Factory create(Provider provider0) {
        return new LeaveViewModel_Factory(provider0);
    }

    public LeaveViewModel get() {
        return LeaveViewModel_Factory.newInstance(((LeaveUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static LeaveViewModel newInstance(LeaveUseCase leaveUseCase0) {
        return new LeaveViewModel(leaveUseCase0);
    }
}

