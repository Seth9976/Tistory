package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001C"}, d2 = {"Landroidx/paging/GenerationalViewportHint;", "", "", "generationId", "Landroidx/paging/ViewportHint;", "hint", "<init>", "(ILandroidx/paging/ViewportHint;)V", "component1", "()I", "component2", "()Landroidx/paging/ViewportHint;", "copy", "(ILandroidx/paging/ViewportHint;)Landroidx/paging/GenerationalViewportHint;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getGenerationId", "b", "Landroidx/paging/ViewportHint;", "getHint", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class GenerationalViewportHint {
    public final int a;
    public final ViewportHint b;

    public GenerationalViewportHint(int v, @NotNull ViewportHint viewportHint0) {
        Intrinsics.checkNotNullParameter(viewportHint0, "hint");
        super();
        this.a = v;
        this.b = viewportHint0;
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final ViewportHint component2() {
        return this.b;
    }

    @NotNull
    public final GenerationalViewportHint copy(int v, @NotNull ViewportHint viewportHint0) {
        Intrinsics.checkNotNullParameter(viewportHint0, "hint");
        return new GenerationalViewportHint(v, viewportHint0);
    }

    public static GenerationalViewportHint copy$default(GenerationalViewportHint generationalViewportHint0, int v, ViewportHint viewportHint0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = generationalViewportHint0.a;
        }
        if((v1 & 2) != 0) {
            viewportHint0 = generationalViewportHint0.b;
        }
        return generationalViewportHint0.copy(v, viewportHint0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GenerationalViewportHint)) {
            return false;
        }
        return this.a == ((GenerationalViewportHint)object0).a ? Intrinsics.areEqual(this.b, ((GenerationalViewportHint)object0).b) : false;
    }

    public final int getGenerationId() {
        return this.a;
    }

    @NotNull
    public final ViewportHint getHint() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}

