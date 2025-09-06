package androidx.compose.material3;

import android.os.Build.VERSION;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.R.id;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class jd extends ComponentDialog implements ViewRootForInspector {
    public Function0 d;
    public ModalBottomSheetProperties e;
    public final View f;
    public final hd g;

    public jd(Function0 function00, ModalBottomSheetProperties modalBottomSheetProperties0, View view0, LayoutDirection layoutDirection0, Density density0, UUID uUID0, Animatable animatable0, CoroutineScope coroutineScope0, boolean z) {
        super(new ContextThemeWrapper(view0.getContext(), style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        this.d = function00;
        this.e = modalBottomSheetProperties0;
        this.f = view0;
        Window window0 = this.getWindow();
        if(window0 == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window0.requestFeature(1);
        window0.setBackgroundDrawableResource(0x106000D);
        WindowCompat.setDecorFitsSystemWindows(window0, false);
        hd hd0 = new hd(this.getContext(), window0, this.e.getShouldDismissOnBackPress(), this.d, animatable0, coroutineScope0);
        hd0.setTag(id.compose_view_saveable_id_tag, "Dialog:" + uUID0);
        hd0.setClipChildren(false);
        hd0.setElevation(density0.toPx-0680j_4(8.0f));
        hd0.setOutlineProvider(new ModalBottomSheetDialogWrapper.1.2());  // 初始化器: Landroid/view/ViewOutlineProvider;-><init>()V
        this.g = hd0;
        this.setContentView(hd0);
        ViewTreeLifecycleOwner.set(hd0, ViewTreeLifecycleOwner.get(view0));
        ViewTreeViewModelStoreOwner.set(hd0, ViewTreeViewModelStoreOwner.get(view0));
        ViewTreeSavedStateRegistryOwner.set(hd0, ViewTreeSavedStateRegistryOwner.get(view0));
        this.c(this.d, this.e, layoutDirection0);
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = WindowCompat.getInsetsController(window0, window0.getDecorView());
        windowInsetsControllerCompat0.setAppearanceLightStatusBars(!z);
        windowInsetsControllerCompat0.setAppearanceLightNavigationBars(!z);
        OnBackPressedDispatcherKt.addCallback$default(this.getOnBackPressedDispatcher(), this, false, new androidx.compose.material3.id(this, 0), 2, null);
    }

    public final void c(Function0 function00, ModalBottomSheetProperties modalBottomSheetProperties0, LayoutDirection layoutDirection0) {
        this.d = function00;
        this.e = modalBottomSheetProperties0;
        boolean z = ModalBottomSheet_androidKt.access$shouldApplySecureFlag(modalBottomSheetProperties0.getSecurePolicy(), ModalBottomSheet_androidKt.isFlagSecureEnabled(this.f));
        Window window0 = this.getWindow();
        Intrinsics.checkNotNull(window0);
        window0.setFlags((z ? 0x2000 : 0xFFFFDFFF), 0x2000);
        int v = ModalBottomSheetDialogWrapper.WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.g.setLayoutDirection(v1);
        Window window1 = this.getWindow();
        if(window1 != null) {
            window1.setLayout(-1, -1);
        }
        Window window2 = this.getWindow();
        if(window2 != null) {
            window2.setSoftInputMode((Build.VERSION.SDK_INT < 30 ? 16 : 0x30));
        }
    }

    @Override  // android.app.Dialog
    public final void cancel() {
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public final AbstractComposeView getSubCompositionView() {
        return this.g;
    }

    @Override  // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = super.onTouchEvent(motionEvent0);
        if(z) {
            this.d.invoke();
        }
        return z;
    }
}

