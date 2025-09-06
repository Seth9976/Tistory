package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/SingleLineCodepointTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "", "codepointIndex", "codepoint", "transform", "(II)I", "", "toString", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SingleLineCodepointTransformation implements CodepointTransformation {
    public static final int $stable;
    @NotNull
    public static final SingleLineCodepointTransformation INSTANCE;

    static {
        SingleLineCodepointTransformation.INSTANCE = new SingleLineCodepointTransformation();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    @NotNull
    public String toString() {
        return "SingleLineCodepointTransformation";
    }

    // 检测为 Lambda 实现
    @Override  // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public int transform(int v, int v1) [...]
}

