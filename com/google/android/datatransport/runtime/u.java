package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

public final class u implements TransportFactory {
    public final Set a;
    public final TransportContext b;
    public final TransportRuntime c;

    public u(Set set0, TransportContext transportContext0, TransportRuntime transportRuntime0) {
        this.a = set0;
        this.b = transportContext0;
        this.c = transportRuntime0;
    }

    @Override  // com.google.android.datatransport.TransportFactory
    public final Transport getTransport(String s, Class class0, Encoding encoding0, Transformer transformer0) {
        Set set0 = this.a;
        if(!set0.contains(encoding0)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding0, set0));
        }
        return new v(this.b, s, encoding0, transformer0, this.c);
    }

    @Override  // com.google.android.datatransport.TransportFactory
    public final Transport getTransport(String s, Class class0, Transformer transformer0) {
        return this.getTransport(s, class0, Encoding.of("proto"), transformer0);
    }
}

