package com.kakao.tistory.presentation.widget.swipe;

import androidx.annotation.ColorRes;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.paging.compose.LazyPagingItems;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u001AÈ\u0001\u0010\u0014\u001A\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032<\b\u0002\u0010\u000B\u001A6\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00052\u0006\u0010\r\u001A\u00020\f2\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000E2\n\b\u0003\u0010\u0010\u001A\u0004\u0018\u00010\u00062;\u0010\u0013\u001A7\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00110\u0005¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001AÈ\u0001\u0010\u0014\u001A\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00162<\b\u0002\u0010\u000B\u001A6\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00052\u0006\u0010\r\u001A\u00020\f2\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000E2\n\b\u0003\u0010\u0010\u001A\u0004\u0018\u00010\u00062;\u0010\u0013\u001A7\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00110\u0005¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"", "T", "Landroidx/compose/foundation/lazy/LazyListScope;", "Landroidx/paging/compose/LazyPagingItems;", "items", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "index", "item", "key", "Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState;", "swipeGroupState", "Lcom/kakao/tistory/presentation/widget/swipe/AnchorsProvider;", "anchorsProvider", "backgroundColorResId", "", "Landroidx/compose/runtime/Composable;", "content", "swipeableItems", "(Landroidx/compose/foundation/lazy/LazyListScope;Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function2;Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState;Lcom/kakao/tistory/presentation/widget/swipe/AnchorsProvider;Ljava/lang/Integer;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState;Lcom/kakao/tistory/presentation/widget/swipe/AnchorsProvider;Ljava/lang/Integer;Lkotlin/jvm/functions/Function4;)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListExtension.kt\ncom/kakao/tistory/presentation/widget/swipe/LazyListExtensionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,96:1\n1223#2,6:97\n1223#2,6:103\n1223#2,6:110\n1#3:109\n179#4,12:116\n*S KotlinDebug\n*F\n+ 1 LazyListExtension.kt\ncom/kakao/tistory/presentation/widget/swipe/LazyListExtensionKt\n*L\n26#1:97,6\n33#1:103,6\n40#1:110,6\n85#1:116,12\n*E\n"})
public final class LazyListExtensionKt {
    public static final void access$SwipeableItems(int v, Object object0, Object object1, CommonSwipeGroupState commonSwipeGroupState0, AnchorsProvider anchorsProvider0, Integer integer0, Function4 function40, Composer composer0, int v1, int v2) {
        Composer composer1 = composer0.startRestartGroup(-221910443);
        Color color0 = null;
        Integer integer1 = (v2 & 0x20) == 0 ? integer0 : null;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-221910443, v1, -1, "com.kakao.tistory.presentation.widget.swipe.SwipeableItems (LazyListExtension.kt:21)");
        }
        boolean z = commonSwipeGroupState0.isCurrentIndex(v);
        int v3 = 0;
        CommonSwipeState commonSwipeState0 = SwipeableItemKt.rememberCommonSwipeState(object1, composer1, 8, 0);
        composer1.startReplaceGroup(-448480032);
        boolean z1 = composer1.changed(commonSwipeState0);
        d d0 = composer1.rememberedValue();
        if(z1 || d0 == Composer.Companion.getEmpty()) {
            d0 = new d(commonSwipeState0, null);
            composer1.updateRememberedValue(d0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(object0, d0, composer1, v1 >> 3 & 14 | (v1 >> 3 & 8 | 0x40));
        composer1.startReplaceGroup(0xE544D03E);
        boolean z2 = composer1.changed(z);
        boolean z3 = (v1 & 0x70 ^ 0x30) > 0x20 && composer1.changed(object0) || (v1 & 0x30) == 0x20;
        int v4 = ((0xE000 & v1 ^ 0x6000) <= 0x4000 || !composer1.changed(anchorsProvider0)) && (v1 & 0x6000) != 0x4000 ? 0 : 1;
        SwipeAnchors swipeAnchors0 = composer1.rememberedValue();
        if((z2 | z3 | v4) != 0 || swipeAnchors0 == Composer.Companion.getEmpty()) {
            swipeAnchors0 = anchorsProvider0 == null ? null : anchorsProvider0.create(v, object0, new e(commonSwipeGroupState0));
            composer1.updateRememberedValue(swipeAnchors0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0xE544FFFA);
        if(integer1 != null) {
            color0 = Color.box-impl(ColorResources_androidKt.colorResource(integer1.intValue(), composer1, 0));
        }
        composer1.endReplaceGroup();
        long v5 = color0 == null ? 0xFF88888800000000L : color0.unbox-impl();
        composer1.startReplaceGroup(0xE544EC0C);
        int v6 = ((v1 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(commonSwipeGroupState0)) && (v1 & 0xC00) != 0x800 ? 0 : 1;
        if((v1 & 14 ^ 6) > 4 && composer1.changed(v) || (v1 & 6) == 4) {
            v3 = 1;
        }
        f f0 = composer1.rememberedValue();
        if((v6 | v3) != 0 || f0 == Composer.Companion.getEmpty()) {
            f0 = new f(commonSwipeGroupState0, v);
            composer1.updateRememberedValue(f0);
        }
        composer1.endReplaceGroup();
        SwipeableItemKt.SwipeableItem-OadGlvw(commonSwipeState0, v5, z, swipeAnchors0, f0, ComposableLambdaKt.rememberComposableLambda(0x63F15CCC, true, new g(object1, function40, v, object0, v1), composer1, 54), composer1, 0x30000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, object0, object1, commonSwipeGroupState0, anchorsProvider0, integer1, function40, v1, v2));
        }
    }

    public static final void swipeableItems(@NotNull LazyListScope lazyListScope0, @NotNull LazyPagingItems lazyPagingItems0, @Nullable Function2 function20, @NotNull CommonSwipeGroupState commonSwipeGroupState0, @Nullable AnchorsProvider anchorsProvider0, @ColorRes @Nullable Integer integer0, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "<this>");
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "items");
        Intrinsics.checkNotNullParameter(commonSwipeGroupState0, "swipeGroupState");
        Intrinsics.checkNotNullParameter(function40, "content");
        LazyListScope.items$default(lazyListScope0, lazyPagingItems0.getItemCount(), null, null, ComposableLambdaKt.composableLambdaInstance(0x48E7849C, true, new i(lazyPagingItems0, function20, commonSwipeGroupState0, anchorsProvider0, integer0, function40)), 6, null);
    }

    public static final void swipeableItems(@NotNull LazyListScope lazyListScope0, @NotNull List list0, @Nullable Function2 function20, @NotNull CommonSwipeGroupState commonSwipeGroupState0, @Nullable AnchorsProvider anchorsProvider0, @ColorRes @Nullable Integer integer0, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "items");
        Intrinsics.checkNotNullParameter(commonSwipeGroupState0, "swipeGroupState");
        Intrinsics.checkNotNullParameter(function40, "content");
        lazyListScope0.items(list0.size(), null, new Function1(list0) {
            public final List a;

            {
                this.a = list0;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                this.a.get(v);
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new Function4(list0, function20, commonSwipeGroupState0, anchorsProvider0, integer0, function40) {
            public final List a;
            public final Function2 b;
            public final CommonSwipeGroupState c;
            public final AnchorsProvider d;
            public final Integer e;
            public final Function4 f;

            {
                this.a = list0;
                this.b = function20;
                this.c = commonSwipeGroupState0;
                this.d = anchorsProvider0;
                this.e = integer0;
                this.f = function40;
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
                composer0.startReplaceGroup(0xF8A76F74);
                LazyListExtensionKt.access$SwipeableItems(v, object0, (this.b == null ? null : this.b.invoke(v, object0)), this.c, this.d, this.e, this.f, composer0, (v2 & 0x7E) >> 3 & 14 | 0x200, 0);
                composer0.endReplaceGroup();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2\n*L\n1#1,433:1\n*E\n"})
        public final class com.kakao.tistory.presentation.widget.swipe.LazyListExtensionKt.swipeableItems..inlined.itemsIndexed.default.1 extends Lambda implements Function1 {
            public final Function2 a;
            public final List b;

            public com.kakao.tistory.presentation.widget.swipe.LazyListExtensionKt.swipeableItems..inlined.itemsIndexed.default.1(Function2 function20, List list0) {
                this.a = function20;
                this.b = list0;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                Object object0 = this.b.get(v);
                return this.a.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }

    }

    public static void swipeableItems$default(LazyListScope lazyListScope0, LazyPagingItems lazyPagingItems0, Function2 function20, CommonSwipeGroupState commonSwipeGroupState0, AnchorsProvider anchorsProvider0, Integer integer0, Function4 function40, int v, Object object0) {
        LazyListExtensionKt.swipeableItems(lazyListScope0, lazyPagingItems0, ((v & 2) == 0 ? function20 : null), commonSwipeGroupState0, anchorsProvider0, ((v & 16) == 0 ? integer0 : null), function40);
    }

    public static void swipeableItems$default(LazyListScope lazyListScope0, List list0, Function2 function20, CommonSwipeGroupState commonSwipeGroupState0, AnchorsProvider anchorsProvider0, Integer integer0, Function4 function40, int v, Object object0) {
        LazyListExtensionKt.swipeableItems(lazyListScope0, list0, ((v & 2) == 0 ? function20 : null), commonSwipeGroupState0, anchorsProvider0, ((v & 16) == 0 ? integer0 : null), function40);
    }
}

