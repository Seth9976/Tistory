package com.kakao.tistory.presentation.main.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.BadgeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.TistoryWindowInsetsKt;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001Am\u0010\u000E\u001A\u00020\u00042\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\t\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001A\u00020\fH\u0007¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"", "Lcom/kakao/tistory/presentation/main/navigation/MainDestination;", "destinations", "Lkotlin/Function1;", "", "onNavigateToDestination", "Lkotlin/Function0;", "onNavigateToEditor", "onNavigateToBlogSwitchBottomSheet", "currentDestination", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "", "notificationCount", "MainBottomBar", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/main/navigation/MainDestination;Lcom/kakao/tistory/domain/entity/Blog;JLandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMainBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainBottomBar.kt\ncom/kakao/tistory/presentation/main/ui/MainBottomBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,194:1\n148#2:195\n1223#3,6:196\n*S KotlinDebug\n*F\n+ 1 MainBottomBar.kt\ncom/kakao/tistory/presentation/main/ui/MainBottomBarKt\n*L\n49#1:195\n129#1:196,6\n*E\n"})
public final class MainBottomBarKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MainBottomBar(@NotNull List list0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable MainDestination mainDestination0, @Nullable Blog blog0, long v, @Nullable Composer composer0, int v1, int v2) {
        Intrinsics.checkNotNullParameter(list0, "destinations");
        Intrinsics.checkNotNullParameter(function10, "onNavigateToDestination");
        Intrinsics.checkNotNullParameter(function00, "onNavigateToEditor");
        Intrinsics.checkNotNullParameter(function01, "onNavigateToBlogSwitchBottomSheet");
        Composer composer1 = composer0.startRestartGroup(-1534740043);
        Blog blog1 = (v2 & 0x20) == 0 ? blog0 : null;
        long v3 = (v2 & 0x40) == 0 ? v : 0L;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1534740043, v1, -1, "com.kakao.tistory.presentation.main.ui.MainBottomBar (MainBottomBar.kt:47)");
        }
        long v4 = DpKt.DpSize-YgX7TsA(57.0f, 52.0f);
        BottomBarKt.BottomBar-6xbWgXg(0L, 0L, TistoryWindowInsetsKt.bottomInsetsHeight-JKjFIXU$default(Modifier.Companion, DpSize.getHeight-D9Ej5fM(v4), 0L, null, false, 14, null), ComposableLambdaKt.rememberComposableLambda(0xE4C05A43, true, new x(v4, list0, mainDestination0, function10, function00, blog1, function01, v3), composer1, 54), composer1, 0xC36, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(list0, function10, function00, function01, mainDestination0, blog1, v3, v1, v2));
        }
    }

    public static final void access$BottomBarItemBadge(BoxScope boxScope0, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xC283F7CD);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(boxScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC283F7CD, v2, -1, "com.kakao.tistory.presentation.main.ui.BottomBarItemBadge (MainBottomBar.kt:168)");
            }
            if(v > 0L) {
                BadgeKt.Badge-eopBjH0(LayoutModifierKt.layout(boxScope0.align(Modifier.Companion, Alignment.Companion.getCenter()), m.a), 0L, 0L, ComposableLambdaKt.rememberComposableLambda(0x2379E785, true, new n(v), composer1, 54), composer1, 0xDB0, 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(boxScope0, v, v1));
        }
    }

    public static final void access$BottomBarMyItem(Blog blog0, boolean z, Function0 function00, String s, Function0 function01, String s1, Modifier modifier0, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xBF1CC61E);
        Modifier modifier1 = (v1 & 0x40) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBF1CC61E, v, -1, "com.kakao.tistory.presentation.main.ui.BottomBarMyItem (MainBottomBar.kt:127)");
        }
        composer1.startReplaceGroup(1750050550);
        boolean z1 = composer1.changed((blog0 == null ? null : blog0.getLogoImageUrl()));
        Function2 function20 = composer1.rememberedValue();
        if(z1 || function20 == Composer.Companion.getEmpty()) {
            function20 = MovableContentKt.movableContentOf(ComposableLambdaKt.composableLambdaInstance(0x4D55F9C0, true, new u(blog0, s1)));
            composer1.updateRememberedValue(function20);
        }
        composer1.endReplaceGroup();
        BottomBarKt.BottomBarItem(z, function00, modifier1, s, function01, StringResources_androidKt.stringResource(string.content_desc_main_long_click_blog, composer1, 0), ComposableLambdaKt.rememberComposableLambda(0x2F8108C8, true, new p(function20), composer1, 54), ComposableLambdaKt.rememberComposableLambda(1051374951, true, new q(function20), composer1, 54), null, composer1, v >> 3 & 0x70 | (v >> 3 & 14 | 0xD80000) | v >> 12 & 0x380 | v & 0x1C00 | 0xE000 & v, 0x100);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(blog0, z, function00, s, function01, s1, modifier1, v, v1));
        }
    }
}

