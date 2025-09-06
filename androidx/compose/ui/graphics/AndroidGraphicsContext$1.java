package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver.OnPreDrawListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/graphics/AndroidGraphicsContext$1", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidGraphicsContext.1 implements ComponentCallbacks2 {
    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override  // android.content.ComponentCallbacks2
    public void onTrimMemory(int v) {
        if(v >= 40) {
            throw null;
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/graphics/AndroidGraphicsContext$1$onTrimMemory$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.ui.graphics.AndroidGraphicsContext.1.onTrimMemory.1 implements ViewTreeObserver.OnPreDrawListener {
            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                throw null;
            }
        }

    }
}

