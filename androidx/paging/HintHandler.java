package androidx.paging;

import aa.x;
import androidx.compose.foundation.text.selection.b1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001B\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0013\u001A\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/paging/HintHandler;", "", "<init>", "()V", "Landroidx/paging/LoadType;", "loadType", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/ViewportHint;", "hintFor", "(Landroidx/paging/LoadType;)Lkotlinx/coroutines/flow/Flow;", "viewportHint", "", "forceSetHint", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)V", "processHint", "(Landroidx/paging/ViewportHint;)V", "Landroidx/paging/ViewportHint$Access;", "getLastAccessHint", "()Landroidx/paging/ViewportHint$Access;", "lastAccessHint", "s4/d0", "androidx/paging/n", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HintHandler {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.APPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final n a;

    public HintHandler() {
        this.a = new n(this);
    }

    public final void forceSetHint(@NotNull LoadType loadType0, @NotNull ViewportHint viewportHint0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(viewportHint0, "viewportHint");
        if(loadType0 != LoadType.PREPEND && loadType0 != LoadType.APPEND) {
            throw new IllegalArgumentException(("invalid load type for reset: " + loadType0).toString());
        }
        x x0 = new x(27, loadType0, viewportHint0);
        this.a.a(null, x0);
    }

    @Nullable
    public final Access getLastAccessHint() {
        return this.a.c;
    }

    @NotNull
    public final Flow hintFor(@NotNull LoadType loadType0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        n n0 = this.a;
        switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
            case 1: {
                return n0.a.b;
            }
            case 2: {
                return n0.b.b;
            }
            default: {
                throw new IllegalArgumentException("invalid load type for hints");
            }
        }
    }

    public final void processHint(@NotNull ViewportHint viewportHint0) {
        Intrinsics.checkNotNullParameter(viewportHint0, "viewportHint");
        b1 b10 = new b1(viewportHint0, 15);
        this.a.a((viewportHint0 instanceof Access ? ((Access)viewportHint0) : null), b10);
    }
}

