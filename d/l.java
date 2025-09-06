package d;

import androidx.room.Room;
import com.kakao.kandinsky.signature.database.SignatureDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class l implements Factory {
    public final h a;

    public l(h h0) {
        this.a = h0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        return (SignatureDatabase)Preconditions.checkNotNullFromProvides(((SignatureDatabase)Room.databaseBuilder(this.a.a, SignatureDatabase.class, "signature-db").fallbackToDestructiveMigration().build()));
    }
}

