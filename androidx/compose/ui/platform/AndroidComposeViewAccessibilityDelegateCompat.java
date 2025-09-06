package androidx.compose.ui.platform;

import aa.m;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import androidx.activity.h;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.SparseArrayCompat;
import androidx.compose.foundation.text.selection.n1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.string;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import jeb.synthetic.FIN;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0011\b\u0000\u0018\u0000 h2\u00020\u0001:\bijhklmllB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001F\u0010\u0019\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\"\u001A\u00020\u001FH\u0000\u00A2\u0006\u0004\b \u0010!J\u0010\u0010%\u001A\u00020\u001FH\u0080@\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010*\u001A\u00020\u001F2\u0006\u0010\'\u001A\u00020&H\u0000\u00A2\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R(\u00106\u001A\u00020\b8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010!\u001A\u0004\b1\u00102\"\u0004\b3\u00104R4\u0010@\u001A\u000E\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0006078\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010!\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010H\u001A\u00020\u00062\u0006\u0010A\u001A\u00020\u00068\u0000@@X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001A\u00020I8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001A\u00020Q8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bR\u0010S\u001A\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001A\u00020Q8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bY\u0010S\u001A\u0004\bZ\u0010U\"\u0004\b[\u0010WR\u001A\u0010b\u001A\u00020]8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aR\u001A\u0010e\u001A\u00020]8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bc\u0010_\u001A\u0004\bd\u0010aR\u0014\u0010g\u001A\u00020\u00068@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bf\u0010E\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "vertical", "", "direction", "Landroidx/compose/ui/geometry/Offset;", "position", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "Landroid/view/MotionEvent;", "event", "dispatchHoverEvent$ui_release", "(Landroid/view/MotionEvent;)Z", "dispatchHoverEvent", "", "x", "y", "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "e", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "getHoveredVirtualViewId$ui_release$annotations", "hoveredVirtualViewId", "Lkotlin/Function1;", "Landroid/view/accessibility/AccessibilityEvent;", "f", "Lkotlin/jvm/functions/Function1;", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "onSendAccessibilityEvent", "value", "h", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "", "i", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui_release", "(J)V", "SendRecurringAccessibilityEventsIntervalMillis", "Landroidx/collection/MutableIntIntMap;", "D", "Landroidx/collection/MutableIntIntMap;", "getIdToBeforeMap$ui_release", "()Landroidx/collection/MutableIntIntMap;", "setIdToBeforeMap$ui_release", "(Landroidx/collection/MutableIntIntMap;)V", "idToBeforeMap", "E", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "idToAfterMap", "", "F", "Ljava/lang/String;", "getExtraDataTestTraversalBeforeVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "G", "getExtraDataTestTraversalAfterVal$ui_release", "ExtraDataTestTraversalAfterVal", "isEnabled$ui_release", "isEnabled", "Companion", "androidx/compose/ui/platform/s", "androidx/compose/ui/platform/t", "androidx/compose/ui/platform/u", "androidx/compose/ui/platform/v", "androidx/compose/ui/platform/w", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 IntList.kt\nandroidx/collection/IntListKt\n+ 8 IntList.kt\nandroidx/collection/IntList\n+ 9 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 13 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 14 IntSet.kt\nandroidx/collection/IntSet\n*L\n1#1,3340:1\n548#1,5:3418\n26#2,5:3341\n26#2,5:3346\n26#2,5:3376\n26#2,5:3381\n26#2,5:3386\n26#2,3:3391\n30#2:3403\n26#2,5:3404\n26#2,5:3409\n26#2,5:3484\n26#2,5:3489\n26#2,5:3494\n26#2,5:3499\n26#2,3:3514\n26#2,5:3517\n26#2,5:3522\n30#2:3527\n26#2,3:3528\n30#2:3532\n26#2,5:3533\n26#2,5:3538\n26#2,5:3543\n26#2,5:3686\n26#2,5:3691\n408#3,3:3351\n354#3,6:3354\n364#3,3:3361\n367#3,2:3365\n412#3,2:3367\n370#3,6:3369\n414#3:3375\n382#3,4:3575\n354#3,6:3579\n364#3,3:3586\n367#3,2:3590\n387#3,2:3592\n370#3,6:3594\n389#3:3600\n396#3,3:3601\n354#3,6:3604\n364#3,3:3611\n367#3,2:3615\n399#3:3617\n400#3:3639\n370#3,6:3640\n401#3:3646\n1810#4:3360\n1672#4:3364\n1810#4:3559\n1672#4:3563\n1810#4:3585\n1672#4:3589\n1810#4:3610\n1672#4:3614\n1810#4:3664\n1672#4:3668\n66#5,9:3394\n66#5,9:3618\n33#6,4:3414\n38#6:3423\n33#6,6:3424\n33#6,6:3430\n33#6,6:3436\n33#6,6:3449\n69#6,6:3455\n69#6,6:3461\n33#6,6:3505\n33#6,6:3627\n33#6,6:3633\n33#6,6:3647\n33#6,6:3680\n931#7:3442\n253#8,6:3443\n71#9,16:3467\n26#10:3483\n1#11:3504\n37#12,2:3511\n80#13:3513\n80#13:3531\n262#14,4:3548\n232#14,7:3552\n243#14,3:3560\n246#14,2:3564\n266#14,2:3566\n249#14,6:3568\n268#14:3574\n262#14,4:3653\n232#14,7:3657\n243#14,3:3665\n246#14,2:3669\n266#14,2:3671\n249#14,6:3673\n268#14:3679\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n627#1:3418,5\n311#1:3341,5\n315#1:3346,5\n439#1:3376,5\n446#1:3381,5\n449#1:3386,5\n453#1:3391,3\n453#1:3403\n468#1:3404,5\n472#1:3409,5\n1543#1:3484,5\n1583#1:3489,5\n1590#1:3494,5\n1591#1:3499,5\n2259#1:3514,3\n2263#1:3517,5\n2269#1:3522,5\n2259#1:3527\n2382#1:3528,3\n2382#1:3532\n2410#1:3533,5\n2419#1:3538,5\n2422#1:3543,5\n2233#1:3686,5\n2234#1:3691,5\n400#1:3351,3\n400#1:3354,6\n400#1:3361,3\n400#1:3365,2\n400#1:3367,2\n400#1:3369,6\n400#1:3375\n2446#1:3575,4\n2446#1:3579,6\n2446#1:3586,3\n2446#1:3590,2\n2446#1:3592,2\n2446#1:3594,6\n2446#1:3600\n2467#1:3601,3\n2467#1:3604,6\n2467#1:3611,3\n2467#1:3615,2\n2467#1:3617\n2467#1:3639\n2467#1:3640,6\n2467#1:3646\n400#1:3360\n400#1:3364\n2430#1:3559\n2430#1:3563\n2446#1:3585\n2446#1:3589\n2467#1:3610\n2467#1:3614\n2925#1:3664\n2925#1:3668\n457#1:3394,9\n2471#1:3618,9\n625#1:3414,4\n625#1:3423\n689#1:3424,6\n711#1:3430,6\n810#1:3436,6\n1215#1:3449,6\n1226#1:3455,6\n1233#1:3461,6\n1987#1:3505,6\n2744#1:3627,6\n2748#1:3633,6\n2914#1:3647,6\n2932#1:3680,6\n1211#1:3442\n1212#1:3443,6\n1353#1:3467,16\n1359#1:3483\n2043#1:3511,2\n2158#1:3513\n2383#1:3531\n2430#1:3548,4\n2430#1:3552,7\n2430#1:3560,3\n2430#1:3564,2\n2430#1:3566,2\n2430#1:3568,6\n2430#1:3574\n2925#1:3653,4\n2925#1:3657,7\n2925#1:3665,3\n2925#1:3669,2\n2925#1:3671,2\n2925#1:3673,6\n2925#1:3679\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000BR\u0014\u0010\r\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000BR\u0014\u0010\u000E\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\u0007R\u0014\u0010\u000F\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\u000BR\u0014\u0010\u0010\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000BR\u0014\u0010\u0012\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000BR\u0014\u0010\u0014\u001A\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "Landroidx/collection/IntList;", "AccessibilityActionsResourceIds", "Landroidx/collection/IntList;", "", "AccessibilityCursorPositionUndefined", "I", "AccessibilitySliderStepsCount", "", "ClassName", "Ljava/lang/String;", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "TextClassName", "TextFieldClassName", "", "TextTraversedEventTimeoutMillis", "J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ToggleableState.values().length];
            try {
                arr_v[ToggleableState.On.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ToggleableState.Off.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ToggleableState.Indeterminate.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 0;
    public w A;
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public IntObjectMap B;
    public final MutableIntSet C;
    @NotNull
    public static final String ClassName = "android.view.View";
    @NotNull
    public static final Companion Companion = null;
    public MutableIntIntMap D;
    public MutableIntIntMap E;
    @NotNull
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    @NotNull
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public final String F;
    public final String G;
    public final URLSpanCache H;
    public final MutableIntObjectMap I;
    public static final int InvalidId = 0x80000000;
    public SemanticsNodeCopy J;
    public boolean K;
    public final h L;
    @NotNull
    public static final String LogTag = "AccessibilityDelegate";
    public final ArrayList M;
    public final z N;
    public static final IntList O = null;
    public static final int ParcelSafeTextLength = 100000;
    @NotNull
    public static final String TextClassName = "android.widget.TextView";
    @NotNull
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000L;
    public final AndroidComposeView d;
    public int e;
    public Function1 f;
    public final AccessibilityManager g;
    public boolean h;
    public long i;
    public final q j;
    public final r k;
    public List l;
    public final Handler m;
    public final u n;
    public int o;
    public AccessibilityNodeInfoCompat p;
    public boolean q;
    public final MutableIntObjectMap r;
    public final MutableIntObjectMap s;
    public final SparseArrayCompat t;
    public final SparseArrayCompat u;
    public int v;
    public Integer w;
    public final ArraySet x;
    public final Channel y;
    public boolean z;

    static {
        AndroidComposeViewAccessibilityDelegateCompat.Companion = new Companion(null);
        AndroidComposeViewAccessibilityDelegateCompat.$stable = 8;
        AndroidComposeViewAccessibilityDelegateCompat.O = IntListKt.intListOf(new int[]{id.accessibility_custom_action_0, id.accessibility_custom_action_1, id.accessibility_custom_action_2, id.accessibility_custom_action_3, id.accessibility_custom_action_4, id.accessibility_custom_action_5, id.accessibility_custom_action_6, id.accessibility_custom_action_7, id.accessibility_custom_action_8, id.accessibility_custom_action_9, id.accessibility_custom_action_10, id.accessibility_custom_action_11, id.accessibility_custom_action_12, id.accessibility_custom_action_13, id.accessibility_custom_action_14, id.accessibility_custom_action_15, id.accessibility_custom_action_16, id.accessibility_custom_action_17, id.accessibility_custom_action_18, id.accessibility_custom_action_19, id.accessibility_custom_action_20, id.accessibility_custom_action_21, id.accessibility_custom_action_22, id.accessibility_custom_action_23, id.accessibility_custom_action_24, id.accessibility_custom_action_25, id.accessibility_custom_action_26, id.accessibility_custom_action_27, id.accessibility_custom_action_28, id.accessibility_custom_action_29, id.accessibility_custom_action_30, id.accessibility_custom_action_31});
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@NotNull AndroidComposeView androidComposeView0) {
        this.d = androidComposeView0;
        this.e = 0x80000000;
        this.f = new z(this, 0);
        Object object0 = androidComposeView0.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.g = (AccessibilityManager)object0;
        this.i = 100L;
        this.j = new q(this);
        this.k = new r(this);
        this.l = ((AccessibilityManager)object0).getEnabledAccessibilityServiceList(-1);
        this.m = new Handler(Looper.getMainLooper());
        this.n = new u(this, 0);
        this.o = 0x80000000;
        this.r = new MutableIntObjectMap(0, 1, null);
        this.s = new MutableIntObjectMap(0, 1, null);
        this.t = new SparseArrayCompat(0, 1, null);
        this.u = new SparseArrayCompat(0, 1, null);
        this.v = -1;
        this.x = new ArraySet(0, 1, null);
        this.y = ChannelKt.Channel$default(1, null, null, 6, null);
        this.z = true;
        this.B = IntObjectMapKt.intObjectMapOf();
        this.C = new MutableIntSet(0, 1, null);
        this.D = new MutableIntIntMap(0, 1, null);
        this.E = new MutableIntIntMap(0, 1, null);
        this.F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.H = new URLSpanCache();
        this.I = IntObjectMapKt.mutableIntObjectMapOf();
        this.J = new SemanticsNodeCopy(androidComposeView0.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        androidComposeView0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final AndroidComposeViewAccessibilityDelegateCompat a;

            {
                this.a = androidComposeViewAccessibilityDelegateCompat0;
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view0) {
                AccessibilityManager accessibilityManager0 = AndroidComposeViewAccessibilityDelegateCompat.access$getAccessibilityManager$p(this.a);
                accessibilityManager0.addAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.access$getEnabledStateListener$p(this.a));
                accessibilityManager0.addTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.access$getTouchExplorationStateListener$p(this.a));
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view0) {
                AndroidComposeViewAccessibilityDelegateCompat.access$getHandler$p(this.a).removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.access$getSemanticsChangeChecker$p(this.a));
                AccessibilityManager accessibilityManager0 = AndroidComposeViewAccessibilityDelegateCompat.access$getAccessibilityManager$p(this.a);
                accessibilityManager0.removeAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.access$getEnabledStateListener$p(this.a));
                accessibilityManager0.removeTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.access$getTouchExplorationStateListener$p(this.a));
            }
        });
        this.L = new h(this, 4);
        this.M = new ArrayList();
        this.N = new z(this, 1);
    }

    public final void A(int v) {
        w w0 = this.A;
        if(w0 != null) {
            SemanticsNode semanticsNode0 = w0.a;
            if(v != semanticsNode0.getId()) {
                return;
            }
            if(SystemClock.uptimeMillis() - w0.f <= 1000L) {
                AccessibilityEvent accessibilityEvent0 = this.d(this.u(semanticsNode0.getId()), 0x20000);
                accessibilityEvent0.setFromIndex(w0.d);
                accessibilityEvent0.setToIndex(w0.e);
                accessibilityEvent0.setAction(w0.b);
                accessibilityEvent0.setMovementGranularity(w0.c);
                accessibilityEvent0.getText().add(AndroidComposeViewAccessibilityDelegateCompat.m(semanticsNode0));
                this.w(accessibilityEvent0);
            }
        }
        this.A = null;
    }

    public final void B(IntObjectMap intObjectMap0) {
        int v34;
        ArrayList arrayList4;
        int[] arr_v7;
        long[] arr_v6;
        int v33;
        int v32;
        int v31;
        int v30;
        ArrayList arrayList3;
        int[] arr_v5;
        long[] arr_v4;
        int v29;
        int v12;
        ArrayList arrayList2;
        int[] arr_v3;
        long[] arr_v2;
        int v11;
        int v10;
        int v9;
        int v22;
        int v21;
        AccessibilityEvent accessibilityEvent1;
        int v20;
        int v18;
        boolean z2;
        int v8;
        int v7;
        SemanticsNode semanticsNode1;
        ArrayList arrayList0 = this.M;
        ArrayList arrayList1 = new ArrayList(arrayList0);
        arrayList0.clear();
        int[] arr_v = intObjectMap0.keys;
        long[] arr_v1 = intObjectMap0.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    v34 = v1;
                    v33 = v;
                    arr_v6 = arr_v1;
                    arr_v7 = arr_v;
                    arrayList4 = arrayList0;
                }
                else {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    long v4 = v2;
                    int v5 = 0;
                    while(v5 < v3) {
                        if((v4 & 0xFFL) < 0x80L) {
                            int v6 = arr_v[(v1 << 3) + v5];
                            SemanticsNodeCopy semanticsNodeCopy0 = (SemanticsNodeCopy)this.I.get(v6);
                            if(semanticsNodeCopy0 == null) {
                                goto label_282;
                            }
                            else {
                                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)intObjectMap0.get(v6);
                                SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.getSemanticsNode();
                                if(semanticsNode0 == null) {
                                    throw a.b("no value for specified key");
                                }
                                boolean z = false;
                                for(Object object0: semanticsNode0.getUnmergedConfig$ui_release()) {
                                    Map.Entry map$Entry0 = (Map.Entry)object0;
                                    Object object1 = map$Entry0.getKey();
                                    SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
                                    boolean z1 = true;
                                    if(Intrinsics.areEqual(object1, semanticsProperties0.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(map$Entry0.getKey(), semanticsProperties0.getVerticalScrollAxisRange())) {
                                        ScrollObservationScope scrollObservationScope0 = SemanticsUtils_androidKt.findById(arrayList1, v6);
                                        if(scrollObservationScope0 == null) {
                                            semanticsNode1 = semanticsNode0;
                                            v7 = v6;
                                            v8 = v5;
                                            scrollObservationScope0 = new ScrollObservationScope(v6, arrayList0, null, null, null, null);
                                            z2 = true;
                                        }
                                        else {
                                            semanticsNode1 = semanticsNode0;
                                            v7 = v6;
                                            v8 = v5;
                                            z2 = false;
                                        }
                                        arrayList0.add(scrollObservationScope0);
                                    }
                                    else {
                                        semanticsNode1 = semanticsNode0;
                                        v7 = v6;
                                        v8 = v5;
                                        z2 = false;
                                    }
                                    if(z2 || !Intrinsics.areEqual(map$Entry0.getValue(), SemanticsConfigurationKt.getOrNull(semanticsNodeCopy0.getUnmergedConfig(), ((SemanticsPropertyKey)map$Entry0.getKey())))) {
                                        SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)map$Entry0.getKey();
                                        if(Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getPaneTitle())) {
                                            Object object2 = map$Entry0.getValue();
                                            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.String");
                                            String s = (String)object2;
                                            if(semanticsNodeCopy0.getUnmergedConfig().contains(semanticsProperties0.getPaneTitle())) {
                                                v12 = v7;
                                                this.z(v12, 8, s);
                                            }
                                            else {
                                                v12 = v7;
                                            }
                                            goto label_104;
                                        }
                                        else {
                                            v12 = v7;
                                            String s1 = "";
                                            if((Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getStateDescription()) ? true : Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getToggleableState()))) {
                                                AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v12), 0x800, 0x40, 8);
                                                AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v12), 0x800, 0, 8);
                                                goto label_104;
                                            }
                                            else if(Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getProgressBarRangeInfo())) {
                                                AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v12), 0x800, 0x40, 8);
                                                AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v12), 0x800, 0, 8);
                                                goto label_104;
                                            }
                                            else if(Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getSelected())) {
                                                Role role0 = (Role)SemanticsConfigurationKt.getOrNull(semanticsNode1.getUnmergedConfig$ui_release(), semanticsProperties0.getRole());
                                                if(!(role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 4))) {
                                                    AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v12), 0x800, 0x40, 8);
                                                    AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v12), 0x800, 0, 8);
                                                }
                                                else if(Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode1.getUnmergedConfig$ui_release(), semanticsProperties0.getSelected()), Boolean.TRUE)) {
                                                    AccessibilityEvent accessibilityEvent0 = this.d(this.u(v12), 4);
                                                    SemanticsNode semanticsNode2 = semanticsNode1.copyWithMergingEnabled$ui_release();
                                                    List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode2.getConfig(), semanticsProperties0.getContentDescription());
                                                    String s2 = list0 == null ? null : ListUtilsKt.fastJoinToString$default(list0, ",", null, null, 0, null, null, 62, null);
                                                    List list1 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode2.getConfig(), semanticsProperties0.getText());
                                                    String s3 = list1 == null ? null : ListUtilsKt.fastJoinToString$default(list1, ",", null, null, 0, null, null, 62, null);
                                                    if(s2 != null) {
                                                        accessibilityEvent0.setContentDescription(s2);
                                                    }
                                                    if(s3 != null) {
                                                        accessibilityEvent0.getText().add(s3);
                                                    }
                                                    this.w(accessibilityEvent0);
                                                }
                                                else {
                                                    AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v12), 0x800, 0, 8);
                                                }
                                                goto label_104;
                                            }
                                            else if(Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getContentDescription())) {
                                                int v13 = this.u(v12);
                                                Object object3 = map$Entry0.getValue();
                                                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                this.x(v13, 0x800, 4, ((List)object3));
                                            label_104:
                                                v9 = v3;
                                                v10 = v1;
                                                v11 = v;
                                                arr_v2 = arr_v1;
                                                arr_v3 = arr_v;
                                                arrayList2 = arrayList0;
                                            }
                                            else if(!Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getEditableText())) {
                                                v9 = v3;
                                                v10 = v1;
                                                v11 = v;
                                                arr_v2 = arr_v1;
                                                arr_v3 = arr_v;
                                                arrayList2 = arrayList0;
                                                if(Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getTextSelectionRange())) {
                                                    AnnotatedString annotatedString2 = AndroidComposeViewAccessibilityDelegateCompat.n(semanticsNode1.getUnmergedConfig$ui_release());
                                                    if(annotatedString2 != null) {
                                                        String s4 = annotatedString2.getText();
                                                        if(s4 != null) {
                                                            s1 = s4;
                                                        }
                                                    }
                                                    long v24 = ((TextRange)semanticsNode1.getUnmergedConfig$ui_release().get(semanticsProperties0.getTextSelectionRange())).unbox-impl();
                                                    this.w(this.e(this.u(v12), TextRange.getStart-impl(v24), TextRange.getEnd-impl(v24), s1.length(), AndroidComposeViewAccessibilityDelegateCompat.H(s1)));
                                                    this.A(semanticsNode1.getId());
                                                }
                                                else if((Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getHorizontalScrollAxisRange()) ? true : Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getVerticalScrollAxisRange()))) {
                                                    this.p(semanticsNode1.getLayoutNode$ui_release());
                                                    ScrollObservationScope scrollObservationScope1 = SemanticsUtils_androidKt.findById(arrayList2, v12);
                                                    Intrinsics.checkNotNull(scrollObservationScope1);
                                                    scrollObservationScope1.setHorizontalScrollAxisRange(((ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode1.getUnmergedConfig$ui_release(), semanticsProperties0.getHorizontalScrollAxisRange())));
                                                    scrollObservationScope1.setVerticalScrollAxisRange(((ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode1.getUnmergedConfig$ui_release(), semanticsProperties0.getVerticalScrollAxisRange())));
                                                    if(scrollObservationScope1.isValidOwnerScope()) {
                                                        m m0 = new m(8, scrollObservationScope1, this);
                                                        this.d.getSnapshotObserver().observeReads$ui_release(scrollObservationScope1, this.N, m0);
                                                    }
                                                }
                                                else if(Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties0.getFocused())) {
                                                    Object object4 = map$Entry0.getValue();
                                                    Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Boolean");
                                                    if(((Boolean)object4).booleanValue()) {
                                                        this.w(this.d(this.u(semanticsNode1.getId()), 8));
                                                    }
                                                    AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(semanticsNode1.getId()), 0x800, 0, 8);
                                                }
                                                else {
                                                    SemanticsActions semanticsActions0 = SemanticsActions.INSTANCE;
                                                    if(Intrinsics.areEqual(semanticsPropertyKey0, semanticsActions0.getCustomActions())) {
                                                        List list2 = (List)semanticsNode1.getUnmergedConfig$ui_release().get(semanticsActions0.getCustomActions());
                                                        List list3 = (List)SemanticsConfigurationKt.getOrNull(semanticsNodeCopy0.getUnmergedConfig(), semanticsActions0.getCustomActions());
                                                        if(list3 != null) {
                                                            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                                                            int v25 = list2.size();
                                                            for(int v26 = 0; v26 < v25; ++v26) {
                                                                linkedHashSet0.add(((CustomAccessibilityAction)list2.get(v26)).getLabel());
                                                            }
                                                            LinkedHashSet linkedHashSet1 = new LinkedHashSet();
                                                            int v27 = list3.size();
                                                            for(int v28 = 0; v28 < v27; ++v28) {
                                                                linkedHashSet1.add(((CustomAccessibilityAction)list3.get(v28)).getLabel());
                                                            }
                                                            z = !linkedHashSet0.containsAll(linkedHashSet1) || !linkedHashSet1.containsAll(linkedHashSet0);
                                                        }
                                                        else if(!list2.isEmpty()) {
                                                            arrayList0 = arrayList2;
                                                            v6 = v12;
                                                            v = v11;
                                                            v3 = v9;
                                                            v1 = v10;
                                                            z = true;
                                                            goto label_264;
                                                        }
                                                    }
                                                    else {
                                                        if(map$Entry0.getValue() instanceof AccessibilityAction) {
                                                            Object object5 = map$Entry0.getValue();
                                                            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$accessibilityEquals(((AccessibilityAction)object5), SemanticsConfigurationKt.getOrNull(semanticsNodeCopy0.getUnmergedConfig(), ((SemanticsPropertyKey)map$Entry0.getKey())))) {
                                                                z = false;
                                                                goto label_259;
                                                            }
                                                        }
                                                        z = true;
                                                    }
                                                }
                                            }
                                            else if(semanticsNode1.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText())) {
                                                AnnotatedString annotatedString0 = AndroidComposeViewAccessibilityDelegateCompat.n(semanticsNodeCopy0.getUnmergedConfig());
                                                if(annotatedString0 == null) {
                                                    annotatedString0 = "";
                                                }
                                                AnnotatedString annotatedString1 = AndroidComposeViewAccessibilityDelegateCompat.n(semanticsNode1.getUnmergedConfig$ui_release());
                                                if(annotatedString1 != null) {
                                                    s1 = annotatedString1;
                                                }
                                                CharSequence charSequence0 = AndroidComposeViewAccessibilityDelegateCompat.H(s1);
                                                int v14 = annotatedString0.length();
                                                int v15 = s1.length();
                                                int v16 = c.coerceAtMost(v14, v15);
                                                int v17 = 0;
                                                while(true) {
                                                    if(v17 < v16) {
                                                        v18 = v1;
                                                        if(annotatedString0.charAt(v17) == s1.charAt(v17)) {
                                                            ++v17;
                                                            v1 = v18;
                                                            continue;
                                                        }
                                                        else {
                                                            break;
                                                        }
                                                    }
                                                    v18 = v1;
                                                    break;
                                                }
                                                int v19 = 0;
                                                while(true) {
                                                    if(v19 < v16 - v17) {
                                                        v20 = v;
                                                        if(annotatedString0.charAt(v14 - 1 - v19) == s1.charAt(v15 - 1 - v19)) {
                                                            ++v19;
                                                            v = v20;
                                                            continue;
                                                        }
                                                        else {
                                                            break;
                                                        }
                                                    }
                                                    v20 = v;
                                                    break;
                                                }
                                                SemanticsProperties semanticsProperties1 = SemanticsProperties.INSTANCE;
                                                boolean z3 = semanticsNodeCopy0.getUnmergedConfig().contains(semanticsProperties1.getPassword());
                                                boolean z4 = semanticsNode1.getUnmergedConfig$ui_release().contains(semanticsProperties1.getPassword());
                                                boolean z5 = semanticsNodeCopy0.getUnmergedConfig().contains(semanticsProperties1.getEditableText());
                                                boolean z6 = z5 && !z3 && z4;
                                                if(!z5 || !z3 || z4) {
                                                    z1 = false;
                                                }
                                                if(z6 || z1) {
                                                    v9 = v3;
                                                    v21 = v18;
                                                    v22 = v20;
                                                    arr_v2 = arr_v1;
                                                    arr_v3 = arr_v;
                                                    arrayList2 = arrayList0;
                                                    accessibilityEvent1 = this.e(this.u(v12), 0, 0, v15, charSequence0);
                                                }
                                                else {
                                                    accessibilityEvent1 = this.d(this.u(v12), 16);
                                                    accessibilityEvent1.setFromIndex(v17);
                                                    accessibilityEvent1.setRemovedCount(v14 - v19 - v17);
                                                    accessibilityEvent1.setAddedCount(v15 - v19 - v17);
                                                    accessibilityEvent1.setBeforeText(annotatedString0);
                                                    accessibilityEvent1.getText().add(charSequence0);
                                                    arrayList2 = arrayList0;
                                                    v9 = v3;
                                                    v21 = v18;
                                                    v22 = v20;
                                                    arr_v2 = arr_v1;
                                                    arr_v3 = arr_v;
                                                }
                                                accessibilityEvent1.setClassName("android.widget.EditText");
                                                this.w(accessibilityEvent1);
                                                if(z6 || z1) {
                                                    long v23 = ((TextRange)semanticsNode1.getUnmergedConfig$ui_release().get(semanticsProperties1.getTextSelectionRange())).unbox-impl();
                                                    accessibilityEvent1.setFromIndex(TextRange.getStart-impl(v23));
                                                    accessibilityEvent1.setToIndex(TextRange.getEnd-impl(v23));
                                                    this.w(accessibilityEvent1);
                                                }
                                                v10 = v21;
                                                v11 = v22;
                                            }
                                            else {
                                                v9 = v3;
                                                v11 = v;
                                                arr_v2 = arr_v1;
                                                arr_v3 = arr_v;
                                                arrayList2 = arrayList0;
                                                AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v12), 0x800, 2, 8);
                                                v10 = v1;
                                            }
                                        }
                                    }
                                    else {
                                        v9 = v3;
                                        v10 = v1;
                                        v11 = v;
                                        arr_v2 = arr_v1;
                                        arr_v3 = arr_v;
                                        arrayList2 = arrayList0;
                                        v12 = v7;
                                    }
                                label_259:
                                    arrayList0 = arrayList2;
                                    v6 = v12;
                                    v = v11;
                                    v3 = v9;
                                    v1 = v10;
                                label_264:
                                    arr_v1 = arr_v2;
                                    arr_v = arr_v3;
                                    v5 = v8;
                                    semanticsNode0 = semanticsNode1;
                                }
                                v29 = v1;
                                arr_v4 = arr_v1;
                                arr_v5 = arr_v;
                                arrayList3 = arrayList0;
                                v30 = v5;
                                v31 = v3;
                                v32 = v;
                                if(!z) {
                                    z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$propertiesDeleted(semanticsNode0, semanticsNodeCopy0.getUnmergedConfig());
                                }
                                if(z) {
                                    AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v6), 0x800, 0, 8);
                                }
                            }
                        }
                        else {
                        label_282:
                            v32 = v;
                            arr_v4 = arr_v1;
                            arr_v5 = arr_v;
                            arrayList3 = arrayList0;
                            v30 = v5;
                            v31 = v3;
                            v29 = v1;
                        }
                        v4 >>= 8;
                        arrayList0 = arrayList3;
                        v1 = v29;
                        arr_v1 = arr_v4;
                        arr_v = arr_v5;
                        v = v32;
                        v5 = v30 + 1;
                        v3 = v31;
                    }
                    v33 = v;
                    arr_v6 = arr_v1;
                    arr_v7 = arr_v;
                    arrayList4 = arrayList0;
                    v34 = v1;
                    if(v3 != 8) {
                        break;
                    }
                }
                if(v34 == v33) {
                    break;
                }
                v1 = v34 + 1;
                arrayList0 = arrayList4;
                v = v33;
                arr_v1 = arr_v6;
                arr_v = arr_v7;
            }
        }
    }

    public final void C(LayoutNode layoutNode0, MutableIntSet mutableIntSet0) {
        int v2;
        if(!layoutNode0.isAttached()) {
            return;
        }
        if(this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode0)) {
            return;
        }
        ArraySet arraySet0 = this.x;
        int v = arraySet0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(SemanticsUtils_androidKt.isAncestorOf(((LayoutNode)arraySet0.valueAt(v1)), layoutNode0)) {
                return;
            }
        }
        Trace.beginSection("GetSemanticsNode");
        try {
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            if(!layoutNode0.getNodes$ui_release().has-H91voCI$ui_release(8)) {
                layoutNode0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(layoutNode0, f.C);
            }
            ref$ObjectRef0.element = layoutNode0;
            if(layoutNode0 != null) {
                SemanticsConfiguration semanticsConfiguration0 = layoutNode0.getCollapsedSemantics$ui_release();
                if(semanticsConfiguration0 != null) {
                    if(!semanticsConfiguration0.isMergingSemanticsOfDescendants()) {
                        LayoutNode layoutNode1 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(((LayoutNode)ref$ObjectRef0.element), f.B);
                        if(layoutNode1 != null) {
                            ref$ObjectRef0.element = layoutNode1;
                        }
                    }
                    LayoutNode layoutNode2 = (LayoutNode)ref$ObjectRef0.element;
                    if(layoutNode2 != null) {
                        v2 = layoutNode2.getSemanticsId();
                        goto label_31;
                    }
                    goto label_36;
                }
            }
            goto label_38;
        }
        catch(Throwable throwable0) {
        }
        Trace.endSection();
        throw throwable0;
    label_31:
        Trace.endSection();
        if(!mutableIntSet0.add(v2)) {
            return;
        }
        AndroidComposeViewAccessibilityDelegateCompat.y(this, this.u(v2), 0x800, 1, 8);
        return;
    label_36:
        Trace.endSection();
        return;
    label_38:
        Trace.endSection();
    }

    public final void D(LayoutNode layoutNode0) {
        if(!layoutNode0.isAttached()) {
            return;
        }
        if(this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode0)) {
            return;
        }
        int v = layoutNode0.getSemanticsId();
        ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)this.r.get(v);
        ScrollAxisRange scrollAxisRange1 = (ScrollAxisRange)this.s.get(v);
        if(scrollAxisRange0 == null && scrollAxisRange1 == null) {
            return;
        }
        AccessibilityEvent accessibilityEvent0 = this.d(v, 0x1000);
        if(scrollAxisRange0 != null) {
            accessibilityEvent0.setScrollX(((int)((Number)scrollAxisRange0.getValue().invoke()).floatValue()));
            accessibilityEvent0.setMaxScrollX(((int)((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue()));
        }
        if(scrollAxisRange1 != null) {
            accessibilityEvent0.setScrollY(((int)((Number)scrollAxisRange1.getValue().invoke()).floatValue()));
            accessibilityEvent0.setMaxScrollY(((int)((Number)scrollAxisRange1.getMaxValue().invoke()).floatValue()));
        }
        this.w(accessibilityEvent0);
    }

    public final boolean E(SemanticsNode semanticsNode0, int v, int v1, boolean z) {
        SemanticsActions semanticsActions0 = SemanticsActions.INSTANCE;
        boolean z1 = false;
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
            Function3 function30 = (Function3)((AccessibilityAction)semanticsNode0.getUnmergedConfig$ui_release().get(semanticsActions0.getSetSelection())).getAction();
            return function30 == null ? false : ((Boolean)function30.invoke(v, v1, Boolean.valueOf(z))).booleanValue();
        }
        if(v == v1 && v1 == this.v) {
            return false;
        }
        String s = AndroidComposeViewAccessibilityDelegateCompat.m(semanticsNode0);
        if(s == null) {
            return false;
        }
        if(v < 0 || v != v1 || v1 > s.length()) {
            v = -1;
        }
        this.v = v;
        if(s.length() > 0) {
            z1 = true;
        }
        int v2 = this.u(semanticsNode0.getId());
        Integer integer0 = null;
        Integer integer1 = z1 ? this.v : null;
        Integer integer2 = z1 ? this.v : null;
        if(z1) {
            integer0 = s.length();
        }
        this.w(this.e(v2, integer1, integer2, integer0, s));
        this.A(semanticsNode0.getId());
        return true;
    }

    public final void F() {
        this.D.clear();
        this.E.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.i().get(-1);
        SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.getSemanticsNode();
        Intrinsics.checkNotNull(semanticsNode0);
        boolean z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode0);
        ArrayList arrayList0 = this.G(CollectionsKt__CollectionsKt.mutableListOf(new SemanticsNode[]{semanticsNode0}), z);
        int v = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                int v2 = ((SemanticsNode)arrayList0.get(v1 - 1)).getId();
                int v3 = ((SemanticsNode)arrayList0.get(v1)).getId();
                this.D.set(v2, v3);
                this.E.set(v3, v2);
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    public final ArrayList G(List list0, boolean z) {
        MutableIntObjectMap mutableIntObjectMap0 = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList0 = new ArrayList();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.f(((SemanticsNode)list0.get(v1)), arrayList0, mutableIntObjectMap0);
        }
        ArrayList arrayList1 = new ArrayList();
        int v2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
        if(v2 >= 0) {
            int v3 = 0;
            while(true) {
                SemanticsNode semanticsNode0 = (SemanticsNode)arrayList0.get(v3);
                if(v3 != 0) {
                    float f = semanticsNode0.getBoundsInWindow().getTop();
                    float f1 = semanticsNode0.getBoundsInWindow().getBottom();
                    boolean z1 = Float.compare(f, f1) >= 0;
                    int v4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
                    if(v4 >= 0) {
                        int v5 = 0;
                        while(true) {
                            Rect rect0 = (Rect)((Pair)arrayList1.get(v5)).getFirst();
                            if(!z1 && rect0.getTop() < rect0.getBottom() && Math.max(f, rect0.getTop()) < Math.min(f1, rect0.getBottom())) {
                                arrayList1.set(v5, new Pair(rect0.intersect(0.0f, f, Infinityf, f1), ((Pair)arrayList1.get(v5)).getSecond()));
                                ((List)((Pair)arrayList1.get(v5)).getSecond()).add(semanticsNode0);
                                goto label_29;
                            }
                            if(v5 == v4) {
                                break;
                            }
                            ++v5;
                        }
                    }
                }
                arrayList1.add(new Pair(semanticsNode0.getBoundsInWindow(), CollectionsKt__CollectionsKt.mutableListOf(new SemanticsNode[]{semanticsNode0})));
            label_29:
                if(v3 == v2) {
                    break;
                }
                ++v3;
            }
        }
        n.sortWith(arrayList1, v.d);
        ArrayList arrayList2 = new ArrayList();
        int v6 = arrayList1.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            Pair pair0 = (Pair)arrayList1.get(v7);
            n.sortWith(((List)pair0.getSecond()), new AndroidComposeViewAccessibilityDelegateCompat.semanticComparator..inlined.thenBy.2(new AndroidComposeViewAccessibilityDelegateCompat.semanticComparator..inlined.thenBy.1((z ? v.c : v.b), LayoutNode.Companion.getZComparator$ui_release())));
            arrayList2.addAll(((Collection)pair0.getSecond()));
        }
        n.sortWith(arrayList2, new n1(a0.x, 1));
        int v8 = 0;
        while(v8 <= CollectionsKt__CollectionsKt.getLastIndex(arrayList2)) {
            List list1 = (List)mutableIntObjectMap0.get(((SemanticsNode)arrayList2.get(v8)).getId());
            if(list1 == null) {
                ++v8;
            }
            else {
                if(this.o(((SemanticsNode)arrayList2.get(v8)))) {
                    ++v8;
                }
                else {
                    arrayList2.remove(v8);
                }
                arrayList2.addAll(v8, list1);
                v8 += list1.size();
            }
        }
        return arrayList2;
    }

    public static CharSequence H(CharSequence charSequence0) {
        int v = 100000;
        if(charSequence0 != null && charSequence0.length() != 0 && charSequence0.length() > 100000) {
            if(Character.isHighSurrogate(charSequence0.charAt(0x1869F)) && Character.isLowSurrogate(charSequence0.charAt(100000))) {
                v = 0x1869F;
            }
            charSequence0 = charSequence0.subSequence(0, v);
            Intrinsics.checkNotNull(charSequence0, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        }
        return charSequence0;
    }

    public final void I() {
        String s;
        MutableIntSet mutableIntSet0 = new MutableIntSet(0, 1, null);
        MutableIntSet mutableIntSet1 = this.C;
        int[] arr_v = mutableIntSet1.elements;
        long[] arr_v1 = mutableIntSet1.metadata;
        int v = arr_v1.length - 2;
        MutableIntObjectMap mutableIntObjectMap0 = this.I;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_31;
                }
                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                for(int v4 = 0; v4 < v3; ++v4) {
                    if((v2 & 0xFFL) < 0x80L) {
                        int v5 = arr_v[(v1 << 3) + v4];
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.i().get(v5);
                        SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.getSemanticsNode();
                        if(semanticsNode0 == null || !semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                            mutableIntSet0.add(v5);
                            SemanticsNodeCopy semanticsNodeCopy0 = (SemanticsNodeCopy)mutableIntObjectMap0.get(v5);
                            if(semanticsNodeCopy0 == null) {
                                s = null;
                            }
                            else {
                                SemanticsConfiguration semanticsConfiguration0 = semanticsNodeCopy0.getUnmergedConfig();
                                if(semanticsConfiguration0 != null) {
                                    s = (String)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsProperties.INSTANCE.getPaneTitle());
                                }
                            }
                            this.z(v5, 0x20, s);
                        }
                    }
                    v2 >>= 8;
                }
                if(v3 == 8) {
                label_31:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                }
                goto label_34;
            }
        }
        else {
        label_34:
            mutableIntSet1.removeAll(mutableIntSet0);
            mutableIntObjectMap0.clear();
            IntObjectMap intObjectMap0 = this.i();
            int[] arr_v2 = intObjectMap0.keys;
            Object[] arr_object = intObjectMap0.values;
            long[] arr_v3 = intObjectMap0.metadata;
            int v6 = arr_v3.length - 2;
            if(v6 >= 0) {
                int v7 = 0;
                while(true) {
                    long v8 = arr_v3[v7];
                    if((~v8 << 7 & v8 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v9 = 8 - (~(v7 - v6) >>> 0x1F);
                        for(int v10 = 0; v10 < v9; ++v10) {
                            if((v8 & 0xFFL) < 0x80L) {
                                int v11 = (v7 << 3) + v10;
                                int v12 = arr_v2[v11];
                                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds1 = (SemanticsNodeWithAdjustedBounds)arr_object[v11];
                                SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
                                if(semanticsNodeWithAdjustedBounds1.getSemanticsNode().getUnmergedConfig$ui_release().contains(semanticsProperties0.getPaneTitle()) && mutableIntSet1.add(v12)) {
                                    this.z(v12, 16, ((String)semanticsNodeWithAdjustedBounds1.getSemanticsNode().getUnmergedConfig$ui_release().get(semanticsProperties0.getPaneTitle())));
                                }
                                mutableIntObjectMap0.set(v12, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds1.getSemanticsNode(), this.i()));
                            }
                            v8 >>= 8;
                        }
                        if(v9 == 8) {
                            goto label_60;
                        }
                        break;
                    }
                label_60:
                    if(v7 == v6) {
                        break;
                    }
                    ++v7;
                }
            }
        }
        this.J = new SemanticsNodeCopy(this.d.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.i());
    }

    public final void a(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, String s, Bundle bundle0) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.i().get(v);
        if(semanticsNodeWithAdjustedBounds0 != null) {
            SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.getSemanticsNode();
            if(semanticsNode0 != null) {
                String s1 = AndroidComposeViewAccessibilityDelegateCompat.m(semanticsNode0);
                if(Intrinsics.areEqual(s, this.F)) {
                    int v1 = this.D.getOrDefault(v, -1);
                    if(v1 != -1) {
                        accessibilityNodeInfoCompat0.getExtras().putInt(s, v1);
                    }
                }
                else if(Intrinsics.areEqual(s, this.G)) {
                    int v2 = this.E.getOrDefault(v, -1);
                    if(v2 != -1) {
                        accessibilityNodeInfoCompat0.getExtras().putInt(s, v2);
                    }
                }
                else {
                    if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle0 != null && Intrinsics.areEqual(s, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                        int v3 = bundle0.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                        int v4 = bundle0.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                        if(v4 > 0 && v3 >= 0 && v3 < (s1 == null ? 0x7FFFFFFF : s1.length())) {
                            TextLayoutResult textLayoutResult0 = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode0.getUnmergedConfig$ui_release());
                            if(textLayoutResult0 == null) {
                                return;
                            }
                            ArrayList arrayList0 = new ArrayList();
                            for(int v5 = 0; v5 < v4; ++v5) {
                                int v6 = v3 + v5;
                                RectF rectF0 = null;
                                if(v6 >= textLayoutResult0.getLayoutInput().getText().length()) {
                                    arrayList0.add(null);
                                }
                                else {
                                    Rect rect0 = textLayoutResult0.getBoundingBox(v6).translate-k-4lQ0M(semanticsNode0.getPositionInRoot-F1C5BW0());
                                    Rect rect1 = semanticsNode0.getBoundsInRoot();
                                    Rect rect2 = rect0.overlaps(rect1) ? rect0.intersect(rect1) : null;
                                    if(rect2 != null) {
                                        long v7 = this.d.localToScreen-MK-Hz9U(OffsetKt.Offset(rect2.getLeft(), rect2.getTop()));
                                        long v8 = this.d.localToScreen-MK-Hz9U(OffsetKt.Offset(rect2.getRight(), rect2.getBottom()));
                                        rectF0 = new RectF(Offset.getX-impl(v7), Offset.getY-impl(v7), Offset.getX-impl(v8), Offset.getY-impl(v8));
                                    }
                                    arrayList0.add(rectF0);
                                }
                            }
                            accessibilityNodeInfoCompat0.getExtras().putParcelableArray(s, ((Parcelable[])arrayList0.toArray(new RectF[0])));
                            return;
                        }
                        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                        return;
                    }
                    SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
                    if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties0.getTestTag()) && bundle0 != null && Intrinsics.areEqual(s, "androidx.compose.ui.semantics.testTag")) {
                        String s2 = (String)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getTestTag());
                        if(s2 != null) {
                            accessibilityNodeInfoCompat0.getExtras().putCharSequence(s, s2);
                        }
                    }
                    else if(Intrinsics.areEqual(s, "androidx.compose.ui.semantics.id")) {
                        accessibilityNodeInfoCompat0.getExtras().putInt(s, semanticsNode0.getId());
                    }
                }
            }
        }
    }

    public static final AccessibilityNodeInfoCompat access$createNodeInfo(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, int v) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1;
        State lifecycle$State0;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0;
        AndroidComposeView androidComposeView0 = androidComposeViewAccessibilityDelegateCompat0.d;
        Trace.beginSection("checkIfDestroyed");
        try {
            ViewTreeOwners androidComposeView$ViewTreeOwners0 = androidComposeView0.getViewTreeOwners();
            accessibilityNodeInfoCompat0 = null;
            if(androidComposeView$ViewTreeOwners0 == null) {
                lifecycle$State0 = null;
            }
            else {
                LifecycleOwner lifecycleOwner0 = androidComposeView$ViewTreeOwners0.getLifecycleOwner();
                if(lifecycleOwner0 == null) {
                    lifecycle$State0 = null;
                }
                else {
                    Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
                    lifecycle$State0 = lifecycle0 == null ? null : lifecycle0.getCurrentState();
                }
            }
        }
        catch(Throwable throwable0) {
            Trace.endSection();
            throw throwable0;
        }
        if(lifecycle$State0 == State.DESTROYED) {
            Trace.endSection();
            return null;
        }
        Trace.endSection();
        Trace.beginSection("createAccessibilityNodeInfoObject");
        try {
            accessibilityNodeInfoCompat1 = AccessibilityNodeInfoCompat.obtain();
        }
        catch(Throwable throwable1) {
            Trace.endSection();
            throw throwable1;
        }
        Trace.endSection();
        Trace.beginSection("calculateNodeWithAdjustedBounds");
        try {
            semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)androidComposeViewAccessibilityDelegateCompat0.i().get(v);
        }
        catch(Throwable throwable2) {
            Trace.endSection();
            throw throwable2;
        }
        Trace.endSection();
        if(semanticsNodeWithAdjustedBounds0 != null) {
            SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.getSemanticsNode();
            Trace.beginSection("setParentForAccessibility");
            int v1 = -1;
            try {
                if(v == -1) {
                    ViewParent viewParent0 = androidComposeView0.getParentForAccessibility();
                    if(viewParent0 instanceof View) {
                        accessibilityNodeInfoCompat0 = (View)viewParent0;
                    }
                    accessibilityNodeInfoCompat1.setParent(((View)accessibilityNodeInfoCompat0));
                    goto label_57;
                }
                SemanticsNode semanticsNode1 = semanticsNode0.getParent();
                if(semanticsNode1 != null) {
                    accessibilityNodeInfoCompat0 = semanticsNode1.getId();
                }
                if(accessibilityNodeInfoCompat0 != null) {
                    int v3 = ((Number)accessibilityNodeInfoCompat0).intValue();
                    if(v3 != androidComposeView0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                        v1 = v3;
                    }
                    accessibilityNodeInfoCompat1.setParent(androidComposeView0, v1);
                label_57:
                    accessibilityNodeInfoCompat1.setSource(androidComposeView0, v);
                    Trace.beginSection("setBoundsInScreen");
                    try {
                        accessibilityNodeInfoCompat1.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat0.b(semanticsNodeWithAdjustedBounds0));
                    }
                    catch(Throwable throwable3) {
                        Trace.endSection();
                        throw throwable3;
                    }
                    Trace.endSection();
                    Trace.beginSection("populateAccessibilityNodeInfoProperties");
                    try {
                        androidComposeViewAccessibilityDelegateCompat0.r(v, accessibilityNodeInfoCompat1, semanticsNode0);
                    }
                    catch(Throwable throwable4) {
                        Trace.endSection();
                        throw throwable4;
                    }
                    Trace.endSection();
                    return accessibilityNodeInfoCompat1;
                }
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(("semanticsNode " + v + " has null parent"));
            }
            finally {
                Trace.endSection();
            }
            throw new KotlinNothingValueException();
        }
        return null;
    }

    public static final AccessibilityManager access$getAccessibilityManager$p(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        return androidComposeViewAccessibilityDelegateCompat0.g;
    }

    public static final AccessibilityManager.AccessibilityStateChangeListener access$getEnabledStateListener$p(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        return androidComposeViewAccessibilityDelegateCompat0.j;
    }

    public static final Handler access$getHandler$p(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        return androidComposeViewAccessibilityDelegateCompat0.m;
    }

    public static final Runnable access$getSemanticsChangeChecker$p(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        return androidComposeViewAccessibilityDelegateCompat0.L;
    }

    public static final AccessibilityManager.TouchExplorationStateChangeListener access$getTouchExplorationStateListener$p(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        return androidComposeViewAccessibilityDelegateCompat0.k;
    }

    public static final boolean access$performActionHelper(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, int v, int v1, Bundle bundle0) {
        int v13;
        int v12;
        CharacterTextSegmentIterator accessibilityIterators$CharacterTextSegmentIterator0;
        AccessibilityAction accessibilityAction16;
        int v6;
        float f3;
        Boolean boolean0;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)androidComposeViewAccessibilityDelegateCompat0.i().get(v);
        if(semanticsNodeWithAdjustedBounds0 != null) {
            SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.getSemanticsNode();
            if(semanticsNode0 != null) {
                int v2 = -1;
                String s = null;
                AndroidComposeView androidComposeView0 = androidComposeViewAccessibilityDelegateCompat0.d;
                switch(v1) {
                    case 0x40: {
                        if(androidComposeViewAccessibilityDelegateCompat0.h || androidComposeViewAccessibilityDelegateCompat0.g.isEnabled() && androidComposeViewAccessibilityDelegateCompat0.g.isTouchExplorationEnabled()) {
                            int v14 = androidComposeViewAccessibilityDelegateCompat0.o;
                            if(v14 != v) {
                                if(v14 != 0x80000000) {
                                    AndroidComposeViewAccessibilityDelegateCompat.y(androidComposeViewAccessibilityDelegateCompat0, v14, 0x10000, null, 12);
                                }
                                androidComposeViewAccessibilityDelegateCompat0.o = v;
                                androidComposeView0.invalidate();
                                AndroidComposeViewAccessibilityDelegateCompat.y(androidComposeViewAccessibilityDelegateCompat0, v, 0x8000, null, 12);
                                return true;
                            }
                        }
                        break;
                    }
                    case 0x80: {
                        if(androidComposeViewAccessibilityDelegateCompat0.o == v) {
                            androidComposeViewAccessibilityDelegateCompat0.o = 0x80000000;
                            androidComposeViewAccessibilityDelegateCompat0.p = null;
                            androidComposeView0.invalidate();
                            AndroidComposeViewAccessibilityDelegateCompat.y(androidComposeViewAccessibilityDelegateCompat0, v, 0x10000, null, 12);
                            return true;
                        }
                        break;
                    }
                    default: {
                        if(v1 != 0x100 && v1 != 0x200) {
                            switch(v1) {
                                case 0x4000: {
                                    AccessibilityAction accessibilityAction20 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCopyText());
                                    if(accessibilityAction20 == null) {
                                        return false;
                                    }
                                    Function0 function015 = (Function0)accessibilityAction20.getAction();
                                    return function015 == null ? false : ((Boolean)function015.invoke()).booleanValue();
                                }
                                case 0x20000: {
                                    int v3 = bundle0 == null ? -1 : bundle0.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                    if(bundle0 != null) {
                                        v2 = bundle0.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
                                    }
                                    boolean z = androidComposeViewAccessibilityDelegateCompat0.E(semanticsNode0, v3, v2, false);
                                    if(z) {
                                        AndroidComposeViewAccessibilityDelegateCompat.y(androidComposeViewAccessibilityDelegateCompat0, androidComposeViewAccessibilityDelegateCompat0.u(semanticsNode0.getId()), 0, null, 12);
                                    }
                                    return z;
                                label_18:
                                    if(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
                                        return false;
                                    }
                                    switch(v1) {
                                        case 1: {
                                            AccessibilityAction accessibilityAction19 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getRequestFocus());
                                            if(accessibilityAction19 == null) {
                                                return false;
                                            }
                                            Function0 function014 = (Function0)accessibilityAction19.getAction();
                                            return function014 == null ? false : ((Boolean)function014.invoke()).booleanValue();
                                        }
                                        case 2: {
                                            if(!Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
                                                return false;
                                            }
                                            androidComposeView0.getFocusOwner().clearFocus-I7lrPNg(false, true, true, 8);
                                            return true;
                                        }
                                        default: {
                                            float f = 0.0f;
                                            switch(v1) {
                                                case 16: {
                                                    AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnClick());
                                                    if(accessibilityAction0 == null) {
                                                        boolean0 = null;
                                                    }
                                                    else {
                                                        Function0 function00 = (Function0)accessibilityAction0.getAction();
                                                        boolean0 = function00 == null ? null : ((Boolean)function00.invoke());
                                                    }
                                                    AndroidComposeViewAccessibilityDelegateCompat.y(androidComposeViewAccessibilityDelegateCompat0, v, 1, null, 12);
                                                    return boolean0 == null ? false : boolean0.booleanValue();
                                                label_34:
                                                    if(v1 != 0x1020038 && v1 != 0x1020039 && v1 != 0x102003A && v1 != 0x102003B) {
                                                        switch(v1) {
                                                            case 0x1020046: {
                                                                AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageUp());
                                                                if(accessibilityAction1 == null) {
                                                                    return false;
                                                                }
                                                                Function0 function01 = (Function0)accessibilityAction1.getAction();
                                                                return function01 == null ? false : ((Boolean)function01.invoke()).booleanValue();
                                                            }
                                                            case 0x1020047: {
                                                                AccessibilityAction accessibilityAction2 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageDown());
                                                                if(accessibilityAction2 == null) {
                                                                    return false;
                                                                }
                                                                Function0 function02 = (Function0)accessibilityAction2.getAction();
                                                                return function02 == null ? false : ((Boolean)function02.invoke()).booleanValue();
                                                            }
                                                            case 0x1020048: {
                                                                AccessibilityAction accessibilityAction3 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageLeft());
                                                                if(accessibilityAction3 == null) {
                                                                    return false;
                                                                }
                                                                Function0 function03 = (Function0)accessibilityAction3.getAction();
                                                                return function03 == null ? false : ((Boolean)function03.invoke()).booleanValue();
                                                            }
                                                            case 0x1020049: {
                                                                AccessibilityAction accessibilityAction4 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageRight());
                                                                if(accessibilityAction4 == null) {
                                                                    return false;
                                                                }
                                                                Function0 function04 = (Function0)accessibilityAction4.getAction();
                                                                return function04 == null ? false : ((Boolean)function04.invoke()).booleanValue();
                                                            }
                                                            default: {
                                                                SparseArrayCompat sparseArrayCompat0 = (SparseArrayCompat)androidComposeViewAccessibilityDelegateCompat0.t.get(v);
                                                                if(sparseArrayCompat0 == null) {
                                                                    return false;
                                                                }
                                                                CharSequence charSequence0 = (CharSequence)sparseArrayCompat0.get(v1);
                                                                if(charSequence0 == null) {
                                                                    return false;
                                                                }
                                                                List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCustomActions());
                                                                if(list0 == null) {
                                                                    return false;
                                                                }
                                                                int v4 = list0.size();
                                                                for(int v5 = 0; v5 < v4; ++v5) {
                                                                    CustomAccessibilityAction customAccessibilityAction0 = (CustomAccessibilityAction)list0.get(v5);
                                                                    if(Intrinsics.areEqual(customAccessibilityAction0.getLabel(), charSequence0)) {
                                                                        return ((Boolean)customAccessibilityAction0.getAction().invoke()).booleanValue();
                                                                    }
                                                                }
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                    goto label_71;
                                                }
                                                case 0x20: {
                                                    AccessibilityAction accessibilityAction5 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnLongClick());
                                                    if(accessibilityAction5 == null) {
                                                        return false;
                                                    }
                                                    Function0 function05 = (Function0)accessibilityAction5.getAction();
                                                    return function05 == null ? false : ((Boolean)function05.invoke()).booleanValue();
                                                }
                                                case 0x1000: 
                                                case 0x2000: {
                                                label_71:
                                                    if(v1 == 0x1000 || v1 == 0x2000) {
                                                        ProgressBarRangeInfo progressBarRangeInfo0 = (ProgressBarRangeInfo)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
                                                        AccessibilityAction accessibilityAction6 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
                                                        if(progressBarRangeInfo0 != null && accessibilityAction6 != null) {
                                                            float f1 = c.coerceAtLeast(((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getStart()).floatValue());
                                                            float f2 = c.coerceAtMost(((Number)progressBarRangeInfo0.getRange().getStart()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue());
                                                            if(progressBarRangeInfo0.getSteps() > 0) {
                                                                f3 = f1 - f2;
                                                                v6 = progressBarRangeInfo0.getSteps() + 1;
                                                            }
                                                            else {
                                                                f3 = f1 - f2;
                                                                v6 = 20;
                                                            }
                                                            float f4 = f3 / ((float)v6);
                                                            if(v1 == 0x2000) {
                                                                f4 = -f4;
                                                            }
                                                            Function1 function10 = (Function1)accessibilityAction6.getAction();
                                                            return function10 == null ? false : ((Boolean)function10.invoke(((float)(progressBarRangeInfo0.getCurrent() + f4)))).booleanValue();
                                                        }
                                                    }
                                                    long v7 = LayoutCoordinatesKt.boundsInParent(semanticsNode0.getLayoutInfo().getCoordinates()).getSize-NH-jbRc();
                                                    Float float0 = SemanticsUtils_androidKt.getScrollViewportLength(semanticsNode0.getUnmergedConfig$ui_release());
                                                    SemanticsActions semanticsActions0 = SemanticsActions.INSTANCE;
                                                    AccessibilityAction accessibilityAction7 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getScrollBy());
                                                    if(accessibilityAction7 == null) {
                                                        return false;
                                                    }
                                                    SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
                                                    ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getHorizontalScrollAxisRange());
                                                    if(scrollAxisRange0 != null && (v1 == 0x1020039 || v1 == 0x102003B || v1 == 0x1000 || v1 == 0x2000)) {
                                                        float f5 = float0 == null ? Size.getWidth-impl(v7) : ((float)float0);
                                                        if(v1 == 0x1020039 || v1 == 0x2000) {
                                                            f5 = -f5;
                                                        }
                                                        if(scrollAxisRange0.getReverseScrolling()) {
                                                            f5 = -f5;
                                                        }
                                                        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode0) && (v1 == 0x1020039 || v1 == 0x102003B)) {
                                                            f5 = -f5;
                                                        }
                                                        if(AndroidComposeViewAccessibilityDelegateCompat.q(scrollAxisRange0, f5)) {
                                                            if(!semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getPageLeft()) && !semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getPageRight())) {
                                                                Function2 function20 = (Function2)accessibilityAction7.getAction();
                                                                return function20 == null ? false : ((Boolean)function20.invoke(f5, 0.0f)).booleanValue();
                                                            }
                                                            AccessibilityAction accessibilityAction8 = f5 > 0.0f ? ((AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPageRight())) : ((AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPageLeft()));
                                                            if(accessibilityAction8 == null) {
                                                                return false;
                                                            }
                                                            Function0 function06 = (Function0)accessibilityAction8.getAction();
                                                            return function06 == null ? false : ((Boolean)function06.invoke()).booleanValue();
                                                        }
                                                    }
                                                    ScrollAxisRange scrollAxisRange1 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getVerticalScrollAxisRange());
                                                    if(scrollAxisRange1 == null || v1 != 0x1020038 && v1 != 0x102003A && v1 != 0x1000 && v1 != 0x2000) {
                                                        return false;
                                                    }
                                                    float f6 = float0 == null ? Size.getHeight-impl(v7) : ((float)float0);
                                                    if(v1 == 0x1020038 || v1 == 0x2000) {
                                                        f6 = -f6;
                                                    }
                                                    if(scrollAxisRange1.getReverseScrolling()) {
                                                        f6 = -f6;
                                                    }
                                                    if(!AndroidComposeViewAccessibilityDelegateCompat.q(scrollAxisRange1, f6)) {
                                                        return false;
                                                    }
                                                    if(!semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getPageUp()) && !semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getPageDown())) {
                                                        Function2 function21 = (Function2)accessibilityAction7.getAction();
                                                        return function21 == null ? false : ((Boolean)function21.invoke(0.0f, f6)).booleanValue();
                                                    }
                                                    AccessibilityAction accessibilityAction9 = f6 > 0.0f ? ((AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPageDown())) : ((AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPageUp()));
                                                    if(accessibilityAction9 == null) {
                                                        return false;
                                                    }
                                                    Function0 function07 = (Function0)accessibilityAction9.getAction();
                                                    return function07 == null ? false : ((Boolean)function07.invoke()).booleanValue();
                                                }
                                                case 0x8000: {
                                                    AccessibilityAction accessibilityAction10 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPasteText());
                                                    if(accessibilityAction10 == null) {
                                                        return false;
                                                    }
                                                    Function0 function08 = (Function0)accessibilityAction10.getAction();
                                                    return function08 == null ? false : ((Boolean)function08.invoke()).booleanValue();
                                                }
                                                case 0x10000: {
                                                    AccessibilityAction accessibilityAction11 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCutText());
                                                    if(accessibilityAction11 == null) {
                                                        return false;
                                                    }
                                                    Function0 function09 = (Function0)accessibilityAction11.getAction();
                                                    return function09 == null ? false : ((Boolean)function09.invoke()).booleanValue();
                                                }
                                                case 0x40000: {
                                                    AccessibilityAction accessibilityAction12 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getExpand());
                                                    if(accessibilityAction12 == null) {
                                                        return false;
                                                    }
                                                    Function0 function010 = (Function0)accessibilityAction12.getAction();
                                                    return function010 == null ? false : ((Boolean)function010.invoke()).booleanValue();
                                                }
                                                case 0x80000: {
                                                    AccessibilityAction accessibilityAction13 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCollapse());
                                                    if(accessibilityAction13 == null) {
                                                        return false;
                                                    }
                                                    Function0 function011 = (Function0)accessibilityAction13.getAction();
                                                    return function011 == null ? false : ((Boolean)function011.invoke()).booleanValue();
                                                }
                                                case 0x100000: {
                                                    AccessibilityAction accessibilityAction14 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getDismiss());
                                                    if(accessibilityAction14 == null) {
                                                        return false;
                                                    }
                                                    Function0 function012 = (Function0)accessibilityAction14.getAction();
                                                    return function012 == null ? false : ((Boolean)function012.invoke()).booleanValue();
                                                }
                                                case 0x200000: {
                                                    if(bundle0 != null) {
                                                        s = bundle0.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                                    }
                                                    AccessibilityAction accessibilityAction15 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetText());
                                                    if(accessibilityAction15 == null) {
                                                        return false;
                                                    }
                                                    Function1 function11 = (Function1)accessibilityAction15.getAction();
                                                    if(function11 == null) {
                                                        return false;
                                                    }
                                                    if(s == null) {
                                                        s = "";
                                                    }
                                                    return ((Boolean)function11.invoke(new AnnotatedString(s, null, null, 6, null))).booleanValue();
                                                }
                                                case 0x1020036: {
                                                    SemanticsNode semanticsNode1 = semanticsNode0.getParent();
                                                    if(semanticsNode1 != null) {
                                                        SemanticsConfiguration semanticsConfiguration0 = semanticsNode1.getUnmergedConfig$ui_release();
                                                        if(semanticsConfiguration0 != null) {
                                                            accessibilityAction16 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getScrollBy());
                                                            goto label_162;
                                                        }
                                                    }
                                                alab1:
                                                    while(true) {
                                                        while(true) {
                                                            accessibilityAction16 = null;
                                                        label_162:
                                                            if(semanticsNode1 == null || accessibilityAction16 != null) {
                                                                break alab1;
                                                            }
                                                            semanticsNode1 = semanticsNode1.getParent();
                                                            if(semanticsNode1 == null) {
                                                                break;
                                                            }
                                                            SemanticsConfiguration semanticsConfiguration1 = semanticsNode1.getUnmergedConfig$ui_release();
                                                            if(semanticsConfiguration1 == null) {
                                                                break;
                                                            }
                                                            accessibilityAction16 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration1, SemanticsActions.INSTANCE.getScrollBy());
                                                            goto label_162;
                                                        }
                                                    }
                                                    if(semanticsNode1 == null) {
                                                        return false;
                                                    }
                                                    Rect rect0 = LayoutCoordinatesKt.boundsInParent(semanticsNode1.getLayoutInfo().getCoordinates());
                                                    LayoutCoordinates layoutCoordinates0 = semanticsNode1.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
                                                    Rect rect1 = rect0.translate-k-4lQ0M((layoutCoordinates0 == null ? 0L : LayoutCoordinatesKt.positionInRoot(layoutCoordinates0)));
                                                    Rect rect2 = RectKt.Rect-tz77jQw(semanticsNode0.getPositionInRoot-F1C5BW0(), IntSizeKt.toSize-ozmzZPI(semanticsNode0.getSize-YbymL2g()));
                                                    ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode1.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                                                    ScrollAxisRange scrollAxisRange3 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode1.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                                                    float f7 = rect2.getLeft() - rect1.getLeft();
                                                    float f8 = rect2.getRight() - rect1.getRight();
                                                    if(Math.signum(f7) != Math.signum(f8)) {
                                                        f7 = 0.0f;
                                                    }
                                                    else if(Math.abs(f7) >= Math.abs(f8)) {
                                                        f7 = f8;
                                                    }
                                                    if(scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
                                                        f7 = -f7;
                                                    }
                                                    if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode0)) {
                                                        f7 = -f7;
                                                    }
                                                    float f9 = rect2.getTop() - rect1.getTop();
                                                    float f10 = rect2.getBottom() - rect1.getBottom();
                                                    if(Math.signum(f9) == Math.signum(f10)) {
                                                        f = Math.abs(f9) < Math.abs(f10) ? f9 : f10;
                                                    }
                                                    if(scrollAxisRange3 != null && scrollAxisRange3.getReverseScrolling()) {
                                                        f = -f;
                                                    }
                                                    if(accessibilityAction16 == null) {
                                                        return false;
                                                    }
                                                    Function2 function22 = (Function2)accessibilityAction16.getAction();
                                                    return function22 == null ? false : ((Boolean)function22.invoke(f7, f)).booleanValue();
                                                }
                                                case 0x102003D: {
                                                    if(bundle0 == null || !bundle0.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                        return false;
                                                    }
                                                    AccessibilityAction accessibilityAction17 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
                                                    if(accessibilityAction17 == null) {
                                                        return false;
                                                    }
                                                    Function1 function12 = (Function1)accessibilityAction17.getAction();
                                                    return function12 == null ? false : ((Boolean)function12.invoke(bundle0.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))).booleanValue();
                                                }
                                                case 0x1020054: {
                                                    AccessibilityAction accessibilityAction18 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnImeAction());
                                                    if(accessibilityAction18 == null) {
                                                        return false;
                                                    }
                                                    Function0 function013 = (Function0)accessibilityAction18.getAction();
                                                    return function013 == null ? false : ((Boolean)function013.invoke()).booleanValue();
                                                }
                                                default: {
                                                    goto label_34;
                                                }
                                            }
                                        }
                                    }
                                }
                                default: {
                                    goto label_18;
                                }
                            }
                        }
                        if(bundle0 != null) {
                            int v8 = bundle0.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                            boolean z1 = bundle0.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                            if(androidComposeViewAccessibilityDelegateCompat0.w == null || semanticsNode0.getId() != ((int)androidComposeViewAccessibilityDelegateCompat0.w)) {
                                androidComposeViewAccessibilityDelegateCompat0.v = -1;
                                androidComposeViewAccessibilityDelegateCompat0.w = semanticsNode0.getId();
                            }
                            String s1 = AndroidComposeViewAccessibilityDelegateCompat.m(semanticsNode0);
                            if(s1 != null && s1.length() != 0) {
                                String s2 = AndroidComposeViewAccessibilityDelegateCompat.m(semanticsNode0);
                                if(s2 != null && s2.length() != 0) {
                                    switch(v8) {
                                        case 1: {
                                            Configuration configuration0 = androidComposeView0.getContext().getResources().getConfiguration();
                                            accessibilityIterators$CharacterTextSegmentIterator0 = CharacterTextSegmentIterator.Companion.getInstance(configuration0.locale);
                                            accessibilityIterators$CharacterTextSegmentIterator0.initialize(s2);
                                            goto label_245;
                                        }
                                        case 2: {
                                            Configuration configuration1 = androidComposeView0.getContext().getResources().getConfiguration();
                                            accessibilityIterators$CharacterTextSegmentIterator0 = WordTextSegmentIterator.Companion.getInstance(configuration1.locale);
                                            ((WordTextSegmentIterator)accessibilityIterators$CharacterTextSegmentIterator0).initialize(s2);
                                            goto label_245;
                                        }
                                        case 8: {
                                            accessibilityIterators$CharacterTextSegmentIterator0 = ParagraphTextSegmentIterator.Companion.getInstance();
                                            accessibilityIterators$CharacterTextSegmentIterator0.initialize(s2);
                                            s = accessibilityIterators$CharacterTextSegmentIterator0;
                                            break;
                                        }
                                        case 4: 
                                        case 16: {
                                            if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                                                TextLayoutResult textLayoutResult0 = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode0.getUnmergedConfig$ui_release());
                                                if(textLayoutResult0 != null) {
                                                    if(v8 == 4) {
                                                        accessibilityIterators$CharacterTextSegmentIterator0 = LineTextSegmentIterator.Companion.getInstance();
                                                        ((LineTextSegmentIterator)accessibilityIterators$CharacterTextSegmentIterator0).initialize(s2, textLayoutResult0);
                                                    }
                                                    else {
                                                        accessibilityIterators$CharacterTextSegmentIterator0 = PageTextSegmentIterator.Companion.getInstance();
                                                        ((PageTextSegmentIterator)accessibilityIterators$CharacterTextSegmentIterator0).initialize(s2, textLayoutResult0, semanticsNode0);
                                                    }
                                                label_245:
                                                    s = accessibilityIterators$CharacterTextSegmentIterator0;
                                                }
                                            }
                                        }
                                    }
                                }
                                if(s != null) {
                                    int v9 = androidComposeViewAccessibilityDelegateCompat0.g(semanticsNode0);
                                    if(v9 == -1) {
                                        v9 = v1 == 0x100 ? s1.length() : 0;
                                    }
                                    int[] arr_v = v1 == 0x100 ? ((TextSegmentIterator)s).preceding(v9) : ((TextSegmentIterator)s).following(v9);
                                    if(arr_v != null) {
                                        int v10 = arr_v[0];
                                        int v11 = arr_v[1];
                                        if(!z1 || (semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText()))) {
                                            v12 = v1 == 0x100 ? v10 : v11;
                                            v13 = v12;
                                        }
                                        else {
                                            v12 = androidComposeViewAccessibilityDelegateCompat0.h(semanticsNode0);
                                            if(v12 == -1) {
                                                v12 = v1 == 0x100 ? v11 : v10;
                                            }
                                            v13 = v1 == 0x100 ? v10 : v11;
                                        }
                                        androidComposeViewAccessibilityDelegateCompat0.A = new w(semanticsNode0, (v1 == 0x100 ? 0x200 : 0x100), v8, v10, v11, SystemClock.uptimeMillis());
                                        androidComposeViewAccessibilityDelegateCompat0.E(semanticsNode0, v12, v13, true);
                                        return true;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final void access$scheduleScrollEventIfNeeded(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, ScrollObservationScope scrollObservationScope0) {
        androidComposeViewAccessibilityDelegateCompat0.getClass();
        if(scrollObservationScope0.isValidOwnerScope()) {
            m m0 = new m(8, scrollObservationScope0, androidComposeViewAccessibilityDelegateCompat0);
            androidComposeViewAccessibilityDelegateCompat0.d.getSnapshotObserver().observeReads$ui_release(scrollObservationScope0, androidComposeViewAccessibilityDelegateCompat0.N, m0);
        }
    }

    public final android.graphics.Rect b(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0) {
        android.graphics.Rect rect0 = semanticsNodeWithAdjustedBounds0.getAdjustedBounds();
        long v = this.d.localToScreen-MK-Hz9U(OffsetKt.Offset(rect0.left, rect0.top));
        long v1 = this.d.localToScreen-MK-Hz9U(OffsetKt.Offset(rect0.right, rect0.bottom));
        return new android.graphics.Rect(((int)(((float)Math.floor(Offset.getX-impl(v))))), ((int)(((float)Math.floor(Offset.getY-impl(v))))), ((int)(((float)Math.ceil(Offset.getX-impl(v1))))), ((int)(((float)Math.ceil(Offset.getY-impl(v1))))));
    }

    @Nullable
    public final Object boundsUpdatesEventLoop$ui_release(@NotNull Continuation continuation0) {
        MutableIntSet mutableIntSet1;
        ChannelIterator channelIterator0;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0;
        MutableIntSet mutableIntSet0;
        x x0;
        if(continuation0 instanceof x) {
            x0 = (x)continuation0;
            int v = x0.t;
            if((v & 0x80000000) == 0) {
                x0 = new x(this, continuation0);
            }
            else {
                x0.t = v ^ 0x80000000;
            }
        }
        else {
            x0 = new x(this, continuation0);
        }
        Object object0 = x0.r;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(x0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    mutableIntSet0 = new MutableIntSet(0, 1, null);
                    androidComposeViewAccessibilityDelegateCompat0 = this;
                    channelIterator0 = this.y.iterator();
                    androidComposeViewAccessibilityDelegateCompat0 = this;
                    goto label_30;
                label_19:
                    channelIterator0 = x0.q;
                    mutableIntSet1 = x0.p;
                    androidComposeViewAccessibilityDelegateCompat0 = x0.o;
                    ResultKt.throwOnFailure(object0);
                    goto label_39;
                }
                catch(Throwable throwable0) {
                    androidComposeViewAccessibilityDelegateCompat0.x.clear();
                    throw throwable0;
                }
            }
            case 1: {
                goto label_19;
            }
            case 2: {
                try {
                    channelIterator0 = x0.q;
                    mutableIntSet1 = x0.p;
                    androidComposeViewAccessibilityDelegateCompat0 = x0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable1) {
                    goto label_77;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            try {
            label_28:
                mutableIntSet0 = mutableIntSet1;
                Trace.endSection();
            label_30:
                x0.o = androidComposeViewAccessibilityDelegateCompat0;
                x0.p = mutableIntSet0;
                x0.q = channelIterator0;
                x0.t = 1;
                Object object2 = channelIterator0.hasNext(x0);
                if(object2 == object1) {
                    return object1;
                }
                mutableIntSet1 = mutableIntSet0;
                object0 = object2;
            label_39:
                if(!((Boolean)object0).booleanValue()) {
                    break;
                }
                channelIterator0.next();
                Trace.beginSection("AccessibilityLoopIteration");
            }
            catch(Throwable throwable0) {
                androidComposeViewAccessibilityDelegateCompat0.x.clear();
                throw throwable0;
            }
            try {
                boolean z = androidComposeViewAccessibilityDelegateCompat0.isEnabled$ui_release();
                ArraySet arraySet0 = androidComposeViewAccessibilityDelegateCompat0.x;
                if(z) {
                    int v1 = arraySet0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        LayoutNode layoutNode0 = (LayoutNode)arraySet0.valueAt(v2);
                        Trace.beginSection("sendSubtreeChangeAccessibilityEvents");
                        try {
                            androidComposeViewAccessibilityDelegateCompat0.C(layoutNode0, mutableIntSet1);
                        }
                        finally {
                            Trace.endSection();
                        }
                        Trace.beginSection("sendTypeViewScrolledAccessibilityEvent");
                        try {
                            androidComposeViewAccessibilityDelegateCompat0.D(layoutNode0);
                        }
                        finally {
                            Trace.endSection();
                        }
                    }
                    mutableIntSet1.clear();
                    if(!androidComposeViewAccessibilityDelegateCompat0.K) {
                        androidComposeViewAccessibilityDelegateCompat0.K = true;
                        androidComposeViewAccessibilityDelegateCompat0.m.post(androidComposeViewAccessibilityDelegateCompat0.L);
                    }
                }
                arraySet0.clear();
                androidComposeViewAccessibilityDelegateCompat0.r.clear();
                androidComposeViewAccessibilityDelegateCompat0.s.clear();
                x0.o = androidComposeViewAccessibilityDelegateCompat0;
                x0.p = mutableIntSet1;
                x0.q = channelIterator0;
                x0.t = 2;
                if(DelayKt.delay(androidComposeViewAccessibilityDelegateCompat0.i, x0) != object1) {
                    goto label_28;
                }
                return object1;
            }
            catch(Throwable throwable1) {
                try {
                label_77:
                    Trace.endSection();
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                }
            }
            androidComposeViewAccessibilityDelegateCompat0.x.clear();
            throw throwable0;
        }
        androidComposeViewAccessibilityDelegateCompat0.x.clear();
        return Unit.INSTANCE;
    }

    public final void c() {
        int v2;
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if(this.isEnabled$ui_release()) {
                this.v(this.d.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.J);
            }
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                this.B(this.i());
            }
            Trace.beginSection("updateSemanticsNodesCopyAndPanes");
            v2 = FIN.finallyOpen$NT();
            this.I();
            FIN.finallyCodeBegin$NT(v2);
        }
        finally {
            Trace.endSection();
        }
        FIN.finallyCodeEnd$NT(v2);
    }

    public final boolean canScroll-0AR0LA0$ui_release(boolean z, int v, long v1) {
        if(!Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        this.i();
        return false;
    }

    public final AccessibilityEvent d(int v, int v1) {
        int v4;
        AccessibilityEvent accessibilityEvent0;
        Trace.beginSection("obtainAccessibilityEvent");
        try {
            accessibilityEvent0 = AccessibilityEvent.obtain(v1);
            accessibilityEvent0.setEnabled(true);
            accessibilityEvent0.setClassName("android.view.View");
            Trace.beginSection("event.packageName");
            try {
                accessibilityEvent0.setPackageName("net.daum.android.tistoryapp");
            }
            Trace.beginSection("event.setSource");
            v4 = FIN.finallyOpen$NT();
            accessibilityEvent0.setSource(this.d, v);
            FIN.finallyCodeBegin$NT(v4);
        }
        finally {
            Trace.endSection();
        }
        FIN.finallyCodeEnd$NT(v4);
        if(this.isEnabled$ui_release()) {
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.i().get(v);
            if(semanticsNodeWithAdjustedBounds0 != null) {
                accessibilityEvent0.setPassword(semanticsNodeWithAdjustedBounds0.getSemanticsNode().getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPassword()));
            }
        }
        return accessibilityEvent0;
    }

    public final boolean dispatchHoverEvent$ui_release(@NotNull MotionEvent motionEvent0) {
        if(!this.h && (!this.g.isEnabled() || !this.g.isTouchExplorationEnabled())) {
            return false;
        }
        int v = motionEvent0.getAction();
        AndroidComposeView androidComposeView0 = this.d;
        switch(v) {
            case 7: 
            case 9: {
                int v1 = this.hitTestSemanticsAt$ui_release(motionEvent0.getX(), motionEvent0.getY());
                boolean z = androidComposeView0.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent0);
                int v2 = this.e;
                if(v2 != v1) {
                    this.e = v1;
                    AndroidComposeViewAccessibilityDelegateCompat.y(this, v1, 0x80, null, 12);
                    AndroidComposeViewAccessibilityDelegateCompat.y(this, v2, 0x100, null, 12);
                }
                return v1 == 0x80000000 ? z : true;
            }
            case 10: {
                int v3 = this.e;
                if(v3 != 0x80000000) {
                    this.e = 0x80000000;
                    AndroidComposeViewAccessibilityDelegateCompat.y(this, 0x80000000, 0x80, null, 12);
                    AndroidComposeViewAccessibilityDelegateCompat.y(this, v3, 0x100, null, 12);
                    return true;
                }
                return androidComposeView0.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent0);
            }
            default: {
                return false;
            }
        }
    }

    public final AccessibilityEvent e(int v, Integer integer0, Integer integer1, Integer integer2, CharSequence charSequence0) {
        AccessibilityEvent accessibilityEvent0 = this.d(v, 0x2000);
        if(integer0 != null) {
            accessibilityEvent0.setFromIndex(integer0.intValue());
        }
        if(integer1 != null) {
            accessibilityEvent0.setToIndex(integer1.intValue());
        }
        if(integer2 != null) {
            accessibilityEvent0.setItemCount(integer2.intValue());
        }
        if(charSequence0 != null) {
            accessibilityEvent0.getText().add(charSequence0);
        }
        return accessibilityEvent0;
    }

    public final void f(SemanticsNode semanticsNode0, ArrayList arrayList0, MutableIntObjectMap mutableIntObjectMap0) {
        boolean z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode0);
        boolean z1 = ((Boolean)semanticsNode0.getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), y.x)).booleanValue();
        if((z1 || this.o(semanticsNode0)) && this.i().containsKey(semanticsNode0.getId())) {
            arrayList0.add(semanticsNode0);
        }
        if(z1) {
            mutableIntObjectMap0.set(semanticsNode0.getId(), this.G(CollectionsKt___CollectionsKt.toMutableList(semanticsNode0.getChildren()), z));
            return;
        }
        List list0 = semanticsNode0.getChildren();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.f(((SemanticsNode)list0.get(v1)), arrayList0, mutableIntObjectMap0);
        }
    }

    // 去混淆评级： 低(20)
    public final int g(SemanticsNode semanticsNode0) {
        return semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange()) ? this.v : TextRange.getEnd-impl(((TextRange)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).unbox-impl());
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.h;
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    @NotNull
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NotNull View view0) {
        return this.n;
    }

    @NotNull
    public final String getExtraDataTestTraversalAfterVal$ui_release() {
        return this.G;
    }

    @NotNull
    public final String getExtraDataTestTraversalBeforeVal$ui_release() {
        return this.F;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.e;
    }

    @VisibleForTesting
    public static void getHoveredVirtualViewId$ui_release$annotations() {
    }

    @NotNull
    public final MutableIntIntMap getIdToAfterMap$ui_release() {
        return this.E;
    }

    @NotNull
    public final MutableIntIntMap getIdToBeforeMap$ui_release() {
        return this.D;
    }

    @NotNull
    public final Function1 getOnSendAccessibilityEvent$ui_release() {
        return this.f;
    }

    @VisibleForTesting
    public static void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui_release() {
        return this.i;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.d;
    }

    // 去混淆评级： 低(20)
    public final int h(SemanticsNode semanticsNode0) {
        return semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange()) ? this.v : TextRange.getStart-impl(((TextRange)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).unbox-impl());
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float f, float f1) {
        AndroidComposeView androidComposeView0 = this.d;
        LayoutNode layoutNode0 = null;
        Owner.measureAndLayout$default(androidComposeView0, false, 1, null);
        HitTestResult hitTestResult0 = new HitTestResult();
        LayoutNode.hitTestSemantics-M_7yMNQ$ui_release$default(androidComposeView0.getRoot(), OffsetKt.Offset(f, f1), hitTestResult0, false, false, 12, null);
        Node modifier$Node0 = (Node)CollectionsKt___CollectionsKt.lastOrNull(hitTestResult0);
        if(modifier$Node0 != null) {
            layoutNode0 = DelegatableNodeKt.requireLayoutNode(modifier$Node0);
        }
        if(layoutNode0 != null) {
            NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
            return nodeChain0 == null || !nodeChain0.has-H91voCI$ui_release(8) || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isVisible(SemanticsNodeKt.SemanticsNode(layoutNode0, false)) || ((AndroidViewHolder)androidComposeView0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNode0)) != null ? 0x80000000 : this.u(layoutNode0.getSemanticsId());
        }
        return 0x80000000;
    }

    public final IntObjectMap i() {
        IntObjectMap intObjectMap0;
        if(this.z) {
            this.z = false;
            Trace.beginSection("generateCurrentSemanticsNodes");
            try {
                intObjectMap0 = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.d.getSemanticsOwner());
            }
            catch(Throwable throwable0) {
                Trace.endSection();
                throw throwable0;
            }
            Trace.endSection();
            this.B = intObjectMap0;
            if(this.isEnabled$ui_release()) {
                Trace.beginSection("setTraversalValues");
                try {
                    this.F();
                }
                catch(Throwable throwable1) {
                    Trace.endSection();
                    throw throwable1;
                }
                Trace.endSection();
                return this.B;
            }
        }
        return this.B;
    }

    // 去混淆评级： 低(30)
    public final boolean isEnabled$ui_release() {
        return this.h || this.g.isEnabled() && !this.l.isEmpty();
    }

    public static boolean j(SemanticsNode semanticsNode0) {
        ToggleableState toggleableState0 = (ToggleableState)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role0 = (Role)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        boolean z = false;
        if(((Boolean)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected())) != null) {
            if(role0 != null) {
                z = Role.equals-impl0(role0.unbox-impl(), 4);
            }
            return z ? toggleableState0 != null : true;
        }
        return toggleableState0 != null;
    }

    public final String k(SemanticsNode semanticsNode0) {
        SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
        String s = SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getStateDescription());
        ToggleableState toggleableState0 = (ToggleableState)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getToggleableState());
        Role role0 = (Role)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getRole());
        int v = 0;
        AndroidComposeView androidComposeView0 = this.d;
        if(toggleableState0 != null) {
            switch(WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 1: {
                    if((role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 2)) && s == null) {
                        s = androidComposeView0.getContext().getResources().getString(string.state_on);
                    }
                    break;
                }
                case 2: {
                    if((role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 2)) && s == null) {
                        s = androidComposeView0.getContext().getResources().getString(string.state_off);
                    }
                    break;
                }
                case 3: {
                    if(s == null) {
                        s = androidComposeView0.getContext().getResources().getString(string.indeterminate);
                    }
                }
            }
        }
        Boolean boolean0 = (Boolean)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getSelected());
        if(boolean0 != null) {
            boolean z = boolean0.booleanValue();
            if(!(role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 4)) && s == null) {
                s = z ? androidComposeView0.getContext().getResources().getString(string.selected) : androidComposeView0.getContext().getResources().getString(string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo0 = (ProgressBarRangeInfo)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getProgressBarRangeInfo());
        if(progressBarRangeInfo0 != null) {
            if(progressBarRangeInfo0 == ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if(s == null) {
                    s = androidComposeView0.getContext().getResources().getString(string.in_progress);
                }
            }
            else if(s == null) {
                ClosedFloatingPointRange closedFloatingPointRange0 = progressBarRangeInfo0.getRange();
                float f = ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue() - ((Number)closedFloatingPointRange0.getStart()).floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo0.getCurrent() - ((Number)closedFloatingPointRange0.getStart()).floatValue()) / (((Number)closedFloatingPointRange0.getEndInclusive()).floatValue() - ((Number)closedFloatingPointRange0.getStart()).floatValue());
                if(f < 0.0f) {
                    f = 0.0f;
                }
                if(f > 1.0f) {
                    f = 1.0f;
                }
                if(f != 0.0f) {
                    v = f == 1.0f ? 100 : c.coerceIn(Math.round(f * 100.0f), 1, 99);
                }
                s = androidComposeView0.getContext().getResources().getString(string.template_percent, new Object[]{v});
            }
        }
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties0.getEditableText())) {
            SemanticsConfiguration semanticsConfiguration0 = semanticsNode0.copyWithMergingEnabled$ui_release().getConfig();
            Collection collection0 = (Collection)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, semanticsProperties0.getContentDescription());
            if(collection0 == null || collection0.isEmpty()) {
                Collection collection1 = (Collection)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, semanticsProperties0.getText());
                if(collection1 == null || collection1.isEmpty()) {
                    CharSequence charSequence0 = (CharSequence)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, semanticsProperties0.getEditableText());
                    if(charSequence0 == null || charSequence0.length() == 0) {
                        return androidComposeView0.getContext().getResources().getString(string.state_empty);
                    }
                }
            }
            return null;
        }
        return s;
    }

    public static AnnotatedString l(SemanticsNode semanticsNode0) {
        AnnotatedString annotatedString0 = AndroidComposeViewAccessibilityDelegateCompat.n(semanticsNode0.getUnmergedConfig$ui_release());
        List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        return annotatedString0 == null ? (list0 == null ? null : ((AnnotatedString)CollectionsKt___CollectionsKt.firstOrNull(list0))) : annotatedString0;
    }

    public static String m(SemanticsNode semanticsNode0) {
        if(semanticsNode0 == null) {
            return null;
        }
        SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties0.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default(((List)semanticsNode0.getUnmergedConfig$ui_release().get(semanticsProperties0.getContentDescription())), ",", null, null, 0, null, null, 62, null);
        }
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties0.getEditableText())) {
            AnnotatedString annotatedString0 = AndroidComposeViewAccessibilityDelegateCompat.n(semanticsNode0.getUnmergedConfig$ui_release());
            return annotatedString0 == null ? null : annotatedString0.getText();
        }
        List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getText());
        if(list0 != null) {
            AnnotatedString annotatedString1 = (AnnotatedString)CollectionsKt___CollectionsKt.firstOrNull(list0);
            return annotatedString1 == null ? null : annotatedString1.getText();
        }
        return null;
    }

    public static AnnotatedString n(SemanticsConfiguration semanticsConfiguration0) {
        return (AnnotatedString)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsProperties.INSTANCE.getEditableText());
    }

    public final boolean o(SemanticsNode semanticsNode0) {
        List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        boolean z = (list0 == null ? null : ((String)CollectionsKt___CollectionsKt.firstOrNull(list0))) != null || AndroidComposeViewAccessibilityDelegateCompat.l(semanticsNode0) != null || this.k(semanticsNode0) != null || AndroidComposeViewAccessibilityDelegateCompat.j(semanticsNode0);
        return semanticsNode0.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode0.isUnmergedLeafNode$ui_release() && z;
    }

    public final void onLayoutChange$ui_release(@NotNull LayoutNode layoutNode0) {
        this.z = true;
        if(!this.isEnabled$ui_release()) {
            return;
        }
        this.p(layoutNode0);
    }

    public final void onSemanticsChange$ui_release() {
        this.z = true;
        if(this.isEnabled$ui_release() && !this.K) {
            this.K = true;
            this.m.post(this.L);
        }
    }

    public final void p(LayoutNode layoutNode0) {
        if(this.x.add(layoutNode0)) {
            this.y.trySend-JP2dKIU(Unit.INSTANCE);
        }
    }

    public static final boolean q(ScrollAxisRange scrollAxisRange0, float f) {
        return f < 0.0f && ((Number)scrollAxisRange0.getValue().invoke()).floatValue() > 0.0f || f > 0.0f && ((Number)scrollAxisRange0.getValue().invoke()).floatValue() < ((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue();
    }

    public final void r(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, SemanticsNode semanticsNode0) {
        int v11;
        SpannableString spannableString0;
        accessibilityNodeInfoCompat0.setClassName("android.view.View");
        SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties0.getEditableText())) {
            accessibilityNodeInfoCompat0.setClassName("android.widget.EditText");
        }
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties0.getText())) {
            accessibilityNodeInfoCompat0.setClassName("android.widget.TextView");
        }
        Role role0 = (Role)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getRole());
        AndroidComposeView androidComposeView0 = this.d;
        if(role0 != null && (semanticsNode0.isFake$ui_release() || semanticsNode0.getReplacedChildren$ui_release().isEmpty())) {
            if(Role.equals-impl0(role0.unbox-impl(), 4)) {
                accessibilityNodeInfoCompat0.setRoleDescription(androidComposeView0.getContext().getResources().getString(string.tab));
            }
            else if(Role.equals-impl0(role0.unbox-impl(), 2)) {
                accessibilityNodeInfoCompat0.setRoleDescription(androidComposeView0.getContext().getResources().getString(string.switch_role));
            }
            else {
                String s = SemanticsUtils_androidKt.toLegacyClassName-V4PA4sw(role0.unbox-impl());
                if(!Role.equals-impl0(role0.unbox-impl(), 5) || semanticsNode0.isUnmergedLeafNode$ui_release() || semanticsNode0.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                    accessibilityNodeInfoCompat0.setClassName(s);
                }
            }
        }
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText())) {
            accessibilityNodeInfoCompat0.setClassName("android.widget.EditText");
        }
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties0.getText())) {
            accessibilityNodeInfoCompat0.setClassName("android.widget.TextView");
        }
        accessibilityNodeInfoCompat0.setPackageName("net.daum.android.tistoryapp");
        accessibilityNodeInfoCompat0.setImportantForAccessibility(SemanticsUtils_androidKt.isImportantForAccessibility(semanticsNode0));
        List list0 = semanticsNode0.getReplacedChildren$ui_release();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v2);
            if(this.i().contains(semanticsNode1.getId())) {
                AndroidViewHolder androidViewHolder0 = (AndroidViewHolder)androidComposeView0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode1.getLayoutNode$ui_release());
                if(semanticsNode1.getId() != -1) {
                    if(androidViewHolder0 == null) {
                        accessibilityNodeInfoCompat0.addChild(androidComposeView0, semanticsNode1.getId());
                    }
                    else {
                        accessibilityNodeInfoCompat0.addChild(androidViewHolder0);
                    }
                }
            }
        }
        if(v == this.o) {
            accessibilityNodeInfoCompat0.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        }
        else {
            accessibilityNodeInfoCompat0.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        AnnotatedString annotatedString0 = AndroidComposeViewAccessibilityDelegateCompat.l(semanticsNode0);
        if(annotatedString0 == null) {
            spannableString0 = null;
        }
        else {
            Resolver fontFamily$Resolver0 = androidComposeView0.getFontFamilyResolver();
            spannableString0 = (SpannableString)AndroidComposeViewAccessibilityDelegateCompat.H(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString0, androidComposeView0.getDensity(), fontFamily$Resolver0, this.H));
        }
        accessibilityNodeInfoCompat0.setText(spannableString0);
        SemanticsProperties semanticsProperties1 = SemanticsProperties.INSTANCE;
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties1.getError())) {
            accessibilityNodeInfoCompat0.setContentInvalid(true);
            accessibilityNodeInfoCompat0.setError(((CharSequence)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties1.getError())));
        }
        accessibilityNodeInfoCompat0.setStateDescription(this.k(semanticsNode0));
        accessibilityNodeInfoCompat0.setCheckable(AndroidComposeViewAccessibilityDelegateCompat.j(semanticsNode0));
        ToggleableState toggleableState0 = (ToggleableState)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties1.getToggleableState());
        if(toggleableState0 != null) {
            if(toggleableState0 == ToggleableState.On) {
                accessibilityNodeInfoCompat0.setChecked(true);
            }
            else if(toggleableState0 == ToggleableState.Off) {
                accessibilityNodeInfoCompat0.setChecked(false);
            }
        }
        Boolean boolean0 = (Boolean)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties1.getSelected());
        if(boolean0 != null) {
            boolean z = boolean0.booleanValue();
            if((role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 4))) {
                accessibilityNodeInfoCompat0.setSelected(z);
            }
            else {
                accessibilityNodeInfoCompat0.setChecked(z);
            }
        }
        if(!semanticsNode0.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode0.getReplacedChildren$ui_release().isEmpty()) {
            List list1 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties1.getContentDescription());
            accessibilityNodeInfoCompat0.setContentDescription((list1 == null ? null : ((String)CollectionsKt___CollectionsKt.firstOrNull(list1))));
        }
        String s1 = (String)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties1.getTestTag());
        if(s1 != null) {
            for(SemanticsNode semanticsNode2 = semanticsNode0; true; semanticsNode2 = semanticsNode2.getParent()) {
                boolean z1 = false;
                if(semanticsNode2 == null) {
                    break;
                }
                SemanticsPropertiesAndroid semanticsPropertiesAndroid0 = SemanticsPropertiesAndroid.INSTANCE;
                if(semanticsNode2.getUnmergedConfig$ui_release().contains(semanticsPropertiesAndroid0.getTestTagsAsResourceId())) {
                    z1 = ((Boolean)semanticsNode2.getUnmergedConfig$ui_release().get(semanticsPropertiesAndroid0.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
            }
            if(z1) {
                accessibilityNodeInfoCompat0.setViewIdResourceName(s1);
            }
        }
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        if(((Unit)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getHeading())) != null) {
            accessibilityNodeInfoCompat0.setHeading(true);
        }
        accessibilityNodeInfoCompat0.setPassword(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties2.getPassword()));
        accessibilityNodeInfoCompat0.setEditable(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties2.getIsEditable()));
        Integer integer0 = (Integer)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getMaxTextLength());
        accessibilityNodeInfoCompat0.setMaxTextLength((integer0 == null ? -1 : ((int)integer0)));
        accessibilityNodeInfoCompat0.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0));
        accessibilityNodeInfoCompat0.setFocusable(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties2.getFocused()));
        int v3 = 2;
        if(accessibilityNodeInfoCompat0.isFocusable()) {
            accessibilityNodeInfoCompat0.setFocused(((Boolean)semanticsNode0.getUnmergedConfig$ui_release().get(semanticsProperties2.getFocused())).booleanValue());
            if(accessibilityNodeInfoCompat0.isFocused()) {
                accessibilityNodeInfoCompat0.addAction(2);
            }
            else {
                accessibilityNodeInfoCompat0.addAction(1);
            }
        }
        accessibilityNodeInfoCompat0.setVisibleToUser(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isVisible(semanticsNode0));
        LiveRegionMode liveRegionMode0 = (LiveRegionMode)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getLiveRegion());
        if(liveRegionMode0 != null) {
            int v4 = liveRegionMode0.unbox-impl();
            if(LiveRegionMode.equals-impl0(v4, 0)) {
                v3 = 1;
            }
            else if(!LiveRegionMode.equals-impl0(v4, 1)) {
                v3 = 1;
            }
            accessibilityNodeInfoCompat0.setLiveRegion(v3);
        }
        accessibilityNodeInfoCompat0.setClickable(false);
        SemanticsActions semanticsActions0 = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getOnClick());
        if(accessibilityAction0 != null) {
            accessibilityNodeInfoCompat0.setClickable(!(role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 4)) && !(role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 3)) || !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getSelected()), Boolean.TRUE));
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0) && accessibilityNodeInfoCompat0.isClickable()) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(16, accessibilityAction0.getLabel()));
            }
        }
        accessibilityNodeInfoCompat0.setLongClickable(false);
        AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getOnLongClick());
        if(accessibilityAction1 != null) {
            accessibilityNodeInfoCompat0.setLongClickable(true);
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x20, accessibilityAction1.getLabel()));
            }
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getCopyText());
        if(accessibilityAction2 != null) {
            accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x4000, accessibilityAction2.getLabel()));
        }
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
            AccessibilityAction accessibilityAction3 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getSetText());
            if(accessibilityAction3 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x200000, accessibilityAction3.getLabel()));
            }
            AccessibilityAction accessibilityAction4 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getOnImeAction());
            if(accessibilityAction4 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x1020054, accessibilityAction4.getLabel()));
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getCutText());
            if(accessibilityAction5 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x10000, accessibilityAction5.getLabel()));
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPasteText());
            if(accessibilityAction6 != null && accessibilityNodeInfoCompat0.isFocused() && androidComposeView0.getClipboardManager().hasText()) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x8000, accessibilityAction6.getLabel()));
            }
        }
        String s2 = AndroidComposeViewAccessibilityDelegateCompat.m(semanticsNode0);
        if(s2 != null && s2.length() != 0) {
            accessibilityNodeInfoCompat0.setTextSelection(this.h(semanticsNode0), this.g(semanticsNode0));
            AccessibilityAction accessibilityAction7 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getSetSelection());
            accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x20000, (accessibilityAction7 == null ? null : accessibilityAction7.getLabel())));
            accessibilityNodeInfoCompat0.addAction(0x100);
            accessibilityNodeInfoCompat0.addAction(0x200);
            accessibilityNodeInfoCompat0.setMovementGranularities(11);
            Collection collection0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getContentDescription());
            if((collection0 == null || collection0.isEmpty()) && semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getGetTextLayoutResult()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$excludeLineAndPageGranularities(semanticsNode0)) {
                accessibilityNodeInfoCompat0.setMovementGranularities(accessibilityNodeInfoCompat0.getMovementGranularities() | 20);
            }
        }
        int v5 = Build.VERSION.SDK_INT;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add("androidx.compose.ui.semantics.id");
        CharSequence charSequence0 = accessibilityNodeInfoCompat0.getText();
        if(charSequence0 != null && charSequence0.length() != 0 && semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getGetTextLayoutResult())) {
            arrayList0.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties2.getTestTag())) {
            arrayList0.add("androidx.compose.ui.semantics.testTag");
        }
        accessibilityNodeInfoCompat0.setAvailableExtraData(arrayList0);
        ProgressBarRangeInfo progressBarRangeInfo0 = (ProgressBarRangeInfo)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getProgressBarRangeInfo());
        if(progressBarRangeInfo0 != null) {
            if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getSetProgress())) {
                accessibilityNodeInfoCompat0.setClassName("android.widget.SeekBar");
            }
            else {
                accessibilityNodeInfoCompat0.setClassName("android.widget.ProgressBar");
            }
            if(progressBarRangeInfo0 != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfoCompat0.setRangeInfo(RangeInfoCompat.obtain(1, ((Number)progressBarRangeInfo0.getRange().getStart()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue(), progressBarRangeInfo0.getCurrent()));
            }
            if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getSetProgress()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
                if(progressBarRangeInfo0.getCurrent() < c.coerceAtLeast(((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getStart()).floatValue())) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                }
                if(progressBarRangeInfo0.getCurrent() > c.coerceAtMost(((Number)progressBarRangeInfo0.getRange().getStart()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue())) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                }
            }
        }
        s.a(accessibilityNodeInfoCompat0, semanticsNode0);
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode0, accessibilityNodeInfoCompat0);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode0, accessibilityNodeInfoCompat0);
        ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction8 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getScrollBy());
        if(scrollAxisRange0 != null && accessibilityAction8 != null) {
            if(!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode0)) {
                accessibilityNodeInfoCompat0.setClassName("android.widget.HorizontalScrollView");
            }
            if(((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfoCompat0.setScrollable(true);
            }
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
                if(AndroidComposeViewAccessibilityDelegateCompat.t(scrollAxisRange0)) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat0.addAction((AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode0) ? AccessibilityActionCompat.ACTION_SCROLL_LEFT : AccessibilityActionCompat.ACTION_SCROLL_RIGHT));
                }
                if(AndroidComposeViewAccessibilityDelegateCompat.s(scrollAxisRange0)) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat0.addAction((AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode0) ? AccessibilityActionCompat.ACTION_SCROLL_RIGHT : AccessibilityActionCompat.ACTION_SCROLL_LEFT));
                }
            }
        }
        ScrollAxisRange scrollAxisRange1 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getVerticalScrollAxisRange());
        if(scrollAxisRange1 != null && accessibilityAction8 != null) {
            if(!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode0)) {
                accessibilityNodeInfoCompat0.setClassName("android.widget.ScrollView");
            }
            if(((Number)scrollAxisRange1.getMaxValue().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfoCompat0.setScrollable(true);
            }
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
                if(AndroidComposeViewAccessibilityDelegateCompat.t(scrollAxisRange1)) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if(AndroidComposeViewAccessibilityDelegateCompat.s(scrollAxisRange1)) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if(v5 >= 29) {
            t.a(accessibilityNodeInfoCompat0, semanticsNode0);
        }
        accessibilityNodeInfoCompat0.setPaneTitle(((CharSequence)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties2.getPaneTitle())));
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
            AccessibilityAction accessibilityAction9 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getExpand());
            if(accessibilityAction9 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x40000, accessibilityAction9.getLabel()));
            }
            AccessibilityAction accessibilityAction10 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getCollapse());
            if(accessibilityAction10 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x80000, accessibilityAction10.getLabel()));
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getDismiss());
            if(accessibilityAction11 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x100000, accessibilityAction11.getLabel()));
            }
            if(semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsActions0.getCustomActions())) {
                List list2 = (List)semanticsNode0.getUnmergedConfig$ui_release().get(semanticsActions0.getCustomActions());
                IntList intList0 = AndroidComposeViewAccessibilityDelegateCompat.O;
                if(list2.size() >= intList0.getSize()) {
                    throw new IllegalStateException("Can\'t have more than " + intList0.getSize() + " custom actions for one widget");
                }
                SparseArrayCompat sparseArrayCompat0 = new SparseArrayCompat(0, 1, null);
                MutableObjectIntMap mutableObjectIntMap0 = ObjectIntMapKt.mutableObjectIntMapOf();
                SparseArrayCompat sparseArrayCompat1 = this.u;
                if(sparseArrayCompat1.containsKey(v)) {
                    MutableObjectIntMap mutableObjectIntMap1 = (MutableObjectIntMap)sparseArrayCompat1.get(v);
                    MutableIntList mutableIntList0 = new MutableIntList(0, 1, null);
                    int[] arr_v = intList0.content;
                    int v6 = intList0._size;
                    for(int v7 = 0; v7 < v6; ++v7) {
                        mutableIntList0.add(arr_v[v7]);
                    }
                    ArrayList arrayList1 = new ArrayList();
                    int v8 = list2.size();
                    int v9 = 0;
                    while(v9 < v8) {
                        CustomAccessibilityAction customAccessibilityAction0 = (CustomAccessibilityAction)list2.get(v9);
                        Intrinsics.checkNotNull(mutableObjectIntMap1);
                        if(mutableObjectIntMap1.contains(customAccessibilityAction0.getLabel())) {
                            int v10 = mutableObjectIntMap1.get(customAccessibilityAction0.getLabel());
                            v11 = v8;
                            sparseArrayCompat0.put(v10, customAccessibilityAction0.getLabel());
                            mutableObjectIntMap0.set(customAccessibilityAction0.getLabel(), v10);
                            mutableIntList0.remove(v10);
                            accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(v10, customAccessibilityAction0.getLabel()));
                        }
                        else {
                            v11 = v8;
                            arrayList1.add(customAccessibilityAction0);
                        }
                        ++v9;
                        v8 = v11;
                    }
                    int v12 = arrayList1.size();
                    for(int v13 = 0; v13 < v12; ++v13) {
                        CustomAccessibilityAction customAccessibilityAction1 = (CustomAccessibilityAction)arrayList1.get(v13);
                        int v14 = mutableIntList0.get(v13);
                        sparseArrayCompat0.put(v14, customAccessibilityAction1.getLabel());
                        mutableObjectIntMap0.set(customAccessibilityAction1.getLabel(), v14);
                        accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(v14, customAccessibilityAction1.getLabel()));
                    }
                }
                else {
                    int v15 = list2.size();
                    for(int v16 = 0; v16 < v15; ++v16) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction)list2.get(v16);
                        int v17 = intList0.get(v16);
                        sparseArrayCompat0.put(v17, customAccessibilityAction2.getLabel());
                        mutableObjectIntMap0.set(customAccessibilityAction2.getLabel(), v17);
                        accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(v17, customAccessibilityAction2.getLabel()));
                    }
                }
                this.t.put(v, sparseArrayCompat0);
                sparseArrayCompat1.put(v, mutableObjectIntMap0);
            }
        }
        accessibilityNodeInfoCompat0.setScreenReaderFocusable(this.o(semanticsNode0));
        int v18 = this.D.getOrDefault(v, -1);
        if(v18 != -1) {
            View view0 = SemanticsUtils_androidKt.semanticsIdToView(androidComposeView0.getAndroidViewsHandler$ui_release(), v18);
            if(view0 == null) {
                accessibilityNodeInfoCompat0.setTraversalBefore(androidComposeView0, v18);
            }
            else {
                accessibilityNodeInfoCompat0.setTraversalBefore(view0);
            }
            this.a(v, accessibilityNodeInfoCompat0, this.F, null);
        }
        int v19 = this.E.getOrDefault(v, -1);
        if(v19 != -1) {
            View view1 = SemanticsUtils_androidKt.semanticsIdToView(androidComposeView0.getAndroidViewsHandler$ui_release(), v19);
            if(view1 != null) {
                accessibilityNodeInfoCompat0.setTraversalAfter(view1);
                this.a(v, accessibilityNodeInfoCompat0, this.G, null);
            }
        }
    }

    // 去混淆评级： 低(20)
    public static final boolean s(ScrollAxisRange scrollAxisRange0) {
        return ((Number)scrollAxisRange0.getValue().invoke()).floatValue() > 0.0f && !scrollAxisRange0.getReverseScrolling() || ((Number)scrollAxisRange0.getValue().invoke()).floatValue() < ((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue() && scrollAxisRange0.getReverseScrolling();
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.h = z;
        this.z = true;
    }

    public final void setHoveredVirtualViewId$ui_release(int v) {
        this.e = v;
    }

    public final void setIdToAfterMap$ui_release(@NotNull MutableIntIntMap mutableIntIntMap0) {
        this.E = mutableIntIntMap0;
    }

    public final void setIdToBeforeMap$ui_release(@NotNull MutableIntIntMap mutableIntIntMap0) {
        this.D = mutableIntIntMap0;
    }

    public final void setOnSendAccessibilityEvent$ui_release(@NotNull Function1 function10) {
        this.f = function10;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long v) {
        this.i = v;
    }

    // 去混淆评级： 低(20)
    public static final boolean t(ScrollAxisRange scrollAxisRange0) {
        return ((Number)scrollAxisRange0.getValue().invoke()).floatValue() < ((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue() && !scrollAxisRange0.getReverseScrolling() || ((Number)scrollAxisRange0.getValue().invoke()).floatValue() > 0.0f && scrollAxisRange0.getReverseScrolling();
    }

    public final int u(int v) {
        return v == this.d.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? -1 : v;
    }

    public final void v(SemanticsNode semanticsNode0, SemanticsNodeCopy semanticsNodeCopy0) {
        int v8;
        List list1;
        MutableIntSet mutableIntSet0 = IntSetKt.mutableIntSetOf();
        List list0 = semanticsNode0.getReplacedChildren$ui_release();
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v2);
            if(this.i().contains(semanticsNode1.getId())) {
                if(!semanticsNodeCopy0.getChildren().contains(semanticsNode1.getId())) {
                    this.p(semanticsNode0.getLayoutNode$ui_release());
                    return;
                }
                mutableIntSet0.add(semanticsNode1.getId());
            }
        }
        MutableIntSet mutableIntSet1 = semanticsNodeCopy0.getChildren();
        int[] arr_v = mutableIntSet1.elements;
        long[] arr_v1 = mutableIntSet1.metadata;
        int v3 = arr_v1.length - 2;
        if(v3 >= 0) {
            int v4 = 0;
            while(true) {
                long v5 = arr_v1[v4];
                if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_35;
                }
                int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                for(int v7 = 0; v7 < v6; ++v7) {
                    if((0xFFL & v5) < 0x80L && !mutableIntSet0.contains(arr_v[(v4 << 3) + v7])) {
                        this.p(semanticsNode0.getLayoutNode$ui_release());
                        return;
                    }
                    v5 >>= 8;
                }
                if(v6 == 8) {
                label_35:
                    if(v4 != v3) {
                        ++v4;
                        continue;
                    }
                    break;
                }
                else {
                    list1 = semanticsNode0.getReplacedChildren$ui_release();
                    v8 = list1.size();
                }
                goto label_43;
            }
        }
        list1 = semanticsNode0.getReplacedChildren$ui_release();
        v8 = list1.size();
    label_43:
        for(int v1 = 0; v1 < v8; ++v1) {
            SemanticsNode semanticsNode2 = (SemanticsNode)list1.get(v1);
            if(this.i().contains(semanticsNode2.getId())) {
                Object object0 = this.I.get(semanticsNode2.getId());
                Intrinsics.checkNotNull(object0);
                this.v(semanticsNode2, ((SemanticsNodeCopy)object0));
            }
        }
    }

    public final boolean w(AccessibilityEvent accessibilityEvent0) {
        if(!this.isEnabled$ui_release()) {
            return false;
        }
        switch(accessibilityEvent0.getEventType()) {
            case 0x800: 
            case 0x8000: {
                this.q = true;
            }
        }
        try {
            boolean z = ((Boolean)this.f.invoke(accessibilityEvent0)).booleanValue();
            this.q = false;
            return z;
        }
        catch(Throwable throwable0) {
            this.q = false;
            throw throwable0;
        }
    }

    public final boolean x(int v, int v1, Integer integer0, List list0) {
        if(v != 0x80000000 && this.isEnabled$ui_release()) {
            AccessibilityEvent accessibilityEvent0 = this.d(v, v1);
            if(integer0 != null) {
                accessibilityEvent0.setContentChangeTypes(((int)integer0));
            }
            if(list0 != null) {
                accessibilityEvent0.setContentDescription(ListUtilsKt.fastJoinToString$default(list0, ",", null, null, 0, null, null, 62, null));
            }
            Trace.beginSection("sendEvent");
            try {
                return this.w(accessibilityEvent0);
            }
            finally {
                Trace.endSection();
            }
        }
        return false;
    }

    public static void y(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, int v, int v1, Integer integer0, int v2) {
        if((v2 & 4) != 0) {
            integer0 = null;
        }
        androidComposeViewAccessibilityDelegateCompat0.x(v, v1, integer0, null);
    }

    public final void z(int v, int v1, String s) {
        AccessibilityEvent accessibilityEvent0 = this.d(this.u(v), 0x20);
        accessibilityEvent0.setContentChangeTypes(v1);
        if(s != null) {
            accessibilityEvent0.getText().add(s);
        }
        this.w(accessibilityEvent0);
    }
}

