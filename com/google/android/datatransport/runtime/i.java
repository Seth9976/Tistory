package com.google.android.datatransport.runtime;

import java.util.Map;

public final class i extends EventInternal {
    public final String a;
    public final Integer b;
    public final EncodedPayload c;
    public final long d;
    public final long e;
    public final Map f;

    public i(String s, Integer integer0, EncodedPayload encodedPayload0, long v, long v1, Map map0) {
        this.a = s;
        this.b = integer0;
        this.c = encodedPayload0;
        this.d = v;
        this.e = v1;
        this.f = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof EventInternal) {
            String s = ((EventInternal)object0).getTransportName();
            if(this.a.equals(s)) {
                Integer integer0 = this.b;
                if(integer0 != null) {
                    if(integer0.equals(((EventInternal)object0).getCode())) {
                    label_10:
                        EncodedPayload encodedPayload0 = ((EventInternal)object0).getEncodedPayload();
                        if(this.c.equals(encodedPayload0)) {
                            long v = ((EventInternal)object0).getEventMillis();
                            if(this.d == v) {
                                long v1 = ((EventInternal)object0).getUptimeMillis();
                                if(this.e == v1) {
                                    Map map0 = ((EventInternal)object0).getAutoMetadata();
                                    return this.f.equals(map0);
                                }
                            }
                        }
                    }
                }
                else if(((EventInternal)object0).getCode() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal
    public final Map getAutoMetadata() {
        return this.f;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal
    public final Integer getCode() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal
    public final EncodedPayload getEncodedPayload() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal
    public final long getEventMillis() {
        return this.d;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal
    public final String getTransportName() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.EventInternal
    public final long getUptimeMillis() {
        return this.e;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? ((((v ^ 1000003) * 0xD5009D89 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f.hashCode() : (((((v ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}

