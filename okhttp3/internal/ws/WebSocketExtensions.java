package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.o;
import kotlin.text.p;
import okhttp3.Headers;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CBE\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0003\u0012\b\b\u0002\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000EJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000EJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003JN\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001A\u00020\u00032\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\u000E\u0010\u0018\u001A\u00020\u00032\u0006\u0010\u0019\u001A\u00020\u0003J\t\u0010\u001A\u001A\u00020\u001BHÖ\u0001R\u0014\u0010\u0004\u001A\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000BR\u0010\u0010\u0006\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001A\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000BR\u0010\u0010\b\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001D"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WebSocketExtensions {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "Lokhttp3/Headers;", "responseHeaders", "Lokhttp3/internal/ws/WebSocketExtensions;", "parse", "(Lokhttp3/Headers;)Lokhttp3/internal/ws/WebSocketExtensions;", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final WebSocketExtensions parse(@NotNull Headers headers0) throws IOException {
            Intrinsics.checkNotNullParameter(headers0, "responseHeaders");
            int v = headers0.size();
            int v1 = 0;
            boolean z = false;
            Integer integer0 = null;
            boolean z1 = false;
            Integer integer1 = null;
            boolean z2 = false;
            boolean z3 = false;
            while(v1 < v) {
                if(p.equals(headers0.name(v1), "Sec-WebSocket-Extensions", true)) {
                    String s = headers0.value(v1);
                    int v2 = 0;
                    while(v2 < s.length()) {
                        int v3 = Util.delimiterOffset$default(s, ',', v2, 0, 4, null);
                        int v4 = Util.delimiterOffset(s, ';', v2, v3);
                        int v5 = v4 + 1;
                        if(p.equals(Util.trimSubstring(s, v2, v4), "permessage-deflate", true)) {
                            if(z) {
                                z3 = true;
                            }
                            v2 = v5;
                            while(v2 < v3) {
                                int v6 = Util.delimiterOffset(s, ';', v2, v3);
                                int v7 = Util.delimiterOffset(s, '=', v2, v6);
                                String s1 = Util.trimSubstring(s, v2, v7);
                                String s2 = v7 >= v6 ? null : StringsKt__StringsKt.removeSurrounding(Util.trimSubstring(s, v7 + 1, v6), "\"");
                                v2 = v6 + 1;
                                if(p.equals(s1, "client_max_window_bits", true)) {
                                    if(integer0 != null) {
                                        z3 = true;
                                    }
                                    integer0 = s2 == null ? null : o.toIntOrNull(s2);
                                    if(integer0 != null) {
                                        continue;
                                    }
                                }
                                else if(p.equals(s1, "client_no_context_takeover", true)) {
                                    if(z1) {
                                        z3 = true;
                                    }
                                    if(s2 != null) {
                                        z3 = true;
                                    }
                                    z1 = true;
                                    continue;
                                }
                                else if(p.equals(s1, "server_max_window_bits", true)) {
                                    if(integer1 != null) {
                                        z3 = true;
                                    }
                                    integer1 = s2 == null ? null : o.toIntOrNull(s2);
                                    if(integer1 != null) {
                                        continue;
                                    }
                                }
                                else if(p.equals(s1, "server_no_context_takeover", true)) {
                                    if(z2) {
                                        z3 = true;
                                    }
                                    if(s2 != null) {
                                        z3 = true;
                                    }
                                    z2 = true;
                                    continue;
                                }
                                z3 = true;
                            }
                            z = true;
                        }
                        else {
                            v2 = v5;
                            z3 = true;
                        }
                    }
                }
                ++v1;
            }
            return new WebSocketExtensions(z, integer0, z1, integer1, z2, z3);
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @Nullable
    public final Integer clientMaxWindowBits;
    @JvmField
    public final boolean clientNoContextTakeover;
    @JvmField
    public final boolean perMessageDeflate;
    @JvmField
    @Nullable
    public final Integer serverMaxWindowBits;
    @JvmField
    public final boolean serverNoContextTakeover;
    @JvmField
    public final boolean unknownValues;

    static {
        WebSocketExtensions.Companion = new Companion(null);
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 0x3F, null);
    }

    public WebSocketExtensions(boolean z, @Nullable Integer integer0, boolean z1, @Nullable Integer integer1, boolean z2, boolean z3) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = integer0;
        this.clientNoContextTakeover = z1;
        this.serverMaxWindowBits = integer1;
        this.serverNoContextTakeover = z2;
        this.unknownValues = z3;
    }

    public WebSocketExtensions(boolean z, Integer integer0, boolean z1, Integer integer1, boolean z2, boolean z3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? integer0 : null), ((v & 4) == 0 ? z1 : false), ((v & 8) == 0 ? integer1 : null), ((v & 16) == 0 ? z2 : false), ((v & 0x20) == 0 ? z3 : false));
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    @Nullable
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    @Nullable
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    @NotNull
    public final WebSocketExtensions copy(boolean z, @Nullable Integer integer0, boolean z1, @Nullable Integer integer1, boolean z2, boolean z3) {
        return new WebSocketExtensions(z, integer0, z1, integer1, z2, z3);
    }

    public static WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions0, boolean z, Integer integer0, boolean z1, Integer integer1, boolean z2, boolean z3, int v, Object object0) {
        if((v & 1) != 0) {
            z = webSocketExtensions0.perMessageDeflate;
        }
        if((v & 2) != 0) {
            integer0 = webSocketExtensions0.clientMaxWindowBits;
        }
        if((v & 4) != 0) {
            z1 = webSocketExtensions0.clientNoContextTakeover;
        }
        if((v & 8) != 0) {
            integer1 = webSocketExtensions0.serverMaxWindowBits;
        }
        if((v & 16) != 0) {
            z2 = webSocketExtensions0.serverNoContextTakeover;
        }
        if((v & 0x20) != 0) {
            z3 = webSocketExtensions0.unknownValues;
        }
        return webSocketExtensions0.copy(z, integer0, z1, integer1, z2, z3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WebSocketExtensions)) {
            return false;
        }
        if(this.perMessageDeflate != ((WebSocketExtensions)object0).perMessageDeflate) {
            return false;
        }
        if(!Intrinsics.areEqual(this.clientMaxWindowBits, ((WebSocketExtensions)object0).clientMaxWindowBits)) {
            return false;
        }
        if(this.clientNoContextTakeover != ((WebSocketExtensions)object0).clientNoContextTakeover) {
            return false;
        }
        if(!Intrinsics.areEqual(this.serverMaxWindowBits, ((WebSocketExtensions)object0).serverMaxWindowBits)) {
            return false;
        }
        return this.serverNoContextTakeover == ((WebSocketExtensions)object0).serverNoContextTakeover ? this.unknownValues == ((WebSocketExtensions)object0).unknownValues : false;
    }

    @Override
    public int hashCode() {
        int v = this.perMessageDeflate;
        int v1 = 1;
        if(v) {
            v = 1;
        }
        int v2 = 0;
        int v3 = this.clientMaxWindowBits == null ? 0 : this.clientMaxWindowBits.hashCode();
        int v4 = this.clientNoContextTakeover;
        if(v4) {
            v4 = 1;
        }
        Integer integer0 = this.serverMaxWindowBits;
        if(integer0 != null) {
            v2 = integer0.hashCode();
        }
        int v5 = this.serverNoContextTakeover;
        if(v5) {
            v5 = 1;
        }
        if(!this.unknownValues) {
            v1 = false;
        }
        return ((((v * 0x1F + v3) * 0x1F + v4) * 0x1F + v2) * 0x1F + v5) * 0x1F + v1;
    }

    // 去混淆评级： 低(20)
    public final boolean noContextTakeover(boolean z) {
        return z ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        stringBuilder0.append(this.perMessageDeflate);
        stringBuilder0.append(", clientMaxWindowBits=");
        stringBuilder0.append(this.clientMaxWindowBits);
        stringBuilder0.append(", clientNoContextTakeover=");
        stringBuilder0.append(this.clientNoContextTakeover);
        stringBuilder0.append(", serverMaxWindowBits=");
        stringBuilder0.append(this.serverMaxWindowBits);
        stringBuilder0.append(", serverNoContextTakeover=");
        stringBuilder0.append(this.serverNoContextTakeover);
        stringBuilder0.append(", unknownValues=");
        return a.p(stringBuilder0, this.unknownValues, ')');
    }
}

