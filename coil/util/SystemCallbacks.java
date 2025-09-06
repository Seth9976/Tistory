package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.VisibleForTesting;
import coil.RealImageLoader;
import coil.network.EmptyNetworkObserver;
import coil.network.NetworkObserver.Listener;
import coil.network.NetworkObserver;
import coil.network.NetworkObserverKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0016\u001A\u00020\u00072\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u0004\u001A\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00030\u00030\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u0012\u0004\b\u001E\u0010\t\u001A\u0004\b\u001C\u0010\u001DR(\u0010\n\u001A\u00020\u00148\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b\u001F\u0010 \u0012\u0004\b$\u0010\t\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010\u0017R\u0011\u0010\u0015\u001A\u00020\u00148F¢\u0006\u0006\u001A\u0004\b\u0015\u0010\"¨\u0006&"}, d2 = {"Lcoil/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil/network/NetworkObserver$Listener;", "Lcoil/RealImageLoader;", "imageLoader", "<init>", "(Lcoil/RealImageLoader;)V", "", "registerMemoryPressureCallbacks", "()V", "shutdown", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "onLowMemory", "", "isOnline", "onConnectivityChange", "(Z)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/ref/WeakReference;", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "d", "Z", "getShutdown", "()Z", "setShutdown", "getShutdown$annotations", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSystemCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n+ 2 Logs.kt\ncoil/util/-Logs\n*L\n1#1,98:1\n89#1,2:99\n89#1,2:101\n89#1,2:103\n89#1:105\n90#1:110\n89#1:111\n90#1:116\n21#2,4:106\n21#2,4:112\n*S KotlinDebug\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n*L\n39#1:99,2\n48#1:101,2\n71#1:103,2\n74#1:105\n74#1:110\n83#1:111\n83#1:116\n75#1:106,4\n84#1:112,4\n*E\n"})
public final class SystemCallbacks implements ComponentCallbacks2, Listener {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcoil/util/SystemCallbacks$Companion;", "", "", "OFFLINE", "Ljava/lang/String;", "ONLINE", "TAG", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final WeakReference a;
    public Context b;
    public NetworkObserver c;
    public boolean d;
    public boolean e;

    static {
        SystemCallbacks.Companion = new Companion(null);
    }

    public SystemCallbacks(@NotNull RealImageLoader realImageLoader0) {
        this.a = new WeakReference(realImageLoader0);
        this.e = true;
    }

    public final void a() {
        Unit unit0;
        synchronized(this) {
            RealImageLoader realImageLoader0 = (RealImageLoader)this.a.get();
            if(realImageLoader0 == null) {
                unit0 = null;
            }
            else {
                if(this.c == null) {
                    NetworkObserver networkObserver0 = realImageLoader0.getOptions().getNetworkObserverEnabled() ? NetworkObserverKt.NetworkObserver(realImageLoader0.getContext(), this, realImageLoader0.getLogger()) : new EmptyNetworkObserver();
                    this.c = networkObserver0;
                    this.e = networkObserver0.isOnline();
                }
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                this.shutdown();
            }
        }
    }

    @NotNull
    public final WeakReference getImageLoader() {
        return this.a;
    }

    @VisibleForTesting
    public static void getImageLoader$annotations() {
    }

    public final boolean getShutdown() {
        return this.d;
    }

    @VisibleForTesting
    public static void getShutdown$annotations() {
    }

    public final boolean isOnline() {
        synchronized(this) {
            this.a();
            return this.e;
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration0) {
        synchronized(this) {
            if((((RealImageLoader)this.a.get()) == null ? null : Unit.INSTANCE) == null) {
                this.shutdown();
            }
        }
    }

    @Override  // coil.network.NetworkObserver$Listener
    public void onConnectivityChange(boolean z) {
        synchronized(this) {
            RealImageLoader realImageLoader0 = (RealImageLoader)this.a.get();
            Unit unit0 = null;
            if(realImageLoader0 != null) {
                Logger logger0 = realImageLoader0.getLogger();
                if(logger0 != null && logger0.getLevel() <= 4) {
                    logger0.log("NetworkObserver", 4, (z ? "ONLINE" : "OFFLINE"), null);
                }
                this.e = z;
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                this.shutdown();
            }
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
        synchronized(this) {
            this.onTrimMemory(80);
        }
    }

    @Override  // android.content.ComponentCallbacks2
    public void onTrimMemory(int v) {
        synchronized(this) {
            RealImageLoader realImageLoader0 = (RealImageLoader)this.a.get();
            Unit unit0 = null;
            if(realImageLoader0 != null) {
                Logger logger0 = realImageLoader0.getLogger();
                if(logger0 != null && logger0.getLevel() <= 2) {
                    logger0.log("NetworkObserver", 2, "trimMemory, level=" + v, null);
                }
                realImageLoader0.onTrimMemory$coil_base_release(v);
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                this.shutdown();
            }
        }
    }

    public final void registerMemoryPressureCallbacks() {
        Unit unit0;
        synchronized(this) {
            RealImageLoader realImageLoader0 = (RealImageLoader)this.a.get();
            if(realImageLoader0 == null) {
                unit0 = null;
            }
            else {
                if(this.b == null) {
                    Context context0 = realImageLoader0.getContext();
                    this.b = context0;
                    context0.registerComponentCallbacks(this);
                }
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                this.shutdown();
            }
        }
    }

    public final void setShutdown(boolean z) {
        this.d = z;
    }

    public final void shutdown() {
        synchronized(this) {
            if(this.d) {
                return;
            }
            this.d = true;
            Context context0 = this.b;
            if(context0 != null) {
                context0.unregisterComponentCallbacks(this);
            }
            NetworkObserver networkObserver0 = this.c;
            if(networkObserver0 != null) {
                networkObserver0.shutdown();
            }
            this.a.clear();
        }
    }
}

