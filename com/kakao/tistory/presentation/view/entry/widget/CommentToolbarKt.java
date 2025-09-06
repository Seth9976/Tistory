package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.BackBlack;
import com.kakao.tistory.presentation.widget.common.TistoryToolbarKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A;\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"CommentToolbar", "", "title", "", "count", "", "showTitle", "", "showDivider", "onClickBack", "Lkotlin/Function0;", "(Ljava/lang/String;JZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentToolbar.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentToolbarKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,37:1\n1240#2:38\n1039#2,6:39\n*S KotlinDebug\n*F\n+ 1 CommentToolbar.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentToolbarKt\n*L\n21#1:38\n24#1:39,6\n*E\n"})
public final class CommentToolbarKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommentToolbar(@NotNull String s, long v, boolean z, boolean z1, @NotNull Function0 function00, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClickBack");
        Composer composer1 = composer0.startRestartGroup(0x2DE05F5E);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 0xE000) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2DE05F5E, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentToolbar (CommentToolbar.kt:19)");
            }
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            annotatedString$Builder0.append(s);
            if(v > 0L) {
                int v3 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, null, 0xFFDB, null));
                try {
                    annotatedString$Builder0.append(" " + StringExtensionKt.toFormattedString(v, 6));
                }
                finally {
                    annotatedString$Builder0.pop(v3);
                }
            }
            TistoryToolbarKt.TistoryToolbar(annotatedString$Builder0.toAnnotatedString(), z, z1, BackBlack.INSTANCE, function00, null, null, null, composer1, v2 >> 3 & 0x380 | (v2 >> 3 & 0x70 | 0xC00) | v2 & 0xE000, 0xE0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h1(s, v, z, z1, function00, v1));
        }
    }
}

