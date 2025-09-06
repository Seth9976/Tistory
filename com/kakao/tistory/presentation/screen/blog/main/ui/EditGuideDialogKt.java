package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A\u001F\u0010\u0003\u001A\u00020\u00012\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "EditGuideDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditGuideDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditGuideDialog.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/EditGuideDialogKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,135:1\n148#2,11:136\n*S KotlinDebug\n*F\n+ 1 EditGuideDialog.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/EditGuideDialogKt\n*L\n122#1:136,11\n*E\n"})
public final class EditGuideDialogKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EditGuideDialog(@Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xDE74B58F);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                function00 = n4.a;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDE74B58F, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.EditGuideDialog (EditGuideDialog.kt:35)");
            }
            AndroidDialog_androidKt.Dialog(function00, new DialogProperties(false, false, false, 7, null), ComposableLambdaKt.rememberComposableLambda(509359782, true, new o4(function00), composer1, 54), composer1, v2 & 14 | 0x1B0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p4(function00, v, v1));
        }
    }

    public static final void access$ConfirmButton(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-643212505);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-643212505, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ConfirmButton (EditGuideDialog.kt:112)");
            }
            RoundButtonKt.RoundButton(function00, null, new ButtonColors(0L, 0L, 0L, 0L, 0L, 0L, 56, null), null, null, null, false, null, PaddingKt.PaddingValues-YgX7TsA(40.0f, 11.5f), ComposableSingletons.EditGuideDialogKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 & 14 | 0x36000180, 0xFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m4(function00, v));
        }
    }

    public static final void access$EditGuideDialogPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2000538113);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000538113, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.EditGuideDialogPreview (EditGuideDialog.kt:28)");
            }
            EditGuideDialogKt.EditGuideDialog(null, composer1, 0, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q4(v));
        }
    }

    public static final void access$Message(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1473475550);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473475550, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Message (EditGuideDialog.kt:95)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_blog_guide_message, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141600000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0x141A80000L, null, null, null, 0, 0, null, 0xFD7FD9, null), composer1, 0x180, 0, 0xFFFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r4(v));
        }
    }

    public static final void access$Title(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(103043569);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(103043569, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Title (EditGuideDialog.kt:80)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_blog_guide_title, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141600000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0x141A80000L, null, null, null, 0, 0, null, 0xFD7FD9, null), composer1, 0x180, 0, 0xFFFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s4(v));
        }
    }
}

