package okhttp3.internal.cache;

import kotlin.Metadata;
import okio.ForwardingSource;
import okio.Source;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/cache/DiskLruCache$Entry$newSource$1", "Lokio/ForwardingSource;", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DiskLruCache.Entry.newSource.1 extends ForwardingSource {
    public boolean b;
    public final DiskLruCache c;
    public final Entry d;

    public DiskLruCache.Entry.newSource.1(Source source0, DiskLruCache diskLruCache0, Entry diskLruCache$Entry0) {
        this.c = diskLruCache0;
        this.d = diskLruCache$Entry0;
        super(source0);
    }

    @Override  // okio.ForwardingSource
    public void close() {
        super.close();
        if(!this.b) {
            this.b = true;
            DiskLruCache diskLruCache0 = this.c;
            Entry diskLruCache$Entry0 = this.d;
            synchronized(diskLruCache0) {
                diskLruCache$Entry0.setLockingSourceCount$okhttp(diskLruCache$Entry0.getLockingSourceCount$okhttp() - 1);
                if(diskLruCache$Entry0.getLockingSourceCount$okhttp() == 0 && diskLruCache$Entry0.getZombie$okhttp()) {
                    diskLruCache0.removeEntry$okhttp(diskLruCache$Entry0);
                }
            }
        }
    }
}

