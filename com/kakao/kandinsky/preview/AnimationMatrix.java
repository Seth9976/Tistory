package com.kakao.kandinsky.preview;

import android.graphics.Matrix;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001A\u0004\b\u001A\u0010\b¨\u0006\u001B"}, d2 = {"Lcom/kakao/kandinsky/preview/AnimationMatrix;", "", "Landroid/graphics/Matrix;", "from", "to", "<init>", "(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V", "component1", "()Landroid/graphics/Matrix;", "component2", "copy", "(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Lcom/kakao/kandinsky/preview/AnimationMatrix;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Matrix;", "getFrom", "b", "getTo", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AnimationMatrix {
    public static final int $stable;
    public final Matrix a;
    public final Matrix b;

    public AnimationMatrix() {
        this(null, null, 3, null);
    }

    public AnimationMatrix(@NotNull Matrix matrix0, @NotNull Matrix matrix1) {
        Intrinsics.checkNotNullParameter(matrix0, "from");
        Intrinsics.checkNotNullParameter(matrix1, "to");
        super();
        this.a = matrix0;
        this.b = matrix1;
    }

    public AnimationMatrix(Matrix matrix0, Matrix matrix1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            matrix0 = new Matrix();
        }
        if((v & 2) != 0) {
            matrix1 = new Matrix();
        }
        this(matrix0, matrix1);
    }

    @NotNull
    public final Matrix component1() {
        return this.a;
    }

    @NotNull
    public final Matrix component2() {
        return this.b;
    }

    @NotNull
    public final AnimationMatrix copy(@NotNull Matrix matrix0, @NotNull Matrix matrix1) {
        Intrinsics.checkNotNullParameter(matrix0, "from");
        Intrinsics.checkNotNullParameter(matrix1, "to");
        return new AnimationMatrix(matrix0, matrix1);
    }

    public static AnimationMatrix copy$default(AnimationMatrix animationMatrix0, Matrix matrix0, Matrix matrix1, int v, Object object0) {
        if((v & 1) != 0) {
            matrix0 = animationMatrix0.a;
        }
        if((v & 2) != 0) {
            matrix1 = animationMatrix0.b;
        }
        return animationMatrix0.copy(matrix0, matrix1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AnimationMatrix)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((AnimationMatrix)object0).a) ? Intrinsics.areEqual(this.b, ((AnimationMatrix)object0).b) : false;
    }

    @NotNull
    public final Matrix getFrom() {
        return this.a;
    }

    @NotNull
    public final Matrix getTo() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "AnimationMatrix(from=" + this.a + ", to=" + this.b + ")";
    }
}

