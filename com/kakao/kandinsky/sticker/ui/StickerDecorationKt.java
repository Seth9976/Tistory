package com.kakao.kandinsky.sticker.ui;

import android.graphics.Matrix;
import androidx.compose.material3.fc;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import bb.b;
import com.kakao.kandinsky.core.kdphoto.Sticker;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ya.c;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A@\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"StickerDecoration", "", "status", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "displayMatrixValues", "Lcom/kakao/kandinsky/utils/MatrixValues;", "sticker", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "displayRect", "Landroidx/compose/ui/geometry/Rect;", "decorationController", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "StickerDecoration-BRlu0J8", "(Lcom/kakao/kandinsky/decoration/DecorationStatus;Lkotlinx/collections/immutable/ImmutableList;Lcom/kakao/kandinsky/core/kdphoto/Sticker;Landroidx/compose/ui/geometry/Rect;Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;Landroidx/compose/runtime/Composer;I)V", "sticker_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class StickerDecorationKt {
    @Composable
    public static final void StickerDecoration-BRlu0J8(@NotNull DecorationStatus decorationStatus0, @NotNull ImmutableList immutableList0, @NotNull Sticker sticker0, @NotNull Rect rect0, @NotNull DecorationControllerInterface decorationControllerInterface0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(decorationStatus0, "status");
        Intrinsics.checkNotNullParameter(immutableList0, "displayMatrixValues");
        Intrinsics.checkNotNullParameter(sticker0, "sticker");
        Intrinsics.checkNotNullParameter(rect0, "displayRect");
        Intrinsics.checkNotNullParameter(decorationControllerInterface0, "decorationController");
        Composer composer1 = composer0.startRestartGroup(-1562147450);
        int v1 = (v & 14) == 0 ? (composer1.changed(decorationStatus0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(immutableList0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(sticker0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(rect0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(decorationControllerInterface0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1562147450, v1, -1, "com.kakao.kandinsky.sticker.ui.StickerDecoration (StickerDecoration.kt:23)");
            }
            Matrix matrix0 = MatrixValues.toMatrix-impl(immutableList0);
            DecorationBoxKt.DecorationBox-vzil-yM(decorationStatus0, sticker0, sticker0.getSize-NH-jbRc(), rect0, MatrixExtensionKt.invert(matrix0), MatrixExtensionKt.buildMatrix(sticker0.getMatrix(), new b(matrix0, 4)), decorationControllerInterface0, ComposableLambdaKt.rememberComposableLambda(0x70008A7C, true, new c(sticker0), composer1, 54), composer1, 0xC48000 | v1 & 14 | v1 >> 3 & 0x70 | v1 & 0x1C00 | v1 << 6 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fc(decorationStatus0, immutableList0, sticker0, rect0, decorationControllerInterface0, v, 7));
        }
    }
}

