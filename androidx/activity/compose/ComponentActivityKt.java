package androidx.activity.compose;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A0\u0010\u0007\u001A\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ComponentActivityKt {
    public static final ViewGroup.LayoutParams a;

    static {
        ComponentActivityKt.a = new ViewGroup.LayoutParams(-2, -2);
    }

    public static final void setContent(@NotNull ComponentActivity componentActivity0, @Nullable CompositionContext compositionContext0, @NotNull Function2 function20) {
        View view0 = ((ViewGroup)componentActivity0.getWindow().getDecorView().findViewById(0x1020002)).getChildAt(0);
        ComposeView composeView0 = view0 instanceof ComposeView ? ((ComposeView)view0) : null;
        if(composeView0 != null) {
            composeView0.setParentCompositionContext(compositionContext0);
            composeView0.setContent(function20);
            return;
        }
        ComposeView composeView1 = new ComposeView(componentActivity0, null, 0, 6, null);
        composeView1.setParentCompositionContext(compositionContext0);
        composeView1.setContent(function20);
        View view1 = componentActivity0.getWindow().getDecorView();
        if(ViewTreeLifecycleOwner.get(view1) == null) {
            ViewTreeLifecycleOwner.set(view1, componentActivity0);
        }
        if(ViewTreeViewModelStoreOwner.get(view1) == null) {
            ViewTreeViewModelStoreOwner.set(view1, componentActivity0);
        }
        if(ViewTreeSavedStateRegistryOwner.get(view1) == null) {
            ViewTreeSavedStateRegistryOwner.set(view1, componentActivity0);
        }
        componentActivity0.setContentView(composeView1, ComponentActivityKt.a);
    }

    public static void setContent$default(ComponentActivity componentActivity0, CompositionContext compositionContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            compositionContext0 = null;
        }
        ComponentActivityKt.setContent(componentActivity0, compositionContext0, function20);
    }
}

