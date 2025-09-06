package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.design.ui.list.m;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001A1\u0010\f\u001A\u00020\u00042\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\u0014\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "state", "Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "commentViewModel", "", "CommentBottomSheet", "(Landroidx/compose/material/ModalBottomSheetState;Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/kakao/tistory/presentation/view/comment/CommentMenuItem;", "menuItems", "Lkotlin/Function1;", "onClick", "CommentMenuList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/common/extension/Event;", "Lcom/kakao/tistory/presentation/view/comment/CommentShowMenuEvent;", "event", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentBottomSheet.kt\ncom/kakao/tistory/presentation/view/comment/CommentBottomSheetKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,122:1\n488#2:123\n487#2,4:124\n491#2,2:131\n495#2:137\n1223#3,3:128\n1226#3,3:134\n487#4:133\n148#5:138\n148#5:174\n71#6:139\n69#6,5:140\n74#6:173\n78#6:178\n78#7,6:145\n85#7,4:160\n89#7,2:170\n93#7:177\n368#8,9:151\n377#8:172\n378#8,2:175\n4032#9,6:164\n81#10:179\n*S KotlinDebug\n*F\n+ 1 CommentBottomSheet.kt\ncom/kakao/tistory/presentation/view/comment/CommentBottomSheetKt\n*L\n39#1:123\n39#1:124,4\n39#1:131,2\n39#1:137\n39#1:128,3\n39#1:134,3\n39#1:133\n107#1:138\n113#1:174\n105#1:139\n105#1:140,5\n105#1:173\n105#1:178\n105#1:145,6\n105#1:160,4\n105#1:170,2\n105#1:177\n105#1:151,9\n105#1:172\n105#1:175,2\n105#1:164,6\n41#1:179\n*E\n"})
public final class CommentBottomSheetKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommentBottomSheet(@NotNull ModalBottomSheetState modalBottomSheetState0, @NotNull CommentListViewModel commentListViewModel0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modalBottomSheetState0, "state");
        Intrinsics.checkNotNullParameter(commentListViewModel0, "commentViewModel");
        Composer composer1 = composer0.startRestartGroup(0x7AF4D6CD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7AF4D6CD, v, -1, "com.kakao.tistory.presentation.view.comment.CommentBottomSheet (CommentBottomSheet.kt:37)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        State state0 = LiveDataAdapterKt.observeAsState(commentListViewModel0.getShowBottomSheetMenu(), composer1, 8);
        Event event0 = (Event)state0.getValue();
        if(event0 != null && !event0.getHasBeenHandled()) {
            Event event1 = (Event)state0.getValue();
            if(event1 != null) {
                Object object0 = event1.getContent();
                if(((CommentShowMenuEvent)object0) != null) {
                    CommentBottomSheetKt.CommentMenuList(commentListViewModel0.getAccessibleMenu(((CommentShowMenuEvent)object0).getCommentItem()), new f(((CommentShowMenuEvent)object0), coroutineScope0, modalBottomSheetState0, commentListViewModel0, state0), composer1, 8);
                    EffectsKt.LaunchedEffect(((Event)state0.getValue()), new h(coroutineScope0, modalBottomSheetState0, null), composer1, 72);
                    if(ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                    if(scopeUpdateScope0 != null) {
                        scopeUpdateScope0.updateScope(new i(modalBottomSheetState0, commentListViewModel0, v));
                    }
                    return;
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
            if(scopeUpdateScope1 != null) {
                scopeUpdateScope1.updateScope(new j(modalBottomSheetState0, commentListViewModel0, v));
            }
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope2 = composer1.endRestartGroup();
        if(scopeUpdateScope2 != null) {
            scopeUpdateScope2.updateScope(new k(modalBottomSheetState0, commentListViewModel0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommentMenuList(@NotNull List list0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "menuItems");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x41C25904);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x41C25904, v, -1, "com.kakao.tistory.presentation.view.comment.CommentMenuList (CommentBottomSheet.kt:90)");
        }
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new n(list0, function10), composer1, 0, 0xFF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(list0, function10, v));
        }
    }

    public static final Event access$CommentBottomSheet$lambda$0(State state0) {
        return (Event)state0.getValue();
    }

    public static final void access$CommentMenuItem(String s, boolean z, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2015493053);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2015493053, v1, -1, "com.kakao.tistory.presentation.view.comment.CommentMenuItem (CommentBottomSheet.kt:103)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 56.0f), 0.0f, 1, null), false, null, null, function00, 7, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenterStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 20.0f, 0.0f, 0.0f, 0.0f, 14, null);
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH3();
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            TextKt.Text--4IGK_g(s, modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, v1 & 14 | 0x30, 0, 0xFFFC);
            composer1.startReplaceGroup(-697060611);
            if(z) {
                DividerKt.Divider-oMI9zvI(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getBottomCenter()), ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.0f, 0.0f, composer1, 0, 12);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(s, z, function00, v));
        }
    }
}

