package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.screen.home.ui.common.PlaceHolderKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A<\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"EntryThumbnail", "", "thumbnail", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "modifier", "Landroidx/compose/ui/Modifier;", "width", "Landroidx/compose/ui/unit/Dp;", "dimColor", "Landroidx/compose/ui/graphics/Color;", "EntryThumbnail-T-dY9a0", "(Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryThumbnail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryThumbnail.kt\ncom/kakao/tistory/presentation/design/ui/thumbnail/EntryThumbnailKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,45:1\n77#2:46\n148#3:47\n1223#4,6:48\n*S KotlinDebug\n*F\n+ 1 EntryThumbnail.kt\ncom/kakao/tistory/presentation/design/ui/thumbnail/EntryThumbnailKt\n*L\n24#1:46\n32#1:47\n34#1:48,6\n*E\n"})
public final class EntryThumbnailKt {
    @Composable
    public static final void EntryThumbnail-T-dY9a0(@NotNull ThumbnailUiState thumbnailUiState0, @Nullable Modifier modifier0, @Nullable Dp dp0, @Nullable Color color0, @Nullable Composer composer0, int v, int v1) {
        Color color1;
        Dp dp1;
        Modifier modifier1;
        Modifier modifier4;
        int v2;
        Intrinsics.checkNotNullParameter(thumbnailUiState0, "thumbnail");
        Composer composer1 = composer0.startRestartGroup(0xE2FB06C7);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(thumbnailUiState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(dp0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(color0) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            Dp dp2 = (v1 & 4) == 0 ? dp0 : null;
            Color color2 = (v1 & 8) == 0 ? color0 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE2FB06C7, v2, -1, "com.kakao.tistory.presentation.design.ui.thumbnail.EntryThumbnail (EntryThumbnail.kt:22)");
            }
            boolean z = ((Boolean)composer1.consume(SlotContainerKt.getLocalLoadingState())).booleanValue();
            String s = thumbnailUiState0.getThumbnail-rCkNIVA(dp2, composer1, v2 >> 6 & 14 | v2 << 3 & 0x70);
            Modifier modifier2 = dp2 == null ? Modifier.Companion : SizeKt.width-3ABfNKs(Modifier.Companion, dp2.unbox-impl());
            Modifier modifier3 = ClipKt.clip(AspectRatioKt.aspectRatio$default(modifier1.then(modifier2), 1.5f, false, 2, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f));
            composer1.startReplaceGroup(2052643462);
            if(color2 == null || z) {
                modifier4 = Modifier.Companion;
            }
            else {
                Companion modifier$Companion0 = Modifier.Companion;
                composer1.startReplaceGroup(2052645478);
                e e0 = composer1.rememberedValue();
                if((v2 & 0x1C00) == 0x800 || e0 == Composer.Companion.getEmpty()) {
                    e0 = new e(color2);
                    composer1.updateRememberedValue(e0);
                }
                composer1.endReplaceGroup();
                modifier4 = DrawModifierKt.drawWithContent(modifier$Companion0, e0);
            }
            composer1.endReplaceGroup();
            color1 = color2;
            CommonImageKt.CommonImage(s, null, PlaceHolderKt.placeholder(modifier3.then(modifier4), composer1, 0), null, null, null, composer1, 0x30, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dp1 = dp2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            dp1 = dp0;
            color1 = color0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(thumbnailUiState0, modifier1, dp1, color1, v, v1));
        }
    }
}

