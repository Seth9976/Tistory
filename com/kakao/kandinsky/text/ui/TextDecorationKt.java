package com.kakao.kandinsky.text.ui;

import android.graphics.Matrix;
import androidx.compose.material3.e0;
import androidx.compose.material3.fc;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import bb.a;
import bb.b;
import com.kakao.kandinsky.core.kdphoto.Text;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.decoration.TextKt;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A@\u0010\u0000\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"TextDecoration", "", "textData", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "viewSize", "Landroidx/compose/ui/geometry/Size;", "TextDecoration-x_KDEd0", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;JLandroidx/compose/runtime/Composer;I)V", "status", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "displayMatrixValues", "Lcom/kakao/kandinsky/utils/MatrixValues;", "text", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "displayRect", "Landroidx/compose/ui/geometry/Rect;", "decorationController", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "TextDecoration-BRlu0J8", "(Lcom/kakao/kandinsky/decoration/DecorationStatus;Lkotlinx/collections/immutable/ImmutableList;Lcom/kakao/kandinsky/core/kdphoto/Text;Landroidx/compose/ui/geometry/Rect;Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;Landroidx/compose/runtime/Composer;I)V", "text_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TextDecorationKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextDecoration-BRlu0J8(@NotNull DecorationStatus decorationStatus0, @NotNull ImmutableList immutableList0, @NotNull Text text0, @NotNull Rect rect0, @NotNull DecorationControllerInterface decorationControllerInterface0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(decorationStatus0, "status");
        Intrinsics.checkNotNullParameter(immutableList0, "displayMatrixValues");
        Intrinsics.checkNotNullParameter(text0, "text");
        Intrinsics.checkNotNullParameter(rect0, "displayRect");
        Intrinsics.checkNotNullParameter(decorationControllerInterface0, "decorationController");
        Composer composer1 = composer0.startRestartGroup(0x276A4A4);
        int v1 = (v & 14) == 0 ? (composer1.changed(decorationStatus0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(immutableList0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(text0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(rect0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(decorationControllerInterface0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x276A4A4, v1, -1, "com.kakao.kandinsky.text.ui.TextDecoration (TextDecoration.kt:29)");
            }
            Matrix matrix0 = MatrixValues.toMatrix-impl(immutableList0);
            DecorationBoxKt.DecorationBox-vzil-yM(decorationStatus0, text0, text0.getSize-NH-jbRc(), rect0, MatrixExtensionKt.invert(matrix0), MatrixExtensionKt.buildMatrix(text0.getMatrix(), new b(matrix0, 0)), decorationControllerInterface0, ComposableLambdaKt.rememberComposableLambda(0x5AEAEA9A, true, new e0(text0, 3), composer1, 54), composer1, 0xC48000 | v1 & 14 | v1 >> 3 & 0x70 | v1 & 0x1C00 | v1 << 6 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fc(decorationStatus0, immutableList0, text0, rect0, decorationControllerInterface0, v, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextDecoration-x_KDEd0(@NotNull TextData textData0, long v, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(textData0, "textData");
        Composer composer1 = composer0.startRestartGroup(0x2998A0D5);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(textData0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2998A0D5, v2, -1, "com.kakao.kandinsky.text.ui.TextDecoration (TextDecoration.kt:16)");
            }
            TextKt.Text(textData0, Size.getWidth-impl(v) / Size.getWidth-impl(textData0.getBoundsSize-NH-jbRc()), null, composer1, v2 & 14, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, v1, 0, textData0));
        }
    }
}

