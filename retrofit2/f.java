package retrofit2;

import java.util.concurrent.CompletableFuture;

public final class f extends CompletableFuture {
    public final Call a;

    public f(Call call0) {
        this.a = call0;
    }

    @Override
    public final boolean cancel(boolean z) {
        if(z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}

