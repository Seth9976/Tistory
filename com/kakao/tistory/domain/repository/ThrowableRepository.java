package com.kakao.tistory.domain.repository;

import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R$\u0010\u0002\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\bR\u0018\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/domain/repository/ThrowableRepository;", "", "createErrorModelThrowable", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Pair;", "Lcom/kakao/android/base/model/ErrorModel;", "", "getCreateErrorModelThrowable", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "inspectionThrowable", "getInspectionThrowable", "sessionThrowable", "getSessionThrowable", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ThrowableRepository {
    @NotNull
    MutableSharedFlow getCreateErrorModelThrowable();

    @NotNull
    MutableSharedFlow getInspectionThrowable();

    @NotNull
    MutableSharedFlow getSessionThrowable();
}

