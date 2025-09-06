package d;

import androidx.room.Room;
import com.kakao.kandinsky.history.HistoryDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class j implements Factory {
    public final h a;

    public j(h h0) {
        this.a = h0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        return (HistoryDatabase)Preconditions.checkNotNullFromProvides(((HistoryDatabase)Room.databaseBuilder(this.a.a, HistoryDatabase.class, "history-db").fallbackToDestructiveMigration().build()));
    }
}

