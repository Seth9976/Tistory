package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.EmptyModel;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y2 extends Lambda implements Function0 {
    public final MigrationViewModel a;
    public final Success b;

    public y2(MigrationViewModel migrationViewModel0, Success result$Success0) {
        this.a = migrationViewModel0;
        this.b = result$Success0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.m.postValue(new Event(new EmptyModel(((EmptyModel)this.b.getData()).getTitle(), ((EmptyModel)this.b.getData()).getMessage())));
        return Unit.INSTANCE;
    }
}

