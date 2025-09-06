package kotlin.reflect.jvm.internal.impl.utils;

import a5.b;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

public class SmartList extends AbstractList implements RandomAccess {
    public int a;
    public Object b;

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 || v == 3 || v == 5 || v == 6 || v == 7 ? 2 : 3)];
        switch(v) {
            case 4: {
                arr_object[0] = "a";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            }
            default: {
                arr_object[0] = "elements";
            }
        }
        switch(v) {
            case 2: 
            case 3: {
                arr_object[1] = "iterator";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                arr_object[1] = "toArray";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            }
        }
        switch(v) {
            case 4: {
                arr_object[2] = "toArray";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 2 || v == 3 || v == 5 || v == 6 || v == 7 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 2 || v == 3 || v == 5 || v == 6 || v == 7 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override
    public void add(int v, Object object0) {
        if(v >= 0) {
            int v1 = this.a;
            if(v <= v1) {
                switch(v1) {
                    case 0: {
                        this.b = object0;
                        break;
                    }
                    case 1: {
                        if(v == 0) {
                            this.b = new Object[]{object0, this.b};
                        }
                        else {
                        label_10:
                            Object[] arr_object = new Object[v1 + 1];
                            if(v1 == 1) {
                                arr_object[0] = this.b;
                            }
                            else {
                                Object[] arr_object1 = (Object[])this.b;
                                System.arraycopy(arr_object1, 0, arr_object, 0, v);
                                System.arraycopy(arr_object1, v, arr_object, v + 1, this.a - v);
                            }
                            arr_object[v] = object0;
                            this.b = arr_object;
                        }
                        break;
                    }
                    default: {
                        goto label_10;
                    }
                }
                ++this.a;
                ++this.modCount;
                return;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index: ", ", Size: ");
        stringBuilder0.append(this.a);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override
    public boolean add(Object object0) {
        int v = this.a;
        if(v == 0) {
            this.b = object0;
        }
        else if(v == 1) {
            this.b = new Object[]{this.b, object0};
        }
        else {
            Object[] arr_object = (Object[])this.b;
            if(v >= arr_object.length) {
                Object[] arr_object1 = new Object[(arr_object.length * 3 / 2 + 1 >= v + 1 ? arr_object.length * 3 / 2 + 1 : v + 1)];
                this.b = arr_object1;
                System.arraycopy(arr_object, 0, arr_object1, 0, arr_object.length);
                arr_object = arr_object1;
            }
            arr_object[this.a] = object0;
        }
        ++this.a;
        ++this.modCount;
        return true;
    }

    @Override
    public void clear() {
        this.b = null;
        this.a = 0;
        ++this.modCount;
    }

    @Override
    public Object get(int v) {
        if(v >= 0) {
            int v1 = this.a;
            if(v < v1) {
                return v1 == 1 ? this.b : ((Object[])this.b)[v];
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index: ", ", Size: ");
        stringBuilder0.append(this.a);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override
    @NotNull
    public Iterator iterator() {
        int v = this.a;
        if(v == 0) {
            return h.a;
        }
        if(v == 1) {
            return new i(this);
        }
        Iterator iterator0 = super.iterator();
        if(iterator0 != null) {
            return iterator0;
        }
        SmartList.a(3);
        throw null;
    }

    @Override
    public Object remove(int v) {
        Object object0;
        if(v >= 0) {
            int v1 = this.a;
            if(v < v1) {
                if(v1 == 1) {
                    object0 = this.b;
                    this.b = null;
                }
                else {
                    Object[] arr_object = (Object[])this.b;
                    Object object1 = arr_object[v];
                    if(v1 == 2) {
                        this.b = arr_object[1 - v];
                    }
                    else {
                        int v2 = v1 - v - 1;
                        if(v2 > 0) {
                            System.arraycopy(arr_object, v + 1, arr_object, v, v2);
                        }
                        arr_object[this.a - 1] = null;
                    }
                    object0 = object1;
                }
                --this.a;
                ++this.modCount;
                return object0;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index: ", ", Size: ");
        stringBuilder0.append(this.a);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override
    public Object set(int v, Object object0) {
        if(v >= 0) {
            int v1 = this.a;
            if(v < v1) {
                if(v1 == 1) {
                    Object object1 = this.b;
                    this.b = object0;
                    return object1;
                }
                Object[] arr_object = (Object[])this.b;
                Object object2 = arr_object[v];
                arr_object[v] = object0;
                return object2;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index: ", ", Size: ");
        stringBuilder0.append(this.a);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override
    public int size() {
        return this.a;
    }

    @Override
    public void sort(Comparator comparator0) {
        int v = this.a;
        if(v >= 2) {
            Arrays.sort(((Object[])this.b), 0, v, comparator0);
        }
    }

    @Override
    @NotNull
    public Object[] toArray(@NotNull Object[] arr_object) {
        if(arr_object != null) {
            int v = this.a;
            if(v == 1) {
                if(arr_object.length != 0) {
                    arr_object[0] = this.b;
                    goto label_17;
                }
                Object[] arr_object1 = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), 1);
                arr_object1[0] = this.b;
                return arr_object1;
            }
            else {
                if(arr_object.length < v) {
                    Object[] arr_object2 = Arrays.copyOf(((Object[])this.b), v, arr_object.getClass());
                    if(arr_object2 != null) {
                        return arr_object2;
                    }
                    SmartList.a(6);
                    throw null;
                }
                if(v != 0) {
                    System.arraycopy(this.b, 0, arr_object, 0, v);
                }
            }
        label_17:
            int v1 = this.a;
            if(arr_object.length > v1) {
                arr_object[v1] = null;
            }
            return arr_object;
        }
        SmartList.a(4);
        throw null;
    }
}

