package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(28)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018JR\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0014\u001A\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "Landroid/view/View;", "view", "", "useTextDefault", "Landroidx/compose/ui/unit/DpSize;", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/ui/unit/Density;", "density", "", "initialZoom", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "create", "canUpdateZoom", "Z", "getCanUpdateZoom", "()Z", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {
    @RequiresApi(28)
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u0010\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0019\u001A\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifier;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "", "updateContent", "()V", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "update-Wko1d7g", "(JJF)V", "update", "dismiss", "a", "Landroid/widget/Magnifier;", "getMagnifier", "()Landroid/widget/Magnifier;", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        public static final int $stable = 8;
        public final Magnifier a;

        public PlatformMagnifierImpl(@NotNull Magnifier magnifier0) {
            this.a = magnifier0;
        }

        @Override  // androidx.compose.foundation.PlatformMagnifier
        public void dismiss() {
            this.a.dismiss();
        }

        @NotNull
        public final Magnifier getMagnifier() {
            return this.a;
        }

        @Override  // androidx.compose.foundation.PlatformMagnifier
        public long getSize-YbymL2g() {
            return IntSizeKt.IntSize(this.a.getWidth(), this.a.getHeight());
        }

        @Override  // androidx.compose.foundation.PlatformMagnifier
        public void update-Wko1d7g(long v, long v1, float f) {
            this.a.show(Offset.getX-impl(v), Offset.getY-impl(v));
        }

        @Override  // androidx.compose.foundation.PlatformMagnifier
        public void updateContent() {
            this.a.update();
        }
    }

    public static final int $stable;
    @NotNull
    public static final PlatformMagnifierFactoryApi28Impl INSTANCE;

    static {
        PlatformMagnifierFactoryApi28Impl.INSTANCE = new PlatformMagnifierFactoryApi28Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.foundation.PlatformMagnifierFactory
    public PlatformMagnifier create-nHHXs2Y(View view0, boolean z, long v, float f, float f1, boolean z1, Density density0, float f2) {
        return this.create-nHHXs2Y(view0, z, v, f, f1, z1, density0, f2);
    }

    @NotNull
    public PlatformMagnifierImpl create-nHHXs2Y(@NotNull View view0, boolean z, long v, float f, float f1, boolean z1, @NotNull Density density0, float f2) {
        return new PlatformMagnifierImpl(new Magnifier(view0));
    }

    @Override  // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return false;
    }
}

