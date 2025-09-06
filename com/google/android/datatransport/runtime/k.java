package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;

public final class k extends t {
    public final TransportContext a;
    public final String b;
    public final Event c;
    public final Transformer d;
    public final Encoding e;

    public k(TransportContext transportContext0, String s, Event event0, Transformer transformer0, Encoding encoding0) {
        this.a = transportContext0;
        this.b = s;
        this.c = event0;
        this.d = transformer0;
        this.e = encoding0;
    }

    // 去混淆评级： 中等(70)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof t && (this.a.equals(((k)(((t)object0))).a) && this.b.equals(((k)(((t)object0))).b) && this.c.equals(((k)(((t)object0))).c) && this.d.equals(((k)(((t)object0))).d) && this.e.equals(((k)(((t)object0))).e));
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}

