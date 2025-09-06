package com.kakao.kandinsky.designsystem.util;

import android.graphics.Matrix;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000EJ\u0010\u0010\u0012\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000EJB\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001A\u0004\b#\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001A\u0004\b%\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001A\u0004\b\'\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001A\u0004\b)\u0010\u000E¨\u0006*"}, d2 = {"Lcom/kakao/kandinsky/designsystem/util/Transform;", "", "", "transitionX", "transitionY", "rotateZ", "scaleX", "scaleY", "<init>", "(FFFFF)V", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "component1", "()F", "component2", "component3", "component4", "component5", "copy", "(FFFFF)Lcom/kakao/kandinsky/designsystem/util/Transform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getTransitionX", "b", "getTransitionY", "c", "getRotateZ", "d", "getScaleX", "e", "getScaleY", "designsystem_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Transform {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public Transform() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null);
    }

    public Transform(float f, float f1, float f2, float f3, float f4) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public Transform(float f, float f1, float f2, float f3, float f4, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? f : 0.0f), ((v & 2) == 0 ? f1 : 0.0f), ((v & 4) == 0 ? f2 : 0.0f), ((v & 8) == 0 ? f3 : 1.0f), ((v & 16) == 0 ? f4 : 1.0f));
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    public final float component3() {
        return this.c;
    }

    public final float component4() {
        return this.d;
    }

    public final float component5() {
        return this.e;
    }

    @NotNull
    public final Transform copy(float f, float f1, float f2, float f3, float f4) {
        return new Transform(f, f1, f2, f3, f4);
    }

    public static Transform copy$default(Transform transform0, float f, float f1, float f2, float f3, float f4, int v, Object object0) {
        if((v & 1) != 0) {
            f = transform0.a;
        }
        if((v & 2) != 0) {
            f1 = transform0.b;
        }
        if((v & 4) != 0) {
            f2 = transform0.c;
        }
        if((v & 8) != 0) {
            f3 = transform0.d;
        }
        if((v & 16) != 0) {
            f4 = transform0.e;
        }
        return transform0.copy(f, f1, f2, f3, f4);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Transform)) {
            return false;
        }
        if(Float.compare(this.a, ((Transform)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((Transform)object0).b) != 0) {
            return false;
        }
        if(Float.compare(this.c, ((Transform)object0).c) != 0) {
            return false;
        }
        return Float.compare(this.d, ((Transform)object0).d) == 0 ? Float.compare(this.e, ((Transform)object0).e) == 0 : false;
    }

    @NotNull
    public final Matrix getMatrix() {
        Matrix matrix0 = new Matrix();
        matrix0.postScale(this.d, this.e);
        matrix0.postRotate(this.c);
        matrix0.postTranslate(this.a, this.b);
        return matrix0;
    }

    public final float getRotateZ() {
        return this.c;
    }

    public final float getScaleX() {
        return this.d;
    }

    public final float getScaleY() {
        return this.e;
    }

    public final float getTransitionX() {
        return this.a;
    }

    public final float getTransitionY() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.e) + a.b(this.d, a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Transform(transitionX=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", transitionY=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", rotateZ=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", scaleX=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", scaleY=");
        return androidx.room.a.h(this.e, ")", stringBuilder0);
    }
}

