package c;

import android.content.res.AssetManager;
import com.kakao.kandinsky.core.filter.repository.FilterRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class a implements Factory {
    public final Provider a;

    public a(dagger.internal.Provider provider0) {
        this.a = provider0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        return new FilterRepository(((AssetManager)this.a.get()));
    }
}

