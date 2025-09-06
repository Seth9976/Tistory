package v8;

import com.google.firebase.heartbeatinfo.SdkHeartBeatResult;

public final class b extends SdkHeartBeatResult {
    public final String a;
    public final long b;

    public b(String s, long v) {
        if(s == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof SdkHeartBeatResult) {
            String s = ((SdkHeartBeatResult)object0).getSdkName();
            if(this.a.equals(s)) {
                long v = ((SdkHeartBeatResult)object0).getMillis();
                return this.b == v;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public final long getMillis() {
        return this.b;
    }

    @Override  // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public final String getSdkName() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SdkHeartBeatResult{sdkName=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", millis=");
        return a5.b.g(this.b, "}", stringBuilder0);
    }
}

