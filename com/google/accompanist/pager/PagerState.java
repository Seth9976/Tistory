package com.google.accompanist.pager;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import o6.e;
import o6.p;
import o6.s;
import o6.t;
import o6.u;
import o6.v;
import o6.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import zd.c;

@Stable
@Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Insets is Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @ReplaceWith(expression = "PagerState(currentPage = currentPage)", imports = {"androidx.compose.foundation.pager.PagerState"}))
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001UB\u0011\u0012\b\b\u0003\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u000F\u001A\u00020\u000E2\b\b\u0001\u0010\u0006\u001A\u00020\u00022\b\b\u0003\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00072\b\b\u0002\u0010\r\u001A\u00020\fH\u0087@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J\'\u0010\u000F\u001A\u00020\u000E2\b\b\u0001\u0010\u0006\u001A\u00020\u00022\b\b\u0003\u0010\b\u001A\u00020\u0007H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0011J\'\u0010\u0012\u001A\u00020\u000E2\b\b\u0001\u0010\u0006\u001A\u00020\u00022\b\b\u0003\u0010\b\u001A\u00020\u0007H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u000F\u0010\u0015\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0017\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0014JD\u0010 \u001A\u00020\u000E2\u0006\u0010\u0019\u001A\u00020\u00182\'\u0010\u001F\u001A#\b\u0001\u0012\u0004\u0012\u00020\u001B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\u001C\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\u001A\u00A2\u0006\u0002\b\u001EH\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!J\u0017\u0010#\u001A\u00020\u00072\u0006\u0010\"\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b&\u0010\'R\u001A\u0010-\u001A\u00020(8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R+\u00104\u001A\u00020\u00022\u0006\u0010.\u001A\u00020\u00028@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\b/\u00100\u001A\u0004\b1\u00102\"\u0004\b3\u0010\u0005R!\u00109\u001A\u00020\u00028GX\u0087\u0084\u0002\u00A2\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b8\u0010\u0014\u001A\u0004\b7\u00102R\u001B\u0010=\u001A\u00020\u00078FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b:\u00106\u001A\u0004\b;\u0010<R?\u0010D\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010>2\u0010\u0010.\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010>8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\b?\u00100\u001A\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010H\u001A\u0004\u0018\u00010E8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bF\u0010GR\u0011\u0010L\u001A\u00020I8F\u00A2\u0006\u0006\u001A\u0004\bJ\u0010KR$\u0010\u0003\u001A\u00020\u00022\u0006\u0010M\u001A\u00020\u00028G@@X\u0086\u000E\u00A2\u0006\f\u001A\u0004\bN\u00102\"\u0004\bO\u0010\u0005R\u001A\u0010R\u001A\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bQ\u0010\u0014\u001A\u0004\bP\u00102R\u0014\u0010S\u001A\u00020\f8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bS\u0010T\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006V"}, d2 = {"Lcom/google/accompanist/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentPage", "<init>", "(I)V", "page", "", "pageOffset", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "initialVelocity", "", "skipPages", "", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "updateCurrentPageBasedOnLazyListState$pager_release", "()V", "updateCurrentPageBasedOnLazyListState", "onScrollFinished$pager_release", "onScrollFinished", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/lazy/LazyListState;", "a", "Landroidx/compose/foundation/lazy/LazyListState;", "getLazyListState$pager_release", "()Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getItemSpacing$pager_release", "()I", "setItemSpacing$pager_release", "itemSpacing", "d", "Landroidx/compose/runtime/State;", "getPageCount", "getPageCount$annotations", "pageCount", "e", "getCurrentPageOffset", "()F", "currentPageOffset", "Lkotlin/Function0;", "g", "getFlingAnimationTarget$pager_release", "()Lkotlin/jvm/functions/Function0;", "setFlingAnimationTarget$pager_release", "(Lkotlin/jvm/functions/Function0;)V", "flingAnimationTarget", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getMostVisiblePageLayoutInfo$pager_release", "()Landroidx/compose/foundation/lazy/LazyListItemInfo;", "mostVisiblePageLayoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "value", "getCurrentPage", "setCurrentPage$pager_release", "getTargetPage", "getTargetPage$annotations", "targetPage", "isScrollInProgress", "()Z", "Companion", "pager_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n76#2:391\n102#2,2:392\n76#2:408\n102#2,2:409\n76#2:417\n76#2:418\n76#2:419\n102#2,2:420\n76#2:422\n102#2,2:423\n1963#3,14:394\n533#3,6:411\n288#3,2:425\n288#3,2:427\n1#4:429\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerState\n*L\n100#1:391\n100#1:392,2\n116#1:408\n116#1:409,2\n136#1:417\n163#1:418\n172#1:419\n172#1:420,2\n174#1:422\n174#1:423,2\n106#1:394,14\n119#1:411,6\n250#1:425,2\n268#1:427,2\n*E\n"})
public final class PagerState implements ScrollableState {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\u0004\u001A\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/accompanist/pager/PagerState$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/google/accompanist/pager/PagerState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "pager_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return PagerState.h;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final LazyListState a;
    public final MutableState b;
    public final MutableState c;
    public final State d;
    public final State e;
    public final MutableState f;
    public final MutableState g;
    public static final Saver h;

    static {
        PagerState.Companion = new Companion(null);
        PagerState.h = ListSaverKt.listSaver(s.w, p.y);
    }

    public PagerState() {
        this(0, 1, null);
    }

    public PagerState(@IntRange(from = 0L) int v) {
        this.a = new LazyListState(v, 0, 2, null);
        this.b = SnapshotStateKt.mutableStateOf$default(v, null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.d = SnapshotStateKt.derivedStateOf(new e(this, 3));
        this.e = SnapshotStateKt.derivedStateOf(new e(this, 2));
        this.f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.g = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public PagerState(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public final LazyListItemInfo a() {
        List list0 = this.a.getLayoutInfo().getVisibleItemsInfo();
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object0 = listIterator0.previous();
            if(((LazyListItemInfo)object0).getIndex() == this.getCurrentPage()) {
                return (LazyListItemInfo)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Deprecated(message = "Replaced with animateScrollToPage(page, pageOffset)", replaceWith = @ReplaceWith(expression = "animateScrollToPage(page = page, pageOffset = pageOffset)", imports = {}))
    @Nullable
    public final Object animateScrollToPage(@IntRange(from = 0L) int v, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull AnimationSpec animationSpec0, float f1, boolean z, @NotNull Continuation continuation0) {
        Object object0 = this.animateScrollToPage(v, f, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object animateScrollToPage(@IntRange(from = 0L) int v, @FloatRange(from = -1.0, to = 1.0) float f, @NotNull Continuation continuation0) {
        int v4;
        PagerState pagerState1;
        PagerState pagerState0;
        int v3;
        Throwable throwable1;
        t t0;
        if(continuation0 instanceof t) {
            t0 = (t)continuation0;
            int v1 = t0.u;
            if((v1 & 0x80000000) == 0) {
                t0 = new t(this, continuation0);
            }
            else {
                t0.u = v1 ^ 0x80000000;
            }
        }
        else {
            t0 = new t(this, continuation0);
        }
        Object object0 = t0.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Object object2 = null;
        switch(t0.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PagerState.b(v);
                PagerState.c(f);
                try {
                    this.f.setValue(Boxing.boxInt(v));
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    pagerState0 = this;
                    pagerState0.onScrollFinished$pager_release();
                    throw throwable1;
                }
                try {
                    int v2 = this.a.getFirstVisibleItemIndex();
                    if(Math.abs(v - v2) > 3) {
                        t0.o = this;
                        t0.p = v;
                        t0.r = f;
                        t0.u = 1;
                        if(LazyListState.scrollToItem$default(this.a, (v <= v2 ? v + 3 : v - 3), 0, t0, 2, null) == object1) {
                            return object1;
                        }
                    }
                    v3 = v;
                    pagerState0 = this;
                    goto label_45;
                }
                catch(Throwable throwable1) {
                }
                pagerState0 = this;
                pagerState0.onScrollFinished$pager_release();
                throw throwable1;
            }
            case 1: {
                try {
                    f = t0.r;
                    v = t0.p;
                    pagerState1 = t0.o;
                    ResultKt.throwOnFailure(object0);
                    v3 = v;
                    pagerState0 = pagerState1;
                }
                catch(Throwable throwable1) {
                    pagerState0 = pagerState1;
                    pagerState0.onScrollFinished$pager_release();
                    throw throwable1;
                }
                try {
                label_45:
                    if(Float.compare(Math.abs(f), 0.005f) > 0) {
                        u u0 = new u(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
                        t0.o = pagerState0;
                        t0.p = v3;
                        t0.r = f;
                        t0.u = 3;
                        if(ScrollableState.scroll$default(pagerState0.a, null, u0, t0, 1, null) == object1) {
                            return object1;
                        }
                        v4 = v3;
                        goto label_72;
                    }
                    else {
                        t0.o = pagerState0;
                        t0.u = 2;
                        if(LazyListState.animateScrollToItem$default(pagerState0.a, v3, 0, t0, 2, null) == object1) {
                            return object1;
                        }
                    }
                    break;
                }
                catch(Throwable throwable1) {
                    pagerState0.onScrollFinished$pager_release();
                    throw throwable1;
                }
            }
            case 2: {
                pagerState0 = t0.o;
                goto label_120;
            }
            case 3: {
                try {
                    float f1 = t0.r;
                    int v5 = t0.p;
                    pagerState1 = t0.o;
                    ResultKt.throwOnFailure(object0);
                    f = f1;
                    pagerState0 = pagerState1;
                    v4 = v5;
                }
                catch(Throwable throwable1) {
                    pagerState0 = pagerState1;
                    pagerState0.onScrollFinished$pager_release();
                    throw throwable1;
                }
                try {
                label_72:
                    Object object3 = null;
                    LazyListLayoutInfo lazyListLayoutInfo0 = pagerState0.a.getLayoutInfo();
                    for(Object object4: lazyListLayoutInfo0.getVisibleItemsInfo()) {
                        if(((LazyListItemInfo)object4).getIndex() == v4) {
                            object3 = object4;
                            break;
                        }
                    }
                    LazyListState lazyListState0 = pagerState0.a;
                    if(((LazyListItemInfo)object3) != null) {
                        int v6 = c.roundToInt(((float)(((LazyListItemInfo)object3).getSize() + pagerState0.getItemSpacing$pager_release())) * f);
                        t0.o = pagerState0;
                        t0.u = 4;
                        if(lazyListState0.animateScrollToItem(v4, v6, t0) == object1) {
                            return object1;
                        }
                    }
                    else if(!lazyListLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
                        int v7 = ((LazyListItemInfo)CollectionsKt___CollectionsKt.first(lazyListLayoutInfo0.getVisibleItemsInfo())).getSize() + pagerState0.getItemSpacing$pager_release();
                        int v8 = c.roundToInt(((float)v7) * f);
                        t0.o = pagerState0;
                        t0.p = v4;
                        t0.r = f;
                        t0.q = v7;
                        t0.u = 5;
                        if(lazyListState0.animateScrollToItem(v4, v8, t0) == object1) {
                            return object1;
                        label_98:
                            int v9 = t0.q;
                            f = t0.r;
                            v4 = t0.p;
                            PagerState pagerState2 = t0.o;
                            pagerState0 = pagerState2;
                            ResultKt.throwOnFailure(object0);
                            v7 = v9;
                            pagerState0 = pagerState2;
                        }
                        for(Object object5: pagerState0.a.getLayoutInfo().getVisibleItemsInfo()) {
                            if(((LazyListItemInfo)object5).getIndex() == v4) {
                                object2 = object5;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                        if(((LazyListItemInfo)object2) != null && ((LazyListItemInfo)object2).getSize() + pagerState0.getItemSpacing$pager_release() != v7) {
                            int v10 = c.roundToInt(((float)(((LazyListItemInfo)object2).getSize() + pagerState0.getItemSpacing$pager_release())) * f);
                            t0.o = pagerState0;
                            t0.u = 6;
                            if(pagerState0.a.animateScrollToItem(v4, v10, t0) == object1) {
                                return object1;
                            label_119:
                                pagerState0 = t0.o;
                            label_120:
                                ResultKt.throwOnFailure(object0);
                            }
                        }
                    }
                    break;
                }
                catch(Throwable throwable1) {
                    pagerState0.onScrollFinished$pager_release();
                    throw throwable1;
                }
            }
            case 4: {
                pagerState0 = t0.o;
                goto label_120;
            }
            case 5: {
                goto label_98;
            }
            case 6: {
                goto label_119;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pagerState0.onScrollFinished$pager_release();
        return Unit.INSTANCE;
    }

    public static Object animateScrollToPage$default(PagerState pagerState0, int v, float f, AnimationSpec animationSpec0, float f1, boolean z, Continuation continuation0, int v1, Object object0) {
        float f2 = (v1 & 2) == 0 ? f : 0.0f;
        AnimationSpec animationSpec1 = (v1 & 4) == 0 ? animationSpec0 : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        float f3 = (v1 & 8) == 0 ? f1 : 0.0f;
        return (v1 & 16) == 0 ? pagerState0.animateScrollToPage(v, f2, animationSpec1, f3, z, continuation0) : pagerState0.animateScrollToPage(v, f2, animationSpec1, f3, true, continuation0);
    }

    public static Object animateScrollToPage$default(PagerState pagerState0, int v, float f, Continuation continuation0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState0.animateScrollToPage(v, f, continuation0);
    }

    public static void b(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("page[" + v + "] must be >= 0").toString());
        }
    }

    public static void c(float f) {
        if(-1.0f > f || f > 1.0f) {
            throw new IllegalArgumentException("pageOffset must be >= -1 and <= 1");
        }
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.a.dispatchRawDelta(f);
    }

    @IntRange(from = 0L)
    public final int getCurrentPage() {
        return ((Number)this.b.getValue()).intValue();
    }

    public final float getCurrentPageOffset() {
        return ((Number)this.e.getValue()).floatValue();
    }

    @Nullable
    public final Function0 getFlingAnimationTarget$pager_release() {
        return (Function0)this.g.getValue();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.a.getInteractionSource();
    }

    public final int getItemSpacing$pager_release() {
        return ((Number)this.c.getValue()).intValue();
    }

    @NotNull
    public final LazyListState getLazyListState$pager_release() {
        return this.a;
    }

    @Nullable
    public final LazyListItemInfo getMostVisiblePageLayoutInfo$pager_release() {
        LazyListLayoutInfo lazyListLayoutInfo0 = this.a.getLayoutInfo();
        Iterator iterator0 = lazyListLayoutInfo0.getVisibleItemsInfo().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return (LazyListItemInfo)object0;
        }
        int v = Math.max(((LazyListItemInfo)object0).getOffset(), 0);
        int v1 = ((LazyListItemInfo)object0).getOffset();
        int v2 = Math.min(((LazyListItemInfo)object0).getSize() + v1, lazyListLayoutInfo0.getViewportEndOffset() - lazyListLayoutInfo0.getAfterContentPadding()) - v;
        do {
            Object object1 = iterator0.next();
            int v3 = Math.max(((LazyListItemInfo)object1).getOffset(), 0);
            int v4 = ((LazyListItemInfo)object1).getOffset();
            int v5 = Math.min(((LazyListItemInfo)object1).getSize() + v4, lazyListLayoutInfo0.getViewportEndOffset() - lazyListLayoutInfo0.getAfterContentPadding()) - v3;
            if(v2 < v5) {
                object0 = object1;
                v2 = v5;
            }
        }
        while(iterator0.hasNext());
        return (LazyListItemInfo)object0;
    }

    @IntRange(from = 0L)
    public final int getPageCount() {
        return ((Number)this.d.getValue()).intValue();
    }

    @Deprecated(message = "pageCount is deprecated, use androidx.compose.foundation.pager.PagerState.canScrollForward or androidx.compose.foundation.pager.PagerState.canScrollBackward")
    public static void getPageCount$annotations() {
    }

    public final int getTargetPage() {
        Integer integer0 = (Integer)this.f.getValue();
        if(integer0 == null) {
            Function0 function00 = this.getFlingAnimationTarget$pager_release();
            integer0 = function00 == null ? null : ((Integer)function00.invoke());
            if(integer0 == null) {
                if(!this.isScrollInProgress()) {
                    return this.getCurrentPage();
                }
                if(Math.abs(this.getCurrentPageOffset()) < 0.001f) {
                    return this.getCurrentPage();
                }
                return this.getCurrentPageOffset() < 0.0f ? kotlin.ranges.c.coerceAtLeast(this.getCurrentPage() - 1, 0) : kotlin.ranges.c.coerceAtMost(this.getCurrentPage() + 1, this.getPageCount() - 1);
            }
        }
        return (int)integer0;
    }

    @Deprecated(message = "targetPage is deprecated in favor of currentPage as currentPage property isnow being updated right after we over scrolled the half of the previous current page.If you still think that you need targetPage, not currentPage please file a bug as we are planning to remove this property in future.", replaceWith = @ReplaceWith(expression = "currentPage", imports = {}))
    public static void getTargetPage$annotations() {
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.a.isScrollInProgress();
    }

    public final void onScrollFinished$pager_release() {
        this.f.setValue(null);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = this.a.scroll(mutatePriority0, function20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollToPage(@IntRange(from = 0L) int v, @FloatRange(from = -1.0, to = 1.0) float f, @NotNull Continuation continuation0) {
        PagerState pagerState0;
        Object object1;
        Object object0;
        v v1;
        if(continuation0 instanceof v) {
            v1 = (v)continuation0;
            int v2 = v1.s;
            if((v2 & 0x80000000) == 0) {
                v1 = new v(this, continuation0);
            }
            else {
                v1.s = v2 ^ 0x80000000;
            }
        }
        else {
            v1 = new v(this, continuation0);
        }
        try {
            object0 = v1.q;
            object1 = a.getCOROUTINE_SUSPENDED();
            switch(v1.s) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_32;
                }
                case 2: {
                    goto label_44;
                }
            }
        }
        catch(Throwable throwable0) {
            pagerState0.onScrollFinished$pager_release();
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        PagerState.b(v);
        PagerState.c(f);
        try {
            this.f.setValue(Boxing.boxInt(v));
        }
        catch(Throwable throwable1) {
            throwable0 = throwable1;
            pagerState0 = this;
            pagerState0.onScrollFinished$pager_release();
            throw throwable0;
        }
        try {
            v1.o = this;
            v1.p = f;
            v1.s = 1;
            if(LazyListState.scrollToItem$default(this.a, v, 0, v1, 2, null) == object1) {
                return object1;
            }
            pagerState0 = this;
            goto label_35;
        }
        catch(Throwable throwable0) {
        }
        pagerState0 = this;
        pagerState0.onScrollFinished$pager_release();
        throw throwable0;
        try {
        label_32:
            f = v1.p;
            pagerState0 = v1.o;
            ResultKt.throwOnFailure(object0);
        label_35:
            pagerState0.updateCurrentPageBasedOnLazyListState$pager_release();
            if(Math.abs(f) > 0.0001f) {
                LazyListItemInfo lazyListItemInfo0 = pagerState0.a();
                if(lazyListItemInfo0 != null) {
                    w w0 = new w(lazyListItemInfo0, pagerState0, f, null);
                    v1.o = pagerState0;
                    v1.s = 2;
                    if(ScrollableState.scroll$default(pagerState0, null, w0, v1, 1, null) == object1) {
                        return object1;
                    label_44:
                        pagerState0 = v1.o;
                        ResultKt.throwOnFailure(object0);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            pagerState0.onScrollFinished$pager_release();
            throw throwable0;
        }
        pagerState0.onScrollFinished$pager_release();
        return Unit.INSTANCE;
    }

    public static Object scrollToPage$default(PagerState pagerState0, int v, float f, Continuation continuation0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState0.scrollToPage(v, f, continuation0);
    }

    public final void setCurrentPage$pager_release(int v) {
        MutableState mutableState0 = this.b;
        if(v != ((Number)mutableState0.getValue()).intValue()) {
            mutableState0.setValue(v);
        }
    }

    public final void setFlingAnimationTarget$pager_release(@Nullable Function0 function00) {
        this.g.setValue(function00);
    }

    public final void setItemSpacing$pager_release(int v) {
        this.c.setValue(v);
    }

    @Override
    @NotNull
    public String toString() {
        return "PagerState(pageCount=" + this.getPageCount() + ", currentPage=" + this.getCurrentPage() + ", currentPageOffset=" + this.getCurrentPageOffset() + ')';
    }

    public final void updateCurrentPageBasedOnLazyListState$pager_release() {
        LazyListItemInfo lazyListItemInfo0 = this.getMostVisiblePageLayoutInfo$pager_release();
        if(lazyListItemInfo0 != null) {
            this.setCurrentPage$pager_release(lazyListItemInfo0.getIndex());
        }
    }
}

