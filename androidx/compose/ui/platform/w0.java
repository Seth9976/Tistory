package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.Owner;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class w0 {
    public final w0 a;
    public final MutableState b;

    public w0(PlatformTextInputInterceptor platformTextInputInterceptor0, w0 w00) {
        this.a = w00;
        this.b = SnapshotStateKt.mutableStateOf$default(platformTextInputInterceptor0, null, 2, null);
    }

    public final Object a(Owner owner0, Function2 function20, ContinuationImpl continuationImpl0) {
        r0 r00;
        if(continuationImpl0 instanceof r0) {
            r00 = (r0)continuationImpl0;
            int v = r00.q;
            if((v & 0x80000000) == 0) {
                r00 = new r0(this, continuationImpl0);
            }
            else {
                r00.q = v ^ 0x80000000;
            }
        }
        else {
            r00 = new r0(this, continuationImpl0);
        }
        Object object0 = r00.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                v0 v00 = new v0(function20, this, null);
                r00.q = 1;
                if(PlatformTextInputModifierNodeKt.a(owner0, this.a, v00, r00) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }
}

