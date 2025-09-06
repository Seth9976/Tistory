package androidx.compose.ui.node;

import android.os.Trace;
import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.android.j;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import b2.f;
import b2.l;
import b2.m;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00C6\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 \u0080\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\b\u0080\u0003\u0081\u0003\u0082\u0003\u0083\u0003B\u001B\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u0011\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J$\u0010\u0014\u001A\u00020\u000E2\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000E0\u0012H\u0086\b\u00A2\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0017\u001A\u00020\u000E2\u0018\u0010\u0013\u001A\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000E0\u0016H\u0086\b\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001AH\u0017\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010!\u001A\u00020\u000E2\u0006\u0010\u001D\u001A\u00020\n2\u0006\u0010\u001E\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u000F\u0010#\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\"\u0010\u0010J\u001F\u0010\'\u001A\u00020\u000E2\u0006\u0010\u001D\u001A\u00020\n2\u0006\u0010$\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010)\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b(\u0010\u0010J\'\u0010.\u001A\u00020\u000E2\u0006\u0010*\u001A\u00020\n2\u0006\u0010+\u001A\u00020\n2\u0006\u0010$\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b,\u0010-J\u000F\u00100\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b/\u0010\u0010J\u0017\u00105\u001A\u00020\u000E2\u0006\u00102\u001A\u000201H\u0000\u00A2\u0006\u0004\b3\u00104J\u000F\u00107\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b6\u0010\u0010J\u000F\u00109\u001A\u000208H\u0016\u00A2\u0006\u0004\b9\u0010:J\u0015\u0010<\u001A\u00020\n2\u0006\u0010;\u001A\u00020\n\u00A2\u0006\u0004\b<\u0010=J\u0015\u0010?\u001A\u00020\n2\u0006\u0010>\u001A\u00020\n\u00A2\u0006\u0004\b?\u0010=J\u0015\u0010@\u001A\u00020\n2\u0006\u0010;\u001A\u00020\n\u00A2\u0006\u0004\b@\u0010=J\u0015\u0010A\u001A\u00020\n2\u0006\u0010>\u001A\u00020\n\u00A2\u0006\u0004\bA\u0010=J\u0015\u0010B\u001A\u00020\n2\u0006\u0010;\u001A\u00020\n\u00A2\u0006\u0004\bB\u0010=J\u0015\u0010C\u001A\u00020\n2\u0006\u0010>\u001A\u00020\n\u00A2\u0006\u0004\bC\u0010=J\u0015\u0010D\u001A\u00020\n2\u0006\u0010;\u001A\u00020\n\u00A2\u0006\u0004\bD\u0010=J\u0015\u0010E\u001A\u00020\n2\u0006\u0010>\u001A\u00020\n\u00A2\u0006\u0004\bE\u0010=J\u000F\u0010G\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\bF\u0010\u0010J\u000F\u0010I\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\bH\u0010\u0010J\u001F\u0010M\u001A\u00020\u000E2\u0006\u0010J\u001A\u00020\n2\u0006\u0010K\u001A\u00020\nH\u0000\u00A2\u0006\u0004\bL\u0010&J\u000F\u0010O\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\bN\u0010\u0010J\u000F\u0010Q\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\bP\u0010\u0010J!\u0010X\u001A\u00020\u000E2\u0006\u0010S\u001A\u00020R2\b\u0010U\u001A\u0004\u0018\u00010TH\u0000\u00A2\u0006\u0004\bV\u0010WJ6\u0010a\u001A\u00020\u000E2\u0006\u0010Z\u001A\u00020Y2\u0006\u0010\\\u001A\u00020[2\b\b\u0002\u0010]\u001A\u00020\b2\b\b\u0002\u0010^\u001A\u00020\bH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b_\u0010`J6\u0010d\u001A\u00020\u000E2\u0006\u0010Z\u001A\u00020Y2\u0006\u0010b\u001A\u00020[2\b\b\u0002\u0010]\u001A\u00020\b2\b\b\u0002\u0010^\u001A\u00020\bH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\bc\u0010`J\u0017\u0010h\u001A\u00020\u000E2\u0006\u0010e\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\bf\u0010gJ-\u0010n\u001A\u00020\u000E2\b\b\u0002\u0010i\u001A\u00020\b2\b\b\u0002\u0010j\u001A\u00020\b2\b\b\u0002\u0010k\u001A\u00020\bH\u0000\u00A2\u0006\u0004\bl\u0010mJ-\u0010p\u001A\u00020\u000E2\b\b\u0002\u0010i\u001A\u00020\b2\b\b\u0002\u0010j\u001A\u00020\b2\b\b\u0002\u0010k\u001A\u00020\bH\u0000\u00A2\u0006\u0004\bo\u0010mJ\u000F\u0010r\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\bq\u0010\u0010J\u000F\u0010t\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\bs\u0010\u0010J\u001E\u0010x\u001A\u00020\u000E2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u000E0uH\u0080\b\u00A2\u0006\u0004\bv\u0010wJ\u0019\u0010{\u001A\u00020\u000E2\b\b\u0002\u0010i\u001A\u00020\bH\u0000\u00A2\u0006\u0004\by\u0010zJ\u0019\u0010}\u001A\u00020\u000E2\b\b\u0002\u0010i\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b|\u0010zJ\u000F\u0010\u007F\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b~\u0010\u0010J\u001A\u0010\u0082\u0001\u001A\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u0001H\u0016\u00A2\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0085\u0001\u001A\u00020\u000EH\u0000\u00A2\u0006\u0005\b\u0084\u0001\u0010\u0010J#\u0010\u008A\u0001\u001A\u00020\b2\f\b\u0002\u0010\u0087\u0001\u001A\u0005\u0018\u00010\u0086\u0001H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J#\u0010\u008C\u0001\u001A\u00020\b2\f\b\u0002\u0010\u0087\u0001\u001A\u0005\u0018\u00010\u0086\u0001H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u008B\u0001\u0010\u0089\u0001J\u0011\u0010\u008E\u0001\u001A\u00020\u000EH\u0000\u00A2\u0006\u0005\b\u008D\u0001\u0010\u0010J\u0011\u0010\u0090\u0001\u001A\u00020\u000EH\u0000\u00A2\u0006\u0005\b\u008F\u0001\u0010\u0010J\u0011\u0010\u0092\u0001\u001A\u00020\u000EH\u0000\u00A2\u0006\u0005\b\u0091\u0001\u0010\u0010J\u001A\u0010\u0094\u0001\u001A\u00020\u000E2\t\b\u0002\u0010\u0093\u0001\u001A\u00020\b\u00A2\u0006\u0005\b\u0094\u0001\u0010zJ\u0011\u0010\u0096\u0001\u001A\u00020\u000EH\u0000\u00A2\u0006\u0005\b\u0095\u0001\u0010\u0010J\u0011\u0010\u0097\u0001\u001A\u00020\u000EH\u0016\u00A2\u0006\u0005\b\u0097\u0001\u0010\u0010J\u0011\u0010\u0098\u0001\u001A\u00020\u000EH\u0016\u00A2\u0006\u0005\b\u0098\u0001\u0010\u0010J\'\u0010\u009B\u0001\u001A\u00020\u000E2\u0013\u0010\u0013\u001A\u000F\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0004\u0012\u00020\u000E0\u0012H\u0080\b\u00A2\u0006\u0005\b\u009A\u0001\u0010\u0015J\'\u0010\u009E\u0001\u001A\u00020\u000E2\u0013\u0010\u0013\u001A\u000F\u0012\u0005\u0012\u00030\u009C\u0001\u0012\u0004\u0012\u00020\u000E0\u0012H\u0080\b\u00A2\u0006\u0005\b\u009D\u0001\u0010\u0015J\u0011\u0010\u00A0\u0001\u001A\u00020\u000EH\u0000\u00A2\u0006\u0005\b\u009F\u0001\u0010\u0010J\u0011\u0010\u00A2\u0001\u001A\u00020\u000EH\u0000\u00A2\u0006\u0005\b\u00A1\u0001\u0010\u0010J\u0011\u0010\u00A3\u0001\u001A\u00020\u000EH\u0016\u00A2\u0006\u0005\b\u00A3\u0001\u0010\u0010J\u0011\u0010\u00A4\u0001\u001A\u00020\u000EH\u0016\u00A2\u0006\u0005\b\u00A4\u0001\u0010\u0010J\u0011\u0010\u00A5\u0001\u001A\u00020\u000EH\u0016\u00A2\u0006\u0005\b\u00A5\u0001\u0010\u0010R(\u0010\u000B\u001A\u00020\n8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u00A6\u0001\u0010\u00A7\u0001\u001A\u0006\b\u00A8\u0001\u0010\u00A9\u0001\"\u0006\b\u00AA\u0001\u0010\u00AB\u0001R9\u0010\u00B1\u0001\u001A\u00020\n2\u0007\u0010\u00AC\u0001\u001A\u00020\n8W@WX\u0097\u000E\u00A2\u0006\u001F\n\u0006\b\u00AD\u0001\u0010\u00A7\u0001\u0012\u0005\b\u00B0\u0001\u0010\u0010\u001A\u0006\b\u00AE\u0001\u0010\u00A9\u0001\"\u0006\b\u00AF\u0001\u0010\u00AB\u0001R(\u0010\u00B7\u0001\u001A\u00020\b8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u00B2\u0001\u0010\u00B3\u0001\u001A\u0006\b\u00B4\u0001\u0010\u00B5\u0001\"\u0005\b\u00B6\u0001\u0010zR5\u0010\u00BE\u0001\u001A\u0004\u0018\u00010\u00002\t\u0010\u00B8\u0001\u001A\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u00B9\u0001\u0010\u00BA\u0001\u001A\u0006\b\u00BB\u0001\u0010\u00BC\u0001\"\u0005\b\u00BD\u0001\u0010gR-\u00102\u001A\u0004\u0018\u0001012\t\u0010\u00AC\u0001\u001A\u0004\u0018\u0001018\u0000@BX\u0080\u000E\u00A2\u0006\u0010\n\u0006\b\u00BF\u0001\u0010\u00C0\u0001\u001A\u0006\b\u00C1\u0001\u0010\u00C2\u0001R3\u0010\u00CB\u0001\u001A\f\u0018\u00010\u00C3\u0001j\u0005\u0018\u0001`\u00C4\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00C5\u0001\u0010\u00C6\u0001\u001A\u0006\b\u00C7\u0001\u0010\u00C8\u0001\"\u0006\b\u00C9\u0001\u0010\u00CA\u0001R)\u0010\u00CF\u0001\u001A\u00020\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00CC\u0001\u0010\u00A7\u0001\u001A\u0006\b\u00CD\u0001\u0010\u00A9\u0001\"\u0006\b\u00CE\u0001\u0010\u00AB\u0001R4\u0010\u00D8\u0001\u001A\u00030\u00D0\u00012\b\u0010\u00D1\u0001\u001A\u00030\u00D0\u00018\u0016@VX\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u00D2\u0001\u0010\u00D3\u0001\u001A\u0006\b\u00D4\u0001\u0010\u00D5\u0001\"\u0006\b\u00D6\u0001\u0010\u00D7\u0001R4\u0010\u00E0\u0001\u001A\u00030\u00D9\u00012\b\u0010\u00D1\u0001\u001A\u00030\u00D9\u00018\u0016@VX\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u00DA\u0001\u0010\u00DB\u0001\u001A\u0006\b\u00DC\u0001\u0010\u00DD\u0001\"\u0006\b\u00DE\u0001\u0010\u00DF\u0001R4\u0010\u00E8\u0001\u001A\u00030\u00E1\u00012\b\u0010\u00D1\u0001\u001A\u00030\u00E1\u00018\u0016@VX\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u00E2\u0001\u0010\u00E3\u0001\u001A\u0006\b\u00E4\u0001\u0010\u00E5\u0001\"\u0006\b\u00E6\u0001\u0010\u00E7\u0001R4\u0010\u00F0\u0001\u001A\u00030\u00E9\u00012\b\u0010\u00D1\u0001\u001A\u00030\u00E9\u00018\u0016@VX\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u00EA\u0001\u0010\u00EB\u0001\u001A\u0006\b\u00EC\u0001\u0010\u00ED\u0001\"\u0006\b\u00EE\u0001\u0010\u00EF\u0001R4\u0010\u00F8\u0001\u001A\u00030\u00F1\u00012\b\u0010\u00D1\u0001\u001A\u00030\u00F1\u00018\u0016@VX\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u00F2\u0001\u0010\u00F3\u0001\u001A\u0006\b\u00F4\u0001\u0010\u00F5\u0001\"\u0006\b\u00F6\u0001\u0010\u00F7\u0001R)\u0010\u00FF\u0001\u001A\u00030\u00F9\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0005\bJ\u0010\u00FA\u0001\u001A\u0006\b\u00FB\u0001\u0010\u00FC\u0001\"\u0006\b\u00FD\u0001\u0010\u00FE\u0001R/\u0010\u0084\u0002\u001A\u00020\b8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u001E\n\u0006\b\u0080\u0002\u0010\u00B3\u0001\u0012\u0005\b\u0083\u0002\u0010\u0010\u001A\u0006\b\u0081\u0002\u0010\u00B5\u0001\"\u0005\b\u0082\u0002\u0010zR \u0010\u008A\u0002\u001A\u00030\u0085\u00028\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001A\u0006\b\u0088\u0002\u0010\u0089\u0002R \u0010\u0090\u0002\u001A\u00030\u008B\u00028\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u008C\u0002\u0010\u008D\u0002\u001A\u0006\b\u008E\u0002\u0010\u008F\u0002R,\u0010\u0098\u0002\u001A\u0005\u0018\u00010\u0091\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001A\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R(\u0010\u009C\u0002\u001A\u00020\b8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u0099\u0002\u0010\u00B3\u0001\u001A\u0006\b\u009A\u0002\u0010\u00B5\u0001\"\u0005\b\u009B\u0002\u0010zR6\u0010\u00A2\u0002\u001A\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u00128\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u009D\u0002\u0010\u009E\u0002\u001A\u0006\b\u009F\u0002\u0010\u00A0\u0002\"\u0005\b\u00A1\u0002\u0010\u0015R6\u0010\u00A5\u0002\u001A\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u00128\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u00A7\u0001\u0010\u009E\u0002\u001A\u0006\b\u00A3\u0002\u0010\u00A0\u0002\"\u0005\b\u00A4\u0002\u0010\u0015R(\u0010\u00A9\u0002\u001A\u00020\b8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u00A6\u0002\u0010\u00B3\u0001\u001A\u0006\b\u00A7\u0002\u0010\u00B5\u0001\"\u0005\b\u00A8\u0002\u0010zR*\u0010\u00AB\u0002\u001A\u00020\b2\u0007\u0010\u00AC\u0001\u001A\u00020\b8\u0016@RX\u0096\u000E\u00A2\u0006\u0010\n\u0006\b\u00AA\u0002\u0010\u00B3\u0001\u001A\u0006\b\u00AB\u0002\u0010\u00B5\u0001R\u0016\u0010\u00AC\u0002\u001A\u0004\u0018\u00010\b8F\u00A2\u0006\b\u001A\u0006\b\u00AC\u0002\u0010\u00AD\u0002R\u001E\u0010\u00AF\u0002\u001A\t\u0012\u0004\u0012\u00020\u00000\u0080\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00AE\u0002\u0010\u0083\u0001R\u001F\u0010\u00B2\u0002\u001A\n\u0012\u0005\u0012\u00030\u00B0\u00020\u0080\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00B1\u0002\u0010\u0083\u0001R\u001F\u0010\u00B4\u0002\u001A\n\u0012\u0005\u0012\u00030\u00B0\u00020\u0080\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00B3\u0002\u0010\u0083\u0001R\u001E\u0010\u00B8\u0002\u001A\t\u0012\u0004\u0012\u00020\u00000\u00B5\u00028@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00B6\u0002\u0010\u00B7\u0002R\u001E\u0010\u00BA\u0002\u001A\t\u0012\u0004\u0012\u00020\u00000\u0080\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00B9\u0002\u0010\u0083\u0001R\u0019\u0010\u00BC\u0002\u001A\u0004\u0018\u00010\u00008@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00BB\u0002\u0010\u00BC\u0001R\u0017\u0010\u00BD\u0002\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00BD\u0002\u0010\u00B5\u0001R\u0018\u0010\u00C1\u0002\u001A\u00030\u00BE\u00028@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00BF\u0002\u0010\u00C0\u0002R\u001F\u0010\u00C5\u0002\u001A\n\u0018\u00010\u00C2\u0002R\u00030\u008B\u00028@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00C3\u0002\u0010\u00C4\u0002R\u001D\u0010\u00C9\u0002\u001A\b0\u00C6\u0002R\u00030\u008B\u00028@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00C7\u0002\u0010\u00C8\u0002R\u001A\u0010\u00CD\u0002\u001A\u0005\u0018\u00010\u00CA\u00028@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00CB\u0002\u0010\u00CC\u0002R%\u0010\u00D0\u0002\u001A\t\u0012\u0004\u0012\u00020\u00000\u00B5\u00028@X\u0081\u0004\u00A2\u0006\u000F\u0012\u0005\b\u00CF\u0002\u0010\u0010\u001A\u0006\b\u00CE\u0002\u0010\u00B7\u0002R\u0017\u0010\u00D1\u0002\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00D1\u0002\u0010\u00B5\u0001R\u0017\u0010\u00D3\u0002\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00D2\u0002\u0010\u00B5\u0001R\u0016\u0010>\u001A\u00020\n8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00D4\u0002\u0010\u00A9\u0001R\u0016\u0010;\u001A\u00020\n8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00D5\u0002\u0010\u00A9\u0001R\u0017\u0010\u00D7\u0002\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00D6\u0002\u0010\u00B5\u0001R\u0018\u0010\u00DB\u0002\u001A\u00030\u00D8\u00028@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00D9\u0002\u0010\u00DA\u0002R\u0017\u0010\u00DC\u0002\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00DC\u0002\u0010\u00B5\u0001R\u0014\u0010\u00DD\u0002\u001A\u00020\b8F\u00A2\u0006\b\u001A\u0006\b\u00DD\u0002\u0010\u00B5\u0001R\u0017\u0010\u00DF\u0002\u001A\u00020\n8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00DE\u0002\u0010\u00A9\u0001R\u0018\u0010\u00E1\u0002\u001A\u00030\u00F9\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00E0\u0002\u0010\u00FC\u0001R\u0018\u0010\u00E3\u0002\u001A\u00030\u00F9\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00E2\u0002\u0010\u00FC\u0001R\u0018\u0010\u00E6\u0002\u001A\u00030\u009C\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00E4\u0002\u0010\u00E5\u0002R\u0018\u0010\u00E8\u0002\u001A\u00030\u009C\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00E7\u0002\u0010\u00E5\u0002R\u0017\u0010\u00EA\u0002\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00E9\u0002\u0010\u00B5\u0001R,\u0010\u00F0\u0002\u001A\u00030\u00EB\u00022\b\u0010\u00D1\u0001\u001A\u00030\u00EB\u00028V@VX\u0096\u000E\u00A2\u0006\u0010\u001A\u0006\b\u00EC\u0002\u0010\u00ED\u0002\"\u0006\b\u00EE\u0002\u0010\u00EF\u0002R\u0018\u0010\u00F4\u0002\u001A\u00030\u00F1\u00028VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00F2\u0002\u0010\u00F3\u0002R\u0017\u0010\u00F6\u0002\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00F5\u0002\u0010\u00B5\u0001R\u0017\u0010\u00F8\u0002\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00F7\u0002\u0010\u00B5\u0001R\u0017\u0010\u00FA\u0002\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00F9\u0002\u0010\u00B5\u0001R\u0017\u0010\u00FC\u0002\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00FB\u0002\u0010\u00B5\u0001R\u0019\u0010\u00FF\u0002\u001A\u0004\u0018\u00010\u00048VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00FD\u0002\u0010\u00FE\u0002\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\u0084\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "", "updateChildrenIfDirty$ui_release", "()V", "updateChildrenIfDirty", "Lkotlin/Function1;", "block", "forEachChild", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "forEachChildIndexed", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "index", "instance", "insertAt$ui_release", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertAt", "onZSortedChildrenInvalidated$ui_release", "onZSortedChildrenInvalidated", "count", "removeAt$ui_release", "(II)V", "removeAt", "removeAll$ui_release", "removeAll", "from", "to", "move$ui_release", "(III)V", "move", "invalidateSemantics$ui_release", "invalidateSemantics", "Landroidx/compose/ui/node/Owner;", "owner", "attach$ui_release", "(Landroidx/compose/ui/node/Owner;)V", "attach", "detach$ui_release", "detach", "", "toString", "()Ljava/lang/String;", "height", "minLookaheadIntrinsicWidth", "(I)I", "width", "minLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "maxLookaheadIntrinsicHeight", "minIntrinsicWidth", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "invalidateLayer$ui_release", "invalidateLayer", "invalidateParentData$ui_release", "invalidateParentData", "x", "y", "place$ui_release", "place", "replace$ui_release", "replace", "lookaheadReplace$ui_release", "lookaheadReplace", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitSemanticsEntities", "hitTestSemantics-M_7yMNQ$ui_release", "hitTestSemantics", "it", "rescheduleRemeasureOrRelayout$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "rescheduleRemeasureOrRelayout", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "requestRemeasure$ui_release", "(ZZZ)V", "requestRemeasure", "requestLookaheadRemeasure$ui_release", "requestLookaheadRemeasure", "invalidateMeasurements$ui_release", "invalidateMeasurements", "invalidateOnPositioned$ui_release", "invalidateOnPositioned", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "ignoreRemeasureRequests", "requestRelayout$ui_release", "(Z)V", "requestRelayout", "requestLookaheadRelayout$ui_release", "requestLookaheadRelayout", "dispatchOnPositionedCallbacks$ui_release", "dispatchOnPositionedCallbacks", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "()Ljava/util/List;", "invalidateLayers$ui_release", "invalidateLayers", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lookaheadRemeasure-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)Z", "lookaheadRemeasure", "remeasure-_Sx5XlM$ui_release", "remeasure", "markLayoutPending$ui_release", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "markLookaheadLayoutPending$ui_release", "markLookaheadLayoutPending", "isRootOfInvalidation", "invalidateSubtree", "markLookaheadMeasurePending$ui_release", "markLookaheadMeasurePending", "forceRemeasure", "onLayoutComplete", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "forEachCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "forEachCoordinatorIncludingInner$ui_release", "forEachCoordinatorIncludingInner", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "resetSubtreeIntrinsicsUsage", "onReuse", "onDeactivate", "onRelease", "b", "I", "getSemanticsId", "()I", "setSemanticsId", "(I)V", "<set-?>", "c", "getCompositeKeyHash", "setCompositeKeyHash", "getCompositeKeyHash$annotations", "compositeKeyHash", "d", "Z", "isVirtualLookaheadRoot$ui_release", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "e", "Landroidx/compose/ui/node/LayoutNode;", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "g", "lookaheadRoot", "k", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "l", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "m", "getDepth$ui_release", "setDepth$ui_release", "depth", "Landroidx/compose/ui/layout/MeasurePolicy;", "value", "r", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "Landroidx/compose/ui/unit/Density;", "t", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "u", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "v", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "viewConfiguration", "Landroidx/compose/runtime/CompositionLocalMap;", "w", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "compositionLocalMap", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "intrinsicsUsageByParent", "z", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "Landroidx/compose/ui/node/NodeChain;", "A", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "nodes", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "B", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "C", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "subcompositionsState", "E", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "innerLayerCoordinatorIsDirty", "H", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "onAttach", "getOnDetach$ui_release", "setOnDetach$ui_release", "onDetach", "J", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "needsOnPositionedDispatch", "K", "isDeactivated", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "getFoldedChildren$ui_release", "foldedChildren", "Landroidx/compose/ui/layout/Measurable;", "getChildMeasurables$ui_release", "childMeasurables", "getChildLookaheadMeasurables$ui_release", "childLookaheadMeasurables", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_children", "getChildren$ui_release", "children", "getParent$ui_release", "parent", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getCollapsedSemantics$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemantics", "getZSortedChildren", "getZSortedChildren$annotations", "zSortedChildren", "isValidOwnerScope", "getHasFixedInnerContentConstraints$ui_release", "hasFixedInnerContentConstraints", "getWidth", "getHeight", "getAlignmentLinesRequired$ui_release", "alignmentLinesRequired", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "isPlaced", "isPlacedByParent", "getPlaceOrder$ui_release", "placeOrder", "getMeasuredByParent$ui_release", "measuredByParent", "getMeasuredByParentInLookahead$ui_release", "measuredByParentInLookahead", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "getOuterCoordinator$ui_release", "outerCoordinator", "getApplyingModifierOnAttach$ui_release", "applyingModifierOnAttach", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getMeasurePending$ui_release", "measurePending", "getLayoutPending$ui_release", "layoutPending", "getLookaheadMeasurePending$ui_release", "lookaheadMeasurePending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPending", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "parentInfo", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 10 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 11 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 12 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 13 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 14 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 15 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1554:1\n1323#1,7:1561\n1323#1,7:1673\n1148#1,2:1690\n1150#1,2:1704\n203#1:1707\n1311#1,7:2072\n203#1:2247\n203#1:2259\n203#1:2271\n1323#1,7:2290\n1208#2:1555\n1187#2,2:1556\n1208#2:1558\n1187#2,2:1559\n1208#2:1568\n1187#2,2:1569\n1208#2:1762\n1187#2,2:1763\n1208#2:1836\n1187#2,2:1837\n1208#2:1910\n1187#2,2:1911\n1208#2:2033\n1187#2,2:2034\n1208#2:2115\n1187#2,2:2116\n1208#2:2200\n1187#2,2:2201\n48#3:1571\n48#3:1627\n48#3:1661\n48#3:1692\n460#4,7:1572\n146#4:1579\n467#4,4:1580\n460#4,11:1584\n476#4,11:1595\n460#4,11:1628\n460#4,11:1662\n460#4,11:1693\n146#4:1706\n460#4,11:1708\n460#4,11:2154\n460#4,11:2248\n460#4,11:2260\n460#4,11:2272\n42#5,7:1606\n42#5,7:1613\n96#5,7:1620\n42#5,7:1644\n42#5,7:1651\n66#5,9:1680\n66#5,9:1949\n96#5,7:1958\n96#5,7:1965\n42#5,7:1973\n96#5,7:2283\n26#6,3:1639\n30#6:1643\n80#7:1642\n80#7:1659\n92#7:1660\n80#7:1689\n82#7:1722\n78#7:1727\n82#7:1801\n105#7:1875\n92#7:1972\n94#7,3:1980\n98#7:1984\n94#7:1989\n96#7,3:1991\n90#7:1997\n90#7:2017\n76#7:2079\n76#7:2099\n88#7:2165\n78#7:2234\n76#7:2235\n76#7:2239\n76#7:2241\n78#7:2242\n1#8:1658\n720#9,3:1719\n723#9,3:1724\n697#9,8:1728\n720#9,3:1736\n705#9,2:1739\n698#9:1741\n699#9,11:1785\n723#9,3:1796\n710#9:1799\n700#9:1800\n697#9,8:1802\n720#9,3:1810\n705#9,2:1813\n698#9:1815\n699#9,11:1859\n723#9,3:1870\n710#9:1873\n700#9:1874\n697#9,8:1876\n720#9,3:1884\n705#9,2:1887\n698#9:1889\n699#9,11:1933\n723#9,3:1944\n710#9:1947\n700#9:1948\n720#9,3:1986\n723#9,3:1994\n697#9,8:1998\n720#9,3:2006\n705#9,2:2009\n698#9:2011\n699#9,11:2056\n723#9,3:2067\n710#9:2070\n700#9:2071\n697#9,8:2080\n720#9,3:2088\n705#9,2:2091\n698#9:2093\n699#9,11:2138\n723#9,3:2149\n710#9:2152\n700#9:2153\n720#9,3:2236\n723#9,3:2244\n264#10:1723\n264#10:1748\n264#10:1822\n264#10:1896\n264#10:1990\n264#10:2019\n264#10:2101\n264#10:2186\n264#10:2240\n264#10:2243\n432#11,6:1742\n442#11,2:1749\n444#11,8:1754\n452#11,9:1765\n461#11,8:1777\n432#11,6:1816\n442#11,2:1823\n444#11,8:1828\n452#11,9:1839\n461#11,8:1851\n432#11,6:1890\n442#11,2:1897\n444#11,8:1902\n452#11,9:1913\n461#11,8:1925\n432#11,5:2012\n437#11:2018\n442#11,2:2020\n444#11,8:2025\n452#11,9:2036\n461#11,8:2048\n432#11,5:2094\n437#11:2100\n442#11,2:2102\n444#11,8:2107\n452#11,9:2118\n461#11,8:2130\n432#11,6:2180\n442#11,2:2187\n444#11,8:2192\n452#11,9:2203\n461#11,8:2215\n245#12,3:1751\n248#12,3:1774\n245#12,3:1825\n248#12,3:1848\n245#12,3:1899\n248#12,3:1922\n245#12,3:2022\n248#12,3:2045\n245#12,3:2104\n248#12,3:2127\n245#12,3:2189\n248#12,3:2212\n51#13:1983\n56#14:1985\n115#15:2166\n104#15,13:2167\n117#15:2223\n109#15,10:2224\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n120#1:1561,7\n509#1:1673,7\n542#1:1690,2\n542#1:1704,2\n611#1:1707\n1191#1:2072,7\n1359#1:2247\n1381#1:2259\n1393#1:2271\n1439#1:2290,7\n134#1:1555\n134#1:1556,2\n557#1:1558\n557#1:1559,2\n146#1:1568\n146#1:1569,2\n726#1:1762\n726#1:1763,2\n739#1:1836\n739#1:1837,2\n751#1:1910\n751#1:1911,2\n1175#1:2033\n1175#1:2034,2\n1273#1:2115\n1273#1:2116,2\n1302#1:2200\n1302#1:2201,2\n150#1:1571\n376#1:1627\n499#1:1661\n543#1:1692\n150#1:1572,7\n152#1:1579\n150#1:1580,4\n203#1:1584,11\n205#1:1595,11\n376#1:1628,11\n499#1:1662,11\n543#1:1693,11\n573#1:1706\n611#1:1708,11\n1277#1:2154,11\n1359#1:2248,11\n1381#1:2260,11\n1393#1:2272,11\n290#1:1606,7\n295#1:1613,7\n336#1:1620,7\n453#1:1644,7\n456#1:1651,7\n525#1:1680,9\n883#1:1949,9\n913#1:1958,7\n916#1:1965,7\n1101#1:1973,7\n1408#1:2283,7\n425#1:1639,3\n425#1:1643\n426#1:1642\n478#1:1659\n491#1:1660\n538#1:1689\n705#1:1722\n726#1:1727\n739#1:1801\n751#1:1875\n930#1:1972\n1138#1:1980,3\n1138#1:1984\n1140#1:1989\n1140#1:1991,3\n1175#1:1997\n1176#1:2017\n1273#1:2079\n1274#1:2099\n1302#1:2165\n1332#1:2234\n1332#1:2235\n1334#1:2239\n1335#1:2241\n1339#1:2242\n704#1:1719,3\n704#1:1724,3\n726#1:1728,8\n726#1:1736,3\n726#1:1739,2\n726#1:1741\n726#1:1785,11\n726#1:1796,3\n726#1:1799\n726#1:1800\n739#1:1802,8\n739#1:1810,3\n739#1:1813,2\n739#1:1815\n739#1:1859,11\n739#1:1870,3\n739#1:1873\n739#1:1874\n751#1:1876,8\n751#1:1884,3\n751#1:1887,2\n751#1:1889\n751#1:1933,11\n751#1:1944,3\n751#1:1947\n751#1:1948\n1139#1:1986,3\n1139#1:1994,3\n1175#1:1998,8\n1175#1:2006,3\n1175#1:2009,2\n1175#1:2011\n1175#1:2056,11\n1175#1:2067,3\n1175#1:2070\n1175#1:2071\n1273#1:2080,8\n1273#1:2088,3\n1273#1:2091,2\n1273#1:2093\n1273#1:2138,11\n1273#1:2149,3\n1273#1:2152\n1273#1:2153\n1333#1:2236,3\n1333#1:2244,3\n705#1:1723\n726#1:1748\n739#1:1822\n751#1:1896\n1140#1:1990\n1175#1:2019\n1273#1:2101\n1302#1:2186\n1334#1:2240\n1339#1:2243\n726#1:1742,6\n726#1:1749,2\n726#1:1754,8\n726#1:1765,9\n726#1:1777,8\n739#1:1816,6\n739#1:1823,2\n739#1:1828,8\n739#1:1839,9\n739#1:1851,8\n751#1:1890,6\n751#1:1897,2\n751#1:1902,8\n751#1:1913,9\n751#1:1925,8\n1175#1:2012,5\n1175#1:2018\n1175#1:2020,2\n1175#1:2025,8\n1175#1:2036,9\n1175#1:2048,8\n1273#1:2094,5\n1273#1:2100\n1273#1:2102,2\n1273#1:2107,8\n1273#1:2118,9\n1273#1:2130,8\n1302#1:2180,6\n1302#1:2187,2\n1302#1:2192,8\n1302#1:2203,9\n1302#1:2215,8\n726#1:1751,3\n726#1:1774,3\n739#1:1825,3\n739#1:1848,3\n751#1:1899,3\n751#1:1922,3\n1175#1:2022,3\n1175#1:2045,3\n1273#1:2104,3\n1273#1:2127,3\n1302#1:2189,3\n1302#1:2212,3\n1138#1:1983\n1138#1:1985\n1302#1:2166\n1302#1:2167,13\n1302#1:2223\n1302#1:2224,10\n*E\n"})
public final class LayoutNode implements ComposeNodeLifecycleCallback, LayoutInfo, Remeasurement, ComposeUiNode, InteroperableComposeUiNode, OnLayoutCompletedListener, OwnerScope {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R \u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\u000E\u001A\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\b0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001A\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "", "NotPlacedPlaceOrder", "I", "getNotPlacedPlaceOrder$ui_release$annotations", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/ViewConfiguration;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Function0 getConstructor$ui_release() {
            return LayoutNode.M;
        }

        @NotNull
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.N;
        }

        public static void getNotPlacedPlaceOrder$ui_release$annotations() {
        }

        @NotNull
        public final Comparator getZComparator$ui_release() {
            return LayoutNode.O;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle;

    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001A\u00020\f*\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ)\u0010\u0010\u001A\u00020\f*\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000F\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000EJ)\u0010\u0011\u001A\u00020\f*\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000EJ)\u0010\u0012\u001A\u00020\f*\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000F\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000E¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "error", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)Ljava/lang/Void;", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable;
        public final String a;

        public NoIntrinsicsMeasurePolicy(@NotNull String s) {
            this.a = s;
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.maxIntrinsicHeight(intrinsicMeasureScope0, list0, v)).intValue();
        }

        @NotNull
        public Void maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.maxIntrinsicWidth(intrinsicMeasureScope0, list0, v)).intValue();
        }

        @NotNull
        public Void maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.minIntrinsicHeight(intrinsicMeasureScope0, list0, v)).intValue();
        }

        @NotNull
        public Void minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.minIntrinsicWidth(intrinsicMeasureScope0, list0, v)).intValue();
        }

        @NotNull
        public Void minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
            throw new IllegalStateException(this.a.toString());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;

    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutState.values().length];
            try {
                arr_v[LayoutState.Idle.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 0;
    public final NodeChain A;
    public final LayoutNodeLayoutDelegate B;
    public LayoutNodeSubcompositionsState C;
    @NotNull
    public static final Companion Companion = null;
    public NodeCoordinator D;
    public boolean E;
    public Modifier F;
    public Modifier G;
    public Function1 H;
    public Function1 I;
    public boolean J;
    public boolean K;
    public static final LayoutNode.Companion.ErrorMeasurePolicy.1 L = null;
    public static final f M = null;
    public static final LayoutNode.Companion.DummyViewConfiguration.1 N = null;
    public static final int NotPlacedPlaceOrder = 0x7FFFFFFF;
    public static final j O;
    public final boolean a;
    public int b;
    public int c;
    public boolean d;
    public LayoutNode e;
    public int f;
    public final MutableVectorWithMutationTracking g;
    public MutableVector h;
    public boolean i;
    public LayoutNode j;
    public Owner k;
    public AndroidViewHolder l;
    public int m;
    public boolean n;
    public SemanticsConfiguration o;
    public final MutableVector p;
    public boolean q;
    public MeasurePolicy r;
    public IntrinsicsPolicy s;
    public Density t;
    public LayoutDirection u;
    public ViewConfiguration v;
    public CompositionLocalMap w;
    public UsageByParent x;
    public UsageByParent y;
    public boolean z;

    static {
        LayoutNode.Companion = new Companion(null);
        LayoutNode.$stable = 8;
        LayoutNode.L = new LayoutNode.Companion.ErrorMeasurePolicy.1("Undefined intrinsics block and it is required");  // 初始化器: Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;-><init>(Ljava/lang/String;)V
        LayoutNode.M = f.y;
        LayoutNode.N = new LayoutNode.Companion.DummyViewConfiguration.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        LayoutNode.O = new j(2);
    }

    public LayoutNode() {
        this(false, 0, 3, null);
    }

    public LayoutNode(boolean z, int v) {
        this.a = z;
        this.b = v;
        this.g = new MutableVectorWithMutationTracking(new MutableVector(new LayoutNode[16], 0), new l(0, this));
        this.p = new MutableVector(new LayoutNode[16], 0);
        this.q = true;
        this.r = LayoutNode.L;
        this.t = LayoutNodeKt.access$getDefaultDensity$p();
        this.u = LayoutDirection.Ltr;
        this.v = LayoutNode.N;
        this.w = CompositionLocalMap.Companion.getEmpty();
        this.x = UsageByParent.NotUsed;
        this.y = UsageByParent.NotUsed;
        this.A = new NodeChain(this);
        this.B = new LayoutNodeLayoutDelegate(this);
        this.E = true;
        this.F = Modifier.Companion;
    }

    public LayoutNode(boolean z, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            z = false;
        }
        if((v1 & 2) != 0) {
            v = SemanticsModifierKt.generateSemanticsId();
        }
        this(z, v);
    }

    public final void a(Modifier modifier0) {
        this.F = modifier0;
        this.A.updateFrom$ui_release(modifier0);
        this.B.updateParentData();
        if(this.e == null && this.A.has-H91voCI$ui_release(0x200)) {
            this.g(this);
        }
    }

    public final void attach$ui_release(@NotNull Owner owner0) {
        LayoutNode layoutNode3;
        if(this.k != null) {
            InlineClassHelperKt.throwIllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + this.c(0)));
        }
        if(this.j != null && !Intrinsics.areEqual(this.j.k, owner0)) {
            LayoutNode layoutNode0 = this.getParent$ui_release();
            InlineClassHelperKt.throwIllegalStateException(("Attaching to a different owner(" + owner0 + ") than the parent\'s owner(" + (layoutNode0 == null ? null : layoutNode0.k) + "). This tree: " + this.c(0) + " Parent tree: " + (this.j == null ? null : this.j.c(0))));
        }
        LayoutNode layoutNode1 = this.getParent$ui_release();
        if(layoutNode1 == null) {
            this.getMeasurePassDelegate$ui_release().setPlaced$ui_release(true);
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLookaheadPassDelegate$ui_release();
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.setPlaced(true);
            }
        }
        this.getOuterCoordinator$ui_release().setWrappedBy$ui_release((layoutNode1 == null ? null : layoutNode1.getInnerCoordinator$ui_release()));
        this.k = owner0;
        this.m = (layoutNode1 == null ? -1 : layoutNode1.m) + 1;
        Modifier modifier0 = this.G;
        if(modifier0 != null) {
            this.a(modifier0);
        }
        this.G = null;
        NodeChain nodeChain0 = this.A;
        if(nodeChain0.has-H91voCI$ui_release(8)) {
            this.invalidateSemantics$ui_release();
        }
        owner0.onAttach(this);
        if(this.d) {
            this.g(this);
        }
        else {
            LayoutNode layoutNode2 = this.j;
            if(layoutNode2 == null) {
                layoutNode3 = this.e;
            }
            else {
                layoutNode3 = layoutNode2.e;
                if(layoutNode3 == null) {
                    layoutNode3 = this.e;
                }
            }
            this.g(layoutNode3);
            if(this.e == null && nodeChain0.has-H91voCI$ui_release(0x200)) {
                this.g(this);
            }
        }
        if(!this.isDeactivated()) {
            nodeChain0.markAsAttached();
        }
        MutableVector mutableVector0 = this.g.getVector();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((LayoutNode)arr_object[v1]).attach$ui_release(owner0);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        if(!this.isDeactivated()) {
            nodeChain0.runAttachLifecycle();
        }
        this.invalidateMeasurements$ui_release();
        if(layoutNode1 != null) {
            layoutNode1.invalidateMeasurements$ui_release();
        }
        NodeCoordinator nodeCoordinator0 = this.getOuterCoordinator$ui_release();
        NodeCoordinator nodeCoordinator1 = this.getInnerCoordinator$ui_release().getWrapped$ui_release();
        while(!Intrinsics.areEqual(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
            nodeCoordinator0.onLayoutNodeAttach();
            nodeCoordinator0 = nodeCoordinator0.getWrapped$ui_release();
        }
        Function1 function10 = this.H;
        if(function10 != null) {
            function10.invoke(owner0);
        }
        this.B.updateParentData();
        if(!this.isDeactivated() && nodeChain0.has$ui_release(0x1C00)) {
            for(Node modifier$Node0 = nodeChain0.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
                if((((0x400 & modifier$Node0.getKindSet$ui_release()) == 0 ? 0 : 1) | ((0x800 & modifier$Node0.getKindSet$ui_release()) == 0 ? 0 : 1) | ((0x1000 & modifier$Node0.getKindSet$ui_release()) == 0 ? 0 : 1)) != 0) {
                    NodeKindKt.autoInvalidateInsertedNode(modifier$Node0);
                }
            }
        }
    }

    public final void b() {
        this.y = this.x;
        this.x = UsageByParent.NotUsed;
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.x == UsageByParent.InLayoutBlock) {
                    layoutNode0.b();
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final String c(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
        stringBuilder0.append("|-");
        stringBuilder0.append(this.toString());
        stringBuilder0.append('\n');
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v2 = mutableVector0.getSize();
        if(v2 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v3 = 0;
            while(true) {
                stringBuilder0.append(((LayoutNode)arr_object[v3]).c(v + 1));
                ++v3;
                if(v3 >= v2) {
                    break;
                }
            }
        }
        String s = stringBuilder0.toString();
        if(v == 0) {
            s = s.substring(0, s.length() - 1);
            Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return s;
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.y = this.x;
        this.x = UsageByParent.NotUsed;
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.x != UsageByParent.NotUsed) {
                    layoutNode0.clearSubtreeIntrinsicsUsage$ui_release();
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final IntrinsicsPolicy d() {
        IntrinsicsPolicy intrinsicsPolicy0 = this.s;
        if(intrinsicsPolicy0 == null) {
            intrinsicsPolicy0 = new IntrinsicsPolicy(this, this.getMeasurePolicy());
            this.s = intrinsicsPolicy0;
        }
        return intrinsicsPolicy0;
    }

    public final void detach$ui_release() {
        Owner owner0 = this.k;
        String s = null;
        if(owner0 == null) {
            StringBuilder stringBuilder0 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNode0 = this.getParent$ui_release();
            if(layoutNode0 != null) {
                s = layoutNode0.c(0);
            }
            stringBuilder0.append(s);
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(stringBuilder0.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode layoutNode1 = this.getParent$ui_release();
        if(layoutNode1 != null) {
            layoutNode1.invalidateLayer$ui_release();
            layoutNode1.invalidateMeasurements$ui_release();
            UsageByParent layoutNode$UsageByParent0 = UsageByParent.NotUsed;
            this.getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(layoutNode$UsageByParent0);
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLookaheadPassDelegate$ui_release();
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.setMeasuredByParent$ui_release(layoutNode$UsageByParent0);
            }
        }
        this.B.resetAlignmentLines();
        Function1 function10 = this.I;
        if(function10 != null) {
            function10.invoke(owner0);
        }
        NodeChain nodeChain0 = this.A;
        if(nodeChain0.has-H91voCI$ui_release(8)) {
            this.invalidateSemantics$ui_release();
        }
        nodeChain0.runDetachLifecycle$ui_release();
        this.n = true;
        MutableVector mutableVector0 = this.g.getVector();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((LayoutNode)arr_object[v1]).detach$ui_release();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.n = false;
        nodeChain0.markAsDetached$ui_release();
        owner0.onDetach(this);
        this.k = null;
        this.g(null);
        this.m = 0;
        this.getMeasurePassDelegate$ui_release().onNodeDetached();
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate1 = this.getLookaheadPassDelegate$ui_release();
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate1 != null) {
            layoutNodeLayoutDelegate$LookaheadPassDelegate1.onNodeDetached();
        }
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        if(this.getLayoutState$ui_release() != LayoutState.Idle || this.getLayoutPending$ui_release() || this.getMeasurePending$ui_release() || this.isDeactivated() || !this.isPlaced()) {
            return;
        }
        NodeChain nodeChain0 = this.A;
        if((NodeChain.access$getAggregateChildKindSet(nodeChain0) & 0x100) != 0) {
            Node modifier$Node0 = nodeChain0.getHead$ui_release();
            while(modifier$Node0 != null) {
                if((modifier$Node0.getKindSet$ui_release() & 0x100) != 0) {
                    Node modifier$Node1 = modifier$Node0;
                    MutableVector mutableVector0 = null;
                    while(modifier$Node1 != null) {
                        if(modifier$Node1 instanceof GlobalPositionAwareModifierNode) {
                            ((GlobalPositionAwareModifierNode)modifier$Node1).onGloballyPositioned(DelegatableNodeKt.requireCoordinator-64DMado(((GlobalPositionAwareModifierNode)modifier$Node1), 0x100));
                        }
                        else if((modifier$Node1.getKindSet$ui_release() & 0x100) != 0 && modifier$Node1 instanceof DelegatingNode) {
                            Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                            int v = 0;
                            while(modifier$Node2 != null) {
                                if((modifier$Node2.getKindSet$ui_release() & 0x100) != 0) {
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
                                goto label_31;
                            }
                            continue;
                        }
                    label_31:
                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                    }
                }
                if((modifier$Node0.getAggregateChildKindSet$ui_release() & 0x100) == 0) {
                    break;
                }
                modifier$Node0 = modifier$Node0.getChild$ui_release();
            }
        }
    }

    public final void draw$ui_release(@NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        this.getOuterCoordinator$ui_release().draw(canvas0, graphicsLayer0);
    }

    public final void e() {
        if(this.f > 0) {
            this.i = true;
        }
        if(this.a) {
            LayoutNode layoutNode0 = this.j;
            if(layoutNode0 != null) {
                layoutNode0.e();
            }
        }
    }

    public final void f(LayoutNode layoutNode0) {
        if(layoutNode0.B.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.B.setChildrenAccessingCoordinatesDuringPlacement(this.B.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if(this.k != null) {
            layoutNode0.detach$ui_release();
        }
        layoutNode0.j = null;
        layoutNode0.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if(layoutNode0.a) {
            --this.f;
            MutableVector mutableVector0 = layoutNode0.g.getVector();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    ((LayoutNode)arr_object[v1]).getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }
        this.e();
        this.onZSortedChildrenInvalidated$ui_release();
    }

    public final void forEachChild(@NotNull Function1 function10) {
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                function10.invoke(arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void forEachChildIndexed(@NotNull Function2 function20) {
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                function20.invoke(v1, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void forEachCoordinator$ui_release(@NotNull Function1 function10) {
        NodeCoordinator nodeCoordinator0 = this.getOuterCoordinator$ui_release();
        NodeCoordinator nodeCoordinator1 = this.getInnerCoordinator$ui_release();
        while(nodeCoordinator0 != nodeCoordinator1) {
            Intrinsics.checkNotNull(nodeCoordinator0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            function10.invoke(((LayoutModifierNodeCoordinator)nodeCoordinator0));
            nodeCoordinator0 = ((LayoutModifierNodeCoordinator)nodeCoordinator0).getWrapped$ui_release();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(@NotNull Function1 function10) {
        NodeCoordinator nodeCoordinator0 = this.getOuterCoordinator$ui_release();
        NodeCoordinator nodeCoordinator1 = this.getInnerCoordinator$ui_release().getWrapped$ui_release();
        while(!Intrinsics.areEqual(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
            function10.invoke(nodeCoordinator0);
            nodeCoordinator0 = nodeCoordinator0.getWrapped$ui_release();
        }
    }

    @Override  // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        if(this.e == null) {
            LayoutNode.requestRemeasure$ui_release$default(this, false, false, false, 5, null);
        }
        else {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(this, false, false, false, 5, null);
        }
        Constraints constraints0 = this.B.getLastConstraints-DWUhwKw();
        if(constraints0 == null) {
            Owner owner1 = this.k;
            if(owner1 != null) {
                Owner.measureAndLayout$default(owner1, false, 1, null);
            }
        }
        else {
            Owner owner0 = this.k;
            if(owner0 != null) {
                owner0.measureAndLayout-0kLqBqw(this, constraints0.unbox-impl());
            }
        }
    }

    public final void g(LayoutNode layoutNode0) {
        if(!Intrinsics.areEqual(layoutNode0, this.e)) {
            this.e = layoutNode0;
            if(layoutNode0 != null) {
                this.B.ensureLookaheadDelegateCreated$ui_release();
                NodeCoordinator nodeCoordinator0 = this.getOuterCoordinator$ui_release();
                NodeCoordinator nodeCoordinator1 = this.getInnerCoordinator$ui_release().getWrapped$ui_release();
                while(!Intrinsics.areEqual(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
                    nodeCoordinator0.ensureLookaheadDelegateCreated();
                    nodeCoordinator0 = nodeCoordinator0.getWrapped$ui_release();
                }
            }
            this.invalidateMeasurements$ui_release();
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = this.B;
        if(!layoutNodeLayoutDelegate0.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            AlignmentLinesOwner alignmentLinesOwner0 = layoutNodeLayoutDelegate0.getLookaheadAlignmentLinesOwner$ui_release();
            if(alignmentLinesOwner0 != null) {
                AlignmentLines alignmentLines0 = alignmentLinesOwner0.getAlignmentLines();
                return alignmentLines0 != null && alignmentLines0.getRequired$ui_release();
            }
            return false;
        }
        return true;
    }

    public final boolean getApplyingModifierOnAttach$ui_release() {
        return this.G != null;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.z;
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static void getCanMultiMeasure$ui_release$annotations() {
    }

    @NotNull
    public final List getChildLookaheadMeasurables$ui_release() {
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
        return layoutNodeLayoutDelegate$LookaheadPassDelegate0.getChildDelegates$ui_release();
    }

    @NotNull
    public final List getChildMeasurables$ui_release() {
        return this.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    @NotNull
    public final List getChildren$ui_release() {
        return this.get_children$ui_release().asMutableList();
    }

    @Nullable
    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        Trace.beginSection("collapseSemantics");
        try {
            if(this.A.has-H91voCI$ui_release(8) && this.o == null) {
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = new SemanticsConfiguration();
                LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new m(this, ref$ObjectRef0));
                Object object0 = ref$ObjectRef0.element;
                this.o = (SemanticsConfiguration)object0;
                return (SemanticsConfiguration)object0;
            }
            return this.o;
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public int getCompositeKeyHash() {
        return this.c;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public static void getCompositeKeyHash$annotations() {
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public CompositionLocalMap getCompositionLocalMap() {
        return this.w;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.getInnerCoordinator$ui_release();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.t;
    }

    public final int getDepth$ui_release() {
        return this.m;
    }

    @NotNull
    public final List getFoldedChildren$ui_release() {
        return this.g.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long v = this.getInnerCoordinator$ui_release().getLastMeasurementConstraints-msEJaDk$ui_release();
        return Constraints.getHasFixedWidth-impl(v) && Constraints.getHasFixedHeight-impl(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.B.getHeight$ui_release();
    }

    @NotNull
    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.A.getInnerCoordinator$ui_release();
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.E;
    }

    @Override  // androidx.compose.ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    @Nullable
    public View getInteropView() {
        return this.l == null ? null : this.l.getInteropView();
    }

    @Nullable
    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.l;
    }

    @NotNull
    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.x;
    }

    @NotNull
    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.B;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.u;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.B.getLayoutPending$ui_release();
    }

    @NotNull
    public final LayoutState getLayoutState$ui_release() {
        return this.B.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.B.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.B.getLookaheadMeasurePending$ui_release();
    }

    @Nullable
    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.B.getLookaheadPassDelegate$ui_release();
    }

    @Nullable
    public final LayoutNode getLookaheadRoot$ui_release() {
        return this.e;
    }

    @NotNull
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @NotNull
    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.B.getMeasurePassDelegate$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.B.getMeasurePending$ui_release();
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.r;
    }

    @NotNull
    public final UsageByParent getMeasuredByParent$ui_release() {
        return this.getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    @NotNull
    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLookaheadPassDelegate$ui_release();
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
            UsageByParent layoutNode$UsageByParent0 = layoutNodeLayoutDelegate$LookaheadPassDelegate0.getMeasuredByParent$ui_release();
            return layoutNode$UsageByParent0 == null ? UsageByParent.NotUsed : layoutNode$UsageByParent0;
        }
        return UsageByParent.NotUsed;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.F;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public List getModifierInfo() {
        return this.A.getModifierInfo();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.J;
    }

    @NotNull
    public final NodeChain getNodes$ui_release() {
        return this.A;
    }

    @Nullable
    public final Function1 getOnAttach$ui_release() {
        return this.H;
    }

    @Nullable
    public final Function1 getOnDetach$ui_release() {
        return this.I;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.A.getOuterCoordinator$ui_release();
    }

    @Nullable
    public final Owner getOwner$ui_release() {
        return this.k;
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode0;
        for(layoutNode0 = this.j; layoutNode0 != null && layoutNode0.a; layoutNode0 = layoutNode0.j) {
        }
        return layoutNode0;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return this.getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return this.getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.b;
    }

    @Nullable
    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.C;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.v;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.B.getWidth$ui_release();
    }

    @NotNull
    public final MutableVector getZSortedChildren() {
        MutableVector mutableVector0 = this.p;
        if(this.q) {
            mutableVector0.clear();
            mutableVector0.addAll(mutableVector0.getSize(), this.get_children$ui_release());
            mutableVector0.sortWith(LayoutNode.O);
            this.q = false;
        }
        return mutableVector0;
    }

    @PublishedApi
    public static void getZSortedChildren$annotations() {
    }

    @NotNull
    public final MutableVector get_children$ui_release() {
        this.updateChildrenIfDirty$ui_release();
        if(this.f == 0) {
            return this.g.getVector();
        }
        MutableVector mutableVector0 = this.h;
        Intrinsics.checkNotNull(mutableVector0);
        return mutableVector0;
    }

    public final void hitTest-M_7yMNQ$ui_release(long v, @NotNull HitTestResult hitTestResult0, boolean z, boolean z1) {
        long v1 = NodeCoordinator.fromParentPosition-8S9VItk$default(this.getOuterCoordinator$ui_release(), v, false, 2, null);
        this.getOuterCoordinator$ui_release().hitTest-YqVAtuI(NodeCoordinator.Companion.getPointerInputSource(), v1, hitTestResult0, z, z1);
    }

    public static void hitTest-M_7yMNQ$ui_release$default(LayoutNode layoutNode0, long v, HitTestResult hitTestResult0, boolean z, boolean z1, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        if((v1 & 8) != 0) {
            z1 = true;
        }
        layoutNode0.hitTest-M_7yMNQ$ui_release(v, hitTestResult0, z, z1);
    }

    public final void hitTestSemantics-M_7yMNQ$ui_release(long v, @NotNull HitTestResult hitTestResult0, boolean z, boolean z1) {
        long v1 = NodeCoordinator.fromParentPosition-8S9VItk$default(this.getOuterCoordinator$ui_release(), v, false, 2, null);
        this.getOuterCoordinator$ui_release().hitTest-YqVAtuI(NodeCoordinator.Companion.getSemanticsSource(), v1, hitTestResult0, true, z1);
    }

    public static void hitTestSemantics-M_7yMNQ$ui_release$default(LayoutNode layoutNode0, long v, HitTestResult hitTestResult0, boolean z, boolean z1, int v1, Object object0) {
        layoutNode0.hitTestSemantics-M_7yMNQ$ui_release(v, hitTestResult0, ((v1 & 4) == 0 ? z : true), ((v1 & 8) == 0 ? z1 : true));
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull Function0 function00) {
        this.n = true;
        function00.invoke();
        this.n = false;
    }

    public final void insertAt$ui_release(int v, @NotNull LayoutNode layoutNode0) {
        if(layoutNode0.j != null) {
            InlineClassHelperKt.throwIllegalStateException(("Cannot insert " + layoutNode0 + " because it already has a parent. This tree: " + this.c(0) + " Other tree: " + (layoutNode0.j == null ? null : layoutNode0.j.c(0))));
        }
        if(layoutNode0.k != null) {
            InlineClassHelperKt.throwIllegalStateException(("Cannot insert " + layoutNode0 + " because it already has an owner. This tree: " + this.c(0) + " Other tree: " + layoutNode0.c(0)));
        }
        layoutNode0.j = this;
        this.g.add(v, layoutNode0);
        this.onZSortedChildrenInvalidated$ui_release();
        if(layoutNode0.a) {
            ++this.f;
        }
        this.e();
        Owner owner0 = this.k;
        if(owner0 != null) {
            layoutNode0.attach$ui_release(owner0);
        }
        if(layoutNode0.B.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.B.setChildrenAccessingCoordinatesDuringPlacement(this.B.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void invalidateLayer$ui_release() {
        if(this.E) {
            NodeCoordinator nodeCoordinator0 = this.getInnerCoordinator$ui_release();
            NodeCoordinator nodeCoordinator1 = this.getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this.D = null;
            while(!Intrinsics.areEqual(nodeCoordinator0, nodeCoordinator1)) {
                if((nodeCoordinator0 == null ? null : nodeCoordinator0.getLayer()) != null) {
                    this.D = nodeCoordinator0;
                    break;
                }
                nodeCoordinator0 = nodeCoordinator0 == null ? null : nodeCoordinator0.getWrappedBy$ui_release();
            }
        }
        NodeCoordinator nodeCoordinator2 = this.D;
        if(nodeCoordinator2 != null && nodeCoordinator2.getLayer() == null) {
            throw a.b("layer was not set");
        }
        if(nodeCoordinator2 != null) {
            nodeCoordinator2.invalidateLayer();
            return;
        }
        LayoutNode layoutNode0 = this.getParent$ui_release();
        if(layoutNode0 != null) {
            layoutNode0.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator nodeCoordinator0 = this.getOuterCoordinator$ui_release();
        NodeCoordinator nodeCoordinator1 = this.getInnerCoordinator$ui_release();
        while(nodeCoordinator0 != nodeCoordinator1) {
            Intrinsics.checkNotNull(nodeCoordinator0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer ownedLayer0 = ((LayoutModifierNodeCoordinator)nodeCoordinator0).getLayer();
            if(ownedLayer0 != null) {
                ownedLayer0.invalidate();
            }
            nodeCoordinator0 = ((LayoutModifierNodeCoordinator)nodeCoordinator0).getWrapped$ui_release();
        }
        OwnedLayer ownedLayer1 = this.getInnerCoordinator$ui_release().getLayer();
        if(ownedLayer1 != null) {
            ownedLayer1.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if(this.e != null) {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(this, false, false, false, 7, null);
            return;
        }
        LayoutNode.requestRemeasure$ui_release$default(this, false, false, false, 7, null);
    }

    public final void invalidateOnPositioned$ui_release() {
        if(!this.getLayoutPending$ui_release() && !this.getMeasurePending$ui_release() && !this.J) {
            LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
        }
    }

    public final void invalidateParentData$ui_release() {
        this.B.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        this.o = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
    }

    public final void invalidateSubtree(boolean z) {
        if(z) {
            LayoutNode layoutNode0 = this.getParent$ui_release();
            if(layoutNode0 != null) {
                layoutNode0.invalidateLayer$ui_release();
            }
        }
        this.invalidateSemantics$ui_release();
        LayoutNode.requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        NodeChain nodeChain0 = this.A;
        if((NodeChain.access$getAggregateChildKindSet(nodeChain0) & 2) == 0) {
        label_42:
            MutableVector mutableVector1 = this.get_children$ui_release();
            int v1 = mutableVector1.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v2 = 0;
                while(true) {
                    ((LayoutNode)arr_object[v2]).invalidateSubtree(false);
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
        }
        else {
            Node modifier$Node0 = nodeChain0.getHead$ui_release();
            while(true) {
                if(modifier$Node0 == null) {
                    goto label_42;
                }
                if((modifier$Node0.getKindSet$ui_release() & 2) != 0) {
                    Node modifier$Node1 = modifier$Node0;
                    MutableVector mutableVector0 = null;
                    while(modifier$Node1 != null) {
                        if(modifier$Node1 instanceof LayoutModifierNode) {
                            OwnedLayer ownedLayer0 = DelegatableNodeKt.requireCoordinator-64DMado(((LayoutModifierNode)modifier$Node1), 2).getLayer();
                            if(ownedLayer0 != null) {
                                ownedLayer0.invalidate();
                            }
                        }
                        else if((modifier$Node1.getKindSet$ui_release() & 2) != 0 && modifier$Node1 instanceof DelegatingNode) {
                            Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                            int v = 0;
                            while(modifier$Node2 != null) {
                                if((modifier$Node2.getKindSet$ui_release() & 2) != 0) {
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
                                goto label_37;
                            }
                            continue;
                        }
                    label_37:
                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                    }
                }
                if((modifier$Node0.getAggregateChildKindSet$ui_release() & 2) != 0) {
                    modifier$Node0 = modifier$Node0.getChild$ui_release();
                    continue;
                }
                goto label_42;
            }
        }
    }

    public static void invalidateSubtree$default(LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        layoutNode0.invalidateSubtree(z);
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.k != null;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.K;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return this.getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return this.getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    @Nullable
    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLookaheadPassDelegate$ui_release();
        return layoutNodeLayoutDelegate$LookaheadPassDelegate0 == null ? null : Boolean.valueOf(layoutNodeLayoutDelegate$LookaheadPassDelegate0.isPlaced());
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.d;
    }

    public final boolean lookaheadRemeasure-_Sx5XlM$ui_release(@Nullable Constraints constraints0) {
        if(constraints0 != null && this.e != null) {
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
            return layoutNodeLayoutDelegate$LookaheadPassDelegate0.remeasure-BRTryo0(constraints0.unbox-impl());
        }
        return false;
    }

    public static boolean lookaheadRemeasure-_Sx5XlM$ui_release$default(LayoutNode layoutNode0, Constraints constraints0, int v, Object object0) {
        if((v & 1) != 0) {
            constraints0 = layoutNode0.B.getLastLookaheadConstraints-DWUhwKw();
        }
        return layoutNode0.lookaheadRemeasure-_Sx5XlM$ui_release(constraints0);
    }

    public final void lookaheadReplace$ui_release() {
        if(this.x == UsageByParent.NotUsed) {
            this.b();
        }
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
        layoutNodeLayoutDelegate$LookaheadPassDelegate0.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.B.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.B.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.B.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.B.markMeasurePending$ui_release();
    }

    public final int maxIntrinsicHeight(int v) {
        return this.d().maxIntrinsicHeight(v);
    }

    public final int maxIntrinsicWidth(int v) {
        return this.d().maxIntrinsicWidth(v);
    }

    public final int maxLookaheadIntrinsicHeight(int v) {
        return this.d().maxLookaheadIntrinsicHeight(v);
    }

    public final int maxLookaheadIntrinsicWidth(int v) {
        return this.d().maxLookaheadIntrinsicWidth(v);
    }

    public final int minIntrinsicHeight(int v) {
        return this.d().minIntrinsicHeight(v);
    }

    public final int minIntrinsicWidth(int v) {
        return this.d().minIntrinsicWidth(v);
    }

    public final int minLookaheadIntrinsicHeight(int v) {
        return this.d().minLookaheadIntrinsicHeight(v);
    }

    public final int minLookaheadIntrinsicWidth(int v) {
        return this.d().minLookaheadIntrinsicWidth(v);
    }

    public final void move$ui_release(int v, int v1, int v2) {
        if(v == v1) {
            return;
        }
        for(int v3 = 0; v3 < v2; ++v3) {
            LayoutNode layoutNode0 = (LayoutNode)this.g.removeAt((v <= v1 ? v : v + v3));
            this.g.add((v <= v1 ? v1 + v2 - 2 : v1 + v3), layoutNode0);
        }
        this.onZSortedChildrenInvalidated$ui_release();
        this.e();
        this.invalidateMeasurements$ui_release();
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder0 = this.l;
        if(androidViewHolder0 != null) {
            androidViewHolder0.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.C;
        if(layoutNodeSubcompositionsState0 != null) {
            layoutNodeSubcompositionsState0.onDeactivate();
        }
        this.K = true;
        this.A.resetState$ui_release();
        if(this.isAttached()) {
            this.invalidateSemantics$ui_release();
        }
    }

    @Override  // androidx.compose.ui.node.Owner$OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator nodeCoordinator0 = this.getInnerCoordinator$ui_release();
        Node modifier$Node0 = nodeCoordinator0.getTail();
        Node modifier$Node1 = nodeCoordinator0.h(true);
        while(modifier$Node1 != null && (modifier$Node1.getAggregateChildKindSet$ui_release() & 0x80) != 0) {
            if((modifier$Node1.getKindSet$ui_release() & 0x80) != 0) {
                Node modifier$Node2 = modifier$Node1;
                MutableVector mutableVector0 = null;
                while(modifier$Node2 != null) {
                    if(modifier$Node2 instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode)modifier$Node2).onPlaced(this.getInnerCoordinator$ui_release());
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
                            goto label_29;
                        }
                        continue;
                    }
                label_29:
                    modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector0);
                }
            }
            if(modifier$Node1 == modifier$Node0) {
                break;
            }
            modifier$Node1 = modifier$Node1.getChild$ui_release();
        }
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder0 = this.l;
        if(androidViewHolder0 != null) {
            androidViewHolder0.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.C;
        if(layoutNodeSubcompositionsState0 != null) {
            layoutNodeSubcompositionsState0.onRelease();
        }
        NodeCoordinator nodeCoordinator0 = this.getOuterCoordinator$ui_release();
        NodeCoordinator nodeCoordinator1 = this.getInnerCoordinator$ui_release().getWrapped$ui_release();
        while(!Intrinsics.areEqual(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
            nodeCoordinator0.onRelease();
            nodeCoordinator0 = nodeCoordinator0.getWrapped$ui_release();
        }
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder0 = this.l;
        if(androidViewHolder0 != null) {
            androidViewHolder0.onReuse();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.C;
        if(layoutNodeSubcompositionsState0 != null) {
            layoutNodeSubcompositionsState0.onReuse();
        }
        NodeChain nodeChain0 = this.A;
        if(this.isDeactivated()) {
            this.K = false;
            this.invalidateSemantics$ui_release();
        }
        else {
            nodeChain0.resetState$ui_release();
        }
        this.setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        nodeChain0.markAsAttached();
        nodeChain0.runAttachLifecycle();
        this.rescheduleRemeasureOrRelayout$ui_release(this);
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if(this.a) {
            LayoutNode layoutNode0 = this.getParent$ui_release();
            if(layoutNode0 != null) {
                layoutNode0.onZSortedChildrenInvalidated$ui_release();
            }
        }
        else {
            this.q = true;
        }
    }

    public final void place$ui_release(int v, int v1) {
        PlacementScope placeable$PlacementScope0;
        if(this.x == UsageByParent.NotUsed) {
            this.b();
        }
        LayoutNode layoutNode0 = this.getParent$ui_release();
        if(layoutNode0 == null) {
            placeable$PlacementScope0 = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        else {
            NodeCoordinator nodeCoordinator0 = layoutNode0.getInnerCoordinator$ui_release();
            if(nodeCoordinator0 == null) {
                placeable$PlacementScope0 = LayoutNodeKt.requireOwner(this).getPlacementScope();
            }
            else {
                placeable$PlacementScope0 = nodeCoordinator0.getPlacementScope();
                if(placeable$PlacementScope0 == null) {
                    placeable$PlacementScope0 = LayoutNodeKt.requireOwner(this).getPlacementScope();
                }
            }
        }
        PlacementScope.placeRelative$default(placeable$PlacementScope0, this.getMeasurePassDelegate$ui_release(), v, v1, 0.0f, 4, null);
    }

    public final boolean remeasure-_Sx5XlM$ui_release(@Nullable Constraints constraints0) {
        if(constraints0 != null) {
            if(this.x == UsageByParent.NotUsed) {
                this.clearSubtreeIntrinsicsUsage$ui_release();
            }
            return this.getMeasurePassDelegate$ui_release().remeasure-BRTryo0(constraints0.unbox-impl());
        }
        return false;
    }

    public static boolean remeasure-_Sx5XlM$ui_release$default(LayoutNode layoutNode0, Constraints constraints0, int v, Object object0) {
        if((v & 1) != 0) {
            constraints0 = layoutNode0.B.getLastConstraints-DWUhwKw();
        }
        return layoutNode0.remeasure-_Sx5XlM$ui_release(constraints0);
    }

    public final void removeAll$ui_release() {
        MutableVectorWithMutationTracking mutableVectorWithMutationTracking0 = this.g;
        for(int v = mutableVectorWithMutationTracking0.getSize() - 1; -1 < v; --v) {
            this.f(((LayoutNode)mutableVectorWithMutationTracking0.get(v)));
        }
        mutableVectorWithMutationTracking0.clear();
    }

    public final void removeAt$ui_release(int v, int v1) {
        if(v1 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException(("count (" + v1 + ") must be greater than 0"));
        }
        int v2 = v1 + v - 1;
        if(v <= v2) {
            while(true) {
                this.f(((LayoutNode)this.g.get(v2)));
                LayoutNode layoutNode0 = (LayoutNode)this.g.removeAt(v2);
                if(v2 == v) {
                    break;
                }
                --v2;
            }
        }
    }

    public final void replace$ui_release() {
        if(this.x == UsageByParent.NotUsed) {
            this.b();
        }
        this.getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestLookaheadRelayout$ui_release(boolean z) {
        if(!this.a) {
            Owner owner0 = this.k;
            if(owner0 != null) {
                owner0.onRequestRelayout(this, true, z);
            }
        }
    }

    public static void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        layoutNode0.requestLookaheadRelayout$ui_release(z);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z, boolean z1, boolean z2) {
        if(this.e == null) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner0 = this.k;
        if(owner0 == null) {
            return;
        }
        if(!this.n && !this.a) {
            owner0.onRequestMeasure(this, true, z, z1);
            if(z2) {
                LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.invalidateIntrinsicsParent(z);
            }
        }
    }

    public static void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode0, boolean z, boolean z1, boolean z2, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            z2 = true;
        }
        layoutNode0.requestLookaheadRemeasure$ui_release(z, z1, z2);
    }

    public final void requestRelayout$ui_release(boolean z) {
        if(!this.a) {
            Owner owner0 = this.k;
            if(owner0 != null) {
                Owner.onRequestRelayout$default(owner0, this, false, z, 2, null);
            }
        }
    }

    public static void requestRelayout$ui_release$default(LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        layoutNode0.requestRelayout$ui_release(z);
    }

    public final void requestRemeasure$ui_release(boolean z, boolean z1, boolean z2) {
        if(!this.n && !this.a) {
            Owner owner0 = this.k;
            if(owner0 == null) {
                return;
            }
            Owner.onRequestMeasure$default(owner0, this, false, z, z1, 2, null);
            if(z2) {
                this.getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(z);
            }
        }
    }

    public static void requestRemeasure$ui_release$default(LayoutNode layoutNode0, boolean z, boolean z1, boolean z2, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            z2 = true;
        }
        layoutNode0.requestRemeasure$ui_release(z, z1, z2);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@NotNull LayoutNode layoutNode0) {
        if(WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode0.getLayoutState$ui_release());
        }
        if(layoutNode0.getLookaheadMeasurePending$ui_release()) {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode0, true, false, false, 6, null);
            return;
        }
        if(layoutNode0.getLookaheadLayoutPending$ui_release()) {
            layoutNode0.requestLookaheadRelayout$ui_release(true);
        }
        if(layoutNode0.getMeasurePending$ui_release()) {
            LayoutNode.requestRemeasure$ui_release$default(layoutNode0, true, false, false, 6, null);
            return;
        }
        if(layoutNode0.getLayoutPending$ui_release()) {
            layoutNode0.requestRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                layoutNode0.x = layoutNode0.y;
                if(layoutNode0.y != UsageByParent.NotUsed) {
                    layoutNode0.resetSubtreeIntrinsicsUsage$ui_release();
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.z = z;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public void setCompositeKeyHash(int v) {
        this.c = v;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(@NotNull CompositionLocalMap compositionLocalMap0) {
        this.w = compositionLocalMap0;
        this.setDensity(((Density)compositionLocalMap0.get(CompositionLocalsKt.getLocalDensity())));
        this.setLayoutDirection(((LayoutDirection)compositionLocalMap0.get(CompositionLocalsKt.getLocalLayoutDirection())));
        this.setViewConfiguration(((ViewConfiguration)compositionLocalMap0.get(CompositionLocalsKt.getLocalViewConfiguration())));
        NodeChain nodeChain0 = this.A;
        if((NodeChain.access$getAggregateChildKindSet(nodeChain0) & 0x8000) != 0) {
            Node modifier$Node0 = nodeChain0.getHead$ui_release();
            while(modifier$Node0 != null) {
                if((modifier$Node0.getKindSet$ui_release() & 0x8000) != 0) {
                    Node modifier$Node1 = modifier$Node0;
                    MutableVector mutableVector0 = null;
                    while(modifier$Node1 != null) {
                        if(modifier$Node1 instanceof CompositionLocalConsumerModifierNode) {
                            Node modifier$Node2 = ((CompositionLocalConsumerModifierNode)modifier$Node1).getNode();
                            if(modifier$Node2.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(modifier$Node2);
                            }
                            else {
                                modifier$Node2.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        }
                        else if((modifier$Node1.getKindSet$ui_release() & 0x8000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                            Node modifier$Node3 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                            int v = 0;
                            while(modifier$Node3 != null) {
                                if((modifier$Node3.getKindSet$ui_release() & 0x8000) != 0) {
                                    ++v;
                                    if(v == 1) {
                                        modifier$Node1 = modifier$Node3;
                                    }
                                    else {
                                        if(mutableVector0 == null) {
                                            mutableVector0 = new MutableVector(new Node[16], 0);
                                        }
                                        if(modifier$Node1 != null) {
                                            mutableVector0.add(modifier$Node1);
                                            modifier$Node1 = null;
                                        }
                                        mutableVector0.add(modifier$Node3);
                                    }
                                }
                                modifier$Node3 = modifier$Node3.getChild$ui_release();
                            }
                            if(v != 1) {
                                goto label_37;
                            }
                            continue;
                        }
                    label_37:
                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                    }
                }
                if((modifier$Node0.getAggregateChildKindSet$ui_release() & 0x8000) == 0) {
                    break;
                }
                modifier$Node0 = modifier$Node0.getChild$ui_release();
            }
        }
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@NotNull Density density0) {
        if(!Intrinsics.areEqual(this.t, density0)) {
            this.t = density0;
            this.invalidateMeasurements$ui_release();
            LayoutNode layoutNode0 = this.getParent$ui_release();
            if(layoutNode0 != null) {
                layoutNode0.invalidateLayer$ui_release();
            }
            this.invalidateLayers$ui_release();
            for(Node modifier$Node0 = this.A.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
                if((16 & modifier$Node0.getKindSet$ui_release()) != 0) {
                    ((PointerInputModifierNode)modifier$Node0).onDensityChange();
                }
                else if(modifier$Node0 instanceof CacheDrawModifierNode) {
                    ((CacheDrawModifierNode)modifier$Node0).invalidateDrawCache();
                }
            }
        }
    }

    public final void setDepth$ui_release(int v) {
        this.m = v;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z) {
        this.E = z;
    }

    public final void setInteropViewFactoryHolder$ui_release(@Nullable AndroidViewHolder androidViewHolder0) {
        this.l = androidViewHolder0;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@NotNull UsageByParent layoutNode$UsageByParent0) {
        this.x = layoutNode$UsageByParent0;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection layoutDirection0) {
        if(this.u != layoutDirection0) {
            this.u = layoutDirection0;
            this.invalidateMeasurements$ui_release();
            LayoutNode layoutNode0 = this.getParent$ui_release();
            if(layoutNode0 != null) {
                layoutNode0.invalidateLayer$ui_release();
            }
            this.invalidateLayers$ui_release();
            NodeChain nodeChain0 = this.A;
            if((NodeChain.access$getAggregateChildKindSet(nodeChain0) & 4) != 0) {
                Node modifier$Node0 = nodeChain0.getHead$ui_release();
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 4) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node1 != null) {
                            if(!(modifier$Node1 instanceof DrawModifierNode)) {
                                if((modifier$Node1.getKindSet$ui_release() & 4) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                    Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                    int v = 0;
                                    while(modifier$Node2 != null) {
                                        if((modifier$Node2.getKindSet$ui_release() & 4) != 0) {
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
                                        goto label_37;
                                    }
                                    continue;
                                }
                            }
                            else if(((DrawModifierNode)modifier$Node1) instanceof CacheDrawModifierNode) {
                                ((CacheDrawModifierNode)(((DrawModifierNode)modifier$Node1))).invalidateDrawCache();
                            }
                        label_37:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                        }
                    }
                    if((modifier$Node0.getAggregateChildKindSet$ui_release() & 4) == 0) {
                        break;
                    }
                    modifier$Node0 = modifier$Node0.getChild$ui_release();
                }
            }
        }
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy measurePolicy0) {
        if(!Intrinsics.areEqual(this.r, measurePolicy0)) {
            this.r = measurePolicy0;
            IntrinsicsPolicy intrinsicsPolicy0 = this.s;
            if(intrinsicsPolicy0 != null) {
                intrinsicsPolicy0.updateFrom(this.getMeasurePolicy());
            }
            this.invalidateMeasurements$ui_release();
        }
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(@NotNull Modifier modifier0) {
        if(this.a && this.getModifier() != Modifier.Companion) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if(this.isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if(this.isAttached()) {
            this.a(modifier0);
            return;
        }
        this.G = modifier0;
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.J = z;
    }

    public final void setOnAttach$ui_release(@Nullable Function1 function10) {
        this.H = function10;
    }

    public final void setOnDetach$ui_release(@Nullable Function1 function10) {
        this.I = function10;
    }

    public void setSemanticsId(int v) {
        this.b = v;
    }

    public final void setSubcompositionsState$ui_release(@Nullable LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0) {
        this.C = layoutNodeSubcompositionsState0;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(@NotNull ViewConfiguration viewConfiguration0) {
        if(!Intrinsics.areEqual(this.v, viewConfiguration0)) {
            this.v = viewConfiguration0;
            NodeChain nodeChain0 = this.A;
            if((NodeChain.access$getAggregateChildKindSet(nodeChain0) & 16) != 0) {
                Node modifier$Node0 = nodeChain0.getHead$ui_release();
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 16) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode)modifier$Node1).onViewConfigurationChange();
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 16) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 16) != 0) {
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
                                    goto label_31;
                                }
                                continue;
                            }
                        label_31:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                        }
                    }
                    if((modifier$Node0.getAggregateChildKindSet$ui_release() & 16) == 0) {
                        break;
                    }
                    modifier$Node0 = modifier$Node0.getChild$ui_release();
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z) {
        this.d = z;
    }

    @Override
    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + this.getChildren$ui_release().size() + " measurePolicy: " + this.getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if(this.f > 0 && this.i) {
            int v = 0;
            this.i = false;
            MutableVector mutableVector0 = this.h;
            if(mutableVector0 == null) {
                mutableVector0 = new MutableVector(new LayoutNode[16], 0);
                this.h = mutableVector0;
            }
            mutableVector0.clear();
            MutableVector mutableVector1 = this.g.getVector();
            int v1 = mutableVector1.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.getContent();
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v];
                    if(layoutNode0.a) {
                        mutableVector0.addAll(mutableVector0.getSize(), layoutNode0.get_children$ui_release());
                    }
                    else {
                        mutableVector0.add(layoutNode0);
                    }
                    ++v;
                    if(v >= v1) {
                        break;
                    }
                }
            }
            this.B.markChildrenDirty();
        }
    }
}

