package com.kakao.tistory.presentation.view.setting;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.common.SettingItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function1 {
    public final SettingListActivity a;

    public q0(SettingListActivity settingListActivity0) {
        this.a = settingListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.SettingListActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
        SettingItem[] arr_settingItem = SettingItem.values();
        SettingListActivity.SettingListScreen.1.invoke..inlined.itemsIndexed.default.2 settingListActivity$SettingListScreen$1$invoke$$inlined$itemsIndexed$default$20 = new SettingListActivity.SettingListScreen.1.invoke..inlined.itemsIndexed.default.2(arr_settingItem);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(1600639390, true, new SettingListActivity.SettingListScreen.1.invoke..inlined.itemsIndexed.default.3(arr_settingItem, this.a));
        ((LazyListScope)object0).items(arr_settingItem.length, null, settingListActivity$SettingListScreen$1$invoke$$inlined$itemsIndexed$default$20, composableLambda0);
        return Unit.INSTANCE;
    }
}

