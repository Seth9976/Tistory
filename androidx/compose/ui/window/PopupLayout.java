package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.material3.gd;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.string;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.SourceDebugExtension;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v2.b;
import v2.i;
import v2.l;
import v2.p;
import v2.q;
import v2.r;

@SuppressLint({"ViewConstructor"})
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\"\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u0019\u001A\u00020\u00182\u0011\u0010\u001B\u001A\r\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\u0002\b\u001A\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u0004H\u0017\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010 \u001A\u00020\u0004H\u0014\u00A2\u0006\u0004\b \u0010\u0017J\u000F\u0010!\u001A\u00020\u0004H\u0014\u00A2\u0006\u0004\b!\u0010\u0017J\u001F\u0010\'\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\"2\u0006\u0010$\u001A\u00020\"H\u0010\u00A2\u0006\u0004\b%\u0010&J7\u00100\u001A\u00020\u00042\u0006\u0010)\u001A\u00020(2\u0006\u0010*\u001A\u00020\"2\u0006\u0010+\u001A\u00020\"2\u0006\u0010,\u001A\u00020\"2\u0006\u0010-\u001A\u00020\"H\u0010\u00A2\u0006\u0004\b.\u0010/J\u0017\u00103\u001A\u00020(2\u0006\u00102\u001A\u000201H\u0016\u00A2\u0006\u0004\b3\u00104J5\u00107\u001A\u00020\u00042\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u00106\u001A\u000205\u00A2\u0006\u0004\b7\u00108J\u0015\u0010;\u001A\u00020\u00042\u0006\u0010:\u001A\u000209\u00A2\u0006\u0004\b;\u0010<J\r\u0010=\u001A\u00020\u0004\u00A2\u0006\u0004\b=\u0010\u0017J\u000F\u0010?\u001A\u00020\u0004H\u0001\u00A2\u0006\u0004\b>\u0010\u0017J\r\u0010@\u001A\u00020\u0004\u00A2\u0006\u0004\b@\u0010\u0017J\r\u0010A\u001A\u00020\u0004\u00A2\u0006\u0004\bA\u0010\u0017J\u0019\u0010C\u001A\u00020(2\b\u00102\u001A\u0004\u0018\u00010BH\u0016\u00A2\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001A\u00020\u00042\u0006\u00106\u001A\u00020\"H\u0016\u00A2\u0006\u0004\bE\u0010FR\"\u0010\t\u001A\u00020\b8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010H\u001A\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010S\u001A\u00020M8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010\u0017\u001A\u0004\bP\u0010QR\"\u0010Z\u001A\u00020\u000E8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bT\u0010U\u001A\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010a\u001A\u0002058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^\"\u0004\b_\u0010`R5\u0010j\u001A\u0004\u0018\u00010b2\b\u0010c\u001A\u0004\u0018\u00010b8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bd\u0010e\u001A\u0004\bf\u0010g\"\u0004\bh\u0010iR/\u0010:\u001A\u0004\u0018\u0001092\b\u0010c\u001A\u0004\u0018\u0001098B@BX\u0082\u008E\u0002\u00A2\u0006\u0012\n\u0004\bk\u0010e\u001A\u0004\bl\u0010m\"\u0004\bn\u0010<R\u001B\u0010s\u001A\u00020(8FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\bo\u0010p\u001A\u0004\bq\u0010rRA\u0010\u001B\u001A\r\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\u0002\b\u001A2\u0011\u0010c\u001A\r\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\u0002\b\u001A8B@BX\u0082\u008E\u0002\u00A2\u0006\u0012\n\u0004\bt\u0010e\u001A\u0004\bu\u0010v\"\u0004\b\u001C\u0010wR$\u0010{\u001A\u00020(2\u0006\u0010c\u001A\u00020(8\u0014@RX\u0094\u000E\u00A2\u0006\f\n\u0004\bx\u0010y\u001A\u0004\bz\u0010rR\u0014\u0010~\u001A\u00020\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b|\u0010}R\u0016\u0010\u0081\u0001\u001A\u00020\"8BX\u0082\u0004\u00A2\u0006\u0007\u001A\u0005\b\u007F\u0010\u0080\u0001R\u0017\u0010\u0083\u0001\u001A\u00020\"8BX\u0082\u0004\u00A2\u0006\b\u001A\u0006\b\u0082\u0001\u0010\u0080\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/window/PopupPositionProvider;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "Landroidx/compose/ui/window/PopupLayoutHelper;", "popupLayoutHelper", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;Landroidx/compose/ui/window/PopupLayoutHelper;)V", "show", "()V", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "updateParameters", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "updateParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "pollForLocationOnScreenChange", "updateParentBounds$ui_release", "updateParentBounds", "updatePosition", "dismiss", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", "G", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/WindowManager$LayoutParams;", "K", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "params", "L", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "positionProvider", "M", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", "N", "Landroidx/compose/runtime/MutableState;", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "O", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "Q", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "U", "getContent", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "V", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,980:1\n148#2:981\n1#3:982\n81#4:983\n107#4,2:984\n81#4:986\n107#4,2:987\n81#4:989\n81#4:990\n107#4,2:991\n26#5:993\n26#5:994\n26#5:995\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n510#1:981\n499#1:983\n499#1:984,2\n500#1:986\n500#1:987,2\n504#1:989\n556#1:990\n556#1:991,2\n619#1:993\n625#1:994\n743#1:995\n*E\n"})
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.Ltr.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.Rtl.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public Function0 E;
    public PopupProperties F;
    public String G;
    public final View H;
    public final PopupLayoutHelper I;
    public final WindowManager J;
    public final WindowManager.LayoutParams K;
    public PopupPositionProvider L;
    public LayoutDirection M;
    public final MutableState N;
    public final MutableState O;
    public IntRect P;
    public final State Q;
    public final Rect R;
    public final SnapshotStateObserver S;
    public Object T;
    public final MutableState U;
    public boolean V;
    public final int[] W;
    public static final b a0;

    static {
        PopupLayout.a0 = b.A;
    }

    public PopupLayout(@Nullable Function0 function00, @NotNull PopupProperties popupProperties0, @NotNull String s, @NotNull View view0, @NotNull Density density0, @NotNull PopupPositionProvider popupPositionProvider0, @NotNull UUID uUID0, @NotNull PopupLayoutHelper popupLayoutHelper0) {
        super(view0.getContext(), null, 0, 6, null);
        this.E = function00;
        this.F = popupProperties0;
        this.G = s;
        this.H = view0;
        this.I = popupLayoutHelper0;
        Object object0 = view0.getContext().getSystemService("window");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.WindowManager");
        this.J = (WindowManager)object0;
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        windowManager$LayoutParams0.gravity = 0x800033;
        windowManager$LayoutParams0.flags = AndroidPopup_androidKt.access$flagsWithSecureFlagInherited(this.F, AndroidPopup_androidKt.isFlagSecureEnabled(view0));
        windowManager$LayoutParams0.type = 1002;
        windowManager$LayoutParams0.token = view0.getApplicationWindowToken();
        windowManager$LayoutParams0.width = -2;
        windowManager$LayoutParams0.height = -2;
        windowManager$LayoutParams0.format = -3;
        windowManager$LayoutParams0.setTitle(view0.getContext().getResources().getString(string.default_popup_window_title));
        this.K = windowManager$LayoutParams0;
        this.L = popupPositionProvider0;
        this.M = LayoutDirection.Ltr;
        this.N = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.O = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.Q = SnapshotStateKt.derivedStateOf(new e(this, 28));
        this.R = new Rect();
        this.S = new SnapshotStateObserver(new i(this, 2));
        this.setId(0x1020002);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view0));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view0));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view0));
        this.setTag(id.compose_view_saveable_id_tag, "Popup:" + uUID0);
        this.setClipChildren(false);
        this.setElevation(density0.toPx-0680j_4(8.0f));
        this.setOutlineProvider(new androidx.compose.ui.window.PopupLayout.2());  // 初始化器: Landroid/view/ViewOutlineProvider;-><init>()V
        this.U = SnapshotStateKt.mutableStateOf$default(ComposableSingletons.AndroidPopup_androidKt.INSTANCE.getLambda-1$ui_release(), null, 2, null);
        this.W = new int[2];

        @Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/window/PopupLayout$2", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "result", "Landroid/graphics/Outline;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.ui.window.PopupLayout.2 extends ViewOutlineProvider {
            @Override  // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view0, @NotNull Outline outline0) {
                outline0.setRect(0, 0, view0.getWidth(), view0.getHeight());
                outline0.setAlpha(0.0f);
            }
        }

    }

    public PopupLayout(Function0 function00, PopupProperties popupProperties0, String s, View view0, Density density0, PopupPositionProvider popupPositionProvider0, UUID uUID0, PopupLayoutHelper popupLayoutHelper0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        PopupLayoutHelper popupLayoutHelper1;
        if((v & 0x80) == 0) {
            popupLayoutHelper1 = popupLayoutHelper0;
        }
        else {
            r r0 = Build.VERSION.SDK_INT >= 29 ? new q() : new r();  // 初始化器: Ljava/lang/Object;-><init>()V / 初始化器: Ljava/lang/Object;-><init>()V
            popupLayoutHelper1 = r0;
        }
        this(function00, popupProperties0, s, view0, density0, popupPositionProvider0, uUID0, popupLayoutHelper1);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    @UiComposable
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-857613600);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(this) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857613600, v1, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            this.getContent().invoke(composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 16));
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.J.removeViewImmediate(this);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent0) {
        if(keyEvent0.getKeyCode() != 4 || !this.F.getDismissOnBackPress() || this.getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
            if(keyEvent$DispatcherState0 != null) {
                keyEvent$DispatcherState0.startTracking(keyEvent0, this);
            }
            return true;
        }
        if(keyEvent0.getAction() == 1) {
            KeyEvent.DispatcherState keyEvent$DispatcherState1 = this.getKeyDispatcherState();
            if(keyEvent$DispatcherState1 != null && keyEvent$DispatcherState1.isTracking(keyEvent0) && !keyEvent0.isCanceled()) {
                Function0 function00 = this.E;
                if(function00 != null) {
                    function00.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent0);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean)this.Q.getValue()).booleanValue();
    }

    private final Function2 getContent() {
        return (Function2)this.U.getValue();
    }

    private final int getDisplayHeight() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return Math.round(((float)this.getContext().getResources().getConfiguration().screenHeightDp) * f);
    }

    private final int getDisplayWidth() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return Math.round(((float)this.getContext().getResources().getConfiguration().screenWidthDp) * f);
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.K;
    }

    @VisibleForTesting
    public static void getParams$ui_release$annotations() {
    }

    private final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates)this.O.getValue();
    }

    @NotNull
    public final LayoutDirection getParentLayoutDirection() {
        return this.M;
    }

    @Nullable
    public final IntSize getPopupContentSize-bOM6tXw() {
        return (IntSize)this.N.getValue();
    }

    @NotNull
    public final PopupPositionProvider getPositionProvider() {
        return this.L;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.V;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.G;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int v, int v1, int v2, int v3) {
        super.internalOnLayout$ui_release(z, v, v1, v2, v3);
        if(!this.F.getUsePlatformDefaultWidth()) {
            View view0 = this.getChildAt(0);
            if(view0 == null) {
                return;
            }
            this.K.width = view0.getMeasuredWidth();
            this.K.height = view0.getMeasuredHeight();
            this.I.updateViewLayout(this.J, this, this.K);
        }
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int v, int v1) {
        if(this.F.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(v, v1);
            return;
        }
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), 0x80000000), View.MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), 0x80000000));
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S.start();
        if(this.F.getDismissOnBackPress() && Build.VERSION.SDK_INT >= 33) {
            if(this.T == null) {
                this.T = l.a(this.E);
            }
            l.b(this, this.T);
        }
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S.stop();
        this.S.clear();
        if(Build.VERSION.SDK_INT >= 33) {
            l.c(this, this.T);
        }
        this.T = null;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent0) {
        if(!this.F.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent0);
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 0 && (motionEvent0.getX() < 0.0f || motionEvent0.getX() >= ((float)this.getWidth()) || motionEvent0.getY() < 0.0f || motionEvent0.getY() >= ((float)this.getHeight()))) {
            Function0 function00 = this.E;
            if(function00 != null) {
                function00.invoke();
            }
            return true;
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 4) {
            Function0 function01 = this.E;
            if(function01 != null) {
                function01.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent0);
    }

    public final void pollForLocationOnScreenChange() {
        int v = this.W[0];
        int v1 = this.W[1];
        this.H.getLocationOnScreen(this.W);
        if(v != this.W[0] || v1 != this.W[1]) {
            this.updateParentBounds$ui_release();
        }
    }

    private final void setContent(Function2 function20) {
        this.U.setValue(function20);
    }

    public final void setContent(@NotNull CompositionContext compositionContext0, @NotNull Function2 function20) {
        this.setParentCompositionContext(compositionContext0);
        this.setContent(function20);
        this.V = true;
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates0) {
        this.O.setValue(layoutCoordinates0);
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection0) {
        this.M = layoutDirection0;
    }

    public final void setPopupContentSize-fhxjrPA(@Nullable IntSize intSize0) {
        this.N.setValue(intSize0);
    }

    public final void setPositionProvider(@NotNull PopupPositionProvider popupPositionProvider0) {
        this.L = popupPositionProvider0;
    }

    public final void setTestTag(@NotNull String s) {
        this.G = s;
    }

    public final void show() {
        this.J.addView(this, this.K);
    }

    public final void updateParameters(@Nullable Function0 function00, @NotNull PopupProperties popupProperties0, @NotNull String s, @NotNull LayoutDirection layoutDirection0) {
        this.E = function00;
        this.G = s;
        if(!Intrinsics.areEqual(this.F, popupProperties0)) {
            WindowManager.LayoutParams windowManager$LayoutParams0 = this.K;
            if(popupProperties0.getUsePlatformDefaultWidth() && !this.F.getUsePlatformDefaultWidth()) {
                windowManager$LayoutParams0.width = -2;
                windowManager$LayoutParams0.height = -2;
            }
            this.F = popupProperties0;
            windowManager$LayoutParams0.flags = AndroidPopup_androidKt.access$flagsWithSecureFlagInherited(popupProperties0, AndroidPopup_androidKt.isFlagSecureEnabled(this.H));
            this.I.updateViewLayout(this.J, this, windowManager$LayoutParams0);
        }
        int v = WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(v1);
    }

    @VisibleForTesting
    public final void updateParentBounds$ui_release() {
        LayoutCoordinates layoutCoordinates0 = this.getParentLayoutCoordinates();
        if(layoutCoordinates0 != null) {
            if(!layoutCoordinates0.isAttached()) {
                layoutCoordinates0 = null;
            }
            if(layoutCoordinates0 != null) {
                long v = layoutCoordinates0.getSize-YbymL2g();
                long v1 = LayoutCoordinatesKt.positionInWindow(layoutCoordinates0);
                IntRect intRect0 = IntRectKt.IntRect-VbeCjmY(IntOffsetKt.IntOffset(Math.round(Offset.getX-impl(v1)), Math.round(Offset.getY-impl(v1))), v);
                if(!Intrinsics.areEqual(intRect0, this.P)) {
                    this.P = intRect0;
                    this.updatePosition();
                }
            }
        }
    }

    public final void updateParentLayoutCoordinates(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.setParentLayoutCoordinates(layoutCoordinates0);
        this.updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        IntRect intRect0 = this.P;
        if(intRect0 == null) {
            return;
        }
        IntSize intSize0 = this.getPopupContentSize-bOM6tXw();
        if(intSize0 != null) {
            PopupLayoutHelper popupLayoutHelper0 = this.I;
            popupLayoutHelper0.getWindowVisibleDisplayFrame(this.H, this.R);
            IntRect intRect1 = AndroidPopup_androidKt.access$toIntBounds(this.R);
            long v = IntSizeKt.IntSize(intRect1.getWidth(), intRect1.getHeight());
            LongRef ref$LongRef0 = new LongRef();
            ref$LongRef0.element = 0L;
            p p0 = new p(ref$LongRef0, this, intRect0, v, intSize0.unbox-impl());
            this.S.observeReads(this, PopupLayout.a0, p0);
            WindowManager.LayoutParams windowManager$LayoutParams0 = this.K;
            windowManager$LayoutParams0.x = IntOffset.getX-impl(ref$LongRef0.element);
            windowManager$LayoutParams0.y = IntOffset.getY-impl(ref$LongRef0.element);
            if(this.F.getExcludeFromSystemGesture()) {
                popupLayoutHelper0.setGestureExclusionRects(this, IntSize.getWidth-impl(v), IntSize.getHeight-impl(v));
            }
            popupLayoutHelper0.updateViewLayout(this.J, this, windowManager$LayoutParams0);
        }
    }
}

