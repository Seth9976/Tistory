package com.kakao.tistory.presentation.widget;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001AU\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u001E\b\u0002\u0010\b\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000B¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r\u001A3\u0010\u000E\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u000F\u001A\u00020\u00102\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001A;\u0010\u0014\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\f\u0010\u0018\u001A\u0004\u0018\u00010\u0005X\u008A\u0084\u0002²\u0006\u0012\u0010\u0004\u001A\n \u0019*\u0004\u0018\u00010\u00050\u0005X\u008A\u0084\u0002²\u0006\f\u0010\u001A\u001A\u0004\u0018\u00010\u0005X\u008A\u0084\u0002"}, d2 = {"CommonTitleView", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "info", "contentDescription", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TitleWithCategoryView", "viewModel", "Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;", "onClickSortTiara", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TitleWithDescriptionView", "description", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease", "selectedSortTitle", "kotlin.jvm.PlatformType", "titleInfo"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonTitle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTitle.kt\ncom/kakao/tistory/presentation/widget/CommonTitleKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,126:1\n148#2:127\n148#2:128\n148#2:171\n148#2:210\n98#3:129\n95#3,6:130\n101#3:164\n98#3:172\n95#3,6:173\n101#3:207\n105#3:216\n105#3:220\n78#4,6:136\n85#4,4:151\n89#4,2:161\n78#4,6:179\n85#4,4:194\n89#4,2:204\n93#4:215\n93#4:219\n368#5,9:142\n377#5:163\n368#5,9:185\n377#5:206\n378#5,2:213\n378#5,2:217\n4032#6,6:155\n4032#6,6:198\n1223#7,6:165\n95#8,2:208\n95#8,2:211\n81#9:221\n81#9:222\n81#9:223\n*S KotlinDebug\n*F\n+ 1 CommonTitle.kt\ncom/kakao/tistory/presentation/widget/CommonTitleKt\n*L\n35#1:127\n38#1:128\n47#1:171\n58#1:210\n33#1:129\n33#1:130,6\n33#1:164\n47#1:172\n47#1:173,6\n47#1:207\n47#1:216\n33#1:220\n33#1:136,6\n33#1:151,4\n33#1:161,2\n47#1:179,6\n47#1:194,4\n47#1:204,2\n47#1:215\n33#1:219\n33#1:142,9\n33#1:163\n47#1:185,9\n47#1:206\n47#1:213,2\n33#1:217,2\n33#1:155,6\n47#1:198,6\n42#1:165,6\n51#1:208,2\n63#1:211,2\n95#1:221\n97#1:222\n98#1:223\n*E\n"})
public final class CommonTitleKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CommonTitleView(@Nullable Modifier modifier0, @NotNull String s, @Nullable String s1, @Nullable String s2, @Nullable Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Function3 function31;
        String s4;
        Modifier modifier2;
        Modifier modifier5;
        String s3;
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(0xEF7C4C8C);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            modifier1 = modifier0;
        }
        else if((v & 14) == 0) {
            modifier1 = modifier0;
            v2 = (composer1.changed(modifier1) ? 4 : 2) | v;
        }
        else {
            modifier1 = modifier0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            s3 = s2;
        }
        else if((v & 0x1C00) == 0) {
            s3 = s2;
            v2 |= (composer1.changed(s3) ? 0x800 : 0x400);
        }
        else {
            s3 = s2;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier1 = Modifier.Companion;
            }
            if((v1 & 8) != 0) {
                s3 = null;
            }
            Function3 function32 = (v1 & 16) == 0 ? function30 : ComposableSingletons.CommonTitleKt.INSTANCE.getLambda-1$presentation_prodRelease();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEF7C4C8C, v2, -1, "com.kakao.tistory.presentation.widget.CommonTitleView (CommonTitle.kt:31)");
            }
            Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier1, 70.0f), 0.0f, 1, null), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), 20.0f, 0.0f, 20.0f, 0.0f, 10, null);
            Companion alignment$Companion0 = Alignment.Companion;
            Arrangement arrangement0 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(-1904463029);
            if(s3 == null) {
                modifier5 = null;
            }
            else {
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                composer1.startReplaceGroup(0x1B452390);
                boolean z = composer1.changed(s3);
                e e0 = composer1.rememberedValue();
                if(z || e0 == Composer.Companion.getEmpty()) {
                    e0 = new e(s3);
                    composer1.updateRememberedValue(e0);
                }
                composer1.endReplaceGroup();
                modifier5 = SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, e0);
            }
            composer1.endReplaceGroup();
            if(modifier5 == null) {
                modifier5 = Modifier.Companion;
            }
            Modifier modifier6 = PaddingKt.padding-qDBjuR0$default(modifier5, 0.0f, 0.0f, 0.0f, 4.0f, 7, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            TextStyle textStyle0 = TypeKt.getPageTitle(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
            TextUnitKt.checkArithmetic--R2X_6o(0x13F333333L);
            modifier2 = modifier1;
            int v5 = MaterialTheme.$stable;
            MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 7502770995L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, v2 >> 3 & 14, 0xC00, 0x1DF7E);
            composer1.startReplaceGroup(457528250);
            if(s1 != null) {
                Modifier modifier8 = PaddingKt.padding-qDBjuR0$default(rowScopeInstance0.align(Modifier.Companion, alignment$Companion0.getTop()), 7.0f, 2.0f, 0.0f, 0.0f, 12, null);
                TextStyle textStyle1 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext2(materialTheme0.getTypography(composer1, v5)), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x100000000L, null, null, null, 0, 0, null, 0xFDFFFF, null);
                TextUnitKt.checkArithmetic--R2X_6o(5340187853L);
                ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, modifier8, 0L, 0x141400000L, null, null, null, 7487671501L, null, null, 0L, 0, false, false, 0, 0, null, textStyle1, composer1, 0xC00, 0xC00, 0x1DF74);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, Modifier.Companion, 1.0f, false, 2, null), composer1, 0);
            function32.invoke(rowScopeInstance0, composer1, ((int)(v2 >> 9 & 0x70 | 6)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function31 = function32;
            s4 = s3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            s4 = s3;
            function31 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(modifier2, s, s1, s4, function31, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TitleWithCategoryView(@Nullable Modifier modifier0, @Nullable TopViewModel topViewModel0, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x578C6560);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 16;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 2) != 2 || (v2 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) != 0) {
                    modifier0 = Modifier.Companion;
                }
                if((v1 & 2) != 0) {
                    topViewModel0 = new TopViewModel();
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    function00 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x578C6560, v2, -1, "com.kakao.tistory.presentation.widget.TitleWithCategoryView (CommonTitle.kt:93)");
            }
            State state0 = LiveDataAdapterKt.observeAsState(topViewModel0.getSelectedSortTitle(), composer1, 8);
            State state1 = LiveDataAdapterKt.observeAsState(topViewModel0.getTitle(), "", composer1, 56);
            State state2 = LiveDataAdapterKt.observeAsState(topViewModel0.getTitleInfo(), composer1, 8);
            String s = (String)state1.getValue();
            Intrinsics.checkNotNullExpressionValue(s, "TitleWithCategoryView$lambda$6(...)");
            CommonTitleKt.CommonTitleView(modifier0, s, ((String)state2.getValue()), null, ComposableLambdaKt.rememberComposableLambda(0x2507EF25, true, new j(state0, function00, topViewModel0), composer1, 54), composer1, v2 & 14 | 0x6000, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(modifier0, topViewModel0, function00, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TitleWithDescriptionView(@Nullable Modifier modifier0, @NotNull String s, @Nullable String s1, @Nullable String s2, @NotNull String s3, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s3, "description");
        Composer composer1 = composer0.startRestartGroup(0x756AB8CD);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(s2) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(s3) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x756AB8CD, v2, -1, "com.kakao.tistory.presentation.widget.TitleWithDescriptionView (CommonTitle.kt:78)");
            }
            CommonTitleKt.CommonTitleView(modifier2, s, s1, s2, ComposableLambdaKt.rememberComposableLambda(0x4FF6AD92, true, new m(s3), composer1, 54), composer1, v2 & 14 | 0x6000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(modifier1, s, s1, s2, s3, v, v1));
        }
    }

    public static final String access$TitleWithCategoryView$lambda$5(State state0) {
        return (String)state0.getValue();
    }
}

