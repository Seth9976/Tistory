package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00CA\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u0080\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000F\u001A\u00020\t2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J`\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000F\u001A\u00020\t2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJN\u0010#\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"JN\u0010#\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%JF\u0010*\u001A\u00020\u00142\u0006\u0010\'\u001A\u00020&2\u0006\u0010\u001C\u001A\u00020\u00062\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)J^\u0010*\u001A\u00020\u00142\u0006\u0010\'\u001A\u00020&2\u0006\u0010,\u001A\u00020+2\u0006\u0010.\u001A\u00020-2\u0006\u0010/\u001A\u00020+2\u0006\u00100\u001A\u00020-2\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0017\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u00102Jf\u0010*\u001A\u00020\u00142\u0006\u0010\'\u001A\u00020&2\u0006\u0010,\u001A\u00020+2\u0006\u0010.\u001A\u00020-2\u0006\u0010/\u001A\u00020+2\u0006\u00100\u001A\u00020-2\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u00104\u001A\u000203H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106JV\u0010;\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u00108\u001A\u0002072\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b9\u0010:JV\u0010;\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u00108\u001A\u0002072\u0006\u0010 \u001A\u00020\u001F2\b\b\u0001\u0010\u000F\u001A\u00020\t2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b<\u0010=JN\u0010B\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010>\u001A\u00020\t2\u0006\u0010?\u001A\u00020\u00062\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010AJN\u0010B\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010>\u001A\u00020\t2\u0006\u0010?\u001A\u00020\u00062\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bC\u0010DJN\u0010F\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bE\u0010\"JN\u0010F\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bG\u0010%Jf\u0010N\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010H\u001A\u00020\t2\u0006\u0010I\u001A\u00020\t2\u0006\u0010K\u001A\u00020J2\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bL\u0010MJf\u0010N\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010H\u001A\u00020\t2\u0006\u0010I\u001A\u00020\t2\u0006\u0010K\u001A\u00020J2\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bO\u0010PJF\u0010U\u001A\u00020\u00142\u0006\u0010R\u001A\u00020Q2\u0006\u0010\u0019\u001A\u00020\u00182\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bS\u0010TJF\u0010U\u001A\u00020\u00142\u0006\u0010R\u001A\u00020Q2\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0001\u0010\u000F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bV\u0010WJf\u0010^\u001A\u00020\u00142\f\u0010Y\u001A\b\u0012\u0004\u0012\u00020\u00060X2\u0006\u0010[\u001A\u00020Z2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000F\u001A\u00020\t2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\\\u0010]Jf\u0010^\u001A\u00020\u00142\f\u0010Y\u001A\b\u0012\u0004\u0012\u00020\u00060X2\u0006\u0010[\u001A\u00020Z2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000F\u001A\u00020\t2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b_\u0010`JL\u0010l\u001A\u00020\u00142\u0006\u0010b\u001A\u00020a2\u0006\u0010d\u001A\u00020c2\u0006\u0010f\u001A\u00020e2\u0006\u0010\u001E\u001A\u00020\u001D2\u0017\u0010i\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140g\u00A2\u0006\u0002\bhH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bj\u0010kR \u0010s\u001A\u00020m8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bn\u0010o\u0012\u0004\br\u0010\u0003\u001A\u0004\bp\u0010qR\u001A\u0010y\u001A\u00020t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bu\u0010v\u001A\u0004\bw\u0010xR\u0014\u0010d\u001A\u00020c8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bz\u0010{R\u0014\u0010b\u001A\u00020\t8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b|\u0010}R\u0014\u0010\u007F\u001A\u00020\t8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b~\u0010}\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "<init>", "()V", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "Landroidx/compose/ui/graphics/Color;", "color", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "startAngle", "sweepAngle", "", "useCenter", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "draw", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "a", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "drawParams", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "b", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "getFontScale", "fontScale", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,791:1\n1#2:792\n*E\n"})
public final class CanvasDrawScope implements DrawScope {
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001A\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u001BHÖ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010 \u001A\u00020\u001F2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\r\"\u0004\b%\u0010&R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u000F\"\u0004\b*\u0010+R\"\u0010\u0007\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u0011\"\u0004\b/\u00100R(\u0010\t\u001A\u00020\b8\u0006@\u0006X\u0086\u000Eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u0013\"\u0004\b4\u00105\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/geometry/Size;", "size", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/ui/unit/Density;", "component2", "()Landroidx/compose/ui/unit/LayoutDirection;", "component3", "()Landroidx/compose/ui/graphics/Canvas;", "component4-NH-jbRc", "()J", "component4", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/unit/Density;", "getDensity", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "b", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "c", "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "d", "J", "getSize-NH-jbRc", "setSize-uvyYCjk", "(J)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @PublishedApi
    public static final class DrawParams {
        public Density a;
        public LayoutDirection b;
        public Canvas c;
        public long d;

        public DrawParams(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                density0 = DrawContextKt.getDefaultDensity();
            }
            if((v1 & 2) != 0) {
                layoutDirection0 = LayoutDirection.Ltr;
            }
            if((v1 & 4) != 0) {
                canvas0 = new EmptyCanvas();
            }
            if((v1 & 8) != 0) {
                v = 0L;
            }
            this(density0, layoutDirection0, canvas0, v, null);
        }

        public DrawParams(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = density0;
            this.b = layoutDirection0;
            this.c = canvas0;
            this.d = v;
        }

        @NotNull
        public final Density component1() {
            return this.a;
        }

        @NotNull
        public final LayoutDirection component2() {
            return this.b;
        }

        @NotNull
        public final Canvas component3() {
            return this.c;
        }

        public final long component4-NH-jbRc() {
            return this.d;
        }

        @NotNull
        public final DrawParams copy-Ug5Nnss(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull Canvas canvas0, long v) {
            return new DrawParams(density0, layoutDirection0, canvas0, v, null);
        }

        public static DrawParams copy-Ug5Nnss$default(DrawParams canvasDrawScope$DrawParams0, Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                density0 = canvasDrawScope$DrawParams0.a;
            }
            if((v1 & 2) != 0) {
                layoutDirection0 = canvasDrawScope$DrawParams0.b;
            }
            if((v1 & 4) != 0) {
                canvas0 = canvasDrawScope$DrawParams0.c;
            }
            if((v1 & 8) != 0) {
                v = canvasDrawScope$DrawParams0.d;
            }
            return canvasDrawScope$DrawParams0.copy-Ug5Nnss(density0, layoutDirection0, canvas0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof DrawParams)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((DrawParams)object0).a)) {
                return false;
            }
            if(this.b != ((DrawParams)object0).b) {
                return false;
            }
            return Intrinsics.areEqual(this.c, ((DrawParams)object0).c) ? Size.equals-impl0(this.d, ((DrawParams)object0).d) : false;
        }

        @NotNull
        public final Canvas getCanvas() {
            return this.c;
        }

        @NotNull
        public final Density getDensity() {
            return this.a;
        }

        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return this.b;
        }

        public final long getSize-NH-jbRc() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Size.hashCode-impl(this.d) + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F;
        }

        public final void setCanvas(@NotNull Canvas canvas0) {
            this.c = canvas0;
        }

        public final void setDensity(@NotNull Density density0) {
            this.a = density0;
        }

        public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection0) {
            this.b = layoutDirection0;
        }

        public final void setSize-uvyYCjk(long v) {
            this.d = v;
        }

        @Override
        @NotNull
        public String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + Size.toString-impl(this.d) + ')';
        }
    }

    public final DrawParams a;
    public final androidx.compose.ui.graphics.drawscope.CanvasDrawScope.drawContext.1 b;
    public Paint c;
    public Paint d;

    public CanvasDrawScope() {
        this.a = new DrawParams(null, null, null, 0L, 15, null);
        this.b = new DrawContext() {
            public final DrawTransform a;
            public GraphicsLayer b;
            public final CanvasDrawScope c;

            {
                this.c = canvasDrawScope0;
                this.a = CanvasDrawScopeKt.access$asDrawTransform(this);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            @NotNull
            public Canvas getCanvas() {
                return this.c.getDrawParams().getCanvas();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            @NotNull
            public Density getDensity() {
                return this.c.getDrawParams().getDensity();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            @Nullable
            public GraphicsLayer getGraphicsLayer() {
                return this.b;
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            @NotNull
            public LayoutDirection getLayoutDirection() {
                return this.c.getDrawParams().getLayoutDirection();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public long getSize-NH-jbRc() {
                return this.c.getDrawParams().getSize-NH-jbRc();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            @NotNull
            public DrawTransform getTransform() {
                return this.a;
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public void setCanvas(@NotNull Canvas canvas0) {
                this.c.getDrawParams().setCanvas(canvas0);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public void setDensity(@NotNull Density density0) {
                this.c.getDrawParams().setDensity(density0);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public void setGraphicsLayer(@Nullable GraphicsLayer graphicsLayer0) {
                this.b = graphicsLayer0;
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public void setLayoutDirection(@NotNull LayoutDirection layoutDirection0) {
                this.c.getDrawParams().setLayoutDirection(layoutDirection0);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public void setSize-uvyYCjk(long v) {
                this.c.getDrawParams().setSize-uvyYCjk(v);
            }
        };
    }

    public static Paint b(CanvasDrawScope canvasDrawScope0, long v, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v1) {
        Paint paint0 = canvasDrawScope0.h(drawStyle0);
        if(f != 1.0f) {
            v = Color.copy-wmQWz5c$default(v, Color.getAlpha-impl(v) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if(!Color.equals-impl0(paint0.getColor-0d7_KjU(), v)) {
            paint0.setColor-8_81llA(v);
        }
        if(paint0.getShader() != null) {
            paint0.setShader(null);
        }
        if(!Intrinsics.areEqual(paint0.getColorFilter(), colorFilter0)) {
            paint0.setColorFilter(colorFilter0);
        }
        if(!BlendMode.equals-impl0(paint0.getBlendMode-0nO6VwU(), v1)) {
            paint0.setBlendMode-s9anfk8(v1);
        }
        if(!FilterQuality.equals-impl0(paint0.getFilterQuality-f-v9h1I(), 1)) {
            paint0.setFilterQuality-vDHp3xo(1);
        }
        return paint0;
    }

    public final Paint c(Brush brush0, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v, int v1) {
        Paint paint0 = this.h(drawStyle0);
        if(brush0 == null) {
            if(paint0.getShader() != null) {
                paint0.setShader(null);
            }
            if(!Color.equals-impl0(paint0.getColor-0d7_KjU(), 0xFF00000000000000L)) {
                paint0.setColor-8_81llA(0xFF00000000000000L);
            }
            if(paint0.getAlpha() != f) {
                paint0.setAlpha(f);
            }
        }
        else {
            brush0.applyTo-Pq9zytI(this.getSize-NH-jbRc(), paint0, f);
        }
        if(!Intrinsics.areEqual(paint0.getColorFilter(), colorFilter0)) {
            paint0.setColorFilter(colorFilter0);
        }
        if(!BlendMode.equals-impl0(paint0.getBlendMode-0nO6VwU(), v)) {
            paint0.setBlendMode-s9anfk8(v);
        }
        if(!FilterQuality.equals-impl0(paint0.getFilterQuality-f-v9h1I(), v1)) {
            paint0.setFilterQuality-vDHp3xo(v1);
        }
        return paint0;
    }

    // 去混淆评级： 低(20)
    public static Paint d(CanvasDrawScope canvasDrawScope0, Brush brush0, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v) {
        return canvasDrawScope0.c(brush0, drawStyle0, f, colorFilter0, v, 1);
    }

    public final void draw-yzxVdVo(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull Canvas canvas0, long v, @NotNull Function1 function10) {
        DrawParams canvasDrawScope$DrawParams0 = this.getDrawParams();
        DrawParams canvasDrawScope$DrawParams1 = this.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(density0);
        canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
        canvasDrawScope$DrawParams1.setCanvas(canvas0);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(v);
        canvas0.save();
        function10.invoke(this);
        canvas0.restore();
        DrawParams canvasDrawScope$DrawParams2 = this.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
        canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
        canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawArc-illE91I(@NotNull Brush brush0, float f, float f1, boolean z, long v, long v1, @FloatRange(from = 0.0, to = 1.0) float f2, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v2) {
        this.a.getCanvas().drawArc(Offset.getX-impl(v), Offset.getY-impl(v), Size.getWidth-impl(v1) + Offset.getX-impl(v), Size.getHeight-impl(v1) + Offset.getY-impl(v), f, f1, z, CanvasDrawScope.d(this, brush0, drawStyle0, f2, colorFilter0, v2));
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawArc-yD3GUKo(long v, float f, float f1, boolean z, long v1, long v2, @FloatRange(from = 0.0, to = 1.0) float f2, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v3) {
        float f3 = Size.getWidth-impl(v2);
        float f4 = Size.getHeight-impl(v2);
        Paint paint0 = CanvasDrawScope.b(this, v, drawStyle0, f2, colorFilter0, v3);
        this.a.getCanvas().drawArc(Offset.getX-impl(v1), Offset.getY-impl(v1), f3 + Offset.getX-impl(v1), f4 + Offset.getY-impl(v1), f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawCircle-V9BoPsw(@NotNull Brush brush0, float f, long v, @FloatRange(from = 0.0, to = 1.0) float f1, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v1) {
        Paint paint0 = CanvasDrawScope.d(this, brush0, drawStyle0, f1, colorFilter0, v1);
        this.a.getCanvas().drawCircle-9KIMszo(v, f, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawCircle-VaOC9Bg(long v, float f, long v1, @FloatRange(from = 0.0, to = 1.0) float f1, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v2) {
        Paint paint0 = CanvasDrawScope.b(this, v, drawStyle0, f1, colorFilter0, v2);
        this.a.getCanvas().drawCircle-9KIMszo(v1, f, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public void drawImage-9jGpkUE(ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @FloatRange(from = 0.0, to = 1.0) float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4) {
        Paint paint0 = CanvasDrawScope.d(this, null, drawStyle0, f, colorFilter0, v4);
        this.a.getCanvas().drawImageRect-HPBpro0(imageBitmap0, v, v1, v2, v3, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawImage-AZ2fEMs(@NotNull ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v4, int v5) {
        Paint paint0 = this.c(null, drawStyle0, f, colorFilter0, v4, v5);
        this.a.getCanvas().drawImageRect-HPBpro0(imageBitmap0, v, v1, v2, v3, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawImage-gbVJVH8(@NotNull ImageBitmap imageBitmap0, long v, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v1) {
        Paint paint0 = CanvasDrawScope.d(this, null, drawStyle0, f, colorFilter0, v1);
        this.a.getCanvas().drawImage-d-4ec7I(imageBitmap0, v, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawLine-1RTmtNc(@NotNull Brush brush0, long v, long v1, float f, int v2, @Nullable PathEffect pathEffect0, @FloatRange(from = 0.0, to = 1.0) float f1, @Nullable ColorFilter colorFilter0, int v3) {
        Paint paint0 = CanvasDrawScope.f(this, brush0, f, v2, 0, pathEffect0, f1, colorFilter0, v3);
        this.a.getCanvas().drawLine-Wko1d7g(v, v1, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawLine-NGM6Ib0(long v, long v1, long v2, float f, int v3, @Nullable PathEffect pathEffect0, @FloatRange(from = 0.0, to = 1.0) float f1, @Nullable ColorFilter colorFilter0, int v4) {
        Paint paint0 = CanvasDrawScope.e(this, v, f, v3, 0, pathEffect0, f1, colorFilter0, v4);
        this.a.getCanvas().drawLine-Wko1d7g(v1, v2, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawOval-AsUm42w(@NotNull Brush brush0, long v, long v1, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v2) {
        float f1 = Size.getWidth-impl(v1);
        float f2 = Size.getHeight-impl(v1);
        Paint paint0 = CanvasDrawScope.d(this, brush0, drawStyle0, f, colorFilter0, v2);
        this.a.getCanvas().drawOval(Offset.getX-impl(v), Offset.getY-impl(v), f1 + Offset.getX-impl(v), f2 + Offset.getY-impl(v), paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawOval-n-J9OG0(long v, long v1, long v2, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v3) {
        float f1 = Size.getWidth-impl(v2);
        float f2 = Size.getHeight-impl(v2);
        Paint paint0 = CanvasDrawScope.b(this, v, drawStyle0, f, colorFilter0, v3);
        this.a.getCanvas().drawOval(Offset.getX-impl(v1), Offset.getY-impl(v1), f1 + Offset.getX-impl(v1), f2 + Offset.getY-impl(v1), paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPath-GBMwjPU(@NotNull Path path0, @NotNull Brush brush0, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v) {
        Paint paint0 = CanvasDrawScope.d(this, brush0, drawStyle0, f, colorFilter0, v);
        this.a.getCanvas().drawPath(path0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPath-LG529CI(@NotNull Path path0, long v, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v1) {
        Paint paint0 = CanvasDrawScope.b(this, v, drawStyle0, f, colorFilter0, v1);
        this.a.getCanvas().drawPath(path0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPoints-F8ZwMP8(@NotNull List list0, int v, long v1, float f, int v2, @Nullable PathEffect pathEffect0, @FloatRange(from = 0.0, to = 1.0) float f1, @Nullable ColorFilter colorFilter0, int v3) {
        Paint paint0 = CanvasDrawScope.e(this, v1, f, v2, 0, pathEffect0, f1, colorFilter0, v3);
        this.a.getCanvas().drawPoints-O7TthRY(v, list0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPoints-Gsft0Ws(@NotNull List list0, int v, @NotNull Brush brush0, float f, int v1, @Nullable PathEffect pathEffect0, @FloatRange(from = 0.0, to = 1.0) float f1, @Nullable ColorFilter colorFilter0, int v2) {
        Paint paint0 = CanvasDrawScope.f(this, brush0, f, v1, 0, pathEffect0, f1, colorFilter0, v2);
        this.a.getCanvas().drawPoints-O7TthRY(v, list0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRect-AsUm42w(@NotNull Brush brush0, long v, long v1, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v2) {
        float f1 = Size.getWidth-impl(v1);
        float f2 = Size.getHeight-impl(v1);
        Paint paint0 = CanvasDrawScope.d(this, brush0, drawStyle0, f, colorFilter0, v2);
        this.a.getCanvas().drawRect(Offset.getX-impl(v), Offset.getY-impl(v), f1 + Offset.getX-impl(v), f2 + Offset.getY-impl(v), paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRect-n-J9OG0(long v, long v1, long v2, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v3) {
        float f1 = Size.getWidth-impl(v2);
        float f2 = Size.getHeight-impl(v2);
        Paint paint0 = CanvasDrawScope.b(this, v, drawStyle0, f, colorFilter0, v3);
        this.a.getCanvas().drawRect(Offset.getX-impl(v1), Offset.getY-impl(v1), f1 + Offset.getX-impl(v1), f2 + Offset.getY-impl(v1), paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRoundRect-ZuiqVtQ(@NotNull Brush brush0, long v, long v1, long v2, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v3) {
        float f1 = Size.getWidth-impl(v1);
        float f2 = Size.getHeight-impl(v1);
        Paint paint0 = CanvasDrawScope.d(this, brush0, drawStyle0, f, colorFilter0, v3);
        this.a.getCanvas().drawRoundRect(Offset.getX-impl(v), Offset.getY-impl(v), Offset.getX-impl(v) + f1, Offset.getY-impl(v) + f2, CornerRadius.getX-impl(v2), CornerRadius.getY-impl(v2), paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRoundRect-u-Aw5IA(long v, long v1, long v2, long v3, @NotNull DrawStyle drawStyle0, @FloatRange(from = 0.0, to = 1.0) float f, @Nullable ColorFilter colorFilter0, int v4) {
        float f1 = Size.getWidth-impl(v2);
        float f2 = Size.getHeight-impl(v2);
        Paint paint0 = CanvasDrawScope.b(this, v, drawStyle0, f, colorFilter0, v4);
        this.a.getCanvas().drawRoundRect(Offset.getX-impl(v1), Offset.getY-impl(v1), f1 + Offset.getX-impl(v1), f2 + Offset.getY-impl(v1), CornerRadius.getX-impl(v3), CornerRadius.getY-impl(v3), paint0);
    }

    public static Paint e(CanvasDrawScope canvasDrawScope0, long v, float f, int v1, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3) {
        Paint paint0 = canvasDrawScope0.g();
        long v4 = f1 == 1.0f ? v : Color.copy-wmQWz5c$default(v, Color.getAlpha-impl(v) * f1, 0.0f, 0.0f, 0.0f, 14, null);
        if(!Color.equals-impl0(paint0.getColor-0d7_KjU(), v4)) {
            paint0.setColor-8_81llA(v4);
        }
        if(paint0.getShader() != null) {
            paint0.setShader(null);
        }
        if(!Intrinsics.areEqual(paint0.getColorFilter(), colorFilter0)) {
            paint0.setColorFilter(colorFilter0);
        }
        if(!BlendMode.equals-impl0(paint0.getBlendMode-0nO6VwU(), v3)) {
            paint0.setBlendMode-s9anfk8(v3);
        }
        if(paint0.getStrokeWidth() != f) {
            paint0.setStrokeWidth(f);
        }
        if(paint0.getStrokeMiterLimit() != 4.0f) {
            paint0.setStrokeMiterLimit(4.0f);
        }
        if(!StrokeCap.equals-impl0(paint0.getStrokeCap-KaPHkGw(), v1)) {
            paint0.setStrokeCap-BeK7IIE(v1);
        }
        if(!StrokeJoin.equals-impl0(paint0.getStrokeJoin-LxFBmk8(), v2)) {
            paint0.setStrokeJoin-Ww9F2mQ(v2);
        }
        if(!Intrinsics.areEqual(paint0.getPathEffect(), pathEffect0)) {
            paint0.setPathEffect(pathEffect0);
        }
        if(!FilterQuality.equals-impl0(paint0.getFilterQuality-f-v9h1I(), 1)) {
            paint0.setFilterQuality-vDHp3xo(1);
        }
        return paint0;
    }

    public static Paint f(CanvasDrawScope canvasDrawScope0, Brush brush0, float f, int v, int v1, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v2) {
        Paint paint0 = canvasDrawScope0.g();
        if(brush0 != null) {
            brush0.applyTo-Pq9zytI(canvasDrawScope0.getSize-NH-jbRc(), paint0, f1);
        }
        else if(paint0.getAlpha() != f1) {
            paint0.setAlpha(f1);
        }
        if(!Intrinsics.areEqual(paint0.getColorFilter(), colorFilter0)) {
            paint0.setColorFilter(colorFilter0);
        }
        if(!BlendMode.equals-impl0(paint0.getBlendMode-0nO6VwU(), v2)) {
            paint0.setBlendMode-s9anfk8(v2);
        }
        if(paint0.getStrokeWidth() != f) {
            paint0.setStrokeWidth(f);
        }
        if(paint0.getStrokeMiterLimit() != 4.0f) {
            paint0.setStrokeMiterLimit(4.0f);
        }
        if(!StrokeCap.equals-impl0(paint0.getStrokeCap-KaPHkGw(), v)) {
            paint0.setStrokeCap-BeK7IIE(v);
        }
        if(!StrokeJoin.equals-impl0(paint0.getStrokeJoin-LxFBmk8(), v1)) {
            paint0.setStrokeJoin-Ww9F2mQ(v1);
        }
        if(!Intrinsics.areEqual(paint0.getPathEffect(), pathEffect0)) {
            paint0.setPathEffect(pathEffect0);
        }
        if(!FilterQuality.equals-impl0(paint0.getFilterQuality-f-v9h1I(), 1)) {
            paint0.setFilterQuality-vDHp3xo(1);
        }
        return paint0;
    }

    public final Paint g() {
        Paint paint0 = this.d;
        if(paint0 == null) {
            paint0 = AndroidPaint_androidKt.Paint();
            paint0.setStyle-k9PVt8s(1);
            this.d = paint0;
        }
        return paint0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.b;
    }

    @NotNull
    public final DrawParams getDrawParams() {
        return this.a;
    }

    @PublishedApi
    public static void getDrawParams$annotations() {
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.a.getDensity().getFontScale();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    public final Paint h(DrawStyle drawStyle0) {
        if(Intrinsics.areEqual(drawStyle0, Fill.INSTANCE)) {
            Paint paint0 = this.c;
            if(paint0 == null) {
                paint0 = AndroidPaint_androidKt.Paint();
                paint0.setStyle-k9PVt8s(0);
                this.c = paint0;
                return paint0;
            }
            return paint0;
        }
        if(!(drawStyle0 instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        Paint paint1 = this.g();
        if(paint1.getStrokeWidth() != ((Stroke)drawStyle0).getWidth()) {
            paint1.setStrokeWidth(((Stroke)drawStyle0).getWidth());
        }
        if(!StrokeCap.equals-impl0(paint1.getStrokeCap-KaPHkGw(), ((Stroke)drawStyle0).getCap-KaPHkGw())) {
            paint1.setStrokeCap-BeK7IIE(((Stroke)drawStyle0).getCap-KaPHkGw());
        }
        if(paint1.getStrokeMiterLimit() != ((Stroke)drawStyle0).getMiter()) {
            paint1.setStrokeMiterLimit(((Stroke)drawStyle0).getMiter());
        }
        if(!StrokeJoin.equals-impl0(paint1.getStrokeJoin-LxFBmk8(), ((Stroke)drawStyle0).getJoin-LxFBmk8())) {
            paint1.setStrokeJoin-Ww9F2mQ(((Stroke)drawStyle0).getJoin-LxFBmk8());
        }
        if(!Intrinsics.areEqual(paint1.getPathEffect(), ((Stroke)drawStyle0).getPathEffect())) {
            paint1.setPathEffect(((Stroke)drawStyle0).getPathEffect());
        }
        return paint1;
    }
}

