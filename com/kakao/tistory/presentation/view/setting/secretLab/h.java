package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function4 {
    public final SecretLabActivity a;

    public h(SecretLabActivity secretLabActivity0) {
        this.a = secretLabActivity0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((AnimatedContentScope)object0), "$this$composable");
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object1), "it");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1497B217, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.Content.<anonymous>.<anonymous>.<anonymous> (SecretLabActivity.kt:100)");
        }
        SeverHostScreenKt.SeverHostScreen(SecretLabActivity.access$getSecretLabViewModel(this.a).getCurrentSeverHost(), ((List)SnapshotStateKt.collectAsState(SecretLabActivity.access$getSecretLabViewModel(this.a).getServerHostList(), null, ((Composer)object2), 8, 1).getValue()), new g(SecretLabActivity.access$getSecretLabViewModel(this.a)), ((Composer)object2), 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

