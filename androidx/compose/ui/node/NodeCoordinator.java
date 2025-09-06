package androidx.compose.ui.node;

import a2.b;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material3.s9;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import b2.d;
import b2.j;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u00FA\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b \u0018\u0000 \u0093\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0093\u0002\u0094\u0002B\u000F\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ4\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\rH\u0086\b\u00A2\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0011\u001A\u00020\u000F\"\u0006\b\u0000\u0010\u0013\u0018\u00012\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000F0\rH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001E\u0010\u001A\u001A\u0004\u0018\u00010\u000E2\n\u0010\u0015\u001A\u0006\u0012\u0002\b\u00030\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001B\u001A\u00020\u000B\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001F\u001A\u00020\u000FH\u0010\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u000FH&\u00A2\u0006\u0004\b \u0010\u001EJ\u001F\u0010#\u001A\u00020\u000F2\u0006\u0010!\u001A\u00020\t2\u0006\u0010\"\u001A\u00020\tH\u0014\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010&\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b%\u0010\u001EJ+\u0010-\u001A\u00020*2\u0006\u0010(\u001A\u00020\'2\u000E\b\u0004\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020*0)H\u0084\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,J\r\u0010.\u001A\u00020\u000F\u00A2\u0006\u0004\b.\u0010\u001EJ=\u00108\u001A\u00020\u000F2\u0006\u00100\u001A\u00020/2\u0006\u00102\u001A\u0002012\u0019\u00105\u001A\u0015\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000F\u0018\u00010\r\u00A2\u0006\u0002\b4H\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b6\u00107J*\u00108\u001A\u00020\u000F2\u0006\u00100\u001A\u00020/2\u0006\u00102\u001A\u0002012\u0006\u0010:\u001A\u000209H\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b6\u0010;J\r\u0010<\u001A\u00020\u000F\u00A2\u0006\u0004\b<\u0010\u001EJE\u0010?\u001A\u00020\u000F2\u0006\u00100\u001A\u00020/2\u0006\u00102\u001A\u0002012\u0019\u00105\u001A\u0015\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000F\u0018\u00010\r\u00A2\u0006\u0002\b42\b\u0010:\u001A\u0004\u0018\u000109\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010>J\u001F\u0010C\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020@2\b\u0010B\u001A\u0004\u0018\u000109\u00A2\u0006\u0004\bC\u0010DJ!\u0010E\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020@2\b\u0010B\u001A\u0004\u0018\u000109H\u0016\u00A2\u0006\u0004\bE\u0010DJ\r\u0010F\u001A\u00020\u000F\u00A2\u0006\u0004\bF\u0010\u001EJ2\u0010H\u001A\u00020\u000F2\u0019\u00105\u001A\u0015\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000F\u0018\u00010\r\u00A2\u0006\u0002\b42\b\b\u0002\u0010G\u001A\u00020\u000B\u00A2\u0006\u0004\bH\u0010IJ8\u0010T\u001A\u00020\u000F2\u0006\u0010K\u001A\u00020J2\u0006\u0010M\u001A\u00020L2\u0006\u0010O\u001A\u00020N2\u0006\u0010P\u001A\u00020\u000B2\u0006\u0010Q\u001A\u00020\u000B\u00F8\u0001\u0000\u00A2\u0006\u0004\bR\u0010SJ:\u0010V\u001A\u00020\u000F2\u0006\u0010K\u001A\u00020J2\u0006\u0010M\u001A\u00020L2\u0006\u0010O\u001A\u00020N2\u0006\u0010P\u001A\u00020\u000B2\u0006\u0010Q\u001A\u00020\u000BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bU\u0010SJ\r\u0010X\u001A\u00020W\u00A2\u0006\u0004\bX\u0010YJ\u001A\u0010]\u001A\u00020L2\u0006\u0010Z\u001A\u00020LH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b[\u0010\\J\u001A\u0010`\u001A\u00020L2\u0006\u0010^\u001A\u00020LH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b_\u0010\\J\u001A\u0010c\u001A\u00020L2\u0006\u0010a\u001A\u00020LH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bb\u0010\\J\u001A\u0010e\u001A\u00020L2\u0006\u0010^\u001A\u00020LH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bd\u0010\\J\"\u0010j\u001A\u00020L2\u0006\u0010f\u001A\u00020\u00032\u0006\u0010g\u001A\u00020LH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bh\u0010iJ*\u0010j\u001A\u00020L2\u0006\u0010f\u001A\u00020\u00032\u0006\u0010g\u001A\u00020L2\u0006\u0010k\u001A\u00020\u000BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bl\u0010mJ\"\u0010r\u001A\u00020\u000F2\u0006\u0010f\u001A\u00020\u00032\u0006\u0010o\u001A\u00020nH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bp\u0010qJ\u001A\u0010u\u001A\u00020\u000F2\u0006\u0010o\u001A\u00020nH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bs\u0010tJ\u001F\u0010w\u001A\u00020W2\u0006\u0010f\u001A\u00020\u00032\u0006\u0010v\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\bw\u0010xJ\u001A\u0010z\u001A\u00020L2\u0006\u0010^\u001A\u00020LH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\by\u0010\\J,\u0010{\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020@2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u000F0\rH\u0084\b\u00A2\u0006\u0004\b{\u0010|J$\u0010\u007F\u001A\u00020L2\u0006\u00100\u001A\u00020L2\b\b\u0002\u0010k\u001A\u00020\u000BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b}\u0010~J&\u0010\u0081\u0001\u001A\u00020L2\u0006\u00100\u001A\u00020L2\b\b\u0002\u0010k\u001A\u00020\u000BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0005\b\u0080\u0001\u0010~J$\u0010\u0084\u0001\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020@2\b\u0010\u0083\u0001\u001A\u00030\u0082\u0001H\u0004\u00A2\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u000F\u0010\u0086\u0001\u001A\u00020\u000F\u00A2\u0006\u0005\b\u0086\u0001\u0010\u001EJ\u000F\u0010\u0087\u0001\u001A\u00020\u000F\u00A2\u0006\u0005\b\u0087\u0001\u0010\u001EJ/\u0010\u008D\u0001\u001A\u00020\u000F2\b\u0010\u0089\u0001\u001A\u00030\u0088\u00012\u0006\u0010v\u001A\u00020\u000B2\t\b\u0002\u0010\u008A\u0001\u001A\u00020\u000BH\u0000\u00A2\u0006\u0006\b\u008B\u0001\u0010\u008C\u0001J\u001D\u0010\u0090\u0001\u001A\u00020\u000B2\u0006\u0010M\u001A\u00020LH\u0004\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u008E\u0001\u0010\u008F\u0001J\u001D\u0010\u0092\u0001\u001A\u00020\u000B2\u0006\u0010M\u001A\u00020LH\u0004\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u0091\u0001\u0010\u008F\u0001J\u0011\u0010\u0093\u0001\u001A\u00020\u000FH\u0016\u00A2\u0006\u0005\b\u0093\u0001\u0010\u001EJ\u0011\u0010\u0094\u0001\u001A\u00020\u000FH\u0016\u00A2\u0006\u0005\b\u0094\u0001\u0010\u001EJ\u001B\u0010\u0098\u0001\u001A\u00020\u00002\u0007\u0010\u0095\u0001\u001A\u00020\u0000H\u0000\u00A2\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u000F\u0010\u0099\u0001\u001A\u00020\u000B\u00A2\u0006\u0005\b\u0099\u0001\u0010\u001CJ\u001F\u0010\u009D\u0001\u001A\u00030\u009A\u00012\b\u0010\u009B\u0001\u001A\u00030\u009A\u0001H\u0004\u00F8\u0001\u0000\u00A2\u0006\u0005\b\u009C\u0001\u0010\\J\'\u0010\u00A0\u0001\u001A\u0002012\u0006\u0010M\u001A\u00020L2\b\u0010\u009B\u0001\u001A\u00030\u009A\u0001H\u0004\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u009E\u0001\u0010\u009F\u0001R\u001E\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00A1\u0001\u0010\u00A2\u0001\u001A\u0006\b\u00A3\u0001\u0010\u00A4\u0001R(\u0010\u00AA\u0001\u001A\u00020\u000B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u00A5\u0001\u0010\u00A6\u0001\u001A\u0005\b\u00A7\u0001\u0010\u001C\"\u0006\b\u00A8\u0001\u0010\u00A9\u0001R(\u0010\u00AE\u0001\u001A\u00020\u000B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u00AB\u0001\u0010\u00A6\u0001\u001A\u0005\b\u00AC\u0001\u0010\u001C\"\u0006\b\u00AD\u0001\u0010\u00A9\u0001R+\u0010\u00B5\u0001\u001A\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00AF\u0001\u0010\u00B0\u0001\u001A\u0006\b\u00B1\u0001\u0010\u00B2\u0001\"\u0006\b\u00B3\u0001\u0010\u00B4\u0001R+\u0010\u00B9\u0001\u001A\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00B6\u0001\u0010\u00B0\u0001\u001A\u0006\b\u00B7\u0001\u0010\u00B2\u0001\"\u0006\b\u00B8\u0001\u0010\u00B4\u0001RO\u00105\u001A\u0015\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000F\u0018\u00010\r\u00A2\u0006\u0002\b42\u001A\u0010\u00BA\u0001\u001A\u0015\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000F\u0018\u00010\r\u00A2\u0006\u0002\b48\u0004@BX\u0084\u000E\u00A2\u0006\u0010\n\u0006\b\u00BB\u0001\u0010\u00BC\u0001\u001A\u0006\b\u00BD\u0001\u0010\u00BE\u0001R7\u00100\u001A\u00020/2\u0007\u0010\u00BA\u0001\u001A\u00020/8\u0016@TX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0018\n\u0006\b\u00BF\u0001\u0010\u00C0\u0001\u001A\u0006\b\u00C1\u0001\u0010\u00C2\u0001\"\u0006\b\u00C3\u0001\u0010\u00C4\u0001R1\u00102\u001A\u0002012\u0007\u0010\u00BA\u0001\u001A\u0002018\u0006@DX\u0086\u000E\u00A2\u0006\u0018\n\u0006\b\u00C5\u0001\u0010\u00C6\u0001\u001A\u0006\b\u00C7\u0001\u0010\u00C8\u0001\"\u0006\b\u00C9\u0001\u0010\u00CA\u0001R)\u0010\u00CD\u0001\u001A\u00020\u000B2\u0007\u0010\u00BA\u0001\u001A\u00020\u000B8\u0000@BX\u0080\u000E\u00A2\u0006\u000F\n\u0006\b\u00CB\u0001\u0010\u00A6\u0001\u001A\u0005\b\u00CC\u0001\u0010\u001CR/\u0010:\u001A\u0005\u0018\u00010\u00CE\u00012\n\u0010\u00BA\u0001\u001A\u0005\u0018\u00010\u00CE\u00018\u0006@BX\u0086\u000E\u00A2\u0006\u0010\n\u0006\b\u00CF\u0001\u0010\u00D0\u0001\u001A\u0006\b\u00D1\u0001\u0010\u00D2\u0001R\u0017\u0010\u00D5\u0001\u001A\u00020\u000E8&X\u00A6\u0004\u00A2\u0006\b\u001A\u0006\b\u00D3\u0001\u0010\u00D4\u0001R\u0018\u0010\u00D9\u0001\u001A\u00030\u00D6\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00D7\u0001\u0010\u00D8\u0001R\u0017\u0010\u00DB\u0001\u001A\u0002018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00DA\u0001\u0010\u00C8\u0001R\u0017\u0010\u00DD\u0001\u001A\u0002018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00DC\u0001\u0010\u00C8\u0001R\u0019\u0010\u00E0\u0001\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00DE\u0001\u0010\u00DF\u0001R\u0017\u0010\u00E3\u0001\u001A\u00020\u00038VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00E1\u0001\u0010\u00E2\u0001R\u0016\u0010\u00E5\u0001\u001A\u00020\u000B8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00E4\u0001\u0010\u001CR\u001B\u0010\u00E8\u0001\u001A\u00030\u00E6\u00018F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\b\u001A\u0006\b\u00E7\u0001\u0010\u00C2\u0001R\u0018\u0010\u00EC\u0001\u001A\u00030\u00E9\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00EA\u0001\u0010\u00EB\u0001R\u0019\u0010\u00EE\u0001\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00ED\u0001\u0010\u00DF\u0001R\u0016\u0010\u00F0\u0001\u001A\u00020\u000B8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00EF\u0001\u0010\u001CR\u0016\u0010\u00F1\u0001\u001A\u00020\u000B8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00F1\u0001\u0010\u001CR,\u0010\u00F8\u0001\u001A\u00030\u00F2\u00012\b\u0010\u00F3\u0001\u001A\u00030\u00F2\u00018P@PX\u0090\u000E\u00A2\u0006\u0010\u001A\u0006\b\u00F4\u0001\u0010\u00F5\u0001\"\u0006\b\u00F6\u0001\u0010\u00F7\u0001R0\u0010\u00FE\u0001\u001A\u0005\u0018\u00010\u00F9\u00012\n\u0010\u00BA\u0001\u001A\u0005\u0018\u00010\u00F9\u00018&@dX\u00A6\u000E\u00A2\u0006\u0010\u001A\u0006\b\u00FA\u0001\u0010\u00FB\u0001\"\u0006\b\u00FC\u0001\u0010\u00FD\u0001R\u001F\u0010\u0083\u0002\u001A\n\u0012\u0005\u0012\u00030\u0080\u00020\u00FF\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001A\u0010\u0087\u0002\u001A\u0005\u0018\u00010\u0084\u00028VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0016\u0010\u0089\u0002\u001A\u0004\u0018\u00010\u00038F\u00A2\u0006\b\u001A\u0006\b\u0088\u0002\u0010\u00E2\u0001R\u0016\u0010\u008B\u0002\u001A\u0004\u0018\u00010\u00038F\u00A2\u0006\b\u001A\u0006\b\u008A\u0002\u0010\u00E2\u0001R\u0018\u0010\u008E\u0002\u001A\u00030\u0088\u00018DX\u0084\u0004\u00A2\u0006\b\u001A\u0006\b\u008C\u0002\u0010\u008D\u0002R\u001D\u0010\u0090\u0002\u001A\u00020\'8@X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\b\u001A\u0006\b\u008F\u0002\u0010\u00C2\u0001R\u0016\u0010\u0091\u0002\u001A\u00020\u000B8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0091\u0002\u0010\u001CR\u001B\u0010\u009B\u0001\u001A\u00030\u009A\u00018F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\b\u001A\u0006\b\u0092\u0002\u0010\u00C2\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0095\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "mask", "", "includeTail", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Node;", "", "block", "visitNodes", "(IZLkotlin/jvm/functions/Function1;)V", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "head", "isTransparent", "()Z", "replace$ui_release", "()V", "replace", "ensureLookaheadDelegateCreated", "width", "height", "onMeasureResultChanged", "(II)V", "onCoordinatesUsed$ui_release", "onCoordinatesUsed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "releaseLayer", "placeSelfApparentToRealOffset-MLgxB_4", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelfApparentToRealOffset", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "draw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "performDraw", "onPlaced", "forceUpdateLayerParameters", "updateLayerBlock", "(Lkotlin/jvm/functions/Function1;Z)V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitTestChild-YqVAtuI", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "relativeToScreen", "screenToLocal-MK-Hz9U", "(J)J", "screenToLocal", "relativeToLocal", "localToScreen-MK-Hz9U", "localToScreen", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "transformToScreen-58bKbWc", "([F)V", "transformToScreen", "clipBounds", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "(Landroidx/compose/ui/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "toParentPosition-8S9VItk", "(JZ)J", "toParentPosition", "fromParentPosition-8S9VItk", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V", "onLayoutNodeAttach", "onRelease", "Landroidx/compose/ui/geometry/MutableRect;", "bounds", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "onLayoutModifierNodeChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "n", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "o", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "setForcePlaceWithLookaheadOffset$ui_release", "(Z)V", "forcePlaceWithLookaheadOffset", "p", "getForceMeasureWithLookaheadConstraints$ui_release", "setForceMeasureWithLookaheadConstraints$ui_release", "forceMeasureWithLookaheadConstraints", "q", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "r", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "wrappedBy", "<set-?>", "u", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "A", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "B", "F", "getZIndex", "()F", "setZIndex", "(F)V", "G", "getLastLayerDrawingWasSkipped$ui_release", "lastLayerDrawingWasSkipped", "Landroidx/compose/ui/node/OwnedLayer;", "H", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getIntroducesMotionFrameOfReference", "introducesMotionFrameOfReference", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", "Landroidx/compose/ui/layout/MeasureResult;", "value", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "getLastMeasurementConstraints-msEJaDk$ui_release", "lastMeasurementConstraints", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 11 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1484:1\n104#1,5:1485\n109#1,4:1533\n104#1,9:1537\n115#1:1548\n104#1,13:1549\n117#1:1605\n109#1,10:1606\n115#1:1691\n104#1,13:1692\n117#1:1748\n109#1,10:1749\n115#1:1769\n104#1,13:1770\n117#1:1826\n109#1,10:1827\n432#2,6:1490\n442#2,2:1497\n444#2,8:1502\n452#2,9:1513\n461#2,8:1525\n432#2,6:1562\n442#2,2:1569\n444#2,8:1574\n452#2,9:1585\n461#2,8:1597\n432#2,6:1623\n442#2,2:1630\n444#2,8:1635\n452#2,9:1646\n461#2,8:1658\n432#2,6:1705\n442#2,2:1712\n444#2,8:1717\n452#2,9:1728\n461#2,8:1740\n432#2,6:1783\n442#2,2:1790\n444#2,8:1795\n452#2,9:1806\n461#2,8:1818\n220#2:1904\n221#2,8:1912\n233#2:1922\n204#2:1923\n205#2,6:1931\n234#2:1937\n432#2,6:1938\n442#2,2:1945\n444#2,8:1950\n452#2,9:1961\n461#2,8:1973\n235#2:1981\n212#2,3:1982\n264#3:1496\n264#3:1568\n264#3:1621\n264#3:1629\n264#3:1711\n264#3:1789\n264#3:1944\n245#4,3:1499\n248#4,3:1522\n245#4,3:1571\n248#4,3:1594\n245#4,3:1632\n248#4,3:1655\n245#4,3:1714\n248#4,3:1737\n245#4,3:1792\n248#4,3:1815\n245#4,3:1947\n248#4,3:1970\n1208#5:1510\n1187#5,2:1511\n1208#5:1582\n1187#5,2:1583\n1208#5:1643\n1187#5,2:1644\n1208#5:1725\n1187#5,2:1726\n1208#5:1803\n1187#5,2:1804\n1208#5:1958\n1187#5,2:1959\n1#6:1546\n78#7:1547\n86#7:1616\n86#7:1620\n86#7:1622\n88#7:1683\n88#7:1690\n78#7:1767\n88#7:1768\n76#7:1860\n76#7:1903\n82#7:1920\n82#7:1921\n751#8,3:1617\n754#8,3:1666\n42#9,7:1669\n42#9,7:1676\n96#9,7:1760\n96#9,7:1837\n66#9,9:1844\n42#9,7:1853\n42#9,7:1861\n42#9,7:1868\n42#9,7:1875\n42#9,7:1882\n42#9,7:1889\n42#9,7:1896\n42#9,7:1905\n42#9,7:1924\n602#10,6:1684\n609#10:1759\n66#11,5:1985\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n115#1:1485,5\n115#1:1533,4\n125#1:1537,9\n234#1:1548\n234#1:1549,13\n234#1:1605\n234#1:1606,10\n313#1:1691\n313#1:1692,13\n313#1:1748\n313#1:1749,10\n459#1:1769\n459#1:1770,13\n459#1:1826\n459#1:1827,10\n116#1:1490,6\n116#1:1497,2\n116#1:1502,8\n116#1:1513,9\n116#1:1525,8\n234#1:1562,6\n234#1:1569,2\n234#1:1574,8\n234#1:1585,9\n234#1:1597,8\n258#1:1623,6\n258#1:1630,2\n258#1:1635,8\n258#1:1646,9\n258#1:1658,8\n313#1:1705,6\n313#1:1712,2\n313#1:1717,8\n313#1:1728,9\n313#1:1740,8\n459#1:1783,6\n459#1:1790,2\n459#1:1795,8\n459#1:1806,9\n459#1:1818,8\n1192#1:1904\n1192#1:1912,8\n1230#1:1922\n1230#1:1923\n1230#1:1931,6\n1230#1:1937\n1230#1:1938,6\n1230#1:1945,2\n1230#1:1950,8\n1230#1:1961,9\n1230#1:1973,8\n1230#1:1981\n1230#1:1982,3\n116#1:1496\n234#1:1568\n257#1:1621\n258#1:1629\n313#1:1711\n459#1:1789\n1230#1:1944\n116#1:1499,3\n116#1:1522,3\n234#1:1571,3\n234#1:1594,3\n258#1:1632,3\n258#1:1655,3\n313#1:1714,3\n313#1:1737,3\n459#1:1792,3\n459#1:1815,3\n1230#1:1947,3\n1230#1:1970,3\n116#1:1510\n116#1:1511,2\n234#1:1582\n234#1:1583,2\n258#1:1643\n258#1:1644,2\n313#1:1725\n313#1:1726,2\n459#1:1803\n459#1:1804,2\n1230#1:1958\n1230#1:1959,2\n234#1:1547\n250#1:1616\n257#1:1620\n258#1:1622\n311#1:1683\n313#1:1690\n445#1:1767\n459#1:1768\n746#1:1860\n1192#1:1903\n1224#1:1920\n1230#1:1921\n256#1:1617,3\n256#1:1666,3\n275#1:1669,7\n282#1:1676,7\n355#1:1760,7\n484#1:1837,7\n531#1:1844,9\n552#1:1853,7\n816#1:1861,7\n824#1:1868,7\n831#1:1875,7\n933#1:1882,7\n934#1:1889,7\n992#1:1896,7\n1192#1:1905,7\n1230#1:1924,7\n312#1:1684,6\n312#1:1759\n1274#1:1985,5\n*E\n"})
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements LayoutCoordinates, Measurable, OwnerScope {
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000BR\u0014\u0010\u000E\u001A\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000E\u0010\u000FR \u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001A\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001A\u001A\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001A\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Lb2/j;", "tmpLayerPositionalProperties", "Lb2/j;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.O;
        }

        @NotNull
        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.P;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0019\u0010\u000F\u001A\u0006\u0012\u0002\b\u00030\u0010H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\u0015H&J\u0010\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00020\u0005H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface HitTestSource {
        void childHitTest-YqVAtuI(@NotNull LayoutNode arg1, long arg2, @NotNull HitTestResult arg3, boolean arg4, boolean arg5);

        int entityType-OLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@NotNull Node arg1);

        boolean shouldHitTestChildren(@NotNull LayoutNode arg1);
    }

    public static final int $stable = 0;
    public long A;
    public float B;
    public MutableRect C;
    @NotNull
    public static final Companion Companion = null;
    public j D;
    public final b1 E;
    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public final b F;
    public boolean G;
    public OwnedLayer H;
    public GraphicsLayer I;
    public static final y J = null;
    public static final d K = null;
    public static final ReusableGraphicsLayerScope L = null;
    public static final j M = null;
    public static final float[] N = null;
    public static final NodeCoordinator.Companion.PointerInputSource.1 O = null;
    public static final NodeCoordinator.Companion.SemanticsSource.1 P = null;
    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    public final LayoutNode n;
    public boolean o;
    public boolean p;
    public NodeCoordinator q;
    public NodeCoordinator r;
    public boolean s;
    public boolean t;
    public Function1 u;
    public Density v;
    public LayoutDirection w;
    public float x;
    public MeasureResult y;
    public LinkedHashMap z;

    static {
        NodeCoordinator.Companion = new Companion(null);
        NodeCoordinator.J = y.w;
        NodeCoordinator.K = d.A;
        NodeCoordinator.L = new ReusableGraphicsLayerScope();
        NodeCoordinator.M = new j();
        NodeCoordinator.N = Matrix.constructor-impl$default(null, 1, null);
        NodeCoordinator.O = new NodeCoordinator.Companion.PointerInputSource.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        NodeCoordinator.P = new NodeCoordinator.Companion.SemanticsSource.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public NodeCoordinator(@NotNull LayoutNode layoutNode0) {
        this.n = layoutNode0;
        this.v = this.getLayoutNode().getDensity();
        this.w = this.getLayoutNode().getLayoutDirection();
        this.x = 0.8f;
        this.A = 0L;
        this.E = new b1(this, 8);
        this.F = new b(this, 24);
    }

    public static final void access$drawContainedDrawModifiers(NodeCoordinator nodeCoordinator0, Canvas canvas0, GraphicsLayer graphicsLayer0) {
        nodeCoordinator0.getClass();
        Node modifier$Node0 = nodeCoordinator0.head-H91voCI(4);
        if(modifier$Node0 == null) {
            nodeCoordinator0.performDraw(canvas0, graphicsLayer0);
            return;
        }
        nodeCoordinator0.getLayoutNode().getMDrawScope$ui_release().draw-eZhPAX0$ui_release(canvas0, IntSizeKt.toSize-ozmzZPI(nodeCoordinator0.getSize-YbymL2g()), nodeCoordinator0, modifier$Node0, graphicsLayer0);
    }

    public static final ReusableGraphicsLayerScope access$getGraphicsLayerScope$cp() {
        return NodeCoordinator.L;
    }

    public static final Function1 access$getOnCommitAffectingLayer$cp() {
        return NodeCoordinator.K;
    }

    public static final OwnerSnapshotObserver access$getSnapshotObserver(NodeCoordinator nodeCoordinator0) {
        return LayoutNodeKt.requireOwner(nodeCoordinator0.getLayoutNode()).getSnapshotObserver();
    }

    public static final void access$hit-1hIXUjU(NodeCoordinator nodeCoordinator0, Node modifier$Node0, HitTestSource nodeCoordinator$HitTestSource0, long v, HitTestResult hitTestResult0, boolean z, boolean z1) {
        if(modifier$Node0 == null) {
            nodeCoordinator0.hitTestChild-YqVAtuI(nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
            return;
        }
        nodeCoordinator0.getClass();
        hitTestResult0.hit(modifier$Node0, z1, new z(nodeCoordinator0, modifier$Node0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1));
    }

    public static final void access$hitNear-JHbHoSQ(NodeCoordinator nodeCoordinator0, Node modifier$Node0, HitTestSource nodeCoordinator$HitTestSource0, long v, HitTestResult hitTestResult0, boolean z, boolean z1, float f) {
        if(modifier$Node0 == null) {
            nodeCoordinator0.hitTestChild-YqVAtuI(nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
            return;
        }
        nodeCoordinator0.getClass();
        hitTestResult0.hitInMinimumTouchTarget(modifier$Node0, f, z1, new a0(nodeCoordinator0, modifier$Node0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f));
    }

    public static final void access$setLastLayerDrawingWasSkipped$p(NodeCoordinator nodeCoordinator0, boolean z) {
        nodeCoordinator0.G = z;
    }

    public final long calculateMinimumTouchTargetPadding-E7KxVPU(long v) {
        return SizeKt.Size(Math.max(0.0f, (Size.getWidth-impl(v) - ((float)this.getMeasuredWidth())) / 2.0f), Math.max(0.0f, (Size.getHeight-impl(v) - ((float)this.getMeasuredHeight())) / 2.0f));
    }

    public final float distanceInMinimumTouchTarget-tz77jQw(long v, long v1) {
        if(Float.compare(this.getMeasuredWidth(), Size.getWidth-impl(v1)) >= 0 && ((float)this.getMeasuredHeight()) >= Size.getHeight-impl(v1)) {
            return Infinityf;
        }
        long v2 = this.calculateMinimumTouchTargetPadding-E7KxVPU(v1);
        float f = Size.getWidth-impl(v2);
        float f1 = Size.getHeight-impl(v2);
        float f2 = Offset.getX-impl(v);
        float f3 = Offset.getY-impl(v);
        long v3 = OffsetKt.Offset(Math.max(0.0f, (f2 < 0.0f ? -f2 : f2 - ((float)this.getMeasuredWidth()))), Math.max(0.0f, (f3 < 0.0f ? -f3 : f3 - ((float)this.getMeasuredHeight()))));
        return f <= 0.0f && f1 <= 0.0f || Offset.getX-impl(v3) > f || Offset.getY-impl(v3) > f1 ? Infinityf : Offset.getDistanceSquared-impl(v3);
    }

    public final void draw(@NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            ownedLayer0.drawLayer(canvas0, graphicsLayer0);
            return;
        }
        float f = (float)IntOffset.getX-impl(this.getPosition-nOcc-ac());
        float f1 = (float)IntOffset.getY-impl(this.getPosition-nOcc-ac());
        canvas0.translate(f, f1);
        Node modifier$Node0 = this.head-H91voCI(4);
        if(modifier$Node0 == null) {
            this.performDraw(canvas0, graphicsLayer0);
        }
        else {
            this.getLayoutNode().getMDrawScope$ui_release().draw-eZhPAX0$ui_release(canvas0, IntSizeKt.toSize-ozmzZPI(this.getSize-YbymL2g()), this, modifier$Node0, graphicsLayer0);
        }
        canvas0.translate(-f, -f1);
    }

    public final void drawBorder(@NotNull Canvas canvas0, @NotNull Paint paint0) {
        canvas0.drawRect(new Rect(0.5f, 0.5f, ((float)IntSize.getWidth-impl(this.getMeasuredSize-YbymL2g())) - 0.5f, ((float)IntSize.getHeight-impl(this.getMeasuredSize-YbymL2g())) - 0.5f), paint0);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public final void f(NodeCoordinator nodeCoordinator0, MutableRect mutableRect0, boolean z) {
        if(nodeCoordinator0 == this) {
            return;
        }
        NodeCoordinator nodeCoordinator1 = this.r;
        if(nodeCoordinator1 != null) {
            nodeCoordinator1.f(nodeCoordinator0, mutableRect0, z);
        }
        float f = (float)IntOffset.getX-impl(this.getPosition-nOcc-ac());
        mutableRect0.setLeft(mutableRect0.getLeft() - f);
        mutableRect0.setRight(mutableRect0.getRight() - f);
        float f1 = (float)IntOffset.getY-impl(this.getPosition-nOcc-ac());
        mutableRect0.setTop(mutableRect0.getTop() - f1);
        mutableRect0.setBottom(mutableRect0.getBottom() - f1);
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            ownedLayer0.mapBounds(mutableRect0, true);
            if(this.t && z) {
                mutableRect0.intersect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(this.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(this.getSize-YbymL2g())));
            }
        }
    }

    @NotNull
    public final NodeCoordinator findCommonAncestor$ui_release(@NotNull NodeCoordinator nodeCoordinator0) {
        LayoutNode layoutNode0 = nodeCoordinator0.getLayoutNode();
        LayoutNode layoutNode1 = this.getLayoutNode();
        if(layoutNode0 == layoutNode1) {
            Node modifier$Node0 = nodeCoordinator0.getTail();
            Node modifier$Node1 = this.getTail();
            if(!modifier$Node1.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for(Node modifier$Node2 = modifier$Node1.getNode().getParent$ui_release(); modifier$Node2 != null; modifier$Node2 = modifier$Node2.getParent$ui_release()) {
                if((modifier$Node2.getKindSet$ui_release() & 2) != 0 && modifier$Node2 == modifier$Node0) {
                    return nodeCoordinator0;
                }
            }
            return this;
        }
        while(layoutNode0.getDepth$ui_release() > layoutNode1.getDepth$ui_release()) {
            layoutNode0 = layoutNode0.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode0);
        }
        while(layoutNode1.getDepth$ui_release() > layoutNode0.getDepth$ui_release()) {
            layoutNode1 = layoutNode1.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode1);
        }
        while(layoutNode0 != layoutNode1) {
            layoutNode0 = layoutNode0.getParent$ui_release();
            layoutNode1 = layoutNode1.getParent$ui_release();
            if(layoutNode0 == null || layoutNode1 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
            if(false) {
                break;
            }
        }
        if(layoutNode1 == this.getLayoutNode()) {
            return this;
        }
        return layoutNode0 == nodeCoordinator0.getLayoutNode() ? nodeCoordinator0 : layoutNode0.getInnerCoordinator$ui_release();
    }

    public long fromParentPosition-8S9VItk(long v, boolean z) {
        if(z || !this.isPlacedUnderMotionFrameOfReference()) {
            v = IntOffsetKt.minus-Nv-tHpc(v, this.getPosition-nOcc-ac());
        }
        return this.H == null ? v : this.H.mapOffset-8S9VItk(v, true);
    }

    public static long fromParentPosition-8S9VItk$default(NodeCoordinator nodeCoordinator0, long v, boolean z, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if((v1 & 2) != 0) {
            z = true;
        }
        return nodeCoordinator0.fromParentPosition-8S9VItk(v, z);
    }

    public final long g(NodeCoordinator nodeCoordinator0, long v, boolean z) {
        if(nodeCoordinator0 == this) {
            return v;
        }
        NodeCoordinator nodeCoordinator1 = this.r;
        return nodeCoordinator1 == null || Intrinsics.areEqual(nodeCoordinator0, nodeCoordinator1) ? this.fromParentPosition-8S9VItk(v, z) : this.fromParentPosition-8S9VItk(nodeCoordinator1.g(nodeCoordinator0, v, z), z);
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        return this.q;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() [...] // Inlined contents

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.getLayoutNode().getDensity().getDensity();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.getLayoutNode().getDensity().getFontScale();
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui_release() {
        return this.p;
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui_release() {
        return this.o;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this.y != null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference();
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.G;
    }

    public final long getLastMeasurementConstraints-msEJaDk$ui_release() {
        return this.getMeasurementConstraints-msEJaDk();
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.H;
    }

    @Nullable
    public final Function1 getLayerBlock() {
        return this.u;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.getLayoutNode().getLayoutDirection();
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.n;
    }

    @Nullable
    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult0 = this.y;
        if(measureResult0 == null) {
            throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
        }
        return measureResult0;
    }

    public final long getMinimumTouchTargetSize-NH-jbRc() {
        return this.v.toSize-XkaWNTQ(this.getLayoutNode().getViewConfiguration().getMinimumTouchTargetSize-MYxV2XQ());
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        return this.r;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        this.onCoordinatesUsed$ui_release();
        return this.r;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable, androidx.compose.ui.layout.Measured
    @Nullable
    public Object getParentData() {
        if(this.getLayoutNode().getNodes$ui_release().has-H91voCI$ui_release(0x40)) {
            this.getTail();
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            Node modifier$Node0 = this.getLayoutNode().getNodes$ui_release().getTail$ui_release();
            while(modifier$Node0 != null) {
                if((0x40 & modifier$Node0.getKindSet$ui_release()) != 0) {
                    MutableVector mutableVector0 = null;
                    Node modifier$Node1 = modifier$Node0;
                    while(modifier$Node1 != null) {
                        if(modifier$Node1 instanceof ParentDataModifierNode) {
                            ref$ObjectRef0.element = ((ParentDataModifierNode)modifier$Node1).modifyParentData(this.getLayoutNode().getDensity(), ref$ObjectRef0.element);
                        }
                        else if((modifier$Node1.getKindSet$ui_release() & 0x40) != 0 && modifier$Node1 instanceof DelegatingNode) {
                            Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                            int v = 0;
                            while(modifier$Node2 != null) {
                                if((modifier$Node2.getKindSet$ui_release() & 0x40) != 0) {
                                    ++v;
                                    if(v == 1) {
                                        modifier$Node1 = modifier$Node2;
                                    }
                                    else {
                                        if(mutableVector0 == null) {
                                            mutableVector0 = new MutableVector(new Node[16], 0);
                                        }
                                        if(modifier$Node1 != null) {
                                            mutableVector0.add(modifier$Node1);
                                            modifier$Node1 = null;
                                        }
                                        mutableVector0.add(modifier$Node2);
                                    }
                                }
                                modifier$Node2 = modifier$Node2.getChild$ui_release();
                            }
                            if(v != 1) {
                                goto label_30;
                            }
                            continue;
                        }
                    label_30:
                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                    }
                }
                modifier$Node0 = modifier$Node0.getParent$ui_release();
            }
            return ref$ObjectRef0.element;
        }
        return null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        this.onCoordinatesUsed$ui_release();
        return this.getLayoutNode().getOuterCoordinator$ui_release().r;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public long getPosition-nOcc-ac() {
        return this.A;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set getProvidedAlignmentLines() {
        Set set0 = null;
        while(this != null) {
            Map map0 = this.y == null ? null : this.y.getAlignmentLines();
            if(map0 != null && !map0.isEmpty() == 1) {
                if(set0 == null) {
                    set0 = new LinkedHashSet();
                }
                set0.addAll(map0.keySet());
            }
            this = this.q;
        }
        return set0 == null ? f0.emptySet() : set0;
    }

    @NotNull
    public final MutableRect getRectCache() {
        MutableRect mutableRect0 = this.C;
        if(mutableRect0 == null) {
            mutableRect0 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this.C = mutableRect0;
        }
        return mutableRect0;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long getSize-YbymL2g() {
        return this.getMeasuredSize-YbymL2g();
    }

    @NotNull
    public abstract Node getTail();

    @Nullable
    public final NodeCoordinator getWrapped$ui_release() {
        return this.q;
    }

    @Nullable
    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.r;
    }

    public final float getZIndex() {
        return this.B;
    }

    public final Node h(boolean z) {
        if(this.getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return this.getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if(z) {
            NodeCoordinator nodeCoordinator0 = this.r;
            if(nodeCoordinator0 != null) {
                Node modifier$Node0 = nodeCoordinator0.getTail();
                return modifier$Node0 == null ? null : modifier$Node0.getChild$ui_release();
            }
            return null;
        }
        return this.r == null ? null : this.r.getTail();
    }

    @Nullable
    public final Node head-H91voCI(int v) {
        Node modifier$Node1;
        Node modifier$Node0 = this.getTail();
        if(NodeKindKt.getIncludeSelfInTraversal-H91voCI(v)) {
            modifier$Node1 = this.h(true);
        label_7:
            while(modifier$Node1 != null && (modifier$Node1.getAggregateChildKindSet$ui_release() & v) != 0) {
                if((modifier$Node1.getKindSet$ui_release() & v) != 0) {
                    return modifier$Node1;
                }
                if(modifier$Node1 == modifier$Node0) {
                    break;
                }
                modifier$Node1 = modifier$Node1.getChild$ui_release();
            }
        }
        else {
            modifier$Node0 = modifier$Node0.getParent$ui_release();
            if(modifier$Node0 != null) {
                modifier$Node1 = this.h(false);
                goto label_7;
            }
        }
        return null;
    }

    public final void hitTest-YqVAtuI(@NotNull HitTestSource nodeCoordinator$HitTestSource0, long v, @NotNull HitTestResult hitTestResult0, boolean z, boolean z1) {
        Node modifier$Node0 = this.head-H91voCI(nodeCoordinator$HitTestSource0.entityType-OLwlOKw());
        if(this.withinLayerBounds-k-4lQ0M(v)) {
            if(modifier$Node0 == null) {
                this.hitTestChild-YqVAtuI(nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
                return;
            }
            if(this.isPointerInBounds-k-4lQ0M(v)) {
                hitTestResult0.hit(modifier$Node0, z1, new z(this, modifier$Node0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1));
                return;
            }
            float f1 = z ? this.distanceInMinimumTouchTarget-tz77jQw(v, this.getMinimumTouchTargetSize-NH-jbRc()) : Infinityf;
            if(!Float.isInfinite(f1) && !Float.isNaN(f1) && hitTestResult0.isHitInMinimumTouchTargetBetter(f1, z1)) {
                hitTestResult0.hitInMinimumTouchTarget(modifier$Node0, f1, z1, new a0(this, modifier$Node0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f1));
                return;
            }
            this.j(modifier$Node0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f1);
        }
        else if(z) {
            float f = this.distanceInMinimumTouchTarget-tz77jQw(v, this.getMinimumTouchTargetSize-NH-jbRc());
            if(!Float.isInfinite(f) && !Float.isNaN(f) && hitTestResult0.isHitInMinimumTouchTargetBetter(f, false)) {
                if(modifier$Node0 == null) {
                    this.hitTestChild-YqVAtuI(nodeCoordinator$HitTestSource0, v, hitTestResult0, true, false);
                    return;
                }
                hitTestResult0.hitInMinimumTouchTarget(modifier$Node0, f, false, new a0(this, modifier$Node0, nodeCoordinator$HitTestSource0, v, hitTestResult0, true, false, f));
            }
        }
    }

    public void hitTestChild-YqVAtuI(@NotNull HitTestSource nodeCoordinator$HitTestSource0, long v, @NotNull HitTestResult hitTestResult0, boolean z, boolean z1) {
        NodeCoordinator nodeCoordinator0 = this.q;
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.hitTest-YqVAtuI(nodeCoordinator$HitTestSource0, NodeCoordinator.fromParentPosition-8S9VItk$default(nodeCoordinator0, v, false, 2, null), hitTestResult0, z, z1);
        }
    }

    public final void i(long v, float f, Function1 function10, GraphicsLayer graphicsLayer0) {
        if(graphicsLayer0 == null) {
            if(this.I != null) {
                this.I = null;
                NodeCoordinator.updateLayerBlock$default(this, null, false, 2, null);
            }
            NodeCoordinator.updateLayerBlock$default(this, function10, false, 2, null);
        }
        else {
            if(function10 != null) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn\'t be used together");
            }
            if(this.I != graphicsLayer0) {
                this.I = null;
                NodeCoordinator.updateLayerBlock$default(this, null, false, 2, null);
                this.I = graphicsLayer0;
            }
            if(this.H == null) {
                OwnedLayer ownedLayer0 = LayoutNodeKt.requireOwner(this.getLayoutNode()).createLayer(this.E, this.F, graphicsLayer0);
                ownedLayer0.resize-ozmzZPI(this.getMeasuredSize-YbymL2g());
                ownedLayer0.move--gyyYBs(v);
                this.H = ownedLayer0;
                this.getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.F.invoke();
            }
        }
        if(!IntOffset.equals-impl0(this.getPosition-nOcc-ac(), v)) {
            this.setPosition--gyyYBs(v);
            this.getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer1 = this.H;
            if(ownedLayer1 == null) {
                NodeCoordinator nodeCoordinator0 = this.r;
                if(nodeCoordinator0 != null) {
                    nodeCoordinator0.invalidateLayer();
                }
            }
            else {
                ownedLayer1.move--gyyYBs(v);
            }
            this.invalidateAlignmentLinesFromPositionChange(this);
            Owner owner0 = this.getLayoutNode().getOwner$ui_release();
            if(owner0 != null) {
                owner0.onLayoutChange(this.getLayoutNode());
            }
        }
        this.B = f;
        if(!this.isPlacingForAlignment$ui_release()) {
            this.captureRulers$ui_release(this.getMeasureResult$ui_release());
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            ownedLayer0.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator0 = this.r;
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.invalidateLayer();
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return this.getTail().isAttached();
    }

    public final boolean isPointerInBounds-k-4lQ0M(long v) {
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        return f >= 0.0f && f1 >= 0.0f && f < ((float)this.getMeasuredWidth()) && f1 < ((float)this.getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if(this.H != null && this.x <= 0.0f) {
            return true;
        }
        return this.r == null ? false : this.r.isTransparent();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.H != null && !this.s && this.getLayoutNode().isAttached();
    }

    public final void j(Node modifier$Node0, HitTestSource nodeCoordinator$HitTestSource0, long v, HitTestResult hitTestResult0, boolean z, boolean z1, float f) {
        if(modifier$Node0 == null) {
            this.hitTestChild-YqVAtuI(nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1);
            return;
        }
        if(nodeCoordinator$HitTestSource0.interceptOutOfBoundsChildEvents(modifier$Node0)) {
            hitTestResult0.speculativeHit(modifier$Node0, f, z1, new b0(this, modifier$Node0, nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f));
            return;
        }
        this.j(NodeCoordinatorKt.access$nextUntil-hw7D004(modifier$Node0, nodeCoordinator$HitTestSource0.entityType-OLwlOKw(), 2), nodeCoordinator$HitTestSource0, v, hitTestResult0, z, z1, f);
    }

    public static NodeCoordinator k(LayoutCoordinates layoutCoordinates0) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates0 = layoutCoordinates0 instanceof LookaheadLayoutCoordinates ? ((LookaheadLayoutCoordinates)layoutCoordinates0) : null;
        if(lookaheadLayoutCoordinates0 != null) {
            NodeCoordinator nodeCoordinator0 = lookaheadLayoutCoordinates0.getCoordinator();
            if(nodeCoordinator0 != null) {
                return nodeCoordinator0;
            }
        }
        Intrinsics.checkNotNull(layoutCoordinates0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator)layoutCoordinates0;
    }

    public final void l(NodeCoordinator nodeCoordinator0, float[] arr_f) {
        if(!Intrinsics.areEqual(nodeCoordinator0, this)) {
            NodeCoordinator nodeCoordinator1 = this.r;
            Intrinsics.checkNotNull(nodeCoordinator1);
            nodeCoordinator1.l(nodeCoordinator0, arr_f);
            if(!IntOffset.equals-impl0(this.getPosition-nOcc-ac(), 0L)) {
                Matrix.reset-impl(NodeCoordinator.N);
                Matrix.translate-impl$default(NodeCoordinator.N, -((float)IntOffset.getX-impl(this.getPosition-nOcc-ac())), -((float)IntOffset.getY-impl(this.getPosition-nOcc-ac())), 0.0f, 4, null);
                Matrix.timesAssign-58bKbWc(arr_f, NodeCoordinator.N);
            }
            OwnedLayer ownedLayer0 = this.H;
            if(ownedLayer0 != null) {
                ownedLayer0.inverseTransform-58bKbWc(arr_f);
            }
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates layoutCoordinates0, boolean z) {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if(!layoutCoordinates0.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(("LayoutCoordinates " + layoutCoordinates0 + " is not attached!"));
        }
        NodeCoordinator nodeCoordinator0 = NodeCoordinator.k(layoutCoordinates0);
        nodeCoordinator0.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinator1 = this.findCommonAncestor$ui_release(nodeCoordinator0);
        MutableRect mutableRect0 = this.getRectCache();
        mutableRect0.setLeft(0.0f);
        mutableRect0.setTop(0.0f);
        mutableRect0.setRight(((float)IntSize.getWidth-impl(layoutCoordinates0.getSize-YbymL2g())));
        mutableRect0.setBottom(((float)IntSize.getHeight-impl(layoutCoordinates0.getSize-YbymL2g())));
        while(nodeCoordinator0 != nodeCoordinator1) {
            NodeCoordinator.rectInParent$ui_release$default(nodeCoordinator0, mutableRect0, z, false, 4, null);
            if(mutableRect0.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator0 = nodeCoordinator0.r;
            Intrinsics.checkNotNull(nodeCoordinator0);
        }
        this.f(nodeCoordinator1, mutableRect0, z);
        return MutableRectKt.toRect(mutableRect0);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localPositionOf-R5De75A(@NotNull LayoutCoordinates layoutCoordinates0, long v) {
        return this.localPositionOf-S_NoaFU(layoutCoordinates0, v, true);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localPositionOf-S_NoaFU(@NotNull LayoutCoordinates layoutCoordinates0, long v, boolean z) {
        if(layoutCoordinates0 instanceof LookaheadLayoutCoordinates) {
            ((LookaheadLayoutCoordinates)layoutCoordinates0).getCoordinator().onCoordinatesUsed$ui_release();
            return Offset.unaryMinus-F1C5BW0(layoutCoordinates0.localPositionOf-S_NoaFU(this, Offset.unaryMinus-F1C5BW0(v), z));
        }
        NodeCoordinator nodeCoordinator0 = NodeCoordinator.k(layoutCoordinates0);
        nodeCoordinator0.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinator1 = this.findCommonAncestor$ui_release(nodeCoordinator0);
        while(nodeCoordinator0 != nodeCoordinator1) {
            v = nodeCoordinator0.toParentPosition-8S9VItk(v, z);
            nodeCoordinator0 = nodeCoordinator0.r;
            Intrinsics.checkNotNull(nodeCoordinator0);
        }
        return this.g(nodeCoordinator1, v, z);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localToRoot-MK-Hz9U(long v) {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        this.onCoordinatesUsed$ui_release();
        long v1 = v;
        for(NodeCoordinator nodeCoordinator0 = this; nodeCoordinator0 != null; nodeCoordinator0 = nodeCoordinator0.r) {
            v1 = NodeCoordinator.toParentPosition-8S9VItk$default(nodeCoordinator0, v1, false, 2, null);
        }
        return v1;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localToScreen-MK-Hz9U(long v) {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long v1 = this.localToRoot-MK-Hz9U(v);
        return LayoutNodeKt.requireOwner(this.getLayoutNode()).localToScreen-MK-Hz9U(v1);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localToWindow-MK-Hz9U(long v) {
        long v1 = this.localToRoot-MK-Hz9U(v);
        return LayoutNodeKt.requireOwner(this.getLayoutNode()).calculatePositionInWindow-MK-Hz9U(v1);
    }

    public final void m(NodeCoordinator nodeCoordinator0, float[] arr_f) {
        while(!Intrinsics.areEqual(this, nodeCoordinator0)) {
            OwnedLayer ownedLayer0 = this.H;
            if(ownedLayer0 != null) {
                ownedLayer0.transform-58bKbWc(arr_f);
            }
            long v = this.getPosition-nOcc-ac();
            if(!IntOffset.equals-impl0(v, 0L)) {
                Matrix.reset-impl(NodeCoordinator.N);
                Matrix.translate-impl$default(NodeCoordinator.N, ((float)IntOffset.getX-impl(v)), ((float)IntOffset.getY-impl(v)), 0.0f, 4, null);
                Matrix.timesAssign-58bKbWc(arr_f, NodeCoordinator.N);
            }
            this = this.r;
            Intrinsics.checkNotNull(this);
        }
    }

    public final void n(boolean z) {
        if(this.I != null) {
            return;
        }
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            Function1 function10 = this.u;
            if(function10 == null) {
                throw a.b("updateLayerParameters requires a non-null layerBlock");
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope0 = NodeCoordinator.L;
            reusableGraphicsLayerScope0.reset();
            reusableGraphicsLayerScope0.setGraphicsDensity$ui_release(this.getLayoutNode().getDensity());
            reusableGraphicsLayerScope0.setLayoutDirection$ui_release(this.getLayoutNode().getLayoutDirection());
            reusableGraphicsLayerScope0.setSize-uvyYCjk(IntSizeKt.toSize-ozmzZPI(this.getSize-YbymL2g()));
            OwnerSnapshotObserver ownerSnapshotObserver0 = LayoutNodeKt.requireOwner(this.getLayoutNode()).getSnapshotObserver();
            s9 s90 = new s9(function10, 2);
            ownerSnapshotObserver0.observeReads$ui_release(this, NodeCoordinator.J, s90);
            j j0 = this.D;
            if(j0 == null) {
                j0 = new j();
                this.D = j0;
            }
            j0.a = reusableGraphicsLayerScope0.getScaleX();
            j0.b = reusableGraphicsLayerScope0.getScaleY();
            j0.c = reusableGraphicsLayerScope0.getTranslationX();
            j0.d = reusableGraphicsLayerScope0.getTranslationY();
            j0.e = reusableGraphicsLayerScope0.getRotationX();
            j0.f = reusableGraphicsLayerScope0.getRotationY();
            j0.g = reusableGraphicsLayerScope0.getRotationZ();
            j0.h = reusableGraphicsLayerScope0.getCameraDistance();
            j0.i = reusableGraphicsLayerScope0.getTransformOrigin-SzJe1aQ();
            ownedLayer0.updateLayerProperties(reusableGraphicsLayerScope0);
            this.t = reusableGraphicsLayerScope0.getClip();
            this.x = reusableGraphicsLayerScope0.getAlpha();
            if(z) {
                Owner owner0 = this.getLayoutNode().getOwner$ui_release();
                if(owner0 != null) {
                    owner0.onLayoutChange(this.getLayoutNode());
                }
            }
        }
        else if(this.u != null) {
            InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
        }
    }

    public final void onCoordinatesUsed$ui_release() {
        this.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            ownedLayer0.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        this.updateLayerBlock(this.u, true);
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            ownedLayer0.invalidate();
        }
    }

    public void onMeasureResultChanged(int v, int v1) {
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            ownedLayer0.resize-ozmzZPI(IntSizeKt.IntSize(v, v1));
        }
        else if(this.getLayoutNode().isPlaced()) {
            NodeCoordinator nodeCoordinator0 = this.r;
            if(nodeCoordinator0 != null) {
                nodeCoordinator0.invalidateLayer();
            }
        }
        this.setMeasuredSize-ozmzZPI(IntSizeKt.IntSize(v, v1));
        if(this.u != null) {
            this.n(false);
        }
        Node modifier$Node0 = this.getTail().getParent$ui_release();
        if(modifier$Node0 == null) {
        label_45:
            Owner owner0 = this.getLayoutNode().getOwner$ui_release();
            if(owner0 != null) {
                owner0.onLayoutChange(this.getLayoutNode());
            }
        }
        else {
            Node modifier$Node1 = this.h(false);
            while(true) {
                if(modifier$Node1 == null || (modifier$Node1.getAggregateChildKindSet$ui_release() & 4) == 0) {
                    goto label_45;
                }
                if((modifier$Node1.getKindSet$ui_release() & 4) != 0) {
                    Node modifier$Node2 = modifier$Node1;
                    MutableVector mutableVector0 = null;
                    while(modifier$Node2 != null) {
                        if(modifier$Node2 instanceof DrawModifierNode) {
                            ((DrawModifierNode)modifier$Node2).onMeasureResultChanged();
                        }
                        else if((modifier$Node2.getKindSet$ui_release() & 4) != 0 && modifier$Node2 instanceof DelegatingNode) {
                            Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                            int v2 = 0;
                            while(modifier$Node3 != null) {
                                if((modifier$Node3.getKindSet$ui_release() & 4) != 0) {
                                    ++v2;
                                    if(v2 == 1) {
                                        modifier$Node2 = modifier$Node3;
                                    }
                                    else {
                                        if(mutableVector0 == null) {
                                            mutableVector0 = new MutableVector(new Node[16], 0);
                                        }
                                        if(modifier$Node2 != null) {
                                            mutableVector0.add(modifier$Node2);
                                            modifier$Node2 = null;
                                        }
                                        mutableVector0.add(modifier$Node3);
                                    }
                                }
                                modifier$Node3 = modifier$Node3.getChild$ui_release();
                            }
                            if(v2 != 1) {
                                goto label_40;
                            }
                            continue;
                        }
                    label_40:
                        modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector0);
                    }
                }
                if(modifier$Node1 != modifier$Node0) {
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                    continue;
                }
                goto label_45;
            }
        }
    }

    public final void onMeasured() {
        Node modifier$Node0 = this.h(true);
        if(modifier$Node0 != null && DelegatableNodeKt.has-64DMado(modifier$Node0, 0x80)) {
            androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0 = Snapshot.Companion;
            Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
            Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
            Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
            try {
                Node modifier$Node1 = this.getTail();
                Node modifier$Node2 = this.h(true);
                while(modifier$Node2 != null && (modifier$Node2.getAggregateChildKindSet$ui_release() & 0x80) != 0) {
                    if((modifier$Node2.getKindSet$ui_release() & 0x80) != 0) {
                        MutableVector mutableVector0 = null;
                        Node modifier$Node3 = modifier$Node2;
                        while(modifier$Node3 != null) {
                            if(modifier$Node3 instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode)modifier$Node3).onRemeasured-ozmzZPI(this.getMeasuredSize-YbymL2g());
                            }
                            else if((modifier$Node3.getKindSet$ui_release() & 0x80) != 0 && modifier$Node3 instanceof DelegatingNode) {
                                Node modifier$Node4 = ((DelegatingNode)modifier$Node3).getDelegate$ui_release();
                                int v1 = 0;
                                while(modifier$Node4 != null) {
                                    if((modifier$Node4.getKindSet$ui_release() & 0x80) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            modifier$Node3 = modifier$Node4;
                                        }
                                        else {
                                            if(mutableVector0 == null) {
                                                mutableVector0 = new MutableVector(new Node[16], 0);
                                            }
                                            if(modifier$Node3 != null) {
                                                mutableVector0.add(modifier$Node3);
                                                modifier$Node3 = null;
                                            }
                                            mutableVector0.add(modifier$Node4);
                                        }
                                    }
                                    modifier$Node4 = modifier$Node4.getChild$ui_release();
                                }
                                if(v1 != 1) {
                                    goto label_35;
                                }
                                continue;
                            }
                        label_35:
                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector0);
                        }
                    }
                    if(modifier$Node2 == modifier$Node1) {
                        break;
                    }
                    modifier$Node2 = modifier$Node2.getChild$ui_release();
                }
            }
            finally {
                snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
            }
        }
    }

    public final void onPlaced() {
        Node modifier$Node0 = this.getTail();
        Node modifier$Node1 = this.h(true);
        while(modifier$Node1 != null && (modifier$Node1.getAggregateChildKindSet$ui_release() & 0x80) != 0) {
            if((modifier$Node1.getKindSet$ui_release() & 0x80) != 0) {
                Node modifier$Node2 = modifier$Node1;
                MutableVector mutableVector0 = null;
                while(modifier$Node2 != null) {
                    if(modifier$Node2 instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode)modifier$Node2).onPlaced(this);
                    }
                    else if((modifier$Node2.getKindSet$ui_release() & 0x80) != 0 && modifier$Node2 instanceof DelegatingNode) {
                        Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                        int v = 0;
                        while(modifier$Node3 != null) {
                            if((modifier$Node3.getKindSet$ui_release() & 0x80) != 0) {
                                ++v;
                                if(v == 1) {
                                    modifier$Node2 = modifier$Node3;
                                }
                                else {
                                    if(mutableVector0 == null) {
                                        mutableVector0 = new MutableVector(new Node[16], 0);
                                    }
                                    if(modifier$Node2 != null) {
                                        mutableVector0.add(modifier$Node2);
                                        modifier$Node2 = null;
                                    }
                                    mutableVector0.add(modifier$Node3);
                                }
                            }
                            modifier$Node3 = modifier$Node3.getChild$ui_release();
                        }
                        if(v != 1) {
                            goto label_28;
                        }
                        continue;
                    }
                label_28:
                    modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector0);
                }
            }
            if(modifier$Node1 == modifier$Node0) {
                break;
            }
            modifier$Node1 = modifier$Node1.getChild$ui_release();
        }
    }

    public final void onRelease() {
        this.s = true;
        this.F.invoke();
        this.releaseLayer();
    }

    public void performDraw(@NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        NodeCoordinator nodeCoordinator0 = this.q;
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.draw(canvas0, graphicsLayer0);
        }
    }

    @NotNull
    public final Placeable performingMeasure-K40F9xA(long v, @NotNull Function0 function00) {
        this.setMeasurementConstraints-BRTryo0(v);
        return (Placeable)function00.invoke();
    }

    @Override  // androidx.compose.ui.layout.Placeable
    public void placeAt-f8xVGno(long v, float f, @NotNull GraphicsLayer graphicsLayer0) {
        if(this.o) {
            LookaheadDelegate lookaheadDelegate0 = this.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            this.i(lookaheadDelegate0.getPosition-nOcc-ac(), f, null, graphicsLayer0);
            return;
        }
        this.i(v, f, null, graphicsLayer0);
    }

    @Override  // androidx.compose.ui.layout.Placeable
    public void placeAt-f8xVGno(long v, float f, @Nullable Function1 function10) {
        if(this.o) {
            LookaheadDelegate lookaheadDelegate0 = this.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            this.i(lookaheadDelegate0.getPosition-nOcc-ac(), f, function10, null);
            return;
        }
        this.i(v, f, function10, null);
    }

    public final void placeSelfApparentToRealOffset-MLgxB_4(long v, float f, @Nullable Function1 function10, @Nullable GraphicsLayer graphicsLayer0) {
        this.i(IntOffset.plus-qkQi6aY(v, this.getApparentToRealOffset-nOcc-ac()), f, function10, graphicsLayer0);
    }

    public final void rectInParent$ui_release(@NotNull MutableRect mutableRect0, boolean z, boolean z1) {
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            if(this.t) {
                if(z1) {
                    long v = this.getMinimumTouchTargetSize-NH-jbRc();
                    float f = Size.getWidth-impl(v);
                    float f1 = Size.getHeight-impl(v);
                    mutableRect0.intersect(-(f / 2.0f), -(f1 / 2.0f), ((float)IntSize.getWidth-impl(this.getSize-YbymL2g())) + f / 2.0f, ((float)IntSize.getHeight-impl(this.getSize-YbymL2g())) + f1 / 2.0f);
                }
                else if(z) {
                    mutableRect0.intersect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(this.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(this.getSize-YbymL2g())));
                }
                if(mutableRect0.isEmpty()) {
                    return;
                }
            }
            ownedLayer0.mapBounds(mutableRect0, false);
        }
        float f2 = (float)IntOffset.getX-impl(this.getPosition-nOcc-ac());
        mutableRect0.setLeft(mutableRect0.getLeft() + f2);
        mutableRect0.setRight(mutableRect0.getRight() + f2);
        float f3 = (float)IntOffset.getY-impl(this.getPosition-nOcc-ac());
        mutableRect0.setTop(mutableRect0.getTop() + f3);
        mutableRect0.setBottom(mutableRect0.getBottom() + f3);
    }

    public static void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator0, MutableRect mutableRect0, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        nodeCoordinator0.rectInParent$ui_release(mutableRect0, z, z1);
    }

    public final void releaseLayer() {
        if(this.H != null) {
            if(this.I != null) {
                this.I = null;
            }
            NodeCoordinator.updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui_release$default(this.getLayoutNode(), false, 1, null);
        }
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        GraphicsLayer graphicsLayer0 = this.I;
        if(graphicsLayer0 != null) {
            this.placeAt-f8xVGno(this.getPosition-nOcc-ac(), this.B, graphicsLayer0);
            return;
        }
        this.placeAt-f8xVGno(this.getPosition-nOcc-ac(), this.B, this.u);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long screenToLocal-MK-Hz9U(long v) {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long v1 = LayoutNodeKt.requireOwner(this.getLayoutNode()).screenToLocal-MK-Hz9U(v);
        return this.localPositionOf-R5De75A(LayoutCoordinatesKt.findRootCoordinates(this), v1);
    }

    public final void setForceMeasureWithLookaheadConstraints$ui_release(boolean z) {
        this.p = z;
    }

    public final void setForcePlaceWithLookaheadOffset$ui_release(boolean z) {
        this.o = z;
    }

    public abstract void setLookaheadDelegate(@Nullable LookaheadDelegate arg1);

    public void setMeasureResult$ui_release(@NotNull MeasureResult measureResult0) {
        MeasureResult measureResult1 = this.y;
        if(measureResult0 != measureResult1) {
            this.y = measureResult0;
            if(measureResult1 == null || measureResult0.getWidth() != measureResult1.getWidth() || measureResult0.getHeight() != measureResult1.getHeight()) {
                this.onMeasureResultChanged(measureResult0.getWidth(), measureResult0.getHeight());
            }
            if((this.z != null && !this.z.isEmpty() || !measureResult0.getAlignmentLines().isEmpty()) && !Intrinsics.areEqual(measureResult0.getAlignmentLines(), this.z)) {
                this.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                LinkedHashMap linkedHashMap0 = this.z;
                if(linkedHashMap0 == null) {
                    linkedHashMap0 = new LinkedHashMap();
                    this.z = linkedHashMap0;
                }
                linkedHashMap0.clear();
                linkedHashMap0.putAll(measureResult0.getAlignmentLines());
            }
        }
    }

    public void setPosition--gyyYBs(long v) {
        this.A = v;
    }

    public final void setWrapped$ui_release(@Nullable NodeCoordinator nodeCoordinator0) {
        this.q = nodeCoordinator0;
    }

    public final void setWrappedBy$ui_release(@Nullable NodeCoordinator nodeCoordinator0) {
        this.r = nodeCoordinator0;
    }

    public final void setZIndex(float f) {
        this.B = f;
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Node modifier$Node0 = this.h(false);
        if(modifier$Node0 == null) {
            return false;
        }
        if(modifier$Node0.isAttached()) {
            if(!modifier$Node0.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Node modifier$Node1 = modifier$Node0.getNode();
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 16) != 0) {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 16) != 0) {
                        Node modifier$Node2 = modifier$Node1;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node2 != null) {
                            if(modifier$Node2 instanceof PointerInputModifierNode) {
                                if(((PointerInputModifierNode)modifier$Node2).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            }
                            else if((modifier$Node2.getKindSet$ui_release() & 16) != 0 && modifier$Node2 instanceof DelegatingNode) {
                                Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node3 != null) {
                                    if((modifier$Node3.getKindSet$ui_release() & 16) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            modifier$Node2 = modifier$Node3;
                                        }
                                        else {
                                            if(mutableVector0 == null) {
                                                mutableVector0 = new MutableVector(new Node[16], 0);
                                            }
                                            if(modifier$Node2 != null) {
                                                mutableVector0.add(modifier$Node2);
                                                modifier$Node2 = null;
                                            }
                                            mutableVector0.add(modifier$Node3);
                                        }
                                    }
                                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                                }
                                if(v != 1) {
                                    goto label_34;
                                }
                                continue;
                            }
                        label_34:
                            modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector0);
                        }
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
        return false;
    }

    public long toParentPosition-8S9VItk(long v, boolean z) {
        OwnedLayer ownedLayer0 = this.H;
        if(ownedLayer0 != null) {
            v = ownedLayer0.mapOffset-8S9VItk(v, false);
        }
        return !z && this.isPlacedUnderMotionFrameOfReference() ? v : IntOffsetKt.plus-Nv-tHpc(v, this.getPosition-nOcc-ac());
    }

    public static long toParentPosition-8S9VItk$default(NodeCoordinator nodeCoordinator0, long v, boolean z, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if((v1 & 2) != 0) {
            z = true;
        }
        return nodeCoordinator0.toParentPosition-8S9VItk(v, z);
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if(!this.isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates layoutCoordinates0 = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect mutableRect0 = this.getRectCache();
        long v = this.calculateMinimumTouchTargetPadding-E7KxVPU(this.getMinimumTouchTargetSize-NH-jbRc());
        mutableRect0.setLeft(-Size.getWidth-impl(v));
        mutableRect0.setTop(-Size.getHeight-impl(v));
        float f = (float)this.getMeasuredWidth();
        mutableRect0.setRight(Size.getWidth-impl(v) + f);
        float f1 = (float)this.getMeasuredHeight();
        mutableRect0.setBottom(Size.getHeight-impl(v) + f1);
        NodeCoordinator nodeCoordinator0 = this;
        while(nodeCoordinator0 != layoutCoordinates0) {
            nodeCoordinator0.rectInParent$ui_release(mutableRect0, false, true);
            if(mutableRect0.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator0 = nodeCoordinator0.r;
            Intrinsics.checkNotNull(nodeCoordinator0);
        }
        return MutableRectKt.toRect(mutableRect0);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public void transformFrom-EL8BTi8(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull float[] arr_f) {
        NodeCoordinator nodeCoordinator0 = NodeCoordinator.k(layoutCoordinates0);
        nodeCoordinator0.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinator1 = this.findCommonAncestor$ui_release(nodeCoordinator0);
        Matrix.reset-impl(arr_f);
        nodeCoordinator0.m(nodeCoordinator1, arr_f);
        this.l(nodeCoordinator1, arr_f);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public void transformToScreen-58bKbWc(@NotNull float[] arr_f) {
        Owner owner0 = LayoutNodeKt.requireOwner(this.getLayoutNode());
        this.m(NodeCoordinator.k(LayoutCoordinatesKt.findRootCoordinates(this)), arr_f);
        owner0.localToScreen-58bKbWc(arr_f);
    }

    public final void updateLayerBlock(@Nullable Function1 function10, boolean z) {
        if(function10 != null && this.I != null) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can\'t be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode0 = this.getLayoutNode();
        boolean z1 = z || this.u != function10 || !Intrinsics.areEqual(this.v, layoutNode0.getDensity()) || this.w != layoutNode0.getLayoutDirection();
        this.v = layoutNode0.getDensity();
        this.w = layoutNode0.getLayoutDirection();
        b b0 = this.F;
        if(!layoutNode0.isAttached() || function10 == null) {
            this.u = null;
            OwnedLayer ownedLayer1 = this.H;
            if(ownedLayer1 != null) {
                ownedLayer1.destroy();
                layoutNode0.setInnerLayerCoordinatorIsDirty$ui_release(true);
                b0.invoke();
                if(this.isAttached()) {
                    Owner owner0 = layoutNode0.getOwner$ui_release();
                    if(owner0 != null) {
                        owner0.onLayoutChange(layoutNode0);
                    }
                }
            }
            this.H = null;
            this.G = false;
        }
        else {
            this.u = function10;
            if(this.H == null) {
                OwnedLayer ownedLayer0 = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode0), this.E, b0, null, 4, null);
                ownedLayer0.resize-ozmzZPI(this.getMeasuredSize-YbymL2g());
                ownedLayer0.move--gyyYBs(this.getPosition-nOcc-ac());
                this.H = ownedLayer0;
                this.n(true);
                layoutNode0.setInnerLayerCoordinatorIsDirty$ui_release(true);
                b0.invoke();
                return;
            }
            if(z1) {
                this.n(true);
            }
        }
    }

    public static void updateLayerBlock$default(NodeCoordinator nodeCoordinator0, Function1 function10, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if((v & 2) != 0) {
            z = false;
        }
        nodeCoordinator0.updateLayerBlock(function10, z);
    }

    public final void visitNodes(int v, boolean z, @NotNull Function1 function10) {
        Node modifier$Node0 = this.getTail();
        if(!z) {
            modifier$Node0 = modifier$Node0.getParent$ui_release();
            if(modifier$Node0 == null) {
                return;
            }
        }
        for(Node modifier$Node1 = this.h(z); true; modifier$Node1 = modifier$Node1.getChild$ui_release()) {
            if(modifier$Node1 == null || (modifier$Node1.getAggregateChildKindSet$ui_release() & v) == 0) {
                return;
            }
            if((modifier$Node1.getKindSet$ui_release() & v) != 0) {
                function10.invoke(modifier$Node1);
            }
            if(modifier$Node1 == modifier$Node0) {
                break;
            }
        }
    }

    public final void visitNodes-aLcG6gQ(int v, Function1 function10) {
        Node modifier$Node1;
        Node modifier$Node0 = this.getTail();
        if(NodeKindKt.getIncludeSelfInTraversal-H91voCI(v)) {
            modifier$Node1 = this.h(true);
        label_7:
            while(modifier$Node1 != null && (modifier$Node1.getAggregateChildKindSet$ui_release() & v) != 0) {
                if((modifier$Node1.getKindSet$ui_release() & v) != 0) {
                    for(Node modifier$Node2 = modifier$Node1; modifier$Node2 != null; modifier$Node2 = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        function10.invoke(modifier$Node2);
                    }
                }
                if(modifier$Node1 == modifier$Node0) {
                    break;
                }
                modifier$Node1 = modifier$Node1.getChild$ui_release();
            }
        }
        else {
            modifier$Node0 = modifier$Node0.getParent$ui_release();
            if(modifier$Node0 != null) {
                modifier$Node1 = this.h(false);
                goto label_7;
            }
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long windowToLocal-MK-Hz9U(long v) {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates layoutCoordinates0 = LayoutCoordinatesKt.findRootCoordinates(this);
        return this.localPositionOf-R5De75A(layoutCoordinates0, Offset.minus-MK-Hz9U(LayoutNodeKt.requireOwner(this.getLayoutNode()).calculateLocalPosition-MK-Hz9U(v), LayoutCoordinatesKt.positionInRoot(layoutCoordinates0)));
    }

    public final void withPositionTranslation(@NotNull Canvas canvas0, @NotNull Function1 function10) {
        float f = (float)IntOffset.getX-impl(this.getPosition-nOcc-ac());
        float f1 = (float)IntOffset.getY-impl(this.getPosition-nOcc-ac());
        canvas0.translate(f, f1);
        function10.invoke(canvas0);
        canvas0.translate(-f, -f1);
    }

    // 去混淆评级： 低(20)
    public final boolean withinLayerBounds-k-4lQ0M(long v) {
        return this.H == null || !this.t || this.H.isInLayer-k-4lQ0M(v);
    }
}

