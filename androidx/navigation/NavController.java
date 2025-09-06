package androidx.navigation;

import a5.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.material3.m;
import androidx.compose.ui.platform.t1;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.serialization.RouteSerializerKt;
import j2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.collections.w;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.SerializersKt;
import md.c;
import n4.a;
import n4.f;
import n4.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00F6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00B6\u00012\u00020\u0001:\u0006\u00B6\u0001\u00B7\u0001\u00B8\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\n\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u000F\u0010\u0012\u001A\u00020\u0011H\u0017\u00A2\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0012\u001A\u00020\u00112\b\b\u0001\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0011H\u0017\u00A2\u0006\u0004\b\u0012\u0010\u0017J)\u0010\u0012\u001A\u00020\u00112\b\b\u0001\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00112\u0006\u0010\u0018\u001A\u00020\u0011H\u0017\u00A2\u0006\u0004\b\u0012\u0010\u0019J)\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0016\u001A\u00020\u00112\b\b\u0002\u0010\u0018\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u001CJ.\u0010\u0012\u001A\u00020\u0011\"\n\b\u0000\u0010\u001D\u0018\u0001*\u00020\u00012\u0006\u0010\u0016\u001A\u00020\u00112\b\b\u0002\u0010\u0018\u001A\u00020\u0011H\u0087\b\u00A2\u0006\u0004\b\u0012\u0010\u001EJ3\u0010\u0012\u001A\u00020\u0011\"\b\b\u0000\u0010\u001D*\u00020\u00012\u0006\u0010\u001B\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\u00112\b\b\u0002\u0010\u0018\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u001FJ%\u0010%\u001A\u00020\r2\u0006\u0010 \u001A\u00020\u00062\f\u0010\"\u001A\b\u0012\u0004\u0012\u00020\r0!H\u0000\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001A\u00020\u00112\u0006\u0010\u001B\u001A\u00020\u001AH\u0007\u00A2\u0006\u0004\b&\u0010\'J\u0019\u0010&\u001A\u00020\u00112\b\b\u0001\u0010\u0015\u001A\u00020\u0014H\u0007\u00A2\u0006\u0004\b&\u0010(J\u001C\u0010&\u001A\u00020\u0011\"\n\b\u0000\u0010\u001D\u0018\u0001*\u00020\u0001H\u0087\b\u00A2\u0006\u0004\b&\u0010\u0013J!\u0010&\u001A\u00020\u0011\"\b\b\u0000\u0010\u001D*\u00020\u00012\u0006\u0010\u001B\u001A\u00028\u0000H\u0007\u00A2\u0006\u0004\b&\u0010)J\u000F\u0010*\u001A\u00020\u0011H\u0017\u00A2\u0006\u0004\b*\u0010\u0013J\u000F\u0010-\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b+\u0010,J\u0015\u00101\u001A\b\u0012\u0004\u0012\u00020\u00060.H\u0000\u00A2\u0006\u0004\b/\u00100J\u0019\u00103\u001A\u00020\r2\b\b\u0001\u00102\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b3\u00104J#\u00103\u001A\u00020\r2\b\b\u0001\u00102\u001A\u00020\u00142\b\u00106\u001A\u0004\u0018\u000105H\u0017\u00A2\u0006\u0004\b3\u00107J!\u00103\u001A\u00020\r2\u0006\u00109\u001A\u0002082\b\u00106\u001A\u0004\u0018\u000105H\u0017\u00A2\u0006\u0004\b3\u0010:J\u0019\u0010=\u001A\u00020\u00112\b\u0010<\u001A\u0004\u0018\u00010;H\u0017\u00A2\u0006\u0004\b=\u0010>J\u001B\u0010@\u001A\u0004\u0018\u00010?2\b\b\u0001\u0010\u0015\u001A\u00020\u0014H\u0007\u00A2\u0006\u0004\b@\u0010AJ\'\u0010C\u001A\u0004\u0018\u00010?*\u00020?2\b\b\u0001\u0010\u0015\u001A\u00020\u00142\u0006\u0010B\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\bC\u0010DJ\u0019\u0010@\u001A\u0004\u0018\u00010?2\u0006\u0010\u001B\u001A\u00020\u001AH\u0007\u00A2\u0006\u0004\b@\u0010EJ\u0019\u0010G\u001A\u00020\r2\b\b\u0001\u0010F\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\bG\u00104J#\u0010G\u001A\u00020\r2\b\b\u0001\u0010F\u001A\u00020\u00142\b\u0010H\u001A\u0004\u0018\u000105H\u0017\u00A2\u0006\u0004\bG\u00107J-\u0010G\u001A\u00020\r2\b\b\u0001\u0010F\u001A\u00020\u00142\b\u0010H\u001A\u0004\u0018\u0001052\b\u0010J\u001A\u0004\u0018\u00010IH\u0017\u00A2\u0006\u0004\bG\u0010KJ7\u0010G\u001A\u00020\r2\b\b\u0001\u0010F\u001A\u00020\u00142\b\u0010H\u001A\u0004\u0018\u0001052\b\u0010J\u001A\u0004\u0018\u00010I2\b\u0010M\u001A\u0004\u0018\u00010LH\u0017\u00A2\u0006\u0004\bG\u0010NJ\u0017\u0010G\u001A\u00020\r2\u0006\u0010P\u001A\u00020OH\u0017\u00A2\u0006\u0004\bG\u0010QJ!\u0010G\u001A\u00020\r2\u0006\u0010P\u001A\u00020O2\b\u0010J\u001A\u0004\u0018\u00010IH\u0017\u00A2\u0006\u0004\bG\u0010RJ+\u0010G\u001A\u00020\r2\u0006\u0010P\u001A\u00020O2\b\u0010J\u001A\u0004\u0018\u00010I2\b\u0010M\u001A\u0004\u0018\u00010LH\u0017\u00A2\u0006\u0004\bG\u0010SJ\u0017\u0010G\u001A\u00020\r2\u0006\u0010U\u001A\u00020TH\u0017\u00A2\u0006\u0004\bG\u0010VJ!\u0010G\u001A\u00020\r2\u0006\u0010U\u001A\u00020T2\b\u0010J\u001A\u0004\u0018\u00010IH\u0017\u00A2\u0006\u0004\bG\u0010WJ+\u0010G\u001A\u00020\r2\u0006\u0010U\u001A\u00020T2\b\u0010J\u001A\u0004\u0018\u00010I2\b\u0010M\u001A\u0004\u0018\u00010LH\u0017\u00A2\u0006\u0004\bG\u0010XJ\u0017\u0010G\u001A\u00020\r2\u0006\u0010Z\u001A\u00020YH\u0017\u00A2\u0006\u0004\bG\u0010[J!\u0010G\u001A\u00020\r2\u0006\u0010Z\u001A\u00020Y2\b\u0010J\u001A\u0004\u0018\u00010IH\u0017\u00A2\u0006\u0004\bG\u0010\\J\u001F\u0010G\u001A\u00020\r2\u0006\u0010Z\u001A\u00020Y2\u0006\u0010M\u001A\u00020LH\u0017\u00A2\u0006\u0004\bG\u0010]J0\u0010G\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\u001A2\u0017\u0010a\u001A\u0013\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\r0^\u00A2\u0006\u0002\b`H\u0007\u00A2\u0006\u0004\bG\u0010bJ/\u0010G\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\u001A2\n\b\u0002\u0010J\u001A\u0004\u0018\u00010I2\n\b\u0002\u0010M\u001A\u0004\u0018\u00010LH\u0007\u00A2\u0006\u0004\bG\u0010cJ:\u0010G\u001A\u00020\r\"\b\b\u0000\u0010\u001D*\u00020\u00012\u0006\u0010\u001B\u001A\u00028\u00002\u0017\u0010a\u001A\u0013\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\r0^\u00A2\u0006\u0002\b`H\u0007\u00A2\u0006\u0004\bG\u0010dJ9\u0010G\u001A\u00020\r\"\b\b\u0000\u0010\u001D*\u00020\u00012\u0006\u0010\u001B\u001A\u00028\u00002\n\b\u0002\u0010J\u001A\u0004\u0018\u00010I2\n\b\u0002\u0010M\u001A\u0004\u0018\u00010LH\u0007\u00A2\u0006\u0004\bG\u0010eJ\u000F\u0010g\u001A\u00020fH\u0016\u00A2\u0006\u0004\bg\u0010hJ\u0011\u0010\u0018\u001A\u0004\u0018\u000105H\u0017\u00A2\u0006\u0004\b\u0018\u0010iJ\u0019\u0010k\u001A\u00020\r2\b\u0010j\u001A\u0004\u0018\u000105H\u0017\u00A2\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001A\u00020\r2\u0006\u0010n\u001A\u00020mH\u0017\u00A2\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001A\u00020\r2\u0006\u0010r\u001A\u00020qH\u0017\u00A2\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001A\u00020\r2\u0006\u0010u\u001A\u00020\u0011H\u0017\u00A2\u0006\u0004\bv\u0010wJ\u0017\u0010z\u001A\u00020\r2\u0006\u0010y\u001A\u00020xH\u0017\u00A2\u0006\u0004\bz\u0010{J\u0019\u0010~\u001A\u00020}2\b\b\u0001\u0010|\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b~\u0010\u007FJ\u001C\u0010\u0080\u0001\u001A\u00020\u00062\b\b\u0001\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0018\u0010\u0080\u0001\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0006\b\u0080\u0001\u0010\u0082\u0001J\u001F\u0010\u0080\u0001\u001A\u00020\u0006\"\n\b\u0000\u0010\u001D\u0018\u0001*\u00020\u0001H\u0086\b\u00A2\u0006\u0006\b\u0080\u0001\u0010\u0083\u0001J\"\u0010\u0080\u0001\u001A\u00020\u0006\"\b\b\u0000\u0010\u001D*\u00020\u00012\u0006\u0010\u001B\u001A\u00028\u0000\u00A2\u0006\u0006\b\u0080\u0001\u0010\u0084\u0001R\u001B\u0010\u0003\u001A\u00020\u00028\u0007\u00A2\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001A\u0006\b\u0087\u0001\u0010\u0088\u0001R,\u0010\u008E\u0001\u001A\u000F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060.0\u0089\u00018GX\u0087\u0004\u00A2\u0006\u0010\n\u0006\b\u008A\u0001\u0010\u008B\u0001\u001A\u0006\b\u008C\u0001\u0010\u008D\u0001R)\u0010\u0091\u0001\u001A\u000F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060.0\u0089\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u008F\u0001\u0010\u008B\u0001\u001A\u0006\b\u0090\u0001\u0010\u008D\u0001R*\u0010\u0099\u0001\u001A\u00030\u0092\u00018@@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001A\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R!\u0010\u009F\u0001\u001A\u00030\u009A\u00018VX\u0096\u0084\u0002\u00A2\u0006\u0010\n\u0006\b\u009B\u0001\u0010\u009C\u0001\u001A\u0006\b\u009D\u0001\u0010\u009E\u0001R#\u0010\u00A5\u0001\u001A\t\u0012\u0004\u0012\u00020\u00060\u00A0\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00A1\u0001\u0010\u00A2\u0001\u001A\u0006\b\u00A3\u0001\u0010\u00A4\u0001R\'\u00109\u001A\u0002082\u0006\u00109\u001A\u0002088W@WX\u0096\u000E\u00A2\u0006\u000F\u001A\u0006\b\u00A6\u0001\u0010\u00A7\u0001\"\u0005\b3\u0010\u00A8\u0001R,\u0010\u00AA\u0001\u001A\u00030\u00A9\u00012\b\u0010\u00AA\u0001\u001A\u00030\u00A9\u00018V@WX\u0096\u000E\u00A2\u0006\u0010\u001A\u0006\b\u00AB\u0001\u0010\u00AC\u0001\"\u0006\b\u00AD\u0001\u0010\u00AE\u0001R\u0019\u0010\u00B1\u0001\u001A\u0004\u0018\u00010?8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00AF\u0001\u0010\u00B0\u0001R\u0019\u0010\u00B3\u0001\u001A\u0004\u0018\u00010\u00068VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00B2\u0001\u0010\u0083\u0001R\u0019\u0010\u00B5\u0001\u001A\u0004\u0018\u00010\u00068VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00B4\u0001\u0010\u0083\u0001\u00A8\u0006\u00B9\u0001"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavBackStackEntry;", "child", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "unlinkChildFromParent", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "listener", "", "addOnDestinationChangedListener", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "removeOnDestinationChangedListener", "", "popBackStack", "()Z", "", "destinationId", "inclusive", "(IZ)Z", "saveState", "(IZZ)Z", "", "route", "(Ljava/lang/String;ZZ)Z", "T", "(ZZ)Z", "(Ljava/lang/Object;ZZ)Z", "popUpTo", "Lkotlin/Function0;", "onComplete", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lkotlin/jvm/functions/Function0;)V", "popBackStackFromNavigator", "clearBackStack", "(Ljava/lang/String;)Z", "(I)Z", "(Ljava/lang/Object;)Z", "navigateUp", "updateBackStackLifecycle$navigation_runtime_release", "()V", "updateBackStackLifecycle", "", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "populateVisibleEntries", "graphResId", "setGraph", "(I)V", "Landroid/os/Bundle;", "startDestinationArgs", "(ILandroid/os/Bundle;)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "handleDeepLink", "(Landroid/content/Intent;)Z", "Landroidx/navigation/NavDestination;", "findDestination", "(I)Landroidx/navigation/NavDestination;", "searchChildren", "findDestinationComprehensive", "(Landroidx/navigation/NavDestination;IZ)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "resId", "navigate", "args", "Landroidx/navigation/NavOptions;", "navOptions", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroid/net/Uri;", "deepLink", "(Landroid/net/Uri;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkRequest;", "request", "(Landroidx/navigation/NavDeepLinkRequest;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavDirections;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/Navigator$Extras;)V", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "builder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkBuilder;", "createDeepLink", "()Landroidx/navigation/NavDeepLinkBuilder;", "()Landroid/os/Bundle;", "navState", "restoreState", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "(Landroidx/activity/OnBackPressedDispatcher;)V", "enabled", "enableOnBackPressed", "(Z)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "navGraphId", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "(I)Landroidx/lifecycle/ViewModelStoreOwner;", "getBackStackEntry", "(I)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", "()Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/Object;)Landroidx/navigation/NavBackStackEntry;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lkotlinx/coroutines/flow/StateFlow;", "i", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "currentBackStack", "k", "getVisibleEntries", "visibleEntries", "Landroidx/lifecycle/Lifecycle$State;", "t", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "hostLifecycleState", "Landroidx/navigation/NavInflater;", "E", "Lkotlin/Lazy;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "Lkotlinx/coroutines/flow/Flow;", "G", "Lkotlinx/coroutines/flow/Flow;", "getCurrentBackStackEntryFlow", "()Lkotlinx/coroutines/flow/Flow;", "currentBackStackEntryFlow", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "currentBackStackEntry", "getPreviousBackStackEntry", "previousBackStackEntry", "Companion", "androidx/navigation/a", "OnDestinationChangedListener", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2821:1\n531#1,10:2968\n179#2,2:2822\n1313#2,2:2832\n1313#2,2:2834\n179#2,2:2966\n1#3:2824\n146#4:2825\n533#5,6:2826\n1855#5,2:2836\n1855#5,2:2838\n1855#5,2:2840\n1855#5,2:2842\n1864#5,3:2844\n1774#5,4:2847\n1855#5:2851\n766#5:2852\n857#5,2:2853\n1856#5:2855\n766#5:2856\n857#5,2:2857\n766#5:2859\n857#5,2:2860\n1855#5,2:2862\n1855#5:2864\n1789#5,3:2865\n1856#5:2868\n819#5:2876\n847#5,2:2877\n1855#5:2879\n1856#5:2887\n1238#5,4:2890\n1855#5,2:2894\n1855#5,2:2896\n378#5,7:2898\n1855#5,2:2905\n1855#5,2:2907\n819#5:2909\n847#5,2:2910\n1855#5,2:2912\n1855#5,2:2914\n533#5,6:2916\n533#5,6:2922\n533#5,6:2928\n1855#5,2:2934\n1855#5,2:2936\n1864#5,3:2940\n1855#5,2:2946\n533#5,6:2948\n533#5,6:2954\n533#5,6:2960\n372#6,7:2869\n372#6,7:2880\n453#6:2888\n403#6:2889\n29#7:2938\n29#7:2939\n13404#8,3:2943\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n-1#1:2968,10\n83#1:2822,2\n718#1:2832,2\n739#1:2834,2\n2704#1:2966,2\n166#1:2825\n656#1:2826,6\n896#1:2836,2\n899#1:2838,2\n905#1:2840,2\n907#1:2842,2\n986#1:2844,3\n1042#1:2847,4\n1186#1:2851\n1188#1:2852\n1188#1:2853,2\n1186#1:2855\n1196#1:2856\n1196#1:2857,2\n1199#1:2859\n1199#1:2860,2\n1265#1:2862,2\n1279#1:2864\n1283#1:2865,3\n1279#1:2868\n1342#1:2876\n1342#1:2877,2\n1343#1:2879\n1343#1:2887\n1641#1:2890,4\n1914#1:2894,2\n1977#1:2896,2\n1993#1:2898,7\n2005#1:2905,2\n2015#1:2907,2\n2082#1:2909\n2082#1:2910,2\n2086#1:2912,2\n2130#1:2914,2\n2172#1:2916,6\n2202#1:2922,6\n2231#1:2928,6\n2245#1:2934,2\n2261#1:2936,2\n2457#1:2940,3\n2498#1:2946,2\n2598#1:2948,6\n2619#1:2954,6\n2645#1:2960,6\n1329#1:2869,7\n1345#1:2880,7\n1641#1:2888\n1641#1:2889\n2337#1:2938\n2384#1:2939\n2495#1:2943,3\n*E\n"})
public class NavController {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001A\u0010\b\u001A\u00020\u00078\u0006X\u0087T¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000E\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000E\u0010\tR\u0014\u0010\u000F\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\tR\u0014\u0010\u0010\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001A\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001A\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001A\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0016\u0010\u0018\u001A\u00020\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/navigation/NavController$Companion;", "", "", "saveState", "", "enableDeepLinkSaveState", "(Z)V", "", "KEY_DEEP_LINK_EXTRAS", "Ljava/lang/String;", "getKEY_DEEP_LINK_EXTRAS$annotations", "()V", "KEY_BACK_STACK", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "deepLinkSaveState", "Z", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NavDeepLinkSaveStateControl
        @JvmStatic
        public final void enableDeepLinkSaveState(boolean z) {
            NavController.H = z;
        }

        public static void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface OnDestinationChangedListener {
        void onDestinationChanged(@NotNull NavController arg1, @NotNull NavDestination arg2, @Nullable Bundle arg3);
    }

    public f A;
    public final LinkedHashMap B;
    public int C;
    @NotNull
    public static final Companion Companion = null;
    public final ArrayList D;
    public final Lazy E;
    public final MutableSharedFlow F;
    public final SharedFlow G;
    public static boolean H = false;
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    @NotNull
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    public final Context a;
    public final Activity b;
    public NavGraph c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final ArrayDeque g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public final LinkedHashMap o;
    public LifecycleOwner p;
    public OnBackPressedDispatcher q;
    public NavControllerViewModel r;
    public final CopyOnWriteArrayList s;
    public State t;
    public final t1 u;
    public final androidx.navigation.NavController.onBackPressedCallback.1 v;
    public boolean w;
    public NavigatorProvider x;
    public final LinkedHashMap y;
    public Lambda z;

    static {
        NavController.Companion = new Companion(null);
        NavController.H = true;
    }

    public NavController(@NotNull Context context0) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = context0;
        for(Object object1: SequencesKt__SequencesKt.generateSequence(context0, a.y)) {
            if(((Context)object1) instanceof Activity) {
                object0 = object1;
                break;
            }
        }
        this.b = (Activity)object0;
        this.g = new ArrayDeque();
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.h = mutableStateFlow0;
        this.i = FlowKt.asStateFlow(mutableStateFlow0);
        MutableStateFlow mutableStateFlow1 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.j = mutableStateFlow1;
        this.k = FlowKt.asStateFlow(mutableStateFlow1);
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.o = new LinkedHashMap();
        this.s = new CopyOnWriteArrayList();
        this.t = State.INITIALIZED;
        this.u = new t1(this, 3);
        this.v = new OnBackPressedCallback() {
            public final NavController a;

            {
                this.a = navController0;
                super(false);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.a.popBackStack();
            }
        };
        this.w = true;
        this.x = new NavigatorProvider();
        this.y = new LinkedHashMap();
        this.B = new LinkedHashMap();
        this.x.addNavigator(new NavGraphNavigator(this.x));
        this.x.addNavigator(new ActivityNavigator(this.a));
        this.D = new ArrayList();
        this.E = c.lazy(new j(this, 27));
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.F = mutableSharedFlow0;
        this.G = FlowKt.asSharedFlow(mutableSharedFlow0);
    }

    public final void a(NavDestination navDestination0, Bundle bundle0, NavBackStackEntry navBackStackEntry0, List list0) {
        Object object2;
        NavGraph navGraph2;
        ArrayDeque arrayDeque2;
        NavGraph navGraph1;
        Object object1;
        NavDestination navDestination1 = navBackStackEntry0.getDestination();
        ArrayDeque arrayDeque0 = this.g;
        if(!(navDestination1 instanceof FloatingWindow)) {
            while(!arrayDeque0.isEmpty() && ((NavBackStackEntry)arrayDeque0.last()).getDestination() instanceof FloatingWindow && this.l(((NavBackStackEntry)arrayDeque0.last()).getDestination().getId(), true, false)) {
            }
        }
        ArrayDeque arrayDeque1 = new ArrayDeque();
        Object object0 = null;
        if(navDestination0 instanceof NavGraph) {
            NavDestination navDestination2 = navDestination1;
            while(true) {
                Intrinsics.checkNotNull(navDestination2);
                NavGraph navGraph0 = navDestination2.getParent();
                if(navGraph0 == null) {
                    navGraph2 = null;
                    arrayDeque2 = arrayDeque1;
                }
                else {
                    ListIterator listIterator0 = list0.listIterator(list0.size());
                    while(listIterator0.hasPrevious()) {
                        object1 = listIterator0.previous();
                        if(!Intrinsics.areEqual(((NavBackStackEntry)object1).getDestination(), navGraph0)) {
                            continue;
                        }
                        goto label_18;
                    }
                    object1 = null;
                label_18:
                    NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)object1;
                    if(navBackStackEntry1 == null) {
                        State lifecycle$State0 = this.getHostLifecycleState$navigation_runtime_release();
                        navGraph1 = navGraph0;
                        navBackStackEntry1 = androidx.navigation.NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.a, navGraph0, bundle0, lifecycle$State0, this.r, null, null, 0x60, null);
                    }
                    else {
                        navGraph1 = navGraph0;
                    }
                    arrayDeque2 = arrayDeque1;
                    arrayDeque2.addFirst(navBackStackEntry1);
                    if(arrayDeque0.isEmpty()) {
                        navGraph2 = navGraph1;
                    }
                    else {
                        navGraph2 = navGraph1;
                        if(((NavBackStackEntry)arrayDeque0.last()).getDestination() == navGraph2) {
                            NavController.o(this, ((NavBackStackEntry)arrayDeque0.last()));
                        }
                    }
                }
                if(navGraph2 == null || navGraph2 == navDestination0) {
                    break;
                }
                arrayDeque1 = arrayDeque2;
                navDestination2 = navGraph2;
            }
        }
        else {
            arrayDeque2 = arrayDeque1;
        }
        NavDestination navDestination3 = arrayDeque2.isEmpty() ? navDestination1 : ((NavBackStackEntry)arrayDeque2.first()).getDestination();
        while(navDestination3 != null && this.findDestination(navDestination3.getId()) != navDestination3) {
            navDestination3 = navDestination3.getParent();
            if(navDestination3 != null) {
                Bundle bundle1 = bundle0 == null || !bundle0.isEmpty() ? bundle0 : null;
                ListIterator listIterator1 = list0.listIterator(list0.size());
                while(listIterator1.hasPrevious()) {
                    object2 = listIterator1.previous();
                    if(!Intrinsics.areEqual(((NavBackStackEntry)object2).getDestination(), navDestination3)) {
                        continue;
                    }
                    goto label_53;
                }
                object2 = null;
            label_53:
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry)object2;
                if(navBackStackEntry2 == null) {
                    Bundle bundle2 = navDestination3.addInDefaultArgs(bundle1);
                    State lifecycle$State1 = this.getHostLifecycleState$navigation_runtime_release();
                    navBackStackEntry2 = androidx.navigation.NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.a, navDestination3, bundle2, lifecycle$State1, this.r, null, null, 0x60, null);
                }
                arrayDeque2.addFirst(navBackStackEntry2);
            }
        }
        NavDestination navDestination4 = arrayDeque2.isEmpty() ? navDestination1 : ((NavBackStackEntry)arrayDeque2.first()).getDestination();
        while(!arrayDeque0.isEmpty() && ((NavBackStackEntry)arrayDeque0.last()).getDestination() instanceof NavGraph) {
            NavDestination navDestination5 = ((NavBackStackEntry)arrayDeque0.last()).getDestination();
            Intrinsics.checkNotNull(navDestination5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if(((NavGraph)navDestination5).getNodes().get(navDestination4.getId()) != null) {
                break;
            }
            NavController.o(this, ((NavBackStackEntry)arrayDeque0.last()));
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry)arrayDeque0.firstOrNull();
        if(navBackStackEntry3 == null) {
            navBackStackEntry3 = (NavBackStackEntry)arrayDeque2.firstOrNull();
        }
        if(!Intrinsics.areEqual((navBackStackEntry3 == null ? null : navBackStackEntry3.getDestination()), this.c)) {
            ListIterator listIterator2 = list0.listIterator(list0.size());
            while(listIterator2.hasPrevious()) {
                Object object3 = listIterator2.previous();
                NavGraph navGraph3 = this.c;
                Intrinsics.checkNotNull(navGraph3);
                if(Intrinsics.areEqual(((NavBackStackEntry)object3).getDestination(), navGraph3)) {
                    object0 = object3;
                    break;
                }
                if(false) {
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry)object0;
            if(navBackStackEntry4 == null) {
                NavGraph navGraph4 = this.c;
                Intrinsics.checkNotNull(navGraph4);
                NavGraph navGraph5 = this.c;
                Intrinsics.checkNotNull(navGraph5);
                Bundle bundle3 = navGraph5.addInDefaultArgs(bundle0);
                State lifecycle$State2 = this.getHostLifecycleState$navigation_runtime_release();
                navBackStackEntry4 = androidx.navigation.NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.a, navGraph4, bundle3, lifecycle$State2, this.r, null, null, 0x60, null);
            }
            arrayDeque2.addFirst(navBackStackEntry4);
        }
        for(Object object4: arrayDeque2) {
            Navigator navigator0 = this.x.getNavigator(((NavBackStackEntry)object4).getDestination().getNavigatorName());
            Object object5 = this.y.get(navigator0);
            if(object5 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination0.getNavigatorName() + " should already be created").toString());
            }
            ((androidx.navigation.a)object5).b(((NavBackStackEntry)object4));
        }
        arrayDeque0.addAll(arrayDeque2);
        arrayDeque0.add(navBackStackEntry0);
        for(Object object6: CollectionsKt___CollectionsKt.plus(arrayDeque2, navBackStackEntry0)) {
            NavBackStackEntry navBackStackEntry5 = (NavBackStackEntry)object6;
            NavGraph navGraph6 = navBackStackEntry5.getDestination().getParent();
            if(navGraph6 != null) {
                this.j(navBackStackEntry5, this.getBackStackEntry(navGraph6.getId()));
            }
        }
    }

    public static final boolean access$getDeepLinkSaveState$cp() [...] // 潜在的解密器

    public static final NavInflater access$getInflater$p(NavController navController0) {
        navController0.getClass();
        return null;
    }

    public void addOnDestinationChangedListener(@NotNull OnDestinationChangedListener navController$OnDestinationChangedListener0) {
        Intrinsics.checkNotNullParameter(navController$OnDestinationChangedListener0, "listener");
        this.s.add(navController$OnDestinationChangedListener0);
        ArrayDeque arrayDeque0 = this.g;
        if(!arrayDeque0.isEmpty()) {
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)arrayDeque0.last();
            navController$OnDestinationChangedListener0.onDestinationChanged(this, navBackStackEntry0.getDestination(), navBackStackEntry0.getArguments());
        }
    }

    public final boolean b(int v) {
        LinkedHashMap linkedHashMap0 = this.y;
        for(Object object0: linkedHashMap0.values()) {
            ((androidx.navigation.a)object0).setNavigating(true);
        }
        boolean z = this.p(v, null, NavOptionsBuilderKt.navOptions(a.z), null);
        for(Object object1: linkedHashMap0.values()) {
            ((androidx.navigation.a)object1).setNavigating(false);
        }
        return z && this.l(v, true, false);
    }

    public final boolean c(String s) {
        Bundle bundle0;
        boolean z;
        LinkedHashMap linkedHashMap0 = this.y;
        for(Object object0: linkedHashMap0.values()) {
            ((androidx.navigation.a)object0).setNavigating(true);
        }
        int v = NavDestination.Companion.createRoute(s).hashCode();
        LinkedHashMap linkedHashMap1 = this.n;
        if(linkedHashMap1.containsKey(v)) {
            z = this.p(v, null, null, null);
            goto label_27;
        }
        NavDestination navDestination0 = this.findDestination(s);
        if(navDestination0 != null) {
            String s1 = (String)linkedHashMap1.get(navDestination0.getId());
            o.removeAll(linkedHashMap1.values(), new m(s1, 14));
            ArrayDeque arrayDeque0 = (ArrayDeque)TypeIntrinsics.asMutableMap(this.o).remove(s1);
            DeepLinkMatch navDestination$DeepLinkMatch0 = navDestination0.matchDeepLink(s);
            Intrinsics.checkNotNull(navDestination$DeepLinkMatch0);
            if(arrayDeque0 == null) {
                bundle0 = null;
            }
            else {
                NavBackStackEntryState navBackStackEntryState0 = (NavBackStackEntryState)arrayDeque0.firstOrNull();
                bundle0 = navBackStackEntryState0 == null ? null : navBackStackEntryState0.getArgs();
            }
            z = navDestination$DeepLinkMatch0.hasMatchingArgs(bundle0) ? this.f(this.i(arrayDeque0), null, null, null) : false;
        label_27:
            for(Object object1: linkedHashMap0.values()) {
                ((androidx.navigation.a)object1).setNavigating(false);
            }
            return z && this.m(s, true, false);
        }
        StringBuilder stringBuilder0 = b.v("Restore State failed: route ", s, " cannot be found from the current destination ");
        stringBuilder0.append(this.getCurrentDestination());
        throw new IllegalStateException(stringBuilder0.toString().toString());
    }

    @MainThread
    public final boolean clearBackStack() {
        Intrinsics.reifiedOperationMarker(6, "T");
        return this.clearBackStack(RouteSerializerKt.generateHashCode(SerializersKt.serializer(null)));
    }

    // 去混淆评级： 低(20)
    @MainThread
    public final boolean clearBackStack(@IdRes int v) {
        return this.b(v) && this.d();
    }

    @MainThread
    public final boolean clearBackStack(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "route");
        return this.c(this.g(object0)) && this.d();
    }

    @MainThread
    public final boolean clearBackStack(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "route");
        return this.c(s) && this.d();
    }

    @NotNull
    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    public final boolean d() {
        ArrayDeque arrayDeque0;
        while(true) {
            arrayDeque0 = this.g;
            if(arrayDeque0.isEmpty() || !(((NavBackStackEntry)arrayDeque0.last()).getDestination() instanceof NavGraph)) {
                break;
            }
            NavController.o(this, ((NavBackStackEntry)arrayDeque0.last()));
        }
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)arrayDeque0.lastOrNull();
        ArrayList arrayList0 = this.D;
        if(navBackStackEntry0 != null) {
            arrayList0.add(navBackStackEntry0);
        }
        ++this.C;
        this.updateBackStackLifecycle$navigation_runtime_release();
        int v = this.C - 1;
        this.C = v;
        if(v == 0) {
            List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
            arrayList0.clear();
            for(Object object0: list0) {
                NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)object0;
                for(Object object1: this.s) {
                    ((OnDestinationChangedListener)object1).onDestinationChanged(this, navBackStackEntry1.getDestination(), navBackStackEntry1.getArguments());
                }
                this.F.tryEmit(navBackStackEntry1);
            }
            List list1 = CollectionsKt___CollectionsKt.toMutableList(arrayDeque0);
            this.h.tryEmit(list1);
            List list2 = this.populateVisibleEntries$navigation_runtime_release();
            this.j.tryEmit(list2);
        }
        return navBackStackEntry0 != null;
    }

    public final boolean e(ArrayList arrayList0, NavDestination navDestination0, boolean z, boolean z1) {
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        ArrayDeque arrayDeque0 = new ArrayDeque();
        for(Object object0: arrayList0) {
            BooleanRef ref$BooleanRef1 = new BooleanRef();
            Object object1 = this.g.last();
            this.A = new f(ref$BooleanRef1, ref$BooleanRef0, this, z1, arrayDeque0);
            ((Navigator)object0).popBackStack(((NavBackStackEntry)object1), z1);
            this.A = null;
            if(!ref$BooleanRef1.element) {
                break;
            }
        }
        if(z1) {
            LinkedHashMap linkedHashMap0 = this.n;
            if(!z) {
                for(Object object2: SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(navDestination0, a.A), new g(this, 0))) {
                    NavBackStackEntryState navBackStackEntryState0 = (NavBackStackEntryState)arrayDeque0.firstOrNull();
                    linkedHashMap0.put(((NavDestination)object2).getId(), (navBackStackEntryState0 == null ? null : navBackStackEntryState0.getId()));
                }
            }
            if(!arrayDeque0.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState1 = (NavBackStackEntryState)arrayDeque0.first();
                for(Object object3: SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(this.findDestination(navBackStackEntryState1.getDestinationId()), a.B), new g(this, 1))) {
                    linkedHashMap0.put(((NavDestination)object3).getId(), navBackStackEntryState1.getId());
                }
                if(linkedHashMap0.values().contains(navBackStackEntryState1.getId())) {
                    this.o.put(navBackStackEntryState1.getId(), arrayDeque0);
                }
            }
        }
        this.q();
        return ref$BooleanRef0.element;
    }

    @NavDeepLinkSaveStateControl
    @JvmStatic
    public static final void enableDeepLinkSaveState(boolean z) {
        NavController.Companion.enableDeepLinkSaveState(z);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z) {
        this.w = z;
        this.q();
    }

    public final boolean f(ArrayList arrayList0, Bundle bundle0, NavOptions navOptions0, Extras navigator$Extras0) {
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(Object object0: arrayList0) {
            if(!(((NavBackStackEntry)object0).getDestination() instanceof NavGraph)) {
                arrayList2.add(object0);
            }
        }
        Iterator iterator1 = arrayList2.iterator();
        while(true) {
            String s = null;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object1;
            List list0 = (List)CollectionsKt___CollectionsKt.lastOrNull(arrayList1);
            if(list0 != null) {
                NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)CollectionsKt___CollectionsKt.last(list0);
                if(navBackStackEntry1 != null) {
                    NavDestination navDestination0 = navBackStackEntry1.getDestination();
                    if(navDestination0 != null) {
                        s = navDestination0.getNavigatorName();
                    }
                }
            }
            if(Intrinsics.areEqual(s, navBackStackEntry0.getDestination().getNavigatorName())) {
                list0.add(navBackStackEntry0);
            }
            else {
                arrayList1.add(CollectionsKt__CollectionsKt.mutableListOf(new NavBackStackEntry[]{navBackStackEntry0}));
            }
        }
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        for(Object object2: arrayList1) {
            Navigator navigator0 = this.x.getNavigator(((NavBackStackEntry)CollectionsKt___CollectionsKt.first(((List)object2))).getDestination().getNavigatorName());
            this.z = new androidx.navigation.b(ref$BooleanRef0, arrayList0, new IntRef(), this, bundle0);
            navigator0.navigate(((List)object2), navOptions0, navigator$Extras0);
            this.z = null;
        }
        return ref$BooleanRef0.element;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestination(@IdRes int v) {
        NavDestination navDestination0;
        NavGraph navGraph0 = this.c;
        if(navGraph0 == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph0);
        if(navGraph0.getId() == v) {
            return this.c;
        }
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.g.lastOrNull();
        if(navBackStackEntry0 == null) {
            navDestination0 = this.c;
            Intrinsics.checkNotNull(navDestination0);
        }
        else {
            navDestination0 = navBackStackEntry0.getDestination();
            if(navDestination0 == null) {
                navDestination0 = this.c;
                Intrinsics.checkNotNull(navDestination0);
                return this.findDestinationComprehensive(navDestination0, v, false);
            }
        }
        return this.findDestinationComprehensive(navDestination0, v, false);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestination(@NotNull String s) {
        NavDestination navDestination0;
        Intrinsics.checkNotNullParameter(s, "route");
        NavGraph navGraph0 = this.c;
        if(navGraph0 == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph0);
        if(!Intrinsics.areEqual(navGraph0.getRoute(), s)) {
            NavGraph navGraph1 = this.c;
            Intrinsics.checkNotNull(navGraph1);
            if(navGraph1.matchDeepLink(s) == null) {
                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.g.lastOrNull();
                if(navBackStackEntry0 == null) {
                    navDestination0 = this.c;
                    Intrinsics.checkNotNull(navDestination0);
                }
                else {
                    navDestination0 = navBackStackEntry0.getDestination();
                    if(navDestination0 == null) {
                        navDestination0 = this.c;
                        Intrinsics.checkNotNull(navDestination0);
                    }
                }
                if(navDestination0 instanceof NavGraph) {
                    return ((NavGraph)navDestination0).findNode(s);
                }
                NavGraph navGraph2 = navDestination0.getParent();
                Intrinsics.checkNotNull(navGraph2);
                return navGraph2.findNode(s);
            }
        }
        return this.c;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestinationComprehensive(@NotNull NavDestination navDestination0, @IdRes int v, boolean z) {
        Intrinsics.checkNotNullParameter(navDestination0, "<this>");
        if(navDestination0.getId() == v) {
            return navDestination0;
        }
        if(navDestination0 instanceof NavGraph) {
            return ((NavGraph)navDestination0).findNodeComprehensive(v, ((NavGraph)navDestination0), z);
        }
        NavGraph navGraph0 = navDestination0.getParent();
        Intrinsics.checkNotNull(navGraph0);
        return navGraph0.findNodeComprehensive(v, navGraph0, z);
    }

    public final String g(Object object0) {
        int v = RouteSerializerKt.generateHashCode(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(object0.getClass())));
        NavDestination navDestination0 = this.findDestinationComprehensive(this.getGraph(), v, true);
        if(navDestination0 == null) {
            throw new IllegalArgumentException(("Destination with route " + Reflection.getOrCreateKotlinClass(object0.getClass()).getSimpleName() + " cannot be found in navigation graph " + this.c).toString());
        }
        Map map0 = navDestination0.getArguments();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(w.mapCapacity(map0.size()));
        for(Object object1: map0.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object1).getKey(), ((NavArgument)((Map.Entry)object1).getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(object0, linkedHashMap0);
    }

    public final NavBackStackEntry getBackStackEntry() {
        Intrinsics.reifiedOperationMarker(6, "T");
        Object object0 = null;
        int v = RouteSerializerKt.generateHashCode(SerializersKt.serializer(null));
        NavDestination navDestination0 = this.findDestinationComprehensive(this.getGraph(), v, true);
        Class class0 = Object.class;
        if(navDestination0 != null) {
            List list0 = (List)this.getCurrentBackStack().getValue();
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                Object object1 = listIterator0.previous();
                if(((NavBackStackEntry)object1).getDestination().getId() == v) {
                    object0 = object1;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(((NavBackStackEntry)object0) != null) {
                return (NavBackStackEntry)object0;
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalArgumentException(("No destination with route " + Reflection.getOrCreateKotlinClass(class0).getSimpleName() + " is on the NavController\'s back stack. The current destination is " + this.getCurrentDestination()).toString());
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        throw new IllegalArgumentException(("Destination with route " + Reflection.getOrCreateKotlinClass(class0).getSimpleName() + " cannot be found in navigation graph " + this.getGraph()).toString());
    }

    @NotNull
    public NavBackStackEntry getBackStackEntry(@IdRes int v) {
        Object object0 = null;
        ListIterator listIterator0 = this.g.listIterator(this.g.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((NavBackStackEntry)object1).getDestination().getId() == v) {
                object0 = object1;
                break;
            }
        }
        if(((NavBackStackEntry)object0) != null) {
            return (NavBackStackEntry)object0;
        }
        StringBuilder stringBuilder0 = b.s(v, "No destination with ID ", " is on the NavController\'s back stack. The current destination is ");
        stringBuilder0.append(this.getCurrentDestination());
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @NotNull
    public final NavBackStackEntry getBackStackEntry(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "route");
        return this.getBackStackEntry(this.g(object0));
    }

    @NotNull
    public final NavBackStackEntry getBackStackEntry(@NotNull String s) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(s, "route");
        ListIterator listIterator0 = this.g.listIterator(this.g.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((NavBackStackEntry)object1).getDestination().hasRoute(s, ((NavBackStackEntry)object1).getArguments())) {
                object0 = object1;
                break;
            }
        }
        if(((NavBackStackEntry)object0) != null) {
            return (NavBackStackEntry)object0;
        }
        StringBuilder stringBuilder0 = b.v("No destination with route ", s, " is on the NavController\'s back stack. The current destination is ");
        stringBuilder0.append(this.getCurrentDestination());
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final StateFlow getCurrentBackStack() {
        return this.i;
    }

    @Nullable
    public NavBackStackEntry getCurrentBackStackEntry() {
        return (NavBackStackEntry)this.g.lastOrNull();
    }

    @NotNull
    public final Flow getCurrentBackStackEntryFlow() {
        return this.G;
    }

    @Nullable
    public NavDestination getCurrentDestination() {
        NavBackStackEntry navBackStackEntry0 = this.getCurrentBackStackEntry();
        return navBackStackEntry0 == null ? null : navBackStackEntry0.getDestination();
    }

    @MainThread
    @NotNull
    public NavGraph getGraph() {
        NavGraph navGraph0 = this.c;
        if(navGraph0 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.checkNotNull(navGraph0, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph0;
    }

    @NotNull
    public final State getHostLifecycleState$navigation_runtime_release() {
        return this.p == null ? State.CREATED : this.t;
    }

    @NotNull
    public NavInflater getNavInflater() {
        return (NavInflater)this.E.getValue();
    }

    @NotNull
    public NavigatorProvider getNavigatorProvider() {
        return this.x;
    }

    @Nullable
    public NavBackStackEntry getPreviousBackStackEntry() {
        Iterator iterator0 = CollectionsKt___CollectionsKt.reversed(this.g).iterator();
        if(iterator0.hasNext()) {
            iterator0.next();
        }
        for(Object object0: SequencesKt__SequencesKt.asSequence(iterator0)) {
            if(!(((NavBackStackEntry)object0).getDestination() instanceof NavGraph)) {
                return (NavBackStackEntry)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NotNull
    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int v) {
        if(this.r == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        ViewModelStoreOwner viewModelStoreOwner0 = this.getBackStackEntry(v);
        if(!(((NavBackStackEntry)viewModelStoreOwner0).getDestination() instanceof NavGraph)) {
            throw new IllegalArgumentException(("No NavGraph with ID " + v + " is on the NavController\'s back stack").toString());
        }
        return viewModelStoreOwner0;
    }

    @NotNull
    public final StateFlow getVisibleEntries() {
        return this.k;
    }

    public final int h() {
        int v = 0;
        ArrayDeque arrayDeque0 = this.g;
        if(arrayDeque0 == null || !arrayDeque0.isEmpty()) {
            for(Object object0: arrayDeque0) {
                if(!(((NavBackStackEntry)object0).getDestination() instanceof NavGraph)) {
                    ++v;
                    if(v < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        return v;
    }

    @MainThread
    public boolean handleDeepLink(@Nullable Intent intent0) {
        NavDestination navDestination3;
        NavDestination navDestination1;
        Context context0;
        String s;
        int[] arr_v;
        int v = 0;
        if(intent0 == null) {
            return false;
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            arr_v = null;
        }
        else {
            try {
                arr_v = bundle0.getIntArray("android-support-nav:controller:deepLinkIds");
            }
            catch(Exception exception0) {
                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent0, exception0);
                arr_v = null;
            }
        }
        ArrayList arrayList0 = bundle0 == null ? null : bundle0.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = bundle0 == null ? null : bundle0.getBundle("android-support-nav:controller:deepLinkExtras");
        if(bundle2 != null) {
            bundle1.putAll(bundle2);
        }
        if(arr_v == null || arr_v.length == 0) {
            NavGraph navGraph0 = this.c;
            Intrinsics.checkNotNull(navGraph0);
            DeepLinkMatch navDestination$DeepLinkMatch0 = navGraph0.matchDeepLink(new NavDeepLinkRequest(intent0));
            if(navDestination$DeepLinkMatch0 != null) {
                NavDestination navDestination0 = navDestination$DeepLinkMatch0.getDestination();
                int[] arr_v1 = NavDestination.buildDeepLinkIds$default(navDestination0, null, 1, null);
                Bundle bundle3 = navDestination0.addInDefaultArgs(navDestination$DeepLinkMatch0.getMatchingArgs());
                if(bundle3 != null) {
                    bundle1.putAll(bundle3);
                }
                arr_v = arr_v1;
                arrayList0 = null;
            }
        }
        if(arr_v != null && arr_v.length != 0) {
            NavGraph navGraph1 = this.c;
            for(int v1 = 0; true; ++v1) {
                s = null;
                context0 = this.a;
                if(v1 >= arr_v.length) {
                    break;
                }
                int v2 = arr_v[v1];
                if(v1 == 0) {
                    NavGraph navGraph2 = this.c;
                    Intrinsics.checkNotNull(navGraph2);
                    navDestination1 = navGraph2.getId() == v2 ? this.c : null;
                }
                else {
                    Intrinsics.checkNotNull(navGraph1);
                    navDestination1 = navGraph1.findNode(v2);
                }
                if(navDestination1 == null) {
                    s = NavDestination.Companion.getDisplayName(context0, v2);
                    break;
                }
                if(v1 != arr_v.length - 1 && navDestination1 instanceof NavGraph) {
                    NavGraph navGraph3;
                    for(navGraph3 = (NavGraph)navDestination1; true; navGraph3 = (NavGraph)navGraph3.findNode(navGraph3.getStartDestinationId())) {
                        Intrinsics.checkNotNull(navGraph3);
                        if(!(navGraph3.findNode(navGraph3.getStartDestinationId()) instanceof NavGraph)) {
                            break;
                        }
                    }
                    navGraph1 = navGraph3;
                }
            }
            if(s != null) {
                Log.i("NavController", "Could not find destination " + s + " in the navigation graph, ignoring the deep link from " + intent0);
                return false;
            }
            bundle1.putParcelable("android-support-nav:controller:deepLinkIntent", intent0);
            Bundle[] arr_bundle = new Bundle[arr_v.length];
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                Bundle bundle4 = new Bundle();
                bundle4.putAll(bundle1);
                if(arrayList0 != null) {
                    Bundle bundle5 = (Bundle)arrayList0.get(v3);
                    if(bundle5 != null) {
                        bundle4.putAll(bundle5);
                    }
                }
                arr_bundle[v3] = bundle4;
            }
            int v4 = intent0.getFlags();
            if((0x10000000 & v4) != 0 && (v4 & 0x8000) == 0) {
                intent0.addFlags(0x8000);
                TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.create(context0).addNextIntentWithParentStack(intent0);
                Intrinsics.checkNotNullExpressionValue(taskStackBuilder0, "create(context).addNextI…ntWithParentStack(intent)");
                taskStackBuilder0.startActivities();
                Activity activity0 = this.b;
                if(activity0 != null) {
                    activity0.finish();
                    activity0.overridePendingTransition(0, 0);
                }
                return true;
            }
            if((0x10000000 & v4) != 0) {
                if(!this.g.isEmpty()) {
                    NavGraph navGraph4 = this.c;
                    Intrinsics.checkNotNull(navGraph4);
                    this.l(navGraph4.getId(), true, false);
                }
                while(v < arr_v.length) {
                    int v5 = arr_v[v];
                    Bundle bundle6 = arr_bundle[v];
                    NavDestination navDestination2 = this.findDestination(v5);
                    if(navDestination2 != null) {
                        this.k(navDestination2, bundle6, NavOptionsBuilderKt.navOptions(new androidx.navigation.c(navDestination2, this)), null);
                        ++v;
                        continue;
                    }
                    StringBuilder stringBuilder0 = b.v("Deep Linking failed: destination ", NavDestination.Companion.getDisplayName(context0, v5), " cannot be found from the current destination ");
                    stringBuilder0.append(this.getCurrentDestination());
                    throw new IllegalStateException(stringBuilder0.toString());
                }
                this.f = true;
                return true;
            }
            NavGraph navGraph5 = this.c;
            for(int v6 = 0; v6 < arr_v.length; ++v6) {
                int v7 = arr_v[v6];
                Bundle bundle7 = arr_bundle[v6];
                if(v6 == 0) {
                    navDestination3 = this.c;
                }
                else {
                    Intrinsics.checkNotNull(navGraph5);
                    navDestination3 = navGraph5.findNode(v7);
                }
                if(navDestination3 == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.Companion.getDisplayName(context0, v7) + " cannot be found in graph " + navGraph5);
                }
                if(v6 == arr_v.length - 1) {
                    Builder navOptions$Builder0 = new Builder();
                    NavGraph navGraph7 = this.c;
                    Intrinsics.checkNotNull(navGraph7);
                    this.k(navDestination3, bundle7, Builder.setPopUpTo$default(navOptions$Builder0, navGraph7.getId(), true, false, 4, null).setEnterAnim(0).setExitAnim(0).build(), null);
                }
                else if(navDestination3 instanceof NavGraph) {
                    NavGraph navGraph6;
                    for(navGraph6 = (NavGraph)navDestination3; true; navGraph6 = (NavGraph)navGraph6.findNode(navGraph6.getStartDestinationId())) {
                        Intrinsics.checkNotNull(navGraph6);
                        if(!(navGraph6.findNode(navGraph6.getStartDestinationId()) instanceof NavGraph)) {
                            break;
                        }
                    }
                    navGraph5 = navGraph6;
                }
            }
            this.f = true;
            return true;
        }
        return false;
    }

    public final ArrayList i(ArrayDeque arrayDeque0) {
        NavDestination navDestination0;
        ArrayList arrayList0 = new ArrayList();
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.g.lastOrNull();
        if(navBackStackEntry0 == null) {
            navDestination0 = this.getGraph();
        }
        else {
            navDestination0 = navBackStackEntry0.getDestination();
            if(navDestination0 == null) {
                navDestination0 = this.getGraph();
            }
        }
        if(arrayDeque0 != null) {
            for(Object object0: arrayDeque0) {
                NavBackStackEntryState navBackStackEntryState0 = (NavBackStackEntryState)object0;
                NavDestination navDestination1 = this.findDestinationComprehensive(navDestination0, navBackStackEntryState0.getDestinationId(), true);
                Context context0 = this.a;
                if(navDestination1 == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.getDisplayName(context0, navBackStackEntryState0.getDestinationId()) + " cannot be found from the current destination " + navDestination0).toString());
                }
                arrayList0.add(navBackStackEntryState0.instantiate(context0, navDestination1, this.getHostLifecycleState$navigation_runtime_release(), this.r));
                navDestination0 = navDestination1;
            }
        }
        return arrayList0;
    }

    public final void j(NavBackStackEntry navBackStackEntry0, NavBackStackEntry navBackStackEntry1) {
        this.l.put(navBackStackEntry0, navBackStackEntry1);
        LinkedHashMap linkedHashMap0 = this.m;
        if(linkedHashMap0.get(navBackStackEntry1) == null) {
            linkedHashMap0.put(navBackStackEntry1, new AtomicInteger(0));
        }
        Object object0 = linkedHashMap0.get(navBackStackEntry1);
        Intrinsics.checkNotNull(object0);
        ((AtomicInteger)object0).incrementAndGet();
    }

    public final void k(NavDestination navDestination0, Bundle bundle0, NavOptions navOptions0, Extras navigator$Extras0) {
        int v3;
        boolean z;
        LinkedHashMap linkedHashMap0 = this.y;
        for(Object object0: linkedHashMap0.values()) {
            ((androidx.navigation.a)object0).setNavigating(true);
        }
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        int v = -1;
        int v1 = 0;
        if(navOptions0 == null) {
            z = false;
        }
        else if(navOptions0.getPopUpToRoute() != null) {
            String s = navOptions0.getPopUpToRoute();
            Intrinsics.checkNotNull(s);
            z = this.m(s, navOptions0.isPopUpToInclusive(), navOptions0.shouldPopUpToSaveState());
        }
        else if(navOptions0.getPopUpToRouteClass() != null) {
            KClass kClass0 = navOptions0.getPopUpToRouteClass();
            Intrinsics.checkNotNull(kClass0);
            z = this.l(RouteSerializerKt.generateHashCode(SerializersKt.serializer(kClass0)), navOptions0.isPopUpToInclusive(), navOptions0.shouldPopUpToSaveState());
        }
        else if(navOptions0.getPopUpToRouteObject() != null) {
            Object object1 = navOptions0.getPopUpToRouteObject();
            Intrinsics.checkNotNull(object1);
            z = this.m(this.g(object1), navOptions0.isPopUpToInclusive(), navOptions0.shouldPopUpToSaveState());
        }
        else if(navOptions0.getPopUpToId() == -1) {
            z = false;
        }
        else {
            z = this.l(navOptions0.getPopUpToId(), navOptions0.isPopUpToInclusive(), navOptions0.shouldPopUpToSaveState());
        }
        Bundle bundle1 = navDestination0.addInDefaultArgs(bundle0);
        if(navOptions0 == null || !navOptions0.shouldRestoreState() || !this.n.containsKey(navDestination0.getId())) {
            if(navOptions0 == null || !navOptions0.shouldLaunchSingleTop()) {
                v3 = 0;
            }
            else {
                NavBackStackEntry navBackStackEntry0 = this.getCurrentBackStackEntry();
                int v2 = navDestination0 instanceof NavGraph ? NavGraph.Companion.findStartDestination(((NavGraph)navDestination0)).getId() : navDestination0.getId();
                if(navBackStackEntry0 == null) {
                    v3 = 0;
                }
                else {
                    NavDestination navDestination1 = navBackStackEntry0.getDestination();
                    if(navDestination1 == null || v2 != navDestination1.getId()) {
                        v3 = 0;
                    }
                    else {
                        ArrayDeque arrayDeque0 = new ArrayDeque();
                        ArrayDeque arrayDeque1 = this.g;
                        ListIterator listIterator0 = arrayDeque1.listIterator(arrayDeque1.size());
                        while(listIterator0.hasPrevious()) {
                            if(((NavBackStackEntry)listIterator0.previous()).getDestination() == navDestination0) {
                                v = listIterator0.nextIndex();
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                        while(CollectionsKt__CollectionsKt.getLastIndex(arrayDeque1) >= v) {
                            NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)arrayDeque1.removeLast();
                            this.unlinkChildFromParent$navigation_runtime_release(navBackStackEntry1);
                            arrayDeque0.addFirst(new NavBackStackEntry(navBackStackEntry1, navBackStackEntry1.getDestination().addInDefaultArgs(bundle0)));
                        }
                        for(Object object2: arrayDeque0) {
                            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry)object2;
                            NavGraph navGraph0 = navBackStackEntry2.getDestination().getParent();
                            if(navGraph0 != null) {
                                this.j(navBackStackEntry2, this.getBackStackEntry(navGraph0.getId()));
                            }
                            arrayDeque1.add(navBackStackEntry2);
                        }
                        for(Object object3: arrayDeque0) {
                            this.x.getNavigator(((NavBackStackEntry)object3).getDestination().getNavigatorName()).onLaunchSingleTop(((NavBackStackEntry)object3));
                        }
                        v3 = 1;
                    }
                }
            }
            if(v3 == 0) {
                State lifecycle$State0 = this.getHostLifecycleState$navigation_runtime_release();
                NavBackStackEntry navBackStackEntry3 = androidx.navigation.NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.a, navDestination0, bundle1, lifecycle$State0, this.r, null, null, 0x60, null);
                Navigator navigator0 = this.x.getNavigator(navDestination0.getNavigatorName());
                List list0 = k.listOf(navBackStackEntry3);
                this.z = new d(ref$BooleanRef0, this, navDestination0, bundle1);
                navigator0.navigate(list0, navOptions0, navigator$Extras0);
                this.z = null;
            }
            v1 = v3;
        }
        else {
            ref$BooleanRef0.element = this.p(navDestination0.getId(), bundle1, navOptions0, navigator$Extras0);
        }
        this.q();
        for(Object object4: linkedHashMap0.values()) {
            ((androidx.navigation.a)object4).setNavigating(false);
        }
        if(!z && !ref$BooleanRef0.element && v1 == 0) {
            this.updateBackStackLifecycle$navigation_runtime_release();
            return;
        }
        this.d();
    }

    public final boolean l(int v, boolean z, boolean z1) {
        NavDestination navDestination0;
        ArrayDeque arrayDeque0 = this.g;
        if(arrayDeque0.isEmpty()) {
            return false;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: CollectionsKt___CollectionsKt.reversed(arrayDeque0)) {
            navDestination0 = ((NavBackStackEntry)object0).getDestination();
            Navigator navigator0 = this.x.getNavigator(navDestination0.getNavigatorName());
            if(z || navDestination0.getId() != v) {
                arrayList0.add(navigator0);
            }
            if(navDestination0.getId() != v) {
                continue;
            }
            goto label_14;
        }
        navDestination0 = null;
    label_14:
        if(navDestination0 == null) {
            Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.Companion.getDisplayName(this.a, v) + " as it was not found on the current back stack");
            return false;
        }
        return this.e(arrayList0, navDestination0, z, z1);
    }

    public final boolean m(String s, boolean z, boolean z1) {
        Object object0;
        NavDestination navDestination0;
        ArrayDeque arrayDeque0 = this.g;
        if(arrayDeque0.isEmpty()) {
            return false;
        }
        ArrayList arrayList0 = new ArrayList();
        ListIterator listIterator0 = arrayDeque0.listIterator(arrayDeque0.size());
        do {
            navDestination0 = null;
            if(!listIterator0.hasPrevious()) {
                goto label_14;
            }
            object0 = listIterator0.previous();
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object0;
            boolean z2 = navBackStackEntry0.getDestination().hasRoute(s, navBackStackEntry0.getArguments());
            if(z || !z2) {
                arrayList0.add(this.x.getNavigator(navBackStackEntry0.getDestination().getNavigatorName()));
            }
        }
        while(!z2);
        goto label_15;
    label_14:
        object0 = null;
    label_15:
        if(((NavBackStackEntry)object0) != null) {
            navDestination0 = ((NavBackStackEntry)object0).getDestination();
        }
        if(navDestination0 == null) {
            Log.i("NavController", "Ignoring popBackStack to route " + s + " as it was not found on the current back stack");
            return false;
        }
        return this.e(arrayList0, navDestination0, z, z1);
    }

    public final void n(NavBackStackEntry navBackStackEntry0, boolean z, ArrayDeque arrayDeque0) {
        ArrayDeque arrayDeque1 = this.g;
        NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)arrayDeque1.last();
        if(!Intrinsics.areEqual(navBackStackEntry1, navBackStackEntry0)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry0.getDestination() + ", which is not the top of the back stack (" + navBackStackEntry1.getDestination() + ')').toString());
        }
        arrayDeque1.removeLast();
        Navigator navigator0 = this.getNavigatorProvider().getNavigator(navBackStackEntry1.getDestination().getNavigatorName());
        androidx.navigation.a a0 = (androidx.navigation.a)this.y.get(navigator0);
        boolean z1 = true;
        if(a0 == null) {
        label_12:
            if(!this.m.containsKey(navBackStackEntry1)) {
                z1 = false;
            }
        }
        else {
            StateFlow stateFlow0 = a0.getTransitionsInProgress();
            if(stateFlow0 == null) {
                goto label_12;
            }
            else {
                Set set0 = (Set)stateFlow0.getValue();
                if(set0 == null || !set0.contains(navBackStackEntry1)) {
                    goto label_12;
                }
            }
        }
        State lifecycle$State0 = navBackStackEntry1.getLifecycle().getCurrentState();
        State lifecycle$State1 = State.CREATED;
        if(lifecycle$State0.isAtLeast(lifecycle$State1)) {
            if(z) {
                navBackStackEntry1.setMaxLifecycle(lifecycle$State1);
                arrayDeque0.addFirst(new NavBackStackEntryState(navBackStackEntry1));
            }
            if(z1) {
                navBackStackEntry1.setMaxLifecycle(lifecycle$State1);
            }
            else {
                navBackStackEntry1.setMaxLifecycle(State.DESTROYED);
                this.unlinkChildFromParent$navigation_runtime_release(navBackStackEntry1);
            }
        }
        if(!z && !z1) {
            NavControllerViewModel navControllerViewModel0 = this.r;
            if(navControllerViewModel0 != null) {
                navControllerViewModel0.clear(navBackStackEntry1.getId());
            }
        }
    }

    @MainThread
    public void navigate(@IdRes int v) {
        this.navigate(v, null);
    }

    @MainThread
    public void navigate(@IdRes int v, @Nullable Bundle bundle0) {
        this.navigate(v, bundle0, null);
    }

    @MainThread
    public void navigate(@IdRes int v, @Nullable Bundle bundle0, @Nullable NavOptions navOptions0) {
        this.navigate(v, bundle0, navOptions0, null);
    }

    @MainThread
    public void navigate(@IdRes int v, @Nullable Bundle bundle0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        int v1;
        ArrayDeque arrayDeque0 = this.g;
        NavDestination navDestination0 = arrayDeque0.isEmpty() ? this.c : ((NavBackStackEntry)arrayDeque0.last()).getDestination();
        if(navDestination0 == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        NavAction navAction0 = navDestination0.getAction(v);
        Bundle bundle1 = null;
        if(navAction0 == null) {
            v1 = v;
        }
        else {
            if(navOptions0 == null) {
                navOptions0 = navAction0.getNavOptions();
            }
            v1 = navAction0.getDestinationId();
            Bundle bundle2 = navAction0.getDefaultArguments();
            if(bundle2 != null) {
                bundle1 = new Bundle();
                bundle1.putAll(bundle2);
            }
        }
        if(bundle0 != null) {
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            bundle1.putAll(bundle0);
        }
        if(v1 == 0 && navOptions0 != null && (navOptions0.getPopUpToId() != -1 || navOptions0.getPopUpToRoute() != null || navOptions0.getPopUpToRouteClass() != null)) {
            if(navOptions0.getPopUpToRoute() != null) {
                String s = navOptions0.getPopUpToRoute();
                Intrinsics.checkNotNull(s);
                NavController.popBackStack$default(this, s, navOptions0.isPopUpToInclusive(), false, 4, null);
                return;
            }
            if(navOptions0.getPopUpToRouteClass() != null) {
                KClass kClass0 = navOptions0.getPopUpToRouteClass();
                Intrinsics.checkNotNull(kClass0);
                this.popBackStack(RouteSerializerKt.generateHashCode(SerializersKt.serializer(kClass0)), navOptions0.isPopUpToInclusive());
                return;
            }
            if(navOptions0.getPopUpToId() != -1) {
                this.popBackStack(navOptions0.getPopUpToId(), navOptions0.isPopUpToInclusive());
            }
            return;
        }
        if(v1 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        NavDestination navDestination1 = this.findDestination(v1);
        if(navDestination1 == null) {
            androidx.navigation.NavDestination.Companion navDestination$Companion0 = NavDestination.Companion;
            Context context0 = this.a;
            String s1 = navDestination$Companion0.getDisplayName(context0, v1);
            if(navAction0 == null) {
                throw new IllegalArgumentException("Navigation action/destination " + s1 + " cannot be found from the current destination " + navDestination0);
            }
            StringBuilder stringBuilder0 = b.v("Navigation destination ", s1, " referenced from action ");
            stringBuilder0.append(navDestination$Companion0.getDisplayName(context0, v));
            stringBuilder0.append(" cannot be found from the current destination ");
            stringBuilder0.append(navDestination0);
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }
        this.k(navDestination1, bundle1, navOptions0, navigator$Extras0);
    }

    @MainThread
    public void navigate(@NotNull Uri uri0) {
        Intrinsics.checkNotNullParameter(uri0, "deepLink");
        this.navigate(new NavDeepLinkRequest(uri0, null, null));
    }

    @MainThread
    public void navigate(@NotNull Uri uri0, @Nullable NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(uri0, "deepLink");
        this.navigate(new NavDeepLinkRequest(uri0, null, null), navOptions0, null);
    }

    @MainThread
    public void navigate(@NotNull Uri uri0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(uri0, "deepLink");
        this.navigate(new NavDeepLinkRequest(uri0, null, null), navOptions0, navigator$Extras0);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest navDeepLinkRequest0) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest0, "request");
        this.navigate(navDeepLinkRequest0, null);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest navDeepLinkRequest0, @Nullable NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest0, "request");
        this.navigate(navDeepLinkRequest0, navOptions0, null);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest navDeepLinkRequest0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest0, "request");
        NavGraph navGraph0 = this.c;
        if(navGraph0 == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + navDeepLinkRequest0 + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        Intrinsics.checkNotNull(navGraph0);
        DeepLinkMatch navDestination$DeepLinkMatch0 = navGraph0.matchDeepLink(navDeepLinkRequest0);
        if(navDestination$DeepLinkMatch0 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + navDeepLinkRequest0 + " cannot be found in the navigation graph " + this.c);
        }
        Bundle bundle0 = navDestination$DeepLinkMatch0.getDestination().addInDefaultArgs(navDestination$DeepLinkMatch0.getMatchingArgs());
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        Intent intent0 = new Intent();
        intent0.setDataAndType(navDeepLinkRequest0.getUri(), navDeepLinkRequest0.getMimeType());
        intent0.setAction(navDeepLinkRequest0.getAction());
        bundle0.putParcelable("android-support-nav:controller:deepLinkIntent", intent0);
        this.k(navDestination$DeepLinkMatch0.getDestination(), bundle0, navOptions0, navigator$Extras0);
    }

    @MainThread
    public void navigate(@NotNull NavDirections navDirections0) {
        Intrinsics.checkNotNullParameter(navDirections0, "directions");
        this.navigate(navDirections0.getActionId(), navDirections0.getArguments(), null);
    }

    @MainThread
    public void navigate(@NotNull NavDirections navDirections0, @Nullable NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(navDirections0, "directions");
        this.navigate(navDirections0.getActionId(), navDirections0.getArguments(), navOptions0);
    }

    @MainThread
    public void navigate(@NotNull NavDirections navDirections0, @NotNull Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(navDirections0, "directions");
        Intrinsics.checkNotNullParameter(navigator$Extras0, "navigatorExtras");
        this.navigate(navDirections0.getActionId(), navDirections0.getArguments(), null, navigator$Extras0);
    }

    @MainThread
    @JvmOverloads
    public final void navigate(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "route");
        NavController.navigate$default(this, object0, null, null, 6, null);
    }

    @MainThread
    @JvmOverloads
    public final void navigate(@NotNull Object object0, @Nullable NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(object0, "route");
        NavController.navigate$default(this, object0, navOptions0, null, 4, null);
    }

    @MainThread
    @JvmOverloads
    public final void navigate(@NotNull Object object0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(object0, "route");
        String s = this.g(object0);
        Uri uri0 = Uri.parse(NavDestination.Companion.createRoute(s));
        Intrinsics.checkExpressionValueIsNotNull(uri0, "Uri.parse(this)");
        this.navigate(androidx.navigation.NavDeepLinkRequest.Builder.Companion.fromUri(uri0).build(), navOptions0, navigator$Extras0);
    }

    @MainThread
    public final void navigate(@NotNull Object object0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(object0, "route");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavController.navigate$default(this, object0, NavOptionsBuilderKt.navOptions(function10), null, 4, null);
    }

    @MainThread
    @JvmOverloads
    public final void navigate(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "route");
        NavController.navigate$default(this, s, null, null, 6, null);
    }

    @MainThread
    @JvmOverloads
    public final void navigate(@NotNull String s, @Nullable NavOptions navOptions0) {
        Intrinsics.checkNotNullParameter(s, "route");
        NavController.navigate$default(this, s, navOptions0, null, 4, null);
    }

    @MainThread
    @JvmOverloads
    public final void navigate(@NotNull String s, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(s, "route");
        Uri uri0 = Uri.parse(NavDestination.Companion.createRoute(s));
        Intrinsics.checkExpressionValueIsNotNull(uri0, "Uri.parse(this)");
        this.navigate(androidx.navigation.NavDeepLinkRequest.Builder.Companion.fromUri(uri0).build(), navOptions0, navigator$Extras0);
    }

    @MainThread
    public final void navigate(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "route");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavController.navigate$default(this, s, NavOptionsBuilderKt.navOptions(function10), null, 4, null);
    }

    public static void navigate$default(NavController navController0, Object object0, NavOptions navOptions0, Extras navigator$Extras0, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if((v & 2) != 0) {
            navOptions0 = null;
        }
        if((v & 4) != 0) {
            navigator$Extras0 = null;
        }
        navController0.navigate(object0, navOptions0, navigator$Extras0);
    }

    public static void navigate$default(NavController navController0, String s, NavOptions navOptions0, Extras navigator$Extras0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if((v & 2) != 0) {
            navOptions0 = null;
        }
        if((v & 4) != 0) {
            navigator$Extras0 = null;
        }
        navController0.navigate(s, navOptions0, navigator$Extras0);
    }

    @MainThread
    public boolean navigateUp() {
        Bundle bundle0;
        if(this.h() == 1) {
            Activity activity0 = this.b;
            if(activity0 == null) {
                bundle0 = null;
            }
            else {
                Intent intent0 = activity0.getIntent();
                bundle0 = intent0 == null ? null : intent0.getExtras();
            }
            int v = 0;
            if((bundle0 == null ? null : bundle0.getIntArray("android-support-nav:controller:deepLinkIds")) != null) {
                if(this.f) {
                    Intrinsics.checkNotNull(activity0);
                    Intent intent1 = activity0.getIntent();
                    Bundle bundle1 = intent1.getExtras();
                    Intrinsics.checkNotNull(bundle1);
                    int[] arr_v = bundle1.getIntArray("android-support-nav:controller:deepLinkIds");
                    Intrinsics.checkNotNull(arr_v);
                    List list0 = ArraysKt___ArraysKt.toMutableList(arr_v);
                    ArrayList arrayList0 = bundle1.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    int v1 = ((Number)o.removeLast(list0)).intValue();
                    if(arrayList0 != null) {
                        Bundle bundle2 = (Bundle)o.removeLast(arrayList0);
                    }
                    if(!list0.isEmpty()) {
                        NavDestination navDestination0 = this.findDestinationComprehensive(this.getGraph(), v1, false);
                        if(navDestination0 instanceof NavGraph) {
                            v1 = NavGraph.Companion.findStartDestination(((NavGraph)navDestination0)).getId();
                        }
                        NavDestination navDestination1 = this.getCurrentDestination();
                        if(navDestination1 != null && v1 == navDestination1.getId()) {
                            NavDeepLinkBuilder navDeepLinkBuilder0 = this.createDeepLink();
                            Bundle bundle3 = BundleKt.bundleOf(new Pair[]{TuplesKt.to("android-support-nav:controller:deepLinkIntent", intent1)});
                            Bundle bundle4 = bundle1.getBundle("android-support-nav:controller:deepLinkExtras");
                            if(bundle4 != null) {
                                bundle3.putAll(bundle4);
                            }
                            navDeepLinkBuilder0.setArguments(bundle3);
                            for(Object object0: list0) {
                                if(v < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                navDeepLinkBuilder0.addDestination(((Number)object0).intValue(), (arrayList0 == null ? null : ((Bundle)arrayList0.get(v))));
                                ++v;
                            }
                            navDeepLinkBuilder0.createTaskStackBuilder().startActivities();
                            activity0.finish();
                            return true;
                        }
                    }
                }
                return false;
            }
            NavDestination navDestination2 = this.getCurrentDestination();
            Intrinsics.checkNotNull(navDestination2);
            int v2 = navDestination2.getId();
            for(NavGraph navGraph0 = navDestination2.getParent(); navGraph0 != null; navGraph0 = navGraph0.getParent()) {
                if(navGraph0.getStartDestinationId() != v2) {
                    Bundle bundle5 = new Bundle();
                    if(activity0 != null) {
                        Intrinsics.checkNotNull(activity0);
                        if(activity0.getIntent() != null) {
                            Intrinsics.checkNotNull(activity0);
                            if(activity0.getIntent().getData() != null) {
                                Intrinsics.checkNotNull(activity0);
                                bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", activity0.getIntent());
                                NavGraph navGraph1 = this.c;
                                Intrinsics.checkNotNull(navGraph1);
                                Intrinsics.checkNotNull(activity0);
                                Intent intent2 = activity0.getIntent();
                                Intrinsics.checkNotNullExpressionValue(intent2, "activity!!.intent");
                                DeepLinkMatch navDestination$DeepLinkMatch0 = navGraph1.matchDeepLink(new NavDeepLinkRequest(intent2));
                                if((navDestination$DeepLinkMatch0 == null ? null : navDestination$DeepLinkMatch0.getMatchingArgs()) != null) {
                                    bundle5.putAll(navDestination$DeepLinkMatch0.getDestination().addInDefaultArgs(navDestination$DeepLinkMatch0.getMatchingArgs()));
                                }
                            }
                        }
                    }
                    NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), navGraph0.getId(), null, 2, null).setArguments(bundle5).createTaskStackBuilder().startActivities();
                    if(activity0 != null) {
                        activity0.finish();
                        return true;
                    }
                    return true;
                }
                v2 = navGraph0.getId();
            }
            return false;
        }
        return this.popBackStack();
    }

    public static void o(NavController navController0, NavBackStackEntry navBackStackEntry0) {
        navController0.n(navBackStackEntry0, false, new ArrayDeque());
    }

    public final boolean p(int v, Bundle bundle0, NavOptions navOptions0, Extras navigator$Extras0) {
        LinkedHashMap linkedHashMap0 = this.n;
        if(!linkedHashMap0.containsKey(v)) {
            return false;
        }
        String s = (String)linkedHashMap0.get(v);
        o.removeAll(linkedHashMap0.values(), new e(s));
        return this.f(this.i(((ArrayDeque)TypeIntrinsics.asMutableMap(this.o).remove(s))), bundle0, navOptions0, navigator$Extras0);
    }

    @MainThread
    public boolean popBackStack() {
        if(this.g.isEmpty()) {
            return false;
        }
        NavDestination navDestination0 = this.getCurrentDestination();
        Intrinsics.checkNotNull(navDestination0);
        return this.popBackStack(navDestination0.getId(), true);
    }

    @MainThread
    public boolean popBackStack(@IdRes int v, boolean z) {
        return this.popBackStack(v, z, false);
    }

    // 去混淆评级： 低(20)
    @MainThread
    public boolean popBackStack(@IdRes int v, boolean z, boolean z1) {
        return this.l(v, z, z1) && this.d();
    }

    @MainThread
    @JvmOverloads
    public final boolean popBackStack(@NotNull Object object0, boolean z) {
        Intrinsics.checkNotNullParameter(object0, "route");
        return NavController.popBackStack$default(this, object0, z, false, 4, null);
    }

    @MainThread
    @JvmOverloads
    public final boolean popBackStack(@NotNull Object object0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(object0, "route");
        return this.m(this.g(object0), z, z1) && this.d();
    }

    @MainThread
    @JvmOverloads
    public final boolean popBackStack(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "route");
        return NavController.popBackStack$default(this, s, z, false, 4, null);
    }

    @MainThread
    @JvmOverloads
    public final boolean popBackStack(@NotNull String s, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(s, "route");
        return this.m(s, z, z1) && this.d();
    }

    @MainThread
    @JvmOverloads
    public final boolean popBackStack(boolean z) {
        Intrinsics.reifiedOperationMarker(6, "T");
        int v = RouteSerializerKt.generateHashCode(SerializersKt.serializer(null));
        if(this.findDestinationComprehensive(this.getGraph(), v, true) != null) {
            return this.popBackStack(v, z, false);
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        throw new IllegalArgumentException(("Destination with route " + Reflection.getOrCreateKotlinClass(Object.class).getSimpleName() + " cannot be found in navigation graph " + this.getGraph()).toString());
    }

    @MainThread
    @JvmOverloads
    public final boolean popBackStack(boolean z, boolean z1) {
        Intrinsics.reifiedOperationMarker(6, "T");
        int v = RouteSerializerKt.generateHashCode(SerializersKt.serializer(null));
        if(this.findDestinationComprehensive(this.getGraph(), v, true) != null) {
            return this.popBackStack(v, z, z1);
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        throw new IllegalArgumentException(("Destination with route " + Reflection.getOrCreateKotlinClass(Object.class).getSimpleName() + " cannot be found in navigation graph " + this.getGraph()).toString());
    }

    public static boolean popBackStack$default(NavController navController0, Object object0, boolean z, boolean z1, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        return navController0.popBackStack(object0, z, z1);
    }

    public static boolean popBackStack$default(NavController navController0, String s, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        return navController0.popBackStack(s, z, z1);
    }

    public static boolean popBackStack$default(NavController navController0, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        Intrinsics.reifiedOperationMarker(6, "T");
        int v1 = RouteSerializerKt.generateHashCode(SerializersKt.serializer(null));
        if(navController0.findDestinationComprehensive(navController0.getGraph(), v1, true) != null) {
            return navController0.popBackStack(v1, z, z1);
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        throw new IllegalArgumentException(("Destination with route " + Reflection.getOrCreateKotlinClass(Object.class).getSimpleName() + " cannot be found in navigation graph " + navController0.getGraph()).toString());
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(@NotNull NavBackStackEntry navBackStackEntry0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        Intrinsics.checkNotNullParameter(function00, "onComplete");
        ArrayDeque arrayDeque0 = this.g;
        int v = arrayDeque0.indexOf(navBackStackEntry0);
        if(v < 0) {
            Log.i("NavController", "Ignoring pop of " + navBackStackEntry0 + " as it was not found on the current back stack");
            return;
        }
        if(v + 1 != arrayDeque0.size()) {
            this.l(((NavBackStackEntry)arrayDeque0.get(v + 1)).getDestination().getId(), true, false);
        }
        NavController.o(this, navBackStackEntry0);
        function00.invoke();
        this.q();
        this.d();
    }

    @NotNull
    public final List populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.y.values()) {
            Iterable iterable0 = (Iterable)((androidx.navigation.a)object0).getTransitionsInProgress().getValue();
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: iterable0) {
                if(!arrayList0.contains(((NavBackStackEntry)object1)) && !((NavBackStackEntry)object1).getMaxLifecycle().isAtLeast(State.STARTED)) {
                    arrayList1.add(object1);
                }
            }
            o.addAll(arrayList0, arrayList1);
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: this.g) {
            if(!arrayList0.contains(((NavBackStackEntry)object2)) && ((NavBackStackEntry)object2).getMaxLifecycle().isAtLeast(State.STARTED)) {
                arrayList2.add(object2);
            }
        }
        o.addAll(arrayList0, arrayList2);
        List list0 = new ArrayList();
        for(Object object3: arrayList0) {
            if(!(((NavBackStackEntry)object3).getDestination() instanceof NavGraph)) {
                ((ArrayList)list0).add(object3);
            }
        }
        return list0;
    }

    public final void q() {
        boolean z = this.w && this.h() > 1;
        this.v.setEnabled(z);
    }

    public void removeOnDestinationChangedListener(@NotNull OnDestinationChangedListener navController$OnDestinationChangedListener0) {
        Intrinsics.checkNotNullParameter(navController$OnDestinationChangedListener0, "listener");
        this.s.remove(navController$OnDestinationChangedListener0);
    }

    @CallSuper
    public void restoreState(@Nullable Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        bundle0.setClassLoader(this.a.getClassLoader());
        this.d = bundle0.getBundle("android-support-nav:controller:navigatorState");
        this.e = bundle0.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap0 = this.o;
        linkedHashMap0.clear();
        int[] arr_v = bundle0.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList arrayList0 = bundle0.getStringArrayList("android-support-nav:controller:backStackIds");
        if(arr_v != null && arrayList0 != null) {
            int v = 0;
            for(int v1 = 0; v < arr_v.length; ++v1) {
                Integer integer0 = (int)arr_v[v];
                Object object0 = arrayList0.get(v1);
                this.n.put(integer0, object0);
                ++v;
            }
        }
        ArrayList arrayList1 = bundle0.getStringArrayList("android-support-nav:controller:backStackStates");
        if(arrayList1 != null) {
            for(Object object1: arrayList1) {
                String s = (String)object1;
                Parcelable[] arr_parcelable = bundle0.getParcelableArray("android-support-nav:controller:backStackStates:" + s);
                if(arr_parcelable != null) {
                    Intrinsics.checkNotNullExpressionValue(s, "id");
                    ArrayDeque arrayDeque0 = new ArrayDeque(arr_parcelable.length);
                    for(Object object2: arr_parcelable) {
                        Intrinsics.checkNotNull(((Parcelable)object2), "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        arrayDeque0.add(((NavBackStackEntryState)(((Parcelable)object2))));
                    }
                    linkedHashMap0.put(s, arrayDeque0);
                }
            }
        }
        this.f = bundle0.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    @CallSuper
    @Nullable
    public Bundle saveState() {
        Bundle bundle2;
        ArrayList arrayList0 = new ArrayList();
        Bundle bundle0 = new Bundle();
        for(Object object0: this.x.getNavigators().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Bundle bundle1 = ((Navigator)((Map.Entry)object0).getValue()).onSaveState();
            if(bundle1 != null) {
                arrayList0.add(s);
                bundle0.putBundle(s, bundle1);
            }
        }
        if(arrayList0.isEmpty()) {
            bundle2 = null;
        }
        else {
            bundle2 = new Bundle();
            bundle0.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList0);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle0);
        }
        ArrayDeque arrayDeque0 = this.g;
        if(!arrayDeque0.isEmpty()) {
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] arr_parcelable = new Parcelable[arrayDeque0.size()];
            int v = 0;
            for(Object object1: arrayDeque0) {
                arr_parcelable[v] = new NavBackStackEntryState(((NavBackStackEntry)object1));
                ++v;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", arr_parcelable);
        }
        LinkedHashMap linkedHashMap0 = this.n;
        if(!linkedHashMap0.isEmpty()) {
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] arr_v = new int[linkedHashMap0.size()];
            ArrayList arrayList1 = new ArrayList();
            int v1 = 0;
            for(Object object2: linkedHashMap0.entrySet()) {
                int v2 = ((Number)((Map.Entry)object2).getKey()).intValue();
                String s1 = (String)((Map.Entry)object2).getValue();
                arr_v[v1] = v2;
                arrayList1.add(s1);
                ++v1;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", arr_v);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList1);
        }
        LinkedHashMap linkedHashMap1 = this.o;
        if(!linkedHashMap1.isEmpty()) {
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: linkedHashMap1.entrySet()) {
                String s2 = (String)((Map.Entry)object3).getKey();
                ArrayDeque arrayDeque1 = (ArrayDeque)((Map.Entry)object3).getValue();
                arrayList2.add(s2);
                Parcelable[] arr_parcelable1 = new Parcelable[arrayDeque1.size()];
                int v3 = 0;
                for(Object object4: arrayDeque1) {
                    if(v3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    arr_parcelable1[v3] = (NavBackStackEntryState)object4;
                    ++v3;
                }
                bundle2.putParcelableArray("android-support-nav:controller:backStackStates:" + s2, arr_parcelable1);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList2);
        }
        if(this.f) {
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", this.f);
        }
        return bundle2;
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int v) {
        this.setGraph(this.getNavInflater().inflate(v), null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int v, @Nullable Bundle bundle0) {
        this.setGraph(this.getNavInflater().inflate(v), bundle0);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NotNull NavGraph navGraph0) {
        Intrinsics.checkNotNullParameter(navGraph0, "graph");
        this.setGraph(navGraph0, null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NotNull NavGraph navGraph0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(navGraph0, "graph");
        boolean z = Intrinsics.areEqual(this.c, navGraph0);
        int v = 0;
        ArrayDeque arrayDeque0 = this.g;
        if(z) {
            int v1 = navGraph0.getNodes().size();
            while(v < v1) {
                NavDestination navDestination1 = (NavDestination)navGraph0.getNodes().valueAt(v);
                NavGraph navGraph4 = this.c;
                Intrinsics.checkNotNull(navGraph4);
                int v2 = navGraph4.getNodes().keyAt(v);
                NavGraph navGraph5 = this.c;
                Intrinsics.checkNotNull(navGraph5);
                navGraph5.getNodes().replace(v2, navDestination1);
                ++v;
            }
            for(Object object4: arrayDeque0) {
                Iterable iterable1 = p.asReversed(SequencesKt___SequencesKt.toList(NavDestination.Companion.getHierarchy(((NavBackStackEntry)object4).getDestination())));
                NavDestination navDestination2 = this.c;
                Intrinsics.checkNotNull(navDestination2);
                for(Object object5: iterable1) {
                    NavDestination navDestination3 = (NavDestination)object5;
                    if((!Intrinsics.areEqual(navDestination3, this.c) || !Intrinsics.areEqual(navDestination2, navGraph0)) && navDestination2 instanceof NavGraph) {
                        navDestination2 = ((NavGraph)navDestination2).findNode(navDestination3.getId());
                        Intrinsics.checkNotNull(navDestination2);
                    }
                }
                ((NavBackStackEntry)object4).setDestination(navDestination2);
            }
        }
        else {
            NavGraph navGraph1 = this.c;
            if(navGraph1 != null) {
                for(Object object0: new ArrayList(this.n.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(((Integer)object0), "id");
                    this.b(((int)(((Integer)object0))));
                }
                this.l(navGraph1.getId(), true, false);
            }
            this.c = navGraph0;
            Bundle bundle1 = this.d;
            if(bundle1 != null) {
                ArrayList arrayList0 = bundle1.getStringArrayList("android-support-nav:controller:navigatorState:names");
                if(arrayList0 != null) {
                    for(Object object1: arrayList0) {
                        NavigatorProvider navigatorProvider0 = this.x;
                        Intrinsics.checkNotNullExpressionValue(((String)object1), "name");
                        Navigator navigator0 = navigatorProvider0.getNavigator(((String)object1));
                        Bundle bundle2 = bundle1.getBundle(((String)object1));
                        if(bundle2 != null) {
                            navigator0.onRestoreState(bundle2);
                        }
                    }
                }
            }
            Parcelable[] arr_parcelable = this.e;
            LinkedHashMap linkedHashMap0 = this.y;
            if(arr_parcelable != null) {
                while(v < arr_parcelable.length) {
                    Parcelable parcelable0 = arr_parcelable[v];
                    Intrinsics.checkNotNull(parcelable0, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                    NavBackStackEntryState navBackStackEntryState0 = (NavBackStackEntryState)parcelable0;
                    NavDestination navDestination0 = this.findDestination(navBackStackEntryState0.getDestinationId());
                    Context context0 = this.a;
                    if(navDestination0 != null) {
                        NavBackStackEntry navBackStackEntry0 = navBackStackEntryState0.instantiate(context0, navDestination0, this.getHostLifecycleState$navigation_runtime_release(), this.r);
                        Navigator navigator1 = this.x.getNavigator(navDestination0.getNavigatorName());
                        androidx.navigation.a a0 = linkedHashMap0.get(navigator1);
                        if(a0 == null) {
                            a0 = new androidx.navigation.a(this, navigator1);
                            linkedHashMap0.put(navigator1, a0);
                        }
                        arrayDeque0.add(navBackStackEntry0);
                        a0.b(navBackStackEntry0);
                        NavGraph navGraph2 = navBackStackEntry0.getDestination().getParent();
                        if(navGraph2 != null) {
                            this.j(navBackStackEntry0, this.getBackStackEntry(navGraph2.getId()));
                        }
                        ++v;
                        continue;
                    }
                    StringBuilder stringBuilder0 = b.v("Restoring the Navigation back stack failed: destination ", NavDestination.Companion.getDisplayName(context0, navBackStackEntryState0.getDestinationId()), " cannot be found from the current destination ");
                    stringBuilder0.append(this.getCurrentDestination());
                    throw new IllegalStateException(stringBuilder0.toString());
                }
                this.q();
                this.e = null;
            }
            Iterable iterable0 = this.x.getNavigators().values();
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: iterable0) {
                if(!((Navigator)object2).isAttached()) {
                    arrayList1.add(object2);
                }
            }
            for(Object object3: arrayList1) {
                Navigator navigator2 = (Navigator)object3;
                androidx.navigation.a a1 = linkedHashMap0.get(navigator2);
                if(a1 == null) {
                    a1 = new androidx.navigation.a(this, navigator2);
                    linkedHashMap0.put(navigator2, a1);
                }
                navigator2.onAttach(a1);
            }
            if(this.c == null || !arrayDeque0.isEmpty()) {
                this.d();
                return;
            }
            if(this.f) {
                goto label_81;
            }
            Activity activity0 = this.b;
            if(activity0 == null) {
                goto label_81;
            }
            Intrinsics.checkNotNull(activity0);
            if(!this.handleDeepLink(activity0.getIntent())) {
            label_81:
                NavGraph navGraph3 = this.c;
                Intrinsics.checkNotNull(navGraph3);
                this.k(navGraph3, bundle0, null, null);
            }
        }
    }

    public final void setHostLifecycleState$navigation_runtime_release(@NotNull State lifecycle$State0) {
        Intrinsics.checkNotNullParameter(lifecycle$State0, "<set-?>");
        this.t = lifecycle$State0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(@NotNull LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        if(Intrinsics.areEqual(lifecycleOwner0, this.p)) {
            return;
        }
        LifecycleOwner lifecycleOwner1 = this.p;
        t1 t10 = this.u;
        if(lifecycleOwner1 != null) {
            Lifecycle lifecycle0 = lifecycleOwner1.getLifecycle();
            if(lifecycle0 != null) {
                lifecycle0.removeObserver(t10);
            }
        }
        this.p = lifecycleOwner0;
        lifecycleOwner0.getLifecycle().addObserver(t10);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(@NotNull NavigatorProvider navigatorProvider0) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "navigatorProvider");
        if(!this.g.isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
        }
        this.x = navigatorProvider0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(@NotNull OnBackPressedDispatcher onBackPressedDispatcher0) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher0, "dispatcher");
        if(Intrinsics.areEqual(onBackPressedDispatcher0, this.q)) {
            return;
        }
        LifecycleOwner lifecycleOwner0 = this.p;
        if(lifecycleOwner0 == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.v.remove();
        this.q = onBackPressedDispatcher0;
        onBackPressedDispatcher0.addCallback(lifecycleOwner0, this.v);
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        lifecycle0.removeObserver(this.u);
        lifecycle0.addObserver(this.u);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setViewModelStore(@NotNull ViewModelStore viewModelStore0) {
        Intrinsics.checkNotNullParameter(viewModelStore0, "viewModelStore");
        androidx.navigation.NavControllerViewModel.Companion navControllerViewModel$Companion0 = NavControllerViewModel.Companion;
        if(Intrinsics.areEqual(this.r, navControllerViewModel$Companion0.getInstance(viewModelStore0))) {
            return;
        }
        if(!this.g.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.r = navControllerViewModel$Companion0.getInstance(viewModelStore0);
    }

    @Nullable
    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "child");
        NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)this.l.remove(navBackStackEntry0);
        Integer integer0 = null;
        if(navBackStackEntry1 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap0 = this.m;
        AtomicInteger atomicInteger0 = (AtomicInteger)linkedHashMap0.get(navBackStackEntry1);
        if(atomicInteger0 != null) {
            integer0 = atomicInteger0.decrementAndGet();
        }
        if(integer0 != null && ((int)integer0) == 0) {
            Navigator navigator0 = this.x.getNavigator(navBackStackEntry1.getDestination().getNavigatorName());
            androidx.navigation.a a0 = (androidx.navigation.a)this.y.get(navigator0);
            if(a0 != null) {
                a0.markTransitionComplete(navBackStackEntry1);
            }
            linkedHashMap0.remove(navBackStackEntry1);
        }
        return navBackStackEntry1;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        Boolean boolean0;
        List list0 = CollectionsKt___CollectionsKt.toMutableList(this.g);
        if(list0.isEmpty()) {
            return;
        }
        NavDestination navDestination0 = ((NavBackStackEntry)CollectionsKt___CollectionsKt.last(list0)).getDestination();
        ArrayList arrayList0 = new ArrayList();
        if(navDestination0 instanceof FloatingWindow) {
            for(Object object0: CollectionsKt___CollectionsKt.reversed(list0)) {
                NavDestination navDestination1 = ((NavBackStackEntry)object0).getDestination();
                arrayList0.add(navDestination1);
                if(!(navDestination1 instanceof FloatingWindow) && !(navDestination1 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap hashMap0 = new HashMap();
        for(Object object1: CollectionsKt___CollectionsKt.reversed(list0)) {
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object1;
            State lifecycle$State0 = navBackStackEntry0.getMaxLifecycle();
            NavDestination navDestination2 = navBackStackEntry0.getDestination();
            if(navDestination0 != null && navDestination2.getId() == navDestination0.getId()) {
                State lifecycle$State1 = State.RESUMED;
                if(lifecycle$State0 != lifecycle$State1) {
                    Navigator navigator0 = this.getNavigatorProvider().getNavigator(navBackStackEntry0.getDestination().getNavigatorName());
                    androidx.navigation.a a0 = (androidx.navigation.a)this.y.get(navigator0);
                    if(a0 == null) {
                        boolean0 = null;
                    }
                    else {
                        StateFlow stateFlow0 = a0.getTransitionsInProgress();
                        if(stateFlow0 != null) {
                            Set set0 = (Set)stateFlow0.getValue();
                            if(set0 != null) {
                                boolean0 = Boolean.valueOf(set0.contains(navBackStackEntry0));
                            }
                        }
                    }
                    if(!Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
                        AtomicInteger atomicInteger0 = (AtomicInteger)this.m.get(navBackStackEntry0);
                        if(atomicInteger0 == null || atomicInteger0.get() != 0) {
                            hashMap0.put(navBackStackEntry0, lifecycle$State1);
                            goto label_38;
                        }
                    }
                    hashMap0.put(navBackStackEntry0, State.STARTED);
                }
            label_38:
                NavDestination navDestination3 = (NavDestination)CollectionsKt___CollectionsKt.firstOrNull(arrayList0);
                if(navDestination3 != null && navDestination3.getId() == navDestination2.getId()) {
                    o.removeFirst(arrayList0);
                }
                navDestination0 = navDestination0.getParent();
            }
            else if(!arrayList0.isEmpty() && navDestination2.getId() == ((NavDestination)CollectionsKt___CollectionsKt.first(arrayList0)).getId()) {
                NavDestination navDestination4 = (NavDestination)o.removeFirst(arrayList0);
                if(lifecycle$State0 == State.RESUMED) {
                    navBackStackEntry0.setMaxLifecycle(State.STARTED);
                }
                else {
                    State lifecycle$State2 = State.STARTED;
                    if(lifecycle$State0 != lifecycle$State2) {
                        hashMap0.put(navBackStackEntry0, lifecycle$State2);
                    }
                }
                NavGraph navGraph0 = navDestination4.getParent();
                if(navGraph0 == null || arrayList0.contains(navGraph0)) {
                    continue;
                }
                arrayList0.add(navGraph0);
            }
            else {
                navBackStackEntry0.setMaxLifecycle(State.CREATED);
            }
        }
        for(Object object2: list0) {
            NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)object2;
            State lifecycle$State3 = (State)hashMap0.get(navBackStackEntry1);
            if(lifecycle$State3 == null) {
                navBackStackEntry1.updateState();
            }
            else {
                navBackStackEntry1.setMaxLifecycle(lifecycle$State3);
            }
        }
    }
}

