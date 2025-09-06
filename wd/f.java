package wd;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractIterator;
import kotlin.io.FileTreeWalk.FileTreeWalkIterator.WhenMappings;
import kotlin.io.FileTreeWalk;
import kotlin.jvm.internal.Intrinsics;

public final class f extends AbstractIterator {
    public final ArrayDeque c;
    public final FileTreeWalk d;

    public f(FileTreeWalk fileTreeWalk0) {
        this.d = fileTreeWalk0;
        super();
        ArrayDeque arrayDeque0 = new ArrayDeque();
        this.c = arrayDeque0;
        if(fileTreeWalk0.a.isDirectory()) {
            arrayDeque0.push(this.a(fileTreeWalk0.a));
            return;
        }
        if(fileTreeWalk0.a.isFile()) {
            File file0 = fileTreeWalk0.a;
            Intrinsics.checkNotNullParameter(file0, "rootFile");
            arrayDeque0.push(new d(file0));  // 初始化器: Lwd/g;-><init>(Ljava/io/File;)V
            return;
        }
        this.done();
    }

    public final b a(File file0) {
        switch(FileTreeWalk.FileTreeWalkIterator.WhenMappings.$EnumSwitchMapping$0[this.d.b.ordinal()]) {
            case 1: {
                return new e(this, file0);
            }
            case 2: {
                return new c(this, file0);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // kotlin.collections.AbstractIterator
    public final void computeNext() {
        File file0;
        while(true) {
            ArrayDeque arrayDeque0 = this.c;
            g g0 = (g)arrayDeque0.peek();
            if(g0 == null) {
                file0 = null;
                break;
            }
            File file1 = g0.a();
            if(file1 == null) {
                arrayDeque0.pop();
            }
            else {
                if(Intrinsics.areEqual(file1, g0.a) || !file1.isDirectory() || arrayDeque0.size() >= this.d.f) {
                    file0 = file1;
                    break;
                }
                arrayDeque0.push(this.a(file1));
            }
        }
        if(file0 != null) {
            this.setNext(file0);
            return;
        }
        this.done();
    }
}

