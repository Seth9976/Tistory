package com.kakao.tistory.presentation.view.setting;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final SnapshotStateList a;
    public final SnapshotStateList b;
    public final SettingDefaultBlogActivity c;
    public final State d;

    public x(SnapshotStateList snapshotStateList0, SnapshotStateList snapshotStateList1, SettingDefaultBlogActivity settingDefaultBlogActivity0, State state0) {
        this.a = snapshotStateList0;
        this.b = snapshotStateList1;
        this.c = settingDefaultBlogActivity0;
        this.d = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-934947208, v, -1, "com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity.Content.<anonymous> (SettingDefaultBlogActivity.kt:84)");
        }
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new w(this.a, this.b, this.c, this.d), ((Composer)object0), 0, 0xFF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

