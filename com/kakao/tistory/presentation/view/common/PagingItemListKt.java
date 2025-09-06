package com.kakao.tistory.presentation.view.common;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.LoadState.Error;
import androidx.paging.LoadState.Loading;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyFoundationExtensionsKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.ErrorModelThrowable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.common.CommonEmptyViewKt;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A5\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000E\u0010\u0003\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001A\\\u0010\u0011\u001A\u00020\u000E\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\b2\u000E\u0010\u0003\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00022\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\b\u000F¢\u0006\u0004\b\u0011\u0010\u0012\"\'\u0010\u0014\u001A\u00020\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00028F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015\"\'\u0010\u0016\u001A\u00020\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00028F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0015\"\'\u0010\u001A\u001A\u0004\u0018\u00010\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"", "T", "Landroidx/paging/compose/LazyPagingItems;", "pagingItems", "Landroidx/compose/runtime/State;", "Landroidx/paging/ItemSnapshotList;", "rememberPagingSnapshot", "(Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "snapshotList", "", "emptyMessageResId", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "itemContent", "pagingItemList", "(Landroidx/compose/foundation/lazy/LazyListScope;Landroidx/paging/compose/LazyPagingItems;Ljava/util/List;ILkotlin/jvm/functions/Function3;)V", "", "isLoading", "(Landroidx/paging/compose/LazyPagingItems;)Z", "isRefreshing", "Lcom/kakao/tistory/domain/ErrorModelThrowable;", "getRefreshError", "(Landroidx/paging/compose/LazyPagingItems;)Lcom/kakao/tistory/domain/ErrorModelThrowable;", "refreshError", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagingItemList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingItemList.kt\ncom/kakao/tistory/presentation/view/common/PagingItemListKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,119:1\n1223#2,6:120\n148#3,7:126\n*S KotlinDebug\n*F\n+ 1 PagingItemList.kt\ncom/kakao/tistory/presentation/view/common/PagingItemListKt\n*L\n30#1:120,6\n71#1:126,7\n*E\n"})
public final class PagingItemListKt {
    public static final String a(Object object0) {
        if(object0 instanceof Identifiable) {
            String s = ((Identifiable)object0).getId().toString();
            return Reflection.getOrCreateKotlinClass(object0.getClass()).getSimpleName() + s;
        }
        return Reflection.getOrCreateKotlinClass(object0.getClass()).getSimpleName() + object0.hashCode();
    }

    public static final void a(LazyListScope lazyListScope0, LoadState loadState0, boolean z, Function0 function00) {
        if(loadState0 instanceof Error) {
            Throwable throwable0 = ((Error)loadState0).getError();
            ErrorModelThrowable errorModelThrowable0 = throwable0 instanceof ErrorModelThrowable ? ((ErrorModelThrowable)throwable0) : null;
            if(errorModelThrowable0 != null) {
                LazyListScope.item$default(lazyListScope0, null, null, ComposableLambdaKt.composableLambdaInstance(0xB1E5F07D, true, new z(errorModelThrowable0, function00)), 3, null);
            }
        }
        else if(Intrinsics.areEqual(loadState0, Loading.INSTANCE) && z) {
            LazyListScope.item$default(lazyListScope0, null, null, ComposableSingletons.PagingItemListKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
        }
    }

    public static final void access$ItemEmpty(int v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x7EDBA87C);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7EDBA87C, v2, -1, "com.kakao.tistory.presentation.view.common.ItemEmpty (PagingItemList.kt:96)");
            }
            CommonEmptyViewKt.CommonEmptyView(v, null, composer1, v2 & 14, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(v, v1));
        }
    }

    public static final void access$ItemError(ErrorModelThrowable errorModelThrowable0, Function0 function00, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(1809210245);
        if((v1 & 2) != 0) {
            function00 = o.a;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809210245, v, -1, "com.kakao.tistory.presentation.view.common.ItemError (PagingItemList.kt:101)");
        }
        ErrorModel errorModel0 = errorModelThrowable0 == null ? null : errorModelThrowable0.getErrorModel();
        if(errorModel0 != null) {
            CommonExceptionViewKt.CommonExceptionView(errorModel0, false, null, false, function00, composer1, v << 9 & 0xE000 | 56, 12);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p(errorModelThrowable0, function00, v, v1));
        }
    }

    @Nullable
    public static final ErrorModelThrowable getRefreshError(@NotNull LazyPagingItems lazyPagingItems0) {
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "<this>");
        LoadState loadState0 = lazyPagingItems0.getLoadState().getRefresh();
        Error loadState$Error0 = loadState0 instanceof Error ? ((Error)loadState0) : null;
        Throwable throwable0 = loadState$Error0 == null ? null : loadState$Error0.getError();
        return throwable0 instanceof ErrorModelThrowable ? ((ErrorModelThrowable)throwable0) : null;
    }

    // 去混淆评级： 低(20)
    public static final boolean isLoading(@Nullable LazyPagingItems lazyPagingItems0) {
        return lazyPagingItems0 == null || lazyPagingItems0.getLoadState().getRefresh() instanceof Loading && lazyPagingItems0.getItemSnapshotList().getItems().isEmpty();
    }

    public static final boolean isRefreshing(@Nullable LazyPagingItems lazyPagingItems0) {
        if(!PagingItemListKt.isLoading(lazyPagingItems0)) {
            if(lazyPagingItems0 == null) {
                throw new NullPointerException();
            }
            CombinedLoadStates combinedLoadStates0 = lazyPagingItems0.getLoadState();
            return combinedLoadStates0 == null ? null instanceof Loading && !lazyPagingItems0.getItemSnapshotList().getItems().isEmpty() : combinedLoadStates0.getRefresh() instanceof Loading && !lazyPagingItems0.getItemSnapshotList().getItems().isEmpty();
        }
        return false;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void pagingItemList(@NotNull LazyListScope lazyListScope0, @Nullable LazyPagingItems lazyPagingItems0, @NotNull List list0, int v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "snapshotList");
        Intrinsics.checkNotNullParameter(function30, "itemContent");
        if(lazyPagingItems0 == null) {
            return;
        }
        if(lazyPagingItems0.getItemCount() > 0) {
            PagingItemListKt.a(lazyListScope0, lazyPagingItems0.getLoadState().getRefresh(), false, new q(lazyPagingItems0));
            lazyListScope0.items(lazyPagingItems0.getItemCount(), LazyFoundationExtensionsKt.itemKey(lazyPagingItems0, r.a), LazyFoundationExtensionsKt.itemContentType(lazyPagingItems0, s.a), ComposableLambdaKt.composableLambdaInstance(0xB1528DA2, true, new t(lazyPagingItems0, function30)));
            PagingItemListKt.a(lazyListScope0, lazyPagingItems0.getLoadState().getAppend(), true, new u(lazyPagingItems0));
            return;
        }
        if(lazyPagingItems0.getLoadState().isIdle()) {
            LazyListScope.item$default(lazyListScope0, null, null, ComposableLambdaKt.composableLambdaInstance(0x94F52902, true, new v(v)), 3, null);
            return;
        }
        if(!list0.isEmpty()) {
            lazyListScope0.items(list0.size(), (w.a == null ? null : new Function1(w.a, list0) {
                public final Function1 a;
                public final List b;

                {
                    this.a = function10;
                    this.b = list0;
                    super(1);
                }

                @NotNull
                public final Object invoke(int v) {
                    Object object0 = this.b.get(v);
                    return this.a.invoke(object0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((Number)object0).intValue());
                }
            }), new Function1(x.a, list0) {
                public final Function1 a;
                public final List b;

                {
                    this.a = function10;
                    this.b = list0;
                    super(1);
                }

                @Nullable
                public final Object invoke(int v) {
                    Object object0 = this.b.get(v);
                    return this.a.invoke(object0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((Number)object0).intValue());
                }
            }, ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new Function4(list0, function30) {
                public final List a;
                public final Function3 b;

                {
                    this.a = list0;
                    this.b = function30;
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
                    Object object0 = this.a.get(v);
                    composer0.startReplaceGroup(0x2148EA8E);
                    this.b.invoke(object0, composer0, 0);
                    composer0.endReplaceGroup();
                    if(ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
    }

    public static void pagingItemList$default(LazyListScope lazyListScope0, LazyPagingItems lazyPagingItems0, List list0, int v, Function3 function30, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = string.label_blog_no_entry;
        }
        PagingItemListKt.pagingItemList(lazyListScope0, lazyPagingItems0, list0, v, function30);
    }

    @Composable
    @NotNull
    public static final State rememberPagingSnapshot(@Nullable LazyPagingItems lazyPagingItems0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(-2002570355);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2002570355, v, -1, "com.kakao.tistory.presentation.view.common.rememberPagingSnapshot (PagingItemList.kt:28)");
        }
        composer0.startReplaceGroup(0x172D6F88);
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new ItemSnapshotList(0, 0, CollectionsKt__CollectionsKt.emptyList()), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect((lazyPagingItems0 == null ? null : lazyPagingItems0.getItemSnapshotList()), new y(lazyPagingItems0, mutableState0, null), composer0, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return mutableState0;
    }
}

