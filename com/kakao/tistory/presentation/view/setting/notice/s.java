package com.kakao.tistory.presentation.view.setting.notice;

import android.util.LongSparseArray;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListIntent.Load;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class s implements FlowCollector {
    public final SettingNoticeListViewModel a;

    public s(SettingNoticeListViewModel settingNoticeListViewModel0) {
        this.a = settingNoticeListViewModel0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        Intrinsics.checkNotNull(((LongSparseArray)object0));
        if(((LongSparseArray)object0).size() != 0) {
            this.a.sendIntent(Load.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}

