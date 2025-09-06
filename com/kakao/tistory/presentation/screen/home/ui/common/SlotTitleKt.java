package com.kakao.tistory.presentation.screen.home.ui.common;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A-\u0010\b\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "SlotTitlePreview", "(Landroidx/compose/runtime/Composer;I)V", "", "text", "emoji", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "SlotTitle", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotTitle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTitle.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotTitleKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,74:1\n85#2:75\n81#2,7:76\n88#2:111\n92#2:115\n78#3,6:83\n85#3,4:98\n89#3,2:108\n93#3:114\n78#3,6:121\n85#3,4:136\n89#3,2:146\n93#3:153\n368#4,9:89\n377#4:110\n378#4,2:112\n368#4,9:127\n377#4:148\n378#4,2:151\n4032#5,6:102\n4032#5,6:140\n148#6:116\n148#6:117\n148#6:150\n148#6:155\n98#7,3:118\n101#7:149\n105#7:154\n*S KotlinDebug\n*F\n+ 1 SlotTitle.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotTitleKt\n*L\n21#1:75\n21#1:76,7\n21#1:111\n21#1:115\n21#1:83,6\n21#1:98,4\n21#1:108,2\n21#1:114\n43#1:121,6\n43#1:136,4\n43#1:146,2\n43#1:153\n21#1:89,9\n21#1:110\n21#1:112,2\n43#1:127,9\n43#1:148\n43#1:151,2\n21#1:102,6\n43#1:140,6\n41#1:116\n46#1:117\n50#1:150\n65#1:155\n43#1:118,3\n43#1:149\n43#1:154\n*E\n"})
public final class SlotTitleKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SlotTitle(@NotNull String s, @Nullable String s1, @Nullable PaddingValues paddingValues0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(s, "text");
        Composer composer1 = composer0.startRestartGroup(0xCDF485C3);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(paddingValues0) ? 0x80 : 0x100);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    s1 = null;
                }
                if((v1 & 4) != 0) {
                    paddingValues0 = PaddingKt.PaddingValues-a9UjIt4(20.0f, 22.0f, 20.0f, 20.0f);
                    v2 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCDF485C3, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotTitle (SlotTitle.kt:41)");
            }
            Modifier modifier0 = PaddingKt.padding(Modifier.Companion, paddingValues0);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), Alignment.Companion.getCenterVertically(), composer1, 54);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            SlotTitleKt.a(s, composer1, v2 & 14);
            composer1.startReplaceGroup(1408906378);
            if(s1 != null) {
                SlotTitleKt.a(s1, 24.0f, composer1, 0x30, 0);
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
            scopeUpdateScope0.updateScope(new n1(s, s1, paddingValues0, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true, widthDp = 375)
    public static final void SlotTitlePreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-593619048);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-593619048, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotTitlePreview (SlotTitle.kt:19)");
            }
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            SlotTitleKt.SlotTitle("인기 응원글", "http://t1.daumcdn.net/brunch/service/user/2xr/image/6-d1CBljJhw2mnAT69vMQfDoNyM.png", null, composer1, 54, 4);
            CompositionLocalKt.CompositionLocalProvider(SlotContainerKt.getLocalLoadingState().provides(Boolean.TRUE), ComposableSingletons.SlotTitleKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, ProvidedValue.$stable | 0x30);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p1(v));
        }
    }

    public static final void a(String s, float f, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xB2CFB405);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                f = 24.0f;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB2CFB405, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotTitleEmoji (SlotTitle.kt:64)");
            }
            CommonImageKt.CommonImage(s, null, SizeKt.size-3ABfNKs(Modifier.Companion, f), CommonImageKt.getTransparentPainter(), null, ContentScale.Companion.getFit(), composer1, v2 & 14 | 0x31030, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o1(s, f, v, v1));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(129167084);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(129167084, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotTitleText (SlotTitle.kt:55)");
            }
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize17Weight700(), composer1, v1 & 14 | 0x180, 0x180000, 0xFFFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q1(s, v));
        }
    }
}

