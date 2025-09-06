package androidx.compose.foundation.lazy.grid;

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

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberLazyGridSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "reverseScrolling", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,66:1\n1223#2,6:67\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n34#1:67,6\n*E\n"})
public final class LazySemanticsKt {
    @Composable
    @NotNull
    public static final LazyLayoutSemanticState rememberLazyGridSemanticState(@NotNull LazyGridState lazyGridState0, boolean z, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1247008005, v, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:33)");
        }
        int v1 = 0;
        int v2 = ((v & 14 ^ 6) <= 4 || !composer0.changed(lazyGridState0)) && (v & 6) != 4 ? 0 : 1;
        if((v & 0x70 ^ 0x30) > 0x20 && composer0.changed(z) || (v & 0x30) == 0x20) {
            v1 = 1;
        }
        androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState.1.1 lazySemanticsKt$rememberLazyGridSemanticState$1$10 = composer0.rememberedValue();
        if((v2 | v1) != 0 || lazySemanticsKt$rememberLazyGridSemanticState$1$10 == Composer.Companion.getEmpty()) {
            lazySemanticsKt$rememberLazyGridSemanticState$1$10 = new LazyLayoutSemanticState() {
                public final LazyGridState a;

                {
                    LazyGridState lazyGridState0 = lazyGridState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = lazyGridState0;
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
                    Object object0 = LazyGridState.scrollToItem$default(this.a, v, 0, continuation0, 2, null);
                    return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                }
            };
            composer0.updateRememberedValue(lazySemanticsKt$rememberLazyGridSemanticState$1$10);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazySemanticsKt$rememberLazyGridSemanticState$1$10;
    }
}

