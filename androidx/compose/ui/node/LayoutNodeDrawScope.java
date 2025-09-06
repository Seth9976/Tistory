package androidx.compose.ui.node;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006Jq\u0010\u001C\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJq\u0010\u001C\u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 JY\u0010%\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010!\u001A\u00020\t2\b\b\u0002\u0010\"\u001A\u00020\u000E2\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$JY\u0010%\u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010!\u001A\u00020\t2\b\b\u0002\u0010\"\u001A\u00020\u000E2\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'JO\u0010,\u001A\u00020\u00192\u0006\u0010)\u001A\u00020(2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+Jm\u0010,\u001A\u00020\u00192\u0006\u0010)\u001A\u00020(2\b\b\u0002\u0010.\u001A\u00020-2\b\b\u0002\u00100\u001A\u00020/2\b\b\u0002\u00101\u001A\u00020-2\b\b\u0002\u00102\u001A\u00020/2\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104Jw\u0010,\u001A\u00020\u00192\u0006\u0010)\u001A\u00020(2\b\b\u0002\u0010.\u001A\u00020-2\b\b\u0002\u00100\u001A\u00020/2\b\b\u0002\u00101\u001A\u00020-2\b\b\u0002\u00102\u001A\u00020/2\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u00106\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108Jk\u0010B\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\u0006\u00109\u001A\u00020\u000E2\u0006\u0010:\u001A\u00020\u000E2\b\b\u0002\u0010;\u001A\u00020\t2\b\b\u0002\u0010=\u001A\u00020<2\n\b\u0002\u0010?\u001A\u0004\u0018\u00010>2\b\b\u0003\u0010\u0012\u001A\u00020\t2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010AJk\u0010B\u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u00109\u001A\u00020\u000E2\u0006\u0010:\u001A\u00020\u000E2\b\b\u0002\u0010;\u001A\u00020\t2\b\b\u0002\u0010=\u001A\u00020<2\n\b\u0002\u0010?\u001A\u0004\u0018\u00010>2\b\b\u0003\u0010\u0012\u001A\u00020\t2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bC\u0010DJY\u0010G\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bE\u0010FJY\u0010G\u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bH\u0010IJM\u0010N\u001A\u00020\u00192\u0006\u0010K\u001A\u00020J2\u0006\u0010\b\u001A\u00020\u00072\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bL\u0010MJM\u0010N\u001A\u00020\u00192\u0006\u0010K\u001A\u00020J2\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bO\u0010PJq\u0010W\u001A\u00020\u00192\f\u0010R\u001A\b\u0012\u0004\u0012\u00020\u000E0Q2\u0006\u0010T\u001A\u00020S2\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010;\u001A\u00020\t2\b\b\u0002\u0010=\u001A\u00020<2\n\b\u0002\u0010?\u001A\u0004\u0018\u00010>2\b\b\u0003\u0010\u0012\u001A\u00020\t2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bU\u0010VJq\u0010W\u001A\u00020\u00192\f\u0010R\u001A\b\u0012\u0004\u0012\u00020\u000E0Q2\u0006\u0010T\u001A\u00020S2\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010;\u001A\u00020\t2\b\b\u0002\u0010=\u001A\u00020<2\n\b\u0002\u0010?\u001A\u0004\u0018\u00010>2\b\b\u0003\u0010\u0012\u001A\u00020\t2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bX\u0010YJY\u0010[\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bZ\u0010FJY\u0010[\u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\\\u0010IJc\u0010a\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010^\u001A\u00020]2\b\b\u0003\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b_\u0010`Jc\u0010a\u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010^\u001A\u00020]2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0003\u0010\u0012\u001A\u00020\t2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bb\u0010cJ:\u0010j\u001A\u00020\u0019*\u00020d2\b\b\u0002\u0010\u0011\u001A\u00020/2\u0017\u0010g\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00190e\u00A2\u0006\u0002\bfH\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bh\u0010iJ\u0017\u0010o\u001A\u00020l*\u00020kH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001A\u00020l*\u00020pH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001A\u00020k*\u00020pH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bs\u0010tJ\u001A\u0010u\u001A\u00020k*\u00020\tH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bv\u0010wJ\u001A\u0010u\u001A\u00020k*\u00020lH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bv\u0010xJ\u0017\u0010|\u001A\u00020y*\u00020\u0010H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bz\u0010{J\u0017\u0010~\u001A\u00020\t*\u00020kH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b}\u0010wJ\u0017\u0010~\u001A\u00020\t*\u00020pH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u007F\u0010tJ\u0019\u0010\u0082\u0001\u001A\u00030\u0081\u0001*\u00030\u0080\u0001H\u0097\u0001\u00A2\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0085\u0001\u001A\u00020\u0010*\u00020yH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0005\b\u0084\u0001\u0010{J\u001A\u0010\u0088\u0001\u001A\u00020p*\u00020kH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001D\u0010\u0088\u0001\u001A\u00020p*\u00020\tH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u0089\u0001\u0010\u0087\u0001J\u001D\u0010\u0088\u0001\u001A\u00020p*\u00020lH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u0089\u0001\u0010\u008A\u0001J\u0012\u0010\u008B\u0001\u001A\u00020\u0019H\u0016\u00A2\u0006\u0006\b\u008B\u0001\u0010\u008C\u0001J*\u0010\u0091\u0001\u001A\u00020\u0019*\u00030\u008D\u00012\b\u0010\u008F\u0001\u001A\u00030\u008E\u00012\t\u0010\u0090\u0001\u001A\u0004\u0018\u00010d\u00A2\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001JF\u0010\u0099\u0001\u001A\u00020\u00192\b\u0010\u008F\u0001\u001A\u00030\u008E\u00012\u0006\u0010\u0011\u001A\u00020\u00102\b\u0010\u0094\u0001\u001A\u00030\u0093\u00012\b\u0010\u0096\u0001\u001A\u00030\u0095\u00012\t\u0010\u0090\u0001\u001A\u0004\u0018\u00010dH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001JF\u0010\u009C\u0001\u001A\u00020\u00192\b\u0010\u008F\u0001\u001A\u00030\u008E\u00012\u0006\u0010\u0011\u001A\u00020\u00102\b\u0010\u0094\u0001\u001A\u00030\u0093\u00012\b\u0010\u0096\u0001\u001A\u00030\u008D\u00012\t\u0010\u0090\u0001\u001A\u0004\u0018\u00010dH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u009A\u0001\u0010\u009B\u0001R\u001B\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\u0010\n\u0006\b\u009D\u0001\u0010\u009E\u0001\u001A\u0006\b\u009F\u0001\u0010\u00A0\u0001R\u001C\u0010\"\u001A\u00020\u000E8VX\u0096\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\b\u001A\u0006\b\u00A1\u0001\u0010\u00A2\u0001R\u0017\u0010\u00A5\u0001\u001A\u00020\t8\u0016X\u0097\u0005\u00A2\u0006\b\u001A\u0006\b\u00A3\u0001\u0010\u00A4\u0001R\u0018\u0010\u00A9\u0001\u001A\u00030\u00A6\u00018\u0016X\u0096\u0005\u00A2\u0006\b\u001A\u0006\b\u00A7\u0001\u0010\u00A8\u0001R\u0017\u0010\u00AB\u0001\u001A\u00020\t8\u0016X\u0097\u0005\u00A2\u0006\b\u001A\u0006\b\u00AA\u0001\u0010\u00A4\u0001R\u0018\u0010\u00AF\u0001\u001A\u00030\u00AC\u00018\u0016X\u0096\u0005\u00A2\u0006\b\u001A\u0006\b\u00AD\u0001\u0010\u00AE\u0001R\u001C\u0010\u0011\u001A\u00020\u00108VX\u0096\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\b\u001A\u0006\b\u00B0\u0001\u0010\u00A2\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00B1\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", "color", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "start", "end", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "record", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "drawContent", "()V", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "layer", "performDraw", "(Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/Modifier$Node;", "drawNode", "draw-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "drawDirect-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "drawDirect", "a", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getCanvasDrawScope", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getCenter-F1C5BW0", "()J", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,133:1\n256#2:134\n329#2,26:225\n78#3:135\n78#3:179\n78#3:180\n78#3:181\n432#4,6:136\n442#4,2:143\n444#4,8:148\n452#4,9:159\n461#4,8:171\n432#4,6:182\n442#4,2:189\n444#4,8:194\n452#4,9:205\n461#4,8:217\n264#5:142\n264#5:188\n245#6,3:145\n248#6,3:168\n245#6,3:191\n248#6,3:214\n1208#7:156\n1187#7,2:157\n1208#7:202\n1187#7,2:203\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n48#1:134\n102#1:225,26\n56#1:135\n63#1:179\n75#1:180\n88#1:181\n56#1:136,6\n56#1:143,2\n56#1:148,8\n56#1:159,9\n56#1:171,8\n88#1:182,6\n88#1:189,2\n88#1:194,8\n88#1:205,9\n88#1:217,8\n56#1:142\n88#1:188\n56#1:145,3\n56#1:168,3\n88#1:191,3\n88#1:214,3\n56#1:156\n56#1:157,2\n88#1:202\n88#1:203,2\n*E\n"})
public final class LayoutNodeDrawScope implements ContentDrawScope, DrawScope {
    public static final int $stable;
    public final CanvasDrawScope a;
    public DrawModifierNode b;

    public LayoutNodeDrawScope() {
        this(null, 1, null);
    }

    public LayoutNodeDrawScope(@NotNull CanvasDrawScope canvasDrawScope0) {
        this.a = canvasDrawScope0;
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            canvasDrawScope0 = new CanvasDrawScope();
        }
        this(canvasDrawScope0);
    }

    public final void draw-eZhPAX0$ui_release(@NotNull Canvas canvas0, long v, @NotNull NodeCoordinator nodeCoordinator0, @NotNull Node modifier$Node0, @Nullable GraphicsLayer graphicsLayer0) {
        MutableVector mutableVector0 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof DrawModifierNode) {
                this.drawDirect-eZhPAX0$ui_release(canvas0, v, nodeCoordinator0, ((DrawModifierNode)modifier$Node0), graphicsLayer0);
            }
            else if((modifier$Node0.getKindSet$ui_release() & 4) != 0 && modifier$Node0 instanceof DelegatingNode) {
                Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release();
                int v1 = 0;
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 4) != 0) {
                        ++v1;
                        if(v1 == 1) {
                            modifier$Node0 = modifier$Node1;
                        }
                        else {
                            if(mutableVector0 == null) {
                                mutableVector0 = new MutableVector(new Node[16], 0);
                            }
                            if(modifier$Node0 != null) {
                                mutableVector0.add(modifier$Node0);
                                modifier$Node0 = null;
                            }
                            mutableVector0.add(modifier$Node1);
                        }
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
                if(v1 != 1) {
                    goto label_23;
                }
                continue;
            }
        label_23:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
        }
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawArc-illE91I(@NotNull Brush brush0, float f, float f1, boolean z, long v, long v1, @FloatRange(from = 0.0, to = 1.0) float f2, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v2) {
        this.a.drawArc-illE91I(brush0, f, f1, z, v, v1, f2, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawArc-yD3GUKo(long v, float f, float f1, boolean z, long v1, long v2, @FloatRange(from = 0.0, to = 1.0) float f2, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v3) {
        this.a.drawArc-yD3GUKo(v, f, f1, z, v1, v2, f2, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawCircle-V9BoPsw(@NotNull Brush brush0, float f, long v, @FloatRange(from = 0.0, to = 1.0) float f1, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v1) {
        this.a.drawCircle-V9BoPsw(brush0, f, v, f1, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawCircle-VaOC9Bg(long v, float f, long v1, @FloatRange(from = 0.0, to = 1.0) float f1, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v2) {
        this.a.drawCircle-VaOC9Bg(v, f, v1, f1, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas0 = this.getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode0 = this.b;
        Intrinsics.checkNotNull(drawModifierNode0);
        Node modifier$Node0 = LayoutNodeDrawScopeKt.access$nextDrawNode(drawModifierNode0);
        if(modifier$Node0 != null) {
            MutableVector mutableVector0 = null;
            while(modifier$Node0 != null) {
                if(modifier$Node0 instanceof DrawModifierNode) {
                    this.performDraw(((DrawModifierNode)modifier$Node0), canvas0, this.getDrawContext().getGraphicsLayer());
                }
                else if((modifier$Node0.getKindSet$ui_release() & 4) != 0 && modifier$Node0 instanceof DelegatingNode) {
                    Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release();
                    int v = 0;
                    while(modifier$Node1 != null) {
                        if((modifier$Node1.getKindSet$ui_release() & 4) != 0) {
                            ++v;
                            if(v == 1) {
                                modifier$Node0 = modifier$Node1;
                            }
                            else {
                                if(mutableVector0 == null) {
                                    mutableVector0 = new MutableVector(new Node[16], 0);
                                }
                                if(modifier$Node0 != null) {
                                    mutableVector0.add(modifier$Node0);
                                    modifier$Node0 = null;
                                }
                                mutableVector0.add(modifier$Node1);
                            }
                        }
                        modifier$Node1 = modifier$Node1.getChild$ui_release();
                    }
                    if(v != 1) {
                        goto label_28;
                    }
                    continue;
                }
            label_28:
                modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
            }
            return;
        }
        NodeCoordinator nodeCoordinator0 = DelegatableNodeKt.requireCoordinator-64DMado(drawModifierNode0, 4);
        if(nodeCoordinator0.getTail() == drawModifierNode0.getNode()) {
            nodeCoordinator0 = nodeCoordinator0.getWrapped$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator0);
        }
        nodeCoordinator0.performDraw(canvas0, this.getDrawContext().getGraphicsLayer());
    }

    public final void drawDirect-eZhPAX0$ui_release(@NotNull Canvas canvas0, long v, @NotNull NodeCoordinator nodeCoordinator0, @NotNull DrawModifierNode drawModifierNode0, @Nullable GraphicsLayer graphicsLayer0) {
        DrawModifierNode drawModifierNode1 = this.b;
        this.b = drawModifierNode0;
        LayoutDirection layoutDirection0 = nodeCoordinator0.getLayoutDirection();
        Density density0 = this.a.getDrawContext().getDensity();
        LayoutDirection layoutDirection1 = this.a.getDrawContext().getLayoutDirection();
        Canvas canvas1 = this.a.getDrawContext().getCanvas();
        long v1 = this.a.getDrawContext().getSize-NH-jbRc();
        GraphicsLayer graphicsLayer1 = this.a.getDrawContext().getGraphicsLayer();
        DrawContext drawContext0 = this.a.getDrawContext();
        drawContext0.setDensity(nodeCoordinator0);
        drawContext0.setLayoutDirection(layoutDirection0);
        drawContext0.setCanvas(canvas0);
        drawContext0.setSize-uvyYCjk(v);
        drawContext0.setGraphicsLayer(graphicsLayer0);
        canvas0.save();
        try {
            drawModifierNode0.draw(this);
        }
        finally {
            canvas0.restore();
            DrawContext drawContext1 = this.a.getDrawContext();
            drawContext1.setDensity(density0);
            drawContext1.setLayoutDirection(layoutDirection1);
            drawContext1.setCanvas(canvas1);
            drawContext1.setSize-uvyYCjk(v1);
            drawContext1.setGraphicsLayer(graphicsLayer1);
        }
        this.b = drawModifierNode1;
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public void drawImage-9jGpkUE(ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @FloatRange(from = 0.0, to = 1.0) float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4) {
        this.a.drawImage-9jGpkUE(imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawImage-AZ2fEMs(@NotNull ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v4, int v5) {
        this.a.drawImage-AZ2fEMs(imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawImage-gbVJVH8(@NotNull ImageBitmap imageBitmap0, long v, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v1) {
        this.a.drawImage-gbVJVH8(imageBitmap0, v, f, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawLine-1RTmtNc(@NotNull Brush brush0, long v, long v1, float f, int v2, @Nullable PathEffect pathEffect0, @FloatRange(from = 0.0, to = 1.0) float f1, @Nullable ColorFilter colorFilter0, int v3) {
        this.a.drawLine-1RTmtNc(brush0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawLine-NGM6Ib0(long v, long v1, long v2, float f, int v3, @Nullable PathEffect pathEffect0, @FloatRange(from = 0.0, to = 1.0) float f1, @Nullable ColorFilter colorFilter0, int v4) {
        this.a.drawLine-NGM6Ib0(v, v1, v2, f, v3, pathEffect0, f1, colorFilter0, v4);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawOval-AsUm42w(@NotNull Brush brush0, long v, long v1, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v2) {
        this.a.drawOval-AsUm42w(brush0, v, v1, f, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawOval-n-J9OG0(long v, long v1, long v2, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v3) {
        this.a.drawOval-n-J9OG0(v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPath-GBMwjPU(@NotNull Path path0, @NotNull Brush brush0, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v) {
        this.a.drawPath-GBMwjPU(path0, brush0, f, drawStyle0, colorFilter0, v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPath-LG529CI(@NotNull Path path0, long v, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v1) {
        this.a.drawPath-LG529CI(path0, v, f, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPoints-F8ZwMP8(@NotNull List list0, int v, long v1, float f, int v2, @Nullable PathEffect pathEffect0, @FloatRange(from = 0.0, to = 1.0) float f1, @Nullable ColorFilter colorFilter0, int v3) {
        this.a.drawPoints-F8ZwMP8(list0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPoints-Gsft0Ws(@NotNull List list0, int v, @NotNull Brush brush0, float f, int v1, @Nullable PathEffect pathEffect0, @FloatRange(from = 0.0, to = 1.0) float f1, @Nullable ColorFilter colorFilter0, int v2) {
        this.a.drawPoints-Gsft0Ws(list0, v, brush0, f, v1, pathEffect0, f1, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRect-AsUm42w(@NotNull Brush brush0, long v, long v1, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v2) {
        this.a.drawRect-AsUm42w(brush0, v, v1, f, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRect-n-J9OG0(long v, long v1, long v2, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v3) {
        this.a.drawRect-n-J9OG0(v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRoundRect-ZuiqVtQ(@NotNull Brush brush0, long v, long v1, long v2, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v3) {
        this.a.drawRoundRect-ZuiqVtQ(brush0, v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRoundRect-u-Aw5IA(long v, long v1, long v2, long v3, @NotNull DrawStyle drawStyle0, @FloatRange(from = 0.0, to = 1.0) float f, @Nullable ColorFilter colorFilter0, int v4) {
        this.a.drawRoundRect-u-Aw5IA(v, v1, v2, v3, drawStyle0, f, colorFilter0, v4);
    }

    @NotNull
    public final CanvasDrawScope getCanvasDrawScope() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long getCenter-F1C5BW0() {
        return this.a.getCenter-F1C5BW0();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.a.getDrawContext();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.a.getFontScale();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long getSize-NH-jbRc() {
        return this.a.getSize-NH-jbRc();
    }

    public final void performDraw(@NotNull DrawModifierNode drawModifierNode0, @NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        NodeCoordinator nodeCoordinator0 = DelegatableNodeKt.requireCoordinator-64DMado(drawModifierNode0, 4);
        long v = IntSizeKt.toSize-ozmzZPI(nodeCoordinator0.getSize-YbymL2g());
        nodeCoordinator0.getLayoutNode().getMDrawScope$ui_release().drawDirect-eZhPAX0$ui_release(canvas0, v, nodeCoordinator0, drawModifierNode0, graphicsLayer0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void record-JVtK1S4(@NotNull GraphicsLayer graphicsLayer0, long v, @NotNull Function1 function10) {
        this.a.record-JVtK1S4(graphicsLayer0, v, function10);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx--R2X_6o(long v) {
        return this.a.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx-0680j_4(float f) {
        return this.a.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public float toDp-GaN1DYA(long v) {
        return this.a.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(float f) {
        return this.a.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(int v) {
        return this.a.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toDpSize-k-rfVVM(long v) {
        return this.a.toDpSize-k-rfVVM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx--R2X_6o(long v) {
        return this.a.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx-0680j_4(float f) {
        return this.a.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect0) {
        return this.a.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSize-XkaWNTQ(long v) {
        return this.a.toSize-XkaWNTQ(v);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public long toSp-0xMU5do(float f) {
        return this.a.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(float f) {
        return this.a.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(int v) {
        return this.a.toSp-kPz2Gy4(v);
    }
}

