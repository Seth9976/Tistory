package com.kakao.kandinsky.filter.ui;

import aa.e;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.contract.MenuKt;
import ga.a;
import ga.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A3\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"EffectMenu", "", "effect", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "selectedMenu", "Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "onClickEffectMenu", "Lkotlin/Function1;", "(Lcom/kakao/kandinsky/core/kdphoto/Effect;Lcom/kakao/kandinsky/filter/contract/EffectMenu;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "filter_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffectMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EffectMenu.kt\ncom/kakao/kandinsky/filter/ui/EffectMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,59:1\n77#2:60\n1223#3,6:61\n*S KotlinDebug\n*F\n+ 1 EffectMenu.kt\ncom/kakao/kandinsky/filter/ui/EffectMenuKt\n*L\n24#1:60\n29#1:61,6\n*E\n"})
public final class EffectMenuKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EffectMenu(@NotNull Effect effect0, @Nullable EffectMenu effectMenu0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(effect0, "effect");
        Intrinsics.checkNotNullParameter(function10, "onClickEffectMenu");
        Composer composer1 = composer0.startRestartGroup(1025395266);
        int v1 = (v & 14) == 0 ? (composer1.changed(effect0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(effectMenu0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1025395266, v1, -1, "com.kakao.kandinsky.filter.ui.EffectMenu (EffectMenu.kt:22)");
            }
            Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int v2 = MenuKt.getEffectMenuList().size();
            int v3 = CollectionsKt___CollectionsKt.indexOf(MenuKt.getEffectMenuList(), effectMenu0);
            composer1.startReplaceGroup(0x3B6BBC8C);
            e e0 = composer1.rememberedValue();
            if((v1 & 0x380) == 0x100 || e0 == Composer.Companion.getEmpty()) {
                e0 = new e(function10, 3);
                composer1.updateRememberedValue(e0);
            }
            composer1.endReplaceGroup();
            ItemSliderKt.ItemSlider(null, v2, v3, e0, new a(context0, 0), ComposableLambdaKt.rememberComposableLambda(0xB82611B1, true, new b(effect0), composer1, 54), null, composer1, 0x30000, 65);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(v, 5, effect0, effectMenu0, function10));
        }
    }
}

