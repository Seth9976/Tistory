package dev.chrisbanes.snapper;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001A\u00020\u0014H&J\b\u0010\u0015\u001A\u00020\u0014H&J&\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0017\u001A\u00020\u00182\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u001A2\u0006\u0010\u001B\u001A\u00020\u0018H&J\u0010\u0010\u001C\u001A\u00020\b2\u0006\u0010\u001D\u001A\u00020\bH&R\u0014\u0010\u0003\u001A\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0012\u0010\u000B\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\nR\u0012\u0010\r\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\nR\u0018\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u0010X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u001E"}, d2 = {"Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "", "()V", "currentItem", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "getCurrentItem", "()Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "endScrollOffset", "", "getEndScrollOffset", "()I", "startScrollOffset", "getStartScrollOffset", "totalItemsCount", "getTotalItemsCount", "visibleItems", "Lkotlin/sequences/Sequence;", "getVisibleItems", "()Lkotlin/sequences/Sequence;", "canScrollTowardsEnd", "", "canScrollTowardsStart", "determineTargetIndex", "velocity", "", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "maximumFlingDistance", "distanceToIndexSnap", "index", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public abstract class SnapperLayoutInfo {
    public static final int $stable;

    public abstract boolean canScrollTowardsEnd();

    public abstract boolean canScrollTowardsStart();

    public abstract int determineTargetIndex(float arg1, @NotNull DecayAnimationSpec arg2, float arg3);

    public abstract int distanceToIndexSnap(int arg1);

    @Nullable
    public abstract SnapperLayoutItemInfo getCurrentItem();

    public abstract int getEndScrollOffset();

    public abstract int getStartScrollOffset();

    public abstract int getTotalItemsCount();

    @NotNull
    public abstract Sequence getVisibleItems();
}

