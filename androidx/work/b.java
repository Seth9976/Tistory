package androidx.work;

public final class b implements Runnable {
    public final Worker a;

    public b(Worker worker0) {
        this.a = worker0;
    }

    @Override
    public final void run() {
        Worker worker0;
        try {
            worker0 = this.a;
            Result listenableWorker$Result0 = worker0.doWork();
            worker0.e.set(listenableWorker$Result0);
        }
        catch(Throwable throwable0) {
            worker0.e.setException(throwable0);
        }
    }
}

