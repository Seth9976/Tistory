package e;

import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import com.kakao.kandinsky.history.KPhotoKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;

public abstract class a {
    public static Object a(g g0, List list0, Continuation continuation0) {
        q q1;
        g g2;
        Iterator iterator0;
        g g1;
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.e;
            if((v & 0x80000000) == 0) {
                b0 = new b(continuation0);
            }
            else {
                b0.e = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(continuation0);
        }
        Object object0 = b0.d;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(b0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g1 = g0;
                iterator0 = list0.iterator();
                break;
            }
            case 1: {
                q q0 = b0.c;
                Iterator iterator1 = b0.b;
                g2 = b0.a;
                ResultKt.throwOnFailure(object0);
                q1 = q0;
                iterator0 = iterator1;
                goto label_38;
            }
            case 2: {
                iterator0 = b0.b;
                g1 = b0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            q1 = (q)object2;
            b0.a = g1;
            b0.b = iterator0;
            b0.c = q1;
            b0.e = 1;
            g2 = (p)g1;
            m m0 = new m(((p)g2), q1.b, q1.a, -1);
            if(CoroutinesRoom.execute(g2.a, true, m0, b0) == object1) {
                return object1;
            }
        label_38:
            b0.a = g2;
            b0.b = iterator0;
            b0.c = null;
            b0.e = 2;
            g1 = (p)g2;
            k k0 = new k(((p)g1), q1);
            if(CoroutinesRoom.execute(g1.a, true, k0, b0) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }

    public static Object b(g g0, List list0, Continuation continuation0) {
        Iterator iterator0;
        g g1;
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.d;
            if((v & 0x80000000) == 0) {
                c0 = new c(continuation0);
            }
            else {
                c0.d = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(continuation0);
        }
        Object object0 = c0.c;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(c0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g1 = g0;
                iterator0 = list0.iterator();
                break;
            }
            case 1: {
                iterator0 = c0.b;
                g1 = c0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            c0.a = g1;
            c0.b = iterator0;
            c0.d = 1;
            g1 = (p)g1;
            m m0 = new m(((p)g1), ((q)object2).b, ((q)object2).a, 0);
            if(CoroutinesRoom.execute(g1.a, true, m0, c0) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }

    public static Object c(g g0, List list0, Continuation continuation0) {
        g g2;
        Collection collection1;
        Iterator iterator1;
        Iterator iterator0;
        Collection collection0;
        g g1;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.f;
            if((v & 0x80000000) == 0) {
                d0 = new d(continuation0);
            }
            else {
                d0.f = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(continuation0);
        }
        Object object0 = d0.e;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(d0.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g1 = g0;
                collection0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                iterator0 = list0.iterator();
                goto label_31;
            }
            case 1: {
                collection0 = d0.d;
                iterator1 = d0.c;
                collection1 = d0.b;
                g2 = d0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            q q0 = (q)object0;
            Iterator iterator2 = iterator1;
            g1 = g2;
            d d1 = d0;
            while(true) {
                collection0.add(q0);
                iterator0 = iterator2;
                collection0 = collection1;
                d0 = d1;
            label_31:
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object2 = iterator0.next();
                KPhotoKey kPhotoKey0 = (KPhotoKey)object2;
                if(kPhotoKey0.getId() != null) {
                    d0.a = g1;
                    d0.b = collection0;
                    d0.c = iterator0;
                    d0.d = collection0;
                    d0.f = 1;
                    ((p)g1).getClass();
                    RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM history WHERE uri = ? AND id = ? ORDER BY step DESC LIMIT 1", 2);
                    roomSQLiteQuery0.bindString(1, kPhotoKey0.getUri());
                    roomSQLiteQuery0.bindLong(2, ((long)kPhotoKey0.getId()));
                    CancellationSignal cancellationSignal0 = DBUtil.createCancellationSignal();
                    n n0 = new n(((p)g1), roomSQLiteQuery0);
                    Object object3 = CoroutinesRoom.execute(((p)g1).a, false, cancellationSignal0, n0, d0);
                    if(object3 == object1) {
                        return object1;
                    }
                    g2 = (p)g1;
                    iterator1 = iterator0;
                    object0 = object3;
                    collection1 = collection0;
                    break;
                }
                d1 = d0;
                iterator2 = iterator0;
                q0 = null;
                collection1 = collection0;
            }
        }
        return (List)collection0;
    }

    public static Object d(g g0, List list0, Continuation continuation0) {
        g g1;
        Collection collection2;
        Iterator iterator1;
        q q0;
        Collection collection1;
        Iterator iterator0;
        Collection collection0;
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v = e0.g;
            if((v & 0x80000000) == 0) {
                e0 = new e(continuation0);
            }
            else {
                e0.g = v ^ 0x80000000;
            }
        }
        else {
            e0 = new e(continuation0);
        }
        Object object0 = e0.f;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(e0.g) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                collection0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                iterator0 = list0.iterator();
                goto label_35;
            }
            case 1: {
                collection1 = e0.e;
                q0 = e0.d;
                iterator1 = e0.c;
                collection2 = e0.b;
                g1 = e0.a;
                ResultKt.throwOnFailure(object0);
                goto label_58;
            }
            case 2: {
                collection1 = e0.e;
                q0 = e0.d;
                iterator1 = e0.c;
                collection2 = e0.b;
                g1 = e0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            q q1 = q0;
            while(true) {
                iterator0 = iterator1;
                collection1.add(q1);
                collection0 = collection2;
                g0 = g1;
            label_35:
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object2 = iterator0.next();
                e0.a = g0;
                e0.b = collection0;
                e0.c = iterator0;
                e0.d = (q)object2;
                e0.e = collection0;
                e0.g = 1;
                ((p)g0).getClass();
                RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM history WHERE uri = ? AND id = ? ORDER BY step DESC LIMIT 1", 2);
                roomSQLiteQuery0.bindString(1, ((q)object2).b);
                roomSQLiteQuery0.bindLong(2, ((q)object2).a);
                CancellationSignal cancellationSignal0 = DBUtil.createCancellationSignal();
                n n0 = new n(((p)g0), roomSQLiteQuery0);
                Object object3 = CoroutinesRoom.execute(((p)g0).a, false, cancellationSignal0, n0, e0);
                if(object3 == object1) {
                    return object1;
                }
                g1 = (p)g0;
                collection1 = collection0;
                object0 = object3;
                collection2 = collection1;
                iterator1 = iterator0;
                q0 = (q)object2;
            label_58:
                if(((q)object0) != null) {
                    q1 = (q)object0;
                    continue;
                }
                e0.a = g1;
                e0.b = collection2;
                e0.c = iterator1;
                e0.d = q0;
                e0.e = collection1;
                e0.g = 2;
                g1 = (p)g1;
                k k0 = new k(((p)g1), q0);
                if(CoroutinesRoom.execute(g1.a, true, k0, e0) != object1) {
                    break;
                }
                return object1;
            }
        }
        return (List)collection0;
    }

    public static Object e(g g0, List list0, Continuation continuation0) {
        Iterator iterator0;
        g g1;
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v = f0.d;
            if((v & 0x80000000) == 0) {
                f0 = new f(continuation0);
            }
            else {
                f0.d = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(continuation0);
        }
        Object object0 = f0.c;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(f0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g1 = g0;
                iterator0 = list0.iterator();
                break;
            }
            case 1: {
                iterator0 = f0.b;
                g1 = f0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            f0.a = g1;
            f0.b = iterator0;
            f0.d = 1;
            g1 = (p)g1;
            if(((p)g1).a(((q)object2), f0) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}

