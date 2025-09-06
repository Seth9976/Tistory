package com.kakao.tistory.presentation.view.signup.widget;

import androidx.annotation.StringRes;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A!\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"SignUpTitle", "", "modifier", "Landroidx/compose/ui/Modifier;", "titleResId", "", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignUpTitle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpTitle.kt\ncom/kakao/tistory/presentation/view/signup/widget/SignUpTitleKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,29:1\n158#2:30\n95#3,2:31\n*S KotlinDebug\n*F\n+ 1 SignUpTitle.kt\ncom/kakao/tistory/presentation/view/signup/widget/SignUpTitleKt\n*L\n19#1:30\n23#1:31,2\n*E\n"})
public final class SignUpTitleKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SignUpTitle(@Nullable Modifier modifier0, @StringRes int v, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(1757709861);
        if((v2 & 1) != 0) {
            v3 = v1 | 6;
            modifier1 = modifier0;
        }
        else if((v1 & 14) == 0) {
            modifier1 = modifier0;
            v3 = (composer1.changed(modifier1) ? 4 : 2) | v1;
        }
        else {
            modifier1 = modifier0;
            v3 = v1;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v2 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757709861, v3, -1, "com.kakao.tistory.presentation.view.signup.widget.SignUpTitle (SignUpTitle.kt:16)");
            }
            Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(modifier2, 0.0f, 10.5f, 0.0f, 0.0f, 13, null);
            String s = StringResources_androidKt.stringResource(v, composer1, v3 >> 3 & 14);
            TextUnitKt.checkArithmetic--R2X_6o(0x13F000000L);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier3, ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0x142000000L, null, FontWeight.Companion.getSemiBold(), TypeKt.getTFont(), 0x1BF000000L, null, null, 0x1421C0000L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0xC06, 0x3DB10);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(modifier1, v, v1, v2));
        }
    }
}

