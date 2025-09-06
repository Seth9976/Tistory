package com.kakao.tistory.presentation.screen.blog;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BlogConsumeEvent", "", "viewModel", "Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;", "navActions", "Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;", "(Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogConsumeEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogConsumeEvent.kt\ncom/kakao/tistory/presentation/screen/blog/BlogConsumeEventKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,26:1\n77#2:27\n*S KotlinDebug\n*F\n+ 1 BlogConsumeEvent.kt\ncom/kakao/tistory/presentation/screen/blog/BlogConsumeEventKt\n*L\n16#1:27\n*E\n"})
public final class BlogConsumeEventKt {
    @Composable
    public static final void BlogConsumeEvent(@NotNull BlogViewModel blogViewModel0, @NotNull NavActions navActions0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blogViewModel0, "viewModel");
        Intrinsics.checkNotNullParameter(navActions0, "navActions");
        Composer composer1 = composer0.startRestartGroup(0xDD09FA5E);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDD09FA5E, v, -1, "com.kakao.tistory.presentation.screen.blog.BlogConsumeEvent (BlogConsumeEvent.kt:14)");
        }
        EffectsKt.LaunchedEffect(blogViewModel0, new b(blogViewModel0, navActions0, ((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(blogViewModel0, navActions0, v));
        }
    }
}

