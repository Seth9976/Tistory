package androidx.core.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001A\u00020\b2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0014¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u000BH\u0015¢\u0006\u0004\b\u0010\u0010\u000EJ)\u0010\u0014\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00062\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u001B\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u001C\u0010\u001AJ\u001F\u0010 \u001A\u00020\u00182\u000E\u0010\u001F\u001A\n\u0012\u0004\u0012\u00020\u001E\u0018\u00010\u001DH\u0004¢\u0006\u0004\b \u0010!R.\u0010#\u001A\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0012\u0012\u0004\u0012\u00020\u00060\"8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010\u0005R\u001A\u0010\'\u001A\u00020&8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\'\u0010(\u0012\u0004\b)\u0010\u0005R\u0014\u0010-\u001A\u00020*8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/core/view/KeyEventDispatcher$Component;", "<init>", "()V", "Landroidx/core/app/ComponentActivity$ExtraData;", "extraData", "", "putExtraData", "(Landroidx/core/app/ComponentActivity$ExtraData;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$ExtraData;", "Landroid/view/KeyEvent;", "event", "", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "", "", "args", "shouldDumpInternalState", "([Ljava/lang/String;)Z", "Landroidx/collection/SimpleArrayMap;", "extraDataMap", "Landroidx/collection/SimpleArrayMap;", "getExtraDataMap$annotations", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "ExtraData", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ComponentActivity extends Activity implements Component, LifecycleOwner {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window\'s decor view.")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/app/ComponentActivity$ExtraData;", "", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class ExtraData {
    }

    @NotNull
    private final SimpleArrayMap extraDataMap;
    @NotNull
    private final LifecycleRegistry lifecycleRegistry;

    public ComponentActivity() {
        this.extraDataMap = new SimpleArrayMap();
        this.lifecycleRegistry = new LifecycleRegistry(this);
    }

    @Override  // android.app.Activity
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "event");
        View view0 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "window.decorView");
        return KeyEventDispatcher.dispatchBeforeHierarchy(view0, keyEvent0) ? true : KeyEventDispatcher.dispatchKeyEvent(this, view0, this, keyEvent0);
    }

    @Override  // android.app.Activity
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "event");
        View view0 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "window.decorView");
        return KeyEventDispatcher.dispatchBeforeHierarchy(view0, keyEvent0) ? true : super.dispatchKeyShortcutEvent(keyEvent0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "Use {@link View#getTag(int)} with the window\'s decor view.")
    @Nullable
    public ExtraData getExtraData(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "extraDataClass");
        return (ExtraData)this.extraDataMap.get(class0);
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override  // android.app.Activity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ReportFragment.Companion.injectIfNeededIn(this);
    }

    @Override  // android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        this.lifecycleRegistry.setCurrentState(State.CREATED);
        super.onSaveInstanceState(bundle0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "Use {@link View#setTag(int, Object)} with the window\'s decor view.")
    public void putExtraData(@NotNull ExtraData componentActivity$ExtraData0) {
        Intrinsics.checkNotNullParameter(componentActivity$ExtraData0, "extraData");
        Class class0 = componentActivity$ExtraData0.getClass();
        this.extraDataMap.put(class0, componentActivity$ExtraData0);
    }

    public final boolean shouldDumpInternalState(@Nullable String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            String s = arr_s[0];
            switch(s.hashCode()) {
                case 0xD98C2911: {
                    return s.equals("--translation") && Build.VERSION.SDK_INT >= 0x1F ? 0 : 1;
                }
                case 0x5FD0F67: {
                    if(s.equals("--dump-dumpable")) {
                        return Build.VERSION.SDK_INT < 33 ? 1 : 0;
                    }
                    break;
                }
                case 0x1C2B8816: {
                    if(!s.equals("--list-dumpables")) {
                        return 1;
                    }
                    return Build.VERSION.SDK_INT < 33 ? 1 : 0;
                }
                case 0x4519F64D: {
                    return !s.equals("--contentcapture") || Build.VERSION.SDK_INT < 29 ? 1 : 0;
                }
                case 1455016274: {
                    return s.equals("--autofill") ? 0 : 1;
                }
                default: {
                    return 1;
                }
            }
        }
        return 1;
    }

    @Override  // androidx.core.view.KeyEventDispatcher$Component
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@NotNull KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "event");
        return super.dispatchKeyEvent(keyEvent0);
    }
}

