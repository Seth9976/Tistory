package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009A\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000E\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0013\u001A\u00020\u00102\b\b\u0002\u0010\u000F\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0016\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001E\u0010\u001B\u001A\u00020\u00102\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010 \u001A\u00020\u00102\u0006\u0010\u001D\u001A\u00020\u001CH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010\"\u001A\u00020\u00102\u0006\u0010\u001D\u001A\u00020\u001CH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\u001FJ\u000F\u0010$\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b#\u0010\u0015J\u0019\u0010\'\u001A\u00020\u00102\b\b\u0002\u0010%\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b&\u0010\u0012J\u000F\u0010)\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b(\u0010\u0015J\u000F\u0010+\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b*\u0010\u0015J\u000F\u0010-\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b,\u0010\u0015J\u001D\u00100\u001A\u00020\u00172\u0006\u0010\u0007\u001A\u00020\u0006H\u0000\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/J\u001D\u00105\u001A\u00020\u00172\u0006\u00102\u001A\u000201H\u0000\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104J\u000F\u00107\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b6\u0010\u0015J\u000F\u00109\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b8\u0010\u0015J\u0018\u0010;\u001A\u00020\u00102\u0006\u0010\u0018\u001A\u00020\u0017\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u0010\u001FJ\u000F\u0010>\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR\"\u0010J\u001A\u00020C8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010G\"\u0004\bH\u0010IR.\u0010S\u001A\u000E\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00100K8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bM\u0010N\u001A\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010[\u001A\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bU\u0010V\u001A\u0004\bW\u0010X\"\u0004\bY\u0010ZR+\u0010c\u001A\u00020L2\u0006\u0010\\\u001A\u00020L8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\b]\u0010^\u001A\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001A\u00020d8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\be\u0010f\u001A\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010s\u001A\u0004\u0018\u00010l8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010n\u001A\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010{\u001A\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bu\u0010v\u001A\u0004\bw\u0010x\"\u0004\by\u0010zR(\u0010\u0083\u0001\u001A\u0004\u0018\u00010|8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0015\n\u0004\b}\u0010~\u001A\u0005\b\u007F\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u008B\u0001\u001A\u0005\u0018\u00010\u0084\u00018\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001A\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008A\u0001R/\u0010\u008F\u0001\u001A\u00020\u00062\u0006\u0010\\\u001A\u00020\u00068F@FX\u0086\u008E\u0002\u00A2\u0006\u0015\n\u0005\b\u008C\u0001\u0010^\u001A\u0005\b\u008D\u0001\u0010=\"\u0005\b\u008E\u0001\u0010\u0012R/\u0010\u0093\u0001\u001A\u00020\u00062\u0006\u0010\\\u001A\u00020\u00068F@FX\u0086\u008E\u0002\u00A2\u0006\u0015\n\u0005\b\u0090\u0001\u0010^\u001A\u0005\b\u0091\u0001\u0010=\"\u0005\b\u0092\u0001\u0010\u0012R7\u0010\u009A\u0001\u001A\u0005\u0018\u00010\u0094\u00012\t\u0010\\\u001A\u0005\u0018\u00010\u0094\u00018F@BX\u0086\u008E\u0002\u00A2\u0006\u0017\n\u0005\b\u0095\u0001\u0010^\u001A\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R:\u0010\u009F\u0001\u001A\u0004\u0018\u00010\u00172\b\u0010\\\u001A\u0004\u0018\u00010\u00178F@BX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0016\n\u0005\b\u009B\u0001\u0010^\u001A\u0006\b\u009C\u0001\u0010\u009D\u0001\"\u0005\b\u009E\u0001\u0010\u001AR\u001E\u0010\u00A3\u0001\u001A\u00020\b8\u0000X\u0080\u0004\u00A2\u0006\u000F\n\u0006\b\u00A0\u0001\u0010\u00A1\u0001\u001A\u0005\b\u00A2\u0001\u0010\rR \u0010\u00A9\u0001\u001A\u00030\u00A4\u00018\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u00A5\u0001\u0010\u00A6\u0001\u001A\u0006\b\u00A7\u0001\u0010\u00A8\u0001R\u001A\u0010\u00AD\u0001\u001A\u0005\u0018\u00010\u00AA\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00AB\u0001\u0010\u00AC\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00AE\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "cursorDragObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver", "showFloatingToolbar", "", "enterSelectionMode$foundation_release", "(Z)V", "enterSelectionMode", "exitSelectionMode$foundation_release", "()V", "exitSelectionMode", "Landroidx/compose/ui/geometry/Offset;", "position", "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "Landroidx/compose/ui/text/TextRange;", "range", "setSelectionPreviewHighlight-5zc-tL8$foundation_release", "(J)V", "setSelectionPreviewHighlight", "setDeletionPreviewHighlight-5zc-tL8$foundation_release", "setDeletionPreviewHighlight", "clearPreviewHighlight$foundation_release", "clearPreviewHighlight", "cancelSelection", "copy$foundation_release", "copy", "paste$foundation_release", "paste", "cut$foundation_release", "cut", "selectAll$foundation_release", "selectAll", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "Landroidx/compose/ui/unit/Density;", "density", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "contextMenuOpenAdjustment-k-4lQ0M", "contextMenuOpenAdjustment", "isTextChanged$foundation_release", "()Z", "isTextChanged", "a", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "b", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "offsetMapping", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "c", "Lkotlin/jvm/functions/Function1;", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "d", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "state", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value", "Landroidx/compose/ui/text/input/VisualTransformation;", "f", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "visualTransformation", "Landroidx/compose/ui/platform/ClipboardManager;", "g", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/TextToolbar;", "h", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "textToolbar", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "i", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/FocusRequester;", "j", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", "k", "getEditable", "setEditable", "editable", "l", "getEnabled", "setEnabled", "enabled", "Landroidx/compose/foundation/text/Handle;", "p", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "q", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "u", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "touchSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "v", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/ui/text/AnnotatedString;", "getTransformedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "transformedText", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1099:1\n81#2:1100\n107#2,2:1101\n81#2:1103\n107#2,2:1104\n81#2:1106\n107#2,2:1107\n81#2:1109\n107#2,2:1110\n81#2:1112\n107#2,2:1113\n1#3:1115\n148#4:1116\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n89#1:1100\n89#1:1101,2\n126#1:1103\n126#1:1104,2\n131#1:1106\n131#1:1107,2\n161#1:1109\n161#1:1110,2\n167#1:1112\n167#1:1113,2\n863#1:1116\n*E\n"})
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    public final UndoManager a;
    public OffsetMapping b;
    public Function1 c;
    public LegacyTextFieldState d;
    public final MutableState e;
    public VisualTransformation f;
    public ClipboardManager g;
    public TextToolbar h;
    public HapticFeedback i;
    public FocusRequester j;
    public final MutableState k;
    public final MutableState l;
    public long m;
    public Integer n;
    public long o;
    public final MutableState p;
    public final MutableState q;
    public int r;
    public TextFieldValue s;
    public SelectionLayout t;
    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager.touchSelectionObserver.1 u;
    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager.mouseSelectionObserver.1 v;

    public TextFieldSelectionManager() {
        this(null, 1, null);
    }

    public TextFieldSelectionManager(@Nullable UndoManager undoManager0) {
        this.a = undoManager0;
        this.b = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.c = v0.A;
        this.e = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(null, 0L, null, 7, null), null, 2, null);
        this.f = VisualTransformation.Companion.getNone();
        this.k = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.l = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.m = 0L;
        this.o = 0L;
        this.p = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.q = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.r = -1;
        this.s = new TextFieldValue(null, 0L, null, 7, null);
        this.u = new TextDragObserver() {
            public final TextFieldSelectionManager a;

            {
                this.a = textFieldSelectionManager0;
            }

            public final void a() {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                TextFieldSelectionManager.access$setDraggingHandle(textFieldSelectionManager0, null);
                TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(textFieldSelectionManager0, null);
                boolean z = true;
                TextFieldSelectionManager.access$updateFloatingToolbar(textFieldSelectionManager0, true);
                TextFieldSelectionManager.access$setDragBeginOffsetInText$p(textFieldSelectionManager0, null);
                boolean z1 = TextRange.getCollapsed-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE());
                TextFieldSelectionManager.access$setHandleState(textFieldSelectionManager0, (z1 ? HandleState.Cursor : HandleState.Selection));
                LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                if(legacyTextFieldState0 != null) {
                    legacyTextFieldState0.setShowSelectionHandleStart(!z1 && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager0, true));
                }
                LegacyTextFieldState legacyTextFieldState1 = textFieldSelectionManager0.getState$foundation_release();
                if(legacyTextFieldState1 != null) {
                    legacyTextFieldState1.setShowSelectionHandleEnd(!z1 && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager0, false));
                }
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager0.getState$foundation_release();
                if(legacyTextFieldState2 != null) {
                    if(!z1 || !TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager0, true)) {
                        z = false;
                    }
                    legacyTextFieldState2.setShowCursorHandle(z);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                this.a();
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onDown-k-4lQ0M(long v) {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onDrag-k-4lQ0M(long v) {
                long v2;
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                if(textFieldSelectionManager0.getEnabled() && textFieldSelectionManager0.getValue$foundation_release().getText().length() != 0) {
                    TextFieldSelectionManager.access$setDragTotalDistance$p(textFieldSelectionManager0, Offset.plus-MK-Hz9U(TextFieldSelectionManager.access$getDragTotalDistance$p(textFieldSelectionManager0), v));
                    LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                    if(legacyTextFieldState0 != null) {
                        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                        if(textLayoutResultProxy0 != null) {
                            TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(textFieldSelectionManager0, Offset.box-impl(Offset.plus-MK-Hz9U(TextFieldSelectionManager.access$getDragBeginPosition$p(textFieldSelectionManager0), TextFieldSelectionManager.access$getDragTotalDistance$p(textFieldSelectionManager0))));
                            if(TextFieldSelectionManager.access$getDragBeginOffsetInText$p(textFieldSelectionManager0) == null) {
                                Offset offset0 = textFieldSelectionManager0.getCurrentDragPosition-_m7T9-E();
                                Intrinsics.checkNotNull(offset0);
                                if(!textLayoutResultProxy0.isPositionOnText-k-4lQ0M(offset0.unbox-impl())) {
                                    int v1 = textFieldSelectionManager0.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getOffsetForPosition-3MmeM6k$default(textLayoutResultProxy0, TextFieldSelectionManager.access$getDragBeginPosition$p(textFieldSelectionManager0), false, 2, null));
                                    Offset offset1 = textFieldSelectionManager0.getCurrentDragPosition-_m7T9-E();
                                    Intrinsics.checkNotNull(offset1);
                                    SelectionAdjustment selectionAdjustment0 = v1 == textFieldSelectionManager0.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getOffsetForPosition-3MmeM6k$default(textLayoutResultProxy0, offset1.unbox-impl(), false, 2, null)) ? SelectionAdjustment.Companion.getNone() : SelectionAdjustment.Companion.getWord();
                                    TextFieldValue textFieldValue0 = textFieldSelectionManager0.getValue$foundation_release();
                                    Offset offset2 = textFieldSelectionManager0.getCurrentDragPosition-_m7T9-E();
                                    Intrinsics.checkNotNull(offset2);
                                    v2 = TextFieldSelectionManager.access$updateSelection-8UEBfa8(textFieldSelectionManager0, textFieldValue0, offset2.unbox-impl(), false, false, selectionAdjustment0, true);
                                    TextRange.box-impl(v2);
                                    TextFieldSelectionManager.access$updateFloatingToolbar(textFieldSelectionManager0, false);
                                    return;
                                }
                                goto label_21;
                            }
                            else {
                            label_21:
                                Integer integer0 = TextFieldSelectionManager.access$getDragBeginOffsetInText$p(textFieldSelectionManager0);
                                int v3 = integer0 == null ? textLayoutResultProxy0.getOffsetForPosition-3MmeM6k(TextFieldSelectionManager.access$getDragBeginPosition$p(textFieldSelectionManager0), false) : ((int)integer0);
                                Offset offset3 = textFieldSelectionManager0.getCurrentDragPosition-_m7T9-E();
                                Intrinsics.checkNotNull(offset3);
                                if(TextFieldSelectionManager.access$getDragBeginOffsetInText$p(textFieldSelectionManager0) == null && v3 == textLayoutResultProxy0.getOffsetForPosition-3MmeM6k(offset3.unbox-impl(), false)) {
                                    return;
                                }
                                TextFieldValue textFieldValue1 = textFieldSelectionManager0.getValue$foundation_release();
                                Offset offset4 = textFieldSelectionManager0.getCurrentDragPosition-_m7T9-E();
                                Intrinsics.checkNotNull(offset4);
                                v2 = TextFieldSelectionManager.access$updateSelection-8UEBfa8(textFieldSelectionManager0, textFieldValue1, offset4.unbox-impl(), false, false, SelectionAdjustment.Companion.getWord(), true);
                            }
                            TextRange.box-impl(v2);
                        }
                    }
                    TextFieldSelectionManager.access$updateFloatingToolbar(textFieldSelectionManager0, false);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStart-k-4lQ0M(long v) {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                if(textFieldSelectionManager0.getEnabled() && textFieldSelectionManager0.getDraggingHandle() == null) {
                    TextFieldSelectionManager.access$setDraggingHandle(textFieldSelectionManager0, Handle.SelectionEnd);
                    TextFieldSelectionManager.access$setPreviousRawDragOffset$p(textFieldSelectionManager0, -1);
                    textFieldSelectionManager0.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                    if(legacyTextFieldState0 == null) {
                    label_15:
                        LegacyTextFieldState legacyTextFieldState1 = textFieldSelectionManager0.getState$foundation_release();
                        if(legacyTextFieldState1 != null) {
                            TextLayoutResultProxy textLayoutResultProxy1 = legacyTextFieldState1.getLayoutResult();
                            if(textLayoutResultProxy1 != null) {
                                int v1 = textFieldSelectionManager0.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getOffsetForPosition-3MmeM6k$default(textLayoutResultProxy1, v, false, 2, null));
                                TextFieldValue textFieldValue1 = TextFieldSelectionManager.access$createTextFieldValue-FDrldGo(textFieldSelectionManager0, textFieldSelectionManager0.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(v1, v1));
                                textFieldSelectionManager0.enterSelectionMode$foundation_release(false);
                                HapticFeedback hapticFeedback0 = textFieldSelectionManager0.getHapticFeedBack();
                                if(hapticFeedback0 != null) {
                                    hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
                                }
                                textFieldSelectionManager0.getOnValueChange$foundation_release().invoke(textFieldValue1);
                            }
                        }
                    }
                    else {
                        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                        if(textLayoutResultProxy0 != null && textLayoutResultProxy0.isPositionOnText-k-4lQ0M(v)) {
                            if(textFieldSelectionManager0.getValue$foundation_release().getText().length() == 0) {
                                return;
                            }
                            textFieldSelectionManager0.enterSelectionMode$foundation_release(false);
                            TextFieldValue textFieldValue0 = TextFieldValue.copy-3r_uNRQ$default(this.a.getValue$foundation_release(), null, 0L, null, 5, null);
                            TextFieldSelectionManager.access$setDragBeginOffsetInText$p(textFieldSelectionManager0, TextRange.getStart-impl(TextFieldSelectionManager.access$updateSelection-8UEBfa8(this.a, textFieldValue0, v, true, false, SelectionAdjustment.Companion.getWord(), true)));
                            goto label_26;
                        }
                        goto label_15;
                    }
                label_26:
                    TextFieldSelectionManager.access$setHandleState(textFieldSelectionManager0, HandleState.None);
                    TextFieldSelectionManager.access$setDragBeginPosition$p(textFieldSelectionManager0, v);
                    TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(textFieldSelectionManager0, Offset.box-impl(TextFieldSelectionManager.access$getDragBeginPosition$p(textFieldSelectionManager0)));
                    TextFieldSelectionManager.access$setDragTotalDistance$p(textFieldSelectionManager0, 0L);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.a();
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }
        };
        this.v = new MouseSelectionObserver() {
            public final TextFieldSelectionManager a;

            {
                this.a = textFieldSelectionManager0;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean onDrag-3MmeM6k(long v, @NotNull SelectionAdjustment selectionAdjustment0) {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                if(textFieldSelectionManager0.getEnabled() && textFieldSelectionManager0.getValue$foundation_release().getText().length() != 0) {
                    LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                    if(legacyTextFieldState0 != null && legacyTextFieldState0.getLayoutResult() != null) {
                        this.updateMouseSelection(textFieldSelectionManager0.getValue$foundation_release(), v, false, selectionAdjustment0);
                        return true;
                    }
                }
                return false;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean onExtend-k-4lQ0M(long v) {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                if(legacyTextFieldState0 == null || legacyTextFieldState0.getLayoutResult() == null || !textFieldSelectionManager0.getEnabled()) {
                    return false;
                }
                TextFieldSelectionManager.access$setPreviousRawDragOffset$p(textFieldSelectionManager0, -1);
                this.updateMouseSelection(textFieldSelectionManager0.getValue$foundation_release(), v, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean onExtendDrag-k-4lQ0M(long v) {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                if(textFieldSelectionManager0.getEnabled() && textFieldSelectionManager0.getValue$foundation_release().getText().length() != 0) {
                    LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                    if(legacyTextFieldState0 != null && legacyTextFieldState0.getLayoutResult() != null) {
                        this.updateMouseSelection(textFieldSelectionManager0.getValue$foundation_release(), v, false, SelectionAdjustment.Companion.getNone());
                        return true;
                    }
                }
                return false;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean onStart-3MmeM6k(long v, @NotNull SelectionAdjustment selectionAdjustment0) {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                if(textFieldSelectionManager0.getEnabled() && textFieldSelectionManager0.getValue$foundation_release().getText().length() != 0) {
                    LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                    if(legacyTextFieldState0 != null && legacyTextFieldState0.getLayoutResult() != null) {
                        FocusRequester focusRequester0 = textFieldSelectionManager0.getFocusRequester();
                        if(focusRequester0 != null) {
                            focusRequester0.requestFocus();
                        }
                        TextFieldSelectionManager.access$setDragBeginPosition$p(textFieldSelectionManager0, v);
                        TextFieldSelectionManager.access$setPreviousRawDragOffset$p(textFieldSelectionManager0, -1);
                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager0, false, 1, null);
                        this.updateMouseSelection(textFieldSelectionManager0.getValue$foundation_release(), TextFieldSelectionManager.access$getDragBeginPosition$p(textFieldSelectionManager0), true, selectionAdjustment0);
                        return true;
                    }
                }
                return false;
            }

            public final void updateMouseSelection(@NotNull TextFieldValue textFieldValue0, long v, boolean z, @NotNull SelectionAdjustment selectionAdjustment0) {
                HandleState handleState0 = TextRange.getCollapsed-impl(TextFieldSelectionManager.access$updateSelection-8UEBfa8(this.a, textFieldValue0, v, z, false, selectionAdjustment0, false)) ? HandleState.Cursor : HandleState.Selection;
                TextFieldSelectionManager.access$setHandleState(this.a, handleState0);
            }
        };
    }

    public TextFieldSelectionManager(UndoManager undoManager0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            undoManager0 = null;
        }
        this(undoManager0);
    }

    public static TextFieldValue a(AnnotatedString annotatedString0, long v) {
        return new TextFieldValue(annotatedString0, v, null, 4, null);
    }

    public static final TextFieldValue access$createTextFieldValue-FDrldGo(TextFieldSelectionManager textFieldSelectionManager0, AnnotatedString annotatedString0, long v) {
        textFieldSelectionManager0.getClass();
        return TextFieldSelectionManager.a(annotatedString0, v);
    }

    public static final Integer access$getDragBeginOffsetInText$p(TextFieldSelectionManager textFieldSelectionManager0) {
        return textFieldSelectionManager0.n;
    }

    public static final void access$setCurrentDragPosition-_kEHs6E(TextFieldSelectionManager textFieldSelectionManager0, Offset offset0) {
        textFieldSelectionManager0.q.setValue(offset0);
    }

    public static final void access$setDragBeginOffsetInText$p(TextFieldSelectionManager textFieldSelectionManager0, Integer integer0) {
        textFieldSelectionManager0.n = integer0;
    }

    public static final void access$setDraggingHandle(TextFieldSelectionManager textFieldSelectionManager0, Handle handle0) {
        textFieldSelectionManager0.p.setValue(handle0);
    }

    public static final void access$setHandleState(TextFieldSelectionManager textFieldSelectionManager0, HandleState handleState0) {
        textFieldSelectionManager0.b(handleState0);
    }

    public final void b(HandleState handleState0) {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            if(legacyTextFieldState0.getHandleState() == handleState0) {
                legacyTextFieldState0 = null;
            }
            if(legacyTextFieldState0 != null) {
                legacyTextFieldState0.setHandleState(handleState0);
            }
        }
    }

    public final void c(boolean z) {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            legacyTextFieldState0.setShowFloatingToolbar(z);
        }
        if(z) {
            this.showSelectionToolbar$foundation_release();
            return;
        }
        this.hideSelectionToolbar$foundation_release();
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            legacyTextFieldState0.setDeletionPreviewHighlightRange-5zc-tL8(0L);
        }
        LegacyTextFieldState legacyTextFieldState1 = this.d;
        if(legacyTextFieldState1 != null) {
            legacyTextFieldState1.setSelectionPreviewHighlightRange-5zc-tL8(0L);
        }
    }

    public final void contextMenuOpenAdjustment-k-4lQ0M(long v) {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
            if(textLayoutResultProxy0 != null) {
                int v1 = TextLayoutResultProxy.getOffsetForPosition-3MmeM6k$default(textLayoutResultProxy0, v, false, 2, null);
                if(!TextRange.contains-impl(this.getValue$foundation_release().getSelection-d9O1mEE(), v1)) {
                    this.r = -1;
                    this.d(this.getValue$foundation_release(), v, true, false, SelectionAdjustment.Companion.getWord(), false);
                }
            }
        }
    }

    public final void copy$foundation_release(boolean z) {
        if(TextRange.getCollapsed-impl(this.getValue$foundation_release().getSelection-d9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager0 = this.g;
        if(clipboardManager0 != null) {
            clipboardManager0.setText(TextFieldValueKt.getSelectedText(this.getValue$foundation_release()));
        }
        if(!z) {
            return;
        }
        int v = TextRange.getMax-impl(this.getValue$foundation_release().getSelection-d9O1mEE());
        TextFieldValue textFieldValue0 = TextFieldSelectionManager.a(this.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(v, v));
        this.c.invoke(textFieldValue0);
        this.b(HandleState.None);
    }

    public static void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager0.copy$foundation_release(z);
    }

    @NotNull
    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() {
            public final TextFieldSelectionManager a;

            {
                this.a = textFieldSelectionManager0;
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onDown-k-4lQ0M(long v) {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onDrag-k-4lQ0M(long v) {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                textFieldSelectionManager0.o = Offset.plus-MK-Hz9U(textFieldSelectionManager0.o, v);
                LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                if(legacyTextFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                    if(textLayoutResultProxy0 != null) {
                        TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(textFieldSelectionManager0, Offset.box-impl(Offset.plus-MK-Hz9U(textFieldSelectionManager0.m, textFieldSelectionManager0.o)));
                        Offset offset0 = textFieldSelectionManager0.getCurrentDragPosition-_m7T9-E();
                        Intrinsics.checkNotNull(offset0);
                        int v1 = textFieldSelectionManager0.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getOffsetForPosition-3MmeM6k$default(textLayoutResultProxy0, offset0.unbox-impl(), false, 2, null));
                        long v2 = TextRangeKt.TextRange(v1, v1);
                        if(TextRange.equals-impl0(v2, textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE())) {
                            return;
                        }
                        LegacyTextFieldState legacyTextFieldState1 = textFieldSelectionManager0.getState$foundation_release();
                        if(legacyTextFieldState1 == null || legacyTextFieldState1.isInTouchMode()) {
                            HapticFeedback hapticFeedback0 = textFieldSelectionManager0.getHapticFeedBack();
                            if(hapticFeedback0 != null) {
                                hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
                            }
                        }
                        textFieldSelectionManager0.getOnValueChange$foundation_release().invoke(TextFieldSelectionManager.access$createTextFieldValue-FDrldGo(textFieldSelectionManager0, textFieldSelectionManager0.getValue$foundation_release().getAnnotatedString(), v2));
                    }
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStart-k-4lQ0M(long v) {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                long v1 = SelectionHandlesKt.getAdjustedCoordinates-k-4lQ0M(textFieldSelectionManager0.getHandlePosition-tuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                if(legacyTextFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                    if(textLayoutResultProxy0 != null) {
                        long v2 = textLayoutResultProxy0.translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release(v1);
                        textFieldSelectionManager0.m = v2;
                        TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(textFieldSelectionManager0, Offset.box-impl(v2));
                        textFieldSelectionManager0.o = 0L;
                        TextFieldSelectionManager.access$setDraggingHandle(textFieldSelectionManager0, Handle.Cursor);
                        textFieldSelectionManager0.c(false);
                    }
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.access$setDraggingHandle(this.a, null);
                TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(this.a, null);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.access$setDraggingHandle(this.a, null);
                TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(this.a, null);
            }
        };
    }

    public final void cut$foundation_release() {
        if(TextRange.getCollapsed-impl(this.getValue$foundation_release().getSelection-d9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager0 = this.g;
        if(clipboardManager0 != null) {
            clipboardManager0.setText(TextFieldValueKt.getSelectedText(this.getValue$foundation_release()));
        }
        AnnotatedString annotatedString0 = TextFieldValueKt.getTextBeforeSelection(this.getValue$foundation_release(), this.getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(this.getValue$foundation_release(), this.getValue$foundation_release().getText().length()));
        int v = TextRange.getMin-impl(this.getValue$foundation_release().getSelection-d9O1mEE());
        TextFieldValue textFieldValue0 = TextFieldSelectionManager.a(annotatedString0, TextRangeKt.TextRange(v, v));
        this.c.invoke(textFieldValue0);
        this.b(HandleState.None);
        UndoManager undoManager0 = this.a;
        if(undoManager0 != null) {
            undoManager0.forceNextSnapshot();
        }
    }

    public final long d(TextFieldValue textFieldValue0, long v, boolean z, boolean z1, SelectionAdjustment selectionAdjustment0, boolean z2) {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
            if(textLayoutResultProxy0 != null) {
                long v1 = TextRangeKt.TextRange(this.b.originalToTransformed(TextRange.getStart-impl(textFieldValue0.getSelection-d9O1mEE())), this.b.originalToTransformed(TextRange.getEnd-impl(textFieldValue0.getSelection-d9O1mEE())));
                boolean z3 = false;
                int v2 = textLayoutResultProxy0.getOffsetForPosition-3MmeM6k(v, false);
                int v3 = z1 || z ? v2 : TextRange.getStart-impl(v1);
                int v4 = !z1 || z ? v2 : TextRange.getEnd-impl(v1);
                SelectionLayout selectionLayout0 = this.t;
                int v5 = -1;
                if(!z && selectionLayout0 != null) {
                    int v6 = this.r;
                    if(v6 != -1) {
                        v5 = v6;
                    }
                }
                SelectionLayout selectionLayout1 = SelectionLayoutKt.getTextFieldSelectionLayout-RcvT-LA(textLayoutResultProxy0.getValue(), v3, v4, v5, v1, z, z1);
                if(!selectionLayout1.shouldRecomputeSelection(selectionLayout0)) {
                    return textFieldValue0.getSelection-d9O1mEE();
                }
                this.t = selectionLayout1;
                this.r = v2;
                Selection selection0 = selectionAdjustment0.adjust(selectionLayout1);
                long v7 = TextRangeKt.TextRange(this.b.transformedToOriginal(selection0.getStart().getOffset()), this.b.transformedToOriginal(selection0.getEnd().getOffset()));
                if(TextRange.equals-impl0(v7, textFieldValue0.getSelection-d9O1mEE())) {
                    return textFieldValue0.getSelection-d9O1mEE();
                }
                if(z2 && textFieldValue0.getText().length() > 0 && (TextRange.getReversed-impl(v7) == TextRange.getReversed-impl(textFieldValue0.getSelection-d9O1mEE()) || !TextRange.equals-impl0(TextRangeKt.TextRange(TextRange.getEnd-impl(v7), TextRange.getStart-impl(v7)), textFieldValue0.getSelection-d9O1mEE())) && (!TextRange.getCollapsed-impl(v7) || !TextRange.getCollapsed-impl(textFieldValue0.getSelection-d9O1mEE()))) {
                    HapticFeedback hapticFeedback0 = this.i;
                    if(hapticFeedback0 != null) {
                        hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
                    }
                }
                TextFieldValue textFieldValue1 = TextFieldSelectionManager.a(textFieldValue0.getAnnotatedString(), v7);
                this.c.invoke(textFieldValue1);
                if(!z2) {
                    this.c(!TextRange.getCollapsed-impl(v7));
                }
                LegacyTextFieldState legacyTextFieldState1 = this.d;
                if(legacyTextFieldState1 != null) {
                    legacyTextFieldState1.setInTouchMode(z2);
                }
                LegacyTextFieldState legacyTextFieldState2 = this.d;
                if(legacyTextFieldState2 != null) {
                    legacyTextFieldState2.setShowSelectionHandleStart(!TextRange.getCollapsed-impl(v7) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
                }
                LegacyTextFieldState legacyTextFieldState3 = this.d;
                if(legacyTextFieldState3 != null) {
                    legacyTextFieldState3.setShowSelectionHandleEnd(!TextRange.getCollapsed-impl(v7) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
                }
                LegacyTextFieldState legacyTextFieldState4 = this.d;
                if(legacyTextFieldState4 != null) {
                    if(TextRange.getCollapsed-impl(v7) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
                        z3 = true;
                    }
                    legacyTextFieldState4.setShowCursorHandle(z3);
                }
                return v7;
            }
        }
        return 0L;
    }

    public final void deselect-_kEHs6E$foundation_release(@Nullable Offset offset0) {
        if(!TextRange.getCollapsed-impl(this.getValue$foundation_release().getSelection-d9O1mEE())) {
            TextLayoutResultProxy textLayoutResultProxy0 = this.d == null ? null : this.d.getLayoutResult();
            int v = offset0 == null || textLayoutResultProxy0 == null ? TextRange.getMax-impl(this.getValue$foundation_release().getSelection-d9O1mEE()) : this.b.transformedToOriginal(TextLayoutResultProxy.getOffsetForPosition-3MmeM6k$default(textLayoutResultProxy0, offset0.unbox-impl(), false, 2, null));
            TextFieldValue textFieldValue0 = TextFieldValue.copy-3r_uNRQ$default(this.getValue$foundation_release(), null, TextRangeKt.TextRange(v), null, 5, null);
            this.c.invoke(textFieldValue0);
        }
        this.b((offset0 == null || this.getValue$foundation_release().getText().length() <= 0 ? HandleState.None : HandleState.Cursor));
        this.c(false);
    }

    public static void deselect-_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager0, Offset offset0, int v, Object object0) {
        if((v & 1) != 0) {
            offset0 = null;
        }
        textFieldSelectionManager0.deselect-_kEHs6E$foundation_release(offset0);
    }

    public final void enterSelectionMode$foundation_release(boolean z) {
        if(this.d != null && !this.d.getHasFocus()) {
            FocusRequester focusRequester0 = this.j;
            if(focusRequester0 != null) {
                focusRequester0.requestFocus();
            }
        }
        this.s = this.getValue$foundation_release();
        this.c(z);
        this.b(HandleState.Selection);
    }

    public static void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager0.enterSelectionMode$foundation_release(z);
    }

    public final void exitSelectionMode$foundation_release() {
        this.c(false);
        this.b(HandleState.None);
    }

    @Nullable
    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.g;
    }

    @Nullable
    public final Offset getCurrentDragPosition-_m7T9-E() {
        return (Offset)this.q.getValue();
    }

    public final long getCursorPosition-tuRUvjQ$foundation_release(@NotNull Density density0) {
        int v = this.b.originalToTransformed(TextRange.getStart-impl(this.getValue$foundation_release().getSelection-d9O1mEE()));
        TextLayoutResultProxy textLayoutResultProxy0 = this.d == null ? null : this.d.getLayoutResult();
        Intrinsics.checkNotNull(textLayoutResultProxy0);
        TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
        Rect rect0 = textLayoutResult0.getCursorRect(c.coerceIn(v, 0, textLayoutResult0.getLayoutInput().getText().length()));
        return OffsetKt.Offset(density0.toPx-0680j_4(0.0f) / 2.0f + rect0.getLeft(), rect0.getBottom());
    }

    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle)this.p.getValue();
    }

    public final boolean getEditable() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }

    public final boolean getEnabled() {
        return ((Boolean)this.l.getValue()).booleanValue();
    }

    @Nullable
    public final FocusRequester getFocusRequester() {
        return this.j;
    }

    public final long getHandlePosition-tuRUvjQ$foundation_release(boolean z) {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
            if(textLayoutResultProxy0 != null) {
                TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
                if(textLayoutResult0 != null) {
                    AnnotatedString annotatedString0 = this.getTransformedText$foundation_release();
                    if(annotatedString0 == null) {
                        return 0x7FC000007FC00000L;
                    }
                    if(!Intrinsics.areEqual(annotatedString0.getText(), textLayoutResult0.getLayoutInput().getText().getText())) {
                        return 0x7FC000007FC00000L;
                    }
                    long v = this.getValue$foundation_release().getSelection-d9O1mEE();
                    return z ? TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult0, this.b.originalToTransformed(TextRange.getStart-impl(v)), true, TextRange.getReversed-impl(this.getValue$foundation_release().getSelection-d9O1mEE())) : TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult0, this.b.originalToTransformed(TextRange.getEnd-impl(v)), false, TextRange.getReversed-impl(this.getValue$foundation_release().getSelection-d9O1mEE()));
                }
            }
        }
        return 0x7FC000007FC00000L;
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.i;
    }

    @NotNull
    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.v;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.b;
    }

    @NotNull
    public final Function1 getOnValueChange$foundation_release() {
        return this.c;
    }

    @Nullable
    public final LegacyTextFieldState getState$foundation_release() {
        return this.d;
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.h;
    }

    @NotNull
    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.u;
    }

    @Nullable
    public final AnnotatedString getTransformedText$foundation_release() {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            TextDelegate textDelegate0 = legacyTextFieldState0.getTextDelegate();
            return textDelegate0 == null ? null : textDelegate0.getText();
        }
        return null;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.a;
    }

    @NotNull
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue)this.e.getValue();
    }

    @NotNull
    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.f;
    }

    @NotNull
    public final TextDragObserver handleDragObserver$foundation_release(boolean z) {
        return new TextDragObserver() {
            public final TextFieldSelectionManager a;
            public final boolean b;

            {
                TextFieldSelectionManager textFieldSelectionManager0 = z;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = textFieldSelectionManager0;
                this.b = z;
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onDown-k-4lQ0M(long v) {
                TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                TextFieldSelectionManager.access$setDraggingHandle(textFieldSelectionManager0, (this.b ? Handle.SelectionStart : Handle.SelectionEnd));
                long v1 = SelectionHandlesKt.getAdjustedCoordinates-k-4lQ0M(textFieldSelectionManager0.getHandlePosition-tuRUvjQ$foundation_release(this.b));
                LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                if(legacyTextFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                    if(textLayoutResultProxy0 != null) {
                        long v2 = textLayoutResultProxy0.translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release(v1);
                        textFieldSelectionManager0.m = v2;
                        TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(textFieldSelectionManager0, Offset.box-impl(v2));
                        textFieldSelectionManager0.o = 0L;
                        textFieldSelectionManager0.r = -1;
                        LegacyTextFieldState legacyTextFieldState1 = textFieldSelectionManager0.getState$foundation_release();
                        if(legacyTextFieldState1 != null) {
                            legacyTextFieldState1.setInTouchMode(true);
                        }
                        textFieldSelectionManager0.c(false);
                    }
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onDrag-k-4lQ0M(long v) {
                this.a.o = Offset.plus-MK-Hz9U(this.a.o, v);
                Offset offset0 = Offset.box-impl(Offset.plus-MK-Hz9U(this.a.m, this.a.o));
                TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(this.a, offset0);
                TextFieldValue textFieldValue0 = this.a.getValue$foundation_release();
                Offset offset1 = this.a.getCurrentDragPosition-_m7T9-E();
                Intrinsics.checkNotNull(offset1);
                this.a.d(textFieldValue0, offset1.unbox-impl(), false, this.b, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                this.a.c(false);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStart-k-4lQ0M(long v) {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.access$setDraggingHandle(this.a, null);
                TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(this.a, null);
                this.a.c(true);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.access$setDraggingHandle(this.a, null);
                TextFieldSelectionManager.access$setCurrentDragPosition-_kEHs6E(this.a, null);
                this.a.c(true);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        if((this.h == null ? null : this.h.getStatus()) == TextToolbarStatus.Shown) {
            TextToolbar textToolbar0 = this.h;
            if(textToolbar0 != null) {
                textToolbar0.hide();
            }
        }
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.s.getText(), this.getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        ClipboardManager clipboardManager0 = this.g;
        if(clipboardManager0 != null) {
            AnnotatedString annotatedString0 = clipboardManager0.getText();
            if(annotatedString0 != null) {
                AnnotatedString annotatedString1 = TextFieldValueKt.getTextBeforeSelection(this.getValue$foundation_release(), this.getValue$foundation_release().getText().length()).plus(annotatedString0).plus(TextFieldValueKt.getTextAfterSelection(this.getValue$foundation_release(), this.getValue$foundation_release().getText().length()));
                int v = TextRange.getMin-impl(this.getValue$foundation_release().getSelection-d9O1mEE());
                int v1 = annotatedString0.length();
                TextFieldValue textFieldValue0 = TextFieldSelectionManager.a(annotatedString1, TextRangeKt.TextRange(v1 + v, v1 + v));
                this.c.invoke(textFieldValue0);
                this.b(HandleState.None);
                UndoManager undoManager0 = this.a;
                if(undoManager0 != null) {
                    undoManager0.forceNextSnapshot();
                }
            }
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValue0 = TextFieldSelectionManager.a(this.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, this.getValue$foundation_release().getText().length()));
        this.c.invoke(textFieldValue0);
        this.s = TextFieldValue.copy-3r_uNRQ$default(this.s, null, textFieldValue0.getSelection-d9O1mEE(), null, 5, null);
        this.enterSelectionMode$foundation_release(true);
    }

    public final void setClipboardManager$foundation_release(@Nullable ClipboardManager clipboardManager0) {
        this.g = clipboardManager0;
    }

    public final void setDeletionPreviewHighlight-5zc-tL8$foundation_release(long v) {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            legacyTextFieldState0.setDeletionPreviewHighlightRange-5zc-tL8(v);
        }
        LegacyTextFieldState legacyTextFieldState1 = this.d;
        if(legacyTextFieldState1 != null) {
            legacyTextFieldState1.setSelectionPreviewHighlightRange-5zc-tL8(0L);
        }
        if(!TextRange.getCollapsed-impl(v)) {
            this.exitSelectionMode$foundation_release();
        }
    }

    public final void setEditable(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void setEnabled(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(@Nullable FocusRequester focusRequester0) {
        this.j = focusRequester0;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback0) {
        this.i = hapticFeedback0;
    }

    public final void setOffsetMapping$foundation_release(@NotNull OffsetMapping offsetMapping0) {
        this.b = offsetMapping0;
    }

    public final void setOnValueChange$foundation_release(@NotNull Function1 function10) {
        this.c = function10;
    }

    public final void setSelectionPreviewHighlight-5zc-tL8$foundation_release(long v) {
        LegacyTextFieldState legacyTextFieldState0 = this.d;
        if(legacyTextFieldState0 != null) {
            legacyTextFieldState0.setSelectionPreviewHighlightRange-5zc-tL8(v);
        }
        LegacyTextFieldState legacyTextFieldState1 = this.d;
        if(legacyTextFieldState1 != null) {
            legacyTextFieldState1.setDeletionPreviewHighlightRange-5zc-tL8(0L);
        }
        if(!TextRange.getCollapsed-impl(v)) {
            this.exitSelectionMode$foundation_release();
        }
    }

    public final void setState$foundation_release(@Nullable LegacyTextFieldState legacyTextFieldState0) {
        this.d = legacyTextFieldState0;
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar0) {
        this.h = textToolbar0;
    }

    public final void setValue$foundation_release(@NotNull TextFieldValue textFieldValue0) {
        this.e.setValue(textFieldValue0);
    }

    public final void setVisualTransformation$foundation_release(@NotNull VisualTransformation visualTransformation0) {
        this.f = visualTransformation0;
    }

    public final void showSelectionToolbar$foundation_release() {
        Rect rect2;
        float f3;
        float f2;
        t1 t15;
        t1 t14;
        float f1;
        long v3;
        long v2;
        if(this.getEnabled() && (this.d == null || this.d.isInTouchMode())) {
            boolean z = this.f instanceof PasswordVisualTransformation;
            LegacyTextFieldState legacyTextFieldState0 = null;
            t1 t10 = TextRange.getCollapsed-impl(this.getValue$foundation_release().getSelection-d9O1mEE()) || z ? null : new t1(this, 0);
            t1 t11 = TextRange.getCollapsed-impl(this.getValue$foundation_release().getSelection-d9O1mEE()) || !this.getEditable() || z ? null : new t1(this, 1);
            t1 t12 = !this.getEditable() || (this.g == null || !this.g.hasText()) ? null : new t1(this, 2);
            t1 t13 = TextRange.getLength-impl(this.getValue$foundation_release().getSelection-d9O1mEE()) == this.getValue$foundation_release().getText().length() ? null : new t1(this, 3);
            TextToolbar textToolbar0 = this.h;
            if(textToolbar0 != null) {
                LegacyTextFieldState legacyTextFieldState1 = this.d;
                if(legacyTextFieldState1 == null) {
                label_79:
                    t14 = t11;
                    t15 = t13;
                    rect2 = Rect.Companion.getZero();
                }
                else {
                    if(!legacyTextFieldState1.isLayoutResultStale()) {
                        legacyTextFieldState0 = legacyTextFieldState1;
                    }
                    if(legacyTextFieldState0 != null) {
                        int v = this.b.originalToTransformed(TextRange.getStart-impl(this.getValue$foundation_release().getSelection-d9O1mEE()));
                        int v1 = this.b.originalToTransformed(TextRange.getEnd-impl(this.getValue$foundation_release().getSelection-d9O1mEE()));
                        LegacyTextFieldState legacyTextFieldState2 = this.d;
                        if(legacyTextFieldState2 == null) {
                            v2 = 0L;
                        }
                        else {
                            LayoutCoordinates layoutCoordinates0 = legacyTextFieldState2.getLayoutCoordinates();
                            v2 = layoutCoordinates0 == null ? 0L : layoutCoordinates0.localToRoot-MK-Hz9U(this.getHandlePosition-tuRUvjQ$foundation_release(true));
                        }
                        LegacyTextFieldState legacyTextFieldState3 = this.d;
                        if(legacyTextFieldState3 == null) {
                            v3 = 0L;
                        }
                        else {
                            LayoutCoordinates layoutCoordinates1 = legacyTextFieldState3.getLayoutCoordinates();
                            v3 = layoutCoordinates1 == null ? 0L : layoutCoordinates1.localToRoot-MK-Hz9U(this.getHandlePosition-tuRUvjQ$foundation_release(false));
                        }
                        LegacyTextFieldState legacyTextFieldState4 = this.d;
                        float f = 0.0f;
                        if(legacyTextFieldState4 == null) {
                        label_56:
                            t14 = t11;
                            t15 = t13;
                            f2 = 0.0f;
                        }
                        else {
                            LayoutCoordinates layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates();
                            if(layoutCoordinates2 != null) {
                                TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                                if(textLayoutResultProxy0 == null) {
                                    f1 = 0.0f;
                                }
                                else {
                                    TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
                                    if(textLayoutResult0 == null) {
                                        f1 = 0.0f;
                                    }
                                    else {
                                        Rect rect0 = textLayoutResult0.getCursorRect(v);
                                        f1 = rect0 == null ? 0.0f : rect0.getTop();
                                    }
                                }
                                t14 = t11;
                                t15 = t13;
                                f2 = Offset.getY-impl(layoutCoordinates2.localToRoot-MK-Hz9U(OffsetKt.Offset(0.0f, f1)));
                                goto label_59;
                            }
                            goto label_56;
                        }
                    label_59:
                        LegacyTextFieldState legacyTextFieldState5 = this.d;
                        if(legacyTextFieldState5 != null) {
                            LayoutCoordinates layoutCoordinates3 = legacyTextFieldState5.getLayoutCoordinates();
                            if(layoutCoordinates3 != null) {
                                TextLayoutResultProxy textLayoutResultProxy1 = legacyTextFieldState0.getLayoutResult();
                                if(textLayoutResultProxy1 == null) {
                                    f3 = 0.0f;
                                }
                                else {
                                    TextLayoutResult textLayoutResult1 = textLayoutResultProxy1.getValue();
                                    if(textLayoutResult1 == null) {
                                        f3 = 0.0f;
                                    }
                                    else {
                                        Rect rect1 = textLayoutResult1.getCursorRect(v1);
                                        f3 = rect1 == null ? 0.0f : rect1.getTop();
                                    }
                                }
                                f = Offset.getY-impl(layoutCoordinates3.localToRoot-MK-Hz9U(OffsetKt.Offset(0.0f, f3)));
                            }
                        }
                        rect2 = new Rect(Math.min(Offset.getX-impl(v2), Offset.getX-impl(v3)), Math.min(f2, f), Math.max(Offset.getX-impl(v2), Offset.getX-impl(v3)), legacyTextFieldState0.getTextDelegate().getDensity().getDensity() * 25.0f + Math.max(Offset.getY-impl(v2), Offset.getY-impl(v3)));
                        textToolbar0.showMenu(rect2, t10, t12, t14, t15);
                        return;
                    }
                    goto label_79;
                }
                textToolbar0.showMenu(rect2, t10, t12, t14, t15);
            }
        }
    }
}

