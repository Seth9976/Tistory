package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.domain.entity.Blog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u000B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 BlogSwitchBottomSheet.kt\ncom/kakao/tistory/presentation/screen/blogswitch/BlogSwitchBottomSheetKt$BlogList$2\n*L\n1#1,433:1\n266#2,9:434\n*E\n"})
public final class BlogSwitchBottomSheetKt.BlogList.2.invoke..inlined.itemsIndexed.default.6 extends Lambda implements Function4 {
    public final List a;
    public final int b;
    public final Blog c;
    public final Blog d;
    public final PaddingValues e;
    public final Function2 f;

    public BlogSwitchBottomSheetKt.BlogList.2.invoke..inlined.itemsIndexed.default.6(List list0, int v, Blog blog0, Blog blog1, PaddingValues paddingValues0, Function2 function20) {
        this.a = list0;
        this.b = v;
        this.c = blog0;
        this.d = blog1;
        this.e = paddingValues0;
        this.f = function20;
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
        Object object0 = this.a.get(v);
        composer0.startReplaceGroup(0xCFA6291A);
        e e0 = new e(this.f, this.b + v, ((Blog)object0));
        BlogSwitchBottomSheetKt.access$BlogListItem(((Blog)object0), this.c, this.d, this.e, e0, composer0, 584);
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

