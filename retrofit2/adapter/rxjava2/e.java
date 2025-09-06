package retrofit2.adapter.rxjava2;

import io.reactivex.disposables.Disposable;
import retrofit2.Call;

public final class e implements Disposable {
    public final Call a;
    public volatile boolean b;

    public e(Call call0) {
        this.a = call0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.b = true;
        this.a.cancel();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.b;
    }
}

