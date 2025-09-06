package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import j0.i2;
import j0.o;
import j0.p1;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00AA\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u000B\u0010\fJl\u0010#\u001A\u00020\u00192\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0012\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010 \u001A\u00020\u001F\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u0017\u00107\u001A\u0002028\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R$\u0010?\u001A\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010F\u001A\u00020\n2\u0006\u0010@\u001A\u00020\n8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010\f\"\u0004\bD\u0010ER1\u0010M\u001A\u00020G2\u0006\u0010@\u001A\u00020G8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bH\u0010B\u001A\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u000E\u001A\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bN\u0010O\u001A\u0004\bP\u0010Q\"\u0004\bR\u0010SR+\u0010Z\u001A\u00020T2\u0006\u0010@\u001A\u00020T8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bU\u0010B\u001A\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010^\u001A\u00020\n2\u0006\u0010@\u001A\u00020\n8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b[\u0010B\u001A\u0004\b\\\u0010\f\"\u0004\b]\u0010ER+\u0010b\u001A\u00020\n2\u0006\u0010@\u001A\u00020\n8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b_\u0010B\u001A\u0004\b`\u0010\f\"\u0004\ba\u0010ER+\u0010f\u001A\u00020\n2\u0006\u0010@\u001A\u00020\n8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bc\u0010B\u001A\u0004\bd\u0010\f\"\u0004\be\u0010ER+\u0010j\u001A\u00020\n2\u0006\u0010@\u001A\u00020\n8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bg\u0010B\u001A\u0004\bh\u0010\f\"\u0004\bi\u0010ER$\u0010m\u001A\u00020\n2\u0006\u0010@\u001A\u00020\n8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bk\u0010l\u001A\u0004\bm\u0010\fR+\u0010o\u001A\u00020\n2\u0006\u0010@\u001A\u00020\n8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bn\u0010B\u001A\u0004\bo\u0010\f\"\u0004\bp\u0010ER#\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0006\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010tR#\u0010x\u001A\u000E\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u00190\u00178\u0006\u00A2\u0006\f\n\u0004\bv\u0010r\u001A\u0004\bw\u0010tR\u0017\u0010~\u001A\u00020y8\u0006\u00A2\u0006\f\n\u0004\bz\u0010{\u001A\u0004\b|\u0010}R-\u0010 \u001A\u00020\u001F8\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0017\n\u0005\b\u007F\u0010\u0080\u0001\u001A\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R9\u0010\u0089\u0001\u001A\u00030\u0085\u00012\u0007\u0010@\u001A\u00030\u0085\u00018F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0017\n\u0005\b\u0086\u0001\u0010B\u001A\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R9\u0010\u008D\u0001\u001A\u00030\u0085\u00012\u0007\u0010@\u001A\u00030\u0085\u00018F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0017\n\u0005\b\u008A\u0001\u0010B\u001A\u0006\b\u008B\u0001\u0010\u0082\u0001\"\u0006\b\u008C\u0001\u0010\u0084\u0001R0\u0010\u0094\u0001\u001A\u0005\u0018\u00010\u008E\u00012\n\u0010\u008F\u0001\u001A\u0005\u0018\u00010\u008E\u00018F@FX\u0086\u000E\u00A2\u0006\u0010\u001A\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R0\u0010\u009A\u0001\u001A\u0005\u0018\u00010\u0095\u00012\n\u0010\u008F\u0001\u001A\u0005\u0018\u00010\u0095\u00018F@FX\u0086\u000E\u00A2\u0006\u0010\u001A\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u009B\u0001"}, d2 = {"Landroidx/compose/foundation/text/LegacyTextFieldState;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "", "hasHighlight", "()Z", "Landroidx/compose/ui/text/AnnotatedString;", "untransformedText", "visualText", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "softWrap", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "update", "a", "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "b", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "c", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/ui/text/input/EditProcessor;", "d", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/TextInputSession;", "e", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "inputSession", "<set-?>", "f", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/unit/Dp;", "g", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "j", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/foundation/text/HandleState;", "k", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "l", "getShowFloatingToolbar", "setShowFloatingToolbar", "showFloatingToolbar", "m", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart", "n", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd", "o", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "p", "Z", "isLayoutResultStale", "q", "isInTouchMode", "setInTouchMode", "t", "Lkotlin/jvm/functions/Function1;", "getOnValueChange", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "u", "getOnImeActionPerformed", "onImeActionPerformed", "Landroidx/compose/ui/graphics/Paint;", "v", "Landroidx/compose/ui/graphics/Paint;", "getHighlightPaint", "()Landroidx/compose/ui/graphics/Paint;", "highlightPaint", "w", "J", "getSelectionBackgroundColor-0d7_KjU", "()J", "setSelectionBackgroundColor-8_81llA", "(J)V", "Landroidx/compose/ui/text/TextRange;", "x", "getSelectionPreviewHighlightRange-d9O1mEE", "setSelectionPreviewHighlightRange-5zc-tL8", "selectionPreviewHighlightRange", "y", "getDeletionPreviewHighlightRange-d9O1mEE", "setDeletionPreviewHighlightRange-5zc-tL8", "deletionPreviewHighlightRange", "Landroidx/compose/ui/layout/LayoutCoordinates;", "value", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResult", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1252:1\n148#2:1253\n81#3:1254\n107#3,2:1255\n81#3:1257\n107#3,2:1258\n81#3:1261\n107#3,2:1262\n81#3:1264\n107#3,2:1265\n81#3:1267\n107#3,2:1268\n81#3:1270\n107#3,2:1271\n81#3:1273\n107#3,2:1274\n81#3:1276\n107#3,2:1277\n81#3:1279\n107#3,2:1280\n81#3:1282\n107#3,2:1283\n1#4:1260\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n*L\n883#1:1253\n878#1:1254\n878#1:1255,2\n883#1:1257\n883#1:1258,2\n943#1:1261\n943#1:1262,2\n953#1:1264\n953#1:1265,2\n959#1:1267\n959#1:1268,2\n965#1:1270\n965#1:1271,2\n971#1:1273\n971#1:1274,2\n983#1:1276\n983#1:1277,2\n1015#1:1279\n1015#1:1280,2\n1016#1:1282\n1016#1:1283,2\n*E\n"})
public final class LegacyTextFieldState {
    public static final int $stable = 8;
    public TextDelegate a;
    public final RecomposeScope b;
    public final SoftwareKeyboardController c;
    public final EditProcessor d;
    public TextInputSession e;
    public final MutableState f;
    public final MutableState g;
    public LayoutCoordinates h;
    public final MutableState i;
    public AnnotatedString j;
    public final MutableState k;
    public final MutableState l;
    public final MutableState m;
    public final MutableState n;
    public final MutableState o;
    public boolean p;
    public final MutableState q;
    public final KeyboardActionRunner r;
    public Function1 s;
    public final i2 t;
    public final p1 u;
    public final Paint v;
    public long w;
    public final MutableState x;
    public final MutableState y;

    public LegacyTextFieldState(@NotNull TextDelegate textDelegate0, @NotNull RecomposeScope recomposeScope0, @Nullable SoftwareKeyboardController softwareKeyboardController0) {
        this.a = textDelegate0;
        this.b = recomposeScope0;
        this.c = softwareKeyboardController0;
        this.d = new EditProcessor();
        this.f = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.g = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
        this.i = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.k = SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.l = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.m = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.n = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.o = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.p = true;
        this.q = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.r = new KeyboardActionRunner(softwareKeyboardController0);
        this.s = o.A;
        this.t = new i2(this);
        this.u = new p1(this, 3);
        this.v = AndroidPaint_androidKt.Paint();
        this.w = 0L;
        this.x = SnapshotStateKt.mutableStateOf$default(TextRange.box-impl(0L), null, 2, null);
        this.y = SnapshotStateKt.mutableStateOf$default(TextRange.box-impl(0L), null, 2, null);
    }

    public final long getDeletionPreviewHighlightRange-d9O1mEE() {
        return ((TextRange)this.y.getValue()).unbox-impl();
    }

    @NotNull
    public final HandleState getHandleState() {
        return (HandleState)this.k.getValue();
    }

    public final boolean getHasFocus() {
        return ((Boolean)this.f.getValue()).booleanValue();
    }

    @NotNull
    public final Paint getHighlightPaint() {
        return this.v;
    }

    @Nullable
    public final TextInputSession getInputSession() {
        return this.e;
    }

    @Nullable
    public final SoftwareKeyboardController getKeyboardController() {
        return this.c;
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates0 = this.h;
        return layoutCoordinates0 != null && layoutCoordinates0.isAttached() ? layoutCoordinates0 : null;
    }

    @Nullable
    public final TextLayoutResultProxy getLayoutResult() {
        return (TextLayoutResultProxy)this.i.getValue();
    }

    public final float getMinHeightForSingleLineField-D9Ej5fM() {
        return ((Dp)this.g.getValue()).unbox-impl();
    }

    @NotNull
    public final Function1 getOnImeActionPerformed() {
        return this.u;
    }

    @NotNull
    public final Function1 getOnValueChange() {
        return this.t;
    }

    @NotNull
    public final EditProcessor getProcessor() {
        return this.d;
    }

    @NotNull
    public final RecomposeScope getRecomposeScope() {
        return this.b;
    }

    public final long getSelectionBackgroundColor-0d7_KjU() {
        return this.w;
    }

    public final long getSelectionPreviewHighlightRange-d9O1mEE() {
        return ((TextRange)this.x.getValue()).unbox-impl();
    }

    public final boolean getShowCursorHandle() {
        return ((Boolean)this.o.getValue()).booleanValue();
    }

    public final boolean getShowFloatingToolbar() {
        return ((Boolean)this.l.getValue()).booleanValue();
    }

    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean)this.n.getValue()).booleanValue();
    }

    public final boolean getShowSelectionHandleStart() {
        return ((Boolean)this.m.getValue()).booleanValue();
    }

    @NotNull
    public final TextDelegate getTextDelegate() {
        return this.a;
    }

    @Nullable
    public final AnnotatedString getUntransformedText() {
        return this.j;
    }

    // 去混淆评级： 低(20)
    public final boolean hasHighlight() {
        return !TextRange.getCollapsed-impl(this.getSelectionPreviewHighlightRange-d9O1mEE()) || !TextRange.getCollapsed-impl(this.getDeletionPreviewHighlightRange-d9O1mEE());
    }

    public final boolean isInTouchMode() {
        return ((Boolean)this.q.getValue()).booleanValue();
    }

    public final boolean isLayoutResultStale() {
        return this.p;
    }

    public final void setDeletionPreviewHighlightRange-5zc-tL8(long v) {
        TextRange textRange0 = TextRange.box-impl(v);
        this.y.setValue(textRange0);
    }

    public final void setHandleState(@NotNull HandleState handleState0) {
        this.k.setValue(handleState0);
    }

    public final void setHasFocus(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void setInTouchMode(boolean z) {
        this.q.setValue(Boolean.valueOf(z));
    }

    public final void setInputSession(@Nullable TextInputSession textInputSession0) {
        this.e = textInputSession0;
    }

    public final void setLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.h = layoutCoordinates0;
    }

    public final void setLayoutResult(@Nullable TextLayoutResultProxy textLayoutResultProxy0) {
        this.i.setValue(textLayoutResultProxy0);
        this.p = false;
    }

    public final void setMinHeightForSingleLineField-0680j_4(float f) {
        Dp dp0 = Dp.box-impl(f);
        this.g.setValue(dp0);
    }

    public final void setSelectionBackgroundColor-8_81llA(long v) {
        this.w = v;
    }

    public final void setSelectionPreviewHighlightRange-5zc-tL8(long v) {
        TextRange textRange0 = TextRange.box-impl(v);
        this.x.setValue(textRange0);
    }

    public final void setShowCursorHandle(boolean z) {
        this.o.setValue(Boolean.valueOf(z));
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.n.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    public final void setTextDelegate(@NotNull TextDelegate textDelegate0) {
        this.a = textDelegate0;
    }

    public final void setUntransformedText(@Nullable AnnotatedString annotatedString0) {
        this.j = annotatedString0;
    }

    public final void update-fnh65Uc(@NotNull AnnotatedString annotatedString0, @NotNull AnnotatedString annotatedString1, @NotNull TextStyle textStyle0, boolean z, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0, @NotNull Function1 function10, @NotNull KeyboardActions keyboardActions0, @NotNull FocusManager focusManager0, long v) {
        this.s = function10;
        this.w = v;
        this.r.setKeyboardActions(keyboardActions0);
        this.r.setFocusManager(focusManager0);
        this.j = annotatedString0;
        TextDelegate textDelegate0 = TextDelegateKt.updateTextDelegate-rm0N8CA$default(this.a, annotatedString1, textStyle0, density0, fontFamily$Resolver0, z, 0, 0, 0, CollectionsKt__CollectionsKt.emptyList(), 0x1C0, null);
        if(this.a != textDelegate0) {
            this.p = true;
        }
        this.a = textDelegate0;
    }
}

