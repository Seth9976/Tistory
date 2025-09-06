package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.activity.m;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.Version;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u0000  2\u00020\u0001:\u0003 !\"B\u0013\b\u0007\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0010\u001A\u00020\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0005R&\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u0012\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001B\u0010\u001C¨\u0006#"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/WindowBackend;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "windowExtension", "<init>", "(Landroidx/window/layout/ExtensionInterfaceCompat;)V", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "", "registerLayoutChangeCallback", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "unregisterLayoutChangeCallback", "(Landroidx/core/util/Consumer;)V", "a", "Landroidx/window/layout/ExtensionInterfaceCompat;", "getWindowExtension", "()Landroidx/window/layout/ExtensionInterfaceCompat;", "setWindowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "windowLayoutChangeCallbacks", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SidecarWindowBackend implements WindowBackend {
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001A\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001A\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001A\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001A\u001A\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/SidecarWindowBackend;", "getInstance", "(Landroid/content/Context;)Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "initAndVerifyExtension", "(Landroid/content/Context;)Landroidx/window/layout/ExtensionInterfaceCompat;", "Landroidx/window/core/Version;", "sidecarVersion", "", "isSidecarVersionSupported", "(Landroidx/window/core/Version;)Z", "", "resetInstance", "()V", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/SidecarWindowBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final SidecarWindowBackend getInstance(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            if(SidecarWindowBackend.c == null) {
                ReentrantLock reentrantLock0 = SidecarWindowBackend.d;
                reentrantLock0.lock();
                try {
                    if(SidecarWindowBackend.c == null) {
                        SidecarWindowBackend.c = new SidecarWindowBackend(SidecarWindowBackend.Companion.initAndVerifyExtension(context0));
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
            }
            SidecarWindowBackend sidecarWindowBackend0 = SidecarWindowBackend.c;
            Intrinsics.checkNotNull(sidecarWindowBackend0);
            return sidecarWindowBackend0;
        }

        @Nullable
        public final ExtensionInterfaceCompat initAndVerifyExtension(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            try {
                if(this.isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                    SidecarCompat sidecarCompat0 = new SidecarCompat(context0);
                    if(sidecarCompat0.validateExtensionInterface()) {
                        return sidecarCompat0;
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
            return null;
        }

        @VisibleForTesting
        public final boolean isSidecarVersionSupported(@Nullable Version version0) {
            return version0 == null ? false : version0.compareTo(Version.Companion.getVERSION_0_1()) >= 0;
        }

        @VisibleForTesting
        public final void resetInstance() {
            SidecarWindowBackend.c = null;
        }
    }

    @VisibleForTesting
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0017¨\u0006\t"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "(Landroidx/window/layout/SidecarWindowBackend;)V", "onWindowLayoutChanged", "", "activity", "Landroid/app/Activity;", "newLayout", "Landroidx/window/layout/WindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public final class ExtensionListenerImpl implements ExtensionCallbackInterface {
        public final SidecarWindowBackend a;

        public ExtensionListenerImpl() {
            Intrinsics.checkNotNullParameter(sidecarWindowBackend0, "this$0");
            this.a = sidecarWindowBackend0;
            super();
        }

        @Override  // androidx.window.layout.ExtensionInterfaceCompat$ExtensionCallbackInterface
        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull Activity activity0, @NotNull WindowLayoutInfo windowLayoutInfo0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            Intrinsics.checkNotNullParameter(windowLayoutInfo0, "newLayout");
            for(Object object0: this.a.getWindowLayoutChangeCallbacks()) {
                WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0 = (WindowLayoutChangeCallbackWrapper)object0;
                if(Intrinsics.areEqual(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0.getActivity(), activity0)) {
                    sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0.accept(windowLayoutInfo0);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\u0007¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R$\u0010\u001C\u001A\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u000E¨\u0006\u001D"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "newLayoutInfo", "", "accept", "(Landroidx/window/layout/WindowLayoutInfo;)V", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "c", "Landroidx/core/util/Consumer;", "getCallback", "()Landroidx/core/util/Consumer;", "d", "Landroidx/window/layout/WindowLayoutInfo;", "getLastInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setLastInfo", "lastInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class WindowLayoutChangeCallbackWrapper {
        public final Activity a;
        public final Executor b;
        public final Consumer c;
        public WindowLayoutInfo d;

        public WindowLayoutChangeCallbackWrapper(@NotNull Activity activity0, @NotNull Executor executor0, @NotNull Consumer consumer0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            Intrinsics.checkNotNullParameter(executor0, "executor");
            Intrinsics.checkNotNullParameter(consumer0, "callback");
            super();
            this.a = activity0;
            this.b = executor0;
            this.c = consumer0;
        }

        public final void accept(@NotNull WindowLayoutInfo windowLayoutInfo0) {
            Intrinsics.checkNotNullParameter(windowLayoutInfo0, "newLayoutInfo");
            this.d = windowLayoutInfo0;
            m m0 = new m(6, this, windowLayoutInfo0);
            this.b.execute(m0);
        }

        @NotNull
        public final Activity getActivity() {
            return this.a;
        }

        @NotNull
        public final Consumer getCallback() {
            return this.c;
        }

        @Nullable
        public final WindowLayoutInfo getLastInfo() {
            return this.d;
        }

        public final void setLastInfo(@Nullable WindowLayoutInfo windowLayoutInfo0) {
            this.d = windowLayoutInfo0;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final boolean DEBUG = false;
    public ExtensionInterfaceCompat a;
    public final CopyOnWriteArrayList b;
    public static volatile SidecarWindowBackend c;
    public static final ReentrantLock d;

    static {
        SidecarWindowBackend.Companion = new Companion(null);
        SidecarWindowBackend.d = new ReentrantLock();
    }

    @VisibleForTesting
    public SidecarWindowBackend(@Nullable ExtensionInterfaceCompat extensionInterfaceCompat0) {
        this.a = extensionInterfaceCompat0;
        this.b = new CopyOnWriteArrayList();
        ExtensionInterfaceCompat extensionInterfaceCompat1 = this.a;
        if(extensionInterfaceCompat1 != null) {
            extensionInterfaceCompat1.setExtensionCallback(new ExtensionListenerImpl(this));
        }
    }

    @Nullable
    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.a;
    }

    @NotNull
    public final CopyOnWriteArrayList getWindowLayoutChangeCallbacks() {
        return this.b;
    }

    @VisibleForTesting
    public static void getWindowLayoutChangeCallbacks$annotations() {
    }

    @Override  // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(@NotNull Activity activity0, @NotNull Executor executor0, @NotNull Consumer consumer0) {
        WindowLayoutInfo windowLayoutInfo0;
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(consumer0, "callback");
        ReentrantLock reentrantLock0 = SidecarWindowBackend.d;
        reentrantLock0.lock();
        try {
            ExtensionInterfaceCompat extensionInterfaceCompat0 = this.getWindowExtension();
            if(extensionInterfaceCompat0 == null) {
                consumer0.accept(new WindowLayoutInfo(CollectionsKt__CollectionsKt.emptyList()));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.b;
            boolean z = false;
            if(copyOnWriteArrayList0 == null || !copyOnWriteArrayList0.isEmpty()) {
                for(Object object0: copyOnWriteArrayList0) {
                    if(Intrinsics.areEqual(((WindowLayoutChangeCallbackWrapper)object0).getActivity(), activity0)) {
                        z = true;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0 = new WindowLayoutChangeCallbackWrapper(activity0, executor0, consumer0);
            this.getWindowLayoutChangeCallbacks().add(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0);
            if(z) {
                Object object1 = null;
                Iterator iterator1 = this.getWindowLayoutChangeCallbacks().iterator();
                while(true) {
                    windowLayoutInfo0 = null;
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object2 = iterator1.next();
                    if(Intrinsics.areEqual(activity0, ((WindowLayoutChangeCallbackWrapper)object2).getActivity())) {
                        object1 = object2;
                        break;
                    }
                }
                if(((WindowLayoutChangeCallbackWrapper)object1) != null) {
                    windowLayoutInfo0 = ((WindowLayoutChangeCallbackWrapper)object1).getLastInfo();
                }
                if(windowLayoutInfo0 != null) {
                    sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0.accept(windowLayoutInfo0);
                }
            }
            else {
                extensionInterfaceCompat0.onWindowLayoutChangeListenerAdded(activity0);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public final void setWindowExtension(@Nullable ExtensionInterfaceCompat extensionInterfaceCompat0) {
        this.a = extensionInterfaceCompat0;
    }

    @Override  // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "callback");
        ReentrantLock reentrantLock0 = SidecarWindowBackend.d;
        __monitor_enter(reentrantLock0);
        try {
            if(this.getWindowExtension() != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: this.getWindowLayoutChangeCallbacks()) {
                    WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0 = (WindowLayoutChangeCallbackWrapper)object0;
                    if(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0.getCallback() == consumer0) {
                        Intrinsics.checkNotNullExpressionValue(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0, "callbackWrapper");
                        arrayList0.add(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0);
                    }
                }
                this.getWindowLayoutChangeCallbacks().removeAll(arrayList0);
                Iterator iterator1 = arrayList0.iterator();
            alab1:
                while(true) {
                    if(!iterator1.hasNext()) {
                        goto label_32;
                    }
                    Object object1 = iterator1.next();
                    Activity activity0 = ((WindowLayoutChangeCallbackWrapper)object1).getActivity();
                    CopyOnWriteArrayList copyOnWriteArrayList0 = this.b;
                    if(copyOnWriteArrayList0 == null || !copyOnWriteArrayList0.isEmpty()) {
                        for(Object object2: copyOnWriteArrayList0) {
                            if(Intrinsics.areEqual(((WindowLayoutChangeCallbackWrapper)object2).getActivity(), activity0)) {
                                continue alab1;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    ExtensionInterfaceCompat extensionInterfaceCompat0 = this.a;
                    if(extensionInterfaceCompat0 != null) {
                        extensionInterfaceCompat0.onWindowLayoutChangeListenerRemoved(activity0);
                    }
                }
            }
            goto label_34;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(reentrantLock0);
        throw throwable0;
    label_32:
        __monitor_exit(reentrantLock0);
        return;
    label_34:
        __monitor_exit(reentrantLock0);
    }
}

