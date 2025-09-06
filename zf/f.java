package zf;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

public final class f {
    public final LockFreeLinkedListNode a;

    public f(LockFreeLinkedListNode lockFreeLinkedListNode0) {
        this.a = lockFreeLinkedListNode0;
    }

    @Override
    public final String toString() {
        return "Removed[" + this.a + ']';
    }
}

