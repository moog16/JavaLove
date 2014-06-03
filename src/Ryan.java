public class Ryan {
    private String _shirt;
    private String _pants;
    private Object _shoes;

    public Ryan(String shirt, String pants) {
        _shirt = shirt;
        _pants = pants;
    }

    public String getShirt() {
        return _shirt;
    }

    public void setShirt(String shirt) {
        _shirt = shirt;
    }

    public String getPants() {
        return _pants;
    }

    public void setPants(String pants) {
        _pants = pants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ryan)) {
            return false;
        }

        Ryan ryan = (Ryan) o;

        if (!_pants.equals(ryan._pants)) {
            return false;
        }
        if (!_shirt.equals(ryan._shirt)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = _shirt.hashCode();
        result = 31 * result + _pants.hashCode();
        return result;
    }

    public Object getShoes() {
        return _shoes;
    }
}
