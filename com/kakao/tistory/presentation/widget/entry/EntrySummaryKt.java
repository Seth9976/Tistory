package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.common.RestrictType;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.HighlightTextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\'\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"EntrySummary", "", "summary", "", "restrictType", "isMine", "", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntrySummary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntrySummary.kt\ncom/kakao/tistory/presentation/widget/entry/EntrySummaryKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,44:1\n148#2:45\n95#3,2:46\n*S KotlinDebug\n*F\n+ 1 EntrySummary.kt\ncom/kakao/tistory/presentation/widget/entry/EntrySummaryKt\n*L\n35#1:45\n38#1:46,2\n*E\n"})
public final class EntrySummaryKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntrySummary(@NotNull String s, @Nullable String s1, boolean z, @Nullable Composer composer0, int v) {
        String s2;
        Intrinsics.checkNotNullParameter(s, "summary");
        Composer composer1 = composer0.startRestartGroup(0x4AE9E5F0);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4AE9E5F0, v1, -1, "com.kakao.tistory.presentation.widget.entry.EntrySummary (EntrySummary.kt:15)");
            }
            if(!z) {
                RestrictType restrictType0 = RestrictType.ADMIN_DELETE;
                if(Intrinsics.areEqual(s1, "del")) {
                    composer1.startReplaceGroup(0x5E9AF8B0);
                    s2 = StringResources_androidKt.stringResource(restrictType0.getEntryMessageStringId(), composer1, 6);
                    composer1.endReplaceGroup();
                }
                else {
                    RestrictType restrictType1 = RestrictType.TEMPORARY;
                    if(Intrinsics.areEqual(s1, "tmp")) {
                        composer1.startReplaceGroup(1587365203);
                        s2 = StringResources_androidKt.stringResource(restrictType1.getEntryMessageStringId(), composer1, 6);
                        composer1.endReplaceGroup();
                    }
                    else {
                        composer1.startReplaceGroup(0x5E9F2367);
                        composer1.endReplaceGroup();
                        s2 = s;
                    }
                }
                if(s2.length() > 0) {
                    Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 7.0f, 0.0f, 0.0f, 13, null);
                    TextUnitKt.checkArithmetic--R2X_6o(5340187853L);
                    HighlightTextKt.HighlightText-fLXpl1I(s2, modifier0, 0L, 0L, null, null, null, 7487671501L, null, null, 0L, 2, false, 2, TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), null, composer1, 0x30, 0xC30, 38780);
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(s, s1, z, v));
        }
    }
}

