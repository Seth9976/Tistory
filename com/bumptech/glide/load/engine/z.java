package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

public final class z implements Resource {
    public final boolean a;
    public final boolean b;
    public final Resource c;
    public final EngineResource.ResourceListener d;
    public final Key e;
    public int f;
    public boolean g;

    public z(Resource resource0, boolean z, boolean z1, Key key0, Engine engine0) {
        this.c = (Resource)Preconditions.checkNotNull(resource0);
        this.a = z;
        this.b = z1;
        this.e = key0;
        this.d = (EngineResource.ResourceListener)Preconditions.checkNotNull(engine0);
    }

    public final void a() {
        synchronized(this) {
            if(!this.g) {
                ++this.f;
                return;
            }
        }
        throw new IllegalStateException("Cannot acquire a recycled resource");
    }

    public final void b() {
        synchronized(this) {
            int v1 = this.f;
            if(v1 > 0) {
                boolean z = true;
                this.f = v1 - 1;
                if(v1 - 1 != 0) {
                    z = false;
                }
                if(z) {
                    this.d.onResourceReleased(this.e, this);
                }
                return;
            }
        }
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.c.get();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        return this.c.getResourceClass();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.c.getSize();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        synchronized(this) {
            if(this.f <= 0) {
                if(this.g) {
                    throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
                }
                this.g = true;
                if(this.b) {
                    this.c.recycle();
                }
                return;
            }
        }
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
    }

    @Override
    public final String toString() {
        synchronized(this) {
        }
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}

