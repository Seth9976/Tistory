package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/NoOpInputMergerFactory;", "Landroidx/work/InputMergerFactory;", "", "className", "", "createInputMerger", "(Ljava/lang/String;)Ljava/lang/Void;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NoOpInputMergerFactory extends InputMergerFactory {
    @NotNull
    public static final NoOpInputMergerFactory INSTANCE;

    static {
        NoOpInputMergerFactory.INSTANCE = new NoOpInputMergerFactory();  // 初始化器: Landroidx/work/InputMergerFactory;-><init>()V
    }

    @Override  // androidx.work.InputMergerFactory
    public InputMerger createInputMerger(String s) {
        return (InputMerger)this.createInputMerger(s);
    }

    @Nullable
    public Void createInputMerger(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "className");
        return null;
    }
}

