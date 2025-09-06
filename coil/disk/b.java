package coil.disk;

import okio.Path;

public final class b implements Snapshot {
    public final coil.disk.DiskLruCache.Snapshot a;

    public b(coil.disk.DiskLruCache.Snapshot diskLruCache$Snapshot0) {
        this.a = diskLruCache$Snapshot0;
    }

    @Override  // coil.disk.DiskCache$Snapshot
    public final void close() {
        this.a.close();
    }

    @Override  // coil.disk.DiskCache$Snapshot
    public final Editor closeAndEdit() {
        coil.disk.DiskLruCache.Editor diskLruCache$Editor0 = this.a.closeAndEdit();
        return diskLruCache$Editor0 != null ? new a(diskLruCache$Editor0) : null;
    }

    @Override  // coil.disk.DiskCache$Snapshot
    public final Editor closeAndOpenEditor() {
        coil.disk.DiskLruCache.Editor diskLruCache$Editor0 = this.a.closeAndEdit();
        return diskLruCache$Editor0 != null ? new a(diskLruCache$Editor0) : null;
    }

    @Override  // coil.disk.DiskCache$Snapshot
    public final Path getData() {
        return this.a.file(1);
    }

    @Override  // coil.disk.DiskCache$Snapshot
    public final Path getMetadata() {
        return this.a.file(0);
    }
}

