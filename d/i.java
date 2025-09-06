package d;

import com.kakao.kandinsky.history.HistoryDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import e.g;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

public final class i implements Factory {
    public final h a;
    public final Provider b;

    public i(h h0, dagger.internal.Provider provider0) {
        this.a = h0;
        this.b = provider0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        HistoryDatabase historyDatabase0 = (HistoryDatabase)this.b.get();
        this.a.getClass();
        Intrinsics.checkNotNullParameter(historyDatabase0, "database");
        return (g)Preconditions.checkNotNullFromProvides(historyDatabase0.a());
    }
}

