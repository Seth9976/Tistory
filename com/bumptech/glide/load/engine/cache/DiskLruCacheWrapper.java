package com.bumptech.glide.load.engine.cache;

import a7.b;
import android.util.Log;
import androidx.appcompat.view.menu.f;
import com.bumptech.glide.disklrucache.DiskLruCache.Editor;
import com.bumptech.glide.disklrucache.DiskLruCache.Value;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import jeb.synthetic.FIN;

public class DiskLruCacheWrapper implements DiskCache {
    public final SafeKeyGenerator a;
    public final File b;
    public final long c;
    public final b d;
    public DiskLruCache e;
    public static DiskLruCacheWrapper f;

    @Deprecated
    public DiskLruCacheWrapper(File file0, long v) {
        this.d = new b(7);
        this.b = file0;
        this.c = v;
        this.a = new SafeKeyGenerator();
    }

    public final DiskLruCache a() {
        synchronized(this) {
            if(this.e == null) {
                this.e = DiskLruCache.open(this.b, 1, 1, this.c);
            }
            return this.e;
        }
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskCache
    public void clear() {
        int v;
        __monitor_enter(this);
        try {
            try {
                v = FIN.finallyOpen$NT();
                this.a().delete();
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", iOException0);
                }
            }
        }
        catch(Throwable throwable0) {
            synchronized(this) {
                this.e = null;
            }
            FIN.finallyExec$NT(v);
            throw throwable0;
        }
        synchronized(this) {
            this.e = null;
            FIN.finallyCodeBegin$NT(v);
            FIN.finallyCodeEnd$NT(v);
        }
    }

    public static DiskCache create(File file0, long v) {
        return new DiskLruCacheWrapper(file0, v);
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskCache
    public void delete(Key key0) {
        String s = this.a.getSafeKey(key0);
        try {
            this.a().remove(s);
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", iOException0);
            }
        }
    }

    @Deprecated
    public static DiskCache get(File file0, long v) {
        synchronized(DiskLruCacheWrapper.class) {
            if(DiskLruCacheWrapper.f == null) {
                DiskLruCacheWrapper.f = new DiskLruCacheWrapper(file0, v);
            }
            return DiskLruCacheWrapper.f;
        }
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskCache
    public File get(Key key0) {
        String s = this.a.getSafeKey(key0);
        if(Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + s + " for for Key: " + key0);
        }
        try {
            Value diskLruCache$Value0 = this.a().get(s);
            if(diskLruCache$Value0 != null) {
                return diskLruCache$Value0.getFile(0);
            }
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", iOException0);
            }
        }
        return null;
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(Key key0, Writer diskCache$Writer0) {
        a a0;
        Editor diskLruCache$Editor0;
        String s = this.a.getSafeKey(key0);
        b b0 = this.d;
        synchronized(b0) {
            a0 = (a)((HashMap)b0.b).get(s);
            if(a0 == null) {
                f f0 = (f)b0.c;
                synchronized(((ArrayDeque)f0.b)) {
                    a0 = (a)((ArrayDeque)f0.b).poll();
                }
                if(a0 == null) {
                    a0 = new a();
                }
                ((HashMap)b0.b).put(s, a0);
            }
            ++a0.b;
        }
        a0.a.lock();
        try {
            if(Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + s + " for for Key: " + key0);
            }
            try {
                DiskLruCache diskLruCache0 = this.a();
                if(diskLruCache0.get(s) == null) {
                    diskLruCache$Editor0 = diskLruCache0.edit(s);
                    if(diskLruCache$Editor0 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + s);
                    }
                    goto label_31;
                }
                return;
            }
            catch(IOException iOException0) {
                goto label_41;
            }
            try {
            label_31:
                if(diskCache$Writer0.write(diskLruCache$Editor0.getFile(0))) {
                    diskLruCache$Editor0.commit();
                }
                goto label_38;
            }
            catch(Throwable throwable0) {
                try {
                    diskLruCache$Editor0.abortUnlessCommitted();
                    throw throwable0;
                label_38:
                    diskLruCache$Editor0.abortUnlessCommitted();
                    return;
                }
                catch(IOException iOException0) {
                }
            }
        label_41:
            if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", iOException0);
            }
        }
        finally {
            this.d.j(s);
        }
    }
}

