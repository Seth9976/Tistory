package s6;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

public final class h extends LogRequest {
    public final long a;
    public final long b;
    public final ClientInfo c;
    public final Integer d;
    public final String e;
    public final List f;
    public final QosTier g;

    public h(long v, long v1, ClientInfo clientInfo0, Integer integer0, String s, List list0, QosTier qosTier0) {
        this.a = v;
        this.b = v1;
        this.c = clientInfo0;
        this.d = integer0;
        this.e = s;
        this.f = list0;
        this.g = qosTier0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof LogRequest) {
            long v = ((LogRequest)object0).getRequestTimeMs();
            if(this.a == v) {
                long v1 = ((LogRequest)object0).getRequestUptimeMs();
                if(this.b == v1) {
                    ClientInfo clientInfo0 = this.c;
                    if(clientInfo0 != null) {
                        if(clientInfo0.equals(((LogRequest)object0).getClientInfo())) {
                        label_12:
                            Integer integer0 = this.d;
                            if(integer0 != null) {
                                if(integer0.equals(((LogRequest)object0).getLogSource())) {
                                label_17:
                                    String s = this.e;
                                    if(s != null) {
                                        if(s.equals(((LogRequest)object0).getLogSourceName())) {
                                        label_22:
                                            List list0 = this.f;
                                            if(list0 == null) {
                                                if(((LogRequest)object0).getLogEvents() == null) {
                                                    return this.g == null ? ((LogRequest)object0).getQosTier() == null : this.g.equals(((LogRequest)object0).getQosTier());
                                                }
                                            }
                                            else if(list0.equals(((LogRequest)object0).getLogEvents())) {
                                                return this.g == null ? ((LogRequest)object0).getQosTier() == null : this.g.equals(((LogRequest)object0).getQosTier());
                                            }
                                        }
                                    }
                                    else if(((LogRequest)object0).getLogSourceName() == null) {
                                        goto label_22;
                                    }
                                }
                            }
                            else if(((LogRequest)object0).getLogSource() == null) {
                                goto label_17;
                            }
                        }
                    }
                    else if(((LogRequest)object0).getClientInfo() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest
    public final ClientInfo getClientInfo() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest
    public final List getLogEvents() {
        return this.f;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest
    public final Integer getLogSource() {
        return this.d;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest
    public final String getLogSourceName() {
        return this.e;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest
    public final QosTier getQosTier() {
        return this.g;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest
    public final long getRequestTimeMs() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.cct.internal.LogRequest
    public final long getRequestUptimeMs() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003;
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = this.e == null ? 0 : this.e.hashCode();
        int v5 = this.f == null ? 0 : this.f.hashCode();
        QosTier qosTier0 = this.g;
        if(qosTier0 != null) {
            v1 = qosTier0.hashCode();
        }
        return ((((v ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}

