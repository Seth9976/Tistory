package androidx.compose.runtime;

import androidx.activity.g0;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.n;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import p9.a;
import va.v;
import y0.a0;
import y0.e;
import y0.f;
import y0.l;
import y0.p;
import y0.x;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008C\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001:\u0004\u00FD\u0001\u00FE\u0001BI\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0017\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0017\u00A2\u0006\u0004\b\u0019\u0010\u0016J\u000F\u0010\u001A\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b\u001A\u0010\u0018J\u000F\u0010\u001B\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b\u001B\u0010\u0018J\u000F\u0010\u001C\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b\u001C\u0010\u0018J!\u0010\u001F\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00122\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0017\u00A2\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b!\u0010\u0018J\u000F\u0010#\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\b\"\u0010\u0018J\u000F\u0010$\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b$\u0010\u0018J\u000F\u0010&\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\b%\u0010\u0018J\u000F\u0010(\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\b\'\u0010\u0018J\u000F\u0010,\u001A\u00020)H\u0000\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010-\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b-\u0010\u0018J\u000F\u0010.\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b.\u0010\u0018J#\u00102\u001A\u00020\u0014\"\u0004\b\u0000\u0010/2\f\u00101\u001A\b\u0012\u0004\u0012\u00028\u000000H\u0016\u00A2\u0006\u0004\b2\u00103J\u000F\u00104\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b4\u0010\u0018J\u000F\u00105\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b5\u0010\u0018J!\u00106\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00122\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0016\u00A2\u0006\u0004\b6\u0010 J\u000F\u00107\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b7\u0010\u0018J\u000F\u00108\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b8\u0010\u0018J\u000F\u00109\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b9\u0010\u0018J\r\u0010:\u001A\u00020\u0014\u00A2\u0006\u0004\b:\u0010\u0018J\r\u0010;\u001A\u00020\u0014\u00A2\u0006\u0004\b;\u0010\u0018J\u0017\u0010=\u001A\u00020\u00142\u0006\u0010<\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b=\u0010\u0016JB\u0010C\u001A\u00020\u0014\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010/2\u0006\u0010?\u001A\u00028\u00002\u001D\u0010B\u001A\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140@\u00A2\u0006\u0002\bAH\u0016\u00A2\u0006\u0004\bC\u0010DJ#\u0010G\u001A\u00020\u001D2\b\u0010E\u001A\u0004\u0018\u00010\u001D2\b\u0010F\u001A\u0004\u0018\u00010\u001DH\u0017\u00A2\u0006\u0004\bG\u0010HJ\u0011\u0010I\u001A\u0004\u0018\u00010\u001DH\u0001\u00A2\u0006\u0004\bI\u0010JJ\u0011\u0010K\u001A\u0004\u0018\u00010\u001DH\u0001\u00A2\u0006\u0004\bK\u0010JJ\u0019\u0010L\u001A\u00020)2\b\u0010?\u001A\u0004\u0018\u00010\u001DH\u0017\u00A2\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001A\u00020)2\b\u0010?\u001A\u0004\u0018\u00010\u001DH\u0017\u00A2\u0006\u0004\bN\u0010MJ\u0017\u0010L\u001A\u00020)2\u0006\u0010?\u001A\u00020OH\u0017\u00A2\u0006\u0004\bL\u0010PJ\u0017\u0010L\u001A\u00020)2\u0006\u0010?\u001A\u00020QH\u0017\u00A2\u0006\u0004\bL\u0010RJ\u0017\u0010L\u001A\u00020)2\u0006\u0010?\u001A\u00020SH\u0017\u00A2\u0006\u0004\bL\u0010TJ\u0017\u0010L\u001A\u00020)2\u0006\u0010?\u001A\u00020)H\u0017\u00A2\u0006\u0004\bL\u0010UJ\u0017\u0010L\u001A\u00020)2\u0006\u0010?\u001A\u00020VH\u0017\u00A2\u0006\u0004\bL\u0010WJ\u0017\u0010L\u001A\u00020)2\u0006\u0010?\u001A\u00020XH\u0017\u00A2\u0006\u0004\bL\u0010YJ\u0017\u0010L\u001A\u00020)2\u0006\u0010?\u001A\u00020ZH\u0017\u00A2\u0006\u0004\bL\u0010[J\u0017\u0010L\u001A\u00020)2\u0006\u0010?\u001A\u00020\u0012H\u0017\u00A2\u0006\u0004\bL\u0010\\J,\u0010^\u001A\u00028\u0000\"\u0004\b\u0000\u0010/2\u0006\u0010]\u001A\u00020)2\f\u0010B\u001A\b\u0012\u0004\u0012\u00028\u000000H\u0087\b\u00A2\u0006\u0004\b^\u0010_J\u0019\u0010`\u001A\u00020\u00142\b\u0010?\u001A\u0004\u0018\u00010\u001DH\u0001\u00A2\u0006\u0004\b`\u0010aJ\u0019\u0010b\u001A\u00020\u00142\b\u0010?\u001A\u0004\u0018\u00010\u001DH\u0001\u00A2\u0006\u0004\bb\u0010aJ\u001D\u0010d\u001A\u00020\u00142\f\u0010c\u001A\b\u0012\u0004\u0012\u00020\u001400H\u0016\u00A2\u0006\u0004\bd\u00103J\u001B\u0010f\u001A\u00020\u00142\n\u0010?\u001A\u0006\u0012\u0002\b\u00030eH\u0017\u00A2\u0006\u0004\bf\u0010gJ\u000F\u0010h\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\bh\u0010\u0018J#\u0010k\u001A\u00020\u00142\u0012\u0010j\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030e0iH\u0017\u00A2\u0006\u0004\bk\u0010lJ\u000F\u0010m\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\bm\u0010\u0018J#\u0010o\u001A\u00028\u0000\"\u0004\b\u0000\u0010/2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000nH\u0017\u00A2\u0006\u0004\bo\u0010pJ\u000F\u0010q\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bq\u0010rJ!\u0010x\u001A\u00020)2\u0006\u0010t\u001A\u00020s2\b\u0010u\u001A\u0004\u0018\u00010\u001DH\u0000\u00A2\u0006\u0004\bv\u0010wJ\u000F\u0010{\u001A\u00020\u0012H\u0001\u00A2\u0006\u0004\by\u0010zJ\u000F\u0010|\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b|\u0010\u0018J\u000F\u0010}\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b}\u0010\u0018J\u0017\u0010~\u001A\u00020\u00142\u0006\u0010L\u001A\u00020)H\u0017\u00A2\u0006\u0004\b~\u0010\u007FJ\u001A\u0010\u0080\u0001\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0012H\u0017\u00A2\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0015\u0010\u0083\u0001\u001A\u0005\u0018\u00010\u0082\u0001H\u0017\u00A2\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J*\u0010\u0087\u0001\u001A\u00020\u00142\u000B\u0010?\u001A\u0007\u0012\u0002\b\u00030\u0085\u00012\t\u0010\u0086\u0001\u001A\u0004\u0018\u00010\u001DH\u0017\u00A2\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J3\u0010\u008D\u0001\u001A\u00020\u00142\u001F\u0010\u008C\u0001\u001A\u001A\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u008B\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008B\u00010\u008A\u00010\u0089\u0001H\u0017\u00A2\u0006\u0006\b\u008D\u0001\u0010\u008E\u0001J\u001C\u0010\u0090\u0001\u001A\u00020\u00142\b\u0010\u0090\u0001\u001A\u00030\u008F\u0001H\u0017\u00A2\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J$\u0010\u0092\u0001\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00122\b\u0010\u0090\u0001\u001A\u00030\u008F\u0001H\u0017\u00A2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001A\u00020\u0014H\u0017\u00A2\u0006\u0005\b\u0094\u0001\u0010\u0018J\u0011\u0010\u0095\u0001\u001A\u00020\u0014H\u0016\u00A2\u0006\u0005\b\u0095\u0001\u0010\u0018J=\u0010\u009C\u0001\u001A\u00020\u00142\u0014\u0010\u0097\u0001\u001A\u000F\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u001D0\u0096\u00012\u0013\u0010\u0099\u0001\u001A\u000E\u0012\u0004\u0012\u00020\u001400\u00A2\u0006\u0003\b\u0098\u0001H\u0000\u00A2\u0006\u0006\b\u009A\u0001\u0010\u009B\u0001J\u001F\u0010\u009E\u0001\u001A\u00020\u00142\f\u0010B\u001A\b\u0012\u0004\u0012\u00020\u001400H\u0000\u00A2\u0006\u0005\b\u009D\u0001\u00103J(\u0010\u00A1\u0001\u001A\u00020)2\u0014\u0010\u0097\u0001\u001A\u000F\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u001D0\u0096\u0001H\u0000\u00A2\u0006\u0006\b\u009F\u0001\u0010\u00A0\u0001J\u0011\u0010\u00A3\u0001\u001A\u00020\u0014H\u0000\u00A2\u0006\u0005\b\u00A2\u0001\u0010\u0018J\u0011\u0010\u00A5\u0001\u001A\u00020\u0012H\u0000\u00A2\u0006\u0005\b\u00A4\u0001\u0010zJ\u0013\u0010\u00A6\u0001\u001A\u0004\u0018\u00010\u001DH\u0016\u00A2\u0006\u0005\b\u00A6\u0001\u0010JJ\u001B\u0010\u00A7\u0001\u001A\u00020\u00142\b\u0010?\u001A\u0004\u0018\u00010\u001DH\u0016\u00A2\u0006\u0005\b\u00A7\u0001\u0010aJ\u001B\u0010\u00A9\u0001\u001A\u00020\u00142\u0007\u0010t\u001A\u00030\u00A8\u0001H\u0016\u00A2\u0006\u0006\b\u00A9\u0001\u0010\u00AA\u0001R\"\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00AB\u0001\u0010\u00AC\u0001\u001A\u0006\b\u00AD\u0001\u0010\u00AE\u0001R\u001E\u0010\u000F\u001A\u00020\u000E8\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00AF\u0001\u0010\u00B0\u0001\u001A\u0006\b\u00B1\u0001\u0010\u00B2\u0001R)\u0010\u00B7\u0001\u001A\u00020)2\u0007\u0010\u00B3\u0001\u001A\u00020)8\u0000@BX\u0080\u000E\u00A2\u0006\u000F\n\u0006\b\u00B4\u0001\u0010\u00B5\u0001\u001A\u0005\b\u00B6\u0001\u0010+R)\u0010\u00BA\u0001\u001A\u00020)2\u0007\u0010\u00B3\u0001\u001A\u00020)8\u0000@BX\u0080\u000E\u00A2\u0006\u000F\n\u0006\b\u00B8\u0001\u0010\u00B5\u0001\u001A\u0005\b\u00B9\u0001\u0010+R*\u0010\u00C2\u0001\u001A\u00030\u00BB\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00BC\u0001\u0010\u00BD\u0001\u001A\u0006\b\u00BE\u0001\u0010\u00BF\u0001\"\u0006\b\u00C0\u0001\u0010\u00C1\u0001R)\u0010\u00C9\u0001\u001A\u00020\u00068\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00C3\u0001\u0010\u00C4\u0001\u001A\u0006\b\u00C5\u0001\u0010\u00C6\u0001\"\u0006\b\u00C7\u0001\u0010\u00C8\u0001R+\u0010\u00D0\u0001\u001A\u0004\u0018\u00010\u000B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00CA\u0001\u0010\u00CB\u0001\u001A\u0006\b\u00CC\u0001\u0010\u00CD\u0001\"\u0006\b\u00CE\u0001\u0010\u00CF\u0001R0\u0010\u00D4\u0001\u001A\u00020)2\u0007\u0010\u00B3\u0001\u001A\u00020)8\u0016@RX\u0097\u000E\u00A2\u0006\u0016\n\u0006\b\u00D1\u0001\u0010\u00B5\u0001\u0012\u0005\b\u00D3\u0001\u0010\u0018\u001A\u0005\b\u00D2\u0001\u0010+R0\u0010\u00D8\u0001\u001A\u00020\u00122\u0007\u0010\u00B3\u0001\u001A\u00020\u00128\u0016@RX\u0097\u000E\u00A2\u0006\u0016\n\u0006\b\u00D5\u0001\u0010\u00C3\u0001\u0012\u0005\b\u00D7\u0001\u0010\u0018\u001A\u0005\b\u00D6\u0001\u0010zR\u0016\u0010\u00DA\u0001\u001A\u00020)8@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00D9\u0001\u0010+R\u0016\u0010\u00DC\u0001\u001A\u00020)8@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00DB\u0001\u0010+R\u0018\u0010\u00E0\u0001\u001A\u00030\u00DD\u00018WX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00DE\u0001\u0010\u00DF\u0001R\u001D\u0010\u00E3\u0001\u001A\u00020)8VX\u0097\u0004\u00A2\u0006\u000E\u0012\u0005\b\u00E2\u0001\u0010\u0018\u001A\u0005\b\u00E1\u0001\u0010+R\u001D\u0010\u00E6\u0001\u001A\u00020)8VX\u0097\u0004\u00A2\u0006\u000E\u0012\u0005\b\u00E5\u0001\u0010\u0018\u001A\u0005\b\u00E4\u0001\u0010+R\u0016\u0010\u00E8\u0001\u001A\u00020\u00128VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00E7\u0001\u0010zR\u0018\u0010\u00EC\u0001\u001A\u00030\u00E9\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00EA\u0001\u0010\u00EB\u0001R\u0018\u0010\u00F0\u0001\u001A\u00030\u00ED\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00EE\u0001\u0010\u00EF\u0001R\u0016\u0010\u00F2\u0001\u001A\u00020\u00128@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00F1\u0001\u0010zR\u0019\u0010\u00F5\u0001\u001A\u0004\u0018\u00010s8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00F3\u0001\u0010\u00F4\u0001R\u0013\u0010\u00F7\u0001\u001A\u00020)8F\u00A2\u0006\u0007\u001A\u0005\b\u00F6\u0001\u0010+R\u001A\u0010\u00FA\u0001\u001A\u0005\u0018\u00010\u00A8\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00F8\u0001\u0010\u00F9\u0001R\u0018\u0010\u00FC\u0001\u001A\u0004\u0018\u00010\u001D8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00FB\u0001\u0010J\u00A8\u0006\u00FF\u0001"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/SlotTable;", "slotTable", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "lateChanges", "Landroidx/compose/runtime/ControlledComposition;", "composition", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V", "", "key", "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "startDefaults", "endDefaults", "", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "changesApplied$runtime_release", "changesApplied", "collectParameterInformation", "dispose$runtime_release", "dispose", "deactivate$runtime_release", "deactivate", "", "forceRecomposeScopes$runtime_release", "()Z", "forceRecomposeScopes", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "startReuseFromRoot", "endReuseFromRoot", "marker", "endToMarker", "V", "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "nextSlot", "()Ljava/lang/Object;", "nextSlotForCache", "changed", "(Ljava/lang/Object;)Z", "changedInstance", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(Z)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "(I)Z", "invalid", "cache", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateValue", "(Ljava/lang/Object;)V", "updateCachedValue", "effect", "recordSideEffect", "Landroidx/compose/runtime/ProvidedValue;", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "endProvider", "", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "parentKey$runtime_release", "()I", "parentKey", "skipCurrentGroup", "skipToGroupEnd", "deactivateToEndGroup", "(Z)V", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "(Ljava/util/List;)V", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "disableSourceInformation", "Landroidx/compose/runtime/collection/ScopeMap;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "content", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/ScopeMap;Lkotlin/jvm/functions/Function2;)V", "composeContent", "prepareCompose$runtime_release", "prepareCompose", "recompose$runtime_release", "(Landroidx/compose/runtime/collection/ScopeMap;)Z", "recompose", "verifyConsistent$runtime_release", "verifyConsistent", "stacksSize$runtime_release", "stacksSize", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "a", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "g", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "<set-?>", "F", "Z", "isComposing$runtime_release", "isComposing", "G", "isDisposed$runtime_release", "isDisposed", "Landroidx/compose/runtime/SlotReader;", "H", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime_release", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "reader", "I", "Landroidx/compose/runtime/SlotTable;", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "insertTable", "M", "Landroidx/compose/runtime/changelist/ChangeList;", "getDeferredChanges$runtime_release", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime_release", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "deferredChanges", "Q", "getInserting", "getInserting$annotations", "inserting", "R", "getCompoundKeyHash", "getCompoundKeyHash$annotations", "compoundKeyHash", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getCurrentMarker", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "recomposeScopeIdentity", "y0/e", "y0/f", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 5 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 9 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 10 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 11 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 12 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 14 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 15 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 16 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4582:1\n3958#1,3:4592\n3971#1:4595\n3972#1:4597\n3962#1,11:4598\n3958#1,3:4636\n3971#1:4639\n3972#1:4641\n3962#1,11:4642\n3981#1,3:4655\n3994#1:4658\n3995#1:4660\n3985#1,11:4661\n3981#1,3:4672\n3994#1:4675\n3995#1:4677\n3985#1,11:4678\n3958#1,3:4690\n3971#1:4693\n3972#1:4695\n3962#1,11:4696\n3981#1,3:4707\n3994#1:4710\n3995#1:4712\n3985#1,11:4713\n3444#1,8:4758\n3453#1,3:4781\n3971#1:4900\n3972#1:4902\n3971#1:4903\n3972#1:4905\n3971#1:4906\n3972#1:4908\n3971#1:4909\n3972#1:4911\n3994#1:4913\n3995#1:4915\n3994#1:4916\n3995#1:4918\n3994#1:4919\n3995#1:4921\n3994#1:4922\n3995#1:4924\n1#2:4583\n158#3,8:4584\n158#3,8:4746\n158#3,4:4754\n163#3,3:4784\n158#3,4:4878\n163#3,3:4890\n26#4:4596\n26#4:4640\n22#4:4659\n22#4:4676\n26#4:4689\n26#4:4694\n22#4:4711\n26#4:4901\n26#4:4904\n26#4:4907\n26#4:4910\n26#4:4912\n22#4:4914\n22#4:4917\n22#4:4920\n22#4:4923\n22#4:4925\n46#5,5:4609\n46#5,3:4825\n50#5:4863\n4551#6,7:4614\n4551#6,7:4621\n4551#6,7:4724\n4551#6,7:4731\n4551#6,7:4797\n4551#6,7:4804\n4551#6,7:4811\n4551#6,7:4818\n4551#6,7:4864\n4551#6,7:4871\n4551#6,7:4893\n33#7,7:4628\n82#8:4635\n4468#9:4653\n4469#9:4654\n182#10,4:4738\n182#10,4:4766\n192#10,8:4770\n187#10,3:4778\n187#10,3:4788\n182#10,8:4882\n33#11,4:4742\n38#11:4787\n33#11,6:4791\n82#11,3:4926\n33#11,4:4929\n85#11,2:4933\n38#11:4935\n87#11:4936\n391#12,4:4828\n363#12,6:4832\n373#12,3:4839\n376#12,2:4843\n396#12,2:4845\n379#12,6:4847\n398#12:4853\n1810#13:4838\n1672#13:4842\n392#14,6:4854\n398#14,2:4861\n48#15:4860\n1855#16,2:4937\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1493#1:4592,3\n1493#1:4595\n1493#1:4597\n1493#1:4598,11\n2455#1:4636,3\n2455#1:4639\n2455#1:4641\n2455#1:4642,11\n2602#1:4655,3\n2602#1:4658\n2602#1:4660\n2602#1:4661,11\n2610#1:4672,3\n2610#1:4675\n2610#1:4677\n2610#1:4678,11\n3112#1:4690,3\n3112#1:4693\n3112#1:4695\n3112#1:4696,11\n3116#1:4707,3\n3116#1:4710\n3116#1:4712\n3116#1:4713,11\n3407#1:4758,8\n3407#1:4781,3\n3960#1:4900\n3960#1:4902\n3962#1:4903\n3962#1:4905\n3964#1:4906\n3964#1:4908\n3966#1:4909\n3966#1:4911\n3983#1:4913\n3983#1:4915\n3985#1:4916\n3985#1:4918\n3987#1:4919\n3987#1:4921\n3989#1:4922\n3989#1:4924\n1428#1:4584,8\n3348#1:4746,8\n3406#1:4754,4\n3406#1:4784,3\n3771#1:4878,4\n3771#1:4890,3\n1493#1:4596\n2455#1:4640\n2602#1:4659\n2610#1:4676\n3056#1:4689\n3112#1:4694\n3116#1:4711\n3960#1:4901\n3962#1:4904\n3964#1:4907\n3966#1:4910\n3971#1:4912\n3983#1:4914\n3985#1:4917\n3987#1:4920\n3989#1:4923\n3994#1:4925\n1753#1:4609,5\n3561#1:4825,3\n3561#1:4863\n1826#1:4614,7\n1839#1:4621,7\n3130#1:4724,7\n3143#1:4731,7\n3519#1:4797,7\n3524#1:4804,7\n3540#1:4811,7\n3560#1:4818,7\n3626#1:4864,7\n3633#1:4871,7\n3783#1:4893,7\n1886#1:4628,7\n2256#1:4635\n2461#1:4653\n2485#1:4654\n3325#1:4738,4\n3412#1:4766,4\n3413#1:4770,8\n3412#1:4778,3\n3325#1:4788,3\n3773#1:4882,8\n3327#1:4742,4\n3327#1:4787\n3471#1:4791,6\n3682#1:4926,3\n3682#1:4929,4\n3682#1:4933,2\n3682#1:4935\n3682#1:4936\n3564#1:4828,4\n3564#1:4832,6\n3564#1:4839,3\n3564#1:4843,2\n3564#1:4845,2\n3564#1:4847,6\n3564#1:4853\n3564#1:4838\n3564#1:4842\n3590#1:4854,6\n3590#1:4861,2\n3590#1:4860\n3714#1:4937,2\n*E\n"})
public final class ComposerImpl implements Composer {
    public static final int $stable = 8;
    public int A;
    public int B;
    public boolean C;
    public final androidx.compose.runtime.ComposerImpl.derivedStateObserver.1 D;
    public final Stack E;
    public boolean F;
    public boolean G;
    public SlotReader H;
    public SlotTable I;
    public SlotWriter J;
    public boolean K;
    public PersistentCompositionLocalMap L;
    public ChangeList M;
    public final ComposerChangeListWriter N;
    public Anchor O;
    public FixupList P;
    public boolean Q;
    public int R;
    public final Applier a;
    public final CompositionContext b;
    public final SlotTable c;
    public final Set d;
    public final ChangeList e;
    public final ChangeList f;
    public final ControlledComposition g;
    public final Stack h;
    public a0 i;
    public int j;
    public int k;
    public int l;
    public final IntStack m;
    public int[] n;
    public MutableIntIntMap o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final ArrayList s;
    public final IntStack t;
    public PersistentCompositionLocalMap u;
    public IntMap v;
    public boolean w;
    public final IntStack x;
    public boolean y;
    public int z;

    public ComposerImpl(@NotNull Applier applier0, @NotNull CompositionContext compositionContext0, @NotNull SlotTable slotTable0, @NotNull Set set0, @NotNull ChangeList changeList0, @NotNull ChangeList changeList1, @NotNull ControlledComposition controlledComposition0) {
        Anchor anchor0;
        this.a = applier0;
        this.b = compositionContext0;
        this.c = slotTable0;
        this.d = set0;
        this.e = changeList0;
        this.f = changeList1;
        this.g = controlledComposition0;
        this.h = new Stack();
        this.m = new IntStack();
        this.s = new ArrayList();
        this.t = new IntStack();
        this.u = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        this.x = new IntStack();
        this.z = -1;
        this.C = compositionContext0.getCollectingSourceInformation$runtime_release() || compositionContext0.getCollectingCallByInformation$runtime_release();
        this.D = new DerivedStateObserver() {
            public final ComposerImpl a;

            {
                this.a = composerImpl0;
            }

            @Override  // androidx.compose.runtime.DerivedStateObserver
            public void done(@NotNull DerivedState derivedState0) {
                ComposerImpl.access$setChildrenComposing$p(this.a, this.a.A - 1);
            }

            @Override  // androidx.compose.runtime.DerivedStateObserver
            public void start(@NotNull DerivedState derivedState0) {
                int v = this.a.A;
                ComposerImpl.access$setChildrenComposing$p(this.a, v + 1);
            }
        };
        this.E = new Stack();
        SlotReader slotReader0 = slotTable0.openReader();
        slotReader0.close();
        this.H = slotReader0;
        SlotTable slotTable1 = new SlotTable();
        if(compositionContext0.getCollectingSourceInformation$runtime_release()) {
            slotTable1.collectSourceInformation();
        }
        if(compositionContext0.getCollectingCallByInformation$runtime_release()) {
            slotTable1.collectCalledByInformation();
        }
        this.I = slotTable1;
        SlotWriter slotWriter0 = slotTable1.openWriter();
        slotWriter0.close(true);
        this.J = slotWriter0;
        this.N = new ComposerChangeListWriter(this, changeList0);
        try(SlotReader slotReader1 = this.I.openReader()) {
            anchor0 = slotReader1.anchor(0);
        }
        this.O = anchor0;
        this.P = new FixupList();
    }

    public final int A(int v) {
        if(v < 0) {
            return this.o == null || !this.o.contains(v) ? 0 : this.o.get(v);
        }
        int[] arr_v = this.n;
        if(arr_v != null) {
            int v1 = arr_v[v];
            return v1 < 0 ? this.H.nodeCount(v) : v1;
        }
        return this.H.nodeCount(v);
    }

    public final void a() {
        this.b();
        this.h.clear();
        this.m.clear();
        this.t.clear();
        this.x.clear();
        this.v = null;
        this.P.clear();
        this.R = 0;
        this.A = 0;
        this.r = false;
        this.Q = false;
        this.y = false;
        this.F = false;
        this.q = false;
        this.z = -1;
        if(!this.H.getClosed()) {
            this.H.close();
        }
        if(!this.J.getClosed()) {
            this.k();
        }
    }

    @Override  // androidx.compose.runtime.Composer
    public void apply(Object object0, @NotNull Function2 function20) {
        if(this.getInserting()) {
            this.P.updateNode(object0, function20);
            return;
        }
        this.N.updateNode(object0, function20);
    }

    public final void b() {
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.R = 0;
        this.r = false;
        this.N.resetTransientState();
        this.E.clear();
        this.n = null;
        this.o = null;
    }

    @Override  // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        this.v(206, ComposerKt.getReference());
        CompositionObserverHolder compositionObserverHolder0 = null;
        if(this.getInserting()) {
            SlotWriter.markGroup$default(this.J, 0, 1, null);
        }
        Object object0 = this.nextSlot();
        e e0 = object0 instanceof e ? ((e)object0) : null;
        if(e0 == null) {
            int v = this.getCompoundKeyHash();
            boolean z = this.p;
            boolean z1 = this.C;
            ControlledComposition controlledComposition0 = this.getComposition();
            CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
            if(compositionImpl0 != null) {
                compositionObserverHolder0 = compositionImpl0.getObserverHolder$runtime_release();
            }
            e0 = new e(new f(this, v, z, z1, compositionObserverHolder0));
            this.updateValue(e0);
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap0 = this.d();
        e0.a.g.setValue(persistentCompositionLocalMap0);
        this.h(false);
        return e0.a;
    }

    public final int c(int v, int v1, int v2, int v3) {
        int v4;
        if(v != v2) {
            SlotReader slotReader0 = this.H;
            if(slotReader0.hasObjectKey(v)) {
                Object object0 = slotReader0.groupObjectKey(v);
                if(object0 == null) {
                    v4 = 0;
                }
                else if(object0 instanceof Enum) {
                    v4 = ((Enum)object0).ordinal();
                }
                else if(object0 instanceof MovableContent) {
                    v4 = 0x78CC281;
                }
                else {
                    v4 = object0.hashCode();
                }
            }
            else {
                int v5 = slotReader0.groupKey(v);
                if(v5 == 0xCF) {
                    Object object1 = slotReader0.groupAux(v);
                    if(object1 != null && !Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
                        v5 = object1.hashCode();
                    }
                }
                v4 = v5;
            }
            if(v4 == 0x78CC281) {
                return 0x78CC281;
            }
            int v6 = this.H.parent(v);
            if(v6 != v2) {
                v3 = this.c(v6, this.n(v6), v2, v3);
            }
            if(this.H.hasObjectKey(v)) {
                v1 = 0;
            }
            return Integer.rotateLeft(Integer.rotateLeft(v3, 3) ^ v4, 3) ^ v1;
        }
        return v3;
    }

    @ComposeCompilerApi
    public final Object cache(boolean z, @NotNull Function0 function00) {
        Object object0 = this.nextSlotForCache();
        if(object0 == Composer.Companion.getEmpty() || z) {
            object0 = function00.invoke();
            this.updateCachedValue(object0);
        }
        return object0;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Byte && b == ((Number)object0).byteValue()) {
            return false;
        }
        this.updateValue(b);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Character && c == ((Character)object0).charValue()) {
            return false;
        }
        this.updateValue(Character.valueOf(c));
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double f) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Double && f == ((Number)object0).doubleValue()) {
            return false;
        }
        this.updateValue(f);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Float && f == ((Number)object0).floatValue()) {
            return false;
        }
        this.updateValue(f);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int v) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Integer && v == ((Number)object0).intValue()) {
            return false;
        }
        this.updateValue(v);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long v) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Long && v == ((Number)object0).longValue()) {
            return false;
        }
        this.updateValue(v);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@Nullable Object object0) {
        if(!Intrinsics.areEqual(this.nextSlot(), object0)) {
            this.updateValue(object0);
            return true;
        }
        return false;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short v) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Short && v == ((Number)object0).shortValue()) {
            return false;
        }
        this.updateValue(v);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Boolean && z == ((Boolean)object0).booleanValue()) {
            return false;
        }
        this.updateValue(Boolean.valueOf(z));
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(@Nullable Object object0) {
        if(this.nextSlot() != object0) {
            this.updateValue(object0);
            return true;
        }
        return false;
    }

    public final void changesApplied$runtime_release() {
        this.v = null;
    }

    @Override  // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.p = true;
        this.C = true;
        this.c.collectSourceInformation();
        this.I.collectSourceInformation();
        this.J.updateToTableMaps();
    }

    public final void composeContent$runtime_release(@NotNull ScopeMap scopeMap0, @NotNull Function2 function20) {
        if(!this.e.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.f(scopeMap0, function20);
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public Object consume(@NotNull CompositionLocal compositionLocal0) {
        return CompositionLocalMapKt.read(this.d(), compositionLocal0);
    }

    @Override  // androidx.compose.runtime.Composer
    public void createNode(@NotNull Function0 function00) {
        if(!this.r) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if(!this.getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int v = this.m.peek();
        Anchor anchor0 = this.J.anchor(this.J.getParent());
        ++this.k;
        this.P.createAndInsertNode(function00, v, anchor0);
    }

    public final PersistentCompositionLocalMap d() {
        PersistentCompositionLocalMap persistentCompositionLocalMap0 = this.L;
        return persistentCompositionLocalMap0 == null ? this.e(this.H.getParent()) : persistentCompositionLocalMap0;
    }

    public final void deactivate$runtime_release() {
        this.E.clear();
        this.s.clear();
        this.e.clear();
        this.v = null;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z) {
        if(this.k != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if(!this.getInserting()) {
            if(!z) {
                this.k = this.H.getParentNodes();
                this.H.skipToGroupEnd();
                return;
            }
            int v = this.H.getCurrentGroup();
            int v1 = this.H.getCurrentEnd();
            this.N.deactivateCurrentGroup();
            ComposerKt.access$removeRange(this.s, v, v1);
            this.H.skipToGroupEnd();
        }
    }

    @Override  // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.y = false;
    }

    @Override  // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.C = false;
    }

    public final void dispose$runtime_release() {
        Trace trace0 = Trace.INSTANCE;
        Object object0 = trace0.beginSection("Compose:Composer.dispose");
        try {
            this.b.unregisterComposer$runtime_release(this);
            this.deactivate$runtime_release();
            this.getApplier().clear();
            this.G = true;
        }
        catch(Throwable throwable0) {
            Trace.INSTANCE.endSection(object0);
            throw throwable0;
        }
        trace0.endSection(object0);
    }

    public final PersistentCompositionLocalMap e(int v) {
        PersistentCompositionLocalMap persistentCompositionLocalMap0;
        if(this.getInserting() && this.K) {
            for(int v1 = this.J.getParent(); v1 > 0; v1 = this.J.parent(v1)) {
                if(this.J.groupKey(v1) == 202 && Intrinsics.areEqual(this.J.groupObjectKey(v1), ComposerKt.getCompositionLocalMap())) {
                    Object object0 = this.J.groupAux(v1);
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    this.L = (PersistentCompositionLocalMap)object0;
                    return (PersistentCompositionLocalMap)object0;
                }
            }
        }
        if(this.H.getSize() > 0) {
            while(v > 0) {
                if(this.H.groupKey(v) == 202 && Intrinsics.areEqual(this.H.groupObjectKey(v), ComposerKt.getCompositionLocalMap())) {
                    IntMap intMap0 = this.v;
                    if(intMap0 == null) {
                    label_17:
                        Object object1 = this.H.groupAux(v);
                        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap0 = (PersistentCompositionLocalMap)object1;
                    }
                    else {
                        persistentCompositionLocalMap0 = (PersistentCompositionLocalMap)intMap0.get(v);
                        if(persistentCompositionLocalMap0 == null) {
                            goto label_17;
                        }
                    }
                    this.L = persistentCompositionLocalMap0;
                    return persistentCompositionLocalMap0;
                }
                v = this.H.parent(v);
            }
        }
        this.L = this.u;
        return this.u;
    }

    @Override  // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.y = this.z >= 0;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        this.h(false);
        RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
        if(recomposeScopeImpl0 != null && recomposeScopeImpl0.getUsed()) {
            recomposeScopeImpl0.setDefaultsInScope(true);
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        this.h(false);
    }

    @Override  // androidx.compose.runtime.Composer
    public void endNode() {
        this.h(true);
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProvider() {
        this.h(false);
        this.h(false);
        this.w = ComposerKt.access$asBool(this.x.pop());
        this.L = null;
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        this.h(false);
        this.h(false);
        this.w = ComposerKt.access$asBool(this.x.pop());
        this.L = null;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        this.h(false);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        this.h(false);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @Nullable
    public ScopeUpdateScope endRestartGroup() {
        ScopeUpdateScope scopeUpdateScope0 = null;
        RecomposeScopeImpl recomposeScopeImpl0 = this.E.isNotEmpty() ? ((RecomposeScopeImpl)this.E.pop()) : null;
        if(recomposeScopeImpl0 != null) {
            recomposeScopeImpl0.setRequiresRecompose(false);
        }
        if(recomposeScopeImpl0 != null) {
            Function1 function10 = recomposeScopeImpl0.end(this.B);
            if(function10 != null) {
                this.N.endCompositionScope(function10, this.getComposition());
            }
        }
        if(recomposeScopeImpl0 != null && !recomposeScopeImpl0.getSkipped$runtime_release() && (recomposeScopeImpl0.getUsed() || this.p)) {
            if(recomposeScopeImpl0.getAnchor() == null) {
                recomposeScopeImpl0.setAnchor((this.getInserting() ? this.J.anchor(this.J.getParent()) : this.H.anchor(this.H.getParent())));
            }
            recomposeScopeImpl0.setDefaultsInvalid(false);
            scopeUpdateScope0 = recomposeScopeImpl0;
        }
        this.h(false);
        return scopeUpdateScope0;
    }

    @Override  // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if(this.y && this.H.getParent() == this.z) {
            this.z = -1;
            this.y = false;
        }
        this.h(false);
    }

    public final void endReuseFromRoot() {
        if(this.F || this.z != 100) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    @Override  // androidx.compose.runtime.Composer
    public void endToMarker(int v) {
        if(v < 0) {
            SlotWriter slotWriter0 = this.J;
            int v1;
            while((v1 = slotWriter0.getParent()) > -v) {
                this.h(slotWriter0.isNode(v1));
            }
        }
        else {
            if(this.getInserting()) {
                SlotWriter slotWriter1 = this.J;
                while(this.getInserting()) {
                    this.h(slotWriter1.isNode(slotWriter1.getParent()));
                }
            }
            SlotReader slotReader0 = this.H;
            int v2;
            while((v2 = slotReader0.getParent()) > v) {
                this.h(slotReader0.isNode(v2));
            }
        }
    }

    public final void f(ScopeMap scopeMap0, Function2 function20) {
        long[] arr_v1;
        if(this.F) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        Object object0 = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.B = SnapshotKt.currentSnapshot().getId();
            this.v = null;
            MutableScatterMap mutableScatterMap0 = scopeMap0.getMap();
            Object[] arr_object = mutableScatterMap0.keys;
            Object[] arr_object1 = mutableScatterMap0.values;
            long[] arr_v = mutableScatterMap0.metadata;
            int v1 = arr_v.length - 2;
            ArrayList arrayList0 = this.s;
            if(v1 >= 0) {
                int v2 = 0;
                while(true) {
                    long v3 = arr_v[v2];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_43;
                    }
                    int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                    int v5 = 0;
                    while(v5 < v4) {
                        if((v3 & 0xFFL) < 0x80L) {
                            int v6 = (v2 << 3) + v5;
                            Object object1 = arr_object[v6];
                            Object object2 = arr_object1[v6];
                            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)object1;
                            Anchor anchor0 = ((RecomposeScopeImpl)object1).getAnchor();
                            if(anchor0 == null) {
                                arr_v1 = arr_v;
                            }
                            else {
                                int v7 = anchor0.getLocation$runtime_release();
                                arr_v1 = arr_v;
                                if(object2 == ScopeInvalidated.INSTANCE) {
                                    object2 = null;
                                }
                                arrayList0.add(new p(((RecomposeScopeImpl)object1), v7, object2));
                            }
                        }
                        else {
                            arr_v1 = arr_v;
                        }
                        v3 >>= 8;
                        ++v5;
                        arr_v = arr_v1;
                    }
                    long[] arr_v2 = arr_v;
                    if(v4 == 8) {
                        goto label_44;
                    label_43:
                        arr_v2 = arr_v;
                    label_44:
                        if(v2 != v1) {
                            ++v2;
                            arr_v = arr_v2;
                            continue;
                        }
                    }
                    goto label_48;
                }
            }
            else {
            label_48:
                n.sortWith(arrayList0, ComposerKt.h);
                this.j = 0;
                this.F = true;
            }
            try {
                this.x();
                Object object3 = this.nextSlot();
                if(object3 != function20 && function20 != null) {
                    this.updateValue(function20);
                }
                MutableVector mutableVector0 = SnapshotStateKt.derivedStateObservers();
                try {
                    mutableVector0.add(this.D);
                    if(function20 != null) {
                        this.v(200, ComposerKt.getInvocation());
                        ActualJvm_jvmKt.invokeComposable(this, function20);
                        this.h(false);
                    }
                    else if((this.q || this.w) && object3 != null && !Intrinsics.areEqual(object3, Composer.Companion.getEmpty())) {
                        this.v(200, ComposerKt.getInvocation());
                        ActualJvm_jvmKt.invokeComposable(this, ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object3, 2)));
                        this.h(false);
                    }
                    else {
                        this.skipCurrentGroup();
                    }
                }
                finally {
                    mutableVector0.removeAt(mutableVector0.getSize() - 1);
                }
                this.i();
            }
            catch(Throwable throwable0) {
                this.F = false;
                arrayList0.clear();
                this.a();
                ComposerKt.runtimeCheck(this.J.getClosed());
                this.k();
                throw throwable0;
            }
            this.F = false;
            arrayList0.clear();
            ComposerKt.runtimeCheck(this.J.getClosed());
            this.k();
        }
        finally {
            Trace.INSTANCE.endSection(object0);
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if(!this.p) {
            this.p = true;
            this.q = true;
            return true;
        }
        return false;
    }

    public final void g(int v, int v1) {
        if(v > 0 && v != v1) {
            this.g(this.H.parent(v), v1);
            if(this.H.isNode(v)) {
                Object object0 = this.H.node(v);
                this.N.moveDown(object0);
            }
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @NotNull
    public Applier getApplier() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.Composer
    @NotNull
    @TestOnly
    public CoroutineContext getApplyCoroutineContext() {
        return this.b.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.A > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.e.getSize();
    }

    @Override  // androidx.compose.runtime.Composer
    @NotNull
    public ControlledComposition getComposition() {
        return this.g;
    }

    @Override  // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.R;
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public static void getCompoundKeyHash$annotations() {
    }

    @Override  // androidx.compose.runtime.Composer
    @NotNull
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return this.d();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return this.getInserting() ? -this.J.getParent() : this.H.getParent();
    }

    @Nullable
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        if(this.A == 0) {
            return this.E.isNotEmpty() ? ((RecomposeScopeImpl)this.E.peek()) : null;
        }
        return null;
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if(this.getSkipping() && !this.w) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
            return recomposeScopeImpl0 != null && recomposeScopeImpl0.getDefaultsInvalid();
        }
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public static void getDefaultsInvalid$annotations() {
    }

    @Nullable
    public final ChangeList getDeferredChanges$runtime_release() {
        return this.M;
    }

    public final boolean getHasInvalidations() {
        return !this.s.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.e.isNotEmpty();
    }

    @NotNull
    public final SlotTable getInsertTable$runtime_release() {
        return this.I;
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.Q;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public static void getInserting$annotations() {
    }

    @NotNull
    public final SlotReader getReader$runtime_release() {
        return this.H;
    }

    @Override  // androidx.compose.runtime.Composer
    @Nullable
    public RecomposeScope getRecomposeScope() {
        return this.getCurrentRecomposeScope$runtime_release();
    }

    @Override  // androidx.compose.runtime.Composer
    @Nullable
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
        return recomposeScopeImpl0 != null ? recomposeScopeImpl0.getAnchor() : null;
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if(!this.getInserting() && !this.y && !this.w) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
            return recomposeScopeImpl0 != null && !recomposeScopeImpl0.getRequiresRecompose() && !this.q;
        }
        return false;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public static void getSkipping$annotations() {
    }

    public final void h(boolean z) {
        int v33;
        ComposerChangeListWriter composerChangeListWriter2;
        ArrayList arrayList4;
        int v30;
        IntStack intStack2;
        IntStack intStack1;
        int v12;
        long[] arr_v2;
        Object[] arr_object4;
        int v23;
        int v21;
        Object[] arr_object1;
        List list1;
        int v16;
        ComposerChangeListWriter composerChangeListWriter1;
        ArrayList arrayList3;
        LinkedHashSet linkedHashSet1;
        ArrayList arrayList2;
        a0 a01;
        IntStack intStack0 = this.m;
        int v = intStack0.peek2();
        if(this.getInserting()) {
            int v1 = this.J.getParent();
            int v2 = this.J.groupKey(v1);
            Object object0 = this.J.groupObjectKey(v1);
            Object object1 = this.J.groupAux(v1);
            if(object0 != null) {
                this.R = Integer.rotateRight((object0 instanceof Enum ? ((Enum)object0).ordinal() : object0.hashCode()) ^ Integer.rotateRight(this.getCompoundKeyHash(), 3), 3);
            }
            else if(object1 != null && v2 == 0xCF && !Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
                this.R = Integer.rotateRight(Integer.rotateRight(v - 1 ^ this.getCompoundKeyHash(), 3) ^ object1.hashCode(), 3);
            }
            else {
                this.R = Integer.rotateRight(Integer.rotateRight(v - 1 ^ this.getCompoundKeyHash(), 3) ^ v2, 3);
            }
        }
        else {
            int v3 = this.H.getParent();
            int v4 = this.H.groupKey(v3);
            Object object2 = this.H.groupObjectKey(v3);
            Object object3 = this.H.groupAux(v3);
            if(object2 != null) {
                this.R = Integer.rotateRight((object2 instanceof Enum ? ((Enum)object2).ordinal() : object2.hashCode()) ^ Integer.rotateRight(this.getCompoundKeyHash(), 3), 3);
            }
            else if(object3 != null && v4 == 0xCF && !Intrinsics.areEqual(object3, Composer.Companion.getEmpty())) {
                this.R = Integer.rotateRight(Integer.rotateRight(v - 1 ^ this.getCompoundKeyHash(), 3) ^ object3.hashCode(), 3);
            }
            else {
                this.R = Integer.rotateRight(Integer.rotateRight(v - 1 ^ this.getCompoundKeyHash(), 3) ^ v4, 3);
            }
        }
        int v5 = this.k;
        a0 a00 = this.i;
        ArrayList arrayList0 = this.s;
        ComposerChangeListWriter composerChangeListWriter0 = this.N;
        if(a00 == null) {
            intStack2 = intStack0;
            v30 = v5;
            arrayList4 = arrayList0;
            composerChangeListWriter2 = composerChangeListWriter0;
        }
        else {
            List list0 = a00.a;
            if(list0.size() > 0) {
                ArrayList arrayList1 = a00.d;
                Set set0 = ListUtilsKt.fastToSet(arrayList1);
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                int v6 = arrayList1.size();
                int v7 = list0.size();
                int v8 = 0;
                int v9 = 0;
                int v10 = 0;
                while(v9 < v7) {
                    KeyInfo keyInfo0 = (KeyInfo)list0.get(v9);
                    boolean z1 = set0.contains(keyInfo0);
                    int v11 = a00.b;
                    if(z1) {
                        intStack1 = intStack0;
                        v12 = v7;
                        if(linkedHashSet0.contains(keyInfo0)) {
                            ++v9;
                        }
                        else if(v10 < v6) {
                            KeyInfo keyInfo1 = (KeyInfo)arrayList1.get(v10);
                            MutableIntObjectMap mutableIntObjectMap0 = a00.e;
                            if(keyInfo1 == keyInfo0) {
                                v23 = v5;
                                a01 = a00;
                                arrayList3 = arrayList0;
                                composerChangeListWriter1 = composerChangeListWriter0;
                                list1 = list0;
                                arrayList2 = arrayList1;
                                linkedHashSet1 = linkedHashSet0;
                                v16 = v6;
                                ++v9;
                            }
                            else {
                                int v13 = a00.a(keyInfo1);
                                linkedHashSet0.add(keyInfo1);
                                if(v13 == v8) {
                                    v23 = v5;
                                    a01 = a00;
                                    arrayList3 = arrayList0;
                                    composerChangeListWriter1 = composerChangeListWriter0;
                                    list1 = list0;
                                    arrayList2 = arrayList1;
                                    linkedHashSet1 = linkedHashSet0;
                                    v16 = v6;
                                }
                                else {
                                    a01 = a00;
                                    l l0 = (l)mutableIntObjectMap0.get(keyInfo1.getLocation());
                                    int v14 = l0 == null ? keyInfo1.getNodes() : l0.c;
                                    arrayList2 = arrayList1;
                                    composerChangeListWriter0.moveNode(v13 + v11, v11 + v8, v14);
                                    if(v13 > v8) {
                                        Object[] arr_object = mutableIntObjectMap0.values;
                                        long[] arr_v = mutableIntObjectMap0.metadata;
                                        linkedHashSet1 = linkedHashSet0;
                                        int v15 = arr_v.length - 2;
                                        if(v15 >= 0) {
                                            arrayList3 = arrayList0;
                                            composerChangeListWriter1 = composerChangeListWriter0;
                                            v16 = v6;
                                            int v17 = 0;
                                            while(true) {
                                                long v18 = arr_v[v17];
                                                list1 = list0;
                                                if((~v18 << 7 & v18 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                    goto label_111;
                                                }
                                                int v19 = 8 - (~(v17 - v15) >>> 0x1F);
                                                int v20 = 0;
                                                while(v20 < v19) {
                                                    if((v18 & 0xFFL) < 0x80L) {
                                                        arr_object1 = arr_object;
                                                        l l1 = (l)arr_object[(v17 << 3) + v20];
                                                        v21 = v5;
                                                        int v22 = l1.b;
                                                        if(v13 <= v22 && v22 < v13 + v14) {
                                                            l1.b = v22 - v13 + v8;
                                                        }
                                                        else if(v8 <= v22 && v22 < v13) {
                                                            l1.b = v22 + v14;
                                                        }
                                                    }
                                                    else {
                                                        v21 = v5;
                                                        arr_object1 = arr_object;
                                                    }
                                                    v18 >>= 8;
                                                    ++v20;
                                                    v5 = v21;
                                                    arr_object = arr_object1;
                                                }
                                                v23 = v5;
                                                Object[] arr_object2 = arr_object;
                                                if(v19 == 8) {
                                                    goto label_113;
                                                label_111:
                                                    v23 = v5;
                                                    arr_object2 = arr_object;
                                                label_113:
                                                    if(v17 != v15) {
                                                        ++v17;
                                                        list0 = list1;
                                                        v5 = v23;
                                                        arr_object = arr_object2;
                                                        continue;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        else {
                                            v23 = v5;
                                            arrayList3 = arrayList0;
                                            composerChangeListWriter1 = composerChangeListWriter0;
                                            list1 = list0;
                                            v16 = v6;
                                        }
                                    }
                                    else {
                                        v23 = v5;
                                        arrayList3 = arrayList0;
                                        composerChangeListWriter1 = composerChangeListWriter0;
                                        list1 = list0;
                                        linkedHashSet1 = linkedHashSet0;
                                        v16 = v6;
                                        if(v8 > v13) {
                                            Object[] arr_object3 = mutableIntObjectMap0.values;
                                            long[] arr_v1 = mutableIntObjectMap0.metadata;
                                            int v24 = arr_v1.length - 2;
                                            if(v24 >= 0) {
                                                int v25 = 0;
                                                while(true) {
                                                    long v26 = arr_v1[v25];
                                                    if((~v26 << 7 & v26 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                        goto label_164;
                                                    }
                                                    int v27 = 8 - (~(v25 - v24) >>> 0x1F);
                                                    int v28 = 0;
                                                    while(v28 < v27) {
                                                        if((v26 & 0xFFL) < 0x80L) {
                                                            l l2 = (l)arr_object3[(v25 << 3) + v28];
                                                            arr_object4 = arr_object3;
                                                            int v29 = l2.b;
                                                            arr_v2 = arr_v1;
                                                            if(v13 <= v29 && v29 < v13 + v14) {
                                                                l2.b = v29 - v13 + v8;
                                                            }
                                                            else if(v13 + 1 <= v29 && v29 < v8) {
                                                                l2.b = v29 - v14;
                                                            }
                                                        }
                                                        else {
                                                            arr_object4 = arr_object3;
                                                            arr_v2 = arr_v1;
                                                        }
                                                        v26 >>= 8;
                                                        ++v28;
                                                        arr_object3 = arr_object4;
                                                        arr_v1 = arr_v2;
                                                    }
                                                    Object[] arr_object5 = arr_object3;
                                                    long[] arr_v3 = arr_v1;
                                                    if(v27 == 8) {
                                                        goto label_166;
                                                    label_164:
                                                        arr_object5 = arr_object3;
                                                        arr_v3 = arr_v1;
                                                    label_166:
                                                        if(v25 != v24) {
                                                            ++v25;
                                                            arr_object3 = arr_object5;
                                                            arr_v1 = arr_v3;
                                                            continue;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ++v10;
                            l l3 = (l)mutableIntObjectMap0.get(keyInfo1.getLocation());
                            v8 += (l3 == null ? keyInfo1.getNodes() : l3.c);
                            v7 = v12;
                            intStack0 = intStack1;
                            a00 = a01;
                            arrayList1 = arrayList2;
                            linkedHashSet0 = linkedHashSet1;
                            v6 = v16;
                            arrayList0 = arrayList3;
                            composerChangeListWriter0 = composerChangeListWriter1;
                            list0 = list1;
                            v5 = v23;
                            continue;
                        }
                    }
                    else {
                        v12 = v7;
                        composerChangeListWriter0.removeNode(a00.a(keyInfo0) + v11, keyInfo0.getNodes());
                        a00.b(keyInfo0.getLocation(), 0);
                        composerChangeListWriter0.moveReaderRelativeTo(keyInfo0.getLocation());
                        this.H.reposition(keyInfo0.getLocation());
                        this.s(this.H.getCurrentGroup());
                        composerChangeListWriter0.removeCurrentGroup();
                        this.H.skipGroup();
                        intStack1 = intStack0;
                        ComposerKt.access$removeRange(arrayList0, keyInfo0.getLocation(), this.H.groupSize(keyInfo0.getLocation()) + keyInfo0.getLocation());
                        ++v9;
                    }
                    v7 = v12;
                    intStack0 = intStack1;
                }
                intStack2 = intStack0;
                v30 = v5;
                arrayList4 = arrayList0;
                composerChangeListWriter0.endNodeMovement();
                if(list0.size() > 0) {
                    composerChangeListWriter2 = composerChangeListWriter0;
                    composerChangeListWriter2.moveReaderRelativeTo(this.H.getGroupEnd());
                    this.H.skipToGroupEnd();
                }
                else {
                    composerChangeListWriter2 = composerChangeListWriter0;
                }
            }
            else {
                intStack2 = intStack0;
                v30 = v5;
                arrayList4 = arrayList0;
                composerChangeListWriter2 = composerChangeListWriter0;
            }
        }
        int v31 = this.j;
        while(!this.H.isGroupEnd()) {
            int v32 = this.H.getCurrentGroup();
            this.s(this.H.getCurrentGroup());
            composerChangeListWriter2.removeCurrentGroup();
            composerChangeListWriter2.removeNode(v31, this.H.skipGroup());
            ComposerKt.access$removeRange(arrayList4, v32, this.H.getCurrentGroup());
        }
        boolean z2 = this.getInserting();
        if(z2) {
            if(z) {
                this.P.endNodeInsert();
                v33 = 1;
            }
            else {
                v33 = v30;
            }
            this.H.endEmpty();
            int v34 = this.J.getParent();
            this.J.endGroup();
            if(!this.H.getInEmpty()) {
                this.J.endInsert();
                this.J.close(true);
                Anchor anchor0 = this.O;
                if(this.P.isEmpty()) {
                    composerChangeListWriter2.insertSlots(anchor0, this.I);
                }
                else {
                    composerChangeListWriter2.insertSlots(anchor0, this.I, this.P);
                    this.P = new FixupList();
                }
                this.Q = false;
                if(!this.c.isEmpty()) {
                    this.y(-2 - v34, 0);
                    this.z(-2 - v34, v33);
                }
            }
        }
        else {
            if(z) {
                composerChangeListWriter2.moveUp();
            }
            int v35 = this.H.getRemainingSlots();
            if(v35 > 0) {
                composerChangeListWriter2.trimValues(v35);
            }
            composerChangeListWriter2.endCurrentGroup();
            int v36 = this.H.getParent();
            int v37 = v30;
            if(v37 != this.A(v36)) {
                this.z(v36, v37);
            }
            if(z) {
                v37 = 1;
            }
            this.H.endGroup();
            composerChangeListWriter2.endNodeMovement();
            v33 = v37;
        }
        a0 a02 = (a0)this.h.pop();
        if(a02 != null && !z2) {
            ++a02.c;
        }
        this.i = a02;
        this.j = intStack2.pop() + v33;
        this.l = intStack2.pop();
        this.k = intStack2.pop() + v33;
    }

    public final void i() {
        this.h(false);
        this.b.doneComposing$runtime_release();
        this.h(false);
        this.N.endRoot();
        this.N.finalizeComposition();
        if(!this.h.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        this.b();
        this.H.close();
        this.q = false;
        this.w = ComposerKt.access$asBool(this.x.pop());
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(@NotNull MovableContent movableContent0, @Nullable Object object0) {
        Intrinsics.checkNotNull(movableContent0, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        this.m(movableContent0, this.d(), object0, false);
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(@NotNull List list0) {
        try {
            this.l(list0);
        }
        catch(Throwable throwable0) {
            this.a();
            throw throwable0;
        }
        this.b();
    }

    public final boolean isComposing$runtime_release() {
        return this.F;
    }

    public final boolean isDisposed$runtime_release() {
        return this.G;
    }

    public final void j(boolean z, a0 a00) {
        this.h.push(this.i);
        this.i = a00;
        this.m.push(this.k);
        this.m.push(this.l);
        this.m.push(this.j);
        if(z) {
            this.j = 0;
        }
        this.k = 0;
        this.l = 0;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Object joinKey(@Nullable Object object0, @Nullable Object object1) {
        JoinedKey joinedKey0 = ComposerKt.c(this.H.getGroupObjectKey(), object0, object1);
        return joinedKey0 == null ? new JoinedKey(object0, object1) : joinedKey0;
    }

    public final void k() {
        SlotTable slotTable0 = new SlotTable();
        if(this.C) {
            slotTable0.collectSourceInformation();
        }
        if(this.b.getCollectingCallByInformation$runtime_release()) {
            slotTable0.collectCalledByInformation();
        }
        this.I = slotTable0;
        SlotWriter slotWriter0 = slotTable0.openWriter();
        slotWriter0.close(true);
        this.J = slotWriter0;
    }

    public final void l(List list0) {
        boolean z1;
        a a0;
        List list2;
        Integer integer0;
        ControlledComposition controlledComposition1;
        ControlledComposition controlledComposition0;
        ChangeList changeList4;
        boolean z;
        int[] arr_v1;
        IntMap intMap1;
        ChangeList changeList3;
        ChangeList changeList2;
        Anchor anchor2;
        SlotTable slotTable2;
        int v4;
        SlotReader slotReader1;
        SlotTable slotTable0 = this.c;
        CompositionContext compositionContext0 = this.b;
        ComposerChangeListWriter composerChangeListWriter0 = this.N;
        ChangeList changeList0 = composerChangeListWriter0.getChangeList();
        try {
            composerChangeListWriter0.setChangeList(this.f);
            composerChangeListWriter0.resetSlots();
            int v1 = list0.size();
            int v2 = 0;
            while(v2 < v1) {
                Pair pair0 = (Pair)list0.get(v2);
                MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)pair0.component1();
                MovableContentStateReference movableContentStateReference1 = (MovableContentStateReference)pair0.component2();
                Anchor anchor0 = movableContentStateReference0.getAnchor$runtime_release();
                int v3 = movableContentStateReference0.getSlotTable$runtime_release().anchorIndex(anchor0);
                IntRef intRef0 = new IntRef(0, 1, null);
                composerChangeListWriter0.determineMovableContentNodeIndex(intRef0, anchor0);
                if(movableContentStateReference1 == null) {
                    if(Intrinsics.areEqual(movableContentStateReference0.getSlotTable$runtime_release(), this.I)) {
                        ComposerKt.runtimeCheck(this.J.getClosed());
                        this.k();
                    }
                    SlotReader slotReader0 = movableContentStateReference0.getSlotTable$runtime_release().openReader();
                    try {
                        slotReader0.reposition(v3);
                        composerChangeListWriter0.moveReaderToAbsolute(v3);
                        slotReader1 = slotReader0;
                        ChangeList changeList1 = new ChangeList();
                        slotReader1 = slotReader0;
                        this.o(null, null, null, CollectionsKt__CollectionsKt.emptyList(), new g0(10, this, changeList1, slotReader0, movableContentStateReference0));
                        composerChangeListWriter0.includeOperationsIn(changeList1, intRef0);
                    }
                    catch(Throwable throwable0) {
                        slotReader1.close();
                        throw throwable0;
                    }
                    slotReader1.close();
                    v4 = v2;
                }
                else {
                    MovableContentState movableContentState0 = compositionContext0.movableContentStateResolve$runtime_release(movableContentStateReference1);
                    if(movableContentState0 == null) {
                        slotTable2 = movableContentStateReference1.getSlotTable$runtime_release();
                    }
                    else {
                        SlotTable slotTable1 = movableContentState0.getSlotTable$runtime_release();
                        if(slotTable1 != null) {
                            slotTable2 = slotTable1;
                        }
                    }
                    if(movableContentState0 == null) {
                        anchor2 = movableContentStateReference1.getAnchor$runtime_release();
                    }
                    else {
                        SlotTable slotTable3 = movableContentState0.getSlotTable$runtime_release();
                        if(slotTable3 != null) {
                            Anchor anchor1 = slotTable3.anchor(0);
                            if(anchor1 != null) {
                                anchor2 = anchor1;
                            }
                        }
                    }
                    List list1 = ComposerKt.access$collectNodesFrom(slotTable2, anchor2);
                    if(!list1.isEmpty()) {
                        composerChangeListWriter0.copyNodesToNewAnchorLocation(list1, intRef0);
                        if(Intrinsics.areEqual(movableContentStateReference0.getSlotTable$runtime_release(), slotTable0)) {
                            int v5 = slotTable0.anchorIndex(anchor0);
                            this.y(v5, this.A(v5) + list1.size());
                        }
                    }
                    composerChangeListWriter0.copySlotTableToAnchorLocation(movableContentState0, compositionContext0, movableContentStateReference1, movableContentStateReference0);
                    SlotReader slotReader2 = slotTable2.openReader();
                    try {
                        SlotReader slotReader3 = this.getReader$runtime_release();
                        int[] arr_v = this.n;
                        IntMap intMap0 = this.v;
                        this.n = null;
                        this.v = null;
                        try {
                            this.setReader$runtime_release(slotReader2);
                            int v6 = slotTable2.anchorIndex(anchor2);
                            slotReader2.reposition(v6);
                            composerChangeListWriter0.moveReaderToAbsolute(v6);
                            changeList2 = new ChangeList();
                            changeList3 = composerChangeListWriter0.getChangeList();
                        }
                        catch(Throwable throwable2) {
                            intMap1 = intMap0;
                            arr_v1 = arr_v;
                            this.setReader$runtime_release(slotReader3);
                            this.n = arr_v1;
                            this.v = intMap1;
                            throw throwable2;
                        }
                        try {
                            composerChangeListWriter0.setChangeList(changeList2);
                            z = composerChangeListWriter0.getImplicitRootStart();
                        }
                        catch(Throwable throwable3) {
                            intMap1 = intMap0;
                            arr_v1 = arr_v;
                            changeList4 = changeList3;
                            goto label_116;
                        }
                        try {
                            composerChangeListWriter0.setImplicitRootStart(false);
                            controlledComposition0 = movableContentStateReference1.getComposition$runtime_release();
                            controlledComposition1 = movableContentStateReference0.getComposition$runtime_release();
                            integer0 = slotReader2.getCurrentGroup();
                            list2 = movableContentStateReference1.getInvalidations$runtime_release();
                        }
                        catch(Throwable throwable4) {
                            arr_v1 = arr_v;
                            changeList4 = changeList3;
                            intMap1 = intMap0;
                            z1 = z;
                            goto label_111;
                        }
                        try {
                            changeList4 = changeList3;
                            intMap1 = intMap0;
                            arr_v1 = arr_v;
                            a0 = new a(14, this, movableContentStateReference0);
                            intMap1 = intMap0;
                            arr_v1 = arr_v;
                            z1 = z;
                            v4 = v2;
                            changeList4 = changeList3;
                            goto label_108;
                        }
                        catch(Throwable throwable4) {
                        }
                        z1 = z;
                        goto label_111;
                        try {
                        label_108:
                            this.o(controlledComposition0, controlledComposition1, integer0, list2, a0);
                            goto label_113;
                        }
                        catch(Throwable throwable4) {
                        }
                        try {
                        label_111:
                            composerChangeListWriter0.setImplicitRootStart(z1);
                            throw throwable4;
                        label_113:
                            composerChangeListWriter0.setImplicitRootStart(z1);
                            goto label_118;
                        }
                        catch(Throwable throwable3) {
                        }
                        try {
                        label_116:
                            composerChangeListWriter0.setChangeList(changeList4);
                            throw throwable3;
                        label_118:
                            composerChangeListWriter0.setChangeList(changeList4);
                            composerChangeListWriter0.includeOperationsIn(changeList2, intRef0);
                        }
                        catch(Throwable throwable2) {
                            this.setReader$runtime_release(slotReader3);
                            this.n = arr_v1;
                            this.v = intMap1;
                            throw throwable2;
                        }
                        this.setReader$runtime_release(slotReader3);
                        this.n = arr_v1;
                        this.v = intMap1;
                    }
                    catch(Throwable throwable1) {
                        slotReader2.close();
                        throw throwable1;
                    }
                    slotReader2.close();
                }
                composerChangeListWriter0.skipToEndOfCurrentGroup();
                v2 = v4 + 1;
            }
            composerChangeListWriter0.endMovableContentPlacement();
            composerChangeListWriter0.moveReaderToAbsolute(0);
        }
        finally {
            composerChangeListWriter0.setChangeList(changeList0);
        }
    }

    public final void m(MovableContent movableContent0, PersistentCompositionLocalMap persistentCompositionLocalMap0, Object object0, boolean z) {
        boolean z1;
        this.startMovableGroup(0x78CC281, movableContent0);
        this.nextSlot();
        this.updateValue(object0);
        int v = this.getCompoundKeyHash();
        try {
            this.R = 0x78CC281;
            if(this.getInserting()) {
                SlotWriter.markGroup$default(this.J, 0, 1, null);
            }
            if(this.getInserting()) {
                z1 = false;
            }
            else if(!Intrinsics.areEqual(this.H.getGroupAux(), persistentCompositionLocalMap0)) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(z1) {
                this.q(persistentCompositionLocalMap0);
            }
            this.u(202, ComposerKt.getCompositionLocalMap(), 0, persistentCompositionLocalMap0);
            this.L = null;
            if(!this.getInserting() || z) {
                boolean z2 = this.w;
                this.w = z1;
                ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(0x12D6006F, true, new v(2, movableContent0, object0)));
                this.w = z2;
            }
            else {
                this.K = true;
                Anchor anchor0 = this.J.anchor(this.J.parent(this.J.getParent()));
                MovableContentStateReference movableContentStateReference0 = new MovableContentStateReference(movableContent0, object0, this.getComposition(), this.I, anchor0, CollectionsKt__CollectionsKt.emptyList(), this.d());
                this.b.insertMovableContent$runtime_release(movableContentStateReference0);
            }
        }
        finally {
            this.h(false);
            this.L = null;
            this.R = v;
            this.endMovableGroup();
        }
    }

    public final int n(int v) {
        int v1 = this.H.parent(v) + 1;
        int v2 = 0;
        while(v1 < v) {
            if(!this.H.hasObjectKey(v1)) {
                ++v2;
            }
            v1 += this.H.groupSize(v1);
        }
        return v2;
    }

    @PublishedApi
    @Nullable
    public final Object nextSlot() {
        if(this.getInserting()) {
            if(this.r) {
                ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
            }
            return Composer.Companion.getEmpty();
        }
        Object object0 = this.H.next();
        return !this.y || object0 instanceof ReusableRememberObserver ? object0 : Composer.Companion.getEmpty();
    }

    @PublishedApi
    @Nullable
    public final Object nextSlotForCache() {
        if(this.getInserting()) {
            if(this.r) {
                ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
            }
            return Composer.Companion.getEmpty();
        }
        RememberObserver rememberObserver0 = this.H.next();
        if(this.y && !(rememberObserver0 instanceof ReusableRememberObserver)) {
            return Composer.Companion.getEmpty();
        }
        return rememberObserver0 instanceof RememberObserverHolder ? ((RememberObserverHolder)rememberObserver0).getWrapped() : rememberObserver0;
    }

    public final Object o(ControlledComposition controlledComposition0, ControlledComposition controlledComposition1, Integer integer0, List list0, Function0 function00) {
        int v1;
        boolean z;
        Object object1;
        try {
            z = this.F;
            v1 = this.j;
            this.F = true;
            this.j = 0;
            int v3 = list0.size();
            for(int v2 = 0; v2 < v3; ++v2) {
                Pair pair0 = (Pair)list0.get(v2);
                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)pair0.component1();
                Object object0 = pair0.component2();
                if(object0 == null) {
                    this.tryImminentInvalidation$runtime_release(recomposeScopeImpl0, null);
                }
                else {
                    this.tryImminentInvalidation$runtime_release(recomposeScopeImpl0, object0);
                }
            }
            if(controlledComposition0 == null) {
                object1 = function00.invoke();
            }
            else {
                object1 = controlledComposition0.delegateInvalidations(controlledComposition1, (integer0 == null ? -1 : ((int)integer0)), function00);
                if(object1 == null) {
                    object1 = function00.invoke();
                }
            }
            return object1;
        }
        finally {
            this.F = z;
            this.j = v1;
        }
    }

    public final void p() {
        boolean z = this.F;
        this.F = true;
        int v = this.H.getParent();
        int v1 = this.H.groupSize(v) + v;
        int v2 = this.j;
        int v3 = this.getCompoundKeyHash();
        int v4 = this.k;
        int v5 = this.l;
        ArrayList arrayList0 = this.s;
        p p0 = ComposerKt.access$firstInRange(arrayList0, this.H.getCurrentGroup(), v1);
        int v6 = v;
        boolean z1 = false;
        while(p0 != null) {
            int v7 = p0.b;
            ComposerKt.access$removeLocation(arrayList0, v7);
            RecomposeScopeImpl recomposeScopeImpl0 = p0.a;
            if(recomposeScopeImpl0.isInvalidFor(p0.c)) {
                this.H.reposition(v7);
                int v8 = this.H.getCurrentGroup();
                this.r(v6, v8, v);
                int v9;
                for(v9 = this.H.parent(v8); v9 != v && !this.H.isNode(v9); v9 = this.H.parent(v9)) {
                }
                int v10 = this.H.isNode(v9) ? 0 : v2;
                if(v9 != v8) {
                    int v11 = this.A(v9) - this.H.nodeCount(v8) + v10;
                label_27:
                    while(v10 < v11 && v9 != v7) {
                        ++v9;
                        while(true) {
                            if(v9 >= v7) {
                                break label_27;
                            }
                            int v12 = this.H.groupSize(v9) + v9;
                            if(v7 >= v12) {
                                v10 += (this.H.isNode(v9) ? 1 : this.A(v9));
                                v9 = v12;
                                continue;
                            }
                            if(false) {
                                break label_27;
                            }
                            continue label_27;
                        }
                    }
                }
                this.j = v10;
                this.l = this.n(v8);
                int v13 = this.H.parent(v8);
                this.R = this.c(v13, this.n(v13), v, v3);
                this.L = null;
                recomposeScopeImpl0.compose(this);
                this.L = null;
                this.H.restoreParent(v);
                v6 = v8;
                z1 = true;
            }
            else {
                this.E.push(recomposeScopeImpl0);
                recomposeScopeImpl0.rereadTrackedInstances();
                this.E.pop();
            }
            p0 = ComposerKt.access$firstInRange(arrayList0, this.H.getCurrentGroup(), v1);
        }
        if(z1) {
            this.r(v6, v, v);
            this.H.skipToGroupEnd();
            int v14 = this.A(v);
            this.j = v2 + v14;
            this.k = v4 + v14;
            this.l = v5;
        }
        else {
            this.k = this.H.getParentNodes();
            this.H.skipToGroupEnd();
        }
        this.R = v3;
        this.F = z;
    }

    // 去混淆评级： 低(20)
    @TestOnly
    public final int parentKey$runtime_release() {
        return this.getInserting() ? this.J.groupKey(this.J.getParent()) : this.H.groupKey(this.H.getParent());
    }

    public final void prepareCompose$runtime_release(@NotNull Function0 function00) {
        if(this.F) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        try {
            this.F = true;
            function00.invoke();
            this.F = false;
        }
        catch(Throwable throwable0) {
            this.F = false;
            throw throwable0;
        }
    }

    public final void q(PersistentCompositionLocalMap persistentCompositionLocalMap0) {
        IntMap intMap0 = this.v;
        if(intMap0 == null) {
            intMap0 = new IntMap(0, 1, null);
            this.v = intMap0;
        }
        intMap0.set(this.H.getCurrentGroup(), persistentCompositionLocalMap0);
    }

    public final void r(int v, int v1, int v2) {
        SlotReader slotReader0 = this.H;
        int v3 = ComposerKt.access$nearestCommonRootOf(slotReader0, v, v1, v2);
        while(v > 0 && v != v3) {
            if(slotReader0.isNode(v)) {
                this.N.moveUp();
            }
            v = slotReader0.parent(v);
        }
        this.g(v1, v3);
    }

    public final boolean recompose$runtime_release(@NotNull ScopeMap scopeMap0) {
        ChangeList changeList0 = this.e;
        if(!changeList0.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if(scopeMap0.getSize() <= 0 && this.s.isEmpty() && !this.q) {
            return false;
        }
        this.f(scopeMap0, null);
        return changeList0.isNotEmpty();
    }

    @Override  // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull Function0 function00) {
        this.N.sideEffect(function00);
    }

    @Override  // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope recomposeScope0) {
        RecomposeScopeImpl recomposeScopeImpl0 = recomposeScope0 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)recomposeScope0) : null;
        if(recomposeScopeImpl0 != null) {
            recomposeScopeImpl0.setUsed(true);
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @Nullable
    public Object rememberedValue() {
        return this.nextSlotForCache();
    }

    public final void s(int v) {
        ComposerImpl.t(this, v, false, 0);
        this.N.endNodeMovement();
    }

    public final void setDeferredChanges$runtime_release(@Nullable ChangeList changeList0) {
        this.M = changeList0;
    }

    public final void setInsertTable$runtime_release(@NotNull SlotTable slotTable0) {
        this.I = slotTable0;
    }

    public final void setReader$runtime_release(@NotNull SlotReader slotReader0) {
        this.H = slotReader0;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        int v3;
        if(this.s.isEmpty()) {
            int v = this.k;
            this.k = this.H.skipGroup() + v;
            return;
        }
        SlotReader slotReader0 = this.H;
        int v1 = slotReader0.getGroupKey();
        Object object0 = slotReader0.getGroupObjectKey();
        Object object1 = slotReader0.getGroupAux();
        int v2 = this.l;
        if(object0 != null) {
            this.R = Integer.rotateLeft((object0 instanceof Enum ? ((Enum)object0).ordinal() : object0.hashCode()) ^ Integer.rotateLeft(this.getCompoundKeyHash(), 3), 3);
        }
        else if(object1 != null && v1 == 0xCF && !Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
            this.R = Integer.rotateLeft(object1.hashCode() ^ Integer.rotateLeft(this.getCompoundKeyHash(), 3), 3) ^ v2;
        }
        else {
            this.R = Integer.rotateLeft(Integer.rotateLeft(this.getCompoundKeyHash(), 3) ^ v1, 3) ^ v2;
        }
        this.w(null, slotReader0.isNode());
        this.p();
        slotReader0.endGroup();
        if(object0 == null) {
            if(object1 != null && v1 == 0xCF && !Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
                this.R = Integer.rotateRight(object1.hashCode() ^ Integer.rotateRight(this.getCompoundKeyHash() ^ v2, 3), 3);
                return;
            }
            v3 = Integer.rotateRight(this.getCompoundKeyHash() ^ v2, 3) ^ v1;
        }
        else {
            v3 = (object0 instanceof Enum ? ((Enum)object0).ordinal() : object0.hashCode()) ^ Integer.rotateRight(this.getCompoundKeyHash(), 3);
        }
        this.R = Integer.rotateRight(v3, 3);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if(this.k != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
        if(recomposeScopeImpl0 != null) {
            recomposeScopeImpl0.scopeSkipped();
        }
        if(this.s.isEmpty()) {
            this.k = this.H.getParentNodes();
            this.H.skipToGroupEnd();
            return;
        }
        this.p();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@NotNull String s) {
        if(this.getInserting() && this.C) {
            this.J.recordGroupSourceInformation(s);
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if(this.getInserting() && this.C) {
            this.J.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int v, @NotNull String s) {
        if(this.getInserting() && this.C) {
            this.J.recordGrouplessCallSourceInformationStart(v, s);
        }
    }

    public final int stacksSize$runtime_release() {
        int v = this.E.getSize();
        int v1 = this.h.getSize();
        return this.m.getSize() + (v1 + (this.x.getSize() + (v + this.t.getSize())));
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        this.u(0xFFFFFF81, null, 0, null);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int v, @Nullable Object object0) {
        this.u(v, object0, 0, null);
    }

    @Override  // androidx.compose.runtime.Composer
    public void startNode() {
        this.u(0x7D, null, 1, null);
        this.r = true;
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProvider(@NotNull ProvidedValue providedValue0) {
        ValueHolder valueHolder0;
        PersistentCompositionLocalMap persistentCompositionLocalMap0 = this.d();
        this.v(201, ComposerKt.getProvider());
        Object object0 = this.rememberedValue();
        if(Intrinsics.areEqual(object0, Composer.Companion.getEmpty())) {
            valueHolder0 = null;
        }
        else {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder0 = (ValueHolder)object0;
        }
        CompositionLocal compositionLocal0 = providedValue0.getCompositionLocal();
        Intrinsics.checkNotNull(compositionLocal0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.checkNotNull(providedValue0, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder valueHolder1 = compositionLocal0.updatedStateOf$runtime_release(providedValue0, valueHolder0);
        boolean z = Intrinsics.areEqual(valueHolder1, valueHolder0);
        if(!z) {
            this.updateRememberedValue(valueHolder1);
        }
        boolean z1 = true;
        boolean z2 = false;
        if(this.getInserting()) {
            if(providedValue0.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMap0, compositionLocal0)) {
                persistentCompositionLocalMap0 = persistentCompositionLocalMap0.putValue(compositionLocal0, valueHolder1);
            }
            this.K = true;
        }
        else {
            Object object1 = this.H.groupAux(this.H.getCurrentGroup());
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            persistentCompositionLocalMap0 = (!this.getSkipping() || !z) && (providedValue0.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMap0, compositionLocal0)) ? persistentCompositionLocalMap0.putValue(compositionLocal0, valueHolder1) : ((PersistentCompositionLocalMap)object1);
            if(!this.y && ((PersistentCompositionLocalMap)object1) == persistentCompositionLocalMap0) {
                z1 = false;
            }
            z2 = z1;
        }
        if(z2 && !this.getInserting()) {
            this.q(persistentCompositionLocalMap0);
        }
        this.x.push(this.w);
        this.w = z2;
        this.L = persistentCompositionLocalMap0;
        this.u(202, ComposerKt.getCompositionLocalMap(), 0, persistentCompositionLocalMap0);
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@NotNull ProvidedValue[] arr_providedValue) {
        PersistentCompositionLocalMap persistentCompositionLocalMap2;
        PersistentCompositionLocalMap persistentCompositionLocalMap0 = this.d();
        this.v(201, ComposerKt.getProvider());
        boolean z = true;
        boolean z1 = false;
        if(this.getInserting()) {
            PersistentCompositionLocalMap persistentCompositionLocalMap1 = CompositionLocalMapKt.updateCompositionMap$default(arr_providedValue, persistentCompositionLocalMap0, null, 4, null);
            Builder persistentCompositionLocalMap$Builder0 = persistentCompositionLocalMap0.builder();
            persistentCompositionLocalMap$Builder0.putAll(persistentCompositionLocalMap1);
            persistentCompositionLocalMap2 = persistentCompositionLocalMap$Builder0.build();
            this.v(204, ComposerKt.getProviderMaps());
            this.nextSlot();
            this.updateValue(persistentCompositionLocalMap2);
            this.nextSlot();
            this.updateValue(persistentCompositionLocalMap1);
            this.h(false);
            this.K = true;
        }
        else {
            Object object0 = this.H.groupGet(0);
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            Object object1 = this.H.groupGet(1);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap3 = CompositionLocalMapKt.updateCompositionMap(arr_providedValue, persistentCompositionLocalMap0, ((PersistentCompositionLocalMap)object1));
            if(!this.getSkipping() || this.y || !Intrinsics.areEqual(((PersistentCompositionLocalMap)object1), persistentCompositionLocalMap3)) {
                Builder persistentCompositionLocalMap$Builder1 = persistentCompositionLocalMap0.builder();
                persistentCompositionLocalMap$Builder1.putAll(persistentCompositionLocalMap3);
                persistentCompositionLocalMap2 = persistentCompositionLocalMap$Builder1.build();
                this.v(204, ComposerKt.getProviderMaps());
                this.nextSlot();
                this.updateValue(persistentCompositionLocalMap2);
                this.nextSlot();
                this.updateValue(persistentCompositionLocalMap3);
                this.h(false);
                if(!this.y && Intrinsics.areEqual(persistentCompositionLocalMap2, ((PersistentCompositionLocalMap)object0))) {
                    z = false;
                }
                z1 = z;
            }
            else {
                int v = this.k;
                this.k = this.H.skipGroup() + v;
                persistentCompositionLocalMap2 = (PersistentCompositionLocalMap)object0;
            }
        }
        if(z1 && !this.getInserting()) {
            this.q(persistentCompositionLocalMap2);
        }
        this.x.push(this.w);
        this.w = z1;
        this.L = persistentCompositionLocalMap2;
        this.u(202, ComposerKt.getCompositionLocalMap(), 0, persistentCompositionLocalMap2);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceGroup(int v) {
        if(this.i != null) {
            this.u(v, null, 0, null);
            return;
        }
        if(this.r) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
        this.R = this.l ^ Integer.rotateLeft(Integer.rotateLeft(this.getCompoundKeyHash(), 3) ^ v, 3);
        ++this.l;
        SlotReader slotReader0 = this.H;
        if(this.getInserting()) {
            slotReader0.beginEmpty();
            this.J.startGroup(v, Composer.Companion.getEmpty());
            this.j(false, null);
            return;
        }
        if(slotReader0.getGroupKey() == v && !slotReader0.getHasObjectKey()) {
            slotReader0.startGroup();
            this.j(false, null);
            return;
        }
        if(!slotReader0.isGroupEnd()) {
            int v1 = this.j;
            this.s(this.H.getCurrentGroup());
            this.N.removeCurrentGroup();
            int v2 = slotReader0.skipGroup();
            this.N.removeNode(v1, v2);
            ComposerKt.access$removeRange(this.s, slotReader0.getCurrentGroup(), slotReader0.getCurrentGroup());
        }
        slotReader0.beginEmpty();
        this.Q = true;
        this.L = null;
        if(this.J.getClosed()) {
            SlotWriter slotWriter0 = this.I.openWriter();
            this.J = slotWriter0;
            slotWriter0.skipToGroupEnd();
            this.K = false;
            this.L = null;
        }
        SlotWriter slotWriter1 = this.J;
        slotWriter1.beginInsert();
        slotWriter1.startGroup(v, Composer.Companion.getEmpty());
        this.O = slotWriter1.anchor(slotWriter1.getCurrentGroup());
        this.j(false, null);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int v) {
        this.u(v, null, 0, null);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Composer startRestartGroup(int v) {
        boolean z1;
        RecomposeScopeImpl recomposeScopeImpl1;
        this.startReplaceGroup(v);
        Stack stack0 = this.E;
        if(this.getInserting()) {
            ControlledComposition controlledComposition0 = this.getComposition();
            Intrinsics.checkNotNull(controlledComposition0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl0 = new RecomposeScopeImpl(((CompositionImpl)controlledComposition0));
            stack0.push(recomposeScopeImpl0);
            this.updateValue(recomposeScopeImpl0);
            recomposeScopeImpl0.start(this.B);
            return this;
        }
        p p0 = ComposerKt.access$removeLocation(this.s, this.H.getParent());
        Object object0 = this.H.next();
        if(Intrinsics.areEqual(object0, Composer.Companion.getEmpty())) {
            ControlledComposition controlledComposition1 = this.getComposition();
            Intrinsics.checkNotNull(controlledComposition1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl1 = new RecomposeScopeImpl(((CompositionImpl)controlledComposition1));
            this.updateValue(recomposeScopeImpl1);
        }
        else {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl1 = (RecomposeScopeImpl)object0;
        }
        if(p0 == null) {
            boolean z = recomposeScopeImpl1.getForcedRecompose();
            z1 = false;
            if(z) {
                recomposeScopeImpl1.setForcedRecompose(false);
            }
            if(z) {
                z1 = true;
            }
        }
        else {
            z1 = true;
        }
        recomposeScopeImpl1.setRequiresRecompose(z1);
        stack0.push(recomposeScopeImpl1);
        recomposeScopeImpl1.start(this.B);
        return this;
    }

    @Override  // androidx.compose.runtime.Composer
    public void startReusableGroup(int v, @Nullable Object object0) {
        if(!this.getInserting() && this.H.getGroupKey() == v && !Intrinsics.areEqual(this.H.getGroupAux(), object0) && this.z < 0) {
            this.z = this.H.getCurrentGroup();
            this.y = true;
        }
        this.u(v, null, 0, object0);
    }

    @Override  // androidx.compose.runtime.Composer
    public void startReusableNode() {
        this.u(0x7D, null, 2, null);
        this.r = true;
    }

    public final void startReuseFromRoot() {
        this.z = 100;
        this.y = true;
    }

    public static final int t(ComposerImpl composerImpl0, int v, boolean z, int v1) {
        SlotReader slotReader0 = composerImpl0.H;
        ComposerChangeListWriter composerChangeListWriter0 = composerImpl0.N;
        if(slotReader0.hasMark(v)) {
            int v2 = slotReader0.groupKey(v);
            Object object0 = slotReader0.groupObjectKey(v);
            CompositionContext compositionContext0 = composerImpl0.b;
            if(v2 == 0x78CC281 && object0 instanceof MovableContent) {
                Object object1 = slotReader0.groupGet(v, 0);
                Anchor anchor0 = slotReader0.anchor(v);
                int v3 = slotReader0.groupSize(v);
                List list0 = ComposerKt.access$filterToRange(composerImpl0.s, v, v3 + v);
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v4 = list0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    p p0 = (p)list0.get(v5);
                    arrayList0.add(TuplesKt.to(p0.a, p0.c));
                }
                PersistentCompositionLocalMap persistentCompositionLocalMap0 = composerImpl0.e(v);
                MovableContentStateReference movableContentStateReference0 = new MovableContentStateReference(((MovableContent)object0), object1, composerImpl0.getComposition(), composerImpl0.c, anchor0, arrayList0, persistentCompositionLocalMap0);
                compositionContext0.deletedMovableContent$runtime_release(movableContentStateReference0);
                composerChangeListWriter0.recordSlotEditing();
                composerChangeListWriter0.releaseMovableGroupAtCurrent(composerImpl0.getComposition(), compositionContext0, movableContentStateReference0);
                if(z) {
                    composerChangeListWriter0.endNodeMovementAndDeleteNode(v1, v);
                    return 0;
                }
                return slotReader0.nodeCount(v);
            }
            if(v2 == 206 && Intrinsics.areEqual(object0, ComposerKt.getReference())) {
                Object object2 = slotReader0.groupGet(v, 0);
                e e0 = object2 instanceof e ? ((e)object2) : null;
                if(e0 != null) {
                    for(Object object3: e0.a.f) {
                        ComposerImpl composerImpl1 = (ComposerImpl)object3;
                        ComposerChangeListWriter composerChangeListWriter1 = composerImpl1.N;
                        SlotTable slotTable0 = composerImpl1.c;
                        if(slotTable0.containsMark()) {
                            ChangeList changeList0 = new ChangeList();
                            composerImpl1.M = changeList0;
                            try(SlotReader slotReader1 = slotTable0.openReader()) {
                                composerImpl1.H = slotReader1;
                                try {
                                    composerChangeListWriter1.setChangeList(changeList0);
                                    composerImpl1.s(0);
                                    composerChangeListWriter1.releaseMovableContent();
                                }
                                finally {
                                    composerChangeListWriter1.setChangeList(composerChangeListWriter1.getChangeList());
                                }
                            }
                        }
                        compositionContext0.reportRemovedComposition$runtime_release(composerImpl1.getComposition());
                    }
                }
                return slotReader0.nodeCount(v);
            }
            return slotReader0.isNode(v) ? 1 : slotReader0.nodeCount(v);
        }
        if(slotReader0.containsMark(v)) {
            int v7 = slotReader0.groupSize(v);
            int v8 = v + 1;
            int v9 = 0;
            while(v8 < v7 + v) {
                boolean z1 = slotReader0.isNode(v8);
                if(z1) {
                    composerChangeListWriter0.endNodeMovement();
                    composerChangeListWriter0.moveDown(slotReader0.node(v8));
                }
                v9 += ComposerImpl.t(composerImpl0, v8, z1 || z, (z1 ? 0 : v1 + v9));
                if(z1) {
                    composerChangeListWriter0.endNodeMovement();
                    composerChangeListWriter0.moveUp();
                }
                v8 += slotReader0.groupSize(v8);
            }
            return slotReader0.isNode(v) ? 1 : v9;
        }
        return slotReader0.isNode(v) ? 1 : slotReader0.nodeCount(v);
    }

    public final boolean tryImminentInvalidation$runtime_release(@NotNull RecomposeScopeImpl recomposeScopeImpl0, @Nullable Object object0) {
        Anchor anchor0 = recomposeScopeImpl0.getAnchor();
        if(anchor0 == null) {
            return false;
        }
        int v = anchor0.toIndexFor(this.H.getTable$runtime_release());
        if(this.F && v >= this.H.getCurrentGroup()) {
            ComposerKt.access$insertIfMissing(this.s, v, recomposeScopeImpl0, object0);
            return true;
        }
        return false;
    }

    public final void u(int v, Object object0, int v1, Object object1) {
        a0 a02;
        long[] arr_v2;
        Object[] arr_object2;
        Object object2 = object0;
        if(this.r) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
        int v2 = this.l;
        if(object2 != null) {
            this.R = Integer.rotateLeft((object2 instanceof Enum ? ((Enum)object2).ordinal() : object0.hashCode()) ^ Integer.rotateLeft(this.getCompoundKeyHash(), 3), 3);
        }
        else if(object1 != null && v == 0xCF && !Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
            this.R = v2 ^ Integer.rotateLeft(object1.hashCode() ^ Integer.rotateLeft(this.getCompoundKeyHash(), 3), 3);
        }
        else {
            this.R = v2 ^ Integer.rotateLeft(Integer.rotateLeft(this.getCompoundKeyHash(), 3) ^ v, 3);
        }
        if(object2 == null) {
            ++this.l;
        }
        int v3 = -1;
        if(this.getInserting()) {
            this.H.beginEmpty();
            int v4 = this.J.getCurrentGroup();
            if(v1 != 0) {
                this.J.startNode(v, Composer.Companion.getEmpty());
            }
            else if(object1 == null) {
                SlotWriter slotWriter1 = this.J;
                if(object2 == null) {
                    object2 = Composer.Companion.getEmpty();
                }
                slotWriter1.startGroup(v, object2);
            }
            else {
                SlotWriter slotWriter0 = this.J;
                if(object2 == null) {
                    object2 = Composer.Companion.getEmpty();
                }
                slotWriter0.startData(v, object2, object1);
            }
            a0 a00 = this.i;
            if(a00 != null) {
                KeyInfo keyInfo0 = new KeyInfo(v, -1, -2 - v4, -1, 0);
                l l0 = new l(-1, this.j - a00.b, 0);
                a00.e.set(keyInfo0.getLocation(), l0);
                a00.d.add(keyInfo0);
            }
            this.j(v1 != 0, null);
            return;
        }
        boolean z = v1 == 1 && this.y;
        if(this.i == null) {
            if(z || this.H.getGroupKey() != v || !Intrinsics.areEqual(object2, this.H.getGroupObjectKey())) {
                this.i = new a0(this.H.extractKeys(), this.j);
            }
            else {
                this.w(object1, v1 != 0);
            }
        }
        a0 a01 = this.i;
        if(a01 == null) {
            a02 = null;
        }
        else {
            JoinedKey joinedKey0 = object2 == null ? v : new JoinedKey(v, object2);
            MutableScatterMap mutableScatterMap0 = ((x)a01.f.getValue()).a;
            Object object3 = mutableScatterMap0.get(joinedKey0);
            if(object3 == null) {
                object3 = null;
            }
            else {
                if(TypeIntrinsics.isMutableList(object3)) {
                    List list0 = TypeIntrinsics.asMutableList(object3);
                    Object object4 = list0.remove(0);
                    if(list0.isEmpty()) {
                        mutableScatterMap0.remove(joinedKey0);
                    }
                    object3 = object4;
                }
                else {
                    mutableScatterMap0.remove(joinedKey0);
                }
                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
            }
            MutableIntObjectMap mutableIntObjectMap0 = a01.e;
            ArrayList arrayList0 = a01.d;
            int v5 = a01.b;
            if(z || ((KeyInfo)object3) == null) {
                this.H.beginEmpty();
                this.Q = true;
                this.L = null;
                if(this.J.getClosed()) {
                    SlotWriter slotWriter2 = this.I.openWriter();
                    this.J = slotWriter2;
                    slotWriter2.skipToGroupEnd();
                    this.K = false;
                    this.L = null;
                }
                this.J.beginInsert();
                int v21 = this.J.getCurrentGroup();
                if(v1 != 0) {
                    this.J.startNode(v, Composer.Companion.getEmpty());
                }
                else if(object1 == null) {
                    SlotWriter slotWriter4 = this.J;
                    if(object2 == null) {
                        object2 = Composer.Companion.getEmpty();
                    }
                    slotWriter4.startGroup(v, object2);
                }
                else {
                    SlotWriter slotWriter3 = this.J;
                    if(object2 == null) {
                        object2 = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startData(v, object2, object1);
                }
                this.O = this.J.anchor(v21);
                KeyInfo keyInfo1 = new KeyInfo(v, -1, -2 - v21, -1, 0);
                mutableIntObjectMap0.set(keyInfo1.getLocation(), new l(-1, this.j - v5, 0));
                arrayList0.add(keyInfo1);
                a02 = new a0(new ArrayList(), (v1 == 0 ? 0 : this.j));
            }
            else {
                arrayList0.add(((KeyInfo)object3));
                int v6 = ((KeyInfo)object3).getLocation();
                this.j = a01.a(((KeyInfo)object3)) + v5;
                l l1 = (l)mutableIntObjectMap0.get(((KeyInfo)object3).getLocation());
                if(l1 != null) {
                    v3 = l1.a;
                }
                int v7 = a01.c;
                int v8 = v3 - v7;
                if(v3 > v7) {
                    Object[] arr_object = mutableIntObjectMap0.values;
                    long[] arr_v = mutableIntObjectMap0.metadata;
                    int v9 = arr_v.length - 2;
                    if(v9 >= 0) {
                        int v10 = 0;
                        while(true) {
                            long v11 = arr_v[v10];
                            if((~v11 << 7 & v11 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_99;
                            }
                            int v12 = 8 - (~(v10 - v9) >>> 0x1F);
                            for(int v13 = 0; v13 < v12; ++v13) {
                                if((v11 & 0xFFL) < 0x80L) {
                                    l l2 = (l)arr_object[(v10 << 3) + v13];
                                    int v14 = l2.a;
                                    if(v14 == v3) {
                                        l2.a = v7;
                                    }
                                    else if(v7 <= v14 && v14 < v3) {
                                        l2.a = v14 + 1;
                                    }
                                }
                                v11 >>= 8;
                            }
                            if(v12 == 8) {
                            label_99:
                                if(v10 == v9) {
                                    goto label_143;
                                }
                                else {
                                    ++v10;
                                    continue;
                                }
                            }
                            else {
                                goto label_143;
                            }
                            break;
                        }
                    }
                    else {
                        goto label_143;
                    }
                }
                else if(v7 > v3) {
                    Object[] arr_object1 = mutableIntObjectMap0.values;
                    long[] arr_v1 = mutableIntObjectMap0.metadata;
                    int v15 = arr_v1.length - 2;
                    if(v15 >= 0) {
                        int v16 = 0;
                        while(true) {
                            long v17 = arr_v1[v16];
                            if((~v17 << 7 & v17 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_136;
                            }
                            int v18 = 8 - (~(v16 - v15) >>> 0x1F);
                            int v19 = 0;
                            while(v19 < v18) {
                                if((v17 & 0xFFL) < 0x80L) {
                                    l l3 = (l)arr_object1[(v16 << 3) + v19];
                                    arr_object2 = arr_object1;
                                    int v20 = l3.a;
                                    if(v20 == v3) {
                                        l3.a = v7;
                                        arr_v2 = arr_v1;
                                    }
                                    else {
                                        arr_v2 = arr_v1;
                                        if(v3 + 1 <= v20 && v20 < v7) {
                                            l3.a = v20 - 1;
                                        }
                                    }
                                }
                                else {
                                    arr_object2 = arr_object1;
                                    arr_v2 = arr_v1;
                                }
                                v17 >>= 8;
                                ++v19;
                                arr_object1 = arr_object2;
                                arr_v1 = arr_v2;
                            }
                            Object[] arr_object3 = arr_object1;
                            long[] arr_v3 = arr_v1;
                            if(v18 == 8) {
                                goto label_138;
                            label_136:
                                arr_object3 = arr_object1;
                                arr_v3 = arr_v1;
                            label_138:
                                if(v16 != v15) {
                                    ++v16;
                                    arr_object1 = arr_object3;
                                    arr_v1 = arr_v3;
                                    continue;
                                }
                            }
                            goto label_143;
                        }
                    }
                    else {
                        goto label_143;
                    }
                }
                else {
                label_143:
                    ComposerChangeListWriter composerChangeListWriter0 = this.N;
                    composerChangeListWriter0.moveReaderRelativeTo(v6);
                    this.H.reposition(v6);
                    if(v8 > 0) {
                        composerChangeListWriter0.moveCurrentGroup(v8);
                    }
                }
                this.w(object1, v1 != 0);
                a02 = null;
            }
        }
        this.j(v1 != 0, a02);
    }

    @PublishedApi
    public final void updateCachedValue(@Nullable Object object0) {
        int v2;
        int v5;
        if(object0 instanceof RememberObserver) {
            if(this.getInserting()) {
                this.N.remember(((RememberObserver)object0));
            }
            this.d.add(object0);
            Anchor anchor0 = null;
            if(!this.getInserting()) {
                if(ComposerKt.isAfterFirstChild(this.H)) {
                    int v3 = this.H.getCurrentGroup() - 1;
                    for(int v4 = this.H.parent(v3); true; v4 = this.H.parent(v3)) {
                        v5 = v3;
                        v3 = v4;
                        if(v3 == this.H.getParent() || v3 < 0) {
                            break;
                        }
                    }
                    anchor0 = this.H.anchor(v5);
                }
            }
            else if(ComposerKt.isAfterFirstChild(this.J)) {
                int v = this.J.getCurrentGroup() - 1;
                for(int v1 = this.J.parent(v); true; v1 = this.J.parent(v)) {
                    v2 = v;
                    v = v1;
                    if(v == this.J.getParent() || v < 0) {
                        break;
                    }
                }
                anchor0 = this.J.anchor(v2);
            }
            object0 = new RememberObserverHolder(((RememberObserver)object0), anchor0);
        }
        this.updateValue(object0);
    }

    @Override  // androidx.compose.runtime.Composer
    public void updateRememberedValue(@Nullable Object object0) {
        this.updateCachedValue(object0);
    }

    @PublishedApi
    public final void updateValue(@Nullable Object object0) {
        if(this.getInserting()) {
            this.J.update(object0);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter0 = this.N;
        if(this.H.getHadNext()) {
            int v = this.H.getGroupSlotIndex();
            if(composerChangeListWriter0.getPastParent()) {
                composerChangeListWriter0.updateAnchoredValue(object0, this.H.anchor(this.H.getParent()), v - 1);
                return;
            }
            composerChangeListWriter0.updateValue(object0, v - 1);
            return;
        }
        composerChangeListWriter0.appendValue(this.H.anchor(this.H.getParent()), object0);
    }

    @Override  // androidx.compose.runtime.Composer
    public void useNode() {
        if(!this.r) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if(this.getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object object0 = this.H.node(this.H.getParent());
        ComposerChangeListWriter composerChangeListWriter0 = this.N;
        composerChangeListWriter0.moveDown(object0);
        if(this.y && object0 instanceof ComposeNodeLifecycleCallback) {
            composerChangeListWriter0.useNode(object0);
        }
    }

    public final void v(int v, Object object0) {
        this.u(v, object0, 0, null);
    }

    public final void verifyConsistent$runtime_release() {
        this.I.verifyWellFormed();
    }

    public final void w(Object object0, boolean z) {
        if(z) {
            this.H.startNode();
            return;
        }
        if(object0 != null && this.H.getGroupAux() != object0) {
            this.N.updateAuxData(object0);
        }
        this.H.startGroup();
    }

    public final void x() {
        this.l = 0;
        SlotTable slotTable0 = this.c;
        this.H = slotTable0.openReader();
        this.u(100, null, 0, null);
        CompositionContext compositionContext0 = this.b;
        compositionContext0.startComposing$runtime_release();
        this.u = compositionContext0.getCompositionLocalScope$runtime_release();
        this.x.push(this.w);
        this.w = this.changed(this.u);
        this.L = null;
        if(!this.p) {
            this.p = compositionContext0.getCollectingParameterInformation$runtime_release();
        }
        if(!this.C) {
            this.C = compositionContext0.getCollectingSourceInformation$runtime_release();
        }
        Set set0 = (Set)CompositionLocalMapKt.read(this.u, InspectionTablesKt.getLocalInspectionTables());
        if(set0 != null) {
            set0.add(slotTable0);
            compositionContext0.recordInspectionTable$runtime_release(set0);
        }
        this.u(compositionContext0.getCompoundHashKey$runtime_release(), null, 0, null);
    }

    public final void y(int v, int v1) {
        if(this.A(v) != v1) {
            if(v < 0) {
                MutableIntIntMap mutableIntIntMap0 = this.o;
                if(mutableIntIntMap0 == null) {
                    mutableIntIntMap0 = new MutableIntIntMap(0, 1, null);
                    this.o = mutableIntIntMap0;
                }
                mutableIntIntMap0.set(v, v1);
                return;
            }
            int[] arr_v = this.n;
            if(arr_v == null) {
                arr_v = new int[this.H.getSize()];
                ArraysKt___ArraysJvmKt.fill$default(arr_v, -1, 0, 0, 6, null);
                this.n = arr_v;
            }
            arr_v[v] = v1;
        }
    }

    public final void z(int v, int v1) {
        int v2 = this.A(v);
        if(v2 != v1) {
            Stack stack0 = this.h;
            int v3 = stack0.getSize() - 1;
            while(v != -1) {
                int v4 = this.A(v) + (v1 - v2);
                this.y(v, v4);
                for(int v5 = v3; -1 < v5; --v5) {
                    a0 a00 = (a0)stack0.peek(v5);
                    if(a00 != null && a00.b(v, v4)) {
                        v3 = v5 - 1;
                        break;
                    }
                }
                if(v < 0) {
                    v = this.H.getParent();
                }
                else {
                    if(this.H.isNode(v)) {
                        break;
                    }
                    v = this.H.parent(v);
                }
            }
        }
    }
}

