package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier.Builder;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zd.c;

@RequiresApi(29)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018JR\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0014\u001A\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "Landroid/view/View;", "view", "", "useTextDefault", "Landroidx/compose/ui/unit/DpSize;", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/ui/unit/Density;", "density", "", "initialZoom", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "create", "canUpdateZoom", "Z", "getCanUpdateZoom", "()Z", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,202:1\n198#2:203\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n163#1:203\n*E\n"})
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    @RequiresApi(29)
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "magnifier", "Landroid/widget/Magnifier;", "(Landroid/widget/Magnifier;)V", "update", "", "sourceCenter", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "zoom", "", "update-Wko1d7g", "(JJF)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class PlatformMagnifierImpl extends androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable;

        public PlatformMagnifierImpl(@NotNull Magnifier magnifier0) {
            super(magnifier0);
        }

        @Override  // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl
        public void update-Wko1d7g(long v, long v1, float f) {
            if(!Float.isNaN(f)) {
                this.getMagnifier().setZoom(f);
            }
            if(OffsetKt.isSpecified-k-4lQ0M(v1)) {
                this.getMagnifier().show(Offset.getX-impl(v), Offset.getY-impl(v), Offset.getX-impl(v1), Offset.getY-impl(v1));
                return;
            }
            this.getMagnifier().show(Offset.getX-impl(v), Offset.getY-impl(v));
        }
    }

    public static final int $stable;
    @NotNull
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE;

    static {
        PlatformMagnifierFactoryApi29Impl.INSTANCE = new PlatformMagnifierFactoryApi29Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.foundation.PlatformMagnifierFactory
    public PlatformMagnifier create-nHHXs2Y(View view0, boolean z, long v, float f, float f1, boolean z1, Density density0, float f2) {
        return this.create-nHHXs2Y(view0, z, v, f, f1, z1, density0, f2);
    }

    @NotNull
    public PlatformMagnifierImpl create-nHHXs2Y(@NotNull View view0, boolean z, long v, float f, float f1, boolean z1, @NotNull Density density0, float f2) {
        if(z) {
            return new PlatformMagnifierImpl(new Magnifier(view0));
        }
        long v1 = density0.toSize-XkaWNTQ(v);
        float f3 = density0.toPx-0680j_4(f);
        float f4 = density0.toPx-0680j_4(f1);
        Magnifier.Builder magnifier$Builder0 = new Magnifier.Builder(view0);
        if(v1 != 0x7FC000007FC00000L) {
            magnifier$Builder0.setSize(c.roundToInt(Size.getWidth-impl(v1)), c.roundToInt(Size.getHeight-impl(v1)));
        }
        if(!Float.isNaN(f3)) {
            magnifier$Builder0.setCornerRadius(f3);
        }
        if(!Float.isNaN(f4)) {
            magnifier$Builder0.setElevation(f4);
        }
        if(!Float.isNaN(f2)) {
            magnifier$Builder0.setInitialZoom(f2);
        }
        magnifier$Builder0.setClippingEnabled(z1);
        return new PlatformMagnifierImpl(magnifier$Builder0.build());
    }

    @Override  // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return true;
    }
}

