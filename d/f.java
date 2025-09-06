package d;

import android.content.ContentResolver;
import android.content.Context;
import com.kakao.kandinsky.bitmap.repository.BitmapRepository;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class f {
    public final b a;
    public final a b;
    public Provider c;
    public Provider d;
    public Provider e;
    public Provider f;
    public Provider g;

    public f(b b0, a a0, h h0) {
        this.a = b0;
        this.b = a0;
        this.a(b0, h0);
    }

    public final BitmapRepository a() {
        return new BitmapRepository(((Context)Preconditions.checkNotNullFromProvides(this.a.a)), ((ContentResolver)this.c.get()), this.b.a);
    }

    public final void a(b b0, h h0) {
        this.c = DoubleCheck.provider(new e(b0));
        this.d = DoubleCheck.provider(new d(b0));
        this.e = DoubleCheck.provider(new c.a(DoubleCheck.provider(new c(b0))));
        this.f = DoubleCheck.provider(new i(h0, DoubleCheck.provider(new j(h0))));
        this.g = DoubleCheck.provider(new k(h0, DoubleCheck.provider(new l(h0))));
    }
}

