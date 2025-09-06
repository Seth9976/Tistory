package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.ColorResources_androidKt;
import coil.compose.SingletonAsyncImagePainterKt;
import com.kakao.tistory.presentation.R.color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AK\u0010\r\u001A\u00020\f2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000E\"\u0017\u0010\u0014\u001A\u00020\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "url", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "CommonImage", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/ColorPainter;", "a", "Landroidx/compose/ui/graphics/painter/ColorPainter;", "getTransparentPainter", "()Landroidx/compose/ui/graphics/painter/ColorPainter;", "TransparentPainter", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class CommonImageKt {
    public static final ColorPainter a;

    static {
        CommonImageKt.a = new ColorPainter(Color.Companion.getTransparent-0d7_KjU(), null);
    }

    @Composable
    public static final void CommonImage(@Nullable Object object0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Painter painter0, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Painter painter1;
        Composer composer1 = composer0.startRestartGroup(1015074542);
        Modifier modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
        if((v1 & 8) == 0) {
            painter1 = painter0;
            v2 = v;
        }
        else {
            painter1 = new ColorPainter(ColorResources_androidKt.colorResource(color.color_d0d0d0, composer1, 0), null);
            v2 = v & 0xFFFFE3FF;
        }
        Alignment alignment1 = (v1 & 16) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v1 & 0x20) == 0 ? contentScale0 : ContentScale.Companion.getCrop();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1015074542, v2, -1, "com.kakao.tistory.presentation.widget.common.CommonImage (CommonImage.kt:22)");
        }
        ImageKt.Image(SingletonAsyncImagePainterKt.rememberAsyncImagePainter-HtA5bXE(object0, painter1, painter1, painter1, null, null, null, contentScale1, 0, null, composer1, v2 << 6 & 0x1C00000 | 4680, 880), s, modifier1, alignment1, contentScale1, 0.0f, null, composer1, v2 & 0x3F0 | v2 >> 3 & 0x1C00 | v2 >> 3 & 0xE000, 0x60);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(object0, s, modifier1, painter1, alignment1, contentScale1, v, v1));
        }
    }

    @NotNull
    public static final ColorPainter getTransparentPainter() {
        return CommonImageKt.a;
    }
}

