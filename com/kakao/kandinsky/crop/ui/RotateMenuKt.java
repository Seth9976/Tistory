package com.kakao.kandinsky.crop.ui;

import androidx.compose.material3.j6;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.kandinsky.designsystem.common.MenuListKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import z9.l;
import z9.m;
import z9.n;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AW\u0010\u0000\u001A\u00020\u00012#\b\u0002\u0010\u0002\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u00032#\b\u0002\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"RotateMenu", "", "onClickRotate", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/crop/contract/RotateType;", "Lkotlin/ParameterName;", "name", "direct", "onClickFlip", "Lcom/kakao/kandinsky/crop/contract/FlipType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "crop_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class RotateMenuKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RotateMenu(@Nullable Function1 function10, @Nullable Function1 function11, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xF516D208);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function10) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function11) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                function10 = l.w;
            }
            if((v1 & 2) != 0) {
                function11 = m.w;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF516D208, v2, -1, "com.kakao.kandinsky.crop.ui.RotateMenu (RotateMenu.kt:14)");
            }
            MenuListKt.MenuList(null, null, ComposableLambdaKt.rememberComposableLambda(-1426218020, true, new n(function10, function11), composer1, 54), composer1, 0x180, 3);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j6(function10, function11, v, v1));
        }
    }
}

