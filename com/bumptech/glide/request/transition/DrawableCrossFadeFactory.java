package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

public class DrawableCrossFadeFactory implements TransitionFactory {
    public static class Builder {
        public final int a;
        public boolean b;

        public Builder() {
            this(300);
        }

        public Builder(int v) {
            this.a = v;
        }

        public DrawableCrossFadeFactory build() {
            return new DrawableCrossFadeFactory(this.a, this.b);
        }

        public Builder setCrossFadeEnabled(boolean z) {
            this.b = z;
            return this;
        }
    }

    public final int a;
    public final boolean b;
    public DrawableCrossFadeTransition c;

    public DrawableCrossFadeFactory(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override  // com.bumptech.glide.request.transition.TransitionFactory
    public Transition build(DataSource dataSource0, boolean z) {
        if(dataSource0 == DataSource.MEMORY_CACHE) {
            return NoTransition.get();
        }
        if(this.c == null) {
            this.c = new DrawableCrossFadeTransition(this.a, this.b);
        }
        return this.c;
    }
}

