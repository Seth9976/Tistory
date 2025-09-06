package com.kakao.tistory.presentation.view.setting.notice;

import com.kakao.tistory.domain.repository.EntryRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class w extends SuspendLambda implements Function2 {
    public Object a;
    public final EntryRepository b;
    public final SettingNoticeListViewModel c;

    public w(EntryRepository entryRepository0, SettingNoticeListViewModel settingNoticeListViewModel0, Continuation continuation0) {
        this.b = entryRepository0;
        this.c = settingNoticeListViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new w(this.b, this.c, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.a;
        BuildersKt.launch$default(coroutineScope0, null, null, new t(this.b, this.c, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new v(this.b, this.c, null), 3, null);
        return Unit.INSTANCE;
    }
}

