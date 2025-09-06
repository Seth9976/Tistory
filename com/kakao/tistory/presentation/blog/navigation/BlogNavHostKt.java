package com.kakao.tistory.presentation.blog.navigation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import com.kakao.tistory.presentation.blog.BlogAppState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001F\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BlogNavHost", "", "appState", "Lcom/kakao/tistory/presentation/blog/BlogAppState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/kakao/tistory/presentation/blog/BlogAppState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogNavHost.kt\ncom/kakao/tistory/presentation/blog/navigation/BlogNavHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,42:1\n1223#2,6:43\n*S KotlinDebug\n*F\n+ 1 BlogNavHost.kt\ncom/kakao/tistory/presentation/blog/navigation/BlogNavHostKt\n*L\n22#1:43,6\n*E\n"})
public final class BlogNavHostKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogNavHost(@NotNull BlogAppState blogAppState0, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(blogAppState0, "appState");
        Composer composer1 = composer0.startRestartGroup(0x9AFCB049);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(blogAppState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9AFCB049, v2, -1, "com.kakao.tistory.presentation.blog.navigation.BlogNavHost (BlogNavHost.kt:16)");
            }
            NavHostController navHostController0 = blogAppState0.getNavController();
            composer1.startReplaceGroup(0x228EBD37);
            f f0 = composer1.rememberedValue();
            if((v2 & 14) == 4 || f0 == Composer.Companion.getEmpty()) {
                f0 = new f(blogAppState0);
                composer1.updateRememberedValue(f0);
            }
            composer1.endReplaceGroup();
            NavHostKt.NavHost(navHostController0, "BLOG_GRAPH", modifier2, null, null, null, null, null, null, null, f0, composer1, v2 << 3 & 0x380 | 56, 0, 0x3F8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(blogAppState0, modifier1, v, v1));
        }
    }
}

