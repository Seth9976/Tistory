package e;

import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import com.kakao.kandinsky.history.HistoryDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import wc.a;
import wc.b;

public final class p implements g {
    public final RoomDatabase a;
    public final h b;
    public final i c;
    public final j d;

    public p(HistoryDatabase historyDatabase0) {
        this.a = historyDatabase0;
        this.b = new h(historyDatabase0);
        this.c = new i(historyDatabase0);
        this.d = new j(historyDatabase0);
    }

    public final Object a(q q0, Continuation continuation0) {
        a a0 = new a(this, q0, 0);
        return RoomDatabaseKt.withTransaction(this.a, a0, continuation0);
    }

    public final Object a(ArrayList arrayList0, r r0) {
        b b0 = new b(this, arrayList0, 0);
        return RoomDatabaseKt.withTransaction(this.a, b0, r0);
    }

    public final Object a(ArrayList arrayList0, Continuation continuation0) {
        b b0 = new b(this, arrayList0, 1);
        return RoomDatabaseKt.withTransaction(this.a, b0, continuation0);
    }

    public final Object a(List list0, t t0) {
        a a0 = new a(this, list0, 1);
        return RoomDatabaseKt.withTransaction(this.a, a0, t0);
    }

    public final Object a(List list0, Continuation continuation0) {
        return e.a.a(this, list0, continuation0);
    }

    public final Object b(q q0, Continuation continuation0) {
        k k0 = new k(this, q0);
        Unit unit0 = CoroutinesRoom.execute(this.a, true, k0, continuation0);
        return unit0 == qd.a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public final Object b(ArrayList arrayList0, Continuation continuation0) {
        b b0 = new b(this, arrayList0, 3);
        return RoomDatabaseKt.withTransaction(this.a, b0, continuation0);
    }

    public final Object b(List list0, Continuation continuation0) {
        return e.a.b(this, list0, continuation0);
    }

    public final Object c(ArrayList arrayList0, Continuation continuation0) {
        b b0 = new b(this, arrayList0, 2);
        return RoomDatabaseKt.withTransaction(this.a, b0, continuation0);
    }

    public final Object c(List list0, Continuation continuation0) {
        return e.a.c(this, list0, continuation0);
    }

    public final Object d(List list0, Continuation continuation0) {
        return e.a.d(this, list0, continuation0);
    }

    public final Object e(List list0, Continuation continuation0) {
        return e.a.e(this, list0, continuation0);
    }
}

