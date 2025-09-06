package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0015\u0018\u0000 \u001F2\u00020\u0001:\u0001\u001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J \u0010\t\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u000B¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001A\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u000FJ\u0015\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u000FJ\u0015\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001AR\u0011\u0010\u001C\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0011R\u0011\u0010\u001E\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0011¨\u0006 "}, d2 = {"Lokhttp3/internal/http2/Settings;", "", "<init>", "()V", "", "clear", "", "id", "value", "set", "(II)Lokhttp3/internal/http2/Settings;", "", "isSet", "(I)Z", "get", "(I)I", "size", "()I", "defaultValue", "getEnablePush", "(Z)Z", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "other", "merge", "(Lokhttp3/internal/http2/Settings;)V", "getHeaderTableSize", "headerTableSize", "getInitialWindowSize", "initialWindowSize", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Settings {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Settings$Companion;", "", "", "COUNT", "I", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int COUNT = 10;
    @NotNull
    public static final Companion Companion = null;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 0xFFFF;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    public int a;
    public final int[] b;

    static {
        Settings.Companion = new Companion(null);
    }

    public Settings() {
        this.b = new int[10];
    }

    public final void clear() {
        this.a = 0;
        ArraysKt___ArraysJvmKt.fill$default(this.b, 0, 0, 0, 6, null);
    }

    public final int get(int v) {
        return this.b[v];
    }

    public final boolean getEnablePush(boolean z) {
        return (this.a & 4) == 0 ? z : this.b[2] == 1;
    }

    public final int getHeaderTableSize() {
        return (this.a & 2) == 0 ? -1 : this.b[1];
    }

    public final int getInitialWindowSize() {
        return (this.a & 0x80) == 0 ? 0xFFFF : this.b[7];
    }

    public final int getMaxConcurrentStreams() {
        return (this.a & 16) == 0 ? 0x7FFFFFFF : this.b[4];
    }

    public final int getMaxFrameSize(int v) {
        return (this.a & 0x20) == 0 ? v : this.b[5];
    }

    public final int getMaxHeaderListSize(int v) {
        return (this.a & 0x40) == 0 ? v : this.b[6];
    }

    public final boolean isSet(int v) {
        return (1 << v & this.a) != 0;
    }

    public final void merge(@NotNull Settings settings0) {
        Intrinsics.checkNotNullParameter(settings0, "other");
        for(int v = 0; v < 10; ++v) {
            if(settings0.isSet(v)) {
                this.set(v, settings0.get(v));
            }
        }
    }

    @NotNull
    public final Settings set(int v, int v1) {
        if(v >= 0) {
            int[] arr_v = this.b;
            if(v < arr_v.length) {
                this.a |= 1 << v;
                arr_v[v] = v1;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.a);
    }
}

