package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.widget.HighlightTextKt;
import com.kakao.tistory.presentation.widget.common.RestrictedTitleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\'\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"EntryTitle", "", "title", "", "isRestrict", "", "restrictType", "(Ljava/lang/String;ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryTitle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryTitle.kt\ncom/kakao/tistory/presentation/widget/entry/EntryTitleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,34:1\n95#2,2:35\n95#2,2:37\n*S KotlinDebug\n*F\n+ 1 EntryTitle.kt\ncom/kakao/tistory/presentation/widget/entry/EntryTitleKt\n*L\n18#1:35,2\n26#1:37,2\n*E\n"})
public final class EntryTitleKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryTitle(@NotNull String s, boolean z, @Nullable String s1, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(515496120);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(515496120, v1, -1, "com.kakao.tistory.presentation.widget.entry.EntryTitle (EntryTitle.kt:11)");
            }
            if(z) {
                composer1.startReplaceGroup(0xBB0A3E93);
                String s2 = StringExtensionKt.getStringExcludeBold(s);
                TextUnitKt.checkArithmetic--R2X_6o(0x13EB33333L);
                RestrictedTitleKt.RestrictedTitle-KgUXRuw(s2, s1, true, 0x1BEB33333L, MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH1(), 1, composer1, v1 >> 3 & 0x70 | 0x30180, 0);
            }
            else {
                composer1.startReplaceGroup(0xBB0E71C4);
                TextUnitKt.checkArithmetic--R2X_6o(0x13EB33333L);
                HighlightTextKt.HighlightText-fLXpl1I(s, null, 0L, 0L, null, null, null, 0x1BEB33333L, null, null, 0L, 2, false, 1, MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH1(), null, composer1, v1 & 14, 0xC30, 0x977E);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(s, z, s1, v));
        }
    }
}

