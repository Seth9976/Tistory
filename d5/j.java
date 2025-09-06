package d5;

import androidx.core.graphics.PathParser.PathDataNode;
import androidx.core.graphics.PathParser;

public abstract class j extends i {
    public PathDataNode[] a;
    public String b;
    public int c;

    public j() {
        this.a = null;
        this.c = 0;
    }

    public j(j j0) {
        this.c = 0;
        this.b = j0.b;
        this.a = PathParser.deepCopyNodes(j0.a);
    }

    public PathDataNode[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(PathDataNode[] arr_pathParser$PathDataNode) {
        if(!PathParser.canMorph(this.a, arr_pathParser$PathDataNode)) {
            this.a = PathParser.deepCopyNodes(arr_pathParser$PathDataNode);
            return;
        }
        PathParser.updateNodes(this.a, arr_pathParser$PathDataNode);
    }
}

