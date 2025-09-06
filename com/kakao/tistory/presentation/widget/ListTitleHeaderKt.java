package com.kakao.tistory.presentation.widget;

import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.theme.TypeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A!\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ListTitleHeader", "", "title", "", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "(ILandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListTitleHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTitleHeader.kt\ncom/kakao/tistory/presentation/widget/ListTitleHeaderKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,32:1\n95#2,2:33\n*S KotlinDebug\n*F\n+ 1 ListTitleHeader.kt\ncom/kakao/tistory/presentation/widget/ListTitleHeaderKt\n*L\n30#1:33,2\n*E\n"})
public final class ListTitleHeaderKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ListTitleHeader(@StringRes int v, @Nullable PaddingValues paddingValues0, @Nullable Composer composer0, int v1, int v2) {
        PaddingValues paddingValues1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x79C833A);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            paddingValues1 = paddingValues0;
        }
        else if((v1 & 0x70) == 0) {
            paddingValues1 = paddingValues0;
            v3 |= (composer1.changed(paddingValues1) ? 0x20 : 16);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            PaddingValues paddingValues2 = (v2 & 2) == 0 ? paddingValues1 : PaddingKt.PaddingValues-YgX7TsA$default(0.0f, 0.0f, 3, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x79C833A, v3, -1, "com.kakao.tistory.presentation.widget.ListTitleHeader (ListTitleHeader.kt:18)");
            }
            Modifier modifier0 = PaddingKt.padding(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), paddingValues2);
            String s = StringResources_androidKt.stringResource(v, composer1, v3 & 14);
            TextStyle textStyle0 = TypeKt.getPageTitle(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
            TextUnitKt.checkArithmetic--R2X_6o(0x13F000000L);
            TextKt.Text--4IGK_g(s, modifier0, 0L, 0L, null, null, null, 0x1BF000000L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFF7C);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(v, paddingValues1, v1, v2));
        }
    }
}

