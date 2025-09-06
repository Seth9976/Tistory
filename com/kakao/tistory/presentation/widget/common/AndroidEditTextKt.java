package com.kakao.tistory.presentation.widget.common;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.kakao.tistory.presentation.R.color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001At\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\n\b\u0003\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001A\u00020\u00052\b\b\u0003\u0010\u0007\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u00052\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000E2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"AndroidEditText", "", "text", "", "hintRes", "", "textColor", "hintColor", "fontSize", "", "imeOptions", "builder", "Lkotlin/Function1;", "Landroid/widget/TextView;", "Lkotlin/ExtensionFunctionType;", "update", "(Ljava/lang/String;Ljava/lang/Integer;IIFILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidEditText.kt\ncom/kakao/tistory/presentation/widget/common/AndroidEditTextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,47:1\n1223#2,6:48\n1223#2,6:54\n*S KotlinDebug\n*F\n+ 1 AndroidEditText.kt\ncom/kakao/tistory/presentation/widget/common/AndroidEditTextKt\n*L\n26#1:48,6\n46#1:54,6\n*E\n"})
public final class AndroidEditTextKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void AndroidEditText(@NotNull String s, @StringRes @Nullable Integer integer0, @ColorRes int v, @ColorRes int v1, float f, int v2, @NotNull Function1 function10, @NotNull Function1 function11, @Nullable Composer composer0, int v3, int v4) {
        int v12;
        int v11;
        int v10;
        Integer integer2;
        int v18;
        int v17;
        int v16;
        int v13;
        int v9;
        int v8;
        int v7;
        int v6;
        Integer integer1;
        int v5;
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(function10, "builder");
        Intrinsics.checkNotNullParameter(function11, "update");
        Composer composer1 = composer0.startRestartGroup(1466053332);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            integer1 = integer0;
        }
        else if((v3 & 0x70) == 0) {
            integer1 = integer0;
            v5 |= (composer1.changed(integer1) ? 0x20 : 16);
        }
        else {
            integer1 = integer0;
        }
        if((v3 & 0x380) == 0) {
            if((v4 & 4) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v;
                v7 = 0x80;
            }
            v5 |= v7;
        }
        else {
            v6 = v;
        }
        if((v3 & 0x1C00) == 0) {
            if((v4 & 8) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x800 : 0x400;
            }
            else {
                v8 = v1;
                v9 = 0x400;
            }
            v5 |= v9;
        }
        else {
            v8 = v1;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            v5 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x70000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v5 |= (composer1.changedInstance(function11) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v5) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v4 & 2) != 0) {
                    integer1 = null;
                }
                if((v4 & 4) != 0) {
                    v5 &= -897;
                    v6 = color.gray1;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                    v8 = color.gray9;
                }
                v13 = (v4 & 0x20) == 0 ? v2 : 5;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                v13 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466053332, v5, -1, "com.kakao.tistory.presentation.widget.common.AndroidEditText (AndroidEditText.kt:24)");
            }
            composer1.startReplaceGroup(0x676AE09F);
            boolean z = true;
            int v14 = ((v5 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v6)) && (v5 & 0x180) != 0x100 ? 0 : 1;
            int v15 = ((v5 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(v8)) && (v5 & 0xC00) != 0x800 ? 0 : 1;
            a a0 = composer1.rememberedValue();
            if((((v5 & 14) == 4 ? 1 : 0) | ((v5 & 0x70) == 0x20 ? 1 : 0) | v14 | v15 | ((v5 & 0xE000) == 0x4000 ? 1 : 0) | ((v5 & 0x70000) == 0x20000 ? 1 : 0) | ((v5 & 0x380000) == 0x100000 ? 1 : 0)) != 0 || a0 == Composer.Companion.getEmpty()) {
                v16 = v5;
                v17 = v8;
                v18 = v6;
                a a1 = new a(s, integer1, v6, v8, f, v13, function10);
                composer1.updateRememberedValue(a1);
                a0 = a1;
            }
            else {
                v16 = v5;
                v17 = v8;
                v18 = v6;
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x676B2F8D);
            if((v16 & 0x1C00000) != 0x800000) {
                z = false;
            }
            b b0 = composer1.rememberedValue();
            if(z || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(function11);
                composer1.updateRememberedValue(b0);
            }
            composer1.endReplaceGroup();
            AndroidView_androidKt.AndroidView(a0, null, b0, composer1, 0, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            integer2 = integer1;
            v12 = v17;
            v11 = v13;
            v10 = v18;
        }
        else {
            composer1.skipToGroupEnd();
            integer2 = integer1;
            v10 = v6;
            v11 = v2;
            v12 = v8;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(s, integer2, v10, v12, f, v11, function10, function11, v3, v4));
        }
    }
}

