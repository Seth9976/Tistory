package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/window/layout/SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SidecarCompat.registerConfigurationChangeListener.configChangeObserver.1 implements ComponentCallbacks {
    public final SidecarCompat a;
    public final Activity b;

    public SidecarCompat.registerConfigurationChangeListener.configChangeObserver.1(SidecarCompat sidecarCompat0, Activity activity0) {
        this.a = sidecarCompat0;
        this.b = activity0;
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "newConfig");
        SidecarCompat sidecarCompat0 = this.a;
        ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0 = SidecarCompat.access$getExtensionCallback$p(sidecarCompat0);
        if(extensionInterfaceCompat$ExtensionCallbackInterface0 != null) {
            WindowLayoutInfo windowLayoutInfo0 = sidecarCompat0.getWindowLayoutInfo(this.b);
            extensionInterfaceCompat$ExtensionCallbackInterface0.onWindowLayoutChanged(this.b, windowLayoutInfo0);
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}

