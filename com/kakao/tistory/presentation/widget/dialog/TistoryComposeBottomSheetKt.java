package com.kakao.tistory.presentation.widget.dialog;

import a;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.theme.TColor;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u008B\u0001\u0010\u0000\u001A\u00020\u00012\u001C\u0010\u0002\u001A\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u00062 \b\u0002\u0010\u0007\u001A\u001A\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u00062 \b\u0002\u0010\b\u001A\u001A\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001A\u00020\n2\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0007\u00A2\u0006\u0002\u0010\r\u001AY\u0010\u0000\u001A\u00020\u00012\n\b\u0003\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0002\u001A\u00020\u00102\u001E\b\u0002\u0010\b\u001A\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001A\u00020\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u00A2\u0006\u0002\u0010\u0011\u001AK\u0010\u0000\u001A\u00020\u00012\n\b\u0003\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0002\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\n2\b\b\u0002\u0010\u0013\u001A\u00020\n2\b\b\u0002\u0010\t\u001A\u00020\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u00A2\u0006\u0002\u0010\u0014\u001A\u001F\u0010\u0015\u001A\u00020\u00012\u0006\u0010\u0016\u001A\u00020\n2\b\b\u0002\u0010\u0013\u001A\u00020\nH\u0007\u00A2\u0006\u0002\u0010\u0017\u001A\r\u0010\u0018\u001A\u00020\u0001H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u0017\u0010\u001A\u001A\u00020\u00012\b\b\u0001\u0010\u000E\u001A\u00020\u000FH\u0007\u00A2\u0006\u0002\u0010\u001B\u001A=\u0010\u001C\u001A\u00020\u00012\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u001C\u0010\u001D\u001A\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0006H\u0007\u00A2\u0006\u0002\u0010\u001E\u001A)\u0010\u001F\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00102\b\b\u0002\u0010 \u001A\u00020!2\b\b\u0002\u0010\"\u001A\u00020\nH\u0007\u00A2\u0006\u0002\u0010#\u001AC\u0010$\u001A\u00020\u00012\b\b\u0002\u0010%\u001A\u00020\n2\f\u0010&\u001A\b\u0012\u0004\u0012\u00020\u00010\f2\u001C\u0010\u001D\u001A\u0018\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0006H\u0007\u00A2\u0006\u0002\u0010(\u00A8\u0006)"}, d2 = {"BottomSheetItem", "", "text", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "icon", "option", "showDivider", "", "onClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "iconRes", "", "", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "selected", "showUncheck", "(Ljava/lang/Integer;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BottomSheetItemCheckBox", "check", "(ZZLandroidx/compose/runtime/Composer;II)V", "BottomSheetItemDivider", "(Landroidx/compose/runtime/Composer;I)V", "BottomSheetItemIcon", "(ILandroidx/compose/runtime/Composer;I)V", "BottomSheetItemSpace", "content", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetItemText", "modifier", "Landroidx/compose/ui/Modifier;", "bold", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "TistoryComposeBottomSheet", "isCanceledOnTouchOutside", "onDismissRequest", "Landroidx/compose/foundation/layout/ColumnScope;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryComposeBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryComposeBottomSheet.kt\ncom/kakao/tistory/presentation/widget/dialog/TistoryComposeBottomSheetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,192:1\n148#2:193\n148#2:194\n148#2:235\n148#2:236\n148#2:277\n98#3:195\n95#3,6:196\n101#3:230\n105#3:234\n78#4,6:202\n85#4,4:217\n89#4,2:227\n93#4:233\n78#4,6:244\n85#4,4:259\n89#4,2:269\n93#4:275\n368#5,9:208\n377#5:229\n378#5,2:231\n368#5,9:250\n377#5:271\n378#5,2:273\n4032#6,6:221\n4032#6,6:263\n71#7:237\n68#7,6:238\n74#7:272\n78#7:276\n*S KotlinDebug\n*F\n+ 1 TistoryComposeBottomSheet.kt\ncom/kakao/tistory/presentation/widget/dialog/TistoryComposeBottomSheetKt\n*L\n33#1:193\n138#1:194\n152#1:235\n177#1:236\n189#1:277\n134#1:195\n134#1:196,6\n134#1:230\n134#1:234\n134#1:202,6\n134#1:217,4\n134#1:227,2\n134#1:233\n177#1:244,6\n177#1:259,4\n177#1:269,2\n177#1:275\n134#1:208,9\n134#1:229\n134#1:231,2\n177#1:250,9\n177#1:271\n177#1:273,2\n134#1:221,6\n177#1:263,6\n177#1:237\n177#1:238,6\n177#1:272\n177#1:276\n*E\n"})
public final class TistoryComposeBottomSheetKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomSheetItem(@DrawableRes @Nullable Integer integer0, @NotNull String s, @Nullable Function3 function30, boolean z, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        Function3 function31;
        Integer integer1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0xF01BAC30);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(integer0) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            integer1 = (v1 & 1) == 0 ? integer0 : null;
            Function3 function32 = (v1 & 4) == 0 ? function30 : ComposableSingletons.TistoryComposeBottomSheetKt.INSTANCE.getLambda-2$presentation_prodRelease();
            boolean z2 = (v1 & 8) == 0 ? z : true;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF01BAC30, v2, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItem (TistoryComposeBottomSheet.kt:86)");
            }
            TistoryComposeBottomSheetKt.BottomSheetItem(ComposableLambdaKt.rememberComposableLambda(0x104A025C, true, new z(s), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x92F91D5D, true, new a0(integer1), composer1, 54), function32, z2, function00, composer1, v2 & 0x380 | 54 | v2 & 0x1C00 | v2 & 0xE000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function31 = function32;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            integer1 = integer0;
            function31 = function30;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(integer1, s, function31, z1, function00, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BottomSheetItem(@DrawableRes @Nullable Integer integer0, @NotNull String s, boolean z, boolean z1, boolean z2, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        boolean z4;
        boolean z3;
        Integer integer1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0xCECDFCDB);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(integer0) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            integer1 = (v1 & 1) == 0 ? integer0 : null;
            boolean z5 = (v1 & 8) == 0 ? z1 : true;
            boolean z6 = (v1 & 16) == 0 ? z2 : true;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCECDFCDB, v2, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItem (TistoryComposeBottomSheet.kt:110)");
            }
            TistoryComposeBottomSheetKt.BottomSheetItem(ComposableLambdaKt.rememberComposableLambda(0x3F60207, true, new c0(s, z), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x48B1848, true, new d0(integer1), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x5202E89, true, new e0(z, z5), composer1, 54), z6, function00, composer1, v2 >> 3 & 0x1C00 | 438 | v2 >> 3 & 0xE000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z5;
            z4 = z6;
        }
        else {
            composer1.skipToGroupEnd();
            integer1 = integer0;
            z3 = z1;
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f0(integer1, s, z, z3, z4, function00, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomSheetItem(@NotNull Function3 function30, @Nullable Function3 function31, @Nullable Function3 function32, boolean z, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function0 function01;
        boolean z1;
        Function3 function34;
        Function3 function33;
        int v2;
        Intrinsics.checkNotNullParameter(function30, "text");
        Composer composer1 = composer0.startRestartGroup(-1807579062);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function33 = function31;
        }
        else if((v & 0x70) == 0) {
            function33 = function31;
            v2 |= (composer1.changedInstance(function33) ? 0x20 : 16);
        }
        else {
            function33 = function31;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function34 = function32;
        }
        else if((v & 0x380) == 0) {
            function34 = function32;
            v2 |= (composer1.changedInstance(function34) ? 0x100 : 0x80);
        }
        else {
            function34 = function32;
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
            function01 = function00;
        }
        else if((0xE000 & v) == 0) {
            function01 = function00;
            v2 |= (composer1.changedInstance(function01) ? 0x4000 : 0x2000);
        }
        else {
            function01 = function00;
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                function33 = null;
            }
            if((v1 & 4) != 0) {
                function34 = null;
            }
            if((v1 & 8) != 0) {
                z1 = true;
            }
            if((v1 & 16) != 0) {
                function01 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1807579062, v2, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItem (TistoryComposeBottomSheet.kt:58)");
            }
            TistoryComposeBottomSheetKt.BottomSheetItemSpace(function01, ComposableLambdaKt.rememberComposableLambda(0xE0DF88DF, true, new x(function33, function30, function34), composer1, 54), composer1, v2 >> 12 & 14 | 0x30, 0);
            if(z1) {
                TistoryComposeBottomSheetKt.BottomSheetItemDivider(composer1, 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(function30, function33, function34, z1, function01, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BottomSheetItemCheckBox(boolean z, boolean z1, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(506450102);
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
            v2 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                z1 = true;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(506450102, v2, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItemCheckBox (TistoryComposeBottomSheet.kt:174)");
            }
            if(z || z1) {
                Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 24.0f);
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource((z ? drawable.ic_list_check : drawable.ic_check_blank), composer1, 0), null, null, 0L, composer1, 0xC38, 4);
                composer1.endNode();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(z, z1, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BottomSheetItemDivider(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x1B7CA406);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1B7CA406, v, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItemDivider (TistoryComposeBottomSheet.kt:187)");
            }
            DividerKt.HorizontalDivider-9IZ8Weo(null, 1.0f, TColor.INSTANCE.getDivide-0d7_KjU(), composer1, 0x1B0, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BottomSheetItemIcon(@DrawableRes int v, @Nullable Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x2F51EF77);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2F51EF77, v2, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItemIcon (TistoryComposeBottomSheet.kt:147)");
            }
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(v, composer1, v2 & 14), null, SizeKt.size-3ABfNKs(Modifier.Companion, 24.0f), 0L, composer1, 440, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomSheetItemSpace(@Nullable Function0 function00, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0x5606B9E8);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                function00 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5606B9E8, v2, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItemSpace (TistoryComposeBottomSheet.kt:132)");
            }
            Modifier modifier0 = Modifier.Companion;
            Modifier modifier1 = SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null);
            if(function00 != null) {
                modifier0 = ClickableKt.clickable-XHw0xAI$default(modifier0, false, null, null, function00, 7, null);
            }
            Modifier modifier2 = PaddingKt.padding-VpY3zN4(modifier1.then(modifier0), 20.0f, 14.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function30.invoke(RowScopeInstance.INSTANCE, composer1, ((int)(v2 & 0x70 | 6)));
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
            scopeUpdateScope0.updateScope(new j0(function00, function30, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BottomSheetItemText(@NotNull String s, @Nullable Modifier modifier0, boolean z, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "text");
        Composer composer1 = composer0.startRestartGroup(0x1CCC0CA);
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
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            boolean z2 = (v1 & 4) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1CCC0CA, v2, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItemText (TistoryComposeBottomSheet.kt:160)");
            }
            TextKt.Text--4IGK_g(s, modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141800000L, (z2 ? FontWeight.Companion.getMedium() : FontWeight.Companion.getNormal()), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null), composer1, v2 & 0x7E, 0, 0xFFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(s, modifier1, z1, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TistoryComposeBottomSheet(boolean z, @NotNull Function0 function00, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onDismissRequest");
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0xD900D7CB);
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
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            boolean z2 = (v1 & 1) == 0 ? z : true;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD900D7CB, v2, -1, "com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheet (TistoryComposeBottomSheet.kt:27)");
            }
            float f = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composer1, 8), composer1, 0).calculateTopPadding-D9Ej5fM();
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(12.0f, 12.0f, 0.0f, 0.0f, 12, null);
            long v3 = Color.copy-wmQWz5c$default(0L, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            ModalBottomSheetProperties modalBottomSheetProperties0 = new ModalBottomSheetProperties(z2);
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, f, 0.0f, 0.0f, 13, null);
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-1368513240, true, new m0(function30), composer1, 54);
            ModalBottomSheetKt.ModalBottomSheet-dYc4hso(function00, modifier0, null, 0.0f, roundedCornerShape0, 0L, 0L, 0.0f, v3, ComposableSingletons.TistoryComposeBottomSheetKt.INSTANCE.getLambda-1$presentation_prodRelease(), l0.a, modalBottomSheetProperties0, composableLambda0, composer1, v2 >> 3 & 14 | 0x361B0000, 0x180, 140);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n0(z1, function00, function30, v, v1));
        }
    }
}

