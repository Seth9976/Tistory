package retrofit2;

public final class e implements Callback {
    public final int a;
    public final f b;

    public e(f f0, int v) {
        this.a = v;
        this.b = f0;
        super();
    }

    @Override  // retrofit2.Callback
    public final void onFailure(Call call0, Throwable throwable0) {
        if(this.a != 0) {
            this.b.completeExceptionally(throwable0);
            return;
        }
        this.b.completeExceptionally(throwable0);
    }

    @Override  // retrofit2.Callback
    public final void onResponse(Call call0, Response response0) {
        if(this.a != 0) {
            this.b.complete(response0);
            return;
        }
        f f0 = this.b;
        if(response0.isSuccessful()) {
            f0.complete(response0.body());
            return;
        }
        f0.completeExceptionally(new HttpException(response0));
    }
}

