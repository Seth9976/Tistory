package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001AY\u0010\u000E\u001A\u00020\u00002\n\b\u0003\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0010\b\u0002\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"", "TistoryChipPreview", "(Landroidx/compose/runtime/Composer;I)V", "", "iconRes", "selectedIconRes", "", "label", "", "selected", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function0;", "onClick", "TistoryChip", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryChip.kt\ncom/kakao/tistory/presentation/widget/common/TistoryChipKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n148#2:157\n148#2,11:158\n148#2:170\n148#2:171\n148#2:205\n77#3:169\n98#4,3:172\n101#4:203\n105#4:209\n78#5,6:175\n85#5,4:190\n89#5,2:200\n93#5:208\n368#6,9:181\n377#6:202\n378#6,2:206\n4032#7,6:194\n1#8:204\n*S KotlinDebug\n*F\n+ 1 TistoryChip.kt\ncom/kakao/tistory/presentation/widget/common/TistoryChipKt\n*L\n32#1:157\n108#1:158,11\n119#1:170\n131#1:171\n144#1:205\n111#1:169\n114#1:172,3\n114#1:203\n114#1:209\n114#1:175,6\n114#1:190,4\n114#1:200,2\n114#1:208\n114#1:181,9\n114#1:202\n114#1:206,2\n114#1:194,6\n*E\n"})
public final class TistoryChipKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryChip(@DrawableRes @Nullable Integer integer0, @DrawableRes @Nullable Integer integer1, @Nullable String s, boolean z, @Nullable PaddingValues paddingValues0, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        String s2;
        Function0 function01;
        PaddingValues paddingValues2;
        Integer integer4;
        PaddingValues paddingValues4;
        Function0 function02;
        PaddingValues paddingValues3;
        boolean z2;
        String s3;
        int v4;
        PaddingValues paddingValues1;
        boolean z1;
        String s1;
        int v3;
        Integer integer3;
        Integer integer2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xAC20ACBB);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            integer2 = integer0;
        }
        else if((v & 14) == 0) {
            integer2 = integer0;
            v2 = (composer1.changed(integer2) ? 4 : 2) | v;
        }
        else {
            integer2 = integer0;
            v2 = v;
        }
        if((v & 0x70) == 0) {
            if((v1 & 2) == 0) {
                integer3 = integer1;
                v3 = composer1.changed(integer3) ? 0x20 : 16;
            }
            else {
                integer3 = integer1;
                v3 = 16;
            }
            v2 |= v3;
        }
        else {
            integer3 = integer1;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            s1 = s;
        }
        else if((v & 0x380) == 0) {
            s1 = s;
            v2 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        else {
            s1 = s;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0x1C00) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            paddingValues1 = paddingValues0;
        }
        else if((0xE000 & v) == 0) {
            paddingValues1 = paddingValues0;
            v2 |= (composer1.changed(paddingValues1) ? 0x4000 : 0x2000);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x5B6DB) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            Painter painter0 = null;
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) != 0) {
                    integer2 = null;
                }
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                    integer3 = integer2;
                }
                if((v1 & 4) != 0) {
                    s1 = null;
                }
                if((v1 & 8) != 0) {
                    z1 = false;
                }
                if((v1 & 16) != 0) {
                    paddingValues1 = PaddingKt.PaddingValues-YgX7TsA(16.0f, 7.5f);
                }
                if((v1 & 0x20) == 0) {
                label_88:
                    v4 = v2;
                    s3 = s1;
                    z2 = z1;
                    function02 = function00;
                    paddingValues3 = paddingValues1;
                }
                else {
                    v4 = v2;
                    s3 = s1;
                    z2 = z1;
                    paddingValues3 = paddingValues1;
                    function02 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                goto label_88;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAC20ACBB, v4, -1, "com.kakao.tistory.presentation.widget.common.TistoryChip (TistoryChip.kt:109)");
            }
            boolean z3 = ((Boolean)composer1.consume(SlotContainerKt.getLocalLoadingState())).booleanValue();
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ModifierKt.shape-8ww4TTg$default(modifier$Companion0, RoundedCornerShapeKt.RoundedCornerShape(100), 0L, (z2 ? null : BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, 0L)), 0.0f, 8, null);
            Modifier modifier1 = function02 == null ? modifier$Companion0 : SelectableKt.selectable-XHw0xAI(modifier$Companion0, z2, !z3, Role.box-impl(0), function02);
            Modifier modifier2 = PaddingKt.padding(modifier0.then(modifier1), paddingValues3);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(4.0f), Alignment.Companion.getCenterVertically(), composer1, 54);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                paddingValues4 = paddingValues3;
                d.a(v5, composer1, v5, function20);
            }
            else {
                paddingValues4 = paddingValues3;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    d.a(v5, composer1, v5, function20);
                }
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            if(z2) {
                composer1.startReplaceGroup(0xAA51FAE8);
                if(integer3 != null) {
                    painter0 = PainterResources_androidKt.painterResource(((int)integer3), composer1, v4 >> 3 & 14);
                }
            }
            else {
                composer1.startReplaceGroup(-1437377160);
                if(integer2 != null) {
                    painter0 = PainterResources_androidKt.painterResource(((int)integer2), composer1, v4 & 14);
                }
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0xCBB02795);
            if(painter0 != null) {
                IconKt.Icon-ww6aTOc(painter0, null, SizeKt.size-3ABfNKs(modifier$Companion0, 14.0f), 0L, composer1, 440, 0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0xCBB047AB);
            if(s3 != null) {
                TextKt.Text--4IGK_g(s3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize14Weight400(), composer1, 0, 0x180000, 0xFFFA);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            s2 = s3;
            z1 = z2;
            integer4 = integer3;
            function01 = function02;
            paddingValues2 = paddingValues4;
        }
        else {
            composer1.skipToGroupEnd();
            integer4 = integer3;
            paddingValues2 = paddingValues1;
            function01 = function00;
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z2(integer2, integer4, s2, z1, paddingValues2, function01, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true)
    public static final void TistoryChipPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD9BF55F5);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD9BF55F5, v, -1, "com.kakao.tistory.presentation.widget.common.TistoryChipPreview (TistoryChip.kt:23)");
            }
            TistoryChipKt.a(composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a3(v));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xEE6B6660);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEE6B6660, v, -1, "com.kakao.tistory.presentation.widget.common.PreviewContent (TistoryChip.kt:29)");
            }
            FlowLayoutKt.FlowRow(null, Arrangement.INSTANCE.spacedBy-0680j_4(4.0f), Arrangement.INSTANCE.getSpaceEvenly(), 0, 0, null, ComposableSingletons.TistoryChipKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x1801B0, 57);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y2(v));
        }
    }
}

