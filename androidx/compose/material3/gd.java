package androidx.compose.material3;

import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.lazy.LazyListInterval;
import androidx.compose.foundation.lazy.grid.LazyGridInterval;
import androidx.compose.foundation.lazy.layout.IntervalList.Interval;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval;
import androidx.compose.foundation.pager.PagerIntervalContent;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.window.PopupLayout;
import androidx.constraintlayout.compose.Measurer;
import androidx.navigation.compose.DialogHostKt;
import androidx.navigation.compose.DialogNavigator;
import b0.h;
import com.kakao.kandinsky.base.ConsumeDialogKt;
import e0.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import s0.g;
import v2.n;

public final class gd extends Lambda implements Function2 {
    public final int w;
    public final int x;
    public final Object y;

    public gd(Object object0, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ((hd)this.y).Content(((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ((SegmentedButtonDefaults)this.y).ActiveIcon(((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                ((ComposeView)this.y).Content(((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                ((Measurer)this.y).createDesignElements(((Composer)object0), this.x | 1);
                return Unit.INSTANCE;
            }
            case 4: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xCED7AFC2, v, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
                }
                Interval intervalList$Interval0 = ((h)this.y).b.getIntervals().get(this.x);
                ((LazyListInterval)intervalList$Interval0.getValue()).getItem().invoke(((h)this.y).c, ((int)(this.x - intervalList$Interval0.getStartIndex())), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x2B48C518, v1, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
                }
                Interval intervalList$Interval1 = ((c0.h)this.y).b.getIntervals().get(this.x);
                ((LazyGridInterval)intervalList$Interval1.getValue()).getItem().invoke((Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, FiniteAnimationSpec finiteAnimationSpec1, FiniteAnimationSpec finiteAnimationSpec2) -> (finiteAnimationSpec0 == null && finiteAnimationSpec1 == null && finiteAnimationSpec2 == null ? modifier0 : modifier0.then(new LazyLayoutAnimateItemElement(finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2))), ((int)(this.x - intervalList$Interval1.getStartIndex())), ((Composer)object0), 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 6: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(608834466, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:78)");
                }
                Interval intervalList$Interval2 = ((e)this.y).b.getIntervals().get(this.x);
                ((LazyStaggeredGridInterval)intervalList$Interval2.getValue()).getItem().invoke((Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, FiniteAnimationSpec finiteAnimationSpec1, FiniteAnimationSpec finiteAnimationSpec2) -> (finiteAnimationSpec0 == null && finiteAnimationSpec1 == null && finiteAnimationSpec2 == null ? modifier0 : modifier0.then(new LazyLayoutAnimateItemElement(finiteAnimationSpec0, finiteAnimationSpec1, finiteAnimationSpec2))), ((int)(this.x - intervalList$Interval2.getStartIndex())), ((Composer)object0), 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 7: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1142237095, v3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)");
                }
                Interval intervalList$Interval3 = ((PagerLazyLayoutItemProvider)this.y).b.getIntervals().get(this.x);
                ((PagerIntervalContent)intervalList$Interval3.getValue()).getItem().invoke(((PagerLazyLayoutItemProvider)this.y).d, ((int)(this.x - intervalList$Interval3.getStartIndex())), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 8: {
                ((Number)object1).intValue();
                CoreTextFieldKt.TextFieldCursorHandle(((TextFieldSelectionManager)this.y), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 9: {
                ((Number)object1).intValue();
                ((TextLinkScope)this.y).LinksComposables(((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 10: {
                ((Number)object1).intValue();
                DialogHostKt.DialogHost(((DialogNavigator)this.y), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 11: {
                ((Number)object1).intValue();
                ConsumeDialogKt.ConsumeDialog(((Flow)this.y), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 12: {
                ((Number)object1).intValue();
                SharedTransitionScopeKt.SharedTransitionScope(((Function4)this.y), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 13: {
                ((Number)object1).intValue();
                ((g)this.y).Content(((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 14: {
                ((Number)object1).intValue();
                ((InfiniteTransition)this.y).run$animation_core_release(((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 15: {
                ((Number)object1).intValue();
                ((n)this.y).Content(((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ((PopupLayout)this.y).Content(((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

