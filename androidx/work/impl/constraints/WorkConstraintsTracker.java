package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001B\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "controllers", "<init>", "(Ljava/util/List;)V", "Landroidx/work/impl/constraints/trackers/Trackers;", "trackers", "(Landroidx/work/impl/constraints/trackers/Trackers;)V", "Landroidx/work/impl/model/WorkSpec;", "spec", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "track", "(Landroidx/work/impl/model/WorkSpec;)Lkotlinx/coroutines/flow/Flow;", "workSpec", "", "areAllConstraintsMet", "(Landroidx/work/impl/model/WorkSpec;)Z", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWorkConstraintsTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,104:1\n766#2:105\n857#2,2:106\n1549#2:108\n1620#2,3:109\n766#2:117\n857#2,2:118\n287#3:112\n288#3:115\n37#4,2:113\n106#5:116\n*S KotlinDebug\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n*L\n84#1:105\n84#1:106,2\n84#1:108\n84#1:109,3\n91#1:117\n91#1:118,2\n85#1:112\n85#1:115\n85#1:113,2\n85#1:116\n*E\n"})
public final class WorkConstraintsTracker {
    public final List a;

    public WorkConstraintsTracker(@NotNull Trackers trackers0) {
        Intrinsics.checkNotNullParameter(trackers0, "trackers");
        this(CollectionsKt__CollectionsKt.listOf(new ConstraintController[]{new BatteryChargingController(trackers0.getBatteryChargingTracker()), new BatteryNotLowController(trackers0.getBatteryNotLowTracker()), new StorageNotLowController(trackers0.getStorageNotLowTracker()), new NetworkConnectedController(trackers0.getNetworkStateTracker()), new NetworkUnmeteredController(trackers0.getNetworkStateTracker()), new NetworkNotRoamingController(trackers0.getNetworkStateTracker()), new NetworkMeteredController(trackers0.getNetworkStateTracker())}));
    }

    public WorkConstraintsTracker(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "controllers");
        super();
        this.a = list0;
    }

    public final boolean areAllConstraintsMet(@NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(workSpec0, "workSpec");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            if(((ConstraintController)object0).isConstrained(workSpec0)) {
                arrayList0.add(object0);
            }
        }
        if(!arrayList0.isEmpty()) {
            Logger.get().debug("WM-WorkConstraintsTrack", "Work " + workSpec0.id + " constrained by " + CollectionsKt___CollectionsKt.joinToString$default(arrayList0, null, null, null, 0, null, a.w, 0x1F, null));
        }
        return arrayList0.isEmpty();
    }

    @NotNull
    public final Flow track(@NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(workSpec0, "spec");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            if(((ConstraintController)object0).hasConstraint(workSpec0)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(((ConstraintController)object1).track());
        }
        return FlowKt.distinctUntilChanged(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                androidx.work.impl.constraints.WorkConstraintsTracker.track..inlined.combine.1.2 workConstraintsTracker$track$$inlined$combine$1$20 = new Function0() {
                    public final Flow[] w;

                    {
                        this.w = arr_flow;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return this.invoke();
                    }

                    @Nullable
                    public final Object[] invoke() {
                        return new ConstraintsState[this.w.length];
                    }
                };
                androidx.work.impl.constraints.WorkConstraintsTracker.track..inlined.combine.1.3 workConstraintsTracker$track$$inlined$combine$1$30 = new Function3() {
                    public int o;
                    public FlowCollector p;
                    public Object[] q;

                    {
                        super(3, continuation0);
                    }

                    @Override  // kotlin.jvm.functions.Function3
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.invoke(((FlowCollector)object0), ((Object[])object1), ((Continuation)object2));
                    }

                    @Nullable
                    public final Object invoke(@NotNull FlowCollector flowCollector0, @NotNull Object[] arr_object, @Nullable Continuation continuation0) {
                        androidx.work.impl.constraints.WorkConstraintsTracker.track..inlined.combine.1.3 workConstraintsTracker$track$$inlined$combine$1$30 = new androidx.work.impl.constraints.WorkConstraintsTracker.track..inlined.combine.1.3(continuation0);
                        workConstraintsTracker$track$$inlined$combine$1$30.p = flowCollector0;
                        workConstraintsTracker$track$$inlined$combine$1$30.q = arr_object;
                        return workConstraintsTracker$track$$inlined$combine$1$30.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        ConstraintsState constraintsState0;
                        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
                        switch(this.o) {
                            case 0: {
                                ResultKt.throwOnFailure(object0);
                                FlowCollector flowCollector0 = this.p;
                                ConstraintsState[] arr_constraintsState = (ConstraintsState[])this.q;
                                for(int v = 0; true; ++v) {
                                    constraintsState0 = null;
                                    if(v >= arr_constraintsState.length) {
                                        break;
                                    }
                                    ConstraintsState constraintsState1 = arr_constraintsState[v];
                                    if(!Intrinsics.areEqual(constraintsState1, ConstraintsMet.INSTANCE)) {
                                        constraintsState0 = constraintsState1;
                                        break;
                                    }
                                }
                                if(constraintsState0 == null) {
                                    constraintsState0 = ConstraintsMet.INSTANCE;
                                }
                                this.o = 1;
                                return flowCollector0.emit(constraintsState0, this) == object1 ? object1 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object0);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = CombineKt.combineInternal(flowCollector0, this.a, workConstraintsTracker$track$$inlined$combine$1$20, workConstraintsTracker$track$$inlined$combine$1$30, continuation0);
                return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        });
    }
}

