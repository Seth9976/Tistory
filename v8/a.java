package v8;

import com.google.firebase.heartbeatinfo.HeartBeatResult;
import java.util.List;

public final class a extends HeartBeatResult {
    public final String a;
    public final List b;

    public a(String s, List list0) {
        if(s == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = s;
        if(list0 == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof HeartBeatResult) {
            String s = ((HeartBeatResult)object0).getUserAgent();
            if(this.a.equals(s)) {
                List list0 = ((HeartBeatResult)object0).getUsedDates();
                return this.b.equals(list0);
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final List getUsedDates() {
        return this.b;
    }

    @Override  // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final String getUserAgent() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("HeartBeatResult{userAgent=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", usedDates=");
        return wb.a.e(stringBuilder0, this.b, "}");
    }
}

