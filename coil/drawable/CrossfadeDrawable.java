package coil.drawable;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 i2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001iBE\b\u0007\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\f\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\bH\u0017\u00A2\u0006\u0004\b\u0019\u0010\u0015J\u0011\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0019\u0010\u001E\u001A\u00020\u00112\b\u0010\u001D\u001A\u0004\u0018\u00010\u001AH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010\"\u001A\u00020\u00112\u0006\u0010!\u001A\u00020 H\u0014\u00A2\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001A\u00020\n2\u0006\u0010$\u001A\u00020\bH\u0014\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010)\u001A\u00020\n2\u0006\u0010(\u001A\u00020\'H\u0014\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010+\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b+\u0010\u0015J\u000F\u0010,\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b,\u0010\u0015J\u001F\u00100\u001A\u00020\u00112\u0006\u0010-\u001A\u00020\u00012\u0006\u0010/\u001A\u00020.H\u0016\u00A2\u0006\u0004\b0\u00101J\u0017\u00102\u001A\u00020\u00112\u0006\u0010-\u001A\u00020\u0001H\u0016\u00A2\u0006\u0004\b2\u00103J\'\u00106\u001A\u00020\u00112\u0006\u0010-\u001A\u00020\u00012\u0006\u0010/\u001A\u00020.2\u0006\u00105\u001A\u000204H\u0016\u00A2\u0006\u0004\b6\u00107J\u0017\u00109\u001A\u00020\u00112\u0006\u00108\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b9\u0010\u0018J\u0019\u0010<\u001A\u00020\u00112\b\u0010;\u001A\u0004\u0018\u00010:H\u0016\u00A2\u0006\u0004\b<\u0010=J\u0019\u0010@\u001A\u00020\u00112\b\u0010?\u001A\u0004\u0018\u00010>H\u0016\u00A2\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001A\u00020\u00112\b\u0010C\u001A\u0004\u0018\u00010BH\u0017\u00A2\u0006\u0004\bD\u0010EJ\u000F\u0010F\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bF\u0010GJ\u000F\u0010\u0004\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0004\u0010HJ\u000F\u0010I\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\bI\u0010HJ\u0017\u0010L\u001A\u00020\u00112\u0006\u0010K\u001A\u00020JH\u0016\u00A2\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001A\u00020\n2\u0006\u0010K\u001A\u00020JH\u0016\u00A2\u0006\u0004\bN\u0010OJ\u000F\u0010P\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\bP\u0010HJ\u001F\u0010U\u001A\u00020\u00112\u0006\u0010Q\u001A\u00020\u00012\u0006\u0010R\u001A\u00020 H\u0001\u00A2\u0006\u0004\bS\u0010TR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u0010YR\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010\u0015R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b]\u0010^\u001A\u0004\b_\u0010GR\u0017\u0010\f\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b`\u0010^\u001A\u0004\ba\u0010GR(\u0010\u0004\u001A\u0004\u0018\u00010\u00012\b\u0010b\u001A\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bc\u0010d\u001A\u0004\be\u0010fR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00018\u0006\u00A2\u0006\f\n\u0004\bg\u0010d\u001A\u0004\bh\u0010f\u00A8\u0006j"}, d2 = {"Lcoil/drawable/CrossfadeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "start", "end", "Lcoil/size/Scale;", "scale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/size/Scale;IZZ)V", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "alpha", "setAlpha", "(I)V", "getOpacity", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "level", "onLevelChange", "(I)Z", "", "state", "onStateChange", "([I)Z", "getIntrinsicWidth", "getIntrinsicHeight", "who", "Ljava/lang/Runnable;", "what", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "when", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "tintColor", "setTint", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "isRunning", "()Z", "()V", "stop", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "callback", "registerAnimationCallback", "(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)V", "unregisterAnimationCallback", "(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)Z", "clearAnimationCallbacks", "drawable", "targetBounds", "updateBounds$coil_base_release", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V", "updateBounds", "a", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "b", "I", "getDurationMillis", "c", "Z", "getFadeStart", "d", "getPreferExactIntrinsicSize", "<set-?>", "k", "Landroid/graphics/drawable/Drawable;", "getStart", "()Landroid/graphics/drawable/Drawable;", "l", "getEnd", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCrossfadeDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 Collections.kt\ncoil/util/-Collections\n*L\n1#1,277:1\n1#2:278\n30#3,7:279\n30#3,7:286\n30#3,7:293\n30#3,7:300\n12#4,4:307\n12#4,4:311\n*S KotlinDebug\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n*L\n71#1:279,7\n79#1:286,7\n93#1:293,7\n100#1:300,7\n211#1:307,4\n266#1:311,4\n*E\n"})
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback, Animatable2Compat {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcoil/drawable/CrossfadeDrawable$Companion;", "", "", "DEFAULT_DURATION", "I", "STATE_DONE", "STATE_RUNNING", "STATE_START", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int DEFAULT_DURATION = 100;
    public final Scale a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final ArrayList e;
    public final int f;
    public final int g;
    public long h;
    public int i;
    public int j;
    public Drawable k;
    public final Drawable l;

    static {
        CrossfadeDrawable.Companion = new Companion(null);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable0, @Nullable Drawable drawable1) {
        this(drawable0, drawable1, null, 0, false, false, 60, null);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @NotNull Scale scale0) {
        this(drawable0, drawable1, scale0, 0, false, false, 56, null);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @NotNull Scale scale0, int v) {
        this(drawable0, drawable1, scale0, v, false, false, 0x30, null);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @NotNull Scale scale0, int v, boolean z) {
        this(drawable0, drawable1, scale0, v, z, false, 0x20, null);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @NotNull Scale scale0, int v, boolean z, boolean z1) {
        this.a = scale0;
        this.b = v;
        this.c = z;
        this.d = z1;
        this.e = new ArrayList();
        Drawable drawable2 = null;
        this.f = this.a((drawable0 == null ? null : drawable0.getIntrinsicWidth()), (drawable1 == null ? null : drawable1.getIntrinsicWidth()));
        this.g = this.a((drawable0 == null ? null : drawable0.getIntrinsicHeight()), (drawable1 == null ? null : drawable1.getIntrinsicHeight()));
        this.i = 0xFF;
        this.k = drawable0 == null ? null : drawable0.mutate();
        if(drawable1 != null) {
            drawable2 = drawable1.mutate();
        }
        this.l = drawable2;
        if(v <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable3 = this.k;
        if(drawable3 != null) {
            drawable3.setCallback(this);
        }
        if(drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    public CrossfadeDrawable(Drawable drawable0, Drawable drawable1, Scale scale0, int v, boolean z, boolean z1, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            scale0 = Scale.FIT;
        }
        if((v1 & 8) != 0) {
            v = 100;
        }
        if((v1 & 16) != 0) {
            z = true;
        }
        if((v1 & 0x20) != 0) {
            z1 = false;
        }
        this(drawable0, drawable1, scale0, v, z, z1);
    }

    public final int a(Integer integer0, Integer integer1) {
        int v = -1;
        if(!this.d && (integer0 != null && ((int)integer0) == -1 || integer1 != null && ((int)integer1) == -1)) {
            return -1;
        }
        int v1 = integer0 == null ? -1 : ((int)integer0);
        if(integer1 != null) {
            v = (int)integer1;
        }
        return Math.max(v1, v);
    }

    public final void b() {
        this.j = 2;
        this.k = null;
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((AnimationCallback)arrayList0.get(v1)).onAnimationEnd(this);
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.e.clear();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas0) {
        int v = this.j;
        if(v == 0) {
            Drawable drawable0 = this.k;
            if(drawable0 != null) {
                drawable0.setAlpha(this.i);
                int v1 = canvas0.save();
                try {
                    drawable0.draw(canvas0);
                }
                finally {
                    canvas0.restoreToCount(v1);
                }
                return;
            }
            return;
        }
        Drawable drawable1 = this.l;
        if(v == 2) {
            if(drawable1 != null) {
                drawable1.setAlpha(this.i);
                int v3 = canvas0.save();
                try {
                    drawable1.draw(canvas0);
                }
                finally {
                    canvas0.restoreToCount(v3);
                }
                return;
            }
            return;
        }
        double f = ((double)(SystemClock.uptimeMillis() - this.h)) / ((double)this.b);
        double f1 = c.coerceIn(f, 0.0, 1.0);
        int v5 = this.i;
        int v6 = (int)(f1 * ((double)v5));
        if(this.c) {
            v5 -= v6;
        }
        if(f < 1.0) {
            Drawable drawable2 = this.k;
            if(drawable2 != null) {
                drawable2.setAlpha(v5);
                int v7 = canvas0.save();
                try {
                    drawable2.draw(canvas0);
                }
                finally {
                    canvas0.restoreToCount(v7);
                }
            }
        }
        if(drawable1 != null) {
            drawable1.setAlpha(v6);
            int v9 = canvas0.save();
            try {
                drawable1.draw(canvas0);
            }
            finally {
                canvas0.restoreToCount(v9);
            }
        }
        if(f >= 1.0) {
            this.b();
            return;
        }
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.i;
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        int v = this.j;
        if(v != 0) {
            Drawable drawable0 = this.l;
            switch(v) {
                case 1: {
                    if(drawable0 != null) {
                        ColorFilter colorFilter0 = drawable0.getColorFilter();
                        if(colorFilter0 != null) {
                            return colorFilter0;
                        }
                    }
                    return this.k == null ? null : this.k.getColorFilter();
                }
                case 2: {
                    return drawable0 == null ? null : drawable0.getColorFilter();
                }
                default: {
                    return null;
                }
            }
        }
        return this.k == null ? null : this.k.getColorFilter();
    }

    public final int getDurationMillis() {
        return this.b;
    }

    @Nullable
    public final Drawable getEnd() {
        return this.l;
    }

    public final boolean getFadeStart() {
        return this.c;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.g;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f;
    }

    @Override  // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        Drawable drawable0 = this.k;
        int v = this.j;
        if(v == 0) {
            return drawable0 == null ? -2 : drawable0.getOpacity();
        }
        Drawable drawable1 = this.l;
        if(v == 2) {
            return drawable1 == null ? -2 : drawable1.getOpacity();
        }
        if(drawable0 != null && drawable1 != null) {
            return Drawable.resolveOpacity(drawable0.getOpacity(), drawable1.getOpacity());
        }
        if(drawable0 != null) {
            return drawable0.getOpacity();
        }
        return drawable1 == null ? -2 : drawable1.getOpacity();
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.d;
    }

    @NotNull
    public final Scale getScale() {
        return this.a;
    }

    @Nullable
    public final Drawable getStart() {
        return this.k;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(@NotNull Drawable drawable0) {
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.j == 1;
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect rect0) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            this.updateBounds$coil_base_release(drawable0, rect0);
        }
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            this.updateBounds$coil_base_release(drawable1, rect0);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Drawable
    public boolean onLevelChange(int v) {
        return (this.k == null ? false : this.k.setLevel(v)) || (this.l == null ? false : this.l.setLevel(v));
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Drawable
    public boolean onStateChange(@NotNull int[] arr_v) {
        return (this.k == null ? false : this.k.setState(arr_v)) || (this.l == null ? false : this.l.setState(arr_v));
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NotNull AnimationCallback animatable2Compat$AnimationCallback0) {
        this.e.add(animatable2Compat$AnimationCallback0);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(@NotNull Drawable drawable0, @NotNull Runnable runnable0, long v) {
        this.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(v < 0 || v >= 0x100) {
            throw new IllegalArgumentException(("Invalid alpha: " + v).toString());
        }
        this.i = v;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.setColorFilter(colorFilter0);
        }
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            drawable1.setColorFilter(colorFilter0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTint(int v) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.setTint(v);
        }
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            drawable1.setTint(v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public void setTintBlendMode(@Nullable BlendMode blendMode0) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.setTintBlendMode(blendMode0);
        }
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            drawable1.setTintBlendMode(blendMode0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList0) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.setTintList(colorStateList0);
        }
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            drawable1.setTintList(colorStateList0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.setTintMode(porterDuff$Mode0);
        }
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            drawable1.setTintMode(porterDuff$Mode0);
        }
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        Animatable animatable0 = null;
        Animatable animatable1 = this.k instanceof Animatable ? ((Animatable)this.k) : null;
        if(animatable1 != null) {
            animatable1.start();
        }
        Drawable drawable0 = this.l;
        if(drawable0 instanceof Animatable) {
            animatable0 = (Animatable)drawable0;
        }
        if(animatable0 != null) {
            animatable0.start();
        }
        if(this.j != 0) {
            return;
        }
        this.j = 1;
        this.h = SystemClock.uptimeMillis();
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((AnimationCallback)arrayList0.get(v1)).onAnimationStart(this);
        }
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        Animatable animatable0 = null;
        Animatable animatable1 = this.k instanceof Animatable ? ((Animatable)this.k) : null;
        if(animatable1 != null) {
            animatable1.stop();
        }
        Drawable drawable0 = this.l;
        if(drawable0 instanceof Animatable) {
            animatable0 = (Animatable)drawable0;
        }
        if(animatable0 != null) {
            animatable0.stop();
        }
        if(this.j != 2) {
            this.b();
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NotNull AnimationCallback animatable2Compat$AnimationCallback0) {
        return this.e.remove(animatable2Compat$AnimationCallback0);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(@NotNull Drawable drawable0, @NotNull Runnable runnable0) {
        this.unscheduleSelf(runnable0);
    }

    @VisibleForTesting
    public final void updateBounds$coil_base_release(@NotNull Drawable drawable0, @NotNull Rect rect0) {
        int v = drawable0.getIntrinsicWidth();
        int v1 = drawable0.getIntrinsicHeight();
        if(v > 0 && v1 > 0) {
            int v2 = rect0.width();
            int v3 = rect0.height();
            double f = DecodeUtils.computeSizeMultiplier(v, v1, v2, v3, this.a);
            int v4 = zd.c.roundToInt((((double)v2) - ((double)v) * f) / 2.0);
            int v5 = zd.c.roundToInt((((double)v3) - f * ((double)v1)) / 2.0);
            drawable0.setBounds(rect0.left + v4, rect0.top + v5, rect0.right - v4, rect0.bottom - v5);
            return;
        }
        drawable0.setBounds(rect0);
    }
}

