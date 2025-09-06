package com.kakao.tistory.presentation.widget.common;

import a;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.model.common.EmojiError;
import com.kakao.tistory.data.model.common.EmojiErrorModel.Emoji;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A5\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001A5\u0010\t\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0007\u001AI\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001A\u00020\n2\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u001D\u0010\u0010\u001A\u00020\u00032\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015²\u0006\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u00128\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0014\u001A\u00020\n8\n@\nX\u008A\u008E\u0002"}, d2 = {"Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "Lkotlin/Function0;", "", "onClose", "onRefresh", "CommonExceptionViewWithCloseAppBar", "(Lcom/kakao/android/base/model/ErrorModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onBack", "CommonExceptionViewWithBackAppBar", "", "hasTopPadding", "goCSWeb", "isOnline", "CommonExceptionView", "(Lcom/kakao/android/base/model/ErrorModel;ZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RefreshButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "emoji", "onlinePrevState", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonExceptionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonExceptionView.kt\ncom/kakao/tistory/presentation/widget/common/CommonExceptionViewKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,190:1\n85#2:191\n81#2,7:192\n88#2:227\n92#2:231\n85#2:232\n81#2,7:233\n88#2:268\n92#2:272\n85#2:294\n82#2,6:295\n88#2:329\n92#2:334\n78#3,6:199\n85#3,4:214\n89#3,2:224\n93#3:230\n78#3,6:240\n85#3,4:255\n89#3,2:265\n93#3:271\n78#3,6:301\n85#3,4:316\n89#3,2:326\n93#3:333\n368#4,9:205\n377#4:226\n378#4,2:228\n368#4,9:246\n377#4:267\n378#4,2:269\n368#4,9:307\n377#4:328\n378#4,2:331\n4032#5,6:218\n4032#5,6:259\n4032#5,6:320\n1223#6,6:273\n1223#6,6:279\n1223#6,6:285\n1223#6,6:338\n148#7:291\n148#7:292\n148#7:293\n148#7:336\n148#7:337\n148#7:344\n148#7:345\n148#7:346\n158#7:347\n148#7:348\n148#7:349\n168#7:350\n1#8:330\n77#9:335\n81#10:351\n107#10,2:352\n81#10:354\n107#10,2:355\n*S KotlinDebug\n*F\n+ 1 CommonExceptionView.kt\ncom/kakao/tistory/presentation/widget/common/CommonExceptionViewKt\n*L\n37#1:191\n37#1:192,7\n37#1:227\n37#1:231\n54#1:232\n54#1:233,7\n54#1:268\n54#1:272\n84#1:294\n84#1:295,6\n84#1:329\n84#1:334\n37#1:199,6\n37#1:214,4\n37#1:224,2\n37#1:230\n54#1:240,6\n54#1:255,4\n54#1:265,2\n54#1:271\n84#1:301,6\n84#1:316,4\n84#1:326,2\n84#1:333\n37#1:205,9\n37#1:226\n37#1:228,2\n54#1:246,9\n54#1:267\n54#1:269,2\n84#1:307,9\n84#1:328\n84#1:331,2\n37#1:218,6\n54#1:259,6\n84#1:320,6\n73#1:273,6\n75#1:279,6\n76#1:285,6\n145#1:338,6\n89#1:291\n90#1:292\n91#1:293\n127#1:336\n138#1:337\n154#1:344\n155#1:345\n156#1:346\n158#1:347\n161#1:348\n162#1:349\n184#1:350\n116#1:335\n73#1:351\n73#1:352,2\n75#1:354\n75#1:355,2\n*E\n"})
public final class CommonExceptionViewKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommonExceptionView(@NotNull ErrorModel errorModel0, boolean z, @Nullable Function0 function00, boolean z1, @Nullable Function0 function01, @Nullable Composer composer0, int v, int v1) {
        Unit unit0;
        int v2;
        Function0 function02;
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        Composer composer1 = composer0.startRestartGroup(-1201468008);
        if((v1 & 4) == 0) {
            function02 = function00;
            v2 = v;
        }
        else {
            composer1.startReplaceGroup(0x6B7EAF59);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6B7EAF59, 0, -1, "com.kakao.tistory.presentation.widget.common.defaultGoCsWeb (CommonExceptionView.kt:114)");
            }
            function02 = new a0(((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext())), StringResources_androidKt.stringResource(string.web_link_faq, composer1, 0));
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            v2 = v & -897;
        }
        boolean z2 = (v1 & 8) == 0 ? z1 : true;
        Function0 function03 = (v1 & 16) == 0 ? function01 : o.a;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1201468008, v2, -1, "com.kakao.tistory.presentation.widget.common.CommonExceptionView (CommonExceptionView.kt:71)");
        }
        composer1.startReplaceGroup(0x2B54EF81);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            EmojiError emojiError0 = errorModel0 instanceof EmojiError ? ((EmojiError)errorModel0) : null;
            mutableState0 = SnapshotStateKt.mutableStateOf$default((emojiError0 == null ? null : emojiError0.getEmoji()), null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        MutableState mutableState1 = b.a(composer1, 0x2B54FAE7);
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        composer1.endReplaceGroup();
        Boolean boolean0 = Boolean.valueOf(z2);
        composer1.startReplaceGroup(726992000);
        int v3 = ((v & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(z2)) && (v & 0xC00) != 0x800 ? 0 : 1;
        int v4 = ((0xE000 & v ^ 0x6000) <= 0x4000 || !composer1.changed(function03)) && (v & 0x6000) != 0x4000 ? 0 : 1;
        p p0 = composer1.rememberedValue();
        if((v4 | v3) != 0 || p0 == composer$Companion0.getEmpty()) {
            p0 = new p(z2, function03, mutableState1, null);
            composer1.updateRememberedValue(p0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(boolean0, p0, composer1, v2 >> 9 & 14 | 0x40);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), 0xFFFFFFFF00000000L, null, 2, null);
        composer1.startReplaceGroup(727000436);
        float f = z ? PrimitiveResources_androidKt.dimensionResource(dimen.common_toolbar_height, composer1, 0) : 0.0f;
        composer1.endReplaceGroup();
        Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier0, 20.0f, f, 20.0f, 0.0f, 8, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function04 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function04);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
            d.a(v5, composer1, v5, function20);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        CommonExceptionViewKt.a(errorModel0.getTitle(), composer1, 0);
        String s = errorModel0.getMessage();
        s = s != null && !kotlin.text.p.isBlank(s) ? errorModel0.getMessage() : null;
        composer1.startReplaceGroup(-1157057350);
        if(s == null) {
            unit0 = null;
        }
        else {
            CommonExceptionViewKt.a(s, function02, composer1, v2 >> 3 & 0x70);
            unit0 = Unit.INSTANCE;
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0xBB08B02E);
        if(unit0 == null) {
            mutableState0.setValue(Emoji.Screaming);
            CommonExceptionViewKt.a(StringResources_androidKt.stringResource(string.label_exception_common_message, composer1, 0), function02, composer1, v2 >> 3 & 0x70);
            composer1.startReplaceGroup(0xBB08D22B);
            if(z2 && Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "EXCEPTION_UNKNOWN_STATUS")) {
                CommonExceptionViewKt.RefreshButton(function03, composer1, v2 >> 12 & 14);
            }
            composer1.endReplaceGroup();
        }
        composer1.endReplaceGroup();
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        Emoji emojiErrorModel$Emoji0 = (Emoji)mutableState0.getValue();
        composer1.startReplaceGroup(0xBB08EC56);
        if(emojiErrorModel$Emoji0 != null) {
            CommonExceptionViewKt.a(columnScopeInstance0, emojiErrorModel$Emoji0, composer1, 6);
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(errorModel0, z, function02, z2, function03, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommonExceptionViewWithBackAppBar(@NotNull ErrorModel errorModel0, @NotNull Function0 function00, @Nullable Function0 function01, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        Intrinsics.checkNotNullParameter(function00, "onBack");
        Composer composer1 = composer0.startRestartGroup(0x39C88581);
        if((v1 & 4) != 0) {
            function01 = r.a;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x39C88581, v, -1, "com.kakao.tistory.presentation.widget.common.CommonExceptionViewWithBackAppBar (CommonExceptionView.kt:52)");
        }
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function02 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function02);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
        TistoryTopAppBarKt.TistoryOnlyBackAppBar(function00, composer1, v >> 3 & 14, 0);
        CommonExceptionViewKt.CommonExceptionView(errorModel0, false, null, false, function01, composer1, v << 6 & 0xE000 | 56, 12);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(errorModel0, function00, function01, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommonExceptionViewWithCloseAppBar(@NotNull ErrorModel errorModel0, @NotNull Function0 function00, @Nullable Function0 function01, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        Intrinsics.checkNotNullParameter(function00, "onClose");
        Composer composer1 = composer0.startRestartGroup(0x99C90572);
        if((v1 & 4) != 0) {
            function01 = t.a;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x99C90572, v, -1, "com.kakao.tistory.presentation.widget.common.CommonExceptionViewWithCloseAppBar (CommonExceptionView.kt:35)");
        }
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function02 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function02);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
        TistoryTopAppBarKt.TistoryOnlyCloseAppBar(function00, composer1, v >> 3 & 14, 0);
        CommonExceptionViewKt.CommonExceptionView(errorModel0, false, null, false, function01, composer1, v << 6 & 0xE000 | 56, 12);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(errorModel0, function00, function01, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RefreshButton(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onRefresh");
        Composer composer1 = composer0.startRestartGroup(560645225);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(560645225, v1, -1, "com.kakao.tistory.presentation.widget.common.RefreshButton (CommonExceptionView.kt:150)");
            }
            Modifier modifier0 = SizeKt.size-VpY3zN4(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 27.0f, 0.0f, 0.0f, 13, null), 80.0f, 32.0f);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(18.0f);
            BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(0.5f, ColorResources_androidKt.colorResource(color.gray8, composer1, 0));
            ButtonKt.Button(function00, modifier0, false, null, ButtonDefaults.INSTANCE.elevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, ButtonDefaults.$stable << 15 | 54, 28), roundedCornerShape0, borderStroke0, null, PaddingKt.PaddingValues-YgX7TsA$default(16.0f, 0.0f, 2, null), ComposableSingletons.CommonExceptionViewKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 & 14 | 0x36000030, 140);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(function00, v));
        }
    }

    public static final void a(ColumnScope columnScope0, Emoji emojiErrorModel$Emoji0, Composer composer0, int v) {
        Horizontal alignment$Horizontal0;
        Composer composer1 = composer0.startRestartGroup(-2109836147);
        int v1 = (v & 14) == 0 ? (composer1.changed(columnScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(emojiErrorModel$Emoji0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2109836147, v1, -1, "com.kakao.tistory.presentation.widget.common.EmojiText (CommonExceptionView.kt:172)");
            }
            switch(emojiErrorModel$Emoji0.getGravity()) {
                case 17: {
                    alignment$Horizontal0 = Alignment.Companion.getCenterHorizontally();
                    break;
                }
                case 0x800003: {
                    alignment$Horizontal0 = Alignment.Companion.getStart();
                    break;
                }
                case 0x800005: {
                    alignment$Horizontal0 = Alignment.Companion.getEnd();
                    break;
                }
                default: {
                    alignment$Horizontal0 = Alignment.Companion.getEnd();
                }
            }
            TextKt.Text--4IGK_g(emojiErrorModel$Emoji0.getEmoticon(), columnScope0.align(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, emojiErrorModel$Emoji0.getBottomMargin(), 7, null), alignment$Horizontal0), ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0x141F00000L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, 0xC00, 0, 0x1FFF0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(columnScope0, emojiErrorModel$Emoji0, v));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x7E1A2455);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7E1A2455, v1, -1, "com.kakao.tistory.presentation.widget.common.ErrorTitle (CommonExceptionView.kt:124)");
            }
            TextKt.Text--4IGK_g(s, PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 12.0f, 40.0f, 0.0f, 9, null), 0L, 0L, null, null, null, 0L, null, null, 0x142100000L, 0, false, 0, 0, null, TypeKt.getPageTitle(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, v1 & 14 | 0x30, 6, 0xFBFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(s, v));
        }
    }

    public static final void a(String s, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x8DA99C7D);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8DA99C7D, v1, -1, "com.kakao.tistory.presentation.widget.common.ErrorDescription (CommonExceptionView.kt:135)");
            }
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 24.0f, 0.0f, 0.0f, 13, null);
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141A00000L, null, null, null, 0, 0, null, 0xFDFFFF, null);
            boolean z = false;
            String s1 = StringResources_androidKt.stringResource(string.label_exception_common_message_linked_text, composer1, 0);
            long v2 = ColorResources_androidKt.colorResource(color.gray5, composer1, 0);
            composer1.startReplaceGroup(-971702860);
            if((v1 & 0x70) == 0x20) {
                z = true;
            }
            w w0 = composer1.rememberedValue();
            if(z || w0 == Composer.Companion.getEmpty()) {
                w0 = new w(function00);
                composer1.updateRememberedValue(w0);
            }
            composer1.endReplaceGroup();
            LinkableTextKt.LinkableText-WxCAl_A(modifier0, textStyle0, false, 0, 0, s, s1, v2, null, w0, composer1, v1 << 15 & 0x70000 | 6, 284);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(s, function00, v));
        }
    }

    public static final boolean access$CommonExceptionView$lambda$6(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$CommonExceptionView$lambda$7(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }
}

