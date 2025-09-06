package com.kakao.kandinsky.filter.ui;

import androidx.compose.material3.h8;
import androidx.compose.material3.vn;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import ga.c;
import ga.d;
import ga.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A|\u0010\u0012\u001A\u00020\u00102\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u000429\u0010\u000E\u001A5\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000FH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\f\u0010\u0015\u001A\u00020\u00148\nX\u008A\u0084\u0002"}, d2 = {"", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filterList", "currentFilter", "", "intensity", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "size", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/Bitmap;", "", "getThumbnailBitmap", "Lkotlin/Function1;", "", "onClickFilter", "FilterMenu", "(Ljava/util/List;Lcom/kakao/kandinsky/core/kdphoto/Filter;FLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lga/g;", "imageState", "filter_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class FilterMenuKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void FilterMenu(@NotNull List list0, @NotNull Filter filter0, float f, @NotNull Function3 function30, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "filterList");
        Intrinsics.checkNotNullParameter(filter0, "currentFilter");
        Intrinsics.checkNotNullParameter(function30, "getThumbnailBitmap");
        Intrinsics.checkNotNullParameter(function10, "onClickFilter");
        Composer composer1 = composer0.startRestartGroup(0xD06262F1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD06262F1, v, -1, "com.kakao.kandinsky.filter.ui.FilterMenu (FilterMenu.kt:30)");
        }
        ItemSliderKt.ItemSlider(null, list0.size(), list0.indexOf(filter0), FunctionStateKt.skippableLambda(new c(function10, list0), composer1, 0), FunctionStateKt.skippableReturnLambda(new h8(list0, 1), composer1, 0), ComposableLambdaKt.rememberComposableLambda(-2042460318, true, new d(f), composer1, 54), ComposableLambdaKt.rememberComposableLambda(804500131, true, new f(list0, function30), composer1, 54), composer1, 0x1B0000, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vn(list0, filter0, f, function30, function10, v));
        }
    }
}

