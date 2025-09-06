package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.w0;
import androidx.window.core.Version;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\f\b\u0000\u0018\u0000 #2\u00020\u0001:\u0005#$%&\'B\u001D\b\u0007\u0012\n\b\u0001\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001D\u0010\u0019\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u001B\u0010\u0016J\u000F\u0010\u001D\u001A\u00020\u001CH\u0017¢\u0006\u0004\b\u001D\u0010\u001ER\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"¨\u0006("}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "extensionCallback", "", "setExtensionCallback", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/WindowLayoutInfo;", "getWindowLayoutInfo", "(Landroid/app/Activity;)Landroidx/window/layout/WindowLayoutInfo;", "onWindowLayoutChangeListenerAdded", "(Landroid/app/Activity;)V", "Landroid/os/IBinder;", "windowToken", "register", "(Landroid/os/IBinder;Landroid/app/Activity;)V", "onWindowLayoutChangeListenerRemoved", "", "validateExtensionInterface", "()Z", "a", "Landroidx/window/sidecar/SidecarInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "Companion", "androidx/appcompat/app/w0", "DistinctSidecarElementCallback", "androidx/window/layout/i", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SidecarCompat implements ExtensionInterfaceCompat {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001B\u0010\r\u001A\u0004\u0018\u00010\n2\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000B\u0010\fR\u0013\u0010\u0011\u001A\u0004\u0018\u00010\u000E8F¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0013\u001A\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/sidecar/SidecarInterface;", "getSidecarCompat$window_release", "(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;", "getSidecarCompat", "Landroid/app/Activity;", "activity", "Landroid/os/IBinder;", "getActivityWindowToken$window_release", "(Landroid/app/Activity;)Landroid/os/IBinder;", "getActivityWindowToken", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "sidecarVersion", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final IBinder getActivityWindowToken$window_release(@Nullable Activity activity0) {
            if(activity0 != null) {
                Window window0 = activity0.getWindow();
                if(window0 != null) {
                    WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                    return windowManager$LayoutParams0 == null ? null : windowManager$LayoutParams0.token;
                }
            }
            return null;
        }

        @Nullable
        public final SidecarInterface getSidecarCompat$window_release(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            return SidecarProvider.getSidecarImpl(context0.getApplicationContext());
        }

        @Nullable
        public final Version getSidecarVersion() {
            try {
                String s = SidecarProvider.getApiVersion();
                return TextUtils.isEmpty(s) ? null : Version.Companion.parse(s);
            }
            catch(NoClassDefFoundError | UnsupportedOperationException unused_ex) {
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\u000B\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        public final SidecarAdapter a;
        public final SidecarInterface.SidecarCallback b;
        public final ReentrantLock c;
        public SidecarDeviceState d;
        public final WeakHashMap e;

        public DistinctSidecarElementCallback(SidecarAdapter sidecarAdapter0, SidecarInterface.SidecarCallback sidecarInterface$SidecarCallback0) {
            Intrinsics.checkNotNullParameter(sidecarAdapter0, "sidecarAdapter");
            Intrinsics.checkNotNullParameter(sidecarInterface$SidecarCallback0, "callbackInterface");
            super();
            this.a = sidecarAdapter0;
            this.b = sidecarInterface$SidecarCallback0;
            this.c = new ReentrantLock();
            this.e = new WeakHashMap();
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState sidecarDeviceState0) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState0, "newDeviceState");
            ReentrantLock reentrantLock0 = this.c;
            reentrantLock0.lock();
            try {
                if(this.a.isEqualSidecarDeviceState(this.d, sidecarDeviceState0)) {
                    return;
                }
                this.d = sidecarDeviceState0;
                this.b.onDeviceStateChanged(sidecarDeviceState0);
            }
            finally {
                reentrantLock0.unlock();
            }
        }

        public void onWindowLayoutChanged(@NotNull IBinder iBinder0, @NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo0) {
            Intrinsics.checkNotNullParameter(iBinder0, "token");
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo0, "newLayout");
            synchronized(this.c) {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo1 = (SidecarWindowLayoutInfo)this.e.get(iBinder0);
                if(this.a.isEqualSidecarWindowLayoutInfo(sidecarWindowLayoutInfo1, sidecarWindowLayoutInfo0)) {
                    return;
                }
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo)this.e.put(iBinder0, sidecarWindowLayoutInfo0);
            }
            this.b.onWindowLayoutChanged(iBinder0, sidecarWindowLayoutInfo0);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0017J\u0018\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0017¨\u0006\f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "(Landroidx/window/layout/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public final SidecarCompat a;

        public TranslatingCallback() {
            Intrinsics.checkNotNullParameter(sidecarCompat0, "this$0");
            this.a = sidecarCompat0;
            super();
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@NotNull SidecarDeviceState sidecarDeviceState0) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState0, "newDeviceState");
            Iterable iterable0 = this.a.c.values();
            SidecarCompat sidecarCompat0 = this.a;
            for(Object object0: iterable0) {
                Activity activity0 = (Activity)object0;
                IBinder iBinder0 = SidecarCompat.Companion.getActivityWindowToken$window_release(activity0);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo0 = null;
                if(iBinder0 != null) {
                    SidecarInterface sidecarInterface0 = sidecarCompat0.getSidecar();
                    if(sidecarInterface0 != null) {
                        sidecarWindowLayoutInfo0 = sidecarInterface0.getWindowLayoutInfo(iBinder0);
                    }
                }
                ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0 = sidecarCompat0.e;
                if(extensionInterfaceCompat$ExtensionCallbackInterface0 != null) {
                    extensionInterfaceCompat$ExtensionCallbackInterface0.onWindowLayoutChanged(activity0, sidecarCompat0.b.translate(sidecarWindowLayoutInfo0, sidecarDeviceState0));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull IBinder iBinder0, @NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo0) {
            Intrinsics.checkNotNullParameter(iBinder0, "windowToken");
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo0, "newLayout");
            Activity activity0 = (Activity)this.a.c.get(iBinder0);
            if(activity0 == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter sidecarAdapter0 = this.a.b;
            SidecarInterface sidecarInterface0 = this.a.getSidecar();
            SidecarDeviceState sidecarDeviceState0 = sidecarInterface0 == null ? null : sidecarInterface0.getDeviceState();
            if(sidecarDeviceState0 == null) {
                sidecarDeviceState0 = new SidecarDeviceState();
            }
            WindowLayoutInfo windowLayoutInfo0 = sidecarAdapter0.translate(sidecarWindowLayoutInfo0, sidecarDeviceState0);
            ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0 = this.a.e;
            if(extensionInterfaceCompat$ExtensionCallbackInterface0 != null) {
                extensionInterfaceCompat$ExtensionCallbackInterface0.onWindowLayoutChanged(activity0, windowLayoutInfo0);
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final SidecarInterface a;
    public final SidecarAdapter b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public w0 e;

    static {
        SidecarCompat.Companion = new Companion(null);
    }

    public SidecarCompat(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(SidecarCompat.Companion.getSidecarCompat$window_release(context0), new SidecarAdapter(null, 1, null));
    }

    @VisibleForTesting
    public SidecarCompat(@VisibleForTesting @Nullable SidecarInterface sidecarInterface0, @NotNull SidecarAdapter sidecarAdapter0) {
        Intrinsics.checkNotNullParameter(sidecarAdapter0, "sidecarAdapter");
        super();
        this.a = sidecarInterface0;
        this.b = sidecarAdapter0;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Nullable
    public final SidecarInterface getSidecar() {
        return this.a;
    }

    @VisibleForTesting
    @NotNull
    public final WindowLayoutInfo getWindowLayoutInfo(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        IBinder iBinder0 = SidecarCompat.Companion.getActivityWindowToken$window_release(activity0);
        if(iBinder0 == null) {
            return new WindowLayoutInfo(CollectionsKt__CollectionsKt.emptyList());
        }
        SidecarDeviceState sidecarDeviceState0 = null;
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo0 = this.a == null ? null : this.a.getWindowLayoutInfo(iBinder0);
        SidecarInterface sidecarInterface0 = this.a;
        if(sidecarInterface0 != null) {
            sidecarDeviceState0 = sidecarInterface0.getDeviceState();
        }
        if(sidecarDeviceState0 == null) {
            sidecarDeviceState0 = new SidecarDeviceState();
        }
        return this.b.translate(sidecarWindowLayoutInfo0, sidecarDeviceState0);
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        IBinder iBinder0 = SidecarCompat.Companion.getActivityWindowToken$window_release(activity0);
        if(iBinder0 != null) {
            this.register(iBinder0, activity0);
            return;
        }
        i i0 = new i(this, activity0);
        activity0.getWindow().getDecorView().addOnAttachStateChangeListener(i0);
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        IBinder iBinder0 = SidecarCompat.Companion.getActivityWindowToken$window_release(activity0);
        if(iBinder0 == null) {
            return;
        }
        SidecarInterface sidecarInterface0 = this.a;
        if(sidecarInterface0 != null) {
            sidecarInterface0.onWindowLayoutChangeListenerRemoved(iBinder0);
        }
        activity0.unregisterComponentCallbacks(((ComponentCallbacks)this.d.get(activity0)));
        this.d.remove(activity0);
        this.c.remove(iBinder0);
        if(this.c.size() == 1) {
            SidecarInterface sidecarInterface1 = this.a;
            if(sidecarInterface1 != null) {
                sidecarInterface1.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final void register(@NotNull IBinder iBinder0, @NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(iBinder0, "windowToken");
        Intrinsics.checkNotNullParameter(activity0, "activity");
        LinkedHashMap linkedHashMap0 = this.c;
        linkedHashMap0.put(iBinder0, activity0);
        SidecarInterface sidecarInterface0 = this.a;
        if(sidecarInterface0 != null) {
            sidecarInterface0.onWindowLayoutChangeListenerAdded(iBinder0);
        }
        if(linkedHashMap0.size() == 1) {
            SidecarInterface sidecarInterface1 = this.a;
            if(sidecarInterface1 != null) {
                sidecarInterface1.onDeviceStateListenersChanged(false);
            }
        }
        w0 w00 = this.e;
        if(w00 != null) {
            w00.onWindowLayoutChanged(activity0, this.getWindowLayoutInfo(activity0));
        }
        LinkedHashMap linkedHashMap1 = this.d;
        if(linkedHashMap1.get(activity0) == null) {
            SidecarCompat.registerConfigurationChangeListener.configChangeObserver.1 sidecarCompat$registerConfigurationChangeListener$configChangeObserver$10 = new SidecarCompat.registerConfigurationChangeListener.configChangeObserver.1(this, activity0);
            linkedHashMap1.put(activity0, sidecarCompat$registerConfigurationChangeListener$configChangeObserver$10);
            activity0.registerComponentCallbacks(sidecarCompat$registerConfigurationChangeListener$configChangeObserver$10);
        }
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(@NotNull ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0) {
        Intrinsics.checkNotNullParameter(extensionInterfaceCompat$ExtensionCallbackInterface0, "extensionCallback");
        this.e = new w0(extensionInterfaceCompat$ExtensionCallbackInterface0);
        SidecarInterface sidecarInterface0 = this.a;
        if(sidecarInterface0 != null) {
            SidecarInterface.SidecarCallback sidecarInterface$SidecarCallback0 = new TranslatingCallback(this);
            sidecarInterface0.setSidecarCallback(new DistinctSidecarElementCallback(this.b, sidecarInterface$SidecarCallback0));
        }
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat
    @SuppressLint({"BanUncheckedReflection"})
    public boolean validateExtensionInterface() {
        Method method3;
        Method method2;
        Method method1;
        Method method0;
        try {
            SidecarInterface sidecarInterface0 = this.a;
            if(sidecarInterface0 == null) {
                method0 = null;
            }
            else {
                Class class0 = sidecarInterface0.getClass();
                method0 = class0 == null ? null : class0.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            }
            Class class1 = method0 == null ? null : method0.getReturnType();
            Class class2 = Void.TYPE;
            if(Intrinsics.areEqual(class1, class2)) {
                SidecarInterface sidecarInterface1 = this.a;
                if(sidecarInterface1 != null) {
                    sidecarInterface1.getDeviceState();
                }
                SidecarInterface sidecarInterface2 = this.a;
                if(sidecarInterface2 != null) {
                    sidecarInterface2.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface3 = this.a;
                Class class3 = IBinder.class;
                if(sidecarInterface3 == null) {
                    method1 = null;
                }
                else {
                    Class class4 = sidecarInterface3.getClass();
                    method1 = class4 == null ? null : class4.getMethod("getWindowLayoutInfo", class3);
                }
                if(Intrinsics.areEqual((method1 == null ? null : method1.getReturnType()), SidecarWindowLayoutInfo.class)) {
                    SidecarInterface sidecarInterface4 = this.a;
                    if(sidecarInterface4 == null) {
                        method2 = null;
                    }
                    else {
                        Class class5 = sidecarInterface4.getClass();
                        method2 = class5 == null ? null : class5.getMethod("onWindowLayoutChangeListenerAdded", class3);
                    }
                    if(Intrinsics.areEqual((method2 == null ? null : method2.getReturnType()), class2)) {
                        SidecarInterface sidecarInterface5 = this.a;
                        if(sidecarInterface5 == null) {
                            method3 = null;
                        }
                        else {
                            Class class6 = sidecarInterface5.getClass();
                            method3 = class6 == null ? null : class6.getMethod("onWindowLayoutChangeListenerRemoved", class3);
                        }
                        if(Intrinsics.areEqual((method3 == null ? null : method3.getReturnType()), class2)) {
                            new SidecarDeviceState().posture = 3;
                            SidecarDisplayFeature sidecarDisplayFeature0 = new SidecarDisplayFeature();
                            Rect rect0 = sidecarDisplayFeature0.getRect();
                            Intrinsics.checkNotNullExpressionValue(rect0, "displayFeature.rect");
                            sidecarDisplayFeature0.setRect(rect0);
                            sidecarDisplayFeature0.getType();
                            sidecarDisplayFeature0.setType(1);
                            new SidecarWindowLayoutInfo();
                            return true;
                        }
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }
}

