package com.kakao.tistory.presentation.screen.feed.ui;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.android.base.utils.StringUtils;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001A;\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "followingCount", "followerCount", "Lkotlin/Function0;", "", "onClickFollowing", "onClickFollower", "TopAppBarFollowInfo", "(JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTopAppBarFollowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBarFollowInfo.kt\ncom/kakao/tistory/presentation/screen/feed/ui/TopAppBarFollowInfoKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,74:1\n148#2:75\n148#2:112\n158#2:155\n98#3:76\n95#3,6:77\n101#3:111\n105#3:118\n78#4,6:83\n85#4,4:98\n89#4,2:108\n93#4:117\n78#4,6:126\n85#4,4:141\n89#4,2:151\n93#4:158\n368#5,9:89\n377#5:110\n378#5,2:115\n368#5,9:132\n377#5:153\n378#5,2:156\n4032#6,6:102\n4032#6,6:145\n86#7:113\n56#7:114\n85#8:119\n82#8,6:120\n88#8:154\n92#8:159\n*S KotlinDebug\n*F\n+ 1 TopAppBarFollowInfo.kt\ncom/kakao/tistory/presentation/screen/feed/ui/TopAppBarFollowInfoKt\n*L\n33#1:75\n37#1:112\n63#1:155\n34#1:76\n34#1:77,6\n34#1:111\n34#1:118\n34#1:83,6\n34#1:98,4\n34#1:108,2\n34#1:117\n46#1:126,6\n46#1:141,4\n46#1:151,2\n46#1:158\n34#1:89,9\n34#1:110\n34#1:115,2\n46#1:132,9\n46#1:153\n46#1:156,2\n34#1:102,6\n46#1:145,6\n37#1:113\n37#1:114\n46#1:119\n46#1:120,6\n46#1:154\n46#1:159\n*E\n"})
public final class TopAppBarFollowInfoKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TopAppBarFollowInfo(long v, long v1, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v2) {
        Intrinsics.checkNotNullParameter(function00, "onClickFollowing");
        Intrinsics.checkNotNullParameter(function01, "onClickFollower");
        Composer composer1 = composer0.startRestartGroup(0x31C80FAC);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function01) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x31C80FAC, v3, -1, "com.kakao.tistory.presentation.screen.feed.ui.TopAppBarFollowInfo (TopAppBarFollowInfo.kt:31)");
            }
            Modifier modifier0 = OffsetKt.offset-VpY3zN4(Modifier.Companion, 5.0f, 5.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TopAppBarFollowInfoKt.a(StringResources_androidKt.stringResource(string.label_feed_following, composer1, 0), v, function00, 5.0f, composer1, v3 << 3 & 0x70 | 0xC00 | v3 & 0x380);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
            TopAppBarFollowInfoKt.a(StringResources_androidKt.stringResource(string.label_feed_follower, composer1, 0), v1, function01, 5.0f, composer1, v3 & 0x70 | 0xC00 | v3 >> 3 & 0x380);
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
            scopeUpdateScope0.updateScope(new j(v, v1, function00, function01, v2));
        }
    }

    public static final void a(String s, long v, Function0 function00, float f, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x95A101D3);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x95A101D3, v2, -1, "com.kakao.tistory.presentation.screen.feed.ui.FollowCount (TopAppBarFollowInfo.kt:44)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-3ABfNKs(ClickableKt.clickable-XHw0xAI$default(ClipKt.clip(modifier$Companion0, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(f)), false, null, Role.box-impl(0), function00, 3, null), f);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getEnd(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141400000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null), composer1, v2 & 14, 0, 0xFFFE);
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 3.5f, 0.0f, 0.0f, 13, null);
            TextKt.Text--4IGK_g(StringUtils.INSTANCE.getNumberFormat(v), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141800000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null), composer1, 0x30, 0, 0xFFFC);
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
            scopeUpdateScope0.updateScope(new i(s, v, function00, f, v1));
        }
    }
}

