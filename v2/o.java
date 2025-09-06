package v2;

import android.os.Build.VERSION;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.style;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.DialogWrapper.1.2;
import androidx.compose.ui.window.DialogWrapper.WhenMappings;
import androidx.compose.ui.window.SecureFlagPolicy_androidKt;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class o extends ComponentDialog implements ViewRootForInspector {
    public Function0 d;
    public DialogProperties e;
    public final View f;
    public final n g;
    public final int h;

    public o(Function0 function00, DialogProperties dialogProperties0, View view0, LayoutDirection layoutDirection0, Density density0, UUID uUID0) {
        ViewGroup viewGroup0 = null;
        super(new ContextThemeWrapper(view0.getContext(), (Build.VERSION.SDK_INT >= 0x1F || dialogProperties0.getDecorFitsSystemWindows() ? style.DialogWindowTheme : style.FloatingDialogWindowTheme)), 0, 2, null);
        this.d = function00;
        this.e = dialogProperties0;
        this.f = view0;
        Window window0 = this.getWindow();
        if(window0 == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.h = window0.getAttributes().softInputMode & 0xF0;
        window0.requestFeature(1);
        window0.setBackgroundDrawableResource(0x106000D);
        WindowCompat.setDecorFitsSystemWindows(window0, this.e.getDecorFitsSystemWindows());
        n n0 = new n(this.getContext(), window0);
        n0.setTag(id.compose_view_saveable_id_tag, "Dialog:" + uUID0);
        n0.setClipChildren(false);
        n0.setElevation(density0.toPx-0680j_4(8.0f));
        n0.setOutlineProvider(new DialogWrapper.1.2());  // 初始化器: Landroid/view/ViewOutlineProvider;-><init>()V
        this.g = n0;
        View view1 = window0.getDecorView();
        if(view1 instanceof ViewGroup) {
            viewGroup0 = (ViewGroup)view1;
        }
        if(viewGroup0 != null) {
            o.c(viewGroup0);
        }
        this.setContentView(n0);
        ViewTreeLifecycleOwner.set(n0, ViewTreeLifecycleOwner.get(view0));
        ViewTreeViewModelStoreOwner.set(n0, ViewTreeViewModelStoreOwner.get(view0));
        ViewTreeSavedStateRegistryOwner.set(n0, ViewTreeSavedStateRegistryOwner.get(view0));
        this.d(this.d, this.e, layoutDirection0);
        OnBackPressedDispatcherKt.addCallback$default(this.getOnBackPressedDispatcher(), this, false, new a(this, 1), 2, null);
    }

    public static final void c(ViewGroup viewGroup0) {
        viewGroup0.setClipChildren(false);
        if(viewGroup0 instanceof n) {
            return;
        }
        int v1 = viewGroup0.getChildCount();
        for(int v = 0; v < v1; ++v) {
            View view0 = viewGroup0.getChildAt(v);
            ViewGroup viewGroup1 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
            if(viewGroup1 != null) {
                o.c(viewGroup1);
            }
        }
    }

    @Override  // android.app.Dialog
    public final void cancel() {
    }

    public final void d(Function0 function00, DialogProperties dialogProperties0, LayoutDirection layoutDirection0) {
        this.d = function00;
        this.e = dialogProperties0;
        boolean z = SecureFlagPolicy_androidKt.shouldApplySecureFlag(dialogProperties0.getSecurePolicy(), AndroidPopup_androidKt.isFlagSecureEnabled(this.f));
        Window window0 = this.getWindow();
        Intrinsics.checkNotNull(window0);
        window0.setFlags((z ? 0x2000 : 0xFFFFDFFF), 0x2000);
        int v = DialogWrapper.WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            throw new NoWhenBranchMatchedException();
        }
        n n0 = this.g;
        n0.setLayoutDirection(v1);
        if(dialogProperties0.getUsePlatformDefaultWidth() && !n0.G) {
            Window window1 = this.getWindow();
            if(window1 != null) {
                window1.setLayout(-2, -2);
            }
        }
        n0.G = dialogProperties0.getUsePlatformDefaultWidth();
        if(Build.VERSION.SDK_INT < 0x1F) {
            if(dialogProperties0.getDecorFitsSystemWindows()) {
                Window window2 = this.getWindow();
                if(window2 != null) {
                    window2.setSoftInputMode(this.h);
                }
            }
            else {
                Window window3 = this.getWindow();
                if(window3 != null) {
                    window3.setSoftInputMode(16);
                }
            }
        }
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public final AbstractComposeView getSubCompositionView() {
        return this.g;
    }

    @Override  // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = super.onTouchEvent(motionEvent0);
        if(z && this.e.getDismissOnClickOutside()) {
            this.d.invoke();
        }
        return z;
    }
}

