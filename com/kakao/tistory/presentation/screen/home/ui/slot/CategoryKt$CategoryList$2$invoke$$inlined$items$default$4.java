package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.CategoryGroup;
import com.kakao.tistory.presentation.widget.common.TistoryChipKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u000B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 Category.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/CategoryKt$CategoryList$2\n*L\n1#1,433:1\n113#2,8:434\n*E\n"})
public final class CategoryKt.CategoryList.2.invoke..inlined.items.default.4 extends Lambda implements Function4 {
    public final List a;
    public final String b;

    public CategoryKt.CategoryList.2.invoke..inlined.items.default.4(List list0, String s) {
        this.a = list0;
        this.b = s;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
        this.invoke(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope lazyItemScope0, int v, @Nullable Composer composer0, int v1) {
        int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyItemScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDA480CDF, v2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
        }
        CategoryGroup homeSlotUiState$CategoryGroup0 = (CategoryGroup)this.a.get(v);
        composer0.startReplaceGroup(-577730730);
        TistoryChipKt.TistoryChip(homeSlotUiState$CategoryGroup0.getIconRes(), homeSlotUiState$CategoryGroup0.getSelectedIconRes(), homeSlotUiState$CategoryGroup0.getLabel(), Intrinsics.areEqual(homeSlotUiState$CategoryGroup0.getId(), this.b), null, homeSlotUiState$CategoryGroup0.getOnClick(), composer0, 0, 16);
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

