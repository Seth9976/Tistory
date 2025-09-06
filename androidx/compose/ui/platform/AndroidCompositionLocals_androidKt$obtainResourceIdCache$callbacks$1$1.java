package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.compose.ui.res.ResourceIdCache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1 implements ComponentCallbacks2 {
    public final ResourceIdCache a;

    public AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1(ResourceIdCache resourceIdCache0) {
        this.a = resourceIdCache0;
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration0) {
        this.a.clear();
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.a.clear();
    }

    @Override  // android.content.ComponentCallbacks2
    public void onTrimMemory(int v) {
        this.a.clear();
    }
}

