package androidx.compose.ui.input.rotary;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001A\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "", "verticalScrollPixels", "horizontalScrollPixels", "", "uptimeMillis", "", "inputDeviceId", "<init>", "(FFJI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getVerticalScrollPixels", "()F", "b", "getHorizontalScrollPixels", "c", "J", "getUptimeMillis", "()J", "d", "I", "getInputDeviceId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRotaryScrollEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.android.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class RotaryScrollEvent {
    public static final int $stable;
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public RotaryScrollEvent(float f, float f1, long v, int v1) {
        this.a = f;
        this.b = f1;
        this.c = v;
        this.d = v1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof RotaryScrollEvent && ((RotaryScrollEvent)object0).a == this.a && ((RotaryScrollEvent)object0).b == this.b && ((RotaryScrollEvent)object0).c == this.c && ((RotaryScrollEvent)object0).d == this.d;
    }

    public final float getHorizontalScrollPixels() {
        return this.b;
    }

    public final int getInputDeviceId() {
        return this.d;
    }

    public final long getUptimeMillis() {
        return this.c;
    }

    public final float getVerticalScrollPixels() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.d + a.k(this.c, r0.a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(",horizontalScrollPixels=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(",uptimeMillis=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(",deviceId=");
        return b.p(stringBuilder0, this.d, ')');
    }
}

