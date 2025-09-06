package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AB\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000B\u001Ab\u0010\f\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001AP\u0010\u0014\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u001C2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\\\u0010\u0014\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010 2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"\u001A!\u0010#\u001A\u00020\u0001*\u00020\u00022\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u00010\bH\u0086\b\u001A.\u0010$\u001A\u00020\u0001*\u00020\u00022\u0006\u0010$\u001A\u00020\u000E2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u001A:\u0010$\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010%\u001A\u00020\u000E2\b\b\u0002\u0010&\u001A\u00020\u000E2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u001AF\u0010$\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u001AB\u0010\'\u001A\u00020\u0001*\u00020\u00022\u0006\u0010(\u001A\u00020\u000E2\b\b\u0002\u0010)\u001A\u00020*2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,\u001AB\u0010-\u001A\u00020\u0001*\u00020\u00022\u0006\u0010.\u001A\u00020\u000E2\b\b\u0002\u0010)\u001A\u00020*2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u0010,\u001AB\u00100\u001A\u00020\u0001*\u00020\u00022\u0006\u00100\u001A\u00020\u000E2\b\b\u0002\u0010)\u001A\u00020*2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u0010,\u001AJ\u00100\u001A\u00020\u0001*\u00020\u00022\u0006\u00102\u001A\u00020\u000E2\u0006\u00103\u001A\u00020\u000E2\b\b\u0002\u0010)\u001A\u00020*2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u00105\u001A:\u00106\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u001A?\u00107\u001A\u00020\u0001*\u00020\u00022\u0017\u00108\u001A\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\t2\u0017\u0010:\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006;"}, d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "draw", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "draw-ymL40Pk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "inset", "horizontal", "vertical", "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", "scale", "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1062:1\n68#1,7:1063\n272#1,14:1070\n272#1,14:1084\n272#1,14:1098\n272#1,14:1112\n272#1,14:1126\n272#1,14:1140\n329#1,26:1154\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n112#1:1063,7\n151#1:1070,14\n168#1:1084,14\n189#1:1098,14\n206#1:1112,14\n232#1:1126,14\n248#1:1140,14\n298#1:1154,26\n*E\n"})
public final class DrawScopeKt {
    public static final void clipPath-KD09W0M(@NotNull DrawScope drawScope0, @NotNull Path path0, int v, @NotNull Function1 function10) {
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().clipPath-mtrdD-E(path0, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v1, 1);
        }
    }

    public static void clipPath-KD09W0M$default(DrawScope drawScope0, Path path0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 1;
        }
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().clipPath-mtrdD-E(path0, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v2, 1);
        }
    }

    public static final void clipRect-rOu3jXo(@NotNull DrawScope drawScope0, float f, float f1, float f2, float f3, int v, @NotNull Function1 function10) {
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().clipRect-N_I0leg(f, f1, f2, f3, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v1, 1);
        }
    }

    public static void clipRect-rOu3jXo$default(DrawScope drawScope0, float f, float f1, float f2, float f3, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 4) != 0) {
            f2 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
        }
        if((v1 & 8) != 0) {
            f3 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc());
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().clipRect-N_I0leg(((v1 & 1) == 0 ? f : 0.0f), ((v1 & 2) == 0 ? f1 : 0.0f), f2, f3, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v2, 1);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use a new overload accepting nullable GraphicsLayer")
    public static final void draw-GRGpd60(DrawScope drawScope0, Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, Function1 function10) {
        Density density1 = drawScope0.getDrawContext().getDensity();
        LayoutDirection layoutDirection1 = drawScope0.getDrawContext().getLayoutDirection();
        Canvas canvas1 = drawScope0.getDrawContext().getCanvas();
        long v1 = drawScope0.getDrawContext().getSize-NH-jbRc();
        GraphicsLayer graphicsLayer0 = drawScope0.getDrawContext().getGraphicsLayer();
        DrawContext drawContext0 = drawScope0.getDrawContext();
        drawContext0.setDensity(density0);
        drawContext0.setLayoutDirection(layoutDirection0);
        drawContext0.setCanvas(canvas0);
        drawContext0.setSize-uvyYCjk(v);
        drawContext0.setGraphicsLayer(null);
        canvas0.save();
        try {
            function10.invoke(drawScope0);
        }
        finally {
            canvas0.restore();
            DrawContext drawContext1 = drawScope0.getDrawContext();
            drawContext1.setDensity(density1);
            drawContext1.setLayoutDirection(layoutDirection1);
            drawContext1.setCanvas(canvas1);
            drawContext1.setSize-uvyYCjk(v1);
            drawContext1.setGraphicsLayer(graphicsLayer0);
        }
    }

    public static final void draw-ymL40Pk(@NotNull DrawScope drawScope0, @NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull Canvas canvas0, long v, @Nullable GraphicsLayer graphicsLayer0, @NotNull Function1 function10) {
        Density density1 = drawScope0.getDrawContext().getDensity();
        LayoutDirection layoutDirection1 = drawScope0.getDrawContext().getLayoutDirection();
        Canvas canvas1 = drawScope0.getDrawContext().getCanvas();
        long v1 = drawScope0.getDrawContext().getSize-NH-jbRc();
        GraphicsLayer graphicsLayer1 = drawScope0.getDrawContext().getGraphicsLayer();
        DrawContext drawContext0 = drawScope0.getDrawContext();
        drawContext0.setDensity(density0);
        drawContext0.setLayoutDirection(layoutDirection0);
        drawContext0.setCanvas(canvas0);
        drawContext0.setSize-uvyYCjk(v);
        drawContext0.setGraphicsLayer(graphicsLayer0);
        canvas0.save();
        try {
            function10.invoke(drawScope0);
        }
        finally {
            canvas0.restore();
            DrawContext drawContext1 = drawScope0.getDrawContext();
            drawContext1.setDensity(density1);
            drawContext1.setLayoutDirection(layoutDirection1);
            drawContext1.setCanvas(canvas1);
            drawContext1.setSize-uvyYCjk(v1);
            drawContext1.setGraphicsLayer(graphicsLayer1);
        }
    }

    public static void draw-ymL40Pk$default(DrawScope drawScope0, Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, GraphicsLayer graphicsLayer0, Function1 function10, int v1, Object object0) {
        if((v1 & 16) != 0) {
            graphicsLayer0 = null;
        }
        Density density1 = drawScope0.getDrawContext().getDensity();
        LayoutDirection layoutDirection1 = drawScope0.getDrawContext().getLayoutDirection();
        Canvas canvas1 = drawScope0.getDrawContext().getCanvas();
        long v2 = drawScope0.getDrawContext().getSize-NH-jbRc();
        GraphicsLayer graphicsLayer1 = drawScope0.getDrawContext().getGraphicsLayer();
        DrawContext drawContext0 = drawScope0.getDrawContext();
        drawContext0.setDensity(density0);
        drawContext0.setLayoutDirection(layoutDirection0);
        drawContext0.setCanvas(canvas0);
        drawContext0.setSize-uvyYCjk(v);
        drawContext0.setGraphicsLayer(graphicsLayer0);
        canvas0.save();
        try {
            function10.invoke(drawScope0);
        }
        finally {
            canvas0.restore();
            DrawContext drawContext1 = drawScope0.getDrawContext();
            drawContext1.setDensity(density1);
            drawContext1.setLayoutDirection(layoutDirection1);
            drawContext1.setCanvas(canvas1);
            drawContext1.setSize-uvyYCjk(v2);
            drawContext1.setGraphicsLayer(graphicsLayer1);
        }
    }

    public static final void drawIntoCanvas(@NotNull DrawScope drawScope0, @NotNull Function1 function10) {
        function10.invoke(drawScope0.getDrawContext().getCanvas());
    }

    public static final void inset(@NotNull DrawScope drawScope0, float f, float f1, float f2, float f3, @NotNull Function1 function10) {
        drawScope0.getDrawContext().getTransform().inset(f, f1, f2, f3);
        try {
            function10.invoke(drawScope0);
        }
        finally {
            drawScope0.getDrawContext().getTransform().inset(-f, -f1, -f2, -f3);
        }
    }

    public static final void inset(@NotNull DrawScope drawScope0, float f, float f1, @NotNull Function1 function10) {
        drawScope0.getDrawContext().getTransform().inset(f, f1, f, f1);
        try {
            function10.invoke(drawScope0);
        }
        finally {
            drawScope0.getDrawContext().getTransform().inset(-f, -f1, -f, -f1);
        }
    }

    public static final void inset(@NotNull DrawScope drawScope0, float f, @NotNull Function1 function10) {
        drawScope0.getDrawContext().getTransform().inset(f, f, f, f);
        try {
            function10.invoke(drawScope0);
        }
        finally {
            float f1 = -f;
            drawScope0.getDrawContext().getTransform().inset(f1, f1, f1, f1);
        }
    }

    public static void inset$default(DrawScope drawScope0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        drawScope0.getDrawContext().getTransform().inset(f, f1, f, f1);
        try {
            function10.invoke(drawScope0);
        }
        finally {
            drawScope0.getDrawContext().getTransform().inset(-f, -f1, -f, -f1);
        }
    }

    public static final void rotate-Rg1IO4c(@NotNull DrawScope drawScope0, float f, long v, @NotNull Function1 function10) {
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().rotate-Uv8p0NA(f, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v1, 1);
        }
    }

    public static void rotate-Rg1IO4c$default(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.getCenter-F1C5BW0();
        }
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().rotate-Uv8p0NA(f, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v2, 1);
        }
    }

    public static final void rotateRad-Rg1IO4c(@NotNull DrawScope drawScope0, float f, long v, @NotNull Function1 function10) {
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().rotate-Uv8p0NA(f * 57.29578f, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v1, 1);
        }
    }

    public static void rotateRad-Rg1IO4c$default(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.getCenter-F1C5BW0();
        }
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().rotate-Uv8p0NA(f * 57.29578f, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v2, 1);
        }
    }

    public static final void scale-Fgt4K4Q(@NotNull DrawScope drawScope0, float f, float f1, long v, @NotNull Function1 function10) {
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().scale-0AR0LA0(f, f1, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v1, 1);
        }
    }

    public static void scale-Fgt4K4Q$default(DrawScope drawScope0, float f, float f1, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = drawScope0.getCenter-F1C5BW0();
        }
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().scale-0AR0LA0(f, f1, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v2, 1);
        }
    }

    public static final void scale-Rg1IO4c(@NotNull DrawScope drawScope0, float f, long v, @NotNull Function1 function10) {
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().scale-0AR0LA0(f, f, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v1, 1);
        }
    }

    public static void scale-Rg1IO4c$default(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.getCenter-F1C5BW0();
        }
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().scale-0AR0LA0(f, f, v);
            function10.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v2, 1);
        }
    }

    public static final void translate(@NotNull DrawScope drawScope0, float f, float f1, @NotNull Function1 function10) {
        drawScope0.getDrawContext().getTransform().translate(f, f1);
        try {
            function10.invoke(drawScope0);
        }
        finally {
            drawScope0.getDrawContext().getTransform().translate(-f, -f1);
        }
    }

    public static void translate$default(DrawScope drawScope0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        drawScope0.getDrawContext().getTransform().translate(f, f1);
        try {
            function10.invoke(drawScope0);
        }
        finally {
            drawScope0.getDrawContext().getTransform().translate(-f, -f1);
        }
    }

    public static final void withTransform(@NotNull DrawScope drawScope0, @NotNull Function1 function10, @NotNull Function1 function11) {
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            function10.invoke(drawContext0.getTransform());
            function11.invoke(drawScope0);
        }
        finally {
            a.v(1, drawContext0, v, 1);
        }
    }
}

