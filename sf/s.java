package sf;

import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.NodeList;

public final class s implements Incomplete {
    public final boolean a;

    public s(boolean z) {
        this.a = z;
    }

    @Override  // kotlinx.coroutines.Incomplete
    public final NodeList getList() {
        return null;
    }

    @Override  // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public final String toString() {
        new StringBuilder("Empty{");
        return this.a ? "Empty{Active}" : "Empty{New}";
    }
}

