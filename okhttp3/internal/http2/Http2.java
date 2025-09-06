package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import okhttp3.internal.Util;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u00C6\u0002\u0018\u00002\u00020\u0001J5\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u000F\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0012\u001A\u00020\u00118\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001A\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0015R\u0014\u0010\u001B\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u0015R\u0014\u0010\u001C\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u0015R\u0014\u0010\u001D\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u0015R\u0014\u0010\u001E\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u0015R\u0014\u0010\u001F\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u0015R\u0014\u0010 \u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010$\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010%\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b%\u0010\u0015R\u0014\u0010&\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b&\u0010\u0015R\u0014\u0010\'\u001A\u00020\u00048\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\'\u0010\u0015\u00A8\u0006("}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "frameLog", "(ZIIII)Ljava/lang/String;", "formattedType$okhttp", "(I)Ljava/lang/String;", "formattedType", "formatFlags", "(II)Ljava/lang/String;", "Lokio/ByteString;", "CONNECTION_PREFACE", "Lokio/ByteString;", "INITIAL_MAX_FRAME_SIZE", "I", "TYPE_DATA", "TYPE_HEADERS", "TYPE_PRIORITY", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_PUSH_PROMISE", "TYPE_PING", "TYPE_GOAWAY", "TYPE_WINDOW_UPDATE", "TYPE_CONTINUATION", "FLAG_NONE", "FLAG_ACK", "FLAG_END_STREAM", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_PADDED", "FLAG_PRIORITY", "FLAG_COMPRESSED", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Http2 {
    @JvmField
    @NotNull
    public static final ByteString CONNECTION_PREFACE = null;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 0x20;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 0x20;
    public static final int INITIAL_MAX_FRAME_SIZE = 0x4000;
    @NotNull
    public static final Http2 INSTANCE = null;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;

    static {
        Http2.INSTANCE = new Http2();  // 初始化器: Ljava/lang/Object;-><init>()V
        Http2.CONNECTION_PREFACE = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        Http2.a = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        Http2.b = new String[0x40];
        String[] arr_s = new String[0x100];
        for(int v1 = 0; v1 < 0x100; ++v1) {
            String s = Integer.toBinaryString(v1);
            Intrinsics.checkNotNullExpressionValue(s, "toBinaryString(it)");
            arr_s[v1] = p.replace$default(Util.format("%8s", new Object[]{s}), ' ', '0', false, 4, null);
        }
        Http2.c = arr_s;
        Http2.b[0] = "";
        Http2.b[1] = "END_STREAM";
        Http2.b[8] = "PADDED";
        Http2.b[9] = "null|PADDED";
        Http2.b[4] = "END_HEADERS";
        Http2.b[0x20] = "PRIORITY";
        Http2.b[36] = "END_HEADERS|PRIORITY";
        for(int v2 = 0; v2 < 3; ++v2) {
            int v3 = new int[]{4, 0x20, 36}[v2];
            Http2.b[1 | v3] = Http2.b[1] + '|' + Http2.b[v3];
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(Http2.b[1]);
            stringBuilder0.append('|');
            Http2.b[1 | v3 | 8] = a.o(stringBuilder0, Http2.b[v3], "|PADDED");
        }
        for(int v = 0; v < Http2.b.length; ++v) {
            String[] arr_s1 = Http2.b;
            if(arr_s1[v] == null) {
                arr_s1[v] = Http2.c[v];
            }
        }
    }

    @NotNull
    public final String formatFlags(int v, int v1) {
        String s;
        if(v1 == 0) {
            return "";
        }
        String[] arr_s = Http2.c;
        switch(v) {
            case 4: 
            case 6: {
                return v1 == 1 ? "ACK" : arr_s[v1];
            }
            case 2: 
            case 3: 
            case 7: 
            case 8: {
                return arr_s[v1];
            }
            default: {
                String[] arr_s1 = Http2.b;
                if(v1 < arr_s1.length) {
                    s = arr_s1[v1];
                    Intrinsics.checkNotNull(s);
                }
                else {
                    s = arr_s[v1];
                }
                if(v == 5 && (v1 & 4) != 0) {
                    return p.replace$default(s, "HEADERS", "PUSH_PROMISE", false, 4, null);
                }
                return v != 0 || (v1 & 0x20) == 0 ? s : p.replace$default(s, "PRIORITY", "COMPRESSED", false, 4, null);
            }
        }
    }

    @NotNull
    public final String formattedType$okhttp(int v) {
        return v >= Http2.a.length ? Util.format("0x%02x", new Object[]{v}) : Http2.a[v];
    }

    @NotNull
    public final String frameLog(boolean z, int v, int v1, int v2, int v3) {
        String s = this.formattedType$okhttp(v2);
        String s1 = this.formatFlags(v2, v3);
        return z ? Util.format("%s 0x%08x %5d %-13s %s", new Object[]{"<<", v, v1, s, s1}) : Util.format("%s 0x%08x %5d %-13s %s", new Object[]{">>", v, v1, s, s1});
    }
}

