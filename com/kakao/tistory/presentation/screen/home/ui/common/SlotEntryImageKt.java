package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001AH\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"SlotEntryImage", "", "url", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "ratio", "", "dim", "", "SlotEntryImage-JEEbyFU", "(Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;FZLandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotEntryImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotEntryImage.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotEntryImageKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n77#2:69\n77#2:77\n148#3:70\n148#3:78\n1223#4,6:71\n*S KotlinDebug\n*F\n+ 1 SlotEntryImage.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotEntryImageKt\n*L\n28#1:69\n64#1:77\n29#1:70\n64#1:78\n46#1:71,6\n*E\n"})
public final class SlotEntryImageKt {
    @Composable
    public static final void SlotEntryImage-JEEbyFU(@Nullable ThumbnailUiState thumbnailUiState0, @Nullable Dp dp0, @Nullable Dp dp1, float f, boolean z, @Nullable Composer composer0, int v, int v1) {
        float f1;
        Dp dp3;
        Dp dp2;
        Modifier modifier1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x90667571);
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
            v2 |= (composer1.changed(dp0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(dp1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z1 = z;
        }
        else if((0xE000 & v) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        else {
            z1 = z;
        }
        BorderStroke borderStroke0 = null;
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            dp2 = (v1 & 2) == 0 ? dp0 : null;
            Dp dp4 = (v1 & 4) == 0 ? dp1 : null;
            float f2 = (v1 & 8) == 0 ? f : 1.5f;
            boolean z2 = (v1 & 16) == 0 ? z1 : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x90667571, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotEntryImage (SlotEntryImage.kt:26)");
            }
            boolean z3 = ((Boolean)composer1.consume(SlotContainerKt.getLocalLoadingState())).booleanValue();
            Modifier modifier0 = Modifier.Companion;
            if(dp2 == null || dp4 == null) {
                modifier1 = dp2 == null ? AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null), f2, false, 2, null) : AspectRatioKt.aspectRatio$default(SizeKt.width-3ABfNKs(modifier0, dp2.unbox-impl()), f2, false, 2, null);
            }
            else {
                modifier1 = SizeKt.size-VpY3zN4(modifier0, dp2.unbox-impl(), dp4.unbox-impl());
            }
            Modifier modifier2 = ((Companion)modifier0).then(modifier1);
            composer1.startReplaceGroup(0x482FA5E);
            if(z2 && !z3) {
                composer1.startReplaceGroup(0x48300AF);
                y y0 = composer1.rememberedValue();
                if(y0 == Composer.Companion.getEmpty()) {
                    y0 = new y(8.0f);
                    composer1.updateRememberedValue(y0);
                }
                composer1.endReplaceGroup();
                modifier0 = DrawModifierKt.drawWithContent(modifier0, y0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = modifier2.then(modifier0);
            composer1.startReplaceGroup(75705726);
            String s = thumbnailUiState0 == null ? null : thumbnailUiState0.getThumbnail-rCkNIVA(dp2, composer1, v2 >> 3 & 14 | v2 << 3 & 0x70);
            composer1.endReplaceGroup();
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f);
            if(!((Boolean)composer1.consume(SlotContainerKt.getLocalLoadingState())).booleanValue()) {
                borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, Color.copy-wmQWz5c$default(0L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
            }
            CommonImageKt.CommonImage(s, null, PlaceHolderKt.placeholder(ModifierKt.shape-8ww4TTg$default(modifier3, roundedCornerShape0, 0L, borderStroke0, 0.0f, 10, null), composer1, 0), null, null, null, composer1, 0x30, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            dp3 = dp4;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            dp2 = dp0;
            dp3 = dp1;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(thumbnailUiState0, dp2, dp3, f1, z1, v, v1));
        }
    }
}

