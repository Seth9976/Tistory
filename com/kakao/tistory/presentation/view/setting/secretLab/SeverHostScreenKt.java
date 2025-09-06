package com.kakao.tistory.presentation.view.setting.secretLab;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.tistory.domain.entity.ServerHost;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A9\u0010\b\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "currentServerHost", "", "Lcom/kakao/tistory/domain/entity/ServerHost;", "serverHostList", "Lkotlin/Function1;", "", "onClick", "SeverHostScreen", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSeverHostScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeverHostScreen.kt\ncom/kakao/tistory/presentation/view/setting/secretLab/SeverHostScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,85:1\n148#2:86\n148#2:87\n148#2:124\n158#2:125\n98#3:88\n95#3,6:89\n101#3:123\n105#3:129\n78#4,6:95\n85#4,4:110\n89#4,2:120\n93#4:128\n368#5,9:101\n377#5:122\n378#5,2:126\n4032#6,6:114\n*S KotlinDebug\n*F\n+ 1 SeverHostScreen.kt\ncom/kakao/tistory/presentation/view/setting/secretLab/SeverHostScreenKt\n*L\n68#1:86\n70#1:87\n79#1:124\n80#1:125\n64#1:88\n64#1:89,6\n64#1:123\n64#1:129\n64#1:95,6\n64#1:110,4\n64#1:120,2\n64#1:128\n64#1:101,9\n64#1:122\n64#1:126,2\n64#1:114,6\n*E\n"})
public final class SeverHostScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SeverHostScreen(@NotNull String s, @NotNull List list0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "currentServerHost");
        Intrinsics.checkNotNullParameter(list0, "serverHostList");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(0xF32C3480);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF32C3480, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SeverHostScreen (SeverHostScreen.kt:30)");
        }
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), lazyListState0, null, false, null, null, null, false, new a0(list0, s, function10), composer1, 6, 0xFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(s, list0, function10, v));
        }
    }

    public static final void access$ServerHostItem(String s, ServerHost serverHost0, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2053247966);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2053247966, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.ServerHostItem (SeverHostScreen.kt:60)");
        }
        Intrinsics.areEqual(serverHost0.getUrl(), s);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, false, null, null, new y(function10, serverHost0), 7, null), 0.0f, 1, null), 50.0f), 0L, null, 2, null), 15.0f, 0.0f, 2, null);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        TextKt.Text--4IGK_g(serverHost0.getLabel(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, 0, 0, 0x1FFFE);
        SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        BoxKt.Box(BackgroundKt.background-bw27NRU(BorderKt.border(SizeKt.size-3ABfNKs(modifier$Companion0, 20.0f), BorderStrokeKt.BorderStroke-cXLIe8U(0.1f, 0L), RoundedCornerShapeKt.getCircleShape()), 0L, RoundedCornerShapeKt.getCircleShape()), composer1, 0);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(s, serverHost0, function10, v));
        }
    }
}

