package e;

import androidx.room.EntityInsertionAdapter;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kakao.kandinsky.history.HistoryDatabase;

public final class h extends EntityInsertionAdapter {
    public h(HistoryDatabase historyDatabase0) {
        super(historyDatabase0);
    }

    @Override  // androidx.room.EntityInsertionAdapter
    public final void bind(SupportSQLiteStatement supportSQLiteStatement0, Object object0) {
        supportSQLiteStatement0.bindLong(1, ((q)object0).a);
        supportSQLiteStatement0.bindString(2, ((q)object0).b);
        supportSQLiteStatement0.bindLong(3, ((long)((q)object0).c));
        supportSQLiteStatement0.bindLong(4, ((q)object0).d);
        supportSQLiteStatement0.bindString(5, ((q)object0).e);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `history` (`id`,`uri`,`step`,`lastUpdatedTime`,`json`) VALUES (?,?,?,?,?)";
    }
}

