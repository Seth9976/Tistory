package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;

public final class StructuralMessageInfo.Builder {
    public final ArrayList a;
    public ProtoSyntax b;
    public boolean c;
    public boolean d;
    public int[] e;
    public Object f;

    public StructuralMessageInfo.Builder() {
        this.e = null;
        this.a = new ArrayList();
    }

    public StructuralMessageInfo.Builder(int v) {
        this.e = null;
        this.a = new ArrayList(v);
    }

    public p3 build() {
        if(this.c) {
            throw new IllegalStateException("Builder can only build once");
        }
        if(this.b == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.c = true;
        Collections.sort(this.a);
        return new p3(this.b, this.d, this.e, ((a1[])this.a.toArray(new a1[0])), this.f);
    }

    public void withCheckInitialized(int[] arr_v) {
        this.e = arr_v;
    }

    public void withDefaultInstance(Object object0) {
        this.f = object0;
    }

    public void withField(a1 a10) {
        if(this.c) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.a.add(a10);
    }

    public void withMessageSetWireFormat(boolean z) {
        this.d = z;
    }

    public void withSyntax(ProtoSyntax protoSyntax0) {
        Internal.a(protoSyntax0, "syntax");
        this.b = protoSyntax0;
    }
}

