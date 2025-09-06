package dev.chrisbanes.snapper;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import vc.c;

@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001R)\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR)\u0010\r\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0007\u001A\u0004\b\f\u0010\tR)\u0010\u0010\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0007\u001A\u0004\b\u000F\u0010\t¨\u0006\u0011"}, d2 = {"Ldev/chrisbanes/snapper/SnapOffsets;", "", "Lkotlin/Function2;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "", "a", "Lkotlin/jvm/functions/Function2;", "getStart", "()Lkotlin/jvm/functions/Function2;", "Start", "b", "getCenter", "Center", "c", "getEnd", "End", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SnapOffsets {
    public static final int $stable;
    @NotNull
    public static final SnapOffsets INSTANCE;
    public static final c a;
    public static final c b;
    public static final c c;

    static {
        SnapOffsets.INSTANCE = new SnapOffsets();  // 初始化器: Ljava/lang/Object;-><init>()V
        SnapOffsets.a = c.z;
        SnapOffsets.b = c.x;
        SnapOffsets.c = c.y;
    }

    @NotNull
    public final Function2 getCenter() {
        return SnapOffsets.b;
    }

    @NotNull
    public final Function2 getEnd() {
        return SnapOffsets.c;
    }

    @NotNull
    public final Function2 getStart() {
        return SnapOffsets.a;
    }
}

