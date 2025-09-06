package androidx.compose.foundation.text.selection;

import aa.o;
import androidx.activity.c0;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00AE\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000B\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000F\u001A\u00020\fH\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ5\u0010\u0018\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00150\u00142\u0006\u0010\u0011\u001A\u00020\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u001C\u001A\u00020\u0019H\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010 \u001A\u00020\u001DH\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010\"\u001A\u00020\u0019H\u0000\u00A2\u0006\u0004\b!\u0010\u001BJ\u000F\u0010$\u001A\u00020\u0019H\u0000\u00A2\u0006\u0004\b#\u0010\u001BJ\u0011\u0010(\u001A\u0004\u0018\u00010%H\u0000\u00A2\u0006\u0004\b&\u0010\'J\u000F\u0010*\u001A\u00020\u001DH\u0000\u00A2\u0006\u0004\b)\u0010\u001FJ\r\u0010+\u001A\u00020\u001D\u00A2\u0006\u0004\b+\u0010\u001FJ\u0015\u0010.\u001A\u00020-2\u0006\u0010,\u001A\u00020\u0019\u00A2\u0006\u0004\b.\u0010/J4\u00107\u001A\u00020\u00192\b\u00101\u001A\u0004\u0018\u0001002\u0006\u00102\u001A\u0002002\u0006\u0010,\u001A\u00020\u00192\u0006\u00104\u001A\u000203H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106J2\u00107\u001A\u00020\u00192\u0006\u00108\u001A\u0002002\u0006\u00109\u001A\u0002002\u0006\u0010,\u001A\u00020\u00192\u0006\u00104\u001A\u000203H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u0010;J\u000F\u0010=\u001A\u00020\u0019H\u0001\u00A2\u0006\u0004\b<\u0010\u001BJ\u0018\u0010@\u001A\u00020\u001D2\u0006\u00108\u001A\u000200\u00F8\u0001\u0000\u00A2\u0006\u0004\b>\u0010?RF\u0010I\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u001D0A2\u0014\u0010B\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u001D0A8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010Q\u001A\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bK\u0010L\u001A\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Y\u001A\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bS\u0010T\u001A\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010a\u001A\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001A\u00020b8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bc\u0010d\u001A\u0004\be\u0010f\"\u0004\bg\u0010hR+\u0010p\u001A\u00020\u00192\u0006\u0010j\u001A\u00020\u00198F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bk\u0010l\u001A\u0004\bm\u0010\u001B\"\u0004\bn\u0010oR.\u0010w\u001A\u0004\u0018\u00010\f2\b\u0010q\u001A\u0004\u0018\u00010\f8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\br\u0010s\u001A\u0004\bt\u0010\u000E\"\u0004\bu\u0010vR1\u0010|\u001A\u0002002\u0006\u0010j\u001A\u0002008@@BX\u0080\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bx\u0010l\u001A\u0004\by\u0010z\"\u0004\b{\u0010?R2\u0010\u0080\u0001\u001A\u0002002\u0006\u0010j\u001A\u0002008@@BX\u0080\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b}\u0010l\u001A\u0004\b~\u0010z\"\u0004\b\u007F\u0010?R;\u0010\u0086\u0001\u001A\u0004\u0018\u0001002\b\u0010j\u001A\u0004\u0018\u0001008F@BX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0017\n\u0005\b\u0081\u0001\u0010l\u001A\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R;\u0010\u008A\u0001\u001A\u0004\u0018\u0001002\b\u0010j\u001A\u0004\u0018\u0001008F@BX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0017\n\u0005\b\u0087\u0001\u0010l\u001A\u0006\b\u0088\u0001\u0010\u0083\u0001\"\u0006\b\u0089\u0001\u0010\u0085\u0001R7\u0010\u0091\u0001\u001A\u0005\u0018\u00010\u008B\u00012\t\u0010j\u001A\u0005\u0018\u00010\u008B\u00018F@BX\u0086\u008E\u0002\u00A2\u0006\u0017\n\u0005\b\u008C\u0001\u0010l\u001A\u0006\b\u008D\u0001\u0010\u008E\u0001\"\u0006\b\u008F\u0001\u0010\u0090\u0001R;\u0010\u0095\u0001\u001A\u0004\u0018\u0001002\b\u0010j\u001A\u0004\u0018\u0001008F@BX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0017\n\u0005\b\u0092\u0001\u0010l\u001A\u0006\b\u0093\u0001\u0010\u0083\u0001\"\u0006\b\u0094\u0001\u0010\u0085\u0001R3\u0010\u009E\u0001\u001A\u0005\u0018\u00010\u0096\u00018\u0000@\u0000X\u0081\u000E\u00A2\u0006\u001F\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u0012\u0005\b\u009D\u0001\u0010\u001F\u001A\u0006\b\u0099\u0001\u0010\u009A\u0001\"\u0006\b\u009B\u0001\u0010\u009C\u0001R/\u0010\u00A3\u0001\u001A\u00020\u00192\u0006\u0010q\u001A\u00020\u00198\u0000@@X\u0080\u000E\u00A2\u0006\u0016\n\u0006\b\u009F\u0001\u0010\u00A0\u0001\u001A\u0005\b\u00A1\u0001\u0010\u001B\"\u0005\b\u00A2\u0001\u0010oR-\u0010\u00A8\u0001\u001A\u0004\u0018\u00010\u00122\b\u0010q\u001A\u0004\u0018\u00010\u00128F@FX\u0086\u000E\u00A2\u0006\u0010\u001A\u0006\b\u00A4\u0001\u0010\u00A5\u0001\"\u0006\b\u00A6\u0001\u0010\u00A7\u0001R\'\u0010\u00A9\u0001\u001A\u00020\u00192\u0006\u0010q\u001A\u00020\u00198F@FX\u0086\u000E\u00A2\u0006\u000E\u001A\u0005\b\u00A9\u0001\u0010\u001B\"\u0005\b\u00AA\u0001\u0010oR\u0015\u0010\u00AE\u0001\u001A\u00030\u00AB\u00018F\u00A2\u0006\b\u001A\u0006\b\u00AC\u0001\u0010\u00AD\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00AF\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable$foundation_release", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates$foundation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates", "", "selectableId", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "Landroidx/collection/LongObjectMap;", "selectAllInSelectable$foundation_release", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "selectAllInSelectable", "", "isEntireContainerSelected$foundation_release", "()Z", "isEntireContainerSelected", "", "selectAll$foundation_release", "()V", "selectAll", "isTriviallyCollapsedSelection$foundation_release", "isTriviallyCollapsedSelection", "isNonEmptySelection$foundation_release", "isNonEmptySelection", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText", "copy$foundation_release", "copy", "onRelease", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "Landroidx/compose/ui/geometry/Offset;", "newPosition", "previousPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "updateSelection-qNKwrvQ$foundation_release", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelection", "position", "previousHandlePosition", "updateSelection-jyLRC_s$foundation_release", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "shouldPerformHaptics$foundation_release", "shouldPerformHaptics", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "Lkotlin/Function1;", "newOnSelectionChange", "d", "Lkotlin/jvm/functions/Function1;", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "onSelectionChange", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "e", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hapticFeedBack", "Landroidx/compose/ui/platform/ClipboardManager;", "f", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/TextToolbar;", "g", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "textToolbar", "Landroidx/compose/ui/focus/FocusRequester;", "h", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", "<set-?>", "i", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "setHasFocus", "(Z)V", "hasFocus", "value", "k", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "containerLayoutCoordinates", "l", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "dragBeginPosition", "m", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance", "n", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "startHandlePosition", "o", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition", "Landroidx/compose/foundation/text/Handle;", "p", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "q", "getCurrentDragPosition-_m7T9-E", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "r", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation_release", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation_release", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "getPreviousSelectionLayout$foundation_release$annotations", "previousSelectionLayout", "s", "Z", "getShowToolbar$foundation_release", "setShowToolbar$foundation_release", "showToolbar", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "selection", "isInTouchMode", "setInTouchMode", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,1073:1\n81#2:1074\n107#2,2:1075\n81#2:1077\n107#2,2:1078\n81#2:1080\n107#2,2:1081\n81#2:1083\n107#2,2:1084\n81#2:1086\n107#2,2:1087\n81#2:1089\n107#2,2:1090\n81#2:1092\n107#2,2:1093\n1#3:1095\n1#3:1146\n256#4,3:1096\n33#4,4:1099\n259#4,2:1103\n38#4:1105\n261#4:1106\n86#4,2:1107\n33#4,6:1109\n88#4:1115\n33#4,6:1116\n101#4,2:1122\n33#4,6:1124\n103#4:1130\n33#4,6:1132\n416#4,3:1138\n33#4,4:1141\n419#4:1145\n420#4:1147\n38#4:1148\n421#4:1149\n69#4,6:1150\n33#4,6:1156\n101#4,2:1162\n33#4,6:1164\n103#4:1170\n1240#5:1131\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n143#1:1074\n143#1:1075,2\n193#1:1077\n193#1:1078,2\n200#1:1080\n200#1:1081,2\n209#1:1083\n209#1:1084,2\n218#1:1086\n218#1:1087,2\n225#1:1089\n225#1:1090,2\n232#1:1092\n232#1:1093,2\n612#1:1146\n419#1:1096,3\n419#1:1099,4\n419#1:1103,2\n419#1:1105\n419#1:1106\n441#1:1107,2\n441#1:1109,6\n441#1:1115\n469#1:1116,6\n528#1:1122,2\n528#1:1124,6\n528#1:1130\n541#1:1132,6\n612#1:1138,3\n612#1:1141,4\n612#1:1145\n612#1:1147\n612#1:1148\n612#1:1149\n862#1:1150,6\n879#1:1156,6\n896#1:1162,2\n896#1:1164,6\n896#1:1170\n540#1:1131\n*E\n"})
public final class SelectionManager {
    public static final int $stable = 8;
    public final SelectionRegistrarImpl a;
    public final MutableState b;
    public final MutableState c;
    public Lambda d;
    public HapticFeedback e;
    public ClipboardManager f;
    public TextToolbar g;
    public FocusRequester h;
    public final MutableState i;
    public Offset j;
    public LayoutCoordinates k;
    public final MutableState l;
    public final MutableState m;
    public final MutableState n;
    public final MutableState o;
    public final MutableState p;
    public final MutableState q;
    public SelectionLayout r;
    public boolean s;

    public SelectionManager(@NotNull SelectionRegistrarImpl selectionRegistrarImpl0) {
        this.a = selectionRegistrarImpl0;
        this.b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.d = new a0(this, 7);
        this.h = new FocusRequester();
        this.i = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.l = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
        this.m = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
        this.n = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.o = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.p = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.q = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrarImpl0.setOnPositionChangeCallback$foundation_release(new a0(this, 1));
        selectionRegistrarImpl0.setOnSelectionUpdateStartCallback$foundation_release(new a1(this, 0));
        selectionRegistrarImpl0.setOnSelectionUpdateSelectAll$foundation_release(new b1(this, 0));
        selectionRegistrarImpl0.setOnSelectionUpdateCallback$foundation_release(new c1(this, 0));
        selectionRegistrarImpl0.setOnSelectionUpdateEndCallback$foundation_release(new d1(this, 0));
        selectionRegistrarImpl0.setOnSelectableChangeCallback$foundation_release(new a0(this, 2));
        selectionRegistrarImpl0.setAfterSelectableUnsubscribe$foundation_release(new e1(this));
    }

    public final void a() {
        Offset offset1;
        Selectable selectable1;
        Selectable selectable0;
        Selection selection0 = this.getSelection();
        LayoutCoordinates layoutCoordinates0 = this.k;
        Offset offset0 = null;
        if(selection0 == null) {
            selectable0 = null;
        }
        else {
            AnchorInfo selection$AnchorInfo0 = selection0.getStart();
            selectable0 = selection$AnchorInfo0 == null ? null : this.getAnchorSelectable$foundation_release(selection$AnchorInfo0);
        }
        if(selection0 == null) {
            selectable1 = null;
        }
        else {
            AnchorInfo selection$AnchorInfo1 = selection0.getEnd();
            selectable1 = selection$AnchorInfo1 == null ? null : this.getAnchorSelectable$foundation_release(selection$AnchorInfo1);
        }
        LayoutCoordinates layoutCoordinates1 = selectable0 == null ? null : selectable0.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = selectable1 == null ? null : selectable1.getLayoutCoordinates();
        MutableState mutableState0 = this.o;
        MutableState mutableState1 = this.n;
        if(selection0 != null && layoutCoordinates0 != null && layoutCoordinates0.isAttached() && (layoutCoordinates1 != null || layoutCoordinates2 != null)) {
            Rect rect0 = SelectionManagerKt.visibleBounds(layoutCoordinates0);
            if(layoutCoordinates1 == null) {
                offset1 = null;
            }
            else {
                long v = selectable0.getHandlePosition-dBAh8RU(selection0, true);
                if(OffsetKt.isUnspecified-k-4lQ0M(v)) {
                    offset1 = null;
                }
                else {
                    offset1 = Offset.box-impl(layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates1, v));
                    if(this.getDraggingHandle() != Handle.SelectionStart && !SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, offset1.unbox-impl())) {
                        offset1 = null;
                    }
                }
            }
            mutableState1.setValue(offset1);
            if(layoutCoordinates2 != null) {
                long v1 = selectable1.getHandlePosition-dBAh8RU(selection0, false);
                if(!OffsetKt.isUnspecified-k-4lQ0M(v1)) {
                    Offset offset2 = Offset.box-impl(layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates2, v1));
                    if(this.getDraggingHandle() == Handle.SelectionEnd || SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, offset2.unbox-impl())) {
                        offset0 = offset2;
                    }
                }
            }
            mutableState0.setValue(offset0);
            return;
        }
        mutableState1.setValue(null);
        mutableState0.setValue(null);
    }

    // 去混淆评级： 低(30)
    public static final long access$convertToContainerCoordinates-R5De75A(SelectionManager selectionManager0, LayoutCoordinates layoutCoordinates0, long v) {
        return selectionManager0.k == null || !selectionManager0.k.isAttached() ? 0x7FC000007FC00000L : selectionManager0.requireContainerCoordinates$foundation_release().localPositionOf-R5De75A(layoutCoordinates0, v);
    }

    public static final Object access$detectNonConsumingTap(SelectionManager selectionManager0, PointerInputScope pointerInputScope0, Function1 function10, Continuation continuation0) {
        selectionManager0.getClass();
        Unit unit0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new f1(function10, null), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final void access$setCurrentDragPosition-_kEHs6E(SelectionManager selectionManager0, Offset offset0) {
        selectionManager0.q.setValue(offset0);
    }

    public static final void access$setDragBeginPosition-k-4lQ0M(SelectionManager selectionManager0, long v) {
        Offset offset0 = Offset.box-impl(v);
        selectionManager0.l.setValue(offset0);
    }

    public static final void access$setDragTotalDistance-k-4lQ0M(SelectionManager selectionManager0, long v) {
        Offset offset0 = Offset.box-impl(v);
        selectionManager0.m.setValue(offset0);
    }

    public static final void access$setDraggingHandle(SelectionManager selectionManager0, Handle handle0) {
        selectionManager0.p.setValue(handle0);
    }

    public static final void access$setEndHandlePosition-_kEHs6E(SelectionManager selectionManager0, Offset offset0) {
        selectionManager0.o.setValue(offset0);
    }

    public static final void access$setStartHandlePosition-_kEHs6E(SelectionManager selectionManager0, Offset offset0) {
        selectionManager0.n.setValue(offset0);
    }

    public static final void access$startSelection-9KIMszo(SelectionManager selectionManager0, long v, boolean z, SelectionAdjustment selectionAdjustment0) {
        selectionManager0.r = null;
        selectionManager0.updateSelection-jyLRC_s$foundation_release(v, 0x7FC000007FC00000L, z, selectionAdjustment0);
    }

    public static final void access$toolbarCopy(SelectionManager selectionManager0) {
        selectionManager0.copy$foundation_release();
        selectionManager0.onRelease();
    }

    public final void b() {
        Rect rect3;
        if(!this.getHasFocus()) {
            return;
        }
        c0 c00 = null;
        TextToolbar textToolbar0 = this.g;
        if(textToolbar0 == null) {
            return;
        }
        if(this.s && this.isInTouchMode()) {
            if(this.getSelection() == null) {
                rect3 = null;
            }
            else {
                LayoutCoordinates layoutCoordinates0 = this.k;
                if(layoutCoordinates0 == null || !layoutCoordinates0.isAttached()) {
                    rect3 = null;
                }
                else {
                    LayoutCoordinates layoutCoordinates1 = this.requireContainerCoordinates$foundation_release();
                    SelectionRegistrarImpl selectionRegistrarImpl0 = this.a;
                    List list0 = selectionRegistrarImpl0.sort(layoutCoordinates1);
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    int v = list0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        Selectable selectable0 = (Selectable)list0.get(v1);
                        Selection selection0 = (Selection)selectionRegistrarImpl0.getSubselections().get(selectable0.getSelectableId());
                        Pair pair0 = selection0 == null ? null : TuplesKt.to(selectable0, selection0);
                        if(pair0 != null) {
                            arrayList0.add(pair0);
                        }
                    }
                    List list1 = SelectionManagerKt.access$firstAndLast(arrayList0);
                    if(list1.isEmpty()) {
                        rect3 = null;
                    }
                    else {
                        Rect rect0 = SelectionManagerKt.getSelectedRegionRect(list1, layoutCoordinates0);
                        if(Intrinsics.areEqual(rect0, SelectionManagerKt.a)) {
                            rect3 = null;
                        }
                        else {
                            Rect rect1 = SelectionManagerKt.visibleBounds(layoutCoordinates0).intersect(rect0);
                            if(rect1.getWidth() < 0.0f || rect1.getHeight() < 0.0f) {
                                rect3 = null;
                            }
                            else {
                                Rect rect2 = rect1.translate-k-4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates0));
                                rect3 = Rect.copy$default(rect2, 0.0f, 0.0f, 0.0f, rect2.getBottom() + 100.0f, 7, null);
                            }
                        }
                    }
                }
            }
            if(rect3 == null) {
                return;
            }
            c0 c01 = this.isNonEmptySelection$foundation_release() ? new c0(0, this, SelectionManager.class, "toolbarCopy", "toolbarCopy()V", 0, 2) : null;
            if(!this.isEntireContainerSelected$foundation_release()) {
                c00 = new c0(0, this, SelectionManager.class, "selectAll", "selectAll$foundation_release()V", 0, 3);
            }
            TextToolbar.showMenu$default(textToolbar0, rect3, c01, null, null, c00, 12, null);
            return;
        }
        if(textToolbar0.getStatus() == TextToolbarStatus.Shown) {
            textToolbar0.hide();
        }
    }

    public final void contextMenuOpenAdjustment-k-4lQ0M(long v) {
        Selection selection0 = this.getSelection();
        if((selection0 == null ? true : TextRange.getCollapsed-impl(selection0.toTextRange-d9O1mEE()))) {
            this.r = null;
            this.updateSelection-jyLRC_s$foundation_release(v, 0x7FC000007FC00000L, true, SelectionAdjustment.Companion.getWord());
        }
    }

    public final void copy$foundation_release() {
        AnnotatedString annotatedString0 = this.getSelectedText$foundation_release();
        if(annotatedString0 != null) {
            if(annotatedString0.length() <= 0) {
                annotatedString0 = null;
            }
            if(annotatedString0 != null) {
                ClipboardManager clipboardManager0 = this.f;
                if(clipboardManager0 != null) {
                    clipboardManager0.setText(annotatedString0);
                }
            }
        }
    }

    @Nullable
    public final Selectable getAnchorSelectable$foundation_release(@NotNull AnchorInfo selection$AnchorInfo0) {
        return (Selectable)this.a.getSelectableMap$foundation_release().get(selection$AnchorInfo0.getSelectableId());
    }

    @Nullable
    public final ClipboardManager getClipboardManager() {
        return this.f;
    }

    @Nullable
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.k;
    }

    @Nullable
    public final Offset getCurrentDragPosition-_m7T9-E() {
        return (Offset)this.q.getValue();
    }

    public final long getDragBeginPosition-F1C5BW0$foundation_release() {
        return ((Offset)this.l.getValue()).unbox-impl();
    }

    public final long getDragTotalDistance-F1C5BW0$foundation_release() {
        return ((Offset)this.m.getValue()).unbox-impl();
    }

    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle)this.p.getValue();
    }

    @Nullable
    public final Offset getEndHandlePosition-_m7T9-E() {
        return (Offset)this.o.getValue();
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.h;
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.e;
    }

    public final boolean getHasFocus() {
        return ((Boolean)this.i.getValue()).booleanValue();
    }

    @NotNull
    public final Modifier getModifier() {
        Modifier modifier1;
        Modifier modifier0 = Modifier.Companion;
        d1 d10 = new d1(this, 1);
        if(this.getHasFocus()) {
            h1 h10 = new h1(this, d10, null);
            modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier0, Unit.INSTANCE, h10);
        }
        else {
            modifier1 = modifier0;
        }
        Modifier modifier2 = KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier1, new a0(this, 3)), this.h), new a0(this, 4)), false, null, 3, null), new a0(this, 5)), new a0(this, 6));
        if(this.getDraggingHandle() != null && this.isInTouchMode() && !this.isTriviallyCollapsedSelection$foundation_release()) {
            modifier0 = SelectionManager_androidKt.selectionMagnifier(modifier0, this);
        }
        return modifier2.then(modifier0);
    }

    @NotNull
    public final Function1 getOnSelectionChange() {
        return this.d;
    }

    @Nullable
    public final SelectionLayout getPreviousSelectionLayout$foundation_release() {
        return this.r;
    }

    @VisibleForTesting
    public static void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    @Nullable
    public final AnnotatedString getSelectedText$foundation_release() {
        if(this.getSelection() != null) {
            SelectionRegistrarImpl selectionRegistrarImpl0 = this.a;
            if(!selectionRegistrarImpl0.getSubselections().isEmpty()) {
                Builder annotatedString$Builder0 = new Builder(0, 1, null);
                List list0 = selectionRegistrarImpl0.sort(this.requireContainerCoordinates$foundation_release());
                int v1 = list0.size();
                for(int v = 0; v < v1; ++v) {
                    Selectable selectable0 = (Selectable)list0.get(v);
                    Selection selection0 = (Selection)selectionRegistrarImpl0.getSubselections().get(selectable0.getSelectableId());
                    if(selection0 != null) {
                        AnnotatedString annotatedString0 = selectable0.getText();
                        annotatedString$Builder0.append((selection0.getHandlesCrossed() ? annotatedString0.subSequence(selection0.getEnd().getOffset(), selection0.getStart().getOffset()) : annotatedString0.subSequence(selection0.getStart().getOffset(), selection0.getEnd().getOffset())));
                    }
                }
                return annotatedString$Builder0.toAnnotatedString();
            }
        }
        return null;
    }

    @Nullable
    public final Selection getSelection() {
        return (Selection)this.b.getValue();
    }

    public final boolean getShowToolbar$foundation_release() {
        return this.s;
    }

    @Nullable
    public final Offset getStartHandlePosition-_m7T9-E() {
        return (Offset)this.n.getValue();
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.g;
    }

    @NotNull
    public final TextDragObserver handleDragObserver(boolean z) {
        return new TextDragObserver() {
            public final boolean a;
            public final SelectionManager b;

            {
                boolean z = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = z;
                this.b = selectionManager0;
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                this.b.setShowToolbar$foundation_release(true);
                SelectionManager.access$setDraggingHandle(this.b, null);
                SelectionManager.access$setCurrentDragPosition-_kEHs6E(this.b, null);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onDown-k-4lQ0M(long v) {
                SelectionManager selectionManager0 = this.b;
                boolean z = this.a;
                if((z ? selectionManager0.getStartHandlePosition-_m7T9-E() : selectionManager0.getEndHandlePosition-_m7T9-E()) != null) {
                    Selection selection0 = selectionManager0.getSelection();
                    if(selection0 == null) {
                        return;
                    }
                    Selectable selectable0 = selectionManager0.getAnchorSelectable$foundation_release((z ? selection0.getStart() : selection0.getEnd()));
                    if(selectable0 == null) {
                        return;
                    }
                    LayoutCoordinates layoutCoordinates0 = selectable0.getLayoutCoordinates();
                    if(layoutCoordinates0 == null) {
                        return;
                    }
                    long v1 = selectable0.getHandlePosition-dBAh8RU(selection0, z);
                    if(OffsetKt.isUnspecified-k-4lQ0M(v1)) {
                        return;
                    }
                    SelectionManager.access$setCurrentDragPosition-_kEHs6E(selectionManager0, Offset.box-impl(selectionManager0.requireContainerCoordinates$foundation_release().localPositionOf-R5De75A(layoutCoordinates0, SelectionHandlesKt.getAdjustedCoordinates-k-4lQ0M(v1))));
                    SelectionManager.access$setDraggingHandle(selectionManager0, (z ? Handle.SelectionStart : Handle.SelectionEnd));
                    selectionManager0.setShowToolbar$foundation_release(false);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onDrag-k-4lQ0M(long v) {
                SelectionManager selectionManager0 = this.b;
                if(selectionManager0.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager.access$setDragTotalDistance-k-4lQ0M(selectionManager0, Offset.plus-MK-Hz9U(selectionManager0.getDragTotalDistance-F1C5BW0$foundation_release(), v));
                long v1 = Offset.plus-MK-Hz9U(selectionManager0.getDragBeginPosition-F1C5BW0$foundation_release(), selectionManager0.getDragTotalDistance-F1C5BW0$foundation_release());
                Offset offset0 = Offset.box-impl(v1);
                long v2 = selectionManager0.getDragBeginPosition-F1C5BW0$foundation_release();
                if(this.b.updateSelection-qNKwrvQ$foundation_release(offset0, v2, this.a, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    SelectionManager.access$setDragBeginPosition-k-4lQ0M(selectionManager0, v1);
                    SelectionManager.access$setDragTotalDistance-k-4lQ0M(selectionManager0, 0L);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStart-k-4lQ0M(long v) {
                SelectionManager selectionManager0 = this.b;
                if(selectionManager0.getDraggingHandle() == null) {
                    return;
                }
                Selection selection0 = selectionManager0.getSelection();
                Intrinsics.checkNotNull(selection0);
                boolean z = this.a;
                Object object0 = selectionManager0.a.getSelectableMap$foundation_release().get((z ? selection0.getStart() : selection0.getEnd()).getSelectableId());
                if(object0 == null) {
                    throw new IllegalStateException("SelectionRegistrar should contain the current selection\'s selectableIds");
                }
                LayoutCoordinates layoutCoordinates0 = ((Selectable)object0).getLayoutCoordinates();
                if(layoutCoordinates0 == null) {
                    throw new IllegalStateException("Current selectable should have layout coordinates.");
                }
                long v1 = ((Selectable)object0).getHandlePosition-dBAh8RU(selection0, z);
                if(OffsetKt.isUnspecified-k-4lQ0M(v1)) {
                    return;
                }
                SelectionManager.access$setDragBeginPosition-k-4lQ0M(selectionManager0, selectionManager0.requireContainerCoordinates$foundation_release().localPositionOf-R5De75A(layoutCoordinates0, SelectionHandlesKt.getAdjustedCoordinates-k-4lQ0M(v1)));
                SelectionManager.access$setDragTotalDistance-k-4lQ0M(selectionManager0, 0L);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.b.setShowToolbar$foundation_release(true);
                SelectionManager.access$setDraggingHandle(this.b, null);
                SelectionManager.access$setCurrentDragPosition-_kEHs6E(this.b, null);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.b.setShowToolbar$foundation_release(true);
                SelectionManager.access$setDraggingHandle(this.b, null);
                SelectionManager.access$setCurrentDragPosition-_kEHs6E(this.b, null);
            }
        };
    }

    public final boolean isEntireContainerSelected$foundation_release() {
        LayoutCoordinates layoutCoordinates0 = this.requireContainerCoordinates$foundation_release();
        SelectionRegistrarImpl selectionRegistrarImpl0 = this.a;
        List list0 = selectionRegistrarImpl0.sort(layoutCoordinates0);
        if(list0.isEmpty()) {
            return true;
        }
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Selectable selectable0 = (Selectable)list0.get(v1);
            AnnotatedString annotatedString0 = selectable0.getText();
            if(annotatedString0.length() != 0) {
                Selection selection0 = (Selection)selectionRegistrarImpl0.getSubselections().get(selectable0.getSelectableId());
                if(selection0 == null || Math.abs(selection0.getStart().getOffset() - selection0.getEnd().getOffset()) != annotatedString0.length()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isInTouchMode() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    public final boolean isNonEmptySelection$foundation_release() {
        Selection selection0 = this.getSelection();
        if(selection0 == null) {
            return false;
        }
        if(Intrinsics.areEqual(selection0.getStart(), selection0.getEnd())) {
            return false;
        }
        if(Long.compare(selection0.getStart().getSelectableId(), selection0.getEnd().getSelectableId()) == 0) {
            return true;
        }
        LayoutCoordinates layoutCoordinates0 = this.requireContainerCoordinates$foundation_release();
        SelectionRegistrarImpl selectionRegistrarImpl0 = this.a;
        List list0 = selectionRegistrarImpl0.sort(layoutCoordinates0);
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Selectable selectable0 = (Selectable)list0.get(v1);
            Selection selection1 = (Selection)selectionRegistrarImpl0.getSubselections().get(selectable0.getSelectableId());
            if(selection1 != null && selection1.getStart().getOffset() != selection1.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        Selection selection0 = this.getSelection();
        return selection0 == null ? true : Intrinsics.areEqual(selection0.getStart(), selection0.getEnd());
    }

    public final void onRelease() {
        LongObjectMap longObjectMap0 = LongObjectMapKt.emptyLongObjectMap();
        this.a.setSubselections(longObjectMap0);
        this.setShowToolbar$foundation_release(false);
        if(this.getSelection() != null) {
            ((Function1)this.d).invoke(null);
            if(this.isInTouchMode()) {
                HapticFeedback hapticFeedback0 = this.e;
                if(hapticFeedback0 != null) {
                    hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
                }
            }
        }
    }

    @NotNull
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates0 = this.k;
        if(layoutCoordinates0 == null) {
            throw new IllegalArgumentException("null coordinates");
        }
        if(!layoutCoordinates0.isAttached()) {
            throw new IllegalArgumentException("unattached coordinates");
        }
        return layoutCoordinates0;
    }

    public final void selectAll$foundation_release() {
        LayoutCoordinates layoutCoordinates0 = this.requireContainerCoordinates$foundation_release();
        SelectionRegistrarImpl selectionRegistrarImpl0 = this.a;
        List list0 = selectionRegistrarImpl0.sort(layoutCoordinates0);
        if(list0.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMap0 = LongObjectMapKt.mutableLongObjectMapOf();
        int v = list0.size();
        Selection selection0 = null;
        Selection selection1 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            Selectable selectable0 = (Selectable)list0.get(v1);
            Selection selection2 = selectable0.getSelectAllSelection();
            if(selection2 != null) {
                if(selection0 == null) {
                    selection0 = selection2;
                }
                mutableLongObjectMap0.put(selectable0.getSelectableId(), selection2);
                selection1 = selection2;
            }
        }
        if(mutableLongObjectMap0.isEmpty()) {
            return;
        }
        if(selection0 != selection1) {
            Intrinsics.checkNotNull(selection0);
            Intrinsics.checkNotNull(selection1);
            selection0 = new Selection(selection0.getStart(), selection1.getEnd(), false);
        }
        selectionRegistrarImpl0.setSubselections(mutableLongObjectMap0);
        ((Function1)this.d).invoke(selection0);
        this.r = null;
    }

    @NotNull
    public final Pair selectAllInSelectable$foundation_release(long v, @Nullable Selection selection0) {
        MutableLongObjectMap mutableLongObjectMap0 = LongObjectMapKt.mutableLongObjectMapOf();
        LayoutCoordinates layoutCoordinates0 = this.requireContainerCoordinates$foundation_release();
        List list0 = this.a.sort(layoutCoordinates0);
        int v1 = list0.size();
        Selection selection1 = null;
        for(int v2 = 0; v2 < v1; ++v2) {
            Selectable selectable0 = (Selectable)list0.get(v2);
            Selection selection2 = selectable0.getSelectableId() == v ? selectable0.getSelectAllSelection() : null;
            if(selection2 != null) {
                mutableLongObjectMap0.set(selectable0.getSelectableId(), selection2);
            }
            selection1 = SelectionManagerKt.merge(selection1, selection2);
        }
        if(this.isInTouchMode() && !Intrinsics.areEqual(selection1, selection0)) {
            HapticFeedback hapticFeedback0 = this.e;
            if(hapticFeedback0 != null) {
                hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
            }
        }
        return new Pair(selection1, mutableLongObjectMap0);
    }

    public final void setClipboardManager(@Nullable ClipboardManager clipboardManager0) {
        this.f = clipboardManager0;
    }

    public final void setContainerLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.k = layoutCoordinates0;
        if(this.getHasFocus() && this.getSelection() != null) {
            Offset offset0 = layoutCoordinates0 == null ? null : Offset.box-impl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates0));
            if(!Intrinsics.areEqual(this.j, offset0)) {
                this.j = offset0;
                this.a();
                this.b();
            }
        }
    }

    public final void setFocusRequester(@NotNull FocusRequester focusRequester0) {
        this.h = focusRequester0;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback0) {
        this.e = hapticFeedback0;
    }

    public final void setHasFocus(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void setInTouchMode(boolean z) {
        MutableState mutableState0 = this.c;
        if(((Boolean)mutableState0.getValue()).booleanValue() != z) {
            mutableState0.setValue(Boolean.valueOf(z));
            this.b();
        }
    }

    public final void setOnSelectionChange(@NotNull Function1 function10) {
        this.d = new o(1, this, function10);
    }

    public final void setPreviousSelectionLayout$foundation_release(@Nullable SelectionLayout selectionLayout0) {
        this.r = selectionLayout0;
    }

    public final void setSelection(@Nullable Selection selection0) {
        this.b.setValue(selection0);
        if(selection0 != null) {
            this.a();
        }
    }

    public final void setShowToolbar$foundation_release(boolean z) {
        this.s = z;
        this.b();
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar0) {
        this.g = textToolbar0;
    }

    @VisibleForTesting
    public final boolean shouldPerformHaptics$foundation_release() {
        if(this.isInTouchMode()) {
            List list0 = this.a.getSelectables$foundation_release();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((Selectable)list0.get(v1)).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean updateSelection-jyLRC_s$foundation_release(long v, long v1, boolean z, @NotNull SelectionAdjustment selectionAdjustment0) {
        this.p.setValue((z ? Handle.SelectionStart : Handle.SelectionEnd));
        Offset offset0 = Offset.box-impl(v);
        this.q.setValue(offset0);
        LayoutCoordinates layoutCoordinates0 = this.requireContainerCoordinates$foundation_release();
        SelectionRegistrarImpl selectionRegistrarImpl0 = this.a;
        List list0 = selectionRegistrarImpl0.sort(layoutCoordinates0);
        MutableLongIntMap mutableLongIntMap0 = LongIntMapKt.mutableLongIntMapOf();
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            mutableLongIntMap0.set(((Selectable)list0.get(v3)).getSelectableId(), v3);
        }
        SelectionManager.getSelectionLayout-Wko1d7g..inlined.compareBy.1 selectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$10 = new SelectionManager.getSelectionLayout-Wko1d7g..inlined.compareBy.1(mutableLongIntMap0);
        SelectionLayoutBuilder selectionLayoutBuilder0 = new SelectionLayoutBuilder(v, v1, layoutCoordinates0, z, (OffsetKt.isUnspecified-k-4lQ0M(v1) ? null : this.getSelection()), selectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$10, null);
        int v4 = list0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            ((Selectable)list0.get(v5)).appendSelectableInfoToBuilder(selectionLayoutBuilder0);
        }
        SelectionLayout selectionLayout0 = selectionLayoutBuilder0.build();
        if(!selectionLayout0.shouldRecomputeSelection(this.r)) {
            return false;
        }
        Selection selection0 = selectionAdjustment0.adjust(selectionLayout0);
        if(!Intrinsics.areEqual(selection0, this.getSelection())) {
            if(this.shouldPerformHaptics$foundation_release()) {
                HapticFeedback hapticFeedback0 = this.e;
                if(hapticFeedback0 != null) {
                    hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
                }
            }
            selectionRegistrarImpl0.setSubselections(selectionLayout0.createSubSelections(selection0));
            ((Function1)this.d).invoke(selection0);
        }
        this.r = selectionLayout0;
        return true;
    }

    public final boolean updateSelection-qNKwrvQ$foundation_release(@Nullable Offset offset0, long v, boolean z, @NotNull SelectionAdjustment selectionAdjustment0) {
        return offset0 == null ? false : this.updateSelection-jyLRC_s$foundation_release(offset0.unbox-impl(), v, z, selectionAdjustment0);
    }
}

