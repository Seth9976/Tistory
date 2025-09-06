package com.kakao.tistory.presentation.main.navigation;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.compose.NavHostKt;
import com.kakao.tistory.presentation.main.MainAppState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A3\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"MainNavHost", "", "appState", "Lcom/kakao/tistory/presentation/main/MainAppState;", "myBlogName", "", "blogImageUrl", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/kakao/tistory/presentation/main/MainAppState;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMainNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainNavHost.kt\ncom/kakao/tistory/presentation/main/navigation/MainNavHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,62:1\n77#2:63\n*S KotlinDebug\n*F\n+ 1 MainNavHost.kt\ncom/kakao/tistory/presentation/main/navigation/MainNavHostKt\n*L\n27#1:63\n*E\n"})
public final class MainNavHostKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MainNavHost(@NotNull MainAppState mainAppState0, @Nullable String s, @Nullable String s1, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(mainAppState0, "appState");
        Composer composer1 = composer0.startRestartGroup(0xC548231B);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(mainAppState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC548231B, v2, -1, "com.kakao.tistory.presentation.main.navigation.MainNavHost (MainNavHost.kt:25)");
            }
            NavHostKt.NavHost(mainAppState0.getNavController(), "home", modifier1, null, null, null, null, null, null, null, new o(s1, mainAppState0, s, ((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), composer1, v2 >> 3 & 0x380 | 56, 0, 0x3F8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p(mainAppState0, s, s1, modifier1, v, v1));
        }
    }
}

