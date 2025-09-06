package com.google.android.datatransport.runtime;

import androidx.compose.ui.text.n0;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

public final class v implements Transport {
    public final TransportContext a;
    public final String b;
    public final Encoding c;
    public final Transformer d;
    public final TransportRuntime e;

    public v(TransportContext transportContext0, String s, Encoding encoding0, Transformer transformer0, TransportRuntime transportRuntime0) {
        this.a = transportContext0;
        this.b = s;
        this.c = encoding0;
        this.d = transformer0;
        this.e = transportRuntime0;
    }

    @Override  // com.google.android.datatransport.Transport
    public final void schedule(Event event0, TransportScheduleCallback transportScheduleCallback0) {
        j j0 = new j();  // 初始化器: Lcom/google/android/datatransport/runtime/SendRequest$Builder;-><init>()V
        j0.setTransportContext(this.a);
        j0.b(event0);
        j0.setTransportName(this.b);
        j0.c(this.d);
        j0.a(this.c);
        t t0 = j0.build();
        this.e.send(t0, transportScheduleCallback0);
    }

    @Override  // com.google.android.datatransport.Transport
    public final void send(Event event0) {
        this.schedule(event0, new n0(12));
    }
}

