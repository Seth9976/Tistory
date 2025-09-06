package coil.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import z5.e;
import z5.f;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil/util/Time;", "", "", "currentMillis", "()J", "", "setCurrentMillis", "(J)V", "reset", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Time {
    @NotNull
    public static final Time INSTANCE;
    public static Object a;

    static {
        Time.INSTANCE = new Time();  // 初始化器: Ljava/lang/Object;-><init>()V
        Time.a = e.a;
    }

    public final long currentMillis() {
        return ((Number)((Function0)Time.a).invoke()).longValue();
    }

    public final void reset() {
        Time.a = f.a;
    }

    public final void setCurrentMillis(long v) {
        Time.a = new n0.e(v, 3);
    }
}

