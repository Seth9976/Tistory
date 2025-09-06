package n;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;

public final class a implements Executor {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        switch(this.a) {
            case 0: {
                ArchTaskExecutor.getInstance().postToMainThread(runnable0);
                return;
            }
            case 1: {
                ArchTaskExecutor.getInstance().executeOnDiskIO(runnable0);
                return;
            }
            default: {
                runnable0.run();
            }
        }
    }
}

