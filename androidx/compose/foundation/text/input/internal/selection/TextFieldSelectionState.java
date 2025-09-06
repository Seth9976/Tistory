package androidx.compose.foundation.text.input.internal.selection;

import androidx.activity.d0;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import j0.h0;
import j0.t1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import n0.b0;
import n0.c0;
import n0.e0;
import n0.i0;
import n0.j;
import n0.k;
import n0.l;
import n0.m;
import n0.n;
import n0.o;
import n0.p;
import n0.q;
import n0.r;
import n0.s;
import n0.t;
import n0.w;
import n0.x;
import n0.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0003opqB?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\b\u0012\u0006\u0010\f\u001A\u00020\b\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\b\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0014\u0010!\u001A\u00020\u001D*\u00020 H\u0086@\u00A2\u0006\u0004\b!\u0010\"J\u001C\u0010$\u001A\u00020\u001D*\u00020 2\u0006\u0010#\u001A\u00020\bH\u0086@\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u001DH\u0086@\u00A2\u0006\u0004\b&\u0010\'J\u0015\u0010*\u001A\u00020\u001D2\u0006\u0010)\u001A\u00020(\u00A2\u0006\u0004\b*\u0010+J\r\u0010,\u001A\u00020\u001D\u00A2\u0006\u0004\b,\u0010-J\u0014\u0010.\u001A\u00020\u001D*\u00020 H\u0086@\u00A2\u0006\u0004\b.\u0010\"J:\u00104\u001A\u00020\u001D*\u00020 2\b\u00100\u001A\u0004\u0018\u00010/2\f\u00102\u001A\b\u0012\u0004\u0012\u00020\u001D012\f\u00103\u001A\b\u0012\u0004\u0012\u00020\u001D01H\u0086@\u00A2\u0006\u0004\b4\u00105J\"\u00106\u001A\u00020\u001D*\u00020 2\f\u00102\u001A\b\u0012\u0004\u0012\u00020\u001D01H\u0086@\u00A2\u0006\u0004\b6\u00107J\u001F\u0010:\u001A\u00020\u00102\u0006\u0010#\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b8\u00109J \u0010A\u001A\u00020\u001D2\u0006\u0010<\u001A\u00020;2\u0006\u0010>\u001A\u00020=\u00F8\u0001\u0000\u00A2\u0006\u0004\b?\u0010@J\r\u0010B\u001A\u00020\u001D\u00A2\u0006\u0004\bB\u0010-J\r\u0010C\u001A\u00020\b\u00A2\u0006\u0004\bC\u0010DJ\r\u0010E\u001A\u00020\u001D\u00A2\u0006\u0004\bE\u0010-J\r\u0010F\u001A\u00020\b\u00A2\u0006\u0004\bF\u0010DJ\u0017\u0010H\u001A\u00020\u001D2\b\b\u0002\u0010G\u001A\u00020\b\u00A2\u0006\u0004\bH\u0010IJ\r\u0010J\u001A\u00020\b\u00A2\u0006\u0004\bJ\u0010DJ\r\u0010K\u001A\u00020\u001D\u00A2\u0006\u0004\bK\u0010-J\r\u0010L\u001A\u00020\b\u00A2\u0006\u0004\bL\u0010DJ\r\u0010M\u001A\u00020\u001D\u00A2\u0006\u0004\bM\u0010-J\r\u0010N\u001A\u00020\u001D\u00A2\u0006\u0004\bN\u0010-R\"\u0010\u000B\u001A\u00020\b8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bO\u0010P\u001A\u0004\b\u000B\u0010D\"\u0004\bQ\u0010IR+\u0010U\u001A\u00020\b2\u0006\u0010R\u001A\u00020\b8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bS\u0010T\u001A\u0004\bU\u0010D\"\u0004\bV\u0010IR,\u0010^\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010W\u0018\u0001018\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[\"\u0004\b\\\u0010]R/\u0010d\u001A\u0004\u0018\u00010;2\b\u0010R\u001A\u0004\u0018\u00010;8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b_\u0010T\u001A\u0004\b`\u0010a\"\u0004\bb\u0010cR+\u0010k\u001A\u00020e2\u0006\u0010R\u001A\u00020e8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bf\u0010T\u001A\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0017\u0010n\u001A\u00020=8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bl\u0010m\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006r"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/ui/unit/Density;", "density", "", "enabled", "readOnly", "isFocused", "isPassword", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZZ)V", "includePosition", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getCursorHandleState$foundation_release", "(Z)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getCursorHandleState", "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "", "update", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/ui/platform/ClipboardManager;Landroidx/compose/ui/platform/TextToolbar;Landroidx/compose/ui/unit/Density;ZZZ)V", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "cursorHandleGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isStartHandle", "selectionHandleGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "textToolbarState", "updateTextToolbarState", "(Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;)V", "dispose", "()V", "detectTouchMode", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "requestFocus", "showKeyboard", "detectTextFieldTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "textFieldSelectionGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectionHandleState$foundation_release", "(ZZ)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getSelectionHandleState", "Landroidx/compose/foundation/text/Handle;", "handle", "Landroidx/compose/ui/geometry/Offset;", "position", "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateHandleDragging", "clearHandleDragging", "canCut", "()Z", "cut", "canCopy", "cancelSelection", "copy", "(Z)V", "canPaste", "paste", "canSelectAll", "selectAll", "deselect", "f", "Z", "setFocused", "<set-?>", "k", "Landroidx/compose/runtime/MutableState;", "isInTouchMode", "setInTouchMode", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "l", "Lkotlin/jvm/functions/Function0;", "getReceiveContentConfiguration", "()Lkotlin/jvm/functions/Function0;", "setReceiveContentConfiguration", "(Lkotlin/jvm/functions/Function0;)V", "receiveContentConfiguration", "o", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "p", "getDirectDragGestureInitiator", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "setDirectDragGestureInitiator", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;)V", "directDragGestureInitiator", "getHandleDragPosition-F1C5BW0", "()J", "handleDragPosition", "InputType", "androidx/compose/foundation/text/input/internal/selection/b", "androidx/compose/foundation/text/input/internal/selection/c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,1542:1\n1409#1,6:1597\n1409#1,6:1603\n1409#1,6:1609\n1409#1,6:1615\n81#2:1543\n107#2,2:1544\n81#2:1546\n107#2,2:1547\n81#2:1549\n107#2,2:1550\n81#2:1552\n107#2,2:1553\n81#2:1555\n107#2,2:1556\n81#2:1558\n107#2,2:1559\n81#2:1561\n107#2,2:1562\n1#3:1564\n602#4,8:1565\n653#5,24:1573\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n1396#1:1597,6\n1397#1:1603,6\n1398#1:1609,6\n1399#1:1615,6\n130#1:1543\n130#1:1544,2\n146#1:1546\n146#1:1547,2\n166#1:1549\n166#1:1550,2\n199#1:1552\n199#1:1553,2\n208#1:1555\n208#1:1556,2\n213#1:1558\n213#1:1559,2\n219#1:1561\n219#1:1562,2\n299#1:1565,8\n545#1:1573,24\n*E\n"})
public final class TextFieldSelectionState {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "None", "Touch", "Mouse", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum InputType {
        None,
        Touch,
        Mouse;

    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[IndexTransformationType.values().length];
            try {
                arr_v[IndexTransformationType.Untransformed.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[IndexTransformationType.Deletion.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[IndexTransformationType.Insertion.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[IndexTransformationType.Replacement.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final TransformedTextFieldState a;
    public final TextLayoutState b;
    public Density c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public HapticFeedback h;
    public TextToolbar i;
    public ClipboardManager j;
    public final MutableState k;
    public Function0 l;
    public final MutableState m;
    public final MutableState n;
    public final MutableState o;
    public final MutableState p;
    public final MutableState q;
    public final MutableState r;
    public SelectionLayout s;
    public int t;
    public Press u;

    public TextFieldSelectionState(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull Density density0, boolean z, boolean z1, boolean z2, boolean z3) {
        this.a = transformedTextFieldState0;
        this.b = textLayoutState0;
        this.c = density0;
        this.d = z;
        this.e = z1;
        this.f = z2;
        this.g = z3;
        this.k = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.m = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0x7FC000007FC00000L), null, 2, null);
        this.n = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0x7FC000007FC00000L), null, 2, null);
        this.o = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.p = SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
        this.q = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.r = SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.t = -1;
    }

    public static final void a(LongRef ref$LongRef0, TextFieldSelectionState textFieldSelectionState0, LongRef ref$LongRef1) {
        if(OffsetKt.isSpecified-k-4lQ0M(ref$LongRef0.element)) {
            ref$LongRef0.element = 0x7FC000007FC00000L;
            ref$LongRef1.element = 0x7FC000007FC00000L;
            textFieldSelectionState0.clearHandleDragging();
        }
    }

    public static final Object access$detectCursorHandleDragGestures(TextFieldSelectionState textFieldSelectionState0, PointerInputScope pointerInputScope0, Continuation continuation0) {
        LongRef ref$LongRef3;
        Throwable throwable1;
        LongRef ref$LongRef2;
        TextFieldSelectionState textFieldSelectionState1;
        k k0;
        textFieldSelectionState0.getClass();
        if(continuation0 instanceof k) {
            k0 = (k)continuation0;
            int v = k0.t;
            if((v & 0x80000000) == 0) {
                k0 = new k(textFieldSelectionState0, continuation0);
            }
            else {
                k0.t = v ^ 0x80000000;
            }
        }
        else {
            k0 = new k(textFieldSelectionState0, continuation0);
        }
        Object object0 = k0.r;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(k0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                LongRef ref$LongRef0 = new LongRef();
                ref$LongRef0.element = 0x7FC000007FC00000L;
                LongRef ref$LongRef1 = new LongRef();
                ref$LongRef1.element = 0x7FC000007FC00000L;
                try {
                    l l0 = new l(ref$LongRef0, textFieldSelectionState0, ref$LongRef1);
                    m m0 = new m(ref$LongRef0, textFieldSelectionState0, ref$LongRef1);
                    n n0 = new n(ref$LongRef0, textFieldSelectionState0, ref$LongRef1);
                    o o0 = new o(ref$LongRef1, textFieldSelectionState0, ref$LongRef0);
                    k0.o = textFieldSelectionState0;
                    k0.p = ref$LongRef0;
                    k0.q = ref$LongRef1;
                    k0.t = 1;
                    if(DragGestureDetectorKt.detectDragGestures(pointerInputScope0, l0, m0, n0, o0, k0) != unit0) {
                        textFieldSelectionState1 = textFieldSelectionState0;
                        ref$LongRef3 = ref$LongRef0;
                        ref$LongRef2 = ref$LongRef1;
                        break;
                    }
                    return unit0;
                }
                catch(Throwable throwable0) {
                    textFieldSelectionState1 = textFieldSelectionState0;
                    ref$LongRef2 = ref$LongRef1;
                    throwable1 = throwable0;
                    ref$LongRef3 = ref$LongRef0;
                    TextFieldSelectionState.a(ref$LongRef3, textFieldSelectionState1, ref$LongRef2);
                    throw throwable1;
                }
                textFieldSelectionState1 = textFieldSelectionState0;
                ref$LongRef3 = ref$LongRef0;
                ref$LongRef2 = ref$LongRef1;
                break;
            }
            case 1: {
                try {
                    ref$LongRef2 = k0.q;
                    ref$LongRef3 = k0.p;
                    textFieldSelectionState1 = k0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                TextFieldSelectionState.a(ref$LongRef3, textFieldSelectionState1, ref$LongRef2);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        TextFieldSelectionState.a(ref$LongRef3, textFieldSelectionState1, ref$LongRef2);
        return Unit.INSTANCE;
    }

    public static final void access$detectCursorHandleDragGestures$onDragStop(LongRef ref$LongRef0, LongRef ref$LongRef1, TextFieldSelectionState textFieldSelectionState0) {
        TextFieldSelectionState.a(ref$LongRef0, textFieldSelectionState0, ref$LongRef1);
    }

    public static final Object access$detectSelectionHandleDragGestures(TextFieldSelectionState textFieldSelectionState0, PointerInputScope pointerInputScope0, boolean z, Continuation continuation0) {
        TextFieldSelectionState textFieldSelectionState2;
        LongRef ref$LongRef3;
        LongRef ref$LongRef2;
        Handle handle0;
        p p0;
        TextFieldSelectionState textFieldSelectionState1 = textFieldSelectionState0;
        textFieldSelectionState0.getClass();
        if(continuation0 instanceof p) {
            p0 = (p)continuation0;
            int v = p0.u;
            if((v & 0x80000000) == 0) {
                p0 = new p(textFieldSelectionState1, continuation0);
            }
            else {
                p0.u = v ^ 0x80000000;
            }
        }
        else {
            p0 = new p(textFieldSelectionState1, continuation0);
        }
        Object object0 = p0.s;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(p0.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                LongRef ref$LongRef0 = new LongRef();
                ref$LongRef0.element = 0x7FC000007FC00000L;
                LongRef ref$LongRef1 = new LongRef();
                ref$LongRef1.element = 0L;
                try {
                    q q0 = new q((z ? Handle.SelectionStart : Handle.SelectionEnd), textFieldSelectionState0, ref$LongRef0, ref$LongRef1, z);
                    r r0 = new r(ref$LongRef0, textFieldSelectionState1, ref$LongRef1);
                    s s0 = new s(ref$LongRef0, textFieldSelectionState1, ref$LongRef1);
                    handle0 = z ? Handle.SelectionStart : Handle.SelectionEnd;
                    ref$LongRef2 = ref$LongRef1;
                    t t0 = new t((z ? Handle.SelectionStart : Handle.SelectionEnd), textFieldSelectionState0, ref$LongRef1, ref$LongRef0, z);
                    p0.o = textFieldSelectionState1;
                    p0.p = ref$LongRef0;
                    p0.q = ref$LongRef1;
                    p0.r = z ? Handle.SelectionStart : Handle.SelectionEnd;
                    p0.u = 1;
                    handle0 = z ? Handle.SelectionStart : Handle.SelectionEnd;
                    ref$LongRef2 = ref$LongRef1;
                    if(DragGestureDetectorKt.detectDragGestures(pointerInputScope0, q0, r0, s0, t0, p0) != unit0) {
                        textFieldSelectionState2 = textFieldSelectionState1;
                        ref$LongRef3 = ref$LongRef0;
                        break;
                    }
                    return unit0;
                }
                catch(Throwable throwable0) {
                    ref$LongRef3 = ref$LongRef0;
                    goto label_50;
                }
                textFieldSelectionState2 = textFieldSelectionState1;
                ref$LongRef3 = ref$LongRef0;
                break;
            }
            case 1: {
                try {
                    handle0 = p0.r;
                    ref$LongRef2 = p0.q;
                    ref$LongRef3 = p0.p;
                    textFieldSelectionState2 = p0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    textFieldSelectionState1 = textFieldSelectionState2;
                }
            label_50:
                new t1(14, textFieldSelectionState1, handle0);
                if(textFieldSelectionState1.getDraggingHandle() == handle0) {
                    TextFieldSelectionState.b(ref$LongRef3, textFieldSelectionState1, ref$LongRef2);
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        new t1(14, textFieldSelectionState2, handle0);
        if(textFieldSelectionState2.getDraggingHandle() == handle0) {
            TextFieldSelectionState.b(ref$LongRef3, textFieldSelectionState2, ref$LongRef2);
        }
        return Unit.INSTANCE;
    }

    public static final Rect access$getContentRect(TextFieldSelectionState textFieldSelectionState0) {
        float f3;
        float f2;
        float f1;
        TextFieldCharSequence textFieldCharSequence0 = textFieldSelectionState0.a.getVisualText();
        if(TextRange.getCollapsed-impl(textFieldCharSequence0.getSelection-d9O1mEE())) {
            Rect rect0 = textFieldSelectionState0.getCursorRect();
            LayoutCoordinates layoutCoordinates0 = textFieldSelectionState0.d();
            return layoutCoordinates0 == null ? RectKt.Rect-tz77jQw(0L, rect0.getSize-NH-jbRc()) : RectKt.Rect-tz77jQw(layoutCoordinates0.localToRoot-MK-Hz9U(rect0.getTopLeft-F1C5BW0()), rect0.getSize-NH-jbRc());
        }
        LayoutCoordinates layoutCoordinates1 = textFieldSelectionState0.d();
        long v = layoutCoordinates1 == null ? 0L : layoutCoordinates1.localToRoot-MK-Hz9U(textFieldSelectionState0.c(true));
        LayoutCoordinates layoutCoordinates2 = textFieldSelectionState0.d();
        long v1 = layoutCoordinates2 == null ? 0L : layoutCoordinates2.localToRoot-MK-Hz9U(textFieldSelectionState0.c(false));
        LayoutCoordinates layoutCoordinates3 = textFieldSelectionState0.d();
        TextLayoutState textLayoutState0 = textFieldSelectionState0.b;
        float f = 0.0f;
        if(layoutCoordinates3 == null) {
            f2 = 0.0f;
        }
        else {
            TextLayoutResult textLayoutResult0 = textLayoutState0.getLayoutResult();
            if(textLayoutResult0 == null) {
                f1 = 0.0f;
            }
            else {
                Rect rect1 = textLayoutResult0.getCursorRect(TextRange.getStart-impl(textFieldCharSequence0.getSelection-d9O1mEE()));
                f1 = rect1 == null ? 0.0f : rect1.getTop();
            }
            f2 = Offset.getY-impl(layoutCoordinates3.localToRoot-MK-Hz9U(OffsetKt.Offset(0.0f, f1)));
        }
        LayoutCoordinates layoutCoordinates4 = textFieldSelectionState0.d();
        if(layoutCoordinates4 != null) {
            TextLayoutResult textLayoutResult1 = textLayoutState0.getLayoutResult();
            if(textLayoutResult1 == null) {
                f3 = 0.0f;
            }
            else {
                Rect rect2 = textLayoutResult1.getCursorRect(TextRange.getEnd-impl(textFieldCharSequence0.getSelection-d9O1mEE()));
                f3 = rect2 == null ? 0.0f : rect2.getTop();
            }
            f = Offset.getY-impl(layoutCoordinates4.localToRoot-MK-Hz9U(OffsetKt.Offset(0.0f, f3)));
        }
        return new Rect(Math.min(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.min(f2, f), Math.max(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.max(Offset.getY-impl(v), Offset.getY-impl(v1)));
    }

    public static final TextToolbarState access$getTextToolbarState(TextFieldSelectionState textFieldSelectionState0) {
        return (TextToolbarState)textFieldSelectionState0.r.getValue();
    }

    public static final void access$markStartContentVisibleOffset(TextFieldSelectionState textFieldSelectionState0) {
        LayoutCoordinates layoutCoordinates0 = textFieldSelectionState0.d();
        Offset offset0 = Offset.box-impl((layoutCoordinates0 == null ? 0x7FC000007FC00000L : LayoutCoordinatesKt.positionInWindow(layoutCoordinates0)));
        textFieldSelectionState0.m.setValue(offset0);
    }

    public static final Object access$observeTextChanges(TextFieldSelectionState textFieldSelectionState0, Continuation continuation0) {
        textFieldSelectionState0.getClass();
        Unit unit0 = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new h0(textFieldSelectionState0, 3)), c0.a), 1).collect(new d0(textFieldSelectionState0, 9), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final Object access$observeTextToolbarVisibility(TextFieldSelectionState textFieldSelectionState0, Continuation continuation0) {
        textFieldSelectionState0.getClass();
        Unit unit0 = SnapshotStateKt.snapshotFlow(new n0.d0(textFieldSelectionState0)).collect(new e0(textFieldSelectionState0), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final boolean access$placeCursorAtNearestOffset-k-4lQ0M(TextFieldSelectionState textFieldSelectionState0, long v) {
        int v4;
        IndexTransformationType indexTransformationType0;
        TextLayoutResult textLayoutResult0 = textFieldSelectionState0.b.getLayoutResult();
        if(textLayoutResult0 != null) {
            int v1 = textLayoutResult0.getOffsetForPosition-k-4lQ0M(v);
            if(v1 != -1) {
                TransformedTextFieldState transformedTextFieldState0 = textFieldSelectionState0.a;
                long v2 = transformedTextFieldState0.mapFromTransformed--jx7JFs(v1);
                long v3 = transformedTextFieldState0.mapToTransformed-GEjPoXI(v2);
                if(TextRange.getCollapsed-impl(v2) && TextRange.getCollapsed-impl(v3)) {
                    indexTransformationType0 = IndexTransformationType.Untransformed;
                }
                else if(TextRange.getCollapsed-impl(v2) || TextRange.getCollapsed-impl(v3)) {
                    indexTransformationType0 = !TextRange.getCollapsed-impl(v2) || TextRange.getCollapsed-impl(v3) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion;
                }
                else {
                    indexTransformationType0 = IndexTransformationType.Replacement;
                }
                SelectionWedgeAffinity selectionWedgeAffinity0 = null;
                switch(WhenMappings.$EnumSwitchMapping$0[indexTransformationType0.ordinal()]) {
                    case 1: {
                        v4 = TextRange.getStart-impl(v2);
                        break;
                    }
                    case 2: {
                        v4 = TextRange.getStart-impl(v2);
                        break;
                    }
                    case 3: {
                        selectionWedgeAffinity0 = MathUtilsKt.findClosestRect-9KIMszo(v, textLayoutResult0.getCursorRect(TextRange.getStart-impl(v3)), textLayoutResult0.getCursorRect(TextRange.getEnd-impl(v3))) >= 0 ? new SelectionWedgeAffinity(WedgeAffinity.End) : new SelectionWedgeAffinity(WedgeAffinity.Start);
                        v4 = TextRange.getStart-impl(v2);
                        break;
                    }
                    case 4: {
                        v4 = MathUtilsKt.findClosestRect-9KIMszo(v, textLayoutResult0.getCursorRect(TextRange.getStart-impl(v3)), textLayoutResult0.getCursorRect(TextRange.getEnd-impl(v3))) >= 0 ? TextRange.getEnd-impl(v2) : TextRange.getStart-impl(v2);
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                long v5 = TextRangeKt.TextRange(v4);
                if(!TextRange.equals-impl0(v5, transformedTextFieldState0.getUntransformedText().getSelection-d9O1mEE()) || selectionWedgeAffinity0 != null && !Intrinsics.areEqual(selectionWedgeAffinity0, transformedTextFieldState0.getSelectionWedgeAffinity())) {
                    transformedTextFieldState0.selectUntransformedCharsIn-5zc-tL8(v5);
                    if(selectionWedgeAffinity0 != null) {
                        transformedTextFieldState0.setSelectionWedgeAffinity(selectionWedgeAffinity0);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final void access$setShowCursorHandle(TextFieldSelectionState textFieldSelectionState0, boolean z) {
        textFieldSelectionState0.q.setValue(Boolean.valueOf(z));
    }

    public static final void access$setTextToolbarState(TextFieldSelectionState textFieldSelectionState0, TextToolbarState textToolbarState0) {
        textFieldSelectionState0.r.setValue(textToolbarState0);
    }

    public static final void access$showTextToolbar(TextFieldSelectionState textFieldSelectionState0, Rect rect0) {
        TextToolbar textToolbar0 = textFieldSelectionState0.i;
        if(textToolbar0 != null) {
            textToolbar0.showMenu(rect0, (textFieldSelectionState0.canCopy() ? new TextFieldSelectionState.showTextToolbar..inlined.menuItem.1(textFieldSelectionState0, TextToolbarState.None, textFieldSelectionState0) : null), (textFieldSelectionState0.canPaste() ? new TextFieldSelectionState.showTextToolbar..inlined.menuItem.2(textFieldSelectionState0, TextToolbarState.None, textFieldSelectionState0) : null), (textFieldSelectionState0.canCut() ? new TextFieldSelectionState.showTextToolbar..inlined.menuItem.3(textFieldSelectionState0, TextToolbarState.None, textFieldSelectionState0) : null), (textFieldSelectionState0.canSelectAll() ? new TextFieldSelectionState.showTextToolbar..inlined.menuItem.4(textFieldSelectionState0, TextToolbarState.Selection, textFieldSelectionState0) : null));
        }
    }

    public static final void b(LongRef ref$LongRef0, TextFieldSelectionState textFieldSelectionState0, LongRef ref$LongRef1) {
        if(OffsetKt.isSpecified-k-4lQ0M(ref$LongRef0.element)) {
            textFieldSelectionState0.clearHandleDragging();
            ref$LongRef0.element = 0x7FC000007FC00000L;
            ref$LongRef1.element = 0L;
            textFieldSelectionState0.t = -1;
        }
    }

    public final long c(boolean z) {
        TextLayoutResult textLayoutResult0 = this.b.getLayoutResult();
        if(textLayoutResult0 == null) {
            return 0L;
        }
        long v = this.a.getVisualText().getSelection-d9O1mEE();
        return z ? TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult0, TextRange.getStart-impl(v), true, TextRange.getReversed-impl(v)) : TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult0, TextRange.getEnd-impl(v), false, TextRange.getReversed-impl(v));
    }

    // 去混淆评级： 低(20)
    public final boolean canCopy() {
        return !TextRange.getCollapsed-impl(this.a.getVisualText().getSelection-d9O1mEE()) && !this.g;
    }

    // 去混淆评级： 低(40)
    public final boolean canCut() {
        return !TextRange.getCollapsed-impl(this.a.getVisualText().getSelection-d9O1mEE()) && this.d && !this.e && !this.g;
    }

    public final boolean canPaste() {
        ClipEntry clipEntry0 = null;
        if(!this.d || this.e) {
            return false;
        }
        if(this.j != null && this.j.hasText()) {
            return true;
        }
        if((this.l == null ? null : ((ReceiveContentConfiguration)this.l.invoke())) != null) {
            ClipboardManager clipboardManager0 = this.j;
            if(clipboardManager0 != null) {
                clipEntry0 = clipboardManager0.getClip();
            }
            return clipEntry0 != null;
        }
        return false;
    }

    public final boolean canSelectAll() {
        return TextRange.getLength-impl(this.a.getVisualText().getSelection-d9O1mEE()) != this.a.getVisualText().length();
    }

    public final void clearHandleDragging() {
        this.setDraggingHandle(null);
        Offset offset0 = Offset.box-impl(0x7FC000007FC00000L);
        this.n.setValue(offset0);
        Offset offset1 = Offset.box-impl(0x7FC000007FC00000L);
        this.m.setValue(offset1);
    }

    public final void copy(boolean z) {
        TransformedTextFieldState transformedTextFieldState0 = this.a;
        TextFieldCharSequence textFieldCharSequence0 = transformedTextFieldState0.getVisualText();
        if(TextRange.getCollapsed-impl(textFieldCharSequence0.getSelection-d9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager0 = this.j;
        if(clipboardManager0 != null) {
            clipboardManager0.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(textFieldCharSequence0).toString(), null, null, 6, null));
        }
        if(!z) {
            return;
        }
        transformedTextFieldState0.collapseSelectionToMax();
    }

    public static void copy$default(TextFieldSelectionState textFieldSelectionState0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        textFieldSelectionState0.copy(z);
    }

    @Nullable
    public final Object cursorHandleGestures(@NotNull PointerInputScope pointerInputScope0, @NotNull Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new j(this, pointerInputScope0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void cut() {
        TransformedTextFieldState transformedTextFieldState0 = this.a;
        TextFieldCharSequence textFieldCharSequence0 = transformedTextFieldState0.getVisualText();
        if(TextRange.getCollapsed-impl(textFieldCharSequence0.getSelection-d9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager0 = this.j;
        if(clipboardManager0 != null) {
            clipboardManager0.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(textFieldCharSequence0).toString(), null, null, 6, null));
        }
        transformedTextFieldState0.deleteSelectedText();
    }

    public final LayoutCoordinates d() {
        LayoutCoordinates layoutCoordinates0 = this.b.getTextLayoutNodeCoordinates();
        return layoutCoordinates0 != null && layoutCoordinates0.isAttached() ? layoutCoordinates0 : null;
    }

    public final void deselect() {
        TransformedTextFieldState transformedTextFieldState0 = this.a;
        if(!TextRange.getCollapsed-impl(transformedTextFieldState0.getVisualText().getSelection-d9O1mEE())) {
            transformedTextFieldState0.collapseSelectionToEnd();
        }
        this.q.setValue(Boolean.FALSE);
        this.updateTextToolbarState(TextToolbarState.None);
    }

    @Nullable
    public final Object detectTextFieldTapGestures(@NotNull PointerInputScope pointerInputScope0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Continuation continuation0) {
        Object object0 = TapGestureDetectorKt.detectTapAndPress(pointerInputScope0, new w(mutableInteractionSource0, this, null), new aa.r(function00, this, 13, function01), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object detectTouchMode(@NotNull PointerInputScope pointerInputScope0, @NotNull Continuation continuation0) {
        Object object0 = pointerInputScope0.awaitPointerEventScope(new x(this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void dispose() {
        this.e();
        this.i = null;
        this.j = null;
        this.h = null;
    }

    public final void e() {
        if((this.i == null ? null : this.i.getStatus()) == TextToolbarStatus.Shown) {
            TextToolbar textToolbar0 = this.i;
            if(textToolbar0 != null) {
                textToolbar0.hide();
            }
        }
    }

    public final long f(TextFieldCharSequence textFieldCharSequence0, int v, int v1, boolean z, SelectionAdjustment selectionAdjustment0, boolean z1, boolean z2) {
        long v2;
        TextRange textRange0 = TextRange.box-impl(textFieldCharSequence0.getSelection-d9O1mEE());
        if(z2 || !z1 && TextRange.getCollapsed-impl(textRange0.unbox-impl())) {
            textRange0 = null;
        }
        TextLayoutResult textLayoutResult0 = this.b.getLayoutResult();
        boolean z3 = false;
        if(textLayoutResult0 == null) {
            v2 = 0L;
        }
        else if(textRange0 != null || !Intrinsics.areEqual(selectionAdjustment0, SelectionAdjustment.Companion.getCharacter())) {
            SelectionLayout selectionLayout0 = SelectionLayoutKt.getTextFieldSelectionLayout-RcvT-LA(textLayoutResult0, v, v1, this.t, (textRange0 == null ? 0L : textRange0.unbox-impl()), textRange0 == null, z);
            if(textRange0 == null || selectionLayout0.shouldRecomputeSelection(this.s)) {
                v2 = selectionAdjustment0.adjust(selectionLayout0).toTextRange-d9O1mEE();
                this.s = selectionLayout0;
                this.t = z ? v : v1;
            }
            else {
                v2 = textRange0.unbox-impl();
            }
        }
        else {
            v2 = TextRangeKt.TextRange(v, v1);
        }
        if(TextRange.equals-impl0(v2, textFieldCharSequence0.getSelection-d9O1mEE())) {
            return v2;
        }
        if(TextRange.getReversed-impl(v2) != TextRange.getReversed-impl(textFieldCharSequence0.getSelection-d9O1mEE()) && TextRange.equals-impl0(TextRangeKt.TextRange(TextRange.getEnd-impl(v2), TextRange.getStart-impl(v2)), textFieldCharSequence0.getSelection-d9O1mEE())) {
            z3 = true;
        }
        if(this.isInTouchMode() && !z3) {
            HapticFeedback hapticFeedback0 = this.h;
            if(hapticFeedback0 != null) {
                hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
            }
        }
        return v2;
    }

    @NotNull
    public final TextFieldHandleState getCursorHandleState$foundation_release(boolean z) {
        long v1;
        boolean z4;
        TextFieldCharSequence textFieldCharSequence0 = this.a.getVisualText();
        boolean z1 = ((Boolean)this.q.getValue()).booleanValue();
        boolean z2 = true;
        boolean z3 = this.getDirectDragGestureInitiator() == InputType.None;
        Handle handle0 = this.getDraggingHandle();
        if(!z1 || !z3 || !TextRange.getCollapsed-impl(textFieldCharSequence0.getSelection-d9O1mEE()) || !textFieldCharSequence0.shouldShowSelection() || textFieldCharSequence0.length() <= 0) {
            z2 = false;
        }
        else if(handle0 != Handle.Cursor) {
            Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
            Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
            Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
            try {
                v1 = this.getCursorRect().getBottomCenter-F1C5BW0();
            }
            finally {
                Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
            }
            LayoutCoordinates layoutCoordinates0 = this.d();
            if(layoutCoordinates0 == null) {
                z4 = false;
            }
            else {
                Rect rect0 = SelectionManagerKt.visibleBounds(layoutCoordinates0);
                z4 = rect0 == null ? false : SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, v1);
            }
            if(!z4) {
                z2 = false;
            }
        }
        if(!z2) {
            return TextFieldHandleState.Companion.getHidden();
        }
        return z ? new TextFieldHandleState(true, this.getCursorRect().getBottomCenter-F1C5BW0(), ResolvedTextDirection.Ltr, false, null) : new TextFieldHandleState(true, 0x7FC000007FC00000L, ResolvedTextDirection.Ltr, false, null);
    }

    @NotNull
    public final Rect getCursorRect() {
        TextLayoutResult textLayoutResult0 = this.b.getLayoutResult();
        if(textLayoutResult0 == null) {
            return Rect.Companion.getZero();
        }
        TextFieldCharSequence textFieldCharSequence0 = this.a.getVisualText();
        if(!TextRange.getCollapsed-impl(textFieldCharSequence0.getSelection-d9O1mEE())) {
            return Rect.Companion.getZero();
        }
        Rect rect0 = textLayoutResult0.getCursorRect(TextRange.getStart-impl(textFieldCharSequence0.getSelection-d9O1mEE()));
        float f = this.c.toPx-0680j_4(0.0f);
        float f1 = c.coerceAtLeast(c.coerceAtMost((textLayoutResult0.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr ? f / 2.0f + rect0.getLeft() : rect0.getRight() - f / 2.0f), ((float)IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g())) - f / 2.0f), f / 2.0f);
        return new Rect(f1 - f / 2.0f, rect0.getTop(), f1 + f / 2.0f, rect0.getBottom());
    }

    @NotNull
    public final InputType getDirectDragGestureInitiator() {
        return (InputType)this.p.getValue();
    }

    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle)this.o.getValue();
    }

    public final long getHandleDragPosition-F1C5BW0() {
        MutableState mutableState0 = this.n;
        if(OffsetKt.isUnspecified-k-4lQ0M(((Offset)mutableState0.getValue()).unbox-impl())) {
            return 0x7FC000007FC00000L;
        }
        MutableState mutableState1 = this.m;
        if(OffsetKt.isUnspecified-k-4lQ0M(((Offset)mutableState1.getValue()).unbox-impl())) {
            long v = ((Offset)mutableState0.getValue()).unbox-impl();
            return TextLayoutStateKt.fromDecorationToTextLayout-Uv8p0NA(this.b, v);
        }
        long v1 = ((Offset)mutableState0.getValue()).unbox-impl();
        long v2 = ((Offset)mutableState1.getValue()).unbox-impl();
        LayoutCoordinates layoutCoordinates0 = this.d();
        return layoutCoordinates0 == null ? Offset.plus-MK-Hz9U(v1, Offset.minus-MK-Hz9U(v2, 0x7FC000007FC00000L)) : Offset.plus-MK-Hz9U(v1, Offset.minus-MK-Hz9U(v2, LayoutCoordinatesKt.positionInWindow(layoutCoordinates0)));
    }

    @Nullable
    public final Function0 getReceiveContentConfiguration() {
        return this.l;
    }

    @NotNull
    public final TextFieldHandleState getSelectionHandleState$foundation_release(boolean z, boolean z1) {
        boolean z3;
        boolean z2;
        Handle handle0 = z ? Handle.SelectionStart : Handle.SelectionEnd;
        TextLayoutResult textLayoutResult0 = this.b.getLayoutResult();
        if(textLayoutResult0 == null) {
            return TextFieldHandleState.Companion.getHidden();
        }
        TransformedTextFieldState transformedTextFieldState0 = this.a;
        long v = transformedTextFieldState0.getVisualText().getSelection-d9O1mEE();
        if(TextRange.getCollapsed-impl(v)) {
            return TextFieldHandleState.Companion.getHidden();
        }
        long v1 = this.c(z);
        if(this.getDirectDragGestureInitiator() != InputType.None) {
            z3 = false;
        }
        else if(this.getDraggingHandle() != handle0) {
            LayoutCoordinates layoutCoordinates0 = this.d();
            if(layoutCoordinates0 == null) {
                z2 = false;
            }
            else {
                Rect rect0 = SelectionManagerKt.visibleBounds(layoutCoordinates0);
                z2 = rect0 == null ? false : SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, v1);
            }
            z3 = z2;
        }
        else {
            z3 = true;
        }
        if(!z3) {
            return TextFieldHandleState.Companion.getHidden();
        }
        if(!transformedTextFieldState0.getVisualText().shouldShowSelection()) {
            return TextFieldHandleState.Companion.getHidden();
        }
        ResolvedTextDirection resolvedTextDirection0 = textLayoutResult0.getBidiRunDirection((z ? TextRange.getStart-impl(v) : Math.max(TextRange.getEnd-impl(v) - 1, 0)));
        boolean z4 = TextRange.getReversed-impl(v);
        if(z1) {
            LayoutCoordinates layoutCoordinates1 = this.d();
            if(layoutCoordinates1 != null) {
                Rect rect1 = SelectionManagerKt.visibleBounds(layoutCoordinates1);
                if(rect1 != null) {
                    v1 = TextLayoutStateKt.coerceIn-3MmeM6k(v1, rect1);
                }
            }
            return new TextFieldHandleState(true, v1, resolvedTextDirection0, z4, null);
        }
        return new TextFieldHandleState(true, 0x7FC000007FC00000L, resolvedTextDirection0, z4, null);
    }

    public final boolean isFocused() {
        return this.f;
    }

    public final boolean isInTouchMode() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }

    @Nullable
    public final Object observeChanges(@NotNull Continuation continuation0) {
        TextFieldSelectionState textFieldSelectionState0;
        y y0;
        if(continuation0 instanceof y) {
            y0 = (y)continuation0;
            int v = y0.r;
            if((v & 0x80000000) == 0) {
                y0 = new y(this, continuation0);
            }
            else {
                y0.r = v ^ 0x80000000;
            }
        }
        else {
            y0 = new y(this, continuation0);
        }
        Object object0 = y0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(y0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    b0 b00 = new b0(this, null);
                    y0.o = this;
                    y0.r = 1;
                    if(CoroutineScopeKt.coroutineScope(b00, y0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    textFieldSelectionState0 = this;
                    goto label_29;
                }
                textFieldSelectionState0 = this;
                break;
            }
            case 1: {
                try {
                    textFieldSelectionState0 = y0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_29:
                textFieldSelectionState0.q.setValue(Boolean.FALSE);
                if(((TextToolbarState)textFieldSelectionState0.r.getValue()) != TextToolbarState.None) {
                    textFieldSelectionState0.e();
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        textFieldSelectionState0.q.setValue(Boolean.FALSE);
        if(((TextToolbarState)textFieldSelectionState0.r.getValue()) != TextToolbarState.None) {
            textFieldSelectionState0.e();
        }
        return Unit.INSTANCE;
    }

    public final void paste() {
        Function0 function00 = this.l;
        if(function00 != null) {
            ReceiveContentConfiguration receiveContentConfiguration0 = (ReceiveContentConfiguration)function00.invoke();
            if(receiveContentConfiguration0 != null) {
                ClipboardManager clipboardManager0 = this.j;
                if(clipboardManager0 != null) {
                    ClipEntry clipEntry0 = clipboardManager0.getClip();
                    if(clipEntry0 != null) {
                        ClipMetadata clipMetadata0 = clipEntry0.getClipMetadata();
                        TransferableContent transferableContent0 = receiveContentConfiguration0.getReceiveContentListener().onReceive(new TransferableContent(clipEntry0, clipMetadata0, 2, null, 8, null));
                        if(transferableContent0 != null) {
                            ClipEntry clipEntry1 = transferableContent0.getClipEntry();
                            if(clipEntry1 != null) {
                                String s = TransferableContent_androidKt.readPlainText(clipEntry1);
                                if(s != null) {
                                    TransformedTextFieldState.replaceSelectedText$default(this.a, s, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
                                }
                            }
                        }
                        return;
                    }
                }
                ClipboardManager clipboardManager1 = this.j;
                if(clipboardManager1 != null) {
                    AnnotatedString annotatedString0 = clipboardManager1.getText();
                    if(annotatedString0 != null) {
                        String s1 = annotatedString0.getText();
                        if(s1 != null) {
                            TransformedTextFieldState.replaceSelectedText$default(this.a, s1, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
                        }
                    }
                }
                return;
            }
        }
        ClipboardManager clipboardManager2 = this.j;
        if(clipboardManager2 != null) {
            AnnotatedString annotatedString1 = clipboardManager2.getText();
            if(annotatedString1 != null) {
                String s2 = annotatedString1.getText();
                if(s2 != null) {
                    TransformedTextFieldState.replaceSelectedText$default(this.a, s2, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
                }
            }
        }
    }

    public final void selectAll() {
        this.a.selectAll();
    }

    @Nullable
    public final Object selectionHandleGestures(@NotNull PointerInputScope pointerInputScope0, boolean z, @NotNull Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new i0(this, pointerInputScope0, z, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void setDirectDragGestureInitiator(@NotNull InputType textFieldSelectionState$InputType0) {
        this.p.setValue(textFieldSelectionState$InputType0);
    }

    public final void setDraggingHandle(@Nullable Handle handle0) {
        this.o.setValue(handle0);
    }

    public final void setFocused(boolean z) {
        this.f = z;
    }

    public final void setInTouchMode(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void setReceiveContentConfiguration(@Nullable Function0 function00) {
        this.l = function00;
    }

    @Nullable
    public final Object textFieldSelectionGestures(@NotNull PointerInputScope pointerInputScope0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        Object object0 = SelectionGesturesKt.selectionGesturePointerInputBtf2(pointerInputScope0, new b(this, function00), new androidx.compose.foundation.text.input.internal.selection.c(this, function00), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void update(@NotNull HapticFeedback hapticFeedback0, @NotNull ClipboardManager clipboardManager0, @NotNull TextToolbar textToolbar0, @NotNull Density density0, boolean z, boolean z1, boolean z2) {
        if(!z) {
            this.e();
        }
        this.h = hapticFeedback0;
        this.j = clipboardManager0;
        this.i = textToolbar0;
        this.c = density0;
        this.d = z;
        this.e = z1;
        this.g = z2;
    }

    public final void updateHandleDragging-Uv8p0NA(@NotNull Handle handle0, long v) {
        this.setDraggingHandle(handle0);
        Offset offset0 = Offset.box-impl(v);
        this.n.setValue(offset0);
    }

    public final void updateTextToolbarState(@NotNull TextToolbarState textToolbarState0) {
        this.r.setValue(textToolbarState0);
    }
}

