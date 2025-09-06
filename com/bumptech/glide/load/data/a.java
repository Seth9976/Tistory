package com.bumptech.glide.load.data;

public final class a implements Factory {
    @Override  // com.bumptech.glide.load.data.DataRewinder$Factory
    public final DataRewinder build(Object object0) {
        return new ae.a(object0, 2);
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder$Factory
    public final Class getDataClass() {
        throw new UnsupportedOperationException("Not implemented");
    }
}

