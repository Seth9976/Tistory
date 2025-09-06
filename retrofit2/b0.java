package retrofit2;

import okhttp3.MultipartBody.Part;

public final class b0 extends p0 {
    public static final b0 d;

    static {
        b0.d = new b0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        if(((Part)object0) != null) {
            g00.i.addPart(((Part)object0));
        }
    }
}

