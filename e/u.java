package e;

import a.o2;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.history.KPhotoKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qd.a;

public final class u {
    public final g a;
    public long b;

    public u(g g0) {
        Intrinsics.checkNotNullParameter(g0, "historyDao");
        super();
        this.a = g0;
        this.b = System.currentTimeMillis();
    }

    public final q a(KDPhoto kDPhoto0) {
        long v;
        Long long0 = kDPhoto0.getId();
        if(long0 == null) {
            v = this.b;
            this.b = v + 1L;
        }
        else {
            v = (long)long0;
        }
        o2.b.getSerializersModule();
        return new q(v, kDPhoto0.getOriginalUri(), kDPhoto0.getStep(), System.currentTimeMillis(), o2.b.encodeToString(KDPhoto.Companion.serializer(), kDPhoto0));
    }

    public final Object a(KPhotoKey kPhotoKey0, Continuation continuation0) {
        u u0;
        s s0;
        if(continuation0 instanceof s) {
            s0 = (s)continuation0;
            int v = s0.d;
            if((v & 0x80000000) == 0) {
                s0 = new s(this, continuation0);
            }
            else {
                s0.d = v ^ 0x80000000;
            }
        }
        else {
            s0 = new s(this, continuation0);
        }
        Object object0 = s0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(kPhotoKey0.getId() == null) {
                    return null;
                }
                s0.a = this;
                s0.d = 1;
                ((p)this.a).getClass();
                RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM history WHERE uri = ? AND id = ? ORDER BY step DESC LIMIT 1", 2);
                roomSQLiteQuery0.bindString(1, kPhotoKey0.getUri());
                roomSQLiteQuery0.bindLong(2, ((long)kPhotoKey0.getId()));
                CancellationSignal cancellationSignal0 = DBUtil.createCancellationSignal();
                n n0 = new n(((p)this.a), roomSQLiteQuery0);
                object0 = CoroutinesRoom.execute(((p)this.a).a, false, cancellationSignal0, n0, s0);
                if(object0 == object1) {
                    return object1;
                }
                u0 = this;
                break;
            }
            case 1: {
                u0 = s0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((q)object0) != null) {
            u0.getClass();
            return (KDPhoto)o2.b.decodeFromString(KDPhoto.Companion.serializer(), ((q)object0).e);
        }
        return null;
    }

    public final Object a(List list0, Continuation continuation0) {
        u u0;
        r r0;
        if(continuation0 instanceof r) {
            r0 = (r)continuation0;
            int v = r0.d;
            if((v & 0x80000000) == 0) {
                r0 = new r(this, continuation0);
            }
            else {
                r0.d = v ^ 0x80000000;
            }
        }
        else {
            r0 = new r(this, continuation0);
        }
        Object object0 = r0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g g0 = this.a;
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object2: list0) {
                    arrayList0.add(this.a(((KDPhoto)object2)));
                }
                r0.a = this;
                r0.d = 1;
                object0 = ((p)g0).a(arrayList0, r0);
                if(object0 == object1) {
                    return object1;
                }
                u0 = this;
                break;
            }
            case 1: {
                u0 = r0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(((Iterable)object0), 10));
        for(Object object3: ((Iterable)object0)) {
            u0.getClass();
            arrayList1.add(((KDPhoto)o2.b.decodeFromString(KDPhoto.Companion.serializer(), ((q)object3).e)));
        }
        return arrayList1;
    }

    public final Object b(List list0, Continuation continuation0) {
        u u0;
        t t0;
        if(continuation0 instanceof t) {
            t0 = (t)continuation0;
            int v = t0.d;
            if((v & 0x80000000) == 0) {
                t0 = new t(this, continuation0);
            }
            else {
                t0.d = v ^ 0x80000000;
            }
        }
        else {
            t0 = new t(this, continuation0);
        }
        Object object0 = t0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                t0.a = this;
                t0.d = 1;
                object0 = ((p)this.a).a(list0, t0);
                if(object0 == object1) {
                    return object1;
                }
                u0 = this;
                break;
            }
            case 1: {
                u0 = t0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        List list1 = CollectionsKt___CollectionsKt.filterNotNull(((Iterable)object0));
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
        for(Object object2: list1) {
            u0.getClass();
            arrayList0.add(((KDPhoto)o2.b.decodeFromString(KDPhoto.Companion.serializer(), ((q)object2).e)));
        }
        return arrayList0;
    }
}

