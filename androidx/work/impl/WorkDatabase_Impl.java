package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.RawWorkInfoDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTagDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile WorkSpecDao_Impl n;
    public volatile DependencyDao_Impl o;
    public volatile WorkTagDao_Impl p;
    public volatile SystemIdInfoDao_Impl q;
    public volatile WorkNameDao_Impl r;
    public volatile WorkProgressDao_Impl s;
    public volatile PreferenceDao_Impl t;
    public volatile RawWorkInfoDao_Impl u;

    @Override  // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase supportSQLiteDatabase0 = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            supportSQLiteDatabase0.execSQL("PRAGMA defer_foreign_keys = TRUE");
            supportSQLiteDatabase0.execSQL("DELETE FROM `Dependency`");
            supportSQLiteDatabase0.execSQL("DELETE FROM `WorkSpec`");
            supportSQLiteDatabase0.execSQL("DELETE FROM `WorkTag`");
            supportSQLiteDatabase0.execSQL("DELETE FROM `SystemIdInfo`");
            supportSQLiteDatabase0.execSQL("DELETE FROM `WorkName`");
            supportSQLiteDatabase0.execSQL("DELETE FROM `WorkProgress`");
            supportSQLiteDatabase0.execSQL("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        }
        finally {
            super.endTransaction();
            supportSQLiteDatabase0.query("PRAGMA wal_checkpoint(FULL)").close();
            if(!supportSQLiteDatabase0.inTransaction()) {
                supportSQLiteDatabase0.execSQL("VACUUM");
            }
        }
    }

    @Override  // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"});
    }

    @Override  // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration0) {
        RoomOpenHelper roomOpenHelper0 = new RoomOpenHelper(databaseConfiguration0, new f(this), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032");
        Configuration supportSQLiteOpenHelper$Configuration0 = Configuration.builder(databaseConfiguration0.context).name(databaseConfiguration0.name).callback(roomOpenHelper0).build();
        return databaseConfiguration0.sqliteOpenHelperFactory.create(supportSQLiteOpenHelper$Configuration0);
    }

    @Override  // androidx.work.impl.WorkDatabase
    public DependencyDao dependencyDao() {
        if(this.o != null) {
            return this.o;
        }
        synchronized(this) {
            if(this.o == null) {
                this.o = new DependencyDao_Impl(this);
            }
            return this.o;
        }
    }

    @Override  // androidx.room.RoomDatabase
    public List getAutoMigrations(@NonNull Map map0) {
        return Arrays.asList(new Migration[]{new d(13, 14, 0), new e(0), new d(16, 17, 1), new d(17, 18, 2), new d(18, 19, 3), new e(1)});
    }

    @Override  // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override  // androidx.room.RoomDatabase
    public Map getRequiredTypeConverters() {
        Map map0 = new HashMap();
        List list0 = WorkSpecDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(WorkSpecDao.class, list0);
        List list1 = DependencyDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(DependencyDao.class, list1);
        List list2 = WorkTagDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(WorkTagDao.class, list2);
        List list3 = SystemIdInfoDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(SystemIdInfoDao.class, list3);
        List list4 = WorkNameDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(WorkNameDao.class, list4);
        List list5 = WorkProgressDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(WorkProgressDao.class, list5);
        List list6 = PreferenceDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(PreferenceDao.class, list6);
        List list7 = RawWorkInfoDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(RawWorkInfoDao.class, list7);
        return map0;
    }

    @Override  // androidx.work.impl.WorkDatabase
    public PreferenceDao preferenceDao() {
        if(this.t != null) {
            return this.t;
        }
        synchronized(this) {
            if(this.t == null) {
                this.t = new PreferenceDao_Impl(this);
            }
            return this.t;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public RawWorkInfoDao rawWorkInfoDao() {
        if(this.u != null) {
            return this.u;
        }
        synchronized(this) {
            if(this.u == null) {
                this.u = new RawWorkInfoDao_Impl(this);
            }
            return this.u;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public SystemIdInfoDao systemIdInfoDao() {
        if(this.q != null) {
            return this.q;
        }
        synchronized(this) {
            if(this.q == null) {
                this.q = new SystemIdInfoDao_Impl(this);
            }
            return this.q;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public WorkNameDao workNameDao() {
        if(this.r != null) {
            return this.r;
        }
        synchronized(this) {
            if(this.r == null) {
                this.r = new WorkNameDao_Impl(this);
            }
            return this.r;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public WorkProgressDao workProgressDao() {
        if(this.s != null) {
            return this.s;
        }
        synchronized(this) {
            if(this.s == null) {
                this.s = new WorkProgressDao_Impl(this);
            }
            return this.s;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public WorkSpecDao workSpecDao() {
        if(this.n != null) {
            return this.n;
        }
        synchronized(this) {
            if(this.n == null) {
                this.n = new WorkSpecDao_Impl(this);
            }
            return this.n;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public WorkTagDao workTagDao() {
        if(this.p != null) {
            return this.p;
        }
        synchronized(this) {
            if(this.p == null) {
                this.p = new WorkTagDao_Impl(this);
            }
            return this.p;
        }
    }
}

