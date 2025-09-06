package coil.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import coil.size.Size;
import coil.size.SizeResolver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p5.e;
import qd.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0010\u001A\u00020\r*\u00020\b2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0018\u0010\u0014\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Lcoil/compose/ConstraintsSizeResolver;", "Lcoil/size/SizeResolver;", "Landroidx/compose/ui/layout/LayoutModifier;", "<init>", "()V", "Lcoil/size/Size;", "size", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "setConstraints-BRTryo0", "(J)V", "setConstraints", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConstraintsSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil/compose/ConstraintsSizeResolver\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,45:1\n60#2:46\n63#2:50\n50#3:47\n55#3:49\n107#4:48\n*S KotlinDebug\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil/compose/ConstraintsSizeResolver\n*L\n23#1:46\n23#1:50\n23#1:47\n23#1:49\n23#1:48\n*E\n"})
public final class ConstraintsSizeResolver implements LayoutModifier, SizeResolver {
    public static final int $stable;
    public final MutableStateFlow a;

    public ConstraintsSizeResolver() {
        this.a = StateFlowKt.MutableStateFlow(Constraints.box-impl(0x400200000000L));
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        Constraints constraints0 = Constraints.box-impl(v);
        this.a.setValue(constraints0);
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new e(placeable0), 4, null);
    }

    public final void setConstraints-BRTryo0(long v) {
        Constraints constraints0 = Constraints.box-impl(v);
        this.a.setValue(constraints0);
    }

    @Override  // coil.size.SizeResolver
    @Nullable
    public Object size(@NotNull Continuation continuation0) {
        return FlowKt.first(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                coil.compose.ConstraintsSizeResolver.size..inlined.mapNotNull.1.2 constraintsSizeResolver$size$$inlined$mapNotNull$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        coil.compose.ConstraintsSizeResolver.size..inlined.mapNotNull.1.2.1 constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10;
                        if(continuation0 instanceof coil.compose.ConstraintsSizeResolver.size..inlined.mapNotNull.1.2.1) {
                            constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10 = (coil.compose.ConstraintsSizeResolver.size..inlined.mapNotNull.1.2.1)continuation0;
                            int v = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                Size size0 = UtilsKt.toSizeOrNull-BRTryo0(((Constraints)object0).unbox-impl());
                                if(size0 != null) {
                                    constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10.p = 1;
                                    if(this.a.emit(size0, constraintsSizeResolver$size$$inlined$mapNotNull$1$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return Unit.INSTANCE;
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
                Object object0 = this.a.collect(constraintsSizeResolver$size$$inlined$mapNotNull$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, continuation0);
    }
}

