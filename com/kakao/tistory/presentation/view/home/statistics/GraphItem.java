package com.kakao.tistory.presentation.view.home.statistics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000E\u0010\fJ\u001D\u0010\u0010\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0011\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u000F\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u0010\u0010\u001AR\"\u0010\u0007\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u0017\u001A\u0004\b\u001C\u0010\u0019\"\u0004\b\u000B\u0010\u001AR\"\u0010\r\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u0017\u001A\u0004\b\u001E\u0010\u0019\"\u0004\b\u000E\u0010\u001A¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/view/home/statistics/GraphItem;", "", "", "springiness", "dampingRatio", "<init>", "(FF)V", "position", "", "now", "", "setPosition", "(FJ)V", "velocity", "setVelocity", "targetPosition", "setTargetPosition", "update", "(J)V", "", "isAtRest", "()Z", "b", "F", "getTargetPosition", "()F", "(F)V", "c", "getPosition", "d", "getVelocity", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GraphItem {
    public static final int $stable = 8;
    public final float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public final float f;

    public GraphItem(float f, float f1) {
        this.a = f;
        this.f = (float)(Math.sqrt(f) * (((double)f1) * 2.0));
    }

    public final float getPosition() {
        return this.c;
    }

    public final float getTargetPosition() {
        return this.b;
    }

    public final float getVelocity() {
        return this.d;
    }

    // 去混淆评级： 低(30)
    public final boolean isAtRest() {
        return Float.compare(Math.abs(this.d), 0.01f) < 0 && this.b - this.c < 0.01f;
    }

    public final void setPosition(float f) {
        this.c = f;
    }

    public final void setPosition(float f, long v) {
        this.c = f;
        this.e = v;
    }

    public final void setTargetPosition(float f) {
        this.b = f;
    }

    public final void setTargetPosition(float f, long v) {
        this.b = f;
        this.e = v;
    }

    public final void setVelocity(float f) {
        this.d = f;
    }

    public final void setVelocity(float f, long v) {
        this.d = f;
        this.e = v;
    }

    public final void update(long v) {
        float f = ((float)Math.min(v - this.e, 50L)) / 1000.0f;
        float f1 = (-this.a * (this.c - this.b) - this.f * this.d) * f + this.d;
        this.d = f1;
        this.c = f1 * f + this.c;
        this.e = v;
    }
}

