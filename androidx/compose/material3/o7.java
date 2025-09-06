package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.SendingCollector;
import kotlinx.coroutines.flow.internal.c;
import kotlinx.coroutines.flow.internal.d;
import kotlinx.coroutines.sync.Semaphore;
import qd.a;

public final class o7 implements FlowCollector {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public o7(int v, Object object0, Object object1, Object object2, Object object3) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        this.d = object2;
        this.e = object3;
        super();
    }

    public Object a(Flow flow0, Continuation continuation0) {
        o7 o70;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.s;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.s = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Job job0 = (Job)this.b;
                if(job0 != null) {
                    JobKt.ensureActive(job0);
                }
                d0.o = this;
                d0.p = flow0;
                d0.s = 1;
                if(((Semaphore)this.c).acquire(d0) == object1) {
                    return object1;
                }
                o70 = this;
                break;
            }
            case 1: {
                flow0 = d0.p;
                o70 = d0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        c c0 = new c(flow0, ((SendingCollector)o70.e), ((Semaphore)o70.c), null);
        BuildersKt.launch$default(((ProducerScope)o70.d), null, null, c0, 3, null);
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        switch(this.a) {
            case 0: {
                ((Number)object0).intValue();
                int v = ((LazyListState)this.b).getFirstVisibleItemIndex();
                int v1 = ((LazyListState)this.b).getFirstVisibleItemIndex();
                Long long0 = Boxing.boxLong(((CalendarModel)this.d).getMonth(((IntRange)this.e).getFirst() + v / 12, v1 % 12 + 1).getStartUtcTimeMillis());
                ((Function1)this.c).invoke(long0);
                return Unit.INSTANCE;
            }
            case 1: {
                LegacyTextFieldState legacyTextFieldState0 = (LegacyTextFieldState)this.b;
                if(((Boolean)object0).booleanValue() && legacyTextFieldState0.getHasFocus()) {
                    TextFieldValue textFieldValue0 = ((TextFieldSelectionManager)this.d).getValue$foundation_release();
                    CoreTextFieldKt.access$startInputSession(((TextInputService)this.c), legacyTextFieldState0, textFieldValue0, ((ImeOptions)this.e), ((TextFieldSelectionManager)this.d).getOffsetMapping$foundation_release());
                    return Unit.INSTANCE;
                }
                CoreTextFieldKt.access$endInputSession(legacyTextFieldState0);
                return Unit.INSTANCE;
            }
            default: {
                return this.a(((Flow)object0), continuation0);
            }
        }
    }
}

