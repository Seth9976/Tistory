package coil.disk;

import okio.Path;

public final class a implements Editor {
    public final coil.disk.DiskLruCache.Editor a;

    public a(coil.disk.DiskLruCache.Editor diskLruCache$Editor0) {
        this.a = diskLruCache$Editor0;
    }

    @Override  // coil.disk.DiskCache$Editor
    public final void abort() {
        this.a.abort();
    }

    @Override  // coil.disk.DiskCache$Editor
    public final void commit() {
        this.a.commit();
    }

    @Override  // coil.disk.DiskCache$Editor
    public final Snapshot commitAndGet() {
        coil.disk.DiskLruCache.Snapshot diskLruCache$Snapshot0 = this.a.commitAndGet();
        return diskLruCache$Snapshot0 != null ? new b(diskLruCache$Snapshot0) : null;
    }

    @Override  // coil.disk.DiskCache$Editor
    public final Snapshot commitAndOpenSnapshot() {
        coil.disk.DiskLruCache.Snapshot diskLruCache$Snapshot0 = this.a.commitAndGet();
        return diskLruCache$Snapshot0 != null ? new b(diskLruCache$Snapshot0) : null;
    }

    @Override  // coil.disk.DiskCache$Editor
    public final Path getData() {
        return this.a.file(1);
    }

    @Override  // coil.disk.DiskCache$Editor
    public final Path getMetadata() {
        return this.a.file(0);
    }
}

