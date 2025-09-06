package retrofit2;

import java.lang.reflect.Method;
import java.util.Objects;
import okio.Buffer;

public final class z extends p0 {
    public final Method d;
    public final int e;
    public final String f;
    public final Converter g;
    public final boolean h;

    public z(Method method0, int v, String s, Converter converter0, boolean z) {
        this.d = method0;
        this.e = v;
        Objects.requireNonNull(s, "name == null");
        this.f = s;
        this.g = converter0;
        this.h = z;
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        String s2;
        String s = this.f;
        if(object0 == null) {
            throw p0.m(this.d, this.e, "Path parameter \"" + s + "\" value must not be null.", new Object[0]);
        }
        String s1 = (String)this.g.convert(object0);
        if(g00.c == null) {
            throw new AssertionError();
        }
        int v = s1.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = s1.codePointAt(v1);
            boolean z = this.h;
            if(v2 >= 0x20 && v2 < 0x7F && " \"<>^`{}|\\?#".indexOf(v2) == -1 && (z || v2 != 37 && v2 != 0x2F)) {
                v1 += Character.charCount(v2);
                continue;
            }
            Buffer buffer0 = new Buffer();
            buffer0.writeUtf8(s1, 0, v1);
            Buffer buffer1 = null;
            while(v1 < v) {
                int v3 = s1.codePointAt(v1);
                if(!z || v3 != 9 && v3 != 10 && v3 != 12 && v3 != 13) {
                    if(v3 < 0x20 || v3 >= 0x7F || " \"<>^`{}|\\?#".indexOf(v3) != -1 || !z && (v3 == 0x2F || v3 == 37)) {
                        if(buffer1 == null) {
                            buffer1 = new Buffer();
                        }
                        buffer1.writeUtf8CodePoint(v3);
                        while(!buffer1.exhausted()) {
                            int v4 = buffer1.readByte();
                            buffer0.writeByte(37);
                            buffer0.writeByte(((int)g0.l[(v4 & 0xFF) >> 4 & 15]));
                            buffer0.writeByte(((int)g0.l[v4 & 15]));
                        }
                    }
                    else {
                        buffer0.writeUtf8CodePoint(v3);
                    }
                }
                v1 += Character.charCount(v3);
            }
            s2 = "";
            goto label_35;
        }
        s2 = s1;
    label_35:
        String s3 = g00.c.replace("{" + s + "}", s2);
        if(g0.m.matcher(s3).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn\'t perform path traversal (\'.\' or \'..\'): " + s1);
        }
        g00.c = s3;
    }
}

