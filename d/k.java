package d;

import com.kakao.kandinsky.signature.database.SignatureDao;
import com.kakao.kandinsky.signature.database.SignatureDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

public final class k implements Factory {
    public final h a;
    public final Provider b;

    public k(h h0, dagger.internal.Provider provider0) {
        this.a = h0;
        this.b = provider0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        SignatureDatabase signatureDatabase0 = (SignatureDatabase)this.b.get();
        this.a.getClass();
        Intrinsics.checkNotNullParameter(signatureDatabase0, "database");
        return (SignatureDao)Preconditions.checkNotNullFromProvides(signatureDatabase0.signatureDao());
    }
}

