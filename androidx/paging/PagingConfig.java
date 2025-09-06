package androidx.paging;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BBA\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001A\u00020\u0003\u0012\b\b\u0003\u0010\b\u001A\u00020\u0003\u0012\b\b\u0002\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nR\u0010\u0010\u0005\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/paging/PagingConfig;", "", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSize", "maxSize", "jumpThreshold", "(IIZIII)V", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PagingConfig {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/paging/PagingConfig$Companion;", "", "", "MAX_SIZE_UNBOUNDED", "I", "getMAX_SIZE_UNBOUNDED$annotations", "()V", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void getMAX_SIZE_UNBOUNDED$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
    public static final int MAX_SIZE_UNBOUNDED = 0x7FFFFFFF;
    @JvmField
    public final boolean enablePlaceholders;
    @JvmField
    public final int initialLoadSize;
    @JvmField
    public final int jumpThreshold;
    @JvmField
    public final int maxSize;
    @JvmField
    public final int pageSize;
    @JvmField
    public final int prefetchDistance;

    static {
        PagingConfig.Companion = new Companion(null);
    }

    @JvmOverloads
    public PagingConfig(int v) {
        this(v, 0, false, 0, 0, 0, 62, null);
    }

    @JvmOverloads
    public PagingConfig(int v, @IntRange(from = 0L) int v1) {
        this(v, v1, false, 0, 0, 0, 60, null);
    }

    @JvmOverloads
    public PagingConfig(int v, @IntRange(from = 0L) int v1, boolean z) {
        this(v, v1, z, 0, 0, 0, 56, null);
    }

    @JvmOverloads
    public PagingConfig(int v, @IntRange(from = 0L) int v1, boolean z, @IntRange(from = 1L) int v2) {
        this(v, v1, z, v2, 0, 0, 0x30, null);
    }

    @JvmOverloads
    public PagingConfig(int v, @IntRange(from = 0L) int v1, boolean z, @IntRange(from = 1L) int v2, @IntRange(from = 2L) int v3) {
        this(v, v1, z, v2, v3, 0, 0x20, null);
    }

    @JvmOverloads
    public PagingConfig(int v, @IntRange(from = 0L) int v1, boolean z, @IntRange(from = 1L) int v2, @IntRange(from = 2L) int v3, int v4) {
        this.pageSize = v;
        this.prefetchDistance = v1;
        this.enablePlaceholders = z;
        this.initialLoadSize = v2;
        this.maxSize = v3;
        this.jumpThreshold = v4;
        if(!z && v1 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if(v3 != 0x7FFFFFFF && v3 < v1 * 2 + v) {
            StringBuilder stringBuilder0 = q.u("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", v, ", prefetchDist=", v1, ", maxSize=");
            stringBuilder0.append(v3);
            throw new IllegalArgumentException(stringBuilder0.toString());
        }
        if(v4 != 0x80000000 && v4 <= 0) {
            throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
        }
    }

    public PagingConfig(int v, int v1, boolean z, int v2, int v3, int v4, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v5 & 4) != 0) {
            z = true;
        }
        if((v5 & 8) != 0) {
            v2 = v * 3;
        }
        if((v5 & 16) != 0) {
            v3 = 0x7FFFFFFF;
        }
        if((v5 & 0x20) != 0) {
            v4 = 0x80000000;
        }
        this(v, ((v5 & 2) == 0 ? v1 : v), z, v2, v3, v4);
    }
}

