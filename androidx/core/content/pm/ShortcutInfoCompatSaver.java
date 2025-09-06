package androidx.core.content.pm;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public abstract class ShortcutInfoCompatSaver {
    @RestrictTo({Scope.LIBRARY})
    public static class NoopImpl extends ShortcutInfoCompatSaver {
        @Override  // androidx.core.content.pm.ShortcutInfoCompatSaver
        public Object addShortcuts(List list0) {
            return null;
        }

        public Void addShortcuts(List list0) [...] // Inlined contents

        @Override  // androidx.core.content.pm.ShortcutInfoCompatSaver
        public Object removeAllShortcuts() {
            return null;
        }

        public Void removeAllShortcuts() [...] // Inlined contents

        @Override  // androidx.core.content.pm.ShortcutInfoCompatSaver
        public Object removeShortcuts(List list0) {
            return null;
        }

        public Void removeShortcuts(List list0) [...] // Inlined contents
    }

    @AnyThread
    public abstract Object addShortcuts(List arg1);

    @WorkerThread
    public List getShortcuts() throws Exception {
        return new ArrayList();
    }

    @AnyThread
    public abstract Object removeAllShortcuts();

    @AnyThread
    public abstract Object removeShortcuts(List arg1);
}

