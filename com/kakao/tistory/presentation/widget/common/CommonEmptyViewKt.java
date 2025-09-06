package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.annotation.StringRes;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A!\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"CommonEmptyView", "", "charSeqMessage", "", "(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)V", "stringRes", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ILandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonEmptyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonEmptyView.kt\ncom/kakao/tistory/presentation/widget/common/CommonEmptyViewKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,71:1\n148#2:72\n148#2:73\n148#2:74\n148#2:75\n148#2:118\n148#2:119\n148#2:120\n148#2:121\n71#3:76\n68#3,6:77\n74#3:111\n78#3:117\n71#3:122\n68#3,6:123\n74#3:157\n78#3:161\n78#4,6:83\n85#4,4:98\n89#4,2:108\n93#4:116\n78#4,6:129\n85#4,4:144\n89#4,2:154\n93#4:160\n368#5,9:89\n377#5:110\n378#5,2:114\n368#5,9:135\n377#5:156\n378#5,2:158\n4032#6,6:102\n4032#6,6:148\n95#7,2:112\n*S KotlinDebug\n*F\n+ 1 CommonEmptyView.kt\ncom/kakao/tistory/presentation/widget/common/CommonEmptyViewKt\n*L\n26#1:72\n27#1:73\n28#1:74\n29#1:75\n49#1:118\n50#1:119\n51#1:120\n52#1:121\n32#1:76\n32#1:77,6\n32#1:111\n32#1:117\n47#1:122\n47#1:123,6\n47#1:157\n47#1:161\n32#1:83,6\n32#1:98,4\n32#1:108,2\n32#1:116\n47#1:129,6\n47#1:144,4\n47#1:154,2\n47#1:160\n32#1:89,9\n32#1:110\n32#1:114,2\n47#1:135,9\n47#1:156\n47#1:158,2\n32#1:102,6\n47#1:148,6\n38#1:112,2\n*E\n"})
public final class CommonEmptyViewKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommonEmptyView(@StringRes int v, @Nullable PaddingValues paddingValues0, @Nullable Composer composer0, int v1, int v2) {
        int v4;
        PaddingValues paddingValues1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x333A8CC3);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
            if((v2 & 2) == 0) {
                paddingValues1 = paddingValues0;
                v4 = composer1.changed(paddingValues1) ? 0x20 : 16;
            }
            else {
                paddingValues1 = paddingValues0;
                v4 = 16;
            }
            v3 |= v4;
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
            }
            else if((v2 & 2) != 0) {
                paddingValues1 = PaddingKt.PaddingValues-a9UjIt4(20.0f, 12.0f, 20.0f, 60.0f);
                v3 &= 0xFFFFFF8F;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x333A8CC3, v3, -1, "com.kakao.tistory.presentation.widget.common.CommonEmptyView (CommonEmptyView.kt:30)");
            }
            Modifier modifier0 = PaddingKt.padding(Modifier.Companion, paddingValues1);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            String s = StringResources_androidKt.stringResource(v, composer1, v3 & 14);
            FontWeight fontWeight0 = FontWeight.Companion.getNormal();
            TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, ColorResources_androidKt.colorResource(color.color_9d9d9d, composer1, 0), 0x141500000L, null, fontWeight0, TypeKt.getTFont(), 0x1BDCCCCCDL, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0, 0x3FF12);
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
            scopeUpdateScope0.updateScope(new k(v, paddingValues1, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommonEmptyView(@NotNull CharSequence charSequence0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "charSeqMessage");
        Composer composer1 = composer0.startRestartGroup(890921922);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(890921922, v, -1, "com.kakao.tistory.presentation.widget.common.CommonEmptyView (CommonEmptyView.kt:45)");
        }
        Modifier modifier0 = PaddingKt.padding-qDBjuR0(Modifier.Companion, 20.0f, 12.0f, 20.0f, 60.0f);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        m m0 = new m(charSequence0);
        AndroidView_androidKt.AndroidView(l.a, null, m0, composer1, 6, 2);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(charSequence0, v));
        }
    }
}

