package androidx.work.impl.model;

import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A!\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A-\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000B0\u0003*\u00020\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\r\u001A-\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000B0\u0003*\u00020\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\t¢\u0006\u0004\b\u000F\u0010\r\u001A3\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000B0\u0003*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000B0\u00032\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "Ljava/util/UUID;", "id", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/WorkInfo;", "getWorkStatusPojoFlowDataForIds", "(Landroidx/work/impl/model/WorkSpecDao;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "name", "", "getWorkStatusPojoFlowForName", "(Landroidx/work/impl/model/WorkSpecDao;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "tag", "getWorkStatusPojoFlowForTag", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "dedup", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineDispatcher;)Lkotlinx/coroutines/flow/Flow;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWorkSpecDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,522:1\n53#2:523\n55#2:527\n53#2:528\n55#2:532\n50#3:524\n55#3:526\n50#3:529\n55#3:531\n106#4:525\n106#4:530\n*S KotlinDebug\n*F\n+ 1 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n*L\n489#1:523\n489#1:527\n503#1:528\n503#1:532\n489#1:524\n489#1:526\n503#1:529\n503#1:531\n489#1:525\n503#1:530\n*E\n"})
public final class WorkSpecDaoKt {
    @NotNull
    public static final Flow dedup(@NotNull Flow flow0, @NotNull CoroutineDispatcher coroutineDispatcher0) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "dispatcher");
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                androidx.work.impl.model.WorkSpecDaoKt.dedup..inlined.map.1.2 workSpecDaoKt$dedup$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        androidx.work.impl.model.WorkSpecDaoKt.dedup..inlined.map.1.2.1 workSpecDaoKt$dedup$$inlined$map$1$2$10;
                        if(continuation0 instanceof androidx.work.impl.model.WorkSpecDaoKt.dedup..inlined.map.1.2.1) {
                            workSpecDaoKt$dedup$$inlined$map$1$2$10 = (androidx.work.impl.model.WorkSpecDaoKt.dedup..inlined.map.1.2.1)continuation0;
                            int v = workSpecDaoKt$dedup$$inlined$map$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                workSpecDaoKt$dedup$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int p;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.o = object0;
                                        this.p |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                workSpecDaoKt$dedup$$inlined$map$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            workSpecDaoKt$dedup$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int p;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.p |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = workSpecDaoKt$dedup$$inlined$map$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(workSpecDaoKt$dedup$$inlined$map$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                                for(Object object3: ((List)object0)) {
                                    arrayList0.add(((WorkInfoPojo)object3).toWorkInfo());
                                }
                                workSpecDaoKt$dedup$$inlined$map$1$2$10.p = 1;
                                return this.a.emit(arrayList0, workSpecDaoKt$dedup$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = flow0.collect(workSpecDaoKt$dedup$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }), coroutineDispatcher0);
    }

    @NotNull
    public static final Flow getWorkStatusPojoFlowDataForIds(@NotNull WorkSpecDao workSpecDao0, @NotNull UUID uUID0) {
        Intrinsics.checkNotNullParameter(workSpecDao0, "<this>");
        Intrinsics.checkNotNullParameter(uUID0, "id");
        return FlowKt.distinctUntilChanged(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds..inlined.map.1.2 workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds..inlined.map.1.2.1 workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10;
                        if(continuation0 instanceof androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds..inlined.map.1.2.1) {
                            workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10 = (androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds..inlined.map.1.2.1)continuation0;
                            int v = workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int p;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.o = object0;
                                        this.p |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int p;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.p |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                WorkInfoPojo workSpec$WorkInfoPojo0 = (WorkInfoPojo)CollectionsKt___CollectionsKt.firstOrNull(((List)object0));
                                WorkInfo workInfo0 = workSpec$WorkInfoPojo0 == null ? null : workSpec$WorkInfoPojo0.toWorkInfo();
                                workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10.p = 1;
                                return this.a.emit(workInfo0, workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = workSpecDao0.getWorkStatusPojoFlowDataForIds(k.listOf(String.valueOf(uUID0))).collect(workSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        });
    }

    @NotNull
    public static final Flow getWorkStatusPojoFlowForName(@NotNull WorkSpecDao workSpecDao0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(workSpecDao0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "dispatcher");
        Intrinsics.checkNotNullParameter(s, "name");
        return WorkSpecDaoKt.dedup(workSpecDao0.getWorkStatusPojoFlowForName(s), coroutineDispatcher0);
    }

    @NotNull
    public static final Flow getWorkStatusPojoFlowForTag(@NotNull WorkSpecDao workSpecDao0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(workSpecDao0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "dispatcher");
        Intrinsics.checkNotNullParameter(s, "tag");
        return WorkSpecDaoKt.dedup(workSpecDao0.getWorkStatusPojoFlowForTag(s), coroutineDispatcher0);
    }
}

