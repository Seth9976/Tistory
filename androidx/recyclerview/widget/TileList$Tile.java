package androidx.recyclerview.widget;

import java.lang.reflect.Array;

public class TileList.Tile {
    public TileList.Tile a;
    public int mItemCount;
    public final Object[] mItems;
    public int mStartPosition;

    public TileList.Tile(int v, Class class0) {
        this.mItems = (Object[])Array.newInstance(class0, v);
    }
}

