package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR \u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000B\u0010\u0007\u001A\u0004\b\f\u0010\tR,\u0010\u0012\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000F0\u000E0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001A\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/repository/ThrowableRepositoryImpl;", "Lcom/kakao/tistory/domain/repository/ThrowableRepository;", "<init>", "()V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kakao/android/base/model/ErrorModel;", "a", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getSessionThrowable", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "sessionThrowable", "b", "getInspectionThrowable", "inspectionThrowable", "Lkotlin/Pair;", "", "c", "getCreateErrorModelThrowable", "createErrorModelThrowable", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ThrowableRepositoryImpl implements ThrowableRepository {
    public final MutableSharedFlow a;
    public final MutableSharedFlow b;
    public final MutableSharedFlow c;

    @Inject
    public ThrowableRepositoryImpl() {
        this.a = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.b = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.c = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override  // com.kakao.tistory.domain.repository.ThrowableRepository
    @NotNull
    public MutableSharedFlow getCreateErrorModelThrowable() {
        return this.c;
    }

    @Override  // com.kakao.tistory.domain.repository.ThrowableRepository
    @NotNull
    public MutableSharedFlow getInspectionThrowable() {
        return this.b;
    }

    @Override  // com.kakao.tistory.domain.repository.ThrowableRepository
    @NotNull
    public MutableSharedFlow getSessionThrowable() {
        return this.a;
    }
}

