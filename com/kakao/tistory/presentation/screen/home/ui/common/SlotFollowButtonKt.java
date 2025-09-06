package com.kakao.tistory.presentation.screen.home.ui.common;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AW\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000BH\u0007¢\u0006\u0002\u0010\r\u001A\r\u0010\u000E\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000F¨\u0006\u0010"}, d2 = {"SlotFollowButton", "", "isFollowing", "", "onClickFollow", "Lkotlin/Function0;", "onClickUnFollow", "colors", "Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors;", "followingColor", "iconColor", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Color;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors;Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SlotFollowButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotFollowButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotFollowButton.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotFollowButtonKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,119:1\n85#2:120\n81#2,7:121\n88#2:156\n92#2:160\n78#3,6:128\n85#3,4:143\n89#3,2:153\n93#3:159\n368#4,9:134\n377#4:155\n378#4,2:157\n4032#5,6:147\n1223#6,6:161\n148#7:167\n148#7:168\n*S KotlinDebug\n*F\n+ 1 SlotFollowButton.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotFollowButtonKt\n*L\n28#1:120\n28#1:121,7\n28#1:156\n28#1:160\n28#1:128,6\n28#1:143,4\n28#1:153,2\n28#1:159\n28#1:134,9\n28#1:155\n28#1:157,2\n28#1:147,6\n97#1:161,6\n100#1:167\n101#1:168\n*E\n"})
public final class SlotFollowButtonKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SlotFollowButton(boolean z, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull ButtonColors roundButtonDefaults$ButtonColors0, @NotNull ButtonColors roundButtonDefaults$ButtonColors1, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Function1 function11;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClickFollow");
        Intrinsics.checkNotNullParameter(function01, "onClickUnFollow");
        Intrinsics.checkNotNullParameter(roundButtonDefaults$ButtonColors0, "colors");
        Intrinsics.checkNotNullParameter(roundButtonDefaults$ButtonColors1, "followingColor");
        Composer composer1 = composer0.startRestartGroup(0x19CDBE33);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(roundButtonDefaults$ButtonColors0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(roundButtonDefaults$ButtonColors1) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            function11 = function10;
        }
        else if((0x70000 & v) == 0) {
            function11 = function10;
            v2 |= (composer1.changedInstance(function11) ? 0x20000 : 0x10000);
        }
        else {
            function11 = function10;
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            Function1 function12 = (v1 & 0x20) == 0 ? function11 : d0.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x19CDBE33, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotFollowButton (SlotFollowButton.kt:94)");
            }
            composer1.startReplaceGroup(-501909792);
            e0 e00 = composer1.rememberedValue();
            if((((v2 & 14) == 4 ? 1 : 0) | ((v2 & 0x380) == 0x100 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0)) != 0 || e00 == Composer.Companion.getEmpty()) {
                e00 = new e0(z, function01, function00);
                composer1.updateRememberedValue(e00);
            }
            composer1.endReplaceGroup();
            RoundButtonKt.RoundButton(e00, StringResources_androidKt.stringResource((z ? string.content_desc_blog_unfollow_click : string.content_desc_blog_follow_click), composer1, 0), (z ? roundButtonDefaults$ButtonColors1 : roundButtonDefaults$ButtonColors0), SizeKt.defaultMinSize-VpY3zN4$default(Modifier.Companion, 74.0f, 0.0f, 2, null), null, null, false, null, PaddingKt.PaddingValues-YgX7TsA$default(0.0f, 8.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(0x8A0A41D7, true, new f0(z, function12), composer1, 54), composer1, 0x36000C00, 0xF0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function12;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(z, function00, function01, roundButtonDefaults$ButtonColors0, roundButtonDefaults$ButtonColors1, function11, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true, widthDp = 375)
    public static final void SlotFollowButtonPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1026122344);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1026122344, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotFollowButtonPreview (SlotFollowButton.kt:26)");
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
            ButtonColors roundButtonDefaults$ButtonColors0 = new ButtonColors(0L, 0xFF00000000000000L, Color.copy-wmQWz5c$default(0xFF00000000000000L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 56, null);
            ButtonColors roundButtonDefaults$ButtonColors1 = new ButtonColors(0L, 0xFF00000000000000L, Color.copy-wmQWz5c$default(0xFF00000000000000L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 56, null);
            SlotFollowButtonKt.SlotFollowButton(false, h0.a, i0.a, roundButtonDefaults$ButtonColors0, roundButtonDefaults$ButtonColors1, null, composer1, 28086, 0x20);
            SlotFollowButtonKt.SlotFollowButton(true, j0.a, k0.a, roundButtonDefaults$ButtonColors0, roundButtonDefaults$ButtonColors1, null, composer1, 28086, 0x20);
            ButtonColors roundButtonDefaults$ButtonColors2 = new ButtonColors(0L, 0xFFFFFFFF00000000L, 0L, 0L, 0L, 0L, 56, null);
            ButtonColors roundButtonDefaults$ButtonColors3 = new ButtonColors(Color.copy-wmQWz5c$default(0xFF00000000000000L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.copy-wmQWz5c$default(0L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 56, null);
            SlotFollowButtonKt.SlotFollowButton(false, l0.a, m0.a, roundButtonDefaults$ButtonColors2, roundButtonDefaults$ButtonColors3, p0.a, composer1, 0x36DB6, 0);
            SlotFollowButtonKt.SlotFollowButton(true, n0.a, o0.a, roundButtonDefaults$ButtonColors2, roundButtonDefaults$ButtonColors3, p0.a, composer1, 0x36DB6, 0);
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
            scopeUpdateScope0.updateScope(new q0(v));
        }
    }
}

