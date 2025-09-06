package com.bumptech.glide.load.resource.drawable;

public final class d extends DrawableResource {
    @Override  // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        return this.drawable.getClass();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        int v = this.drawable.getIntrinsicWidth();
        return Math.max(1, this.drawable.getIntrinsicHeight() * v * 4);
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
    }
}

