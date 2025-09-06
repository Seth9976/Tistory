package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import j0.b2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DrawScopeMarker
@Metadata(d1 = {"\u0000\u00B8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 q2\u00020\u0001:\u0001qJj\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0003\u0010\r\u001A\u00020\u00072\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014Jj\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0003\u0010\r\u001A\u00020\u00072\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019JX\u0010!\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 JX\u0010!\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#JN\u0010(\u001A\u00020\u00122\u0006\u0010%\u001A\u00020$2\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'Jl\u0010(\u001A\u00020\u00122\u0006\u0010%\u001A\u00020$2\b\b\u0002\u0010*\u001A\u00020)2\b\b\u0002\u0010,\u001A\u00020+2\b\b\u0002\u0010-\u001A\u00020)2\b\b\u0002\u0010.\u001A\u00020+2\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H\'\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100Jv\u0010(\u001A\u00020\u00122\u0006\u0010%\u001A\u00020$2\b\b\u0002\u0010*\u001A\u00020)2\b\b\u0002\u0010,\u001A\u00020+2\b\b\u0002\u0010-\u001A\u00020)2\b\b\u0002\u0010.\u001A\u00020+2\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u00102\u001A\u000201H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104Jb\u00109\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u00106\u001A\u0002052\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108Jb\u00109\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u00106\u001A\u0002052\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0003\u0010\r\u001A\u00020\u00072\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u0010;JX\u0010@\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010<\u001A\u00020\u00072\b\b\u0002\u0010=\u001A\u00020\u00042\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b>\u0010?JX\u0010@\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010<\u001A\u00020\u00072\b\b\u0002\u0010=\u001A\u00020\u00042\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bA\u0010BJX\u0010D\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bC\u0010 JX\u0010D\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bE\u0010#Jp\u0010L\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010F\u001A\u00020\u00072\u0006\u0010G\u001A\u00020\u00072\u0006\u0010I\u001A\u00020H2\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bJ\u0010KJp\u0010L\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010F\u001A\u00020\u00072\u0006\u0010G\u001A\u00020\u00072\u0006\u0010I\u001A\u00020H2\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bM\u0010NJL\u0010S\u001A\u00020\u00122\u0006\u0010P\u001A\u00020O2\u0006\u0010\u0017\u001A\u00020\u00162\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bQ\u0010RJL\u0010S\u001A\u00020\u00122\u0006\u0010P\u001A\u00020O2\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0003\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bT\u0010UJp\u0010\\\u001A\u00020\u00122\f\u0010W\u001A\b\u0012\u0004\u0012\u00020\u00040V2\u0006\u0010Y\u001A\u00020X2\u0006\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0003\u0010\r\u001A\u00020\u00072\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bZ\u0010[Jp\u0010\\\u001A\u00020\u00122\f\u0010W\u001A\b\u0012\u0004\u0012\u00020\u00040V2\u0006\u0010Y\u001A\u00020X2\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0003\u0010\r\u001A\u00020\u00072\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u0010H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b]\u0010^J9\u0010e\u001A\u00020\u0012*\u00020_2\b\b\u0002\u0010\u001C\u001A\u00020+2\u0017\u0010b\u001A\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120`\u00A2\u0006\u0002\baH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bc\u0010dR\u0014\u0010i\u001A\u00020f8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bg\u0010hR\u001A\u0010=\u001A\u00020\u00048VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bj\u0010kR\u001A\u0010\u001C\u001A\u00020\u001B8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bl\u0010kR\u0014\u0010p\u001A\u00020m8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bn\u0010o\u00F8\u0001\u0002\u0082\u0002\u0011\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001\u00A8\u0006r\u00C0\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "Landroidx/compose/ui/graphics/Color;", "color", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "startAngle", "sweepAngle", "", "useCenter", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "record", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getCenter-F1C5BW0", "()J", "getSize-NH-jbRc", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DrawScope extends Density {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "Landroidx/compose/ui/graphics/BlendMode;", "b", "I", "getDefaultBlendMode-0nO6VwU", "()I", "DefaultBlendMode", "Landroidx/compose/ui/graphics/FilterQuality;", "c", "getDefaultFilterQuality-f-v9h1I", "DefaultFilterQuality", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final int b;
        public static final int c;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = 3;
            Companion.c = 1;
        }

        public final int getDefaultBlendMode-0nO6VwU() [...] // 潜在的解密器

        public final int getDefaultFilterQuality-f-v9h1I() [...] // 潜在的解密器
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void drawArc-illE91I$default(DrawScope drawScope0, Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            DrawScope.drawArc-illE91I$default(drawScope0, brush0, f, f1, z, v, v1, f2, drawStyle0, colorFilter0, v2, v3, object0);
        }

        public static void drawArc-yD3GUKo$default(DrawScope drawScope0, long v, float f, float f1, boolean z, long v1, long v2, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            DrawScope.drawArc-yD3GUKo$default(drawScope0, v, f, f1, z, v1, v2, f2, drawStyle0, colorFilter0, v3, v4, object0);
        }

        public static void drawCircle-V9BoPsw$default(DrawScope drawScope0, Brush brush0, float f, long v, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
            DrawScope.drawCircle-V9BoPsw$default(drawScope0, brush0, f, v, f1, drawStyle0, colorFilter0, v1, v2, object0);
        }

        public static void drawCircle-VaOC9Bg$default(DrawScope drawScope0, long v, float f, long v1, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            DrawScope.drawCircle-VaOC9Bg$default(drawScope0, v, f, v1, f1, drawStyle0, colorFilter0, v2, v3, object0);
        }

        public static void drawImage-9jGpkUE$default(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, Object object0) {
            DrawScope.drawImage-9jGpkUE$default(drawScope0, imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5, object0);
        }

        @Deprecated
        public static void drawImage-AZ2fEMs(@NotNull DrawScope drawScope0, @NotNull ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v4, int v5) {
            drawScope0.super.drawImage-AZ2fEMs(imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5);
        }

        public static void drawImage-AZ2fEMs$default(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, int v6, Object object0) {
            DrawScope.drawImage-AZ2fEMs$default(drawScope0, imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5, v6, object0);
        }

        public static void drawImage-gbVJVH8$default(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
            DrawScope.drawImage-gbVJVH8$default(drawScope0, imageBitmap0, v, f, drawStyle0, colorFilter0, v1, v2, object0);
        }

        public static void drawLine-1RTmtNc$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            DrawScope.drawLine-1RTmtNc$default(drawScope0, brush0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3, v4, object0);
        }

        public static void drawOval-AsUm42w$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            DrawScope.drawOval-AsUm42w$default(drawScope0, brush0, v, v1, f, drawStyle0, colorFilter0, v2, v3, object0);
        }

        public static void drawOval-n-J9OG0$default(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            DrawScope.drawOval-n-J9OG0$default(drawScope0, v, v1, v2, f, drawStyle0, colorFilter0, v3, v4, object0);
        }

        public static void drawPath-GBMwjPU$default(DrawScope drawScope0, Path path0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v, int v1, Object object0) {
            DrawScope.drawPath-GBMwjPU$default(drawScope0, path0, brush0, f, drawStyle0, colorFilter0, v, v1, object0);
        }

        public static void drawPoints-F8ZwMP8$default(DrawScope drawScope0, List list0, int v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            DrawScope.drawPoints-F8ZwMP8$default(drawScope0, list0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3, v4, object0);
        }

        public static void drawPoints-Gsft0Ws$default(DrawScope drawScope0, List list0, int v, Brush brush0, float f, int v1, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            DrawScope.drawPoints-Gsft0Ws$default(drawScope0, list0, v, brush0, f, v1, pathEffect0, f1, colorFilter0, v2, v3, object0);
        }

        public static void drawRect-AsUm42w$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            DrawScope.drawRect-AsUm42w$default(drawScope0, brush0, v, v1, f, drawStyle0, colorFilter0, v2, v3, object0);
        }

        public static void drawRoundRect-ZuiqVtQ$default(DrawScope drawScope0, Brush brush0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            DrawScope.drawRoundRect-ZuiqVtQ$default(drawScope0, brush0, v, v1, v2, f, drawStyle0, colorFilter0, v3, v4, object0);
        }

        public static void drawRoundRect-u-Aw5IA$default(DrawScope drawScope0, long v, long v1, long v2, long v3, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v4, int v5, Object object0) {
            DrawScope.drawRoundRect-u-Aw5IA$default(drawScope0, v, v1, v2, v3, drawStyle0, f, colorFilter0, v4, v5, object0);
        }

        @Deprecated
        public static long getCenter-F1C5BW0(@NotNull DrawScope drawScope0) {
            return drawScope0.super.getCenter-F1C5BW0();
        }

        @Deprecated
        public static long getSize-NH-jbRc(@NotNull DrawScope drawScope0) {
            return drawScope0.super.getSize-NH-jbRc();
        }

        @Deprecated
        public static void record-JVtK1S4(@NotNull DrawScope drawScope0, @NotNull GraphicsLayer graphicsLayer0, long v, @NotNull Function1 function10) {
            drawScope0.super.record-JVtK1S4(graphicsLayer0, v, function10);
        }

        public static void record-JVtK1S4$default(DrawScope drawScope0, GraphicsLayer graphicsLayer0, long v, Function1 function10, int v1, Object object0) {
            DrawScope.record-JVtK1S4$default(drawScope0, graphicsLayer0, v, function10, v1, object0);
        }

        @Stable
        @Deprecated
        public static int roundToPx--R2X_6o(@NotNull DrawScope drawScope0, long v) {
            return drawScope0.super.roundToPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static int roundToPx-0680j_4(@NotNull DrawScope drawScope0, float f) {
            return drawScope0.super.roundToPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull DrawScope drawScope0, long v) {
            return drawScope0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull DrawScope drawScope0, float f) {
            return drawScope0.super.toDp-u2uoSUM(f);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull DrawScope drawScope0, int v) {
            return drawScope0.super.toDp-u2uoSUM(v);
        }

        @Stable
        @Deprecated
        public static long toDpSize-k-rfVVM(@NotNull DrawScope drawScope0, long v) {
            return drawScope0.super.toDpSize-k-rfVVM(v);
        }

        @Stable
        @Deprecated
        public static float toPx--R2X_6o(@NotNull DrawScope drawScope0, long v) {
            return drawScope0.super.toPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static float toPx-0680j_4(@NotNull DrawScope drawScope0, float f) {
            return drawScope0.super.toPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull DrawScope drawScope0, @NotNull DpRect dpRect0) {
            return drawScope0.super.toRect(dpRect0);
        }

        @Stable
        @Deprecated
        public static long toSize-XkaWNTQ(@NotNull DrawScope drawScope0, long v) {
            return drawScope0.super.toSize-XkaWNTQ(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull DrawScope drawScope0, float f) {
            return drawScope0.super.toSp-0xMU5do(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull DrawScope drawScope0, float f) {
            return drawScope0.super.toSp-kPz2Gy4(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull DrawScope drawScope0, int v) {
            return drawScope0.super.toSp-kPz2Gy4(v);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        DrawScope.Companion = Companion.a;
    }

    static long a(long v, long v1) {
        return SizeKt.Size(Size.getWidth-impl(v) - Offset.getX-impl(v1), Size.getHeight-impl(v) - Offset.getY-impl(v1));
    }

    void drawArc-illE91I(@NotNull Brush arg1, float arg2, float arg3, boolean arg4, long arg5, long arg6, @FloatRange(from = 0.0, to = 1.0) float arg7, @NotNull DrawStyle arg8, @Nullable ColorFilter arg9, int arg10);

    static void drawArc-illE91I$default(DrawScope drawScope0, Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long v4 = (v3 & 16) == 0 ? v : 0L;
        long v5 = (v3 & 0x20) == 0 ? v1 : DrawScope.a(drawScope0.getSize-NH-jbRc(), v4);
        DrawStyle drawStyle1 = (v3 & 0x80) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawArc-illE91I(brush0, f, f1, z, v4, v5, ((v3 & 0x40) == 0 ? f2 : 1.0f), drawStyle1, ((v3 & 0x100) == 0 ? colorFilter0 : null), ((v3 & 0x200) == 0 ? v2 : 3));
    }

    void drawArc-yD3GUKo(long arg1, float arg2, float arg3, boolean arg4, long arg5, long arg6, @FloatRange(from = 0.0, to = 1.0) float arg7, @NotNull DrawStyle arg8, @Nullable ColorFilter arg9, int arg10);

    static void drawArc-yD3GUKo$default(DrawScope drawScope0, long v, float f, float f1, boolean z, long v1, long v2, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long v5 = (v4 & 16) == 0 ? v1 : 0L;
        long v6 = (v4 & 0x20) == 0 ? v2 : DrawScope.a(drawScope0.getSize-NH-jbRc(), v5);
        DrawStyle drawStyle1 = (v4 & 0x80) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawArc-yD3GUKo(v, f, f1, z, v5, v6, ((v4 & 0x40) == 0 ? f2 : 1.0f), drawStyle1, ((v4 & 0x100) == 0 ? colorFilter0 : null), ((v4 & 0x200) == 0 ? v3 : 3));
    }

    void drawCircle-V9BoPsw(@NotNull Brush arg1, float arg2, long arg3, @FloatRange(from = 0.0, to = 1.0) float arg4, @NotNull DrawStyle arg5, @Nullable ColorFilter arg6, int arg7);

    static void drawCircle-V9BoPsw$default(DrawScope drawScope0, Brush brush0, float f, long v, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        float f2 = (v2 & 2) == 0 ? f : Size.getMinDimension-impl(drawScope0.getSize-NH-jbRc()) / 2.0f;
        long v3 = (v2 & 4) == 0 ? v : drawScope0.getCenter-F1C5BW0();
        DrawStyle drawStyle1 = (v2 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawCircle-V9BoPsw(brush0, f2, v3, ((v2 & 8) == 0 ? f1 : 1.0f), drawStyle1, ((v2 & 0x20) == 0 ? colorFilter0 : null), ((v2 & 0x40) == 0 ? v1 : 3));
    }

    void drawCircle-VaOC9Bg(long arg1, float arg2, long arg3, @FloatRange(from = 0.0, to = 1.0) float arg4, @NotNull DrawStyle arg5, @Nullable ColorFilter arg6, int arg7);

    static void drawCircle-VaOC9Bg$default(DrawScope drawScope0, long v, float f, long v1, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        float f2 = (v3 & 2) == 0 ? f : Size.getMinDimension-impl(drawScope0.getSize-NH-jbRc()) / 2.0f;
        long v4 = (v3 & 4) == 0 ? v1 : drawScope0.getCenter-F1C5BW0();
        DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawCircle-VaOC9Bg(v, f2, v4, ((v3 & 8) == 0 ? f1 : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
    }

    @kotlin.Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    void drawImage-9jGpkUE(ImageBitmap arg1, long arg2, long arg3, long arg4, long arg5, @FloatRange(from = 0.0, to = 1.0) float arg6, DrawStyle arg7, ColorFilter arg8, int arg9);

    static void drawImage-9jGpkUE$default(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long v6 = (v5 & 4) == 0 ? v1 : IntSizeKt.IntSize(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        DrawStyle drawStyle1 = (v5 & 0x40) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawImage-9jGpkUE(imageBitmap0, ((v5 & 2) == 0 ? v : 0L), v6, ((v5 & 8) == 0 ? v2 : 0L), ((v5 & 16) == 0 ? v3 : v6), ((v5 & 0x20) == 0 ? f : 1.0f), drawStyle1, ((v5 & 0x80) == 0 ? colorFilter0 : null), ((v5 & 0x100) == 0 ? v4 : 3));
    }

    default void drawImage-AZ2fEMs(@NotNull ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v4, int v5) {
        DrawScope.drawImage-AZ2fEMs$default(this, imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, 0, 0x200, null);
    }

    static void drawImage-AZ2fEMs$default(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, int v6, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long v7 = (v6 & 4) == 0 ? v1 : IntSizeKt.IntSize(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        DrawStyle drawStyle1 = (v6 & 0x40) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawImage-AZ2fEMs(imageBitmap0, ((v6 & 2) == 0 ? v : 0L), v7, ((v6 & 8) == 0 ? v2 : 0L), ((v6 & 16) == 0 ? v3 : v7), ((v6 & 0x20) == 0 ? f : 1.0f), drawStyle1, ((v6 & 0x80) == 0 ? colorFilter0 : null), ((v6 & 0x100) == 0 ? v4 : 3), ((v6 & 0x200) == 0 ? v5 : 1));
    }

    void drawImage-gbVJVH8(@NotNull ImageBitmap arg1, long arg2, @FloatRange(from = 0.0, to = 1.0) float arg3, @NotNull DrawStyle arg4, @Nullable ColorFilter arg5, int arg6);

    static void drawImage-gbVJVH8$default(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawImage-gbVJVH8(imageBitmap0, ((v2 & 2) == 0 ? v : 0L), ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }

    void drawLine-1RTmtNc(@NotNull Brush arg1, long arg2, long arg3, float arg4, int arg5, @Nullable PathEffect arg6, @FloatRange(from = 0.0, to = 1.0) float arg7, @Nullable ColorFilter arg8, int arg9);

    static void drawLine-1RTmtNc$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope0.drawLine-1RTmtNc(brush0, v, v1, ((v4 & 8) == 0 ? f : 0.0f), ((v4 & 16) == 0 ? v2 : 0), ((v4 & 0x20) == 0 ? pathEffect0 : null), ((v4 & 0x40) == 0 ? f1 : 1.0f), ((v4 & 0x80) == 0 ? colorFilter0 : null), ((v4 & 0x100) == 0 ? v3 : 3));
    }

    void drawLine-NGM6Ib0(long arg1, long arg2, long arg3, float arg4, int arg5, @Nullable PathEffect arg6, @FloatRange(from = 0.0, to = 1.0) float arg7, @Nullable ColorFilter arg8, int arg9);

    static void drawLine-NGM6Ib0$default(DrawScope drawScope0, long v, long v1, long v2, float f, int v3, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v4, int v5, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope0.drawLine-NGM6Ib0(v, v1, v2, ((v5 & 8) == 0 ? f : 0.0f), ((v5 & 16) == 0 ? v3 : 0), ((v5 & 0x20) == 0 ? pathEffect0 : null), ((v5 & 0x40) == 0 ? f1 : 1.0f), ((v5 & 0x80) == 0 ? colorFilter0 : null), ((v5 & 0x100) == 0 ? v4 : 3));
    }

    void drawOval-AsUm42w(@NotNull Brush arg1, long arg2, long arg3, @FloatRange(from = 0.0, to = 1.0) float arg4, @NotNull DrawStyle arg5, @Nullable ColorFilter arg6, int arg7);

    static void drawOval-AsUm42w$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long v4 = (v3 & 2) == 0 ? v : 0L;
        long v5 = (v3 & 4) == 0 ? v1 : DrawScope.a(drawScope0.getSize-NH-jbRc(), v4);
        DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawOval-AsUm42w(brush0, v4, v5, ((v3 & 8) == 0 ? f : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
    }

    void drawOval-n-J9OG0(long arg1, long arg2, long arg3, @FloatRange(from = 0.0, to = 1.0) float arg4, @NotNull DrawStyle arg5, @Nullable ColorFilter arg6, int arg7);

    static void drawOval-n-J9OG0$default(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long v5 = (v4 & 2) == 0 ? v1 : 0L;
        long v6 = (v4 & 4) == 0 ? v2 : DrawScope.a(drawScope0.getSize-NH-jbRc(), v5);
        DrawStyle drawStyle1 = (v4 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawOval-n-J9OG0(v, v5, v6, ((v4 & 8) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x20) == 0 ? colorFilter0 : null), ((v4 & 0x40) == 0 ? v3 : 3));
    }

    void drawPath-GBMwjPU(@NotNull Path arg1, @NotNull Brush arg2, @FloatRange(from = 0.0, to = 1.0) float arg3, @NotNull DrawStyle arg4, @Nullable ColorFilter arg5, int arg6);

    static void drawPath-GBMwjPU$default(DrawScope drawScope0, Path path0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if((v1 & 4) != 0) {
            f = 1.0f;
        }
        if((v1 & 8) != 0) {
            drawStyle0 = Fill.INSTANCE;
        }
        if((v1 & 16) != 0) {
            colorFilter0 = null;
        }
        if((v1 & 0x20) != 0) {
            v = 3;
        }
        drawScope0.drawPath-GBMwjPU(path0, brush0, f, drawStyle0, colorFilter0, v);
    }

    void drawPath-LG529CI(@NotNull Path arg1, long arg2, @FloatRange(from = 0.0, to = 1.0) float arg3, @NotNull DrawStyle arg4, @Nullable ColorFilter arg5, int arg6);

    static void drawPath-LG529CI$default(DrawScope drawScope0, Path path0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawPath-LG529CI(path0, v, ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }

    void drawPoints-F8ZwMP8(@NotNull List arg1, int arg2, long arg3, float arg4, int arg5, @Nullable PathEffect arg6, @FloatRange(from = 0.0, to = 1.0) float arg7, @Nullable ColorFilter arg8, int arg9);

    static void drawPoints-F8ZwMP8$default(DrawScope drawScope0, List list0, int v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope0.drawPoints-F8ZwMP8(list0, v, v1, ((v4 & 8) == 0 ? f : 0.0f), ((v4 & 16) == 0 ? v2 : 0), ((v4 & 0x20) == 0 ? pathEffect0 : null), ((v4 & 0x40) == 0 ? f1 : 1.0f), ((v4 & 0x80) == 0 ? colorFilter0 : null), ((v4 & 0x100) == 0 ? v3 : 3));
    }

    void drawPoints-Gsft0Ws(@NotNull List arg1, int arg2, @NotNull Brush arg3, float arg4, int arg5, @Nullable PathEffect arg6, @FloatRange(from = 0.0, to = 1.0) float arg7, @Nullable ColorFilter arg8, int arg9);

    static void drawPoints-Gsft0Ws$default(DrawScope drawScope0, List list0, int v, Brush brush0, float f, int v1, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope0.drawPoints-Gsft0Ws(list0, v, brush0, ((v3 & 8) == 0 ? f : 0.0f), ((v3 & 16) == 0 ? v1 : 0), ((v3 & 0x20) == 0 ? pathEffect0 : null), ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? colorFilter0 : null), ((v3 & 0x100) == 0 ? v2 : 3));
    }

    void drawRect-AsUm42w(@NotNull Brush arg1, long arg2, long arg3, @FloatRange(from = 0.0, to = 1.0) float arg4, @NotNull DrawStyle arg5, @Nullable ColorFilter arg6, int arg7);

    static void drawRect-AsUm42w$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long v4 = (v3 & 2) == 0 ? v : 0L;
        long v5 = (v3 & 4) == 0 ? v1 : DrawScope.a(drawScope0.getSize-NH-jbRc(), v4);
        DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawRect-AsUm42w(brush0, v4, v5, ((v3 & 8) == 0 ? f : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
    }

    void drawRect-n-J9OG0(long arg1, long arg2, long arg3, @FloatRange(from = 0.0, to = 1.0) float arg4, @NotNull DrawStyle arg5, @Nullable ColorFilter arg6, int arg7);

    static void drawRect-n-J9OG0$default(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long v5 = (v4 & 2) == 0 ? v1 : 0L;
        long v6 = (v4 & 4) == 0 ? v2 : DrawScope.a(drawScope0.getSize-NH-jbRc(), v5);
        DrawStyle drawStyle1 = (v4 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawRect-n-J9OG0(v, v5, v6, ((v4 & 8) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x20) == 0 ? colorFilter0 : null), ((v4 & 0x40) == 0 ? v3 : 3));
    }

    void drawRoundRect-ZuiqVtQ(@NotNull Brush arg1, long arg2, long arg3, long arg4, @FloatRange(from = 0.0, to = 1.0) float arg5, @NotNull DrawStyle arg6, @Nullable ColorFilter arg7, int arg8);

    static void drawRoundRect-ZuiqVtQ$default(DrawScope drawScope0, Brush brush0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long v5 = (v4 & 2) == 0 ? v : 0L;
        long v6 = (v4 & 4) == 0 ? v1 : DrawScope.a(drawScope0.getSize-NH-jbRc(), v5);
        DrawStyle drawStyle1 = (v4 & 0x20) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawRoundRect-ZuiqVtQ(brush0, v5, v6, ((v4 & 8) == 0 ? v2 : 0L), ((v4 & 16) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x40) == 0 ? colorFilter0 : null), ((v4 & 0x80) == 0 ? v3 : 3));
    }

    void drawRoundRect-u-Aw5IA(long arg1, long arg2, long arg3, long arg4, @NotNull DrawStyle arg5, @FloatRange(from = 0.0, to = 1.0) float arg6, @Nullable ColorFilter arg7, int arg8);

    static void drawRoundRect-u-Aw5IA$default(DrawScope drawScope0, long v, long v1, long v2, long v3, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v4, int v5, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long v6 = (v5 & 2) == 0 ? v1 : 0L;
        long v7 = (v5 & 4) == 0 ? v2 : DrawScope.a(drawScope0.getSize-NH-jbRc(), v6);
        DrawStyle drawStyle1 = (v5 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
        drawScope0.drawRoundRect-u-Aw5IA(v, v6, v7, ((v5 & 8) == 0 ? v3 : 0L), drawStyle1, ((v5 & 0x20) == 0 ? f : 1.0f), ((v5 & 0x40) == 0 ? colorFilter0 : null), ((v5 & 0x80) == 0 ? v4 : 3));
    }

    default long getCenter-F1C5BW0() {
        return SizeKt.getCenter-uvyYCjk(this.getDrawContext().getSize-NH-jbRc());
    }

    @NotNull
    DrawContext getDrawContext();

    @NotNull
    LayoutDirection getLayoutDirection();

    default long getSize-NH-jbRc() {
        return this.getDrawContext().getSize-NH-jbRc();
    }

    default void record-JVtK1S4(@NotNull GraphicsLayer graphicsLayer0, long v, @NotNull Function1 function10) {
        graphicsLayer0.record-mL-hObY(this, this.getLayoutDirection(), v, new b2(16, this, function10));
    }

    static void record-JVtK1S4$default(DrawScope drawScope0, GraphicsLayer graphicsLayer0, long v, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if((v1 & 1) != 0) {
            v = IntSizeKt.toIntSize-uvyYCjk(drawScope0.getSize-NH-jbRc());
        }
        drawScope0.record-JVtK1S4(graphicsLayer0, v, function10);
    }
}

