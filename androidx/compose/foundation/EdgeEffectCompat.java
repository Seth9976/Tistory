package androidx.compose.foundation;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u.s;
import u.w1;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001A\u00020\u0007*\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\u000F\u001A\u00020\u000E*\u00020\u00042\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u0010J\u0019\u0010\u0012\u001A\u00020\u000E*\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0016\u001A\u00020\u0007*\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "Landroid/content/Context;", "context", "Landroid/widget/EdgeEffect;", "create", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "onPullDistanceCompat", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "", "onAbsorbCompat", "(Landroid/widget/EdgeEffect;I)V", "delta", "onReleaseWithOppositeDelta", "(Landroid/widget/EdgeEffect;F)V", "getDistanceCompat", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EdgeEffectCompat {
    public static final int $stable;
    @NotNull
    public static final EdgeEffectCompat INSTANCE;

    static {
        EdgeEffectCompat.INSTANCE = new EdgeEffectCompat();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final EdgeEffect create(@NotNull Context context0) {
        return Build.VERSION.SDK_INT >= 0x1F ? s.a.a(context0, null) : new w1(context0);
    }

    public final float getDistanceCompat(@NotNull EdgeEffect edgeEffect0) {
        return Build.VERSION.SDK_INT < 0x1F ? 0.0f : s.a.b(edgeEffect0);
    }

    public final void onAbsorbCompat(@NotNull EdgeEffect edgeEffect0, int v) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            edgeEffect0.onAbsorb(v);
            return;
        }
        if(edgeEffect0.isFinished()) {
            edgeEffect0.onAbsorb(v);
        }
    }

    public final float onPullDistanceCompat(@NotNull EdgeEffect edgeEffect0, float f, float f1) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return s.a.c(edgeEffect0, f, f1);
        }
        edgeEffect0.onPull(f, f1);
        return f;
    }

    public final void onReleaseWithOppositeDelta(@NotNull EdgeEffect edgeEffect0, float f) {
        if(edgeEffect0 instanceof w1) {
            float f1 = ((w1)edgeEffect0).b + f;
            ((w1)edgeEffect0).b = f1;
            if(Math.abs(f1) > ((w1)edgeEffect0).a) {
                ((w1)edgeEffect0).onRelease();
            }
        }
        else {
            edgeEffect0.onRelease();
        }
    }
}

