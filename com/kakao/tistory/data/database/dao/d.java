package com.kakao.tistory.data.database.dao;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

public final class d implements Callable {
    public final AutoSaveDao_Impl a;

    public d(AutoSaveDao_Impl autoSaveDao_Impl0) {
        this.a = autoSaveDao_Impl0;
        super();
    }

    @Override
    public final Object call() {
        SupportSQLiteStatement supportSQLiteStatement0 = this.a.d.acquire();
        try {
            this.a.a.beginTransaction();
            try {
                supportSQLiteStatement0.executeUpdateDelete();
                this.a.a.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                this.a.a.endTransaction();
                throw throwable0;
            }
            this.a.a.endTransaction();
            return Unit.INSTANCE;
        }
        finally {
            this.a.d.release(supportSQLiteStatement0);
        }
    }
}

