package org.zuoyu.faucet;

/**
 * 仓库.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-26 18:48
 **/
public abstract class AbstractRepository<T> implements Container<T> {

  private Object[] objects;

  private int index = 0;

  protected AbstractRepository() {
    objects = new Object[16];
  }

  public AbstractRepository(int i) {
    objects = new Object[i];
  }

  @Override
  public Iterator<T> getIterator() {
    return new AbstractIterator() {};
  }

  @Override
  public void add(T t) {
    int i = objects.length;
    if (objects[--i] != null) {
      Object[] cloneObjects = new Object[i + 16];
      System.arraycopy(objects, 0, cloneObjects, 0, ++i);
      objects = cloneObjects;
    }
    objects[index++] = t;
  }

  private abstract class AbstractIterator implements Iterator<T> {

    private int nextIndex;

    @Override
    public boolean hasNext() {
      return nextIndex < index;
    }

    @Override
    public T next() {
      return hasNext() ? (T) objects[nextIndex++] : null;
    }
  }
}
