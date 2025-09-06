package com.kakao.tistory.presentation.widget.dialog;

import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001B\u0010\b\u001A\u00020\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\u0006Jl\u0010\u0017\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t2\b\b\u0003\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2#\b\u0002\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u00102\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jz\u0010\u001B\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0019\u001A\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001A\u001A\u00020\u000E2#\b\u0002\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u00102\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/widget/dialog/DialogFactory;", "", "Lkotlin/Function0;", "", "dismiss", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "function", "withoutDialog", "", "title", "message", "", "rightButton", "", "isCanceledOnTouchOutside", "Lkotlin/Function1;", "Lcom/kakao/tistory/presentation/widget/dialog/DialogButton;", "Lkotlin/ParameterName;", "name", "button", "callback", "cancelCallback", "ShowOk", "(Ljava/lang/String;Ljava/lang/String;IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "leftButton", "rightButtonColorEnabled", "ShowOkCancel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "a", "Lkotlin/jvm/functions/Function0;", "getDismiss", "()Lkotlin/jvm/functions/Function0;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryComposeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryComposeDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/DialogFactory\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,320:1\n1223#2,6:321\n1223#2,6:327\n*S KotlinDebug\n*F\n+ 1 TistoryComposeDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/DialogFactory\n*L\n81#1:321,6\n98#1:327,6\n*E\n"})
public final class DialogFactory {
    public static final int $stable;
    public final Function0 a;

    public DialogFactory(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "dismiss");
        super();
        this.a = function00;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void ShowOk(@NotNull String s, @Nullable String s1, @StringRes int v, boolean z, @Nullable Function1 function10, @Nullable Function0 function00, @Nullable Composer composer0, int v1, int v2) {
        String s2;
        String s3;
        int v6;
        Function0 function01;
        Function1 function11;
        boolean z1;
        int v5;
        int v4;
        int v3;
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(-286429905);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            if((v2 & 4) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x100 : 0x80;
            }
            else {
                v4 = v;
                v5 = 0x80;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v1 & 0x1C00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            function11 = function10;
        }
        else if((0xE000 & v1) == 0) {
            function11 = function10;
            v3 |= (composer1.changedInstance(function11) ? 0x4000 : 0x2000);
        }
        else {
            function11 = function10;
        }
        if((v1 & 0x70000) == 0) {
            if((v2 & 0x20) == 0) {
                function01 = function00;
                v6 = composer1.changedInstance(function01) ? 0x20000 : 0x10000;
            }
            else {
                function01 = function00;
                v6 = 0x10000;
            }
            v3 |= v6;
        }
        else {
            function01 = function00;
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v3 |= (composer1.changed(this) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                s3 = (v2 & 2) == 0 ? s1 : null;
                if((v2 & 4) != 0) {
                    v3 &= -897;
                    v4 = string.label_dialog_ok;
                }
                if((v2 & 8) != 0) {
                    z1 = true;
                }
                if((v2 & 16) != 0) {
                    function11 = o.a;
                }
                if((v2 & 0x20) != 0) {
                    v3 &= 0xFFF8FFFF;
                    function01 = this.a;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                if((v2 & 0x20) != 0) {
                    v3 &= 0xFFF8FFFF;
                }
                s3 = s1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-286429905, v3, -1, "com.kakao.tistory.presentation.widget.dialog.DialogFactory.ShowOk (TistoryComposeDialog.kt:78)");
            }
            composer1.startReplaceGroup(0x8FCACF83);
            boolean z2 = (0x70000 & v3 ^ 0x30000) > 0x20000 && composer1.changed(function01) || (v3 & 0x30000) == 0x20000;
            p p0 = composer1.rememberedValue();
            if(z2 || p0 == Composer.Companion.getEmpty()) {
                p0 = new p(function01);
                composer1.updateRememberedValue(p0);
            }
            composer1.endReplaceGroup();
            AndroidDialog_androidKt.Dialog(p0, new DialogProperties(false, z1, false, 5, null), ComposableLambdaKt.rememberComposableLambda(0x8DD49E06, true, new q(s, s3, v4, function11), composer1, 54), composer1, 0x180, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            s2 = s3;
        }
        else {
            composer1.skipToGroupEnd();
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(this, s, s2, v4, z1, function11, function01, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void ShowOkCancel(@NotNull String s, @Nullable String s1, @StringRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1, boolean z, @Nullable Function1 function10, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function1 function11;
        boolean z2;
        Integer integer5;
        Integer integer4;
        String s3;
        Function0 function01;
        Function0 function02;
        Function1 function12;
        boolean z1;
        Integer integer3;
        Integer integer2;
        String s2;
        int v2;
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(199308562);
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
            integer2 = integer0;
        }
        else if((v & 0x380) == 0) {
            integer2 = integer0;
            v2 |= (composer1.changed(integer2) ? 0x100 : 0x80);
        }
        else {
            integer2 = integer0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            integer3 = integer1;
        }
        else if((v & 0x1C00) == 0) {
            integer3 = integer1;
            v2 |= (composer1.changed(integer3) ? 0x800 : 0x400);
        }
        else {
            integer3 = integer1;
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
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changedInstance(function00) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v2 |= (composer1.changed(this) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            boolean z3 = false;
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    s2 = null;
                }
                if((v1 & 4) != 0) {
                    integer2 = null;
                }
                if((v1 & 8) != 0) {
                    integer3 = null;
                }
                if((v1 & 16) != 0) {
                    z1 = false;
                }
                function12 = (v1 & 0x20) == 0 ? function10 : s.a;
                if((v1 & 0x40) == 0) {
                    function02 = function00;
                }
                else {
                    function02 = this.a;
                    v2 &= 0xFFC7FFFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                function12 = function10;
                function02 = function00;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(199308562, v2, -1, "com.kakao.tistory.presentation.widget.dialog.DialogFactory.ShowOkCancel (TistoryComposeDialog.kt:96)");
            }
            composer1.startReplaceGroup(-610096931);
            if((v2 & 0x380000 ^ 0x180000) > 0x100000 && composer1.changed(function02) || (v2 & 0x180000) == 0x100000) {
                z3 = true;
            }
            t t0 = composer1.rememberedValue();
            if(z3 || t0 == Composer.Companion.getEmpty()) {
                t0 = new t(function02);
                composer1.updateRememberedValue(t0);
            }
            composer1.endReplaceGroup();
            AndroidDialog_androidKt.Dialog(t0, null, ComposableLambdaKt.rememberComposableLambda(0x639E8529, true, new u(s, s2, integer2, integer3, z1, function12), composer1, 54), composer1, 0x180, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
            s3 = s2;
            integer4 = integer2;
            integer5 = integer3;
            z2 = z1;
            function11 = function12;
        }
        else {
            composer1.skipToGroupEnd();
            function01 = function00;
            s3 = s2;
            integer4 = integer2;
            integer5 = integer3;
            z2 = z1;
            function11 = function10;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(this, s, s3, integer4, integer5, z2, function11, function01, v, v1));
        }
    }

    @NotNull
    public final Function0 getDismiss() {
        return this.a;
    }

    public final void withoutDialog(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        function00.invoke();
        this.a.invoke();
    }
}

