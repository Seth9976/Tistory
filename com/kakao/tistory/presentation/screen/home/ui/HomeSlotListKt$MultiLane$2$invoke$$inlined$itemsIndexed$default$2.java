package com.kakao.tistory.presentation.screen.home.ui;

import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3\n+ 2 HomeSlotList.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeSlotListKt$MultiLane$2\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,469:1\n95#2:470\n1#3:471\n*E\n"})
public final class HomeSlotListKt.MultiLane.2.invoke..inlined.itemsIndexed.default.2 extends Lambda implements Function1 {
    public final List a;

    public HomeSlotListKt.MultiLane.2.invoke..inlined.itemsIndexed.default.2(List list0) {
        this.a = list0;
        super(1);
    }

    @Nullable
    public final Object invoke(int v) {
        HomeSlotUiState homeSlotUiState0 = (HomeSlotUiState)((Pair)this.a.get(v)).getFirst();
        if(homeSlotUiState0 != null) {
            String s = Reflection.getOrCreateKotlinClass(homeSlotUiState0.getClass()).getSimpleName();
            return s == null ? "empty" : s;
        }
        return "empty";
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(((Number)object0).intValue());
    }
}

