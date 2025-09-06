package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006\u001A\u0012\u0010\u0007\u001A\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001A\u00020\t\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DefaultCameraDistance", "", "drawLayer", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setOutline", "outline", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGraphicsLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,429:1\n256#2:430\n*S KotlinDebug\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n*L\n51#1:430\n*E\n"})
public final class GraphicsLayerKt {
    public static final float DefaultCameraDistance = 8.0f;

    public static final void drawLayer(@NotNull DrawScope drawScope0, @NotNull GraphicsLayer graphicsLayer0) {
        graphicsLayer0.draw$ui_graphics_release(drawScope0.getDrawContext().getCanvas(), drawScope0.getDrawContext().getGraphicsLayer());
    }

    public static final void setOutline(@NotNull GraphicsLayer graphicsLayer0, @NotNull Outline outline0) {
        if(outline0 instanceof Rectangle) {
            graphicsLayer0.setRectOutline-tz77jQw(OffsetKt.Offset(((Rectangle)outline0).getRect().getLeft(), ((Rectangle)outline0).getRect().getTop()), SizeKt.Size(((Rectangle)outline0).getRect().getWidth(), ((Rectangle)outline0).getRect().getHeight()));
            return;
        }
        if(outline0 instanceof Generic) {
            graphicsLayer0.setPathOutline(((Generic)outline0).getPath());
            return;
        }
        if(outline0 instanceof Rounded) {
            if(((Rounded)outline0).getRoundRectPath$ui_graphics_release() != null) {
                graphicsLayer0.setPathOutline(((Rounded)outline0).getRoundRectPath$ui_graphics_release());
                return;
            }
            RoundRect roundRect0 = ((Rounded)outline0).getRoundRect();
            graphicsLayer0.setRoundRectOutline-TNW_H78(OffsetKt.Offset(roundRect0.getLeft(), roundRect0.getTop()), SizeKt.Size(roundRect0.getWidth(), roundRect0.getHeight()), CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()));
        }
    }
}

