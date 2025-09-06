package com.kakao.tistory.data.database.dao;

import com.kakao.tistory.data.database.entity.AutoSavedModel;
import java.util.concurrent.Callable;
import kotlin.Unit;

public final class c implements Callable {
    public final AutoSavedModel a;
    public final AutoSaveDao_Impl b;

    public c(AutoSaveDao_Impl autoSaveDao_Impl0, AutoSavedModel autoSavedModel0) {
        this.b = autoSaveDao_Impl0;
        this.a = autoSavedModel0;
        super();
    }

    @Override
    public final Object call() {
        this.b.a.beginTransaction();
        try {
            this.b.b.insert(this.a);
            this.b.a.setTransactionSuccessful();
            return Unit.INSTANCE;
        }
        finally {
            this.b.a.endTransaction();
        }
    }
}

