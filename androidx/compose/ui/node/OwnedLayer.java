package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\u001A\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH&J\b\u0010\t\u001A\u00020\u0003H&J\u001A\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0010H&J\"\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u001A\u001A\u00020\u00122\u0006\u0010\u0018\u001A\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001D\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00020\u001EH&ø\u0001\u0000¢\u0006\u0004\b\u001F\u0010 J\u001A\u0010!\u001A\u00020\u00032\u0006\u0010\"\u001A\u00020#H&ø\u0001\u0000¢\u0006\u0004\b$\u0010 JP\u0010%\u001A\u00020\u000328\u0010&\u001A4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\'2\f\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00030+H&J\u001A\u0010,\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b-\u0010\u000EJ\b\u0010.\u001A\u00020\u0003H&J\u0010\u0010/\u001A\u00020\u00032\u0006\u00100\u001A\u000201H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u00062À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "", "destroy", "", "drawLayer", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "parentLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "invalidate", "inverseTransform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "inverseTransform-58bKbWc", "([F)V", "isInLayer", "", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "drawBlock", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "invalidateParentLayer", "Lkotlin/Function0;", "transform", "transform-58bKbWc", "updateDisplayList", "updateLayerProperties", "scope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface OwnedLayer {
    void destroy();

    void drawLayer(@NotNull Canvas arg1, @Nullable GraphicsLayer arg2);

    void invalidate();

    void inverseTransform-58bKbWc(@NotNull float[] arg1);

    boolean isInLayer-k-4lQ0M(long arg1);

    void mapBounds(@NotNull MutableRect arg1, boolean arg2);

    long mapOffset-8S9VItk(long arg1, boolean arg2);

    void move--gyyYBs(long arg1);

    void resize-ozmzZPI(long arg1);

    void reuseLayer(@NotNull Function2 arg1, @NotNull Function0 arg2);

    void transform-58bKbWc(@NotNull float[] arg1);

    void updateDisplayList();

    void updateLayerProperties(@NotNull ReusableGraphicsLayerScope arg1);
}

