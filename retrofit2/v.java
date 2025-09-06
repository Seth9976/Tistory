package retrofit2;

import java.util.Objects;
import okhttp3.FormBody.Builder;

public final class v extends p0 {
    public final int d;
    public final String e;
    public final Converter f;
    public final boolean g;

    public v(String s, Converter converter0, boolean z, int v) {
        this.d = v;
        switch(v) {
            case 1: {
                super();
                Objects.requireNonNull(s, "name == null");
                this.e = s;
                this.f = converter0;
                this.g = z;
                return;
            }
            case 2: {
                super();
                Objects.requireNonNull(s, "name == null");
                this.e = s;
                this.f = converter0;
                this.g = z;
                return;
            }
            default: {
                super();
                Objects.requireNonNull(s, "name == null");
                this.e = s;
                this.f = converter0;
                this.g = z;
            }
        }
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        switch(this.d) {
            case 0: {
                if(object0 != null) {
                    String s1 = (String)this.f.convert(object0);
                    if(s1 != null) {
                        Builder formBody$Builder0 = g00.j;
                        String s2 = this.e;
                        if(this.g) {
                            formBody$Builder0.addEncoded(s2, s1);
                            return;
                        }
                        formBody$Builder0.add(s2, s1);
                    }
                }
                return;
            }
            case 1: {
                if(object0 != null) {
                    String s3 = (String)this.f.convert(object0);
                    if(s3 != null) {
                        g00.a(this.e, s3, this.g);
                    }
                }
                return;
            }
            default: {
                if(object0 != null) {
                    String s = (String)this.f.convert(object0);
                    if(s != null) {
                        g00.b(this.e, s, this.g);
                    }
                }
            }
        }
    }
}

