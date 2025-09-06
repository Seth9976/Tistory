package com.kakao.tistory.presentation.widget.dialog;

import a;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.VerticalDividerKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u001AZ\u0010\r\u001A\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u000221\u0010\f\u001A-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0002\b\n¢\u0006\u0002\b\u000BH\u0007¢\u0006\u0004\b\r\u0010\u000E\u001A%\u0010\u0013\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\u000F2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\t0\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u0083\u0001\u0010\u0013\u001A\u00020\t2\u0006\u0010\u0016\u001A\u00020\u00152\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0019\u001A\u00020\u00182\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0003\u0010\u001B\u001A\u00020\u001A2\b\b\u0003\u0010\u001C\u001A\u00020\u001A2\b\b\u0002\u0010\u001D\u001A\u00020\u00182\b\b\u0002\u0010\u001E\u001A\u00020\u00182\u000E\b\u0002\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\t0\u00112\u000E\b\u0002\u0010 \u001A\b\u0012\u0004\u0012\u00020\t0\u0011H\u0007¢\u0006\u0004\b\u0013\u0010!\u001A\u000F\u0010\"\u001A\u00020\tH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006&²\u0006\u001A\u0010\b\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00008\n@\nX\u008A\u008E\u0002²\u0006\u001C\u0010$\u001A\b\u0012\u0004\u0012\u00020\t0\u0011\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008A\u0084\u0002²\u0006\u000E\u0010%\u001A\u00020\u00158\n@\nX\u008A\u008E\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/widget/dialog/DialogEvent;", "T", "Lkotlinx/coroutines/flow/Flow;", "dialogEvent", "Lkotlin/Function2;", "Lcom/kakao/tistory/presentation/widget/dialog/DialogFactory;", "Lkotlin/ParameterName;", "name", "event", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "onReceiveEvent", "DialogHandler", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/widget/dialog/AlertDialogData;", "data", "Lkotlin/Function0;", "onDismiss", "TistoryAlertDialog", "(Lcom/kakao/tistory/presentation/widget/dialog/AlertDialogData;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "title", "message", "", "showLeftButton", "", "leftButton", "rightButton", "rightButtonColorEnabled", "isCanceledOnTouchOutside", "leftButtonCallback", "rightButtonCallback", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;IIZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewDialogView", "(Landroidx/compose/runtime/Composer;I)V", "dismiss", "result", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryComposeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryComposeDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/TistoryComposeDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,320:1\n1223#2,6:321\n1223#2,6:327\n1223#2,6:333\n1223#2,6:339\n1223#2,6:427\n1223#2,6:435\n1#3:345\n148#4:346\n148#4:347\n158#4:348\n158#4:349\n148#4:386\n148#4:387\n158#4:388\n158#4:389\n148#4:390\n148#4:433\n158#4:434\n148#4:441\n85#5:350\n82#5,6:351\n88#5:385\n92#5:449\n78#6,6:357\n85#6,4:372\n89#6,2:382\n78#6,6:398\n85#6,4:413\n89#6,2:423\n93#6:444\n93#6:448\n368#7,9:363\n377#7:384\n368#7,9:404\n377#7:425\n378#7,2:442\n378#7,2:446\n4032#8,6:376\n4032#8,6:417\n98#9:391\n95#9,6:392\n101#9:426\n105#9:445\n81#10:450\n107#10,2:451\n81#10:453\n81#10:454\n107#10,2:455\n*S KotlinDebug\n*F\n+ 1 TistoryComposeDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/TistoryComposeDialogKt\n*L\n48#1:321,6\n49#1:327,6\n115#1:333,6\n128#1:339,6\n278#1:427,6\n294#1:435,6\n241#1:346\n243#1:347\n244#1:348\n245#1:349\n250#1:386\n261#1:387\n269#1:388\n270#1:389\n272#1:390\n281#1:433\n287#1:434\n297#1:441\n237#1:350\n237#1:351,6\n237#1:385\n237#1:449\n237#1:357,6\n237#1:372,4\n237#1:382,2\n272#1:398,6\n272#1:413,4\n272#1:423,2\n272#1:444\n237#1:448\n237#1:363,9\n237#1:384\n272#1:404,9\n272#1:425\n272#1:442,2\n237#1:446,2\n237#1:376,6\n272#1:417,6\n272#1:391\n272#1:392,6\n272#1:426\n272#1:445\n48#1:450\n48#1:451,2\n49#1:453\n115#1:454\n115#1:455,2\n*E\n"})
public final class TistoryComposeDialogKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DialogHandler(@NotNull Flow flow0, @NotNull Function4 function40, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(flow0, "dialogEvent");
        Intrinsics.checkNotNullParameter(function40, "onReceiveEvent");
        Composer composer1 = composer0.startRestartGroup(0x5704FF84);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5704FF84, v, -1, "com.kakao.tistory.presentation.widget.dialog.DialogHandler (TistoryComposeDialog.kt:46)");
        }
        composer1.startReplaceGroup(0x396669FD);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        r0 r00 = b.a(composer1, 0x39667508);
        if(r00 == composer$Companion0.getEmpty()) {
            r00 = new r0(mutableState0);
            composer1.updateRememberedValue(r00);
        }
        composer1.endReplaceGroup();
        State state0 = SnapshotStateKt.rememberUpdatedState(r00, composer1, 6);
        EffectsKt.LaunchedEffect(flow0, new p0(flow0, mutableState0, null), composer1, 72);
        DialogEvent dialogEvent0 = (DialogEvent)mutableState0.getValue();
        if(dialogEvent0 != null) {
            function40.invoke(new DialogFactory(((Function0)state0.getValue())), dialogEvent0, composer1, ((int)(v << 3 & 0x380)));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q0(flow0, function40, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview
    public static final void PreviewDialogView(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xEAB032F3);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEAB032F3, v, -1, "com.kakao.tistory.presentation.widget.dialog.PreviewDialogView (TistoryComposeDialog.kt:310)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.TistoryComposeDialogKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v0(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryAlertDialog(@NotNull AlertDialogData alertDialogData0, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(alertDialogData0, "data");
        Intrinsics.checkNotNullParameter(function00, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0xA72A2810);
        int v1 = (v & 14) == 0 ? (composer1.changed(alertDialogData0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA72A2810, v1, -1, "com.kakao.tistory.presentation.widget.dialog.TistoryAlertDialog (TistoryComposeDialog.kt:148)");
            }
            String s = alertDialogData0.getTitle();
            composer1.startReplaceGroup(0x2A68FB25);
            String s1 = null;
            if(s == null) {
                Integer integer0 = alertDialogData0.getTitleRes();
                s = integer0 == null ? null : StringResources_androidKt.stringResource(integer0.intValue(), composer1, 0);
            }
            composer1.endReplaceGroup();
            if(s == null) {
                s = "";
            }
            String s2 = alertDialogData0.getMessage();
            composer1.startReplaceGroup(0x2A690529);
            if(s2 == null) {
                Integer integer1 = alertDialogData0.getMessageRes();
                if(integer1 != null) {
                    s1 = StringResources_androidKt.stringResource(integer1.intValue(), composer1, 0);
                }
            }
            else {
                s1 = s2;
            }
            composer1.endReplaceGroup();
            if(s1 == null) {
                s1 = "";
            }
            if(p.isBlank(s) && p.isBlank(s1)) {
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                if(scopeUpdateScope0 != null) {
                    scopeUpdateScope0.updateScope(new z0(alertDialogData0, function00, v));
                }
                return;
            }
            TistoryComposeDialogKt.TistoryAlertDialog(s, s1, alertDialogData0.getShowCancel(), function00, string.label_dialog_cancel, string.label_dialog_ok, false, false, function00, new a1(alertDialogData0, function00), composer1, v1 << 6 & 0x1C00 | 0xD80000 | v1 << 21 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new b1(alertDialogData0, function00, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryAlertDialog(@NotNull String s, @Nullable String s1, boolean z, @NotNull Function0 function00, @StringRes int v, @StringRes int v1, boolean z1, boolean z2, @Nullable Function0 function01, @Nullable Function0 function02, @Nullable Composer composer0, int v2, int v3) {
        boolean z7;
        int v6;
        int v5;
        boolean z6;
        Function0 function04;
        Function0 function03;
        boolean z5;
        String s2;
        String s3;
        boolean z11;
        int v9;
        int v8;
        boolean z10;
        int v7;
        Function0 function05;
        boolean z9;
        Function0 function06;
        int v12;
        int v11;
        int v10;
        boolean z4;
        boolean z3;
        int v4;
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0x5C195B80);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            z3 = z;
        }
        else if((v2 & 0x380) == 0) {
            z3 = z;
            v4 |= (composer1.changed(z3) ? 0x100 : 0x80);
        }
        else {
            z3 = z;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((0xE000 & v2) == 0) {
            v4 |= ((v3 & 16) != 0 || !composer1.changed(v) ? 0x2000 : 0x4000);
        }
        if((0x70000 & v2) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(v1) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
            z4 = z1;
        }
        else if((0x380000 & v2) == 0) {
            z4 = z1;
            v4 |= (composer1.changed(z4) ? 0x100000 : 0x80000);
        }
        else {
            z4 = z1;
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v4 |= (composer1.changed(z2) ? 0x800000 : 0x400000);
        }
        if((v2 & 0xE000000) == 0) {
            v4 |= ((v3 & 0x100) != 0 || !composer1.changedInstance(function01) ? 0x2000000 : 0x4000000);
        }
        if((v2 & 0x70000000) == 0) {
            v4 |= ((v3 & 0x200) != 0 || !composer1.changedInstance(function02) ? 0x10000000 : 0x20000000);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || !composer1.getSkipping()) {
            boolean z8 = false;
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 4) != 0) {
                    z3 = false;
                }
                if((v3 & 16) == 0) {
                    v10 = v;
                }
                else {
                    v10 = string.label_dialog_cancel;
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) == 0) {
                    v11 = v1;
                }
                else {
                    v11 = string.label_dialog_ok;
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    z4 = false;
                }
                if((v3 & 0x80) == 0) {
                    z8 = z2;
                }
                if((v3 & 0x100) == 0) {
                    v12 = v4;
                    function06 = function01;
                }
                else {
                    v12 = v4 & 0xF1FFFFFF;
                    function06 = function00;
                }
                if((v3 & 0x200) == 0) {
                    function04 = function02;
                    function05 = function06;
                    z9 = z8;
                    v8 = v10;
                    z10 = z3;
                    v9 = v11;
                    v7 = v12;
                }
                else {
                    function05 = function06;
                    z9 = z8;
                    v7 = 0x8FFFFFFF & v12;
                    v8 = v10;
                    z10 = z3;
                    v9 = v11;
                    function04 = function00;
                }
                z11 = z4;
                s3 = (v3 & 2) == 0 ? s1 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x100) != 0) {
                    v4 &= 0xF1FFFFFF;
                }
                if((v3 & 0x200) != 0) {
                    v4 &= 0x8FFFFFFF;
                }
                z9 = z2;
                function05 = function01;
                function04 = function02;
                v7 = v4;
                z10 = z3;
                v8 = v;
                v9 = v1;
                z11 = z4;
                s3 = s1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5C195B80, v7, -1, "com.kakao.tistory.presentation.widget.dialog.TistoryAlertDialog (TistoryComposeDialog.kt:183)");
            }
            AndroidDialog_androidKt.Dialog(function00, new DialogProperties(z9, z9, false, 4, null), ComposableLambdaKt.rememberComposableLambda(0x60244117, true, new d1(s, s3, z10, v8, v9, z11, function05, function04), composer1, 54), composer1, v7 >> 9 & 14 | 0x180, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            s2 = s3;
            z6 = z10;
            v5 = v8;
            v6 = v9;
            z7 = z11;
            z5 = z9;
            function03 = function05;
        }
        else {
            composer1.skipToGroupEnd();
            s2 = s1;
            z5 = z2;
            function03 = function01;
            function04 = function02;
            z6 = z3;
            v5 = v;
            v6 = v1;
            z7 = z4;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e1(s, s2, z6, function00, v5, v6, z7, z5, function03, function04, v2, v3));
        }
    }

    public static final void access$DialogHandler$lambda$2(MutableState mutableState0, DialogEvent dialogEvent0) {
        mutableState0.setValue(dialogEvent0);
    }

    public static final void access$DialogView(String s, String s1, Integer integer0, Integer integer1, boolean z, Function1 function10, Composer composer0, int v, int v1) {
        Integer integer3;
        Integer integer2;
        boolean z1;
        int v7;
        MaterialTheme materialTheme1;
        int v5;
        String s2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1044204410);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            s2 = s1;
        }
        else if((v & 0x70) == 0) {
            s2 = s1;
            v2 |= (composer1.changed(s2) ? 0x20 : 16);
        }
        else {
            s2 = s1;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(integer0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(integer1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            String s3 = (v1 & 2) == 0 ? s2 : null;
            Integer integer4 = (v1 & 4) == 0 ? integer0 : null;
            Integer integer5 = (v1 & 8) == 0 ? integer1 : null;
            boolean z2 = (v1 & 16) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1044204410, v2, -1, "com.kakao.tistory.presentation.widget.dialog.DialogView (TistoryComposeDialog.kt:235)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.defaultMinSize-VpY3zN4$default(SizeKt.width-3ABfNKs(BackgroundKt.background-bw27NRU(modifier$Companion0, ColorResources_androidKt.colorResource(color.white, composer1, 0), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f)), 280.0f), 0.0f, 136.5f, 1, null), 0.0f, 28.5f, 0.0f, 0.0f, 13, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth(modifier$Companion0, 1.0f), 35.0f, 0.0f, 2, null);
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH3();
            TextAlign textAlign0 = TextAlign.box-impl(3);
            int v4 = MaterialTheme.$stable;
            MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier2, 0L, 0L, null, null, null, 0x1BE800000L, null, textAlign0, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, v2 & 14 | 0xC00030, 0xC00, 0x1DD7C);
            composer1.startReplaceGroup(0xA13C223F);
            if(s3 == null) {
                v5 = v4;
                materialTheme1 = materialTheme0;
            }
            else {
                Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth(modifier$Companion0, 1.0f), 35.0f, 7.0f, 35.0f, 0.0f, 8, null);
                materialTheme1 = materialTheme0;
                TextStyle textStyle1 = TypeKt.getSubtext1(materialTheme1.getTypography(composer1, v4));
                v5 = v4;
                ExcludeFontPaddingTextKt.Text-IbK3jfQ(s3.toString(), modifier3, 0L, 0L, null, null, null, 0x1BDCCCCCDL, null, TextAlign.box-impl(3), 0L, 0, false, false, 0, 0, null, textStyle1, composer1, 0xC00000, 0xC00, 0x1DD7C);
            }
            composer1.endReplaceGroup();
            b.a(31.75f, modifier$Companion0, composer1, 6);
            DividerKt.HorizontalDivider-9IZ8Weo(null, 0.6f, ColorResources_androidKt.colorResource(color.gray3, composer1, 0), composer1, 0x30, 1);
            Modifier modifier4 = SizeKt.height-3ABfNKs(modifier$Companion0, 52.0f);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                d.a(v6, composer1, v6, function21);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(1018340399);
            if(integer4 == null) {
                v7 = v5;
            }
            else {
                Modifier modifier6 = RowScope.weight$default(rowScopeInstance0, SizeKt.fillMaxHeight$default(modifier$Companion0, 0.0f, 1, null), 1.0f, false, 2, null);
                composer1.startReplaceGroup(2095342375);
                s0 s00 = composer1.rememberedValue();
                if((v2 & 0x70000) == 0x20000 || s00 == Composer.Companion.getEmpty()) {
                    s00 = new s0(function10);
                    composer1.updateRememberedValue(s00);
                }
                composer1.endReplaceGroup();
                Modifier modifier7 = SizeKt.wrapContentHeight$default(PaddingKt.padding-3ABfNKs(ClickableKt.clickable-XHw0xAI$default(modifier6, false, null, null, s00, 7, null), 3.0f), null, false, 3, null);
                String s4 = StringResources_androidKt.stringResource(((int)integer4), composer1, v2 >> 6 & 14);
                TextStyle textStyle2 = materialTheme1.getTypography(composer1, v5).getButton();
                v7 = v5;
                ExcludeFontPaddingTextKt.Text-IbK3jfQ(s4, modifier7, 0L, 0L, null, null, null, 0L, null, TextAlign.box-impl(3), 0L, 0, false, false, 0, 0, null, textStyle2, composer1, 0, 0, 0x1FDFC);
                VerticalDividerKt.VerticalDivider-aM-cp0Q(null, 0L, 0.5f, composer1, 0x180, 3);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(1018360558);
            if(integer5 != null) {
                boolean z3 = true;
                Modifier modifier8 = RowScope.weight$default(rowScopeInstance0, SizeKt.fillMaxHeight$default(modifier$Companion0, 0.0f, 1, null), 1.0f, false, 2, null);
                composer1.startReplaceGroup(2095362472);
                if((v2 & 0x70000) != 0x20000) {
                    z3 = false;
                }
                t0 t00 = composer1.rememberedValue();
                if(z3 || t00 == Composer.Companion.getEmpty()) {
                    t00 = new t0(function10);
                    composer1.updateRememberedValue(t00);
                }
                composer1.endReplaceGroup();
                Modifier modifier9 = SizeKt.wrapContentHeight$default(PaddingKt.padding-3ABfNKs(ClickableKt.clickable-XHw0xAI$default(modifier8, false, null, null, t00, 7, null), 3.0f), null, false, 3, null);
                String s5 = StringResources_androidKt.stringResource(((int)integer5), composer1, v2 >> 9 & 14);
                TextStyle textStyle3 = materialTheme1.getTypography(composer1, v7).getButton();
                ExcludeFontPaddingTextKt.Text-IbK3jfQ(s5, modifier9, ColorResources_androidKt.colorResource((z2 ? color.point1 : color.gray1), composer1, 0), 0L, null, null, null, 0L, null, TextAlign.box-impl(3), 0L, 0, false, false, 0, 0, null, textStyle3, composer1, 0, 0, 0x1FDF8);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            s2 = s3;
            integer2 = integer4;
            integer3 = integer5;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
            integer2 = integer0;
            integer3 = integer1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u0(s, s2, integer2, integer3, z1, function10, v, v1));
        }
    }

    public static final void access$ShowDialogEventPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4760382D);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4760382D, v, -1, "com.kakao.tistory.presentation.widget.dialog.ShowDialogEventPreview (TistoryComposeDialog.kt:113)");
            }
            composer1.startReplaceGroup(-1340250974);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default("result", null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(((String)mutableState0.getValue()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0, 0, 0x3FFFE);
            TistoryComposeDialogKt.ShowDialogEventPreview.data.1 tistoryComposeDialogKt$ShowDialogEventPreview$data$10 = new TistoryComposeDialogKt.ShowDialogEventPreview.data.1(mutableState0);
            composer1.startReplaceGroup(0xB01D8E81);
            w0 w00 = composer1.rememberedValue();
            if(w00 == composer$Companion0.getEmpty()) {
                w00 = new w0(mutableState0);
                composer1.updateRememberedValue(w00);
            }
            composer1.endReplaceGroup();
            TistoryComposeDialogKt.TistoryAlertDialog(tistoryComposeDialogKt$ShowDialogEventPreview$data$10, w00, composer1, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x0(v));
        }
    }

    public static final String access$ShowDialogEventPreview$lambda$7(MutableState mutableState0) {
        return (String)mutableState0.getValue();
    }

    public static final void access$ShowDialogEventPreview$lambda$8(MutableState mutableState0, String s) {
        mutableState0.setValue(s);
    }

    public static final void access$TistoryDialogView(String s, String s1, Integer integer0, Integer integer1, boolean z, Function1 function10, Composer composer0, int v, int v1) {
        Integer integer3;
        Integer integer2;
        boolean z1;
        String s2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x93395862);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            s2 = s1;
        }
        else if((v & 0x70) == 0) {
            s2 = s1;
            v2 |= (composer1.changed(s2) ? 0x20 : 16);
        }
        else {
            s2 = s1;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(integer0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(integer1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z1 = z;
        }
        else if((0xE000 & v) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        else {
            z1 = z;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                s2 = null;
            }
            Integer integer4 = (v1 & 4) == 0 ? integer0 : null;
            Integer integer5 = (v1 & 8) == 0 ? integer1 : null;
            boolean z2 = (v1 & 16) == 0 ? z1 : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x93395862, v2, -1, "com.kakao.tistory.presentation.widget.dialog.TistoryDialogView (TistoryComposeDialog.kt:221)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(0xB6F2F3EB, true, new f1(s, s2, integer4, integer5, z2, function10), composer1, 54), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            integer2 = integer4;
            integer3 = integer5;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            integer2 = integer0;
            integer3 = integer1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g1(s, s2, integer2, integer3, z1, function10, v, v1));
        }
    }
}

