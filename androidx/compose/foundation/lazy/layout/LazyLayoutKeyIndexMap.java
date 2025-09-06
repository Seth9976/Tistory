package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0001H&J\u0012\u0010\u0005\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "", "getIndex", "", "key", "getKey", "index", "Empty", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyLayoutKeyIndexMap {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap$Empty;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "", "key", "", "getIndex", "(Ljava/lang/Object;)I", "index", "", "getKey", "(I)Ljava/lang/Void;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Empty implements LazyLayoutKeyIndexMap {
        public static final Empty a;

        static {
            Empty.a = new Empty();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public int getIndex(@NotNull Object object0) {
            return -1;
        }

        @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public Object getKey(int v) {
            return null;
        }

        @Nullable
        public Void getKey(int v) [...] // Inlined contents
    }

    @NotNull
    public static final Empty Empty;

    static {
        LazyLayoutKeyIndexMap.Empty = Empty.a;
    }

    int getIndex(@NotNull Object arg1);

    @Nullable
    Object getKey(int arg1);
}

