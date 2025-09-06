package com.kakao.tistory.presentation.screen.blog.navigation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.screen.blog.BlogViewModel;
import com.kakao.tistory.presentation.screen.blog.setting.BlogSettingScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function4 {
    public final NavController a;
    public final String b;
    public final NavActions c;

    public b(NavController navController0, String s, NavActions navActions0) {
        this.a = navController0;
        this.b = s;
        this.c = navActions0;
        super(4);
    }

    public final void a(AnimatedContentScope animatedContentScope0, NavBackStackEntry navBackStackEntry0, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(animatedContentScope0, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB2260F32, v, -1, "com.kakao.tistory.presentation.screen.blog.navigation.blogScreen.<anonymous>.<anonymous> (BlogNavigation.kt:135)");
        }
        NavController navController0 = this.a;
        String s = this.b;
        composer0.startReplaceGroup(0x32E4A492);
        composer0.startReplaceGroup(104769866);
        boolean z = composer0.changed(navBackStackEntry0);
        NavBackStackEntry navBackStackEntry1 = composer0.rememberedValue();
        if(z || navBackStackEntry1 == Composer.Companion.getEmpty()) {
            navBackStackEntry1 = navController0.getBackStackEntry("BLOG_GRAPH");
            composer0.updateRememberedValue(navBackStackEntry1);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceableGroup(0x70B323C8);
        Factory viewModelProvider$Factory0 = HiltViewModelKt.createHiltViewModelFactory(navBackStackEntry1, composer0, 8);
        composer0.startReplaceableGroup(0x671A9C9B);
        CreationExtras creationExtras0 = navBackStackEntry1 == null ? Empty.INSTANCE : navBackStackEntry1.getDefaultViewModelCreationExtras();
        ViewModel viewModel0 = ViewModelKt.viewModel(BlogViewModel.class, navBackStackEntry1, "BlogViewModel-" + s, viewModelProvider$Factory0, creationExtras0, composer0, 0x9048, 0);
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        Logger.INSTANCE.log("getBlogViewModel blogName " + s + " " + viewModel0);
        composer0.endReplaceGroup();
        BlogSettingScreenKt.BlogSettingScreen(this.c, ((BlogViewModel)viewModel0), null, composer0, 0x40, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        this.a(((AnimatedContentScope)object0), ((NavBackStackEntry)object1), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }
}

