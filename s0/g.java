package s0;

import android.graphics.Rect;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import androidx.compose.material.internal.ComposableSingletons.ExposedDropdownMenuPopup_androidKt;
import androidx.compose.material.internal.PopupLayout.2;
import androidx.compose.material.internal.PopupLayout.WhenMappings;
import androidx.compose.material3.gd;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.string;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0.e;

public final class g extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener, ViewRootForInspector {
    public Function0 E;
    public final View F;
    public final WindowManager G;
    public final WindowManager.LayoutParams H;
    public PopupPositionProvider I;
    public LayoutDirection J;
    public final MutableState K;
    public final MutableState L;
    public final State M;
    public final Rect N;
    public final Rect O;
    public final a P;
    public final MutableState Q;
    public boolean R;

    public g(Function0 function00, View view0, Density density0, PopupPositionProvider popupPositionProvider0, UUID uUID0) {
        super(view0.getContext(), null, 0, 6, null);
        this.E = function00;
        this.F = view0;
        Object object0 = view0.getContext().getSystemService("window");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.WindowManager");
        this.G = (WindowManager)object0;
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        windowManager$LayoutParams0.gravity = 0x800033;
        windowManager$LayoutParams0.flags = 0x60020;
        windowManager$LayoutParams0.softInputMode = 1;
        windowManager$LayoutParams0.type = 1000;
        windowManager$LayoutParams0.token = view0.getApplicationWindowToken();
        windowManager$LayoutParams0.width = -2;
        windowManager$LayoutParams0.height = -2;
        windowManager$LayoutParams0.format = -3;
        windowManager$LayoutParams0.setTitle(view0.getContext().getResources().getString(string.default_popup_window_title));
        this.H = windowManager$LayoutParams0;
        this.I = popupPositionProvider0;
        this.J = LayoutDirection.Ltr;
        this.K = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.L = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.M = SnapshotStateKt.derivedStateOf(new e(this, 17));
        this.N = new Rect();
        this.O = new Rect();
        this.P = a.y;
        this.setId(0x1020002);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view0));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view0));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view0));
        view0.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.setTag(id.compose_view_saveable_id_tag, "Popup:" + uUID0);
        this.setClipChildren(false);
        this.setElevation(density0.toPx-0680j_4(8.0f));
        this.setOutlineProvider(new PopupLayout.2());  // 初始化器: Landroid/view/ViewOutlineProvider;-><init>()V
        this.Q = SnapshotStateKt.mutableStateOf$default(ComposableSingletons.ExposedDropdownMenuPopup_androidKt.INSTANCE.getLambda-1$material_release(), null, 2, null);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCC7B0D67);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCC7B0D67, v, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:301)");
        }
        ((Function2)this.Q.getValue()).invoke(composer1, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 13));
        }
    }

    public final void c(Function0 function00, LayoutDirection layoutDirection0) {
        this.E = function00;
        int v = PopupLayout.WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(v1);
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(keyEvent0.getKeyCode() != 4 || this.getKeyDispatcherState() == null) {
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

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.R;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public final AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.F.getWindowVisibleDisplayFrame(this.O);
        if(!Intrinsics.areEqual(this.O, this.N)) {
            this.updatePosition();
        }
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0 == null) {
            return super.onTouchEvent(null);
        }
        if(motionEvent0.getAction() == 0 && (motionEvent0.getX() < 0.0f || motionEvent0.getX() >= ((float)this.getWidth()) || motionEvent0.getY() < 0.0f || motionEvent0.getY() >= ((float)this.getHeight())) || motionEvent0.getAction() == 4) {
            IntRect intRect0 = (IntRect)this.K.getValue();
            if(intRect0 == null) {
                goto label_7;
            }
            Offset offset0 = motionEvent0.getRawX() != 0.0f && motionEvent0.getRawY() != 0.0f ? Offset.box-impl(OffsetKt.Offset(motionEvent0.getRawX(), motionEvent0.getRawY())) : null;
            if(((Boolean)this.P.invoke(offset0, intRect0)).booleanValue()) {
            label_7:
                Function0 function00 = this.E;
                if(function00 != null) {
                    function00.invoke();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public final void setLayoutDirection(int v) {
    }

    public final void updatePosition() {
        Object object0 = this.K.getValue();
        if(((IntRect)object0) == null) {
            return;
        }
        IntSize intSize0 = (IntSize)this.L.getValue();
        if(intSize0 != null) {
            this.F.getWindowVisibleDisplayFrame(this.N);
            IntRect intRect0 = new IntRect(this.N.left, this.N.top, this.N.right, this.N.bottom);
            long v = this.I.calculatePosition-llwVHH4(((IntRect)object0), IntSizeKt.IntSize(intRect0.getWidth(), intRect0.getHeight()), this.J, intSize0.unbox-impl());
            this.H.x = IntOffset.getX-impl(v);
            this.H.y = IntOffset.getY-impl(v);
            this.G.updateViewLayout(this, this.H);
        }
    }
}

