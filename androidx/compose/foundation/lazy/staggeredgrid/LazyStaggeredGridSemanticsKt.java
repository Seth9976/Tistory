package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberLazyStaggeredGridSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "reverseScrolling", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,65:1\n1223#2,6:66\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n*L\n34#1:66,6\n*E\n"})
public final class LazyStaggeredGridSemanticsKt {
    @Composable
    @NotNull
    public static final LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState(@NotNull LazyStaggeredGridState lazyStaggeredGridState0, boolean z, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x611DFB97, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:33)");
        }
        boolean z1 = composer0.changed(lazyStaggeredGridState0);
        boolean z2 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changed(z) || (v & 0x30) == 0x20;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState.1.1 lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10 = composer0.rememberedValue();
        if(z2 || z1 || lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10 == Composer.Companion.getEmpty()) {
            lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10 = new LazyLayoutSemanticState() {
                public final LazyStaggeredGridState a;

                {
                    LazyStaggeredGridState lazyStaggeredGridState0 = lazyStaggeredGridState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = lazyStaggeredGridState0;
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @NotNull
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getContentPadding() {
                    int v = this.a.getLayoutInfo().getBeforeContentPadding();
                    return this.a.getLayoutInfo().getAfterContentPadding() + v;
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getMaxScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(this.a.getFirstVisibleItemIndex(), this.a.getFirstVisibleItemScrollOffset(), this.a.getCanScrollForward());
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(this.a.getFirstVisibleItemIndex(), this.a.getFirstVisibleItemScrollOffset());
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getViewport() {
                    return this.a.getLayoutInfo().getOrientation() == Orientation.Vertical ? IntSize.getHeight-impl(this.a.getLayoutInfo().getViewportSize-YbymL2g()) : IntSize.getWidth-impl(this.a.getLayoutInfo().getViewportSize-YbymL2g());
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @Nullable
                public Object scrollToItem(int v, @NotNull Continuation continuation0) {
                    Object object0 = LazyStaggeredGridState.scrollToItem$default(this.a, v, 0, continuation0, 2, null);
                    return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                }
            };
            composer0.updateRememberedValue(lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10;
    }
}

