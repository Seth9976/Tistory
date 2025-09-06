package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\u0018\b\u0002\u0010\u000F\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ \u0010\u001C\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u000E0\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJd\u0010\u001E\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0018\b\u0002\u0010\u000F\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u000E0\fH\u00C6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010!\u001A\u00020 H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001A\u00020#H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010%J\u001A\u0010\'\u001A\u00020\n2\b\u0010&\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0013R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u0015R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u0017R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u0019R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001BR\'\u0010\u000F\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u000E0\f8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001D\u00A8\u0006;"}, d2 = {"Landroidx/compose/animation/TransitionData;", "", "Landroidx/compose/animation/Fade;", "fade", "Landroidx/compose/animation/Slide;", "slide", "Landroidx/compose/animation/ChangeSize;", "changeSize", "Landroidx/compose/animation/Scale;", "scale", "", "hold", "", "Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/TransitionEffect;", "effectsMap", "<init>", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;ZLjava/util/Map;)V", "component1", "()Landroidx/compose/animation/Fade;", "component2", "()Landroidx/compose/animation/Slide;", "component3", "()Landroidx/compose/animation/ChangeSize;", "component4", "()Landroidx/compose/animation/Scale;", "component5", "()Z", "component6", "()Ljava/util/Map;", "copy", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;ZLjava/util/Map;)Landroidx/compose/animation/TransitionData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/animation/Fade;", "getFade", "b", "Landroidx/compose/animation/Slide;", "getSlide", "c", "Landroidx/compose/animation/ChangeSize;", "getChangeSize", "d", "Landroidx/compose/animation/Scale;", "getScale", "e", "Z", "getHold", "f", "Ljava/util/Map;", "getEffectsMap", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TransitionData {
    public static final int $stable;
    public final Fade a;
    public final Slide b;
    public final ChangeSize c;
    public final Scale d;
    public final boolean e;
    public final Map f;

    public TransitionData() {
        this(null, null, null, null, false, null, 0x3F, null);
    }

    public TransitionData(@Nullable Fade fade0, @Nullable Slide slide0, @Nullable ChangeSize changeSize0, @Nullable Scale scale0, boolean z, @NotNull Map map0) {
        this.a = fade0;
        this.b = slide0;
        this.c = changeSize0;
        this.d = scale0;
        this.e = z;
        this.f = map0;
    }

    public TransitionData(Fade fade0, Slide slide0, ChangeSize changeSize0, Scale scale0, boolean z, Map map0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            z = false;
        }
        if((v & 0x20) != 0) {
            map0 = x.emptyMap();
        }
        this(((v & 1) == 0 ? fade0 : null), ((v & 2) == 0 ? slide0 : null), ((v & 4) == 0 ? changeSize0 : null), ((v & 8) == 0 ? scale0 : null), z, map0);
    }

    @Nullable
    public final Fade component1() {
        return this.a;
    }

    @Nullable
    public final Slide component2() {
        return this.b;
    }

    @Nullable
    public final ChangeSize component3() {
        return this.c;
    }

    @Nullable
    public final Scale component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    @NotNull
    public final Map component6() {
        return this.f;
    }

    @NotNull
    public final TransitionData copy(@Nullable Fade fade0, @Nullable Slide slide0, @Nullable ChangeSize changeSize0, @Nullable Scale scale0, boolean z, @NotNull Map map0) {
        return new TransitionData(fade0, slide0, changeSize0, scale0, z, map0);
    }

    public static TransitionData copy$default(TransitionData transitionData0, Fade fade0, Slide slide0, ChangeSize changeSize0, Scale scale0, boolean z, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            fade0 = transitionData0.a;
        }
        if((v & 2) != 0) {
            slide0 = transitionData0.b;
        }
        if((v & 4) != 0) {
            changeSize0 = transitionData0.c;
        }
        if((v & 8) != 0) {
            scale0 = transitionData0.d;
        }
        if((v & 16) != 0) {
            z = transitionData0.e;
        }
        if((v & 0x20) != 0) {
            map0 = transitionData0.f;
        }
        return transitionData0.copy(fade0, slide0, changeSize0, scale0, z, map0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransitionData)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((TransitionData)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TransitionData)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TransitionData)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TransitionData)object0).d)) {
            return false;
        }
        return this.e == ((TransitionData)object0).e ? Intrinsics.areEqual(this.f, ((TransitionData)object0).f) : false;
    }

    @Nullable
    public final ChangeSize getChangeSize() {
        return this.c;
    }

    @NotNull
    public final Map getEffectsMap() {
        return this.f;
    }

    @Nullable
    public final Fade getFade() {
        return this.a;
    }

    public final boolean getHold() {
        return this.e;
    }

    @Nullable
    public final Scale getScale() {
        return this.d;
    }

    @Nullable
    public final Slide getSlide() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Scale scale0 = this.d;
        if(scale0 != null) {
            v = scale0.hashCode();
        }
        return this.f.hashCode() + a.e((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v) * 0x1F, 0x1F, this.e);
    }

    @Override
    @NotNull
    public String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }
}

