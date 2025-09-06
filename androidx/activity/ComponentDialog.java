package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001B\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0003\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000BH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u000FH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u000FH\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u000FH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0016\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001BJ!\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u00192\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u0016¢\u0006\u0004\b\u0017\u0010\u001EJ!\u0010\u001F\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u00192\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u0016¢\u0006\u0004\b\u001F\u0010\u001EJ\u000F\u0010 \u001A\u00020\u000FH\u0017¢\u0006\u0004\b \u0010\u0013R\u001D\u0010\'\u001A\u00020!8\u0006¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0013\u001A\u0004\b$\u0010%R\u0014\u0010+\u001A\u00020(8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b)\u0010*R\u0014\u0010/\u001A\u00020,8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroidx/activity/OnBackPressedDispatcher;", "c", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ComponentDialog extends Dialog implements OnBackPressedDispatcherOwner, LifecycleOwner, SavedStateRegistryOwner {
    public LifecycleRegistry a;
    public final SavedStateRegistryController b;
    public final OnBackPressedDispatcher c;

    @JvmOverloads
    public ComponentDialog(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, 0, 2, null);
    }

    @JvmOverloads
    public ComponentDialog(@NotNull Context context0, @StyleRes int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, v);
        this.b = SavedStateRegistryController.Companion.create(this);
        this.c = new OnBackPressedDispatcher(new h(this, 1));
    }

    public ComponentDialog(Context context0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        this(context0, v);
    }

    public static void a(ComponentDialog componentDialog0) {
        Intrinsics.checkNotNullParameter(componentDialog0, "this$0");
        componentDialog0.super.onBackPressed();
    }

    @Override  // android.app.Dialog
    public void addContentView(@NotNull View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.initializeViewTreeOwners();
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    public final LifecycleRegistry b() {
        LifecycleRegistry lifecycleRegistry0 = this.a;
        if(lifecycleRegistry0 == null) {
            lifecycleRegistry0 = new LifecycleRegistry(this);
            this.a = lifecycleRegistry0;
        }
        return lifecycleRegistry0;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.b();
    }

    @Override  // androidx.activity.OnBackPressedDispatcherOwner
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.c;
    }

    public static void getOnBackPressedDispatcher$annotations() {
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @NotNull
    public SavedStateRegistry getSavedStateRegistry() {
        return this.b.getSavedStateRegistry();
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        Window window0 = this.getWindow();
        Intrinsics.checkNotNull(window0);
        View view0 = window0.getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "window!!.decorView");
        ViewTreeLifecycleOwner.set(view0, this);
        Window window1 = this.getWindow();
        Intrinsics.checkNotNull(window1);
        View view1 = window1.getDecorView();
        Intrinsics.checkNotNullExpressionValue(view1, "window!!.decorView");
        ViewTreeOnBackPressedDispatcherOwner.set(view1, this);
        Window window2 = this.getWindow();
        Intrinsics.checkNotNull(window2);
        View view2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(view2, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.set(view2, this);
    }

    @Override  // android.app.Dialog
    @CallSuper
    public void onBackPressed() {
        this.c.onBackPressed();
    }

    @Override  // android.app.Dialog
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher0, "onBackInvokedDispatcher");
            this.c.setOnBackInvokedDispatcher(onBackInvokedDispatcher0);
        }
        this.b.performRestore(bundle0);
        this.b().handleLifecycleEvent(Event.ON_CREATE);
    }

    @Override  // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle bundle0 = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundle0, "super.onSaveInstanceState()");
        this.b.performSave(bundle0);
        return bundle0;
    }

    @Override  // android.app.Dialog
    @CallSuper
    public void onStart() {
        super.onStart();
        this.b().handleLifecycleEvent(Event.ON_RESUME);
    }

    @Override  // android.app.Dialog
    @CallSuper
    public void onStop() {
        this.b().handleLifecycleEvent(Event.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override  // android.app.Dialog
    public void setContentView(int v) {
        this.initializeViewTreeOwners();
        super.setContentView(v);
    }

    @Override  // android.app.Dialog
    public void setContentView(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.initializeViewTreeOwners();
        super.setContentView(view0);
    }

    @Override  // android.app.Dialog
    public void setContentView(@NotNull View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.initializeViewTreeOwners();
        super.setContentView(view0, viewGroup$LayoutParams0);
    }
}

