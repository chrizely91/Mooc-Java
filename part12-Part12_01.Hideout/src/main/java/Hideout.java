public class Hideout<T> {
    private T hide;


    public void putIntoHideout(T toHide) {
        this.hide = toHide;
    }

    public T takeFromHideout() {
        if (hide != null) {
            T hided = this.hide;
            hide = null;
            return hided;
        }
        return null;    
    }

    public boolean isInHideout() {
        return hide != null;
    }
}
