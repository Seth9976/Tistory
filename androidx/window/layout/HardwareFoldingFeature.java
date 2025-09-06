package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002+,B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0014\u0010 \u001A\u00020\u001D8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0014\u0010!\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"R\u0014\u0010&\u001A\u00020#8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010%R\u0014\u0010*\u001A\u00020\'8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b(\u0010)¨\u0006-"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature;", "Landroidx/window/layout/FoldingFeature;", "Landroidx/window/core/Bounds;", "featureBounds", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "type", "Landroidx/window/layout/FoldingFeature$State;", "state", "<init>", "(Landroidx/window/core/Bounds;Landroidx/window/layout/HardwareFoldingFeature$Type;Landroidx/window/layout/FoldingFeature$State;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "getType$window_release", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "c", "Landroidx/window/layout/FoldingFeature$State;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "isSeparating", "()Z", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "occlusionType", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "orientation", "Companion", "Type", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class HardwareFoldingFeature implements FoldingFeature {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Companion;", "", "Landroidx/window/core/Bounds;", "bounds", "", "validateFeatureBounds$window_release", "(Landroidx/window/core/Bounds;)V", "validateFeatureBounds", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void validateFeatureBounds$window_release(@NotNull Bounds bounds0) {
            Intrinsics.checkNotNullParameter(bounds0, "bounds");
            if(bounds0.getWidth() == 0 && bounds0.getHeight() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if(bounds0.getLeft() != 0 && bounds0.getTop() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type;", "", "", "toString", "()Ljava/lang/String;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Type {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type$Companion;", "", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "FOLD", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "getFOLD", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "HINGE", "getHINGE", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
        public static final class androidx.window.layout.HardwareFoldingFeature.Type.Companion {
            public androidx.window.layout.HardwareFoldingFeature.Type.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final Type getFOLD() {
                return Type.b;
            }

            @NotNull
            public final Type getHINGE() {
                return Type.c;
            }
        }

        @NotNull
        public static final androidx.window.layout.HardwareFoldingFeature.Type.Companion Companion;
        public final String a;
        public static final Type b;
        public static final Type c;

        static {
            Type.Companion = new androidx.window.layout.HardwareFoldingFeature.Type.Companion(null);
            Type.b = new Type("FOLD");
            Type.c = new Type("HINGE");
        }

        public Type(String s) {
            this.a = s;
        }

        @Override
        @NotNull
        public String toString() {
            return this.a;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Bounds a;
    public final Type b;
    public final State c;

    static {
        HardwareFoldingFeature.Companion = new Companion(null);
    }

    public HardwareFoldingFeature(@NotNull Bounds bounds0, @NotNull Type hardwareFoldingFeature$Type0, @NotNull State foldingFeature$State0) {
        Intrinsics.checkNotNullParameter(bounds0, "featureBounds");
        Intrinsics.checkNotNullParameter(hardwareFoldingFeature$Type0, "type");
        Intrinsics.checkNotNullParameter(foldingFeature$State0, "state");
        super();
        this.a = bounds0;
        this.b = hardwareFoldingFeature$Type0;
        this.c = foldingFeature$State0;
        HardwareFoldingFeature.Companion.validateFeatureBounds$window_release(bounds0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!Intrinsics.areEqual(HardwareFoldingFeature.class, class0)) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        if(!Intrinsics.areEqual(this.a, ((HardwareFoldingFeature)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((HardwareFoldingFeature)object0).b) ? Intrinsics.areEqual(this.getState(), ((HardwareFoldingFeature)object0).getState()) : false;
    }

    @Override  // androidx.window.layout.DisplayFeature
    @NotNull
    public Rect getBounds() {
        return this.a.toRect();
    }

    @Override  // androidx.window.layout.FoldingFeature
    @NotNull
    public OcclusionType getOcclusionType() {
        return this.a.getWidth() == 0 || this.a.getHeight() == 0 ? OcclusionType.NONE : OcclusionType.FULL;
    }

    @Override  // androidx.window.layout.FoldingFeature
    @NotNull
    public Orientation getOrientation() {
        return this.a.getWidth() <= this.a.getHeight() ? Orientation.VERTICAL : Orientation.HORIZONTAL;
    }

    @Override  // androidx.window.layout.FoldingFeature
    @NotNull
    public State getState() {
        return this.c;
    }

    @NotNull
    public final Type getType$window_release() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.getState().hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    // 去混淆评级： 低(30)
    @Override  // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        return Intrinsics.areEqual(this.b, Type.Companion.getHINGE()) || Intrinsics.areEqual(this.b, Type.Companion.getFOLD()) && Intrinsics.areEqual(this.getState(), State.HALF_OPENED);
    }

    @Override
    @NotNull
    public String toString() {
        return "HardwareFoldingFeature { " + this.a + ", type=" + this.b + ", state=" + this.getState() + " }";
    }
}

