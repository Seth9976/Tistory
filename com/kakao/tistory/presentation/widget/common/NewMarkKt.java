package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.home.ui.common.PlaceHolderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A&\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "markSize", "", "NewMark-rAjV9yQ", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "NewMark", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNewMark.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewMark.kt\ncom/kakao/tistory/presentation/widget/common/NewMarkKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n148#2:36\n*S KotlinDebug\n*F\n+ 1 NewMark.kt\ncom/kakao/tistory/presentation/widget/common/NewMarkKt\n*L\n25#1:36\n*E\n"})
public final class NewMarkKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void NewMark-rAjV9yQ(@Nullable Modifier modifier0, float f, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1155059410);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if((v1 & 2) != 0) {
                f = 16.0f;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1155059410, v2, -1, "com.kakao.tistory.presentation.widget.common.NewMark (NewMark.kt:25)");
            }
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_new, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_new, composer1, 0), PlaceHolderKt.notVisibleWhenLoading(SizeKt.size-3ABfNKs(modifier0, f), composer1, 0), 0L, composer1, 3080, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q1(modifier0, f, v, v1));
        }
    }

    public static final void access$NewMarkPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x1B8F9A95);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1B8F9A95, v, -1, "com.kakao.tistory.presentation.widget.common.NewMarkPreview (NewMark.kt:17)");
            }
            NewMarkKt.NewMark-rAjV9yQ(null, 0.0f, composer1, 0, 3);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r1(v));
        }
    }
}

