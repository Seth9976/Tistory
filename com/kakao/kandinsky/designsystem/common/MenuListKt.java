package com.kakao.kandinsky.designsystem.common;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import ca.v1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A6\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0011\u0010\u0007\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollStable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "buttonContent", "MenuList", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMenuList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuList.kt\ncom/kakao/kandinsky/designsystem/common/MenuListKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,67:1\n158#2:68\n158#2:69\n*S KotlinDebug\n*F\n+ 1 MenuList.kt\ncom/kakao/kandinsky/designsystem/common/MenuListKt\n*L\n16#1:68\n17#1:69\n*E\n"})
public final class MenuListKt {
    public static final float a;
    public static final float b;

    static {
        MenuListKt.a = 8.5f;
        MenuListKt.b = 21.5f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void MenuList(@Nullable Modifier modifier0, @Nullable ScrollState scrollState0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(function20, "buttonContent");
        Composer composer1 = composer0.startRestartGroup(1402599901);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x70) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changed(scrollState0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) != 0) {
                    modifier0 = Modifier.Companion;
                }
                if((v1 & 2) != 0) {
                    scrollState0 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v2 &= 0xFFFFFF8F;
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
                ComposerKt.traceEventStart(1402599901, v2, -1, "com.kakao.kandinsky.designsystem.common.MenuList (MenuList.kt:23)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xFF194233, true, new v1(scrollState0, function20), composer1, 54);
            BoxWithConstraintsKt.BoxWithConstraints(modifier0, Alignment.Companion.getCenterStart(), false, composableLambda0, composer1, v2 & 14 | 0xC30, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(modifier0, scrollState0, function20, v, v1));
        }
    }

    public static final float access$getMaxSpaceAtTable$p() [...] // 潜在的解密器

    public static final float access$getMinSpace$p() [...] // 潜在的解密器
}

