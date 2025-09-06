package s6;

import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

public final class g extends LogEvent {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final NetworkConnectionInfo g;

    public g(long v, Integer integer0, long v1, byte[] arr_b, String s, long v2, NetworkConnectionInfo networkConnectionInfo0) {
        this.a = v;
        this.b = integer0;
        this.c = v1;
        this.d = arr_b;
        this.e = s;
        this.f = v2;
        this.g = networkConnectionInfo0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof LogEvent) {
            long v = ((LogEvent)object0).getEventTimeMs();
            if(this.a == v) {
                Integer integer0 = this.b;
                if(integer0 != null) {
                    if(integer0.equals(((LogEvent)object0).getEventCode())) {
                    label_10:
                        long v1 = ((LogEvent)object0).getEventUptimeMs();
                        if(this.c == v1) {
                            byte[] arr_b = ((LogEvent)object0) instanceof g ? ((g)(((LogEvent)object0))).d : ((LogEvent)object0).getSourceExtension();
                            if(Arrays.equals(this.d, arr_b)) {
                                String s = this.e;
                                if(s != null) {
                                    if(s.equals(((LogEvent)object0).getSourceExtensionJsonProto3())) {
                                    label_19:
                                        long v2 = ((LogEvent)object0).getTimezoneOffsetSeconds();
                                        if(this.f == v2) {
                                            return this.g == null ? ((LogEvent)object0).getNetworkConnectionInfo() == null : this.g.equals(((LogEvent)object0).getNetworkConnectionInfo());
                                        }
                                    }
                                }
                                else if(((LogEvent)object0).getSourceExtensionJsonProto3() == null) {
                                    goto label_19;
                                }
                            }
                        }
                    }
                }
                else if(((LogEvent)object0).getEventCode() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent
    public final Integer getEventCode() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent
    public final long getEventTimeMs() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent
    public final long getEventUptimeMs() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent
    public final NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.g;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent
    public final byte[] getSourceExtension() {
        return this.d;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent
    public final String getSourceExtensionJsonProto3() {
        return this.e;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogEvent
    public final long getTimezoneOffsetSeconds() {
        return this.f;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = Arrays.hashCode(this.d);
        int v2 = ((((((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ (this.b == null ? 0 : this.b.hashCode())) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ v1) * 1000003 ^ (this.e == null ? 0 : this.e.hashCode())) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo0 = this.g;
        if(networkConnectionInfo0 != null) {
            v = networkConnectionInfo0.hashCode();
        }
        return v2 ^ v;
    }

    @Override
    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}

