package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f¢\u0006\u0002\b\u000Fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0019\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\r2\b\b\u0002\u0010\u0016\u001A\u00020\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001AR*\u0010#\u001A\u0004\u0018\u00010\u001B8\u0000@\u0000X\u0081\u000E¢\u0006\u0018\n\u0004\b\u001C\u0010\u001D\u0012\u0004\b\"\u0010\u0003\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/vector/DrawCache;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "Landroidx/compose/ui/unit/IntSize;", "size", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "drawCachedImage-FqjB98A", "(IJLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)V", "drawCachedImage", "target", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "drawInto", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "a", "Landroidx/compose/ui/graphics/ImageBitmap;", "getMCachedImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setMCachedImage", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "getMCachedImage$annotations", "mCachedImage", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,113:1\n546#2,17:114\n42#3,7:131\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n82#1:114,17\n98#1:131,7\n*E\n"})
public final class DrawCache {
    public static final int $stable = 8;
    public ImageBitmap a;
    public Canvas b;
    public Density c;
    public long d;
    public int e;
    public final CanvasDrawScope f;

    public DrawCache() {
        this.d = 0L;
        this.e = 0;
        this.f = new CanvasDrawScope();
    }

    public final void drawCachedImage-FqjB98A(int v, long v1, @NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull Function1 function10) {
        this.c = density0;
        ImageBitmap imageBitmap0 = this.a;
        Canvas canvas0 = this.b;
        if(imageBitmap0 == null || canvas0 == null || IntSize.getWidth-impl(v1) > imageBitmap0.getWidth() || IntSize.getHeight-impl(v1) > imageBitmap0.getHeight() || !ImageBitmapConfig.equals-impl0(this.e, v)) {
            imageBitmap0 = ImageBitmapKt.ImageBitmap-x__-hDU$default(IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), v, false, null, 24, null);
            canvas0 = CanvasKt.Canvas(imageBitmap0);
            this.a = imageBitmap0;
            this.b = canvas0;
            this.e = v;
        }
        this.d = v1;
        DrawParams canvasDrawScope$DrawParams0 = this.f.getDrawParams();
        DrawParams canvasDrawScope$DrawParams1 = this.f.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(density0);
        canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
        canvasDrawScope$DrawParams1.setCanvas(canvas0);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(IntSizeKt.toSize-ozmzZPI(v1));
        canvas0.save();
        DrawScope.drawRect-n-J9OG0$default(this.f, 0xFF00000000000000L, 0L, 0L, 0.0f, null, null, 0, 62, null);
        function10.invoke(this.f);
        canvas0.restore();
        DrawParams canvasDrawScope$DrawParams2 = this.f.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
        canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
        canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
        imageBitmap0.prepareToDraw();
    }

    public final void drawInto(@NotNull DrawScope drawScope0, float f, @Nullable ColorFilter colorFilter0) {
        ImageBitmap imageBitmap0 = this.a;
        if(imageBitmap0 == null) {
            InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.drawImage-AZ2fEMs$default(drawScope0, imageBitmap0, 0L, this.d, 0L, 0L, f, null, colorFilter0, 0, 0, 858, null);
    }

    public static void drawInto$default(DrawCache drawCache0, DrawScope drawScope0, float f, ColorFilter colorFilter0, int v, Object object0) {
        if((v & 2) != 0) {
            f = 1.0f;
        }
        if((v & 4) != 0) {
            colorFilter0 = null;
        }
        drawCache0.drawInto(drawScope0, f, colorFilter0);
    }

    @Nullable
    public final ImageBitmap getMCachedImage() {
        return this.a;
    }

    @PublishedApi
    public static void getMCachedImage$annotations() {
    }

    public final void setMCachedImage(@Nullable ImageBitmap imageBitmap0) {
        this.a = imageBitmap0;
    }
}

