package ag;

import kotlinx.coroutines.scheduling.TaskContext;

public final class b implements TaskContext {
    public final int a;

    public b(int v) {
        this.a = v;
    }

    @Override  // kotlinx.coroutines.scheduling.TaskContext
    public final void afterTask() {
    }

    @Override  // kotlinx.coroutines.scheduling.TaskContext
    public final int getTaskMode() {
        return this.a;
    }
}

