package androidx.activity;

import a5.b;
import android.os.Build.VERSION;
import android.window.BackEvent;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0011\u0018\u0000 \u001E2\u00020\u0001:\u0002\u001E\u001FB+\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0017\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000F\u0010\r\u001A\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001A\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001A\u0004\b\u0019\u0010\u0015R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006 "}, d2 = {"Landroidx/activity/BackEventCompat;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "<init>", "(FFFI)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "toBackEvent", "()Landroid/window/BackEvent;", "", "toString", "()Ljava/lang/String;", "a", "F", "getTouchX", "()F", "b", "getTouchY", "c", "getProgress", "d", "I", "getSwipeEdge", "()I", "Companion", "SwipeEdge", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BackEventCompat {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/activity/BackEventCompat$Companion;", "", "", "EDGE_LEFT", "I", "EDGE_RIGHT", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
    public @interface SwipeEdge {
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    static {
        BackEventCompat.Companion = new Companion(null);
    }

    @VisibleForTesting
    public BackEventCompat(float f, float f1, @FloatRange(from = 0.0, to = 1.0) float f2, int v) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = v;
    }

    @RequiresApi(34)
    public BackEventCompat(@NotNull BackEvent backEvent0) {
        Intrinsics.checkNotNullParameter(backEvent0, "backEvent");
        this(Api34Impl.INSTANCE.touchX(backEvent0), Api34Impl.INSTANCE.touchY(backEvent0), Api34Impl.INSTANCE.progress(backEvent0), Api34Impl.INSTANCE.swipeEdge(backEvent0));
    }

    public final float getProgress() {
        return this.c;
    }

    public final int getSwipeEdge() {
        return this.d;
    }

    public final float getTouchX() {
        return this.a;
    }

    public final float getTouchY() {
        return this.b;
    }

    @RequiresApi(34)
    @NotNull
    public final BackEvent toBackEvent() {
        if(Build.VERSION.SDK_INT < 34) {
            throw new UnsupportedOperationException("This method is only supported on API level 34+");
        }
        return Api34Impl.INSTANCE.createOnBackEvent(this.a, this.b, this.c, this.d);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BackEventCompat{touchX=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", touchY=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", progress=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", swipeEdge=");
        return b.p(stringBuilder0, this.d, '}');
    }
}

