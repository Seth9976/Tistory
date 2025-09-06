package com.kakao.tistory.presentation.view.search;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.kakao.tistory.domain.entity.SearchItem.Bottom;
import com.kakao.tistory.domain.entity.SearchItem.Empty;
import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.domain.entity.SearchItem.Top;
import com.kakao.tistory.domain.entity.SearchItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u000B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 SearchKeywordFragment.kt\ncom/kakao/tistory/presentation/view/search/SearchKeywordFragmentKt$SearchKeywordList$1\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n87#2,2:434\n89#2,14:437\n103#2:452\n101#2,8:453\n1#3:436\n158#4:451\n*S KotlinDebug\n*F\n+ 1 SearchKeywordFragment.kt\ncom/kakao/tistory/presentation/view/search/SearchKeywordFragmentKt$SearchKeywordList$1\n*L\n102#1:451\n*E\n"})
public final class SearchKeywordFragmentKt.SearchKeywordList.1.invoke..inlined.itemsIndexed.default.3 extends Lambda implements Function4 {
    public final List a;
    public final SearchViewModel b;

    public SearchKeywordFragmentKt.SearchKeywordList.1.invoke..inlined.itemsIndexed.default.3(List list0, SearchViewModel searchViewModel0) {
        this.a = list0;
        this.b = searchViewModel0;
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
            ComposerKt.traceEventStart(0xBEF78951, v2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
        }
        SearchItem searchItem0 = (SearchItem)this.a.get(v);
        composer0.startReplaceGroup(1573036924);
        if(searchItem0 instanceof Top) {
            composer0.startReplaceGroup(0x240E8E87);
            Integer integer0 = ((Top)searchItem0).getTitle();
            if(integer0 != null) {
                SearchKeywordFragmentKt.access$SearchTop(integer0.intValue(), composer0, 0);
            }
        }
        else if(searchItem0 instanceof Keyword) {
            composer0.startReplaceGroup(0x240E9700);
            v0 v00 = new v0(this.b);
            SearchKeywordFragmentKt.access$SearchKeyword(v, ((Keyword)searchItem0), this.b, v00, composer0, (v2 & 0x7E) >> 3 & 14 | 0x240);
        }
        else if(searchItem0 instanceof Empty) {
            composer0.startReplaceGroup(0x240EB39D);
            Integer integer1 = ((Empty)searchItem0).getEmptyTitle();
            if(integer1 != null) {
                SearchKeywordFragmentKt.SearchEmptyView(null, integer1.intValue(), composer0, 0, 1);
            }
        }
        else if(searchItem0 instanceof Bottom) {
            composer0.startReplaceGroup(0x5DC998E4);
            DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(color.gray4, composer0, 0), 0.5f, 0.0f, composer0, 0x180, 9);
            SearchKeywordFragmentKt.access$SearchBottom(((Bottom)searchItem0), this.b, composer0, 72);
        }
        else {
            composer0.startReplaceGroup(0x5DCD4510);
        }
        composer0.endReplaceGroup();
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

