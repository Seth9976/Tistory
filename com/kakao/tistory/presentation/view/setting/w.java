package com.kakao.tistory.presentation.view.setting;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final SnapshotStateList a;
    public final SnapshotStateList b;
    public final SettingDefaultBlogActivity c;
    public final State d;

    public w(SnapshotStateList snapshotStateList0, SnapshotStateList snapshotStateList1, SettingDefaultBlogActivity settingDefaultBlogActivity0, State state0) {
        this.a = snapshotStateList0;
        this.b = snapshotStateList1;
        this.c = settingDefaultBlogActivity0;
        this.d = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.SettingDefaultBlogActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
        if(!this.a.isEmpty() && !this.b.isEmpty()) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(-1503075033, true, new q(this.c)), 3, null);
        }
        SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.6 settingDefaultBlogActivity$Content$2$1$invoke$$inlined$items$default$60 = null;
        ((LazyListScope)object0).items(this.a.size(), (r.a == null ? null : new SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.2(r.a, this.a)), new SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.3(SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.1.INSTANCE, this.a), ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.4(this.a, this.c, this.d)));
        if(!this.b.isEmpty()) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(-1240625570, true, new t(this.c, this.a)), 3, null);
        }
        SnapshotStateList snapshotStateList0 = this.b;
        u u0 = u.a;
        SettingDefaultBlogActivity settingDefaultBlogActivity0 = this.c;
        State state0 = this.d;
        SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.5 settingDefaultBlogActivity$Content$2$1$invoke$$inlined$items$default$50 = SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.5.INSTANCE;
        int v = snapshotStateList0.size();
        if(u0 != null) {
            settingDefaultBlogActivity$Content$2$1$invoke$$inlined$items$default$60 = new SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.6(u0, snapshotStateList0);
        }
        ((LazyListScope)object0).items(v, settingDefaultBlogActivity$Content$2$1$invoke$$inlined$items$default$60, new SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.7(settingDefaultBlogActivity$Content$2$1$invoke$$inlined$items$default$50, snapshotStateList0), ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new SettingDefaultBlogActivity.Content.2.1.invoke..inlined.items.default.8(snapshotStateList0, settingDefaultBlogActivity0, state0)));
        return Unit.INSTANCE;
    }
}

