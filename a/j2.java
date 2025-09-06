package a;

import androidx.lifecycle.ViewModelKt;
import b.f;
import com.kakao.kandinsky.b;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.history.KPhotoKey;
import com.kakao.kandinsky.launcher.KandinskyOutput;
import com.kakao.kandinsky.launcher.KandinskyOutputItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class j2 extends SuspendLambda implements Function2 {
    public boolean a;
    public b b;
    public Map c;
    public Iterator d;
    public Map e;
    public KDPhoto f;
    public int g;
    public final List h;
    public final b i;
    public final boolean j;

    public j2(List list0, b b0, boolean z, Continuation continuation0) {
        this.h = list0;
        this.i = b0;
        this.j = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j2(this.h, this.i, this.j, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        KandinskyOutputItem kandinskyOutputItem0;
        Object object3;
        Map map2;
        b b2;
        KDPhoto kDPhoto0;
        Iterator iterator2;
        Map map0;
        b b0;
        boolean z;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.g) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.h, 10));
                for(Object object2: this.h) {
                    arrayList0.add(KDPhoto.copy-2Ycw6ww$default(((KDPhoto)object2), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x3FFD, null));
                }
                this.i.getClass();
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.i), null, null, new t1(this.i, arrayList0, null), 3, null);
                z = this.j;
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(arrayList0, 10)), 16));
                Iterator iterator1 = arrayList0.iterator();
                b0 = this.i;
                map0 = linkedHashMap0;
                iterator2 = iterator1;
                goto label_34;
            }
            case 1: {
                z = this.a;
                kDPhoto0 = this.f;
                map0 = this.e;
                iterator2 = this.d;
                Map map1 = this.c;
                b b1 = this.b;
                ResultKt.throwOnFailure(object0);
                b2 = b1;
                map2 = map1;
                object3 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            kandinskyOutputItem0 = new KandinskyOutputItem(new KPhotoKey(kDPhoto0.getOriginalUri(), kDPhoto0.getId()), ((String)object3), (((String)object3) == null ? null : Boxing.boxInt(500)));
        label_30:
            Pair pair0 = TuplesKt.to(kDPhoto0.getOriginalUri(), kandinskyOutputItem0);
            map0.put(pair0.getFirst(), pair0.getSecond());
            map0 = map2;
            b0 = b2;
        label_34:
            if(!iterator2.hasNext()) {
                goto label_58;
            }
            Object object4 = iterator2.next();
            kDPhoto0 = (KDPhoto)object4;
            if(!kDPhoto0.isEdited()) {
                kandinskyOutputItem0 = null;
                b2 = b0;
                map2 = map0;
                goto label_30;
            }
            if(!z) {
                break;
            }
            this.b = b0;
            this.c = map0;
            this.d = iterator2;
            this.e = map0;
            this.f = kDPhoto0;
            this.a = true;
            this.g = 1;
            object3 = b0.a.a(kDPhoto0, this);
            if(object3 == object1) {
                return object1;
            }
            b2 = b0;
            map2 = map0;
        }
        kandinskyOutputItem0 = new KandinskyOutputItem(new KPhotoKey(kDPhoto0.getOriginalUri(), kDPhoto0.getId()), null, null, 4, null);
        b2 = b0;
        map2 = map0;
        goto label_30;
    label_58:
        f f0 = new f(new KandinskyOutput(map0));
        this.i.sendIntent(f0);
        return Unit.INSTANCE;
    }
}

