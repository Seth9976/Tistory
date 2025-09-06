package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
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
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001Ao\u0010\u000E\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001A\u0004\u0018\u00010\n2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000E\u0010\u000F\u001Ao\u0010\u000E\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00102\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001A\u0004\u0018\u00010\n2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000E\u0010\u0011¨\u0006\u0012"}, d2 = {"", "title", "", "showTitle", "showDivider", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;", "homeAsUpButtonType", "Lkotlin/Function0;", "", "onClickHomeAsUpButton", "", "rightButtonIconResId", "rightButtonContentDescriptionId", "onClickRightButton", "TistoryToolbar", "(Ljava/lang/String;ZZLcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;ZZLcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryToolbar.kt\ncom/kakao/tistory/presentation/widget/common/TistoryToolbarKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,128:1\n71#2:129\n69#2,5:130\n74#2:163\n78#2:208\n78#3,6:135\n85#3,4:150\n89#3,2:160\n78#3,6:171\n85#3,4:186\n89#3,2:196\n93#3:202\n93#3:207\n368#4,9:141\n377#4:162\n368#4,9:177\n377#4:198\n378#4,2:200\n378#4,2:205\n4032#5,6:154\n4032#5,6:190\n98#6:164\n95#6,6:165\n101#6:199\n105#6:203\n158#7:204\n148#7:209\n148#7:210\n148#7:211\n*S KotlinDebug\n*F\n+ 1 TistoryToolbar.kt\ncom/kakao/tistory/presentation/widget/common/TistoryToolbarKt\n*L\n64#1:129\n64#1:130,5\n64#1:163\n64#1:208\n64#1:135,6\n64#1:150,4\n64#1:160,2\n71#1:171,6\n71#1:186,4\n71#1:196,2\n71#1:202\n64#1:207\n64#1:141,9\n64#1:162\n71#1:177,9\n71#1:198\n71#1:200,2\n64#1:205,2\n64#1:154,6\n71#1:190,6\n71#1:164\n71#1:165,6\n71#1:199\n71#1:203\n91#1:204\n100#1:209\n117#1:210\n118#1:211\n*E\n"})
public final class TistoryToolbarKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryToolbar(@NotNull AnnotatedString annotatedString0, boolean z, boolean z1, @Nullable AppBarHomeAsUpButtonType tistoryToolbar$AppBarHomeAsUpButtonType0, @Nullable Function0 function00, @DrawableRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1, @Nullable Function0 function01, @Nullable Composer composer0, int v, int v1) {
        Integer integer3;
        Function0 function03;
        AppBarHomeAsUpButtonType tistoryToolbar$AppBarHomeAsUpButtonType1;
        Function0 function02;
        Integer integer2;
        boolean z3;
        boolean z2;
        int v2;
        Intrinsics.checkNotNullParameter(annotatedString0, "title");
        Composer composer1 = composer0.startRestartGroup(-1638929090);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(tistoryToolbar$AppBarHomeAsUpButtonType0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changed(integer0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(integer1) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            z2 = (v1 & 2) == 0 ? z : false;
            boolean z4 = (v1 & 4) == 0 ? z1 : false;
            tistoryToolbar$AppBarHomeAsUpButtonType1 = (v1 & 8) == 0 ? tistoryToolbar$AppBarHomeAsUpButtonType0 : null;
            Function0 function04 = (v1 & 16) == 0 ? function00 : e3.a;
            Integer integer4 = (v1 & 0x20) == 0 ? integer0 : null;
            Integer integer5 = (v1 & 0x40) == 0 ? integer1 : null;
            Function0 function05 = (v1 & 0x80) == 0 ? function01 : f3.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1638929090, v2, -1, "com.kakao.tistory.presentation.widget.common.TistoryToolbar (TistoryToolbar.kt:62)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.height-3ABfNKs(modifier$Companion0, PrimitiveResources_androidKt.dimensionResource(dimen.common_toolbar_height, composer1, 0));
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function06 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function06);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            AnimatedVisibilityKt.AnimatedVisibility(z2, null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), null, ComposableLambdaKt.rememberComposableLambda(-1780858208, true, new g3(annotatedString0), composer1, 54), composer1, v2 >> 3 & 14 | 200064, 18);
            Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Function0 function07 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function07);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(-1271704519);
            if(tistoryToolbar$AppBarHomeAsUpButtonType1 != null) {
                TistoryToolbarKt.a(tistoryToolbar$AppBarHomeAsUpButtonType1.getDrawableResourceId(), tistoryToolbar$AppBarHomeAsUpButtonType1.getContentDescriptionStringId(), function04, composer1, v2 >> 6 & 0x380, 0);
            }
            composer1.endReplaceGroup();
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            composer1.startReplaceGroup(0xB4337E05);
            if(integer4 != null) {
                TistoryToolbarKt.a(integer4.intValue(), integer5, function05, composer1, v2 >> 15 & 0x3F0, 0);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            composer1.startReplaceGroup(0x989DB478);
            if(z4) {
                DividerKt.Divider-oMI9zvI(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getBottomStart()), ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.5f, 0.0f, composer1, 0x180, 8);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            function02 = function05;
            z3 = z4;
            function03 = function04;
            integer3 = integer4;
            integer2 = integer5;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z;
            z3 = z1;
            integer2 = integer1;
            function02 = function01;
            tistoryToolbar$AppBarHomeAsUpButtonType1 = tistoryToolbar$AppBarHomeAsUpButtonType0;
            function03 = function00;
            integer3 = integer0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h3(annotatedString0, z2, z3, tistoryToolbar$AppBarHomeAsUpButtonType1, function03, integer3, integer2, function02, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryToolbar(@NotNull String s, boolean z, boolean z1, @Nullable AppBarHomeAsUpButtonType tistoryToolbar$AppBarHomeAsUpButtonType0, @Nullable Function0 function00, @DrawableRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1, @Nullable Function0 function01, @Nullable Composer composer0, int v, int v1) {
        Function0 function03;
        Integer integer3;
        Integer integer2;
        Function0 function02;
        AppBarHomeAsUpButtonType tistoryToolbar$AppBarHomeAsUpButtonType1;
        boolean z4;
        boolean z3;
        boolean z2;
        int v2;
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(0x613DFEA4);
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
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z2 = z1;
        }
        else if((v & 0x380) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x100 : 0x80);
        }
        else {
            z2 = z1;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(tistoryToolbar$AppBarHomeAsUpButtonType0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changed(integer0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(integer1) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            z3 = (v1 & 2) == 0 ? z : false;
            if((v1 & 4) != 0) {
                z2 = false;
            }
            Integer integer4 = null;
            tistoryToolbar$AppBarHomeAsUpButtonType1 = (v1 & 8) == 0 ? tistoryToolbar$AppBarHomeAsUpButtonType0 : null;
            function02 = (v1 & 16) == 0 ? function00 : b3.a;
            integer2 = (v1 & 0x20) == 0 ? integer0 : null;
            if((v1 & 0x40) == 0) {
                integer4 = integer1;
            }
            Function0 function04 = (v1 & 0x80) == 0 ? function01 : c3.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x613DFEA4, v2, -1, "com.kakao.tistory.presentation.widget.common.TistoryToolbar (TistoryToolbar.kt:39)");
            }
            TistoryToolbarKt.TistoryToolbar(new AnnotatedString(s, null, null, 6, null), z3, z2, tistoryToolbar$AppBarHomeAsUpButtonType1, function02, integer2, integer4, function04, composer1, v2 & 0x1FFFFF0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function03 = function04;
            z4 = z2;
            integer3 = integer4;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z;
            z4 = z2;
            tistoryToolbar$AppBarHomeAsUpButtonType1 = tistoryToolbar$AppBarHomeAsUpButtonType0;
            function02 = function00;
            integer2 = integer0;
            integer3 = integer1;
            function03 = function01;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d3(s, z3, z4, tistoryToolbar$AppBarHomeAsUpButtonType1, function02, integer2, integer3, function03, v, v1));
        }
    }

    public static final void a(int v, Integer integer0, Function0 function00, Composer composer0, int v1, int v2) {
        Function0 function01;
        Integer integer1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x3F69BA1B);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(integer0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v3 & 731) != 0x92 || !composer1.getSkipping()) {
            integer1 = (v2 & 2) == 0 ? integer0 : null;
            Function0 function02 = (v2 & 4) == 0 ? function00 : i3.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3F69BA1B, v3, -1, "com.kakao.tistory.presentation.widget.common.ToolbarButton (TistoryToolbar.kt:113)");
            }
            IconButtonKt.IconButton(function02, SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 11.0f, 0.0f, 0.0f, 0.0f, 14, null), 42.0f), false, null, ComposableLambdaKt.rememberComposableLambda(0x6553A7FF, true, new j3(v, integer1), composer1, 54), composer1, v3 >> 6 & 14 | 0x6030, 12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
            integer1 = integer0;
            function01 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k3(v, integer1, function01, v1, v2));
        }
    }

    public static final void access$ToolbarTitle(AnnotatedString annotatedString0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2076248804);
        int v1 = (v & 14) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2076248804, v1, -1, "com.kakao.tistory.presentation.widget.common.ToolbarTitle (TistoryToolbar.kt:97)");
            }
            ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 102.0f, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, null, new TextStyle(ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0x141900000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null), composer1, v1 & 14 | 0x30, 0x6030, 0x3B7FC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l3(annotatedString0, v));
        }
    }
}

